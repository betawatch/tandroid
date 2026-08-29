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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k50 extends DispatchQueue {
    public Integer A;
    public int B;
    public int C;
    public final /* synthetic */ s50 D;
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
    public k50(s50 s50Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.D = s50Var;
        this.n = new SurfaceTexture[2];
        this.A = 0;
        this.a = surfaceTexture;
        this.B = i10;
        this.C = i11;
    }

    public final void b(long j10, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new n50(j10, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        s50 s50Var = this.D;
        if (s50Var.e0[s50Var.W0] != null) {
            s50 s50Var2 = this.D;
            int width = s50Var2.e0[s50Var2.W0].getWidth();
            s50 s50Var3 = this.D;
            float min = this.B / Math.min(width, r1);
            int i10 = (int) (width * min);
            int height = (int) (s50Var3.e0[s50Var3.W0].getHeight() * min);
            if (i10 == height) {
                s50 s50Var4 = this.D;
                s50Var4.x0 = 1.0f;
                s50Var4.y0 = 1.0f;
            } else if (i10 > height) {
                s50 s50Var5 = this.D;
                s50Var5.x0 = 1.0f;
                s50Var5.y0 = i10 / this.C;
            } else {
                s50 s50Var6 = this.D;
                s50Var6.x0 = height / this.B;
                s50Var6.y0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.D.x0 + " scaleY = " + this.D.y0);
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
        this.D.N = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.D.P;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.D.P[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.D.P;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.D.P[1] = Integer.MIN_VALUE;
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
        r50 r50Var;
        int i10 = message.what;
        final int i11 = 1;
        final int i12 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                finish();
                if (this.y && ((!((z11 = (obj = message.obj) instanceof n50)) || ((n50) obj).c != -2) && (r50Var = this.D.U0) != null)) {
                    r50Var.i(message.arg1, z11 ? (n50) obj : null);
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            }
            int i13 = 6;
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
                    Matrix.setIdentityM(this.D.r0, 0);
                    if (worldAngle != 0) {
                        Matrix.rotateM(this.D.r0, 0, worldAngle, 0.0f, 0.0f, 1.0f);
                        return;
                    }
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                s50 s50Var = this.D;
                s50Var.W0 = 1 - s50Var.W0;
                c();
                s50 s50Var2 = this.D;
                float f9 = (1.0f / s50Var2.x0) / 2.0f;
                float f10 = (1.0f / s50Var2.y0) / 2.0f;
                float f11 = 0.5f - f9;
                float f12 = 0.5f - f10;
                float f13 = f9 + 0.5f;
                float f14 = f10 + 0.5f;
                s50Var2.v0 = org.telegram.messenger.x3.l(ByteBuffer.allocateDirect(32));
                this.D.v0.put(new float[]{f11, f12, f13, f12, f11, f14, f13, f14}).position(0);
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
                surfaceTexture.getTransformMatrix(this.D.t0);
                this.n[0].setOnFrameAvailableListener(null);
                this.n[0].release();
                s50 s50Var3 = this.D;
                int[] iArr = s50Var3.Q;
                int[] iArr2 = s50Var3.P;
                iArr[0] = iArr2[0];
                s50Var3.R = 0.0f;
                iArr2[0] = 0;
                s50Var3.w0 = s50Var3.v0.duplicate();
                s50 s50Var4 = this.D;
                s50Var4.z0 = s50Var4.e0[0];
            }
            this.A = Integer.valueOf(this.A.intValue() + 1);
            this.D.B = false;
            GLES20.glGenTextures(1, this.D.P, 0);
            GLES20.glBindTexture(36197, this.D.P[0]);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.n[0] = new SurfaceTexture(this.D.P[0]);
            this.n[0].setOnFrameAvailableListener(new pz(this, 1));
            AndroidUtilities.runOnUIThread(new rm(this.D, i12, this.n[0], i13));
            c();
            s50 s50Var5 = this.D;
            float f15 = (1.0f / s50Var5.x0) / 2.0f;
            float f16 = (1.0f / s50Var5.y0) / 2.0f;
            float f17 = 0.5f - f15;
            float f18 = 0.5f - f16;
            float f19 = f15 + 0.5f;
            float f20 = f16 + 0.5f;
            s50Var5.v0 = org.telegram.messenger.x3.l(ByteBuffer.allocateDirect(32));
            this.D.v0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
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
                        org.telegram.messenger.x3.u(this.b, new StringBuilder("eglMakeCurrent failed "));
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
            if (this.y) {
                z10 = false;
            } else {
                s50 s50Var6 = this.D;
                if (s50Var6.U0 == null) {
                    s50Var6.U0 = new r50(s50Var6);
                }
                s50 s50Var7 = this.D;
                if (s50Var7.U0.B0) {
                    if (!s50Var7.B) {
                        this.D.B = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.j50
                            public final /* synthetic */ k50 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        this.b.D.i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        break;
                                    default:
                                        s50 s50Var8 = this.b.D;
                                        if (s50Var8.h0 != null) {
                                            Bitmap bitmap = s50Var8.V0;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                s50Var8.V0 = null;
                                            }
                                            s50Var8.V0 = s50Var8.h0.getBitmap();
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
                s50 s50Var8 = this.D;
                r50 r50Var2 = s50Var8.U0;
                g50 g50Var = s50Var8.T;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (r50Var2.B0 && r50Var2.P != null && r50Var2.P.getLooper() != null && r50Var2.P.getLooper().getThread() != null && r50Var2.P.getLooper().getThread().isAlive()) {
                    r50Var2.w = eglGetCurrentContext;
                    r50Var2.P.sendMessage(r50Var2.P.obtainMessage(0, 1, 0));
                }
                r50Var2.B0 = true;
                int i16 = MessagesController.getInstance(r50Var2.D0.a).roundVideoSize;
                int i17 = MessagesController.getInstance(r50Var2.D0.a).roundVideoBitrate * 1024;
                AndroidUtilities.runOnUIThread(new o50(r50Var2, i11));
                r50Var2.a = g50Var;
                r50Var2.d = i16;
                r50Var2.e = i16;
                r50Var2.f = i17;
                r50Var2.w = eglGetCurrentContext;
                synchronized (r50Var2.Q) {
                    try {
                        if (!r50Var2.S) {
                            r50Var2.S = true;
                            Thread thread = new Thread(r50Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!r50Var2.R) {
                                try {
                                    r50Var2.Q.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            r50Var2.w0.clear();
                            r50Var2.y0 = 0;
                            DispatchQueue dispatchQueue = r50Var2.x0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                r50Var2.x0.recycle();
                            }
                            r50Var2.x0 = new DispatchQueue("keyframes_thumb_queue");
                            r50Var2.P.sendMessage(r50Var2.P.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                int currentOrientation = obj4 instanceof CameraSession ? ((CameraSession) obj4).getCurrentOrientation() : obj4 instanceof Camera2Session ? ((Camera2Session) obj4).getCurrentOrientation() : 0;
                if (currentOrientation == 90 || currentOrientation == 270) {
                    s50 s50Var9 = this.D;
                    float f21 = s50Var9.x0;
                    s50Var9.x0 = s50Var9.y0;
                    s50Var9.y0 = f21;
                }
                this.y = true;
                this.D.r();
            }
            s50 s50Var10 = this.D;
            if (s50Var10.U0 != null && ((s50Var10.W0 == 0 && z12) || (this.D.W0 == 1 && z13))) {
                s50 s50Var11 = this.D;
                r50 r50Var3 = s50Var11.U0;
                SurfaceTexture surfaceTexture2 = this.n[s50Var11.W0];
                s50 s50Var12 = this.D;
                if (s50Var12.l0) {
                    i14 = s50Var12.W0;
                }
                r50Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.n[this.D.W0].getTransformMatrix(this.D.s0);
            GLES20.glUseProgram(this.r);
            GLES20.glActiveTexture(33984);
            s50 s50Var13 = this.D;
            GLES20.glBindTexture(36197, s50Var13.P[s50Var13.W0]);
            GLES20.glVertexAttribPointer(this.w, 3, 5126, false, 12, (Buffer) this.D.u0);
            GLES20.glEnableVertexAttribArray(this.w);
            GLES20.glVertexAttribPointer(this.x, 2, 5126, false, 8, (Buffer) this.D.v0);
            GLES20.glEnableVertexAttribArray(this.x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.D.s0, 0);
            GLES20.glUniformMatrix4fv(this.s, 1, false, this.D.r0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.w);
            GLES20.glDisableVertexAttribArray(this.x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.b.eglSwapBuffers(this.c, this.e);
            if (z10) {
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.j50
                    public final /* synthetic */ k50 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.D.i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                break;
                            default:
                                s50 s50Var82 = this.b.D;
                                if (s50Var82.h0 != null) {
                                    Bitmap bitmap = s50Var82.V0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        s50Var82.V0 = null;
                                    }
                                    s50Var82.V0 = s50Var82.h0.getBitmap();
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
            sendMessage(handler.obtainMessage(0, this.A.intValue(), (z10 ? 1 : 0) + (z11 ? 2 : 0)), 0);
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
                org.telegram.messenger.x3.u(this.b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.x3.u(this.b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.x3.u(this.b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.x3.u(this.b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                            c();
                            s50 s50Var = this.D;
                            float f9 = s50Var.x0;
                            int[] iArr2 = s50Var.P;
                            float f10 = (1.0f / f9) / 2.0f;
                            float f11 = (1.0f / s50Var.y0) / 2.0f;
                            float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                            float f12 = 0.5f - f10;
                            float f13 = 0.5f - f11;
                            float f14 = f10 + 0.5f;
                            float f15 = f11 + 0.5f;
                            int i10 = 6;
                            float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                            if (s50Var.U0 == null) {
                                s50Var.U0 = new r50(s50Var);
                            }
                            FloatBuffer l10 = org.telegram.messenger.x3.l(ByteBuffer.allocateDirect(48));
                            s50Var.u0 = l10;
                            l10.put(fArr).position(0);
                            FloatBuffer l11 = org.telegram.messenger.x3.l(ByteBuffer.allocateDirect(32));
                            s50Var.v0 = l11;
                            l11.put(fArr2).position(0);
                            Matrix.setIdentityM(s50Var.s0, 0);
                            int a2 = s50.a(s50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                            int a10 = s50.a(s50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                            if (a2 == 0 || a10 == 0) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("InstantCamera failed creating shader");
                                }
                                finish();
                            } else {
                                int glCreateProgram = GLES20.glCreateProgram();
                                this.r = glCreateProgram;
                                GLES20.glAttachShader(glCreateProgram, a2);
                                GLES20.glAttachShader(this.r, a10);
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
                                Matrix.setIdentityM(s50Var.r0, 0);
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
                                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.telegram.ui.Components.i50
                                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                            k50 k50Var = k50.this;
                                            int i12 = i11;
                                            k50Var.D.N = true;
                                            k50Var.requestRender(i12 == 0, i12 == 1);
                                        }
                                    });
                                    AndroidUtilities.runOnUIThread(new rm(s50Var, i11, surfaceTextureArr[i11], i10));
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("InstantCamera gl initied");
                                }
                                z10 = true;
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.x3.u(this.b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
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
                org.telegram.messenger.x3.u(this.b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        }
        this.f = z10;
        super.run();
    }
}
