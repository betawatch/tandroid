// default package

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class njc implements EglBase14 {
    public EGLContext a;
    public EGLConfig b;
    public EGLDisplay c;
    public EGLSurface d;
    public EGLSurface e;

    public final void a() {
        if (this.c == EGL14.EGL_NO_DISPLAY || this.a == EGL14.EGL_NO_CONTEXT || this.b == null) {
            xi4.l("This object has been released");
        }
    }

    public final void b(Object obj, boolean z) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceTexture)) {
            grb.i("Input must be either a Surface or SurfaceTexture");
            return;
        }
        a();
        if ((z ? this.e : this.d) != EGL14.EGL_NO_SURFACE) {
            xi4.l("Already has an EGLSurface");
            return;
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.c, this.b, obj, new int[]{12344}, 0);
        if (eglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
            grb.p(Integer.toHexString(EGL14.eglGetError()), "Failed to create window surface: 0x");
        } else if (z) {
            this.e = eglCreateWindowSurface;
        } else {
            this.d = eglCreateWindowSurface;
        }
    }

    public final void c(EGLSurface eGLSurface) {
        a();
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            xi4.l("No EGLSurface - can't make current");
            return;
        }
        synchronized (EglBase.lock) {
            if (!EGL14.eglMakeCurrent(this.c, eGLSurface, eGLSurface, this.a)) {
                throw new RuntimeException("eglMakeCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
    }

    @Override // org.webrtc.EglBase
    public final void createDummyPbufferSurface() {
        createPbufferSurface(1, 1);
    }

    @Override // org.webrtc.EglBase
    public final void createPbufferSurface(int i, int i2) {
        a();
        if (this.d != EGL14.EGL_NO_SURFACE) {
            xi4.l("Already has an EGLSurface");
            return;
        }
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.c, this.b, new int[]{12375, i, 12374, i2, 12344}, 0);
        this.d = eglCreatePbufferSurface;
        if (eglCreatePbufferSurface != EGL14.EGL_NO_SURFACE) {
            return;
        }
        StringBuilder p = bs2.p("Failed to create pixel buffer surface with size ", i, "x", i2, ": 0x");
        p.append(Integer.toHexString(EGL14.eglGetError()));
        throw new RuntimeException(p.toString());
    }

    @Override // org.webrtc.EglBase
    public final void createSurface(Surface surface) {
        b(surface, false);
    }

    public final void d(boolean z) {
        if (z) {
            EGLSurface eGLSurface = this.e;
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.c, eGLSurface);
                this.e = EGL14.EGL_NO_SURFACE;
                return;
            }
            return;
        }
        EGLSurface eGLSurface2 = this.d;
        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
            EGL14.eglDestroySurface(this.c, eGLSurface2);
            this.d = EGL14.EGL_NO_SURFACE;
        }
    }

    @Override // org.webrtc.EglBase
    public final void detachCurrent() {
        synchronized (EglBase.lock) {
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
                throw new RuntimeException("eglDetachCurrent failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
            }
        }
    }

    public final void e(boolean z) {
        a();
        EGLSurface eGLSurface = z ? this.e : this.d;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            xi4.l("No EGLSurface - can't swap buffers");
        } else {
            synchronized (EglBase.lock) {
                EGL14.eglSwapBuffers(this.c, eGLSurface);
            }
        }
    }

    @Override // org.webrtc.EglBase
    public final EglBase.Context getEglBaseContext() {
        return new mjc(this.a);
    }

    @Override // org.webrtc.EglBase
    public final boolean hasSurface() {
        return this.d != EGL14.EGL_NO_SURFACE;
    }

    @Override // org.webrtc.EglBase
    public final void makeCurrent() {
        c(this.d);
    }

    @Override // org.webrtc.EglBase
    public final void release() {
        a();
        d(false);
        d(true);
        detachCurrent();
        synchronized (EglBase.lock) {
            EGL14.eglDestroyContext(this.c, this.a);
        }
        EGL14.eglReleaseThread();
        EGL14.eglTerminate(this.c);
        this.a = EGL14.EGL_NO_CONTEXT;
        this.c = EGL14.EGL_NO_DISPLAY;
        this.b = null;
    }

    @Override // org.webrtc.EglBase
    public final void releaseSurface() {
        d(false);
    }

    @Override // org.webrtc.EglBase
    public final void setDetachSurfaceOnRelease(boolean z) {
        int i = c.a;
    }

    @Override // org.webrtc.EglBase
    public final int surfaceHeight() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.c, this.d, 12374, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public final int surfaceWidth() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.c, this.d, 12375, iArr, 0);
        return iArr[0];
    }

    @Override // org.webrtc.EglBase
    public final void swapBuffers(long j) {
        a();
        EGLSurface eGLSurface = this.d;
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            xi4.l("No EGLSurface - can't swap buffers");
            return;
        }
        synchronized (EglBase.lock) {
            EGLExt.eglPresentationTimeANDROID(this.c, eGLSurface, j);
            EGL14.eglSwapBuffers(this.c, eGLSurface);
        }
    }

    @Override // org.webrtc.EglBase
    public final void createSurface(SurfaceTexture surfaceTexture) {
        b(surfaceTexture, false);
    }

    @Override // org.webrtc.EglBase
    public final void swapBuffers() {
        e(false);
    }
}
