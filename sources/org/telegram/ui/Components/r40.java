package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.animation.DecelerateInterpolator;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r40 extends org.telegram.messenger.s5 {
    public boolean D;
    public Integer E;
    public int F;
    public int G;
    public final /* synthetic */ e50 H;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public Object h;
    public final SurfaceTexture[] n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(e50 e50Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread", true);
        this.H = e50Var;
        this.n = new SurfaceTexture[2];
        this.E = 0;
        this.a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void a(int i10, boolean z10, int i11, int i12, long j10) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new u40(i11, i12, j10, 0L, z10)), 0);
        }
    }

    public final void b() {
        e50 e50Var = this.H;
        if (e50Var.m0[e50Var.j1] != null) {
            e50 e50Var2 = this.H;
            int width = e50Var2.m0[e50Var2.j1].getWidth();
            e50 e50Var3 = this.H;
            float min = this.F / Math.min(width, r1);
            int i10 = (int) (width * min);
            int height = (int) (e50Var3.m0[e50Var3.j1].getHeight() * min);
            if (i10 == height) {
                e50 e50Var4 = this.H;
                e50Var4.K0 = 1.0f;
                e50Var4.L0 = 1.0f;
            } else if (i10 > height) {
                e50 e50Var5 = this.H;
                e50Var5.K0 = 1.0f;
                e50Var5.L0 = i10 / this.G;
            } else {
                e50 e50Var6 = this.H;
                e50Var6.K0 = height / this.F;
                e50Var6.L0 = 1.0f;
            }
            org.telegram.messenger.f8.b("InstantCamera camera scaleX = " + this.H.K0 + " scaleY = " + this.H.L0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.n != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                SurfaceTexture surfaceTexture = this.n[i10];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.n[i10] = null;
                }
            }
        }
        this.H.V = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.a0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.a0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.a0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.a0[1] = Integer.MIN_VALUE;
            }
        }
        if (this.e != null) {
            EGL10 egl102 = this.b;
            EGLDisplay eGLDisplay2 = this.c;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            this.b.eglDestroySurface(this.c, this.e);
            this.e = null;
        }
        EGLContext eGLContext2 = this.d;
        if (eGLContext2 != null) {
            this.b.eglDestroyContext(this.c, eGLContext2);
            this.d = null;
        }
        EGLDisplay eGLDisplay3 = this.c;
        if (eGLDisplay3 != null) {
            this.b.eglTerminate(eGLDisplay3);
            this.c = null;
        }
    }

    @Override // org.telegram.messenger.s5
    public final void handleMessage(Message message) {
        boolean z10;
        Object obj;
        boolean z11;
        x40 x40Var;
        int i10 = message.what;
        final int i11 = 1;
        final int i12 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                finish();
                if (this.D && ((!((z11 = (obj = message.obj) instanceof u40)) || ((u40) obj).c != -2) && (x40Var = this.H.h1) != null)) {
                    x40Var.i(message.arg1, z11 ? (u40) obj : null);
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.f8.b("InstantCamera set gl renderer session");
                    }
                    Object obj2 = message.obj;
                    Object obj3 = this.h;
                    if (obj3 != obj2) {
                        this.h = obj2;
                        return;
                    }
                    int worldAngle = obj3 instanceof CameraSession ? ((CameraSession) obj3).getWorldAngle() : obj3 instanceof Camera2Session ? ((Camera2Session) obj3).getWorldAngle() : 0;
                    Matrix.setIdentityM(this.H.E0, 0);
                    if (worldAngle != 0) {
                        Matrix.rotateM(this.H.E0, 0, worldAngle, 0.0f, 0.0f, 1.0f);
                        return;
                    }
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                e50 e50Var = this.H;
                e50Var.j1 = 1 - e50Var.j1;
                if (this.H.A0) {
                    this.H.p("GL surface flip applied: surface=" + this.H.j1);
                }
                b();
                e50 e50Var2 = this.H;
                float f7 = (1.0f / e50Var2.K0) / 2.0f;
                float f10 = (1.0f / e50Var2.L0) / 2.0f;
                float f11 = 0.5f - f7;
                float f12 = 0.5f - f10;
                float f13 = f7 + 0.5f;
                float f14 = f10 + 0.5f;
                e50Var2.I0 = org.telegram.messenger.z20.g(ByteBuffer.allocateDirect(32));
                this.H.I0.put(new float[]{f11, f12, f13, f12, f11, f14, f13, f14}).position(0);
                return;
            }
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = this.e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.f8.b("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.b.eglGetError()));
                    return;
                }
                return;
            }
            SurfaceTexture surfaceTexture = this.n[0];
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.H.G0);
                this.n[0].setOnFrameAvailableListener(null);
                this.n[0].release();
                e50 e50Var3 = this.H;
                int[] iArr = e50Var3.b0;
                int[] iArr2 = e50Var3.a0;
                iArr[0] = iArr2[0];
                e50Var3.c0 = 0.0f;
                iArr2[0] = 0;
                e50Var3.J0 = e50Var3.I0.duplicate();
                e50 e50Var4 = this.H;
                e50Var4.M0 = e50Var4.m0[0];
            }
            this.E = Integer.valueOf(this.E.intValue() + 1);
            this.H.J = false;
            GLES20.glGenTextures(1, this.H.a0, 0);
            GLES20.glBindTexture(36197, this.H.a0[0]);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.n[0] = new SurfaceTexture(this.H.a0[0]);
            this.n[0].setOnFrameAvailableListener(new fz(this, 1));
            if (this.H.A0) {
                this.H.p("GL input recreated: surface=0");
            }
            org.telegram.messenger.i0.g3(new ag.o0(this.H, i12, this.n[0], 28));
            b();
            e50 e50Var5 = this.H;
            float f15 = (1.0f / e50Var5.K0) / 2.0f;
            float f16 = (1.0f / e50Var5.L0) / 2.0f;
            float f17 = 0.5f - f15;
            float f18 = 0.5f - f16;
            float f19 = f15 + 0.5f;
            float f20 = f16 + 0.5f;
            e50Var5.I0 = org.telegram.messenger.z20.g(ByteBuffer.allocateDirect(32));
            this.H.I0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
            return;
        }
        int i13 = message.arg1;
        int i14 = message.arg2;
        boolean z12 = (i14 & 1) != 0;
        boolean z13 = (i14 & 2) != 0;
        if (this.f) {
            if (!this.d.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.b;
                EGLDisplay eGLDisplay2 = this.c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.z20.t(this.b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z12) {
                this.n[0].updateTexImage();
            }
            if (z13) {
                this.n[1].updateTexImage();
            }
            boolean z14 = this.H.A0 && this.H.j1 == this.H.z0 && ((this.H.j1 == 0 && z12) || (this.H.j1 == 1 && z13));
            if (this.D) {
                z10 = false;
            } else {
                e50 e50Var6 = this.H;
                if (e50Var6.h1 == null) {
                    e50Var6.h1 = new x40(e50Var6);
                }
                e50 e50Var7 = this.H;
                if (e50Var7.h1.F0) {
                    if (!e50Var7.J) {
                        this.H.J = true;
                        org.telegram.messenger.i0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.q40
                            public final /* synthetic */ r40 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        this.b.H.q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        break;
                                    default:
                                        e50 e50Var8 = this.b.H;
                                        if (e50Var8.p0 != null) {
                                            Bitmap bitmap = e50Var8.i1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                e50Var8.i1 = null;
                                            }
                                            e50Var8.i1 = e50Var8.p0.getBitmap();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    z10 = false;
                } else {
                    z10 = true;
                }
                e50 e50Var8 = this.H;
                x40 x40Var2 = e50Var8.h1;
                org.telegram.messenger.pe peVar = e50Var8.e0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (x40Var2.F0 && x40Var2.T != null && x40Var2.T.getLooper() != null && x40Var2.T.getLooper().getThread() != null && x40Var2.T.getLooper().getThread().isAlive()) {
                    x40Var2.x = eglGetCurrentContext;
                    x40Var2.T.sendMessage(x40Var2.T.obtainMessage(0, 1, 0));
                }
                x40Var2.F0 = true;
                int i15 = org.telegram.messenger.vp.r1(x40Var2.H0.e).v3;
                int i16 = org.telegram.messenger.vp.r1(x40Var2.H0.e).w3 * 1024;
                org.telegram.messenger.i0.g3(new org.telegram.messenger.rz(22));
                x40Var2.a = peVar;
                x40Var2.d = i15;
                x40Var2.e = i15;
                x40Var2.f = i16;
                x40Var2.x = eglGetCurrentContext;
                synchronized (x40Var2.U) {
                    try {
                        if (!x40Var2.W) {
                            x40Var2.W = true;
                            Thread thread = new Thread(x40Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!x40Var2.V) {
                                try {
                                    x40Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            x40Var2.A0.clear();
                            x40Var2.C0 = 0;
                            org.telegram.messenger.s5 s5Var = x40Var2.B0;
                            if (s5Var != null) {
                                s5Var.cleanupQueue();
                                x40Var2.B0.recycle();
                            }
                            x40Var2.B0 = new org.telegram.messenger.s5("keyframes_thumb_queue", true);
                            x40Var2.T.sendMessage(x40Var2.T.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                int currentOrientation = obj4 instanceof CameraSession ? ((CameraSession) obj4).getCurrentOrientation() : obj4 instanceof Camera2Session ? ((Camera2Session) obj4).getCurrentOrientation() : 0;
                if (currentOrientation == 90 || currentOrientation == 270) {
                    e50 e50Var9 = this.H;
                    float f21 = e50Var9.K0;
                    e50Var9.K0 = e50Var9.L0;
                    e50Var9.L0 = f21;
                }
                this.D = true;
                this.H.v();
            }
            e50 e50Var10 = this.H;
            if (e50Var10.h1 != null && ((e50Var10.j1 == 0 && z12) || (this.H.j1 == 1 && z13))) {
                e50 e50Var11 = this.H;
                x40 x40Var3 = e50Var11.h1;
                SurfaceTexture surfaceTexture2 = this.n[e50Var11.j1];
                e50 e50Var12 = this.H;
                if (e50Var12.t0) {
                    i13 = e50Var12.j1;
                }
                x40Var3.f(surfaceTexture2, Integer.valueOf(i13), System.nanoTime());
            }
            this.n[this.H.j1].getTransformMatrix(this.H.F0);
            GLES20.glUseProgram(this.r);
            GLES20.glActiveTexture(33984);
            e50 e50Var13 = this.H;
            GLES20.glBindTexture(36197, e50Var13.a0[e50Var13.j1]);
            GLES20.glVertexAttribPointer(this.x, 3, 5126, false, 12, (Buffer) this.H.H0);
            GLES20.glEnableVertexAttribArray(this.x);
            GLES20.glVertexAttribPointer(this.y, 2, 5126, false, 8, (Buffer) this.H.I0);
            GLES20.glEnableVertexAttribArray(this.y);
            GLES20.glUniformMatrix4fv(this.w, 1, false, this.H.F0, 0);
            GLES20.glUniformMatrix4fv(this.s, 1, false, this.H.E0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.x);
            GLES20.glDisableVertexAttribArray(this.y);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.b.eglSwapBuffers(this.c, this.e);
            if (z14 && this.H.A0) {
                this.H.A0 = false;
                this.H.p("first target frame presented: surface=" + this.H.j1);
            }
            if (z10) {
                org.telegram.messenger.i0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.q40
                    public final /* synthetic */ r40 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.H.q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                break;
                            default:
                                e50 e50Var82 = this.b.H;
                                if (e50Var82.p0 != null) {
                                    Bitmap bitmap = e50Var82.i1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        e50Var82.i1 = null;
                                    }
                                    e50Var82.i1 = e50Var82.p0.getBitmap();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
    }

    public final void requestRender(boolean z10, boolean z11) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(0, this.E.intValue(), (z10 ? 1 : 0) + (z11 ? 2 : 0)), 0);
        }
    }

    @Override // org.telegram.messenger.s5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (org.telegram.messenger.v2.a) {
            org.telegram.messenger.f8.b("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.v2.a) {
                org.telegram.messenger.z20.t(this.b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.z20.t(this.b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.z20.t(this.b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (org.telegram.messenger.v2.a) {
                                org.telegram.messenger.z20.t(this.b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                            b();
                            e50 e50Var = this.H;
                            float f7 = e50Var.K0;
                            int[] iArr2 = e50Var.a0;
                            float f10 = (1.0f / f7) / 2.0f;
                            float f11 = (1.0f / e50Var.L0) / 2.0f;
                            float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                            float f12 = 0.5f - f10;
                            float f13 = 0.5f - f11;
                            float f14 = f10 + 0.5f;
                            float f15 = f11 + 0.5f;
                            float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                            if (e50Var.h1 == null) {
                                e50Var.h1 = new x40(e50Var);
                            }
                            FloatBuffer g10 = org.telegram.messenger.z20.g(ByteBuffer.allocateDirect(48));
                            e50Var.H0 = g10;
                            g10.put(fArr).position(0);
                            FloatBuffer g11 = org.telegram.messenger.z20.g(ByteBuffer.allocateDirect(32));
                            e50Var.I0 = g11;
                            g11.put(fArr2).position(0);
                            Matrix.setIdentityM(e50Var.F0, 0);
                            int k10 = e50.k(e50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                            int k11 = e50.k(e50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                            if (k10 == 0 || k11 == 0) {
                                if (org.telegram.messenger.v2.a) {
                                    org.telegram.messenger.f8.d("InstantCamera failed creating shader");
                                }
                                finish();
                            } else {
                                int glCreateProgram = GLES20.glCreateProgram();
                                this.r = glCreateProgram;
                                GLES20.glAttachShader(glCreateProgram, k10);
                                GLES20.glAttachShader(this.r, k11);
                                GLES20.glLinkProgram(this.r);
                                int[] iArr3 = new int[1];
                                GLES20.glGetProgramiv(this.r, 35714, iArr3, 0);
                                if (iArr3[0] == 0) {
                                    if (org.telegram.messenger.v2.a) {
                                        org.telegram.messenger.f8.d("InstantCamera failed link shader");
                                    }
                                    GLES20.glDeleteProgram(this.r);
                                    this.r = 0;
                                } else {
                                    this.x = GLES20.glGetAttribLocation(this.r, "aPosition");
                                    this.y = GLES20.glGetAttribLocation(this.r, "aTextureCoord");
                                    this.s = GLES20.glGetUniformLocation(this.r, "uMVPMatrix");
                                    this.w = GLES20.glGetUniformLocation(this.r, "uSTMatrix");
                                }
                                Matrix.setIdentityM(e50Var.E0, 0);
                                GLES20.glGenTextures(2, iArr2, 0);
                                for (final int i10 = 0; i10 < 2; i10++) {
                                    GLES20.glBindTexture(36197, iArr2[i10]);
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i10]);
                                    SurfaceTexture[] surfaceTextureArr = this.n;
                                    surfaceTextureArr[i10] = surfaceTexture2;
                                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.telegram.ui.Components.p40
                                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                            r40 r40Var = r40.this;
                                            int i11 = i10;
                                            r40Var.H.V = true;
                                            r40Var.requestRender(i11 == 0, i11 == 1);
                                        }
                                    });
                                    org.telegram.messenger.i0.g3(new ag.o0(e50Var, i10, surfaceTextureArr[i10], 28));
                                }
                                if (org.telegram.messenger.v2.a) {
                                    org.telegram.messenger.f8.d("InstantCamera gl initied");
                                }
                                z10 = true;
                            }
                        } else {
                            if (org.telegram.messenger.v2.a) {
                                org.telegram.messenger.z20.t(this.b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.f8.d("InstantCamera eglConfig not initialized");
                }
                finish();
            }
        } else {
            if (org.telegram.messenger.v2.a) {
                org.telegram.messenger.z20.t(this.b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        }
        this.f = z10;
        super.run();
    }
}
