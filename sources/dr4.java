// default package

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dr4 extends Thread {
    public final SurfaceTexture a;
    public volatile boolean b;
    public boolean c;
    public final /* synthetic */ er4 d;

    public dr4(er4 er4Var, SurfaceTexture surfaceTexture) {
        this.d = er4Var;
        this.a = surfaceTexture;
    }

    public final void a() {
        er4 er4Var;
        uq4 uq4Var;
        er4 er4Var2 = this.d;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        er4Var2.r = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        er4Var2.f = eglGetDisplay;
        EGLDisplay eGLDisplay = EGL10.EGL_NO_DISPLAY;
        EGL10 egl102 = er4Var2.r;
        if (eglGetDisplay == eGLDisplay) {
            k93.c(GLUtils.getEGLErrorString(egl102.eglGetError()), "eglGetDisplay failed ");
            return;
        }
        if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            k93.c(GLUtils.getEGLErrorString(er4Var2.r.eglGetError()), "eglInitialize failed ");
            return;
        }
        byte b = 1;
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = h24.m(er4Var2.getContext()).h() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12337, er4Var2.getMsaaSamples(), 12344};
        er4Var2.s = null;
        if (!h24.m(er4Var2.getContext()).h() && er4Var2.r.eglChooseConfig(er4Var2.f, iArr2, eGLConfigArr, 1, iArr) && iArr[0] != 0) {
            er4Var2.s = eGLConfigArr[0];
        } else if (!er4Var2.r.eglChooseConfig(er4Var2.f, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
            k32.e(GLUtils.getEGLErrorString(er4Var2.r.eglGetError()), "eglChooseConfig failed ");
            return;
        } else if (iArr[0] > 0) {
            er4Var2.s = eGLConfigArr[0];
        }
        EGLConfig eGLConfig = er4Var2.s;
        if (eGLConfig == null) {
            wn4.j("eglConfig not initialized");
            return;
        }
        int i = er4Var2.T == 4 ? 3 : 2;
        EGL10 egl103 = er4Var2.r;
        EGLDisplay eGLDisplay2 = er4Var2.f;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLContext eglCreateContext = egl103.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext, new int[]{12440, i, 12344});
        er4Var2.n = eglCreateContext;
        if (eglCreateContext == null || eglCreateContext == eGLContext) {
            fvc.d(er4Var2.r.eglGetError(), "eglCreateContext failed: ");
            return;
        }
        er4Var2.c();
        er4Var2.h = er4Var2.r.eglCreateWindowSurface(er4Var2.f, er4Var2.s, er4Var2.c, null);
        er4Var2.c();
        EGLSurface eGLSurface = er4Var2.h;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int eglGetError = er4Var2.r.eglGetError();
            if (eglGetError != 12299) {
                k93.c(GLUtils.getEGLErrorString(eglGetError), "eglCreateWindowSurface failed ");
                return;
            }
            fa4.d("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
        } else if (!er4Var2.r.eglMakeCurrent(er4Var2.f, eGLSurface, eGLSurface, er4Var2.n)) {
            k93.c(GLUtils.getEGLErrorString(er4Var2.r.eglGetError()), "eglMakeCurrent failed ");
            return;
        } else {
            er4Var2.c();
            er4Var2.w = (GL10) er4Var2.n.getGL();
            er4Var2.c();
        }
        this.d.d();
        long nanoTime = System.nanoTime();
        while (!this.b) {
            synchronized (this.d) {
                if (this.d.I && (uq4Var = (er4Var = this.d).b) != null) {
                    er4Var.f(uq4Var);
                    this.d.I = false;
                }
            }
            er4 er4Var3 = this.d;
            if (er4Var3.b != null && !er4Var3.H) {
                long nanoTime2 = System.nanoTime();
                this.d.e((nanoTime2 - nanoTime) / 1.0E9f);
                if (!this.c) {
                    this.c = true;
                    gl.c3(new cr4(this, b));
                }
                nanoTime = nanoTime2;
            }
            try {
                er4 er4Var4 = this.d;
                if (er4Var4.b == null || er4Var4.H) {
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
    /* JADX WARN: Type inference failed for: r4v4, types: [er4] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.d.d) {
            if (this.b) {
                return;
            }
            er4 er4Var = this.d;
            er4Var.c = this.a;
            er4Var.I = true;
            try {
                try {
                    a();
                } catch (Exception e) {
                    if (!this.b) {
                        fa4.g(e, true);
                        gl.c3(new cr4(this, (byte) 0));
                    }
                }
            } finally {
                this.d.i();
            }
        }
    }
}
