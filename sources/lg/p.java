package lg;

import android.graphics.SurfaceTexture;
import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.o6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p extends Thread {
    public final SurfaceTexture a;
    public volatile boolean b;
    public boolean c;
    public final /* synthetic */ q d;

    public p(q qVar, SurfaceTexture surfaceTexture) {
        this.d = qVar;
        this.a = surfaceTexture;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        q qVar;
        boolean z10;
        q qVar2;
        h hVar;
        q qVar3 = this.d;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        qVar3.r = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        qVar3.f = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed " + GLUtils.getEGLErrorString(qVar3.r.eglGetError()));
        }
        if (!qVar3.r.eglInitialize(eglGetDisplay, new int[2])) {
            throw new RuntimeException("eglInitialize failed " + GLUtils.getEGLErrorString(qVar3.r.eglGetError()));
        }
        int i10 = 1;
        int[] iArr = new int[1];
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = o6.h(qVar3.getContext()).f() ? new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12344} : new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12338, 1, 12337, qVar3.getMsaaSamples(), 12344};
        qVar3.s = null;
        if (!o6.h(qVar3.getContext()).f() && qVar3.r.eglChooseConfig(qVar3.f, iArr2, eGLConfigArr, 1, iArr) && iArr[0] != 0) {
            qVar3.s = eGLConfigArr[0];
        } else {
            if (!qVar3.r.eglChooseConfig(qVar3.f, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed " + GLUtils.getEGLErrorString(qVar3.r.eglGetError()));
            }
            if (iArr[0] > 0) {
                qVar3.s = eGLConfigArr[0];
            }
        }
        EGLConfig eGLConfig = qVar3.s;
        if (eGLConfig == null) {
            throw new RuntimeException("eglConfig not initialized");
        }
        int i11 = qVar3.S == 4 ? 3 : 2;
        EGL10 egl102 = qVar3.r;
        EGLDisplay eGLDisplay = qVar3.f;
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, i11, 12344});
        qVar3.n = eglCreateContext;
        if (eglCreateContext == null || eglCreateContext == eGLContext) {
            throw new IllegalStateException("eglCreateContext failed: " + qVar3.r.eglGetError());
        }
        qVar3.f();
        qVar3.h = qVar3.r.eglCreateWindowSurface(qVar3.f, qVar3.s, qVar3.c, null);
        qVar3.f();
        EGLSurface eGLSurface = qVar3.h;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            int eglGetError = qVar3.r.eglGetError();
            if (eglGetError != 12299) {
                throw new RuntimeException("eglCreateWindowSurface failed " + GLUtils.getEGLErrorString(eglGetError));
            }
            f8.d("eglCreateWindowSurface returned EGL10.EGL_BAD_NATIVE_WINDOW");
        } else {
            if (!qVar3.r.eglMakeCurrent(qVar3.f, eGLSurface, eGLSurface, qVar3.n)) {
                throw new RuntimeException("eglMakeCurrent failed " + GLUtils.getEGLErrorString(qVar3.r.eglGetError()));
            }
            qVar3.f();
            qVar3.w = (GL10) qVar3.n.getGL();
            qVar3.f();
        }
        this.d.g();
        long nanoTime = System.nanoTime();
        while (!this.b) {
            synchronized (this.d) {
                try {
                    if (this.d.H && (hVar = (qVar2 = this.d).b) != null) {
                        q.c(qVar2, hVar);
                        this.d.H = false;
                    }
                } finally {
                }
            }
            q qVar4 = this.d;
            if (qVar4.b != null && !qVar4.G) {
                long nanoTime2 = System.nanoTime();
                q.a(this.d, (nanoTime2 - nanoTime) / 1.0E9f);
                if (!this.c) {
                    this.c = true;
                    i0.g3(new o(this, i10));
                }
                nanoTime = nanoTime2;
            }
            try {
                qVar = this.d;
            } catch (InterruptedException unused) {
            }
            if (qVar.b != null && !qVar.G) {
                z10 = false;
                if (z10) {
                    long nanoTime3 = this.d.x - (System.nanoTime() - nanoTime);
                    if (nanoTime3 > 0) {
                        Thread.sleep(nanoTime3 / 1000000, (int) (nanoTime3 % 1000000));
                    }
                } else {
                    Thread.sleep(100L);
                }
            }
            z10 = true;
            if (z10) {
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (this.b) {
                    return;
                }
                q qVar = this.d;
                qVar.c = this.a;
                qVar.H = true;
                try {
                    try {
                        a();
                    } catch (Exception e) {
                        if (!this.b) {
                            f8.g(e, true);
                            i0.g3(new o(this, 0));
                        }
                    }
                    q.b(this.d);
                } catch (Throwable th2) {
                    q.b(this.d);
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
