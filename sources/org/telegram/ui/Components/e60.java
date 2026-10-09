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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraSession;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class e60 extends DispatchQueue {
    public Integer E;
    public int F;
    public int G;
    public final /* synthetic */ t60 H;
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
    public int v;
    public int w;
    public int x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e60(t60 t60Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = t60Var;
        this.n = new SurfaceTexture[2];
        this.E = 0;
        this.a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void b(long j3, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new h60(j3, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        t60 t60Var = this.H;
        if (t60Var.n0[t60Var.k1] != null) {
            t60 t60Var2 = this.H;
            int width = t60Var2.n0[t60Var2.k1].getWidth();
            t60 t60Var3 = this.H;
            float min = this.F / Math.min(width, r1);
            int i10 = (int) (width * min);
            int height = (int) (t60Var3.n0[t60Var3.k1].getHeight() * min);
            if (i10 == height) {
                t60 t60Var4 = this.H;
                t60Var4.L0 = 1.0f;
                t60Var4.M0 = 1.0f;
            } else if (i10 > height) {
                t60 t60Var5 = this.H;
                t60Var5.L0 = 1.0f;
                t60Var5.M0 = i10 / this.G;
            } else {
                t60 t60Var6 = this.H;
                t60Var6.L0 = height / this.F;
                t60Var6.M0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.L0 + " scaleY = " + this.H.M0);
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
        this.H.W = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.b0;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.b0[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.b0;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.b0[1] = Integer.MIN_VALUE;
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

    @Override // org.telegram.messenger.DispatchQueue
    public final void handleMessage(Message message) {
        boolean z10;
        Object obj;
        boolean z11;
        l60 l60Var;
        int i10 = message.what;
        int i11 = 7;
        final int i12 = 1;
        final int i13 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                finish();
                if (this.y && ((!((z11 = (obj = message.obj) instanceof h60)) || ((h60) obj).c != -2) && (l60Var = this.H.i1) != null)) {
                    l60Var.i(message.arg1, z11 ? (h60) obj : null);
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
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("InstantCamera set gl renderer session");
                    }
                    Object obj2 = message.obj;
                    Object obj3 = this.h;
                    if (obj3 != obj2) {
                        this.h = obj2;
                        return;
                    }
                    int worldAngle = obj3 instanceof CameraSession ? ((CameraSession) obj3).getWorldAngle() : obj3 instanceof Camera2Session ? ((Camera2Session) obj3).getWorldAngle() : 0;
                    Matrix.setIdentityM(this.H.F0, 0);
                    if (worldAngle != 0) {
                        Matrix.rotateM(this.H.F0, 0, worldAngle, 0.0f, 0.0f, 1.0f);
                        return;
                    }
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                t60 t60Var = this.H;
                t60Var.k1 = 1 - t60Var.k1;
                if (this.H.B0) {
                    this.H.p("GL surface flip applied: surface=" + this.H.k1);
                }
                c();
                t60 t60Var2 = this.H;
                float f7 = (1.0f / t60Var2.L0) / 2.0f;
                float f10 = (1.0f / t60Var2.M0) / 2.0f;
                float f11 = 0.5f - f7;
                float f12 = 0.5f - f10;
                float f13 = f7 + 0.5f;
                float f14 = f10 + 0.5f;
                t60Var2.J0 = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(32));
                this.H.J0.put(new float[]{f11, f12, f13, f12, f11, f14, f13, f14}).position(0);
                return;
            }
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = this.e;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d)) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera eglMakeCurrent failed " + GLUtils.getEGLErrorString(this.b.eglGetError()));
                    return;
                }
                return;
            }
            SurfaceTexture surfaceTexture = this.n[0];
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.H.H0);
                this.n[0].setOnFrameAvailableListener(null);
                this.n[0].release();
                t60 t60Var3 = this.H;
                int[] iArr = t60Var3.c0;
                int[] iArr2 = t60Var3.b0;
                iArr[0] = iArr2[0];
                t60Var3.d0 = 0.0f;
                iArr2[0] = 0;
                t60Var3.K0 = t60Var3.J0.duplicate();
                t60 t60Var4 = this.H;
                t60Var4.N0 = t60Var4.n0[0];
            }
            this.E = Integer.valueOf(this.E.intValue() + 1);
            this.H.K = false;
            GLES20.glGenTextures(1, this.H.b0, 0);
            GLES20.glBindTexture(36197, this.H.b0[0]);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.n[0] = new SurfaceTexture(this.H.b0[0]);
            this.n[0].setOnFrameAvailableListener(new k00(this, 1));
            if (this.H.B0) {
                this.H.p("GL input recreated: surface=0");
            }
            AndroidUtilities.runOnUIThread(new zk(this.H, i13, this.n[0], i11));
            c();
            t60 t60Var5 = this.H;
            float f15 = (1.0f / t60Var5.L0) / 2.0f;
            float f16 = (1.0f / t60Var5.M0) / 2.0f;
            float f17 = 0.5f - f15;
            float f18 = 0.5f - f16;
            float f19 = f15 + 0.5f;
            float f20 = f16 + 0.5f;
            t60Var5.J0 = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(32));
            this.H.J0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
            return;
        }
        int i14 = message.arg1;
        int i15 = message.arg2;
        boolean z12 = (i15 & 1) != 0;
        boolean z13 = (i15 & 2) != 0;
        if (this.f) {
            if (!this.d.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.b;
                EGLDisplay eGLDisplay2 = this.c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.bi.v(this.b, new StringBuilder("eglMakeCurrent failed "));
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
            boolean z14 = this.H.B0 && this.H.k1 == this.H.A0 && ((this.H.k1 == 0 && z12) || (this.H.k1 == 1 && z13));
            if (this.y) {
                z10 = false;
            } else {
                t60 t60Var6 = this.H;
                if (t60Var6.i1 == null) {
                    t60Var6.i1 = new l60(t60Var6);
                }
                t60 t60Var7 = this.H;
                if (t60Var7.i1.F0) {
                    if (!t60Var7.K) {
                        this.H.K = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.d60
                            public final /* synthetic */ e60 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        this.b.H.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        break;
                                    default:
                                        t60 t60Var8 = this.b.H;
                                        if (t60Var8.q0 != null) {
                                            Bitmap bitmap = t60Var8.j1;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                t60Var8.j1 = null;
                                            }
                                            t60Var8.j1 = t60Var8.q0.getBitmap();
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
                t60 t60Var8 = this.H;
                l60 l60Var2 = t60Var8.i1;
                a60 a60Var = t60Var8.f0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (l60Var2.F0 && l60Var2.T != null && l60Var2.T.getLooper() != null && l60Var2.T.getLooper().getThread() != null && l60Var2.T.getLooper().getThread().isAlive()) {
                    l60Var2.w = eglGetCurrentContext;
                    l60Var2.T.sendMessage(l60Var2.T.obtainMessage(0, 1, 0));
                }
                l60Var2.F0 = true;
                int i16 = MessagesController.getInstance(l60Var2.H0.f).roundVideoSize;
                int i17 = MessagesController.getInstance(l60Var2.H0.f).roundVideoBitrate * 1024;
                AndroidUtilities.runOnUIThread(new vh(i11));
                l60Var2.a = a60Var;
                l60Var2.d = i16;
                l60Var2.e = i16;
                l60Var2.f = i17;
                l60Var2.w = eglGetCurrentContext;
                synchronized (l60Var2.U) {
                    try {
                        if (!l60Var2.W) {
                            l60Var2.W = true;
                            Thread thread = new Thread(l60Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!l60Var2.V) {
                                try {
                                    l60Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            l60Var2.A0.clear();
                            l60Var2.C0 = 0;
                            DispatchQueue dispatchQueue = l60Var2.B0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                l60Var2.B0.recycle();
                            }
                            l60Var2.B0 = new DispatchQueue("keyframes_thumb_queue");
                            l60Var2.T.sendMessage(l60Var2.T.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                int currentOrientation = obj4 instanceof CameraSession ? ((CameraSession) obj4).getCurrentOrientation() : obj4 instanceof Camera2Session ? ((Camera2Session) obj4).getCurrentOrientation() : 0;
                if (currentOrientation == 90 || currentOrientation == 270) {
                    t60 t60Var9 = this.H;
                    float f21 = t60Var9.L0;
                    t60Var9.L0 = t60Var9.M0;
                    t60Var9.M0 = f21;
                }
                this.y = true;
                this.H.v();
            }
            t60 t60Var10 = this.H;
            if (t60Var10.i1 != null && ((t60Var10.k1 == 0 && z12) || (this.H.k1 == 1 && z13))) {
                t60 t60Var11 = this.H;
                l60 l60Var3 = t60Var11.i1;
                SurfaceTexture surfaceTexture2 = this.n[t60Var11.k1];
                t60 t60Var12 = this.H;
                if (t60Var12.u0) {
                    i14 = t60Var12.k1;
                }
                l60Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.n[this.H.k1].getTransformMatrix(this.H.G0);
            GLES20.glUseProgram(this.r);
            GLES20.glActiveTexture(33984);
            t60 t60Var13 = this.H;
            GLES20.glBindTexture(36197, t60Var13.b0[t60Var13.k1]);
            GLES20.glVertexAttribPointer(this.w, 3, 5126, false, 12, (Buffer) this.H.I0);
            GLES20.glEnableVertexAttribArray(this.w);
            GLES20.glVertexAttribPointer(this.x, 2, 5126, false, 8, (Buffer) this.H.J0);
            GLES20.glEnableVertexAttribArray(this.x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.G0, 0);
            GLES20.glUniformMatrix4fv(this.s, 1, false, this.H.F0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.w);
            GLES20.glDisableVertexAttribArray(this.x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.b.eglSwapBuffers(this.c, this.e);
            if (z14 && this.H.B0) {
                this.H.B0 = false;
                this.H.p("first target frame presented: surface=" + this.H.k1);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.d60
                    public final /* synthetic */ e60 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.b.H.r0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                break;
                            default:
                                t60 t60Var82 = this.b.H;
                                if (t60Var82.q0 != null) {
                                    Bitmap bitmap = t60Var82.j1;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        t60Var82.j1 = null;
                                    }
                                    t60Var82.j1 = t60Var82.q0.getBitmap();
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

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("InstantCamera start init gl");
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
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.bi.v(this.b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.bi.v(this.b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.bi.v(this.b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.bi.v(this.b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                            c();
                            t60 t60Var = this.H;
                            float f7 = t60Var.L0;
                            int[] iArr2 = t60Var.b0;
                            float f10 = (1.0f / f7) / 2.0f;
                            float f11 = (1.0f / t60Var.M0) / 2.0f;
                            float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                            float f12 = 0.5f - f10;
                            float f13 = 0.5f - f11;
                            float f14 = f10 + 0.5f;
                            float f15 = f11 + 0.5f;
                            int i10 = 7;
                            float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                            if (t60Var.i1 == null) {
                                t60Var.i1 = new l60(t60Var);
                            }
                            FloatBuffer h = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(48));
                            t60Var.I0 = h;
                            h.put(fArr).position(0);
                            FloatBuffer h10 = org.telegram.messenger.bi.h(ByteBuffer.allocateDirect(32));
                            t60Var.J0 = h10;
                            h10.put(fArr2).position(0);
                            Matrix.setIdentityM(t60Var.G0, 0);
                            int j3 = t60.j(t60Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                            int j10 = t60.j(t60Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                            if (j3 == 0 || j10 == 0) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("InstantCamera failed creating shader");
                                }
                                finish();
                            } else {
                                int glCreateProgram = GLES20.glCreateProgram();
                                this.r = glCreateProgram;
                                GLES20.glAttachShader(glCreateProgram, j3);
                                GLES20.glAttachShader(this.r, j10);
                                GLES20.glLinkProgram(this.r);
                                int[] iArr3 = new int[1];
                                GLES20.glGetProgramiv(this.r, 35714, iArr3, 0);
                                if (iArr3[0] == 0) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.e("InstantCamera failed link shader");
                                    }
                                    GLES20.glDeleteProgram(this.r);
                                    this.r = 0;
                                } else {
                                    this.w = GLES20.glGetAttribLocation(this.r, "aPosition");
                                    this.x = GLES20.glGetAttribLocation(this.r, "aTextureCoord");
                                    this.s = GLES20.glGetUniformLocation(this.r, "uMVPMatrix");
                                    this.v = GLES20.glGetUniformLocation(this.r, "uSTMatrix");
                                }
                                Matrix.setIdentityM(t60Var.F0, 0);
                                GLES20.glGenTextures(2, iArr2, 0);
                                for (final int i11 = 0; i11 < 2; i11++) {
                                    GLES20.glBindTexture(36197, iArr2[i11]);
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    SurfaceTexture surfaceTexture2 = new SurfaceTexture(iArr2[i11]);
                                    SurfaceTexture[] surfaceTextureArr = this.n;
                                    surfaceTextureArr[i11] = surfaceTexture2;
                                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.telegram.ui.Components.c60
                                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                            e60 e60Var = e60.this;
                                            int i12 = i11;
                                            e60Var.H.W = true;
                                            e60Var.requestRender(i12 == 0, i12 == 1);
                                        }
                                    });
                                    AndroidUtilities.runOnUIThread(new zk(t60Var, i11, surfaceTextureArr[i11], i10));
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("InstantCamera gl initied");
                                }
                                z10 = true;
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.bi.v(this.b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
                            }
                            finish();
                        }
                    } else {
                        finish();
                    }
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("InstantCamera eglConfig not initialized");
                }
                finish();
            }
        } else {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.bi.v(this.b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        }
        this.f = z10;
        super.run();
    }
}
