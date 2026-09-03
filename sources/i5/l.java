package i5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import h5.d0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final k b;
    public boolean c;

    public l(k kVar, SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.b = kVar;
        this.a = z4;
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

    public static synchronized boolean e(Context context) {
        boolean z4;
        synchronized (l.class) {
            try {
                if (!e) {
                    d = a(context);
                    e = true;
                }
                z4 = d != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z4;
    }

    public static l f(Context context, boolean z4) {
        boolean z10 = false;
        h5.a.i(!z4 || e(context));
        k kVar = new k("ExoPlayer:PlaceholderSurface");
        int i10 = z4 ? d : 0;
        kVar.start();
        Handler handler = new Handler(kVar.getLooper(), kVar);
        kVar.b = handler;
        kVar.a = new h5.f(handler);
        synchronized (kVar) {
            kVar.b.obtainMessage(1, i10, 0).sendToTarget();
            while (kVar.e == null && kVar.d == null && kVar.c == null) {
                try {
                    kVar.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
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
