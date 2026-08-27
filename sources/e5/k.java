package e5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import d5.g0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final j b;
    public boolean c;

    public k(j jVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.b = jVar;
        this.a = z10;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i10 = g0.a;
        if (i10 >= 24 && ((i10 >= 26 || !("samsung".equals(g0.c) || "XT1650".equals(g0.d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i10 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (k.class) {
            try {
                if (!e) {
                    d = a(context);
                    e = true;
                }
                z10 = d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public static k c(Context context, boolean z10) {
        boolean z11 = false;
        d5.a.i(!z10 || b(context));
        j jVar = new j("ExoPlayer:PlaceholderSurface");
        int i10 = z10 ? d : 0;
        jVar.start();
        Handler handler = new Handler(jVar.getLooper(), jVar);
        jVar.b = handler;
        jVar.a = new d5.e(handler);
        synchronized (jVar) {
            jVar.b.obtainMessage(1, i10, 0).sendToTarget();
            while (jVar.e == null && jVar.d == null && jVar.c == null) {
                try {
                    jVar.wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = jVar.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = jVar.c;
        if (error != null) {
            throw error;
        }
        k kVar = jVar.e;
        kVar.getClass();
        return kVar;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    j jVar = this.b;
                    jVar.b.getClass();
                    jVar.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
