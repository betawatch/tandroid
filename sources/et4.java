// default package

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class et4 extends Thread {
    public final SurfaceTexture a;
    public volatile boolean b;
    public boolean c;
    public final /* synthetic */ ft4 d;

    public et4(ft4 ft4Var, SurfaceTexture surfaceTexture) {
        this.d = ft4Var;
        this.a = surfaceTexture;
    }

    public final void a() {
        ft4 ft4Var;
        vs4 vs4Var;
        ft4 ft4Var2 = this.d;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        ft4Var2.r = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        ft4Var2.f = eglGetDisplay;
        EGLDisplay eGLDisplay = EGL10.EGL_NO_DISPLAY;
        EGL10 egl102 = ft4Var2.r;
        if (eglGetDisplay == eGLDisplay) {
            wa3.c(GLUtils.getEGLErrorString(egl102.eglGetError()), "eglGetDisplay failed ");
            return;
        }
        if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            wa3.c(GLUtils.getEGLErrorString(ft4Var2.r.eglGetError()), "eglInitialize failed ");
            return;
        }
        byte b = 1;
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = s34.m(ft4Var2.getContext()).h() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12337, ft4Var2.getMsaaSamples(), 12344};
        ft4Var2.s = null;
        if (!s34.m(ft4Var2.getContext()).h() && ft4Var2.r.eglChooseConfig(ft4Var2.f, iArr2, eGLConfigArr, 1, iArr) && iArr[0] != 0) {
            ft4Var2.s = eGLConfigArr[0];
        } else if (!ft4Var2.r.eglChooseConfig(ft4Var2.f, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
            a32.e(GLUtils.getEGLErrorString(ft4Var2.r.eglGetError()), "eglChooseConfig failed ");
            return;
        } else if (iArr[0] > 0) {
            ft4Var2.s = eGLConfigArr[0];
        }
        EGLConfig eGLConfig = ft4Var2.s;
        if (eGLConfig == null) {
            zo4.k("eglConfig not initialized");
            return;
        }
        int i = ft4Var2.T == 4 ? 3 : 2;
        EGL10 egl103 = ft4Var2.r;
        EGLDisplay eGLDisplay2 = ft4Var2.f;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLContext eglCreateContext = egl103.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext, new int[]{12440, i, 12344});
        ft4Var2.n = eglCreateContext;
        if (eglCreateContext == null || eglCreateContext == eGLContext) {
            i2d.e(ft4Var2.r.eglGetError(), "eglCreateContext failed: ");
            return;
        }
        ft4Var2.c();
        ft4Var2.h = ft4Var2.r.eglCreateWindowSurface(ft4Var2.f, ft4Var2.s, ft4Var2.c, null);
        ft4Var2.c();
        EGLSurface eGLSurface = ft4Var2.h;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int eglGetError = ft4Var2.r.eglGetError();
            if (eglGetError != 12299) {
                wa3.c(GLUtils.getEGLErrorString(eglGetError), "eglCreateWindowSurface failed ");
                return;
            }
            fc4.d("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
        } else if (!ft4Var2.r.eglMakeCurrent(ft4Var2.f, eGLSurface, eGLSurface, ft4Var2.n)) {
            wa3.c(GLUtils.getEGLErrorString(ft4Var2.r.eglGetError()), "eglMakeCurrent failed ");
            return;
        } else {
            ft4Var2.c();
            ft4Var2.w = (GL10) ft4Var2.n.getGL();
            ft4Var2.c();
        }
        this.d.d();
        long nanoTime = System.nanoTime();
        while (!this.b) {
            synchronized (this.d) {
                if (this.d.I && (vs4Var = (ft4Var = this.d).b) != null) {
                    ft4Var.f(vs4Var);
                    this.d.I = false;
                }
            }
            ft4 ft4Var3 = this.d;
            if (ft4Var3.b != null && !ft4Var3.H) {
                long nanoTime2 = System.nanoTime();
                this.d.e((nanoTime2 - nanoTime) / 1.0E9f);
                if (!this.c) {
                    this.c = true;
                    gm.c3(new dt4(this, b));
                }
                nanoTime = nanoTime2;
            }
            try {
                ft4 ft4Var4 = this.d;
                if (ft4Var4.b == null || ft4Var4.H) {
                    Thread.sleep(100L);
                } else {
                    long nanoTime3 = this.d.x - (System.nanoTime() - nanoTime);
                    if (nanoTime3 > 0) {
                        Thread.sleep(nanoTime3 / 1000000, (int) (nanoTime3 % 1000000));
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [ft4] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.d.d) {
            if (this.b) {
                return;
            }
            ft4 ft4Var = this.d;
            ft4Var.c = this.a;
            ft4Var.I = true;
            try {
                try {
                    a();
                } catch (Exception e) {
                    if (!this.b) {
                        fc4.g(e, true);
                        gm.c3(new dt4(this, (byte) 0));
                    }
                }
            } finally {
                this.d.i();
            }
        }
    }
}
