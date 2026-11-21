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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class o40 extends org.telegram.messenger.r5 {
    public boolean E;
    public Integer F;
    public int G;
    public int H;
    public final /* synthetic */ c50 I;
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
    public o40(c50 c50Var, SurfaceTexture surfaceTexture, int i7, int i10) {
        super("CameraGLThread", true);
        this.I = c50Var;
        this.n = new SurfaceTexture[2];
        this.F = 0;
        this.a = surfaceTexture;
        this.G = i7;
        this.H = i10;
    }

    public final void a(int i7, boolean z10, int i10, int i11, long j3) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i7, 0, new r40(i10, i11, j3, 0L, z10)), 0);
        }
    }

    public final void b() {
        c50 c50Var = this.I;
        if (c50Var.n0[c50Var.k1] != null) {
            c50 c50Var2 = this.I;
            int width = c50Var2.n0[c50Var2.k1].getWidth();
            c50 c50Var3 = this.I;
            float min = this.G / Math.min(width, r1);
            int i7 = (int) (width * min);
            int height = (int) (c50Var3.n0[c50Var3.k1].getHeight() * min);
            if (i7 == height) {
                c50 c50Var4 = this.I;
                c50Var4.L0 = 1.0f;
                c50Var4.M0 = 1.0f;
            } else if (i7 > height) {
                c50 c50Var5 = this.I;
                c50Var5.L0 = 1.0f;
                c50Var5.M0 = i7 / this.H;
            } else {
                c50 c50Var6 = this.I;
                c50Var6.L0 = height / this.G;
                c50Var6.M0 = 1.0f;
            }
            org.telegram.messenger.a8.b("InstantCamera camera scaleX = " + this.I.L0 + " scaleY = " + this.I.M0);
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

    @Override // org.telegram.messenger.r5
    public final void handleMessage(Message message) {
        boolean z10;
        Object obj;
        boolean z11;
        u40 u40Var;
        int i7 = message.what;
        final int i10 = 1;
        final int i11 = 0;
        if (i7 != 0) {
            if (i7 == 1) {
                finish();
                if (this.E && ((!((z11 = (obj = message.obj) instanceof r40)) || ((r40) obj).c != -2) && (u40Var = this.I.i1) != null)) {
                    u40Var.i(message.arg1, z11 ? (r40) obj : null);
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
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.b("InstantCamera set gl renderer session");
                    }
                    Object obj2 = message.obj;
                    Object obj3 = this.h;
                    if (obj3 != obj2) {
                        this.h = obj2;
                        return;
                    }
                    int worldAngle = obj3 instanceof CameraSession ? ((CameraSession) obj3).getWorldAngle() : obj3 instanceof Camera2Session ? ((Camera2Session) obj3).getRoundVideoRotationAngle() : 0;
                    Matrix.setIdentityM(this.I.F0, 0);
                    if (worldAngle != 0) {
                        Matrix.rotateM(this.I.F0, 0, worldAngle, 0.0f, 0.0f, 1.0f);
                        return;
                    }
                    return;
                }
                if (i7 != 4) {
                    return;
                }
                c50 c50Var = this.I;
                c50Var.k1 = 1 - c50Var.k1;
                if (this.I.B0) {
                    this.I.q("GL surface flip applied: surface=" + this.I.k1);
                }
                b();
                c50 c50Var2 = this.I;
                float f10 = (1.0f / c50Var2.L0) / 2.0f;
                float f11 = (1.0f / c50Var2.M0) / 2.0f;
                float f12 = 0.5f - f10;
                float f13 = 0.5f - f11;
                float f14 = f10 + 0.5f;
                float f15 = f11 + 0.5f;
                c50Var2.J0 = org.telegram.messenger.n10.i(ByteBuffer.allocateDirect(32));
                this.I.J0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
                return;
            }
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = this.e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                if (org.telegram.messenger.s2.a) {
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
                c50 c50Var3 = this.I;
                int[] iArr = c50Var3.c0;
                int[] iArr2 = c50Var3.b0;
                iArr[0] = iArr2[0];
                c50Var3.d0 = 0.0f;
                iArr2[0] = 0;
                c50Var3.K0 = c50Var3.J0.duplicate();
                c50 c50Var4 = this.I;
                c50Var4.N0 = c50Var4.n0[0];
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
            this.n[0].setOnFrameAvailableListener(new dz(this, 1));
            if (this.I.B0) {
                this.I.q("GL input recreated: surface=0");
            }
            org.telegram.messenger.g0.g3(new org.telegram.ui.b0(this.I, i11, this.n[0], 15));
            b();
            c50 c50Var5 = this.I;
            float f16 = (1.0f / c50Var5.L0) / 2.0f;
            float f17 = (1.0f / c50Var5.M0) / 2.0f;
            float f18 = 0.5f - f16;
            float f19 = 0.5f - f17;
            float f20 = f16 + 0.5f;
            float f21 = f17 + 0.5f;
            c50Var5.J0 = org.telegram.messenger.n10.i(ByteBuffer.allocateDirect(32));
            this.I.J0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
            return;
        }
        int i12 = message.arg1;
        int i13 = message.arg2;
        boolean z12 = (i13 & 1) != 0;
        boolean z13 = (i13 & 2) != 0;
        if (this.f) {
            if (!this.d.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.b;
                EGLDisplay eGLDisplay2 = this.c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.n10.v(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                c50 c50Var6 = this.I;
                if (c50Var6.i1 == null) {
                    c50Var6.i1 = new u40(c50Var6);
                }
                c50 c50Var7 = this.I;
                if (c50Var7.i1.G0) {
                    if (!c50Var7.K) {
                        this.I.K = true;
                        org.telegram.messenger.g0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.n40
                            public final /* synthetic */ o40 b;

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
                                        c50 c50Var8 = this.b.I;
                                        if (c50Var8.q0 != null) {
                                            Bitmap bitmap = c50Var8.j1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                c50Var8.j1 = null;
                                            }
                                            c50Var8.j1 = c50Var8.q0.getBitmap();
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
                c50 c50Var8 = this.I;
                u40 u40Var2 = c50Var8.i1;
                org.telegram.messenger.ne neVar = c50Var8.f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (u40Var2.G0 && u40Var2.U != null && u40Var2.U.getLooper() != null && u40Var2.U.getLooper().getThread() != null && u40Var2.U.getLooper().getThread().isAlive()) {
                    u40Var2.x = eglGetCurrentContext;
                    u40Var2.U.sendMessage(u40Var2.U.obtainMessage(0, 1, 0));
                }
                u40Var2.G0 = true;
                int i14 = org.telegram.messenger.mp.u1(u40Var2.I0.e).y3;
                int i15 = org.telegram.messenger.mp.u1(u40Var2.I0.e).z3 * 1024;
                org.telegram.messenger.g0.g3(new me(9));
                u40Var2.a = neVar;
                u40Var2.d = i14;
                u40Var2.e = i14;
                u40Var2.f = i15;
                u40Var2.x = eglGetCurrentContext;
                synchronized (u40Var2.V) {
                    try {
                        if (!u40Var2.X) {
                            u40Var2.X = true;
                            Thread thread = new Thread(u40Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!u40Var2.W) {
                                try {
                                    u40Var2.V.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            u40Var2.B0.clear();
                            u40Var2.D0 = 0;
                            org.telegram.messenger.r5 r5Var = u40Var2.C0;
                            if (r5Var != null) {
                                r5Var.cleanupQueue();
                                u40Var2.C0.recycle();
                            }
                            u40Var2.C0 = new org.telegram.messenger.r5("keyframes_thumb_queue", true);
                            u40Var2.U.sendMessage(u40Var2.U.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                int currentOrientation = obj4 instanceof CameraSession ? ((CameraSession) obj4).getCurrentOrientation() : obj4 instanceof Camera2Session ? ((Camera2Session) obj4).getCurrentOrientation() : 0;
                if (currentOrientation == 90 || currentOrientation == 270) {
                    c50 c50Var9 = this.I;
                    float f22 = c50Var9.L0;
                    c50Var9.L0 = c50Var9.M0;
                    c50Var9.M0 = f22;
                }
                this.E = true;
                this.I.w();
            }
            c50 c50Var10 = this.I;
            if (c50Var10.i1 != null && ((c50Var10.k1 == 0 && z12) || (this.I.k1 == 1 && z13))) {
                c50 c50Var11 = this.I;
                u40 u40Var3 = c50Var11.i1;
                SurfaceTexture surfaceTexture2 = this.n[c50Var11.k1];
                c50 c50Var12 = this.I;
                if (c50Var12.u0) {
                    i12 = c50Var12.k1;
                }
                u40Var3.f(surfaceTexture2, Integer.valueOf(i12), System.nanoTime());
            }
            this.n[this.I.k1].getTransformMatrix(this.I.G0);
            GLES20.glUseProgram(this.r);
            GLES20.glActiveTexture(33984);
            c50 c50Var13 = this.I;
            GLES20.glBindTexture(36197, c50Var13.b0[c50Var13.k1]);
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
                this.I.q("first target frame presented: surface=" + this.I.k1);
            }
            if (z10) {
                org.telegram.messenger.g0.g3(new Runnable(this) { // from class: org.telegram.ui.Components.n40
                    public final /* synthetic */ o40 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.b.I.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                break;
                            default:
                                c50 c50Var82 = this.b.I;
                                if (c50Var82.q0 != null) {
                                    Bitmap bitmap = c50Var82.j1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        c50Var82.j1 = null;
                                    }
                                    c50Var82.j1 = c50Var82.q0.getBitmap();
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

    @Override // org.telegram.messenger.r5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (org.telegram.messenger.s2.a) {
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
            if (org.telegram.messenger.s2.a) {
                org.telegram.messenger.n10.v(this.b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int i7 = 15;
            if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.n10.v(this.b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.n10.v(this.b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (org.telegram.messenger.s2.a) {
                                org.telegram.messenger.n10.v(this.b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                            b();
                            c50 c50Var = this.I;
                            float f10 = c50Var.L0;
                            int[] iArr2 = c50Var.b0;
                            float f11 = (1.0f / f10) / 2.0f;
                            float f12 = (1.0f / c50Var.M0) / 2.0f;
                            float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                            float f13 = 0.5f - f11;
                            float f14 = 0.5f - f12;
                            float f15 = f11 + 0.5f;
                            float f16 = f12 + 0.5f;
                            float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                            if (c50Var.i1 == null) {
                                c50Var.i1 = new u40(c50Var);
                            }
                            FloatBuffer i10 = org.telegram.messenger.n10.i(ByteBuffer.allocateDirect(48));
                            c50Var.I0 = i10;
                            i10.put(fArr).position(0);
                            FloatBuffer i11 = org.telegram.messenger.n10.i(ByteBuffer.allocateDirect(32));
                            c50Var.J0 = i11;
                            i11.put(fArr2).position(0);
                            Matrix.setIdentityM(c50Var.G0, 0);
                            int l10 = c50.l(c50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                            int l11 = c50.l(c50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                            if (l10 == 0 || l11 == 0) {
                                if (org.telegram.messenger.s2.a) {
                                    org.telegram.messenger.a8.d("InstantCamera failed creating shader");
                                }
                                finish();
                            } else {
                                int glCreateProgram = GLES20.glCreateProgram();
                                this.r = glCreateProgram;
                                GLES20.glAttachShader(glCreateProgram, l10);
                                GLES20.glAttachShader(this.r, l11);
                                GLES20.glLinkProgram(this.r);
                                int[] iArr3 = new int[1];
                                GLES20.glGetProgramiv(this.r, 35714, iArr3, 0);
                                if (iArr3[0] == 0) {
                                    if (org.telegram.messenger.s2.a) {
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
                                Matrix.setIdentityM(c50Var.F0, 0);
                                GLES20.glGenTextures(2, iArr2, 0);
                                for (final int i12 = 0; i12 < 2; i12++) {
                                    GLES20.glBindTexture(36197, iArr2[i12]);
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i12]);
                                    SurfaceTexture[] surfaceTextureArr = this.n;
                                    surfaceTextureArr[i12] = surfaceTexture2;
                                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.telegram.ui.Components.m40
                                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                            o40 o40Var = o40.this;
                                            int i13 = i12;
                                            o40Var.I.W = true;
                                            o40Var.requestRender(i13 == 0, i13 == 1);
                                        }
                                    });
                                    org.telegram.messenger.g0.g3(new org.telegram.ui.b0(c50Var, i12, surfaceTextureArr[i12], i7));
                                }
                                if (org.telegram.messenger.s2.a) {
                                    org.telegram.messenger.a8.d("InstantCamera gl initied");
                                }
                                z10 = true;
                            }
                        } else {
                            if (org.telegram.messenger.s2.a) {
                                org.telegram.messenger.n10.v(this.b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.d("InstantCamera eglConfig not initialized");
                }
                finish();
            }
        } else {
            if (org.telegram.messenger.s2.a) {
                org.telegram.messenger.n10.v(this.b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        }
        this.f = z10;
        super.run();
    }
}
