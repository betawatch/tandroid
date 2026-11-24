// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class iv6 extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public final /* synthetic */ rv6 d;

    public iv6(rv6 rv6Var) {
        this.d = rv6Var;
        MediaDescriptionCompat mediaDescriptionCompat = rv6Var.c0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = rv6Var.c0;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f : null;
    }

    public final BufferedInputStream a(Uri uri) {
        InputStream openInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            openInputStream = this.d.E.getContentResolver().openInputStream(uri);
        } else {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            openConnection.setConnectTimeout(30000);
            openConnection.setReadTimeout(30000);
            openInputStream = openConnection.getInputStream();
        }
        if (openInputStream == null) {
            return null;
        }
        return new BufferedInputStream(openInputStream);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00ab: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:172), block:B:61:0x00ab */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        InputStream inputStream2 = null;
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            Uri uri = this.b;
            try {
                if (uri != null) {
                    try {
                        bufferedInputStream = a(uri);
                        try {
                            try {
                                if (bufferedInputStream == null) {
                                    Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                    if (bufferedInputStream == null) {
                                        return null;
                                    }
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeStream(bufferedInputStream, null, options);
                                    if (options.outWidth != 0 && options.outHeight != 0) {
                                        try {
                                            bufferedInputStream.reset();
                                        } catch (IOException unused) {
                                            bufferedInputStream.close();
                                            bufferedInputStream = a(uri);
                                            if (bufferedInputStream == null) {
                                                Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                                if (bufferedInputStream == null) {
                                                    return null;
                                                }
                                            }
                                        }
                                        options.inJustDecodeBounds = false;
                                        options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.d.E.getResources().getDimensionPixelSize(R.dimen.mr_cast_meta_art_size)));
                                        if (!isCancelled()) {
                                            bitmap = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                                            try {
                                                bufferedInputStream.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        bufferedInputStream.close();
                                        return null;
                                    }
                                }
                                bufferedInputStream.close();
                                return null;
                            } catch (IOException unused3) {
                                return null;
                            }
                        } catch (IOException e) {
                            e = e;
                            Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri, e);
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused4) {
                                }
                            }
                            bitmap = null;
                            if (bitmap == null) {
                            }
                            if (bitmap != null) {
                                ow7 ow7Var = new ow7(bitmap);
                                ow7Var.a = (byte) 1;
                                ArrayList arrayList = (ArrayList) ow7Var.a().b;
                                this.c = DesugarCollections.unmodifiableList(arrayList).isEmpty() ? 0 : ((pw7) DesugarCollections.unmodifiableList(arrayList).get(0)).d;
                            }
                            return bitmap;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bufferedInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused5) {
                            }
                        }
                        throw th;
                    }
                }
                bitmap = null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
            }
        }
        if (bitmap == null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: " + bitmap);
            return null;
        }
        if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
            ow7 ow7Var2 = new ow7(bitmap);
            ow7Var2.a = (byte) 1;
            ArrayList arrayList2 = (ArrayList) ow7Var2.a().b;
            this.c = DesugarCollections.unmodifiableList(arrayList2).isEmpty() ? 0 : ((pw7) DesugarCollections.unmodifiableList(arrayList2).get(0)).d;
        }
        return bitmap;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        rv6 rv6Var = this.d;
        rv6Var.d0 = null;
        Bitmap bitmap2 = rv6Var.e0;
        Bitmap bitmap3 = this.a;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (equals && Objects.equals(rv6Var.f0, uri)) {
            return;
        }
        rv6Var.e0 = bitmap3;
        rv6Var.h0 = bitmap;
        rv6Var.f0 = uri;
        rv6Var.i0 = this.c;
        rv6Var.g0 = true;
        rv6Var.k();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        rv6 rv6Var = this.d;
        rv6Var.g0 = false;
        rv6Var.h0 = null;
        rv6Var.i0 = 0;
    }
}
