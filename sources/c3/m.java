package c3;

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
import g2.n0;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends HandlerThread implements Handler.Callback {
    public g2.m a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public n e;

    public final void a(int i3) {
        EGLSurface eglCreatePbufferSurface;
        this.a.getClass();
        g2.m mVar = this.a;
        int[] iArr = mVar.b;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        g2.f.a("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr2 = new int[2];
        g2.f.a("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        mVar.c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, g2.m.h, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z10 = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = n0.a;
        g2.f.a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z10);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(mVar.c, eGLConfig, EGL14.EGL_NO_CONTEXT, i3 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        g2.f.a("eglCreateContext failed", eglCreateContext != null);
        mVar.d = eglCreateContext;
        EGLDisplay eGLDisplay = mVar.c;
        if (i3 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i3 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            g2.f.a("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        g2.f.a("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        mVar.e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        StringBuilder sb2 = new StringBuilder();
        g9.o.g(4, "initialCapacity");
        Object[] objArr2 = new Object[4];
        boolean z11 = false;
        int i10 = 0;
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
            int i11 = i10 + 1;
            int b10 = g9.c0.b(objArr2.length, i11);
            if (b10 > objArr2.length) {
                objArr2 = Arrays.copyOf(objArr2, b10);
            }
            objArr2[i10] = valueOf;
            i10 = i11;
            z11 = true;
        }
        if (z11) {
            throw new g2.n(sb2.toString(), g9.i0.o(i10, objArr2));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        mVar.f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(mVar);
        SurfaceTexture surfaceTexture2 = this.a.f;
        surfaceTexture2.getClass();
        this.e = new n(this, surfaceTexture2, i3 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.a.getClass();
        g2.m mVar = this.a;
        mVar.a.removeCallbacks(mVar);
        try {
            SurfaceTexture surfaceTexture = mVar.f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, mVar.b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = mVar.c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = mVar.c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = mVar.e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(mVar.c, mVar.e);
            }
            EGLContext eGLContext = mVar.d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(mVar.c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = mVar.c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(mVar.c);
            }
            mVar.c = null;
            mVar.d = null;
            mVar.e = null;
            mVar.f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i3 = message.what;
        try {
            if (i3 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (g2.n e10) {
                    g2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    g2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    g2.a.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.d = e12;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i3 == 2) {
                try {
                    b();
                    return true;
                } catch (Throwable th2) {
                    try {
                        g2.a.d("PlaceholderSurface", "Failed to release placeholder surface", th2);
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
