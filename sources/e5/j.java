package e5;

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
import d5.g0;
import java.util.Locale;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends HandlerThread implements Handler.Callback {
    public d5.e a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public k e;

    public final void a(int i10) {
        EGLSurface eglCreatePbufferSurface;
        this.a.getClass();
        d5.e eVar = this.a;
        int[] iArr = eVar.b;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        d5.a.g("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr2 = new int[2];
        d5.a.g("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        eVar.c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, d5.e.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z10 = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        int i11 = g0.a;
        d5.a.g(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(eVar.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        d5.a.g("eglCreateContext failed", eglCreateContext != null);
        eVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = eVar.c;
        if (i10 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            d5.a.g("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        d5.a.g("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        eVar.e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z11) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(glGetError));
            z11 = true;
        }
        if (z11) {
            throw new d5.h(sb2.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        eVar.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(eVar);
        SurfaceTexture surfaceTexture2 = this.a.f;
        surfaceTexture2.getClass();
        this.e = new k(this, surfaceTexture2, i10 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a.getClass();
        d5.e eVar = this.a;
        eVar.a.removeCallbacks(eVar);
        try {
            SurfaceTexture surfaceTexture = eVar.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, eVar.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = eVar.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = eVar.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = eVar.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(eVar.c, eVar.e);
            }
            EGLContext eGLContext = eVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eVar.c, eGLContext);
            }
            if (g0.a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = eVar.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(eVar.c);
            }
            eVar.c = null;
            eVar.d = null;
            eVar.e = null;
            eVar.f = null;
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
                } catch (d5.h e9) {
                    d5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e9);
                    this.d = new IllegalStateException(e9);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    d5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.c = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    d5.a.p("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.d = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    b();
                    return true;
                } catch (Throwable th) {
                    try {
                        d5.a.p("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
