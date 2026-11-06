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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class a40 extends org.telegram.messenger.q5 {
    public boolean D;
    public Integer E;
    public int F;
    public int G;
    public final /* synthetic */ o40 H;
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
    public a40(o40 o40Var, SurfaceTexture surfaceTexture, int i7, int i10) {
        super("CameraGLThread", true);
        this.H = o40Var;
        this.n = new SurfaceTexture[2];
        this.E = 0;
        this.a = surfaceTexture;
        this.F = i7;
        this.G = i10;
    }

    public final void a(int i7, boolean z9, int i10, int i11, long j3) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i7, 0, new d40(i10, i11, j3, 0L, z9)), 0);
        }
    }

    public final void b() {
        o40 o40Var = this.H;
        if (o40Var.m0[o40Var.j1] != null) {
            o40 o40Var2 = this.H;
            int width = o40Var2.m0[o40Var2.j1].getWidth();
            o40 o40Var3 = this.H;
            float min = this.F / Math.min(width, r1);
            int i7 = (int) (width * min);
            int height = (int) (o40Var3.m0[o40Var3.j1].getHeight() * min);
            if (i7 == height) {
                o40 o40Var4 = this.H;
                o40Var4.K0 = 1.0f;
                o40Var4.L0 = 1.0f;
            } else if (i7 > height) {
                o40 o40Var5 = this.H;
                o40Var5.K0 = 1.0f;
                o40Var5.L0 = i7 / this.G;
            } else {
                o40 o40Var6 = this.H;
                o40Var6.K0 = height / this.F;
                o40Var6.L0 = 1.0f;
            }
            org.telegram.messenger.a8.b("InstantCamera camera scaleX = " + this.H.K0 + " scaleY = " + this.H.L0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.n != null) {
            for (int i7 = 0; i7 < 2; i7++) {
                SurfaceTexture surfaceTexture = this.n[i7];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.n[i7] = null;
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

    @Override // org.telegram.messenger.q5
    public final void handleMessage(Message message) {
        boolean z9;
        Object obj;
        boolean z10;
        g40 g40Var;
        int i7 = message.what;
        final int i10 = 1;
        final int i11 = 0;
        if (i7 != 0) {
            if (i7 == 1) {
                finish();
                if (this.D && ((!((z10 = (obj = message.obj) instanceof d40)) || ((d40) obj).c != -2) && (g40Var = this.H.h1) != null)) {
                    g40Var.i(message.arg1, z10 ? (d40) obj : null);
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            }
            if (i7 != 2) {
                if (i7 == 3) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.b("InstantCamera set gl renderer session");
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
                if (i7 != 4) {
                    return;
                }
                o40 o40Var = this.H;
                o40Var.j1 = 1 - o40Var.j1;
                if (this.H.A0) {
                    this.H.p("GL surface flip applied: surface=" + this.H.j1);
                }
                b();
                o40 o40Var2 = this.H;
                float f10 = (1.0f / o40Var2.K0) / 2.0f;
                float f11 = (1.0f / o40Var2.L0) / 2.0f;
                float f12 = 0.5f - f10;
                float f13 = 0.5f - f11;
                float f14 = f10 + 0.5f;
                float f15 = f11 + 0.5f;
                o40Var2.I0 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                this.H.I0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                return;
            }
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = this.e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.b("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.b.eglGetError()));
                    return;
                }
                return;
            }
            SurfaceTexture surfaceTexture = this.n[0];
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.H.G0);
                this.n[0].setOnFrameAvailableListener(null);
                this.n[0].release();
                o40 o40Var3 = this.H;
                int[] iArr = o40Var3.b0;
                int[] iArr2 = o40Var3.a0;
                iArr[0] = iArr2[0];
                o40Var3.c0 = 0.0f;
                iArr2[0] = 0;
                o40Var3.J0 = o40Var3.I0.duplicate();
                o40 o40Var4 = this.H;
                o40Var4.M0 = o40Var4.m0[0];
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
            this.n[0].setOnFrameAvailableListener(new qy(this, 1));
            if (this.H.A0) {
                this.H.p("GL input recreated: surface=0");
            }
            org.telegram.messenger.g0.h3(new org.telegram.ui.q8(this.H, i11, this.n[0], 11));
            b();
            o40 o40Var5 = this.H;
            float f16 = (1.0f / o40Var5.K0) / 2.0f;
            float f17 = (1.0f / o40Var5.L0) / 2.0f;
            float f18 = 0.5f - f16;
            float f19 = 0.5f - f17;
            float f20 = f16 + 0.5f;
            float f21 = f17 + 0.5f;
            o40Var5.I0 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
            this.H.I0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
            return;
        }
        int i12 = message.arg1;
        int i13 = message.arg2;
        boolean z11 = (i13 & 1) != 0;
        boolean z12 = (i13 & 2) != 0;
        if (this.f) {
            if (!this.d.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.b;
                EGLDisplay eGLDisplay2 = this.c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglMakeCurrent failed "));
                        return;
                    }
                    return;
                }
            }
            if (z11) {
                this.n[0].updateTexImage();
            }
            if (z12) {
                this.n[1].updateTexImage();
            }
            boolean z13 = this.H.A0 && this.H.j1 == this.H.z0 && ((this.H.j1 == 0 && z11) || (this.H.j1 == 1 && z12));
            if (this.D) {
                z9 = false;
            } else {
                o40 o40Var6 = this.H;
                if (o40Var6.h1 == null) {
                    o40Var6.h1 = new g40(o40Var6);
                }
                o40 o40Var7 = this.H;
                if (o40Var7.h1.F0) {
                    if (!o40Var7.J) {
                        this.H.J = true;
                        org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.z30
                            public final /* synthetic */ a40 b;

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
                                        o40 o40Var8 = this.b.H;
                                        if (o40Var8.p0 != null) {
                                            Bitmap bitmap = o40Var8.i1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                o40Var8.i1 = null;
                                            }
                                            o40Var8.i1 = o40Var8.p0.getBitmap();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    z9 = false;
                } else {
                    z9 = true;
                }
                o40 o40Var8 = this.H;
                g40 g40Var2 = o40Var8.h1;
                org.telegram.messenger.pe peVar = o40Var8.e0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (g40Var2.F0 && g40Var2.T != null && g40Var2.T.getLooper() != null && g40Var2.T.getLooper().getThread() != null && g40Var2.T.getLooper().getThread().isAlive()) {
                    g40Var2.x = eglGetCurrentContext;
                    g40Var2.T.sendMessage(g40Var2.T.obtainMessage(0, 1, 0));
                }
                g40Var2.F0 = true;
                int i14 = org.telegram.messenger.qp.s1(g40Var2.H0.e).v3;
                int i15 = org.telegram.messenger.qp.s1(g40Var2.H0.e).w3 * 1024;
                org.telegram.messenger.g0.h3(new l10(i10));
                g40Var2.a = peVar;
                g40Var2.d = i14;
                g40Var2.e = i14;
                g40Var2.f = i15;
                g40Var2.x = eglGetCurrentContext;
                synchronized (g40Var2.U) {
                    try {
                        if (!g40Var2.W) {
                            g40Var2.W = true;
                            Thread thread = new Thread(g40Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!g40Var2.V) {
                                try {
                                    g40Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            g40Var2.A0.clear();
                            g40Var2.C0 = 0;
                            org.telegram.messenger.q5 q5Var = g40Var2.B0;
                            if (q5Var != null) {
                                q5Var.cleanupQueue();
                                g40Var2.B0.recycle();
                            }
                            g40Var2.B0 = new org.telegram.messenger.q5("keyframes_thumb_queue", true);
                            g40Var2.T.sendMessage(g40Var2.T.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                int currentOrientation = obj4 instanceof CameraSession ? ((CameraSession) obj4).getCurrentOrientation() : obj4 instanceof Camera2Session ? ((Camera2Session) obj4).getCurrentOrientation() : 0;
                if (currentOrientation == 90 || currentOrientation == 270) {
                    o40 o40Var9 = this.H;
                    float f22 = o40Var9.K0;
                    o40Var9.K0 = o40Var9.L0;
                    o40Var9.L0 = f22;
                }
                this.D = true;
                this.H.v();
            }
            o40 o40Var10 = this.H;
            if (o40Var10.h1 != null && ((o40Var10.j1 == 0 && z11) || (this.H.j1 == 1 && z12))) {
                o40 o40Var11 = this.H;
                g40 g40Var3 = o40Var11.h1;
                SurfaceTexture surfaceTexture2 = this.n[o40Var11.j1];
                o40 o40Var12 = this.H;
                if (o40Var12.t0) {
                    i12 = o40Var12.j1;
                }
                g40Var3.f(surfaceTexture2, Integer.valueOf(i12), System.nanoTime());
            }
            this.n[this.H.j1].getTransformMatrix(this.H.F0);
            GLES20.glUseProgram(this.r);
            GLES20.glActiveTexture(33984);
            o40 o40Var13 = this.H;
            GLES20.glBindTexture(36197, o40Var13.a0[o40Var13.j1]);
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
            if (z13 && this.H.A0) {
                this.H.A0 = false;
                this.H.p("first target frame presented: surface=" + this.H.j1);
            }
            if (z9) {
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.z30
                    public final /* synthetic */ a40 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.b.H.q0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                break;
                            default:
                                o40 o40Var82 = this.b.H;
                                if (o40Var82.p0 != null) {
                                    Bitmap bitmap = o40Var82.i1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        o40Var82.i1 = null;
                                    }
                                    o40Var82.i1 = o40Var82.p0.getBitmap();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
    }

    public final void requestRender(boolean z9, boolean z10) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(0, this.E.intValue(), (z9 ? 1 : 0) + (z10 ? 2 : 0)), 0);
        }
    }

    @Override // org.telegram.messenger.q5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("InstantCamera start init gl");
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        z9 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.camera.q.t(this.b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.camera.q.t(this.b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.camera.q.t(this.b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (org.telegram.messenger.r2.a) {
                                org.telegram.messenger.camera.q.t(this.b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                            b();
                            o40 o40Var = this.H;
                            float f10 = o40Var.K0;
                            int[] iArr2 = o40Var.a0;
                            float f11 = (1.0f / f10) / 2.0f;
                            float f12 = (1.0f / o40Var.L0) / 2.0f;
                            float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                            float f13 = 0.5f - f11;
                            float f14 = 0.5f - f12;
                            float f15 = f11 + 0.5f;
                            float f16 = f12 + 0.5f;
                            float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                            if (o40Var.h1 == null) {
                                o40Var.h1 = new g40(o40Var);
                            }
                            FloatBuffer g10 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(48));
                            o40Var.H0 = g10;
                            g10.put(fArr).position(0);
                            FloatBuffer g11 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                            o40Var.I0 = g11;
                            g11.put(fArr2).position(0);
                            Matrix.setIdentityM(o40Var.F0, 0);
                            int k10 = o40.k(o40Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                            int k11 = o40.k(o40Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                            if (k10 == 0 || k11 == 0) {
                                if (org.telegram.messenger.r2.a) {
                                    org.telegram.messenger.a8.d("InstantCamera failed creating shader");
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
                                    if (org.telegram.messenger.r2.a) {
                                        org.telegram.messenger.a8.d("InstantCamera failed link shader");
                                    }
                                    GLES20.glDeleteProgram(this.r);
                                    this.r = 0;
                                } else {
                                    this.x = GLES20.glGetAttribLocation(this.r, "aPosition");
                                    this.y = GLES20.glGetAttribLocation(this.r, "aTextureCoord");
                                    this.s = GLES20.glGetUniformLocation(this.r, "uMVPMatrix");
                                    this.w = GLES20.glGetUniformLocation(this.r, "uSTMatrix");
                                }
                                Matrix.setIdentityM(o40Var.E0, 0);
                                GLES20.glGenTextures(2, iArr2, 0);
                                for (final int i7 = 0; i7 < 2; i7++) {
                                    GLES20.glBindTexture(36197, iArr2[i7]);
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i7]);
                                    SurfaceTexture[] surfaceTextureArr = this.n;
                                    surfaceTextureArr[i7] = surfaceTexture2;
                                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.telegram.ui.Components.y30
                                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                            a40 a40Var = a40.this;
                                            int i10 = i7;
                                            a40Var.H.V = true;
                                            a40Var.requestRender(i10 == 0, i10 == 1);
                                        }
                                    });
                                    org.telegram.messenger.g0.h3(new org.telegram.ui.q8(o40Var, i7, surfaceTextureArr[i7], 11));
                                }
                                if (org.telegram.messenger.r2.a) {
                                    org.telegram.messenger.a8.d("InstantCamera gl initied");
                                }
                                z9 = true;
                            }
                        } else {
                            if (org.telegram.messenger.r2.a) {
                                org.telegram.messenger.camera.q.t(this.b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.a8.d("InstantCamera eglConfig not initialized");
                }
                finish();
            }
        } else {
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.camera.q.t(this.b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        }
        this.f = z9;
        super.run();
    }
}
