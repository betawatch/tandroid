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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w30 extends org.telegram.messenger.q5 {
    public boolean E;
    public Integer F;
    public int G;
    public int H;
    public final /* synthetic */ k40 I;
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
    public w30(k40 k40Var, SurfaceTexture surfaceTexture, int i3, int i10) {
        super("CameraGLThread", true);
        this.I = k40Var;
        this.n = new SurfaceTexture[2];
        this.F = 0;
        this.a = surfaceTexture;
        this.G = i3;
        this.H = i10;
    }

    public final void a(int i3, boolean z10, int i10, int i11, long j10) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i3, 0, new z30(i10, i11, j10, 0L, z10)), 0);
        }
    }

    public final void b() {
        k40 k40Var = this.I;
        if (k40Var.n0[k40Var.k1] != null) {
            k40 k40Var2 = this.I;
            int width = k40Var2.n0[k40Var2.k1].getWidth();
            k40 k40Var3 = this.I;
            float min = this.G / Math.min(width, r1);
            int i3 = (int) (width * min);
            int height = (int) (k40Var3.n0[k40Var3.k1].getHeight() * min);
            if (i3 == height) {
                k40 k40Var4 = this.I;
                k40Var4.L0 = 1.0f;
                k40Var4.M0 = 1.0f;
            } else if (i3 > height) {
                k40 k40Var5 = this.I;
                k40Var5.L0 = 1.0f;
                k40Var5.M0 = i3 / this.H;
            } else {
                k40 k40Var6 = this.I;
                k40Var6.L0 = height / this.G;
                k40Var6.M0 = 1.0f;
            }
            org.telegram.messenger.a8.b("InstantCamera camera scaleX = " + this.I.L0 + " scaleY = " + this.I.M0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.n != null) {
            for (int i3 = 0; i3 < 2; i3++) {
                SurfaceTexture surfaceTexture = this.n[i3];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.n[i3] = null;
                }
            }
        }
        this.I.W = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.I.b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.I.b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.I.b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.I.b0[1] = Integer.MIN_VALUE;
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
        boolean z10;
        Object obj;
        boolean z11;
        c40 c40Var;
        int i3 = message.what;
        int i10 = 5;
        final int i11 = 1;
        final int i12 = 0;
        if (i3 != 0) {
            if (i3 == 1) {
                finish();
                if (this.E && ((!((z11 = (obj = message.obj) instanceof z30)) || ((z30) obj).c != -2) && (c40Var = this.I.i1) != null)) {
                    c40Var.i(message.arg1, z11 ? (z30) obj : null);
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            }
            if (i3 != 2) {
                if (i3 == 3) {
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
                    Matrix.setIdentityM(this.I.F0, 0);
                    if (worldAngle != 0) {
                        Matrix.rotateM(this.I.F0, 0, worldAngle, 0.0f, 0.0f, 1.0f);
                        return;
                    }
                    return;
                }
                if (i3 != 4) {
                    return;
                }
                k40 k40Var = this.I;
                k40Var.k1 = 1 - k40Var.k1;
                if (this.I.B0) {
                    this.I.p("GL surface flip applied: surface=" + this.I.k1);
                }
                b();
                k40 k40Var2 = this.I;
                float f10 = (1.0f / k40Var2.L0) / 2.0f;
                float f11 = (1.0f / k40Var2.M0) / 2.0f;
                float f12 = 0.5f - f10;
                float f13 = 0.5f - f11;
                float f14 = f10 + 0.5f;
                float f15 = f11 + 0.5f;
                k40Var2.J0 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                this.I.J0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
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
                surfaceTexture.getTransformMatrix(this.I.H0);
                this.n[0].setOnFrameAvailableListener(null);
                this.n[0].release();
                k40 k40Var3 = this.I;
                int[] iArr = k40Var3.c0;
                int[] iArr2 = k40Var3.b0;
                iArr[0] = iArr2[0];
                k40Var3.d0 = 0.0f;
                iArr2[0] = 0;
                k40Var3.K0 = k40Var3.J0.duplicate();
                k40 k40Var4 = this.I;
                k40Var4.N0 = k40Var4.n0[0];
            }
            this.F = Integer.valueOf(this.F.intValue() + 1);
            this.I.K = false;
            GLES20.glGenTextures(1, this.I.b0, 0);
            GLES20.glBindTexture(36197, this.I.b0[0]);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.n[0] = new SurfaceTexture(this.I.b0[0]);
            this.n[0].setOnFrameAvailableListener(new oy(this, 1));
            if (this.I.B0) {
                this.I.p("GL input recreated: surface=0");
            }
            org.telegram.messenger.g0.h3(new org.telegram.ui.f4(this.I, i12, this.n[0], 12));
            b();
            k40 k40Var5 = this.I;
            float f16 = (1.0f / k40Var5.L0) / 2.0f;
            float f17 = (1.0f / k40Var5.M0) / 2.0f;
            float f18 = 0.5f - f16;
            float f19 = 0.5f - f17;
            float f20 = f16 + 0.5f;
            float f21 = f17 + 0.5f;
            k40Var5.J0 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
            this.I.J0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
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
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglMakeCurrent failed "));
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
            boolean z14 = this.I.B0 && this.I.k1 == this.I.A0 && ((this.I.k1 == 0 && z12) || (this.I.k1 == 1 && z13));
            if (this.E) {
                z10 = false;
            } else {
                k40 k40Var6 = this.I;
                if (k40Var6.i1 == null) {
                    k40Var6.i1 = new c40(k40Var6);
                }
                k40 k40Var7 = this.I;
                if (k40Var7.i1.G0) {
                    if (!k40Var7.K) {
                        this.I.K = true;
                        org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.v30
                            public final /* synthetic */ w30 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        this.b.I.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        break;
                                    default:
                                        k40 k40Var8 = this.b.I;
                                        if (k40Var8.q0 != null) {
                                            Bitmap bitmap = k40Var8.j1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                k40Var8.j1 = null;
                                            }
                                            k40Var8.j1 = k40Var8.q0.getBitmap();
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
                k40 k40Var8 = this.I;
                c40 c40Var2 = k40Var8.i1;
                org.telegram.messenger.je jeVar = k40Var8.f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (c40Var2.G0 && c40Var2.U != null && c40Var2.U.getLooper() != null && c40Var2.U.getLooper().getThread() != null && c40Var2.U.getLooper().getThread().isAlive()) {
                    c40Var2.x = eglGetCurrentContext;
                    c40Var2.U.sendMessage(c40Var2.U.obtainMessage(0, 1, 0));
                }
                c40Var2.G0 = true;
                int i15 = org.telegram.messenger.hp.s1(c40Var2.I0.e).w3;
                int i16 = org.telegram.messenger.hp.s1(c40Var2.I0.e).x3 * 1024;
                org.telegram.messenger.g0.h3(new go(i10));
                c40Var2.a = jeVar;
                c40Var2.d = i15;
                c40Var2.e = i15;
                c40Var2.f = i16;
                c40Var2.x = eglGetCurrentContext;
                synchronized (c40Var2.V) {
                    try {
                        if (!c40Var2.X) {
                            c40Var2.X = true;
                            Thread thread = new Thread(c40Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!c40Var2.W) {
                                try {
                                    c40Var2.V.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            c40Var2.B0.clear();
                            c40Var2.D0 = 0;
                            org.telegram.messenger.q5 q5Var = c40Var2.C0;
                            if (q5Var != null) {
                                q5Var.cleanupQueue();
                                c40Var2.C0.recycle();
                            }
                            c40Var2.C0 = new org.telegram.messenger.q5("keyframes_thumb_queue", true);
                            c40Var2.U.sendMessage(c40Var2.U.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                int currentOrientation = obj4 instanceof CameraSession ? ((CameraSession) obj4).getCurrentOrientation() : obj4 instanceof Camera2Session ? ((Camera2Session) obj4).getCurrentOrientation() : 0;
                if (currentOrientation == 90 || currentOrientation == 270) {
                    k40 k40Var9 = this.I;
                    float f22 = k40Var9.L0;
                    k40Var9.L0 = k40Var9.M0;
                    k40Var9.M0 = f22;
                }
                this.E = true;
                this.I.v();
            }
            k40 k40Var10 = this.I;
            if (k40Var10.i1 != null && ((k40Var10.k1 == 0 && z12) || (this.I.k1 == 1 && z13))) {
                k40 k40Var11 = this.I;
                c40 c40Var3 = k40Var11.i1;
                SurfaceTexture surfaceTexture2 = this.n[k40Var11.k1];
                k40 k40Var12 = this.I;
                if (k40Var12.u0) {
                    i13 = k40Var12.k1;
                }
                c40Var3.f(surfaceTexture2, Integer.valueOf(i13), System.nanoTime());
            }
            this.n[this.I.k1].getTransformMatrix(this.I.G0);
            GLES20.glUseProgram(this.r);
            GLES20.glActiveTexture(33984);
            k40 k40Var13 = this.I;
            GLES20.glBindTexture(36197, k40Var13.b0[k40Var13.k1]);
            GLES20.glVertexAttribPointer(this.x, 3, 5126, false, 12, (Buffer) this.I.I0);
            GLES20.glEnableVertexAttribArray(this.x);
            GLES20.glVertexAttribPointer(this.y, 2, 5126, false, 8, (Buffer) this.I.J0);
            GLES20.glEnableVertexAttribArray(this.y);
            GLES20.glUniformMatrix4fv(this.w, 1, false, this.I.G0, 0);
            GLES20.glUniformMatrix4fv(this.s, 1, false, this.I.F0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.x);
            GLES20.glDisableVertexAttribArray(this.y);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.b.eglSwapBuffers(this.c, this.e);
            if (z14 && this.I.B0) {
                this.I.B0 = false;
                this.I.p("first target frame presented: surface=" + this.I.k1);
            }
            if (z10) {
                org.telegram.messenger.g0.h3(new Runnable(this) { // from class: org.telegram.ui.Components.v30
                    public final /* synthetic */ w30 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.I.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                break;
                            default:
                                k40 k40Var82 = this.b.I;
                                if (k40Var82.q0 != null) {
                                    Bitmap bitmap = k40Var82.j1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        k40Var82.j1 = null;
                                    }
                                    k40Var82.j1 = k40Var82.q0.getBitmap();
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
            sendMessage(handler.obtainMessage(0, this.F.intValue(), (z10 ? 1 : 0) + (z11 ? 2 : 0)), 0);
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
                            k40 k40Var = this.I;
                            float f10 = k40Var.L0;
                            int[] iArr2 = k40Var.b0;
                            float f11 = (1.0f / f10) / 2.0f;
                            float f12 = (1.0f / k40Var.M0) / 2.0f;
                            int i3 = 12;
                            float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                            float f13 = 0.5f - f11;
                            float f14 = 0.5f - f12;
                            float f15 = f11 + 0.5f;
                            float f16 = f12 + 0.5f;
                            float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                            if (k40Var.i1 == null) {
                                k40Var.i1 = new c40(k40Var);
                            }
                            FloatBuffer g7 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(48));
                            k40Var.I0 = g7;
                            g7.put(fArr).position(0);
                            FloatBuffer g10 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(32));
                            k40Var.J0 = g10;
                            g10.put(fArr2).position(0);
                            Matrix.setIdentityM(k40Var.G0, 0);
                            int k10 = k40.k(k40Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                            int k11 = k40.k(k40Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
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
                                Matrix.setIdentityM(k40Var.F0, 0);
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
                                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.telegram.ui.Components.u30
                                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                            w30 w30Var = w30.this;
                                            int i11 = i10;
                                            w30Var.I.W = true;
                                            w30Var.requestRender(i11 == 0, i11 == 1);
                                        }
                                    });
                                    org.telegram.messenger.g0.h3(new org.telegram.ui.f4(k40Var, i10, surfaceTextureArr[i10], i3));
                                }
                                if (org.telegram.messenger.r2.a) {
                                    org.telegram.messenger.a8.d("InstantCamera gl initied");
                                }
                                z10 = true;
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
        this.f = z10;
        super.run();
    }
}
