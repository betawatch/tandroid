package androidx.mediarouter.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class r extends AsyncTask {
    public final Bitmap a;
    public final Uri b;
    public int c;
    public long d;
    public final /* synthetic */ v e;

    public r(v vVar) {
        this.e = vVar;
        MediaDescriptionCompat mediaDescriptionCompat = vVar.i0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = vVar.i0;
        this.b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f : null;
    }

    public final BufferedInputStream a(Uri uri) {
        InputStream openInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            openInputStream = this.e.s.getContentResolver().openInputStream(uri);
        } else {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            int i10 = v.C0;
            openConnection.setConnectTimeout(i10);
            openConnection.setReadTimeout(i10);
            openInputStream = openConnection.getInputStream();
        }
        if (openInputStream == null) {
            return null;
        }
        return new BufferedInputStream(openInputStream);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r5 != null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x002f: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:48), block:B:60:0x002f */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
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
                                        options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.e.k(options.outWidth, options.outHeight)));
                                        if (isCancelled()) {
                                            bufferedInputStream.close();
                                            return null;
                                        }
                                        bitmap = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                                        try {
                                            bufferedInputStream.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                }
                                bufferedInputStream.close();
                                return null;
                            } catch (IOException unused3) {
                                return null;
                            }
                        } catch (IOException e6) {
                            e = e6;
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
                                androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(bitmap);
                                pVar.a = 1;
                                List list = (List) pVar.b().a;
                                this.c = DesugarCollections.unmodifiableList(list).isEmpty() ? 0 : ((d2.d) DesugarCollections.unmodifiableList(list).get(0)).d;
                            }
                            return bitmap;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        bufferedInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
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
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
            }
        }
        if (bitmap == null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: " + bitmap);
            return null;
        }
        if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
            androidx.emoji2.text.p pVar2 = new androidx.emoji2.text.p(bitmap);
            pVar2.a = 1;
            List list2 = (List) pVar2.b().a;
            this.c = DesugarCollections.unmodifiableList(list2).isEmpty() ? 0 : ((d2.d) DesugarCollections.unmodifiableList(list2).get(0)).d;
        }
        return bitmap;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        v vVar = this.e;
        vVar.j0 = null;
        Bitmap bitmap2 = vVar.k0;
        Bitmap bitmap3 = this.a;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.b;
        if (equals && Objects.equals(vVar.l0, uri)) {
            return;
        }
        vVar.k0 = bitmap3;
        vVar.n0 = bitmap;
        vVar.l0 = uri;
        vVar.o0 = this.c;
        vVar.m0 = true;
        vVar.q(SystemClock.uptimeMillis() - this.d > 120);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.d = SystemClock.uptimeMillis();
        v vVar = this.e;
        vVar.m0 = false;
        vVar.n0 = null;
        vVar.o0 = 0;
    }
}
