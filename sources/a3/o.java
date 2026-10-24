package a3;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class o extends HandlerThread implements Handler.Callback {
    public e2.l a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public p e;

    public final void a(int i10) {
        EGLSurface eglCreatePbufferSurface;
        this.a.getClass();
        e2.l lVar = this.a;
        int[] iArr = lVar.b;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        e2.e.a("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr2 = new int[2];
        e2.e.a("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        lVar.c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, e2.l.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z10 = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = e2.m0.a;
        e2.e.a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(lVar.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        e2.e.a("eglCreateContext failed", eglCreateContext != null);
        lVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = lVar.c;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            e2.e.a("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        e2.e.a("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        lVar.e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb2 = new StringBuilder();
        e9.s.f(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z11) {
                sb2.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb2.append("glError: ");
            sb2.append(gluErrorString);
            Integer valueOf = Integer.valueOf(glGetError);
            int i12 = i11 + 1;
            int b10 = e9.h0.b(objArr2.length, i12);
            if (b10 > objArr2.length) {
                objArr2 = Arrays.copyOf(objArr2, b10);
            }
            objArr2[i11] = valueOf;
            i11 = i12;
            z11 = true;
        }
        if (z11) {
            throw new e2.m(sb2.toString(), e9.n0.s(i11, objArr2));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        lVar.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(lVar);
        SurfaceTexture surfaceTexture2 = this.a.f;
        surfaceTexture2.getClass();
        this.e = new p(this, surfaceTexture2, i10 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a.getClass();
        e2.l lVar = this.a;
        lVar.a.removeCallbacks(lVar);
        try {
            SurfaceTexture surfaceTexture = lVar.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, lVar.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = lVar.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = lVar.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = lVar.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(lVar.c, lVar.e);
            }
            EGLContext eGLContext = lVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(lVar.c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = lVar.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(lVar.c);
            }
            lVar.c = null;
            lVar.d = null;
            lVar.e = null;
            lVar.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (e2.m e) {
                    e2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e7) {
                    e2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.c = e7;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    e2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.d = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    b();
                    return true;
                } catch (Throwable th2) {
                    try {
                        e2.a.d("PlaceholderSurface", "Failed to release placeholder surface", th2);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }
}
