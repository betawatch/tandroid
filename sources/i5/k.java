package i5;

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
import h5.d0;
import java.util.Locale;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class k extends HandlerThread implements Handler.Callback {
    public h5.f a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public l e;

    public final void a(int i10) {
        EGLSurface eglCreatePbufferSurface;
        this.a.getClass();
        h5.f fVar = this.a;
        int[] iArr = fVar.b;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        h5.a.g("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr2 = new int[2];
        h5.a.g("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        fVar.c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, h5.f.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z4 = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        int i11 = d0.a;
        h5.a.g(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z4);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(fVar.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        h5.a.g("eglCreateContext failed", eglCreateContext != null);
        fVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = fVar.c;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            h5.a.g("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        h5.a.g("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        fVar.e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z10) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z10 = true;
        }
        if (z10) {
            throw new h5.h(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        fVar.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(fVar);
        SurfaceTexture surfaceTexture2 = this.a.f;
        surfaceTexture2.getClass();
        this.e = new l(this, surfaceTexture2, i10 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a.getClass();
        h5.f fVar = this.a;
        fVar.a.removeCallbacks(fVar);
        try {
            SurfaceTexture surfaceTexture = fVar.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, fVar.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = fVar.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = fVar.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = fVar.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(fVar.c, fVar.e);
            }
            EGLContext eGLContext = fVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(fVar.c, eGLContext);
            }
            if (d0.a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = fVar.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(fVar.c);
            }
            fVar.c = null;
            fVar.d = null;
            fVar.e = null;
            fVar.f = null;
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
                } catch (h5.h e) {
                    h5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.d = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e6) {
                    h5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                    this.c = e6;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    h5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
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
                        h5.a.p("PlaceholderSurface", "Failed to release placeholder surface", th2);
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
