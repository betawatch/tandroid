package a3;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class n extends HandlerThread implements Handler.Callback {
    public e2.j a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public o e;

    public final void a(int i10) {
        EGLSurface eglCreatePbufferSurface;
        this.a.getClass();
        e2.j jVar = this.a;
        int[] iArr = jVar.b;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        e2.a.c("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr2 = new int[2];
        e2.a.c("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        jVar.c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, e2.j.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z10 = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = e2.d0.a;
        e2.a.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(jVar.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        e2.a.c("eglCreateContext failed", eglCreateContext != null);
        jVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = jVar.c;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            e2.a.c("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        e2.a.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        jVar.e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        e2.a.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        jVar.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(jVar);
        SurfaceTexture surfaceTexture2 = this.a.f;
        surfaceTexture2.getClass();
        this.e = new o(this, surfaceTexture2, i10 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a.getClass();
        e2.j jVar = this.a;
        jVar.a.removeCallbacks(jVar);
        try {
            SurfaceTexture surfaceTexture = jVar.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, jVar.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = jVar.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = jVar.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = jVar.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(jVar.c, jVar.e);
            }
            EGLContext eGLContext = jVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(jVar.c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = jVar.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(jVar.c);
            }
            jVar.c = null;
            jVar.d = null;
            jVar.e = null;
            jVar.f = null;
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
                } catch (e2.k e7) {
                    e2.a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                    this.d = new IllegalStateException(e7);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    e2.a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    e2.a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.d = e11;
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
                        e2.a.f("PlaceholderSurface", "Failed to release placeholder surface", th2);
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
