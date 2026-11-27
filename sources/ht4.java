// default package

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ht4 extends Thread {
    public final SurfaceTexture a;
    public volatile boolean b;
    public boolean c;
    public final /* synthetic */ it4 d;

    public ht4(it4 it4Var, SurfaceTexture surfaceTexture) {
        this.d = it4Var;
        this.a = surfaceTexture;
    }

    public final void a() {
        it4 it4Var;
        ys4 ys4Var;
        it4 it4Var2 = this.d;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        it4Var2.r = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        it4Var2.f = eglGetDisplay;
        EGLDisplay eGLDisplay = EGL10.EGL_NO_DISPLAY;
        EGL10 egl102 = it4Var2.r;
        if (eglGetDisplay == eGLDisplay) {
            grb.p(GLUtils.getEGLErrorString(egl102.eglGetError()), "eglGetDisplay failed ");
            return;
        }
        if (!egl102.eglInitialize(eglGetDisplay, new int[2])) {
            grb.p(GLUtils.getEGLErrorString(it4Var2.r.eglGetError()), "eglInitialize failed ");
            return;
        }
        byte b = 1;
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = c34.m(it4Var2.getContext()).h() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12337, it4Var2.getMsaaSamples(), 12344};
        it4Var2.s = null;
        if (!c34.m(it4Var2.getContext()).h() && it4Var2.r.eglChooseConfig(it4Var2.f, iArr2, eGLConfigArr, 1, iArr) && iArr[0] != 0) {
            it4Var2.s = eGLConfigArr[0];
        } else if (!it4Var2.r.eglChooseConfig(it4Var2.f, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
            c22.b(GLUtils.getEGLErrorString(it4Var2.r.eglGetError()), "eglChooseConfig failed ");
            return;
        } else if (iArr[0] > 0) {
            it4Var2.s = eGLConfigArr[0];
        }
        EGLConfig eGLConfig = it4Var2.s;
        if (eGLConfig == null) {
            xi4.l("eglConfig not initialized");
            return;
        }
        int i = it4Var2.T == 4 ? 3 : 2;
        EGL10 egl103 = it4Var2.r;
        EGLDisplay eGLDisplay2 = it4Var2.f;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLContext eglCreateContext = egl103.eglCreateContext(eGLDisplay2, eGLConfig, eGLContext, new int[]{12440, i, 12344});
        it4Var2.n = eglCreateContext;
        if (eglCreateContext == null || eglCreateContext == eGLContext) {
            p3d.e(it4Var2.r.eglGetError(), "eglCreateContext failed: ");
            return;
        }
        it4Var2.c();
        it4Var2.h = it4Var2.r.eglCreateWindowSurface(it4Var2.f, it4Var2.s, it4Var2.c, null);
        it4Var2.c();
        EGLSurface eGLSurface = it4Var2.h;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int eglGetError = it4Var2.r.eglGetError();
            if (eglGetError != 12299) {
                grb.p(GLUtils.getEGLErrorString(eglGetError), "eglCreateWindowSurface failed ");
                return;
            }
            cc4.d("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
        } else if (!it4Var2.r.eglMakeCurrent(it4Var2.f, eGLSurface, eGLSurface, it4Var2.n)) {
            grb.p(GLUtils.getEGLErrorString(it4Var2.r.eglGetError()), "eglMakeCurrent failed ");
            return;
        } else {
            it4Var2.c();
            it4Var2.w = (GL10) it4Var2.n.getGL();
            it4Var2.c();
        }
        this.d.d();
        long nanoTime = System.nanoTime();
        while (!this.b) {
            synchronized (this.d) {
                if (this.d.I && (ys4Var = (it4Var = this.d).b) != null) {
                    it4Var.f(ys4Var);
                    this.d.I = false;
                }
            }
            it4 it4Var3 = this.d;
            if (it4Var3.b != null && !it4Var3.H) {
                long nanoTime2 = System.nanoTime();
                this.d.e((nanoTime2 - nanoTime) / 1.0E9f);
                if (!this.c) {
                    this.c = true;
                    hl.c3(new gt4(this, b));
                }
                nanoTime = nanoTime2;
            }
            try {
                it4 it4Var4 = this.d;
                if (it4Var4.b == null || it4Var4.H) {
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
    /* JADX WARN: Type inference failed for: r4v4, types: [it4] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.d.d) {
            if (this.b) {
                return;
            }
            it4 it4Var = this.d;
            it4Var.c = this.a;
            it4Var.I = true;
            try {
                try {
                    a();
                } catch (Exception e) {
                    if (!this.b) {
                        cc4.g(e, true);
                        hl.c3(new gt4(this, (byte) 0));
                    }
                }
            } finally {
                this.d.i();
            }
        }
    }
}
