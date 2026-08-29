package g5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import f5.d0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        int i10 = d0.a;
        if (i10 >= 24 && ((i10 >= 26 || !("samsung".equals(d0.c) || "XT1650".equals(d0.d))) && ((i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i10 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public static l c(Context context, boolean z10) {
        boolean z11 = false;
        f5.a.i(!z10 || b(context));
        k kVar = new k("ExoPlayer:PlaceholderSurface");
        int i10 = z10 ? d : 0;
        kVar.start();
        Handler handler = new Handler(kVar.getLooper(), kVar);
        kVar.b = handler;
        kVar.a = new f5.e(handler);
        synchronized (kVar) {
            kVar.b.obtainMessage(1, i10, 0).sendToTarget();
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
