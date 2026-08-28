package e5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final k b;
    public boolean c;

    public l(k kVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.b = kVar;
        this.a = z10;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i9 = f0.a;
        if (i9 >= 24 && ((i9 >= 26 || !("samsung".equals(f0.c) || "XT1650".equals(f0.d))) && ((i9 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i9 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (l.class) {
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

    public static l c(Context context, boolean z10) {
        boolean z11 = false;
        d5.a.i(!z10 || b(context));
        k kVar = new k("ExoPlayer:PlaceholderSurface");
        int i9 = z10 ? d : 0;
        kVar.start();
        Handler handler = new Handler(kVar.getLooper(), kVar);
        kVar.b = handler;
        kVar.a = new d5.e(handler);
        synchronized (kVar) {
            kVar.b.obtainMessage(1, i9, 0).sendToTarget();
            while (kVar.e == null && kVar.d == null && kVar.c == null) {
                try {
                    kVar.wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = kVar.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = kVar.c;
        if (error != null) {
            throw error;
        }
        l lVar = kVar.e;
        lVar.getClass();
        return lVar;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    k kVar = this.b;
                    kVar.b.getClass();
                    kVar.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
