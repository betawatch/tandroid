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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class it6 extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public final /* synthetic */ rt6 d;

    public it6(rt6 rt6Var) {
        this.d = rt6Var;
        MediaDescriptionCompat mediaDescriptionCompat = rt6Var.c0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = rt6Var.c0;
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
                                nu7 nu7Var = new nu7(bitmap);
                                nu7Var.a = (byte) 1;
                                ArrayList arrayList = (ArrayList) nu7Var.a().a;
                                this.c = DesugarCollections.unmodifiableList(arrayList).isEmpty() ? 0 : ((ou7) DesugarCollections.unmodifiableList(arrayList).get(0)).d;
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
            nu7 nu7Var2 = new nu7(bitmap);
            nu7Var2.a = (byte) 1;
            ArrayList arrayList2 = (ArrayList) nu7Var2.a().a;
            this.c = DesugarCollections.unmodifiableList(arrayList2).isEmpty() ? 0 : ((ou7) DesugarCollections.unmodifiableList(arrayList2).get(0)).d;
        }
        return bitmap;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        rt6 rt6Var = this.d;
        rt6Var.d0 = null;
        Bitmap bitmap2 = rt6Var.e0;
        Bitmap bitmap3 = this.a;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (equals && Objects.equals(rt6Var.f0, uri)) {
            return;
        }
        rt6Var.e0 = bitmap3;
        rt6Var.h0 = bitmap;
        rt6Var.f0 = uri;
        rt6Var.i0 = this.c;
        rt6Var.g0 = true;
        rt6Var.k();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        rt6 rt6Var = this.d;
        rt6Var.g0 = false;
        rt6Var.h0 = null;
        rt6Var.i0 = 0;
    }
}
