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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class r50 extends DispatchQueue {
    public Integer B;
    public int C;
    public int D;
    public final /* synthetic */ z50 E;
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
    public r50(z50 z50Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.E = z50Var;
        this.n = new SurfaceTexture[2];
        this.B = 0;
        this.a = surfaceTexture;
        this.C = i10;
        this.D = i11;
    }

    public final void b(long j10, int i10, boolean z4, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new u50(j10, i11, i12, z4, 0L)), 0);
        }
    }

    public final void c() {
        z50 z50Var = this.E;
        if (z50Var.f0[z50Var.X0] != null) {
            z50 z50Var2 = this.E;
            int width = z50Var2.f0[z50Var2.X0].getWidth();
            z50 z50Var3 = this.E;
            float min = this.C / Math.min(width, r1);
            int i10 = (int) (width * min);
            int height = (int) (z50Var3.f0[z50Var3.X0].getHeight() * min);
            if (i10 == height) {
                z50 z50Var4 = this.E;
                z50Var4.y0 = 1.0f;
                z50Var4.z0 = 1.0f;
            } else if (i10 > height) {
                z50 z50Var5 = this.E;
                z50Var5.y0 = 1.0f;
                z50Var5.z0 = i10 / this.D;
            } else {
                z50 z50Var6 = this.E;
                z50Var6.y0 = height / this.C;
                z50Var6.z0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.E.y0 + " scaleY = " + this.E.z0);
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
        this.E.O = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.E.Q;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.E.Q[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.E.Q;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.E.Q[1] = Integer.MIN_VALUE;
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
        boolean z4;
        Object obj;
        boolean z10;
        y50 y50Var;
        int i10 = message.what;
        int i11 = 4;
        final int i12 = 1;
        final int i13 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                finish();
                if (this.y && ((!((z10 = (obj = message.obj) instanceof u50)) || ((u50) obj).c != -2) && (y50Var = this.E.V0) != null)) {
                    y50Var.i(message.arg1, z10 ? (u50) obj : null);
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
                    Matrix.setIdentityM(this.E.s0, 0);
                    if (worldAngle != 0) {
                        Matrix.rotateM(this.E.s0, 0, worldAngle, 0.0f, 0.0f, 1.0f);
                        return;
                    }
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                z50 z50Var = this.E;
                z50Var.X0 = 1 - z50Var.X0;
                c();
                z50 z50Var2 = this.E;
                float f10 = (1.0f / z50Var2.y0) / 2.0f;
                float f11 = (1.0f / z50Var2.z0) / 2.0f;
                float f12 = 0.5f - f10;
                float f13 = 0.5f - f11;
                float f14 = f10 + 0.5f;
                float f15 = f11 + 0.5f;
                z50Var2.w0 = org.telegram.messenger.y3.k(ByteBuffer.allocateDirect(32));
                this.E.w0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
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
                surfaceTexture.getTransformMatrix(this.E.u0);
                this.n[0].setOnFrameAvailableListener(null);
                this.n[0].release();
                z50 z50Var3 = this.E;
                int[] iArr = z50Var3.R;
                int[] iArr2 = z50Var3.Q;
                iArr[0] = iArr2[0];
                z50Var3.S = 0.0f;
                iArr2[0] = 0;
                z50Var3.x0 = z50Var3.w0.duplicate();
                z50 z50Var4 = this.E;
                z50Var4.A0 = z50Var4.f0[0];
            }
            this.B = Integer.valueOf(this.B.intValue() + 1);
            this.E.C = false;
            GLES20.glGenTextures(1, this.E.Q, 0);
            GLES20.glBindTexture(36197, this.E.Q[0]);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.n[0] = new SurfaceTexture(this.E.Q[0]);
            this.n[0].setOnFrameAvailableListener(new wz(this, 1));
            AndroidUtilities.runOnUIThread(new gy(this.E, i13, this.n[0], i11));
            c();
            z50 z50Var5 = this.E;
            float f16 = (1.0f / z50Var5.y0) / 2.0f;
            float f17 = (1.0f / z50Var5.z0) / 2.0f;
            float f18 = 0.5f - f16;
            float f19 = 0.5f - f17;
            float f20 = f16 + 0.5f;
            float f21 = f17 + 0.5f;
            z50Var5.w0 = org.telegram.messenger.y3.k(ByteBuffer.allocateDirect(32));
            this.E.w0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
            return;
        }
        int i14 = message.arg1;
        int i15 = message.arg2;
        boolean z11 = (i15 & 1) != 0;
        boolean z12 = (i15 & 2) != 0;
        if (this.f) {
            if (!this.d.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                EGL10 egl102 = this.b;
                EGLDisplay eGLDisplay2 = this.c;
                EGLSurface eGLSurface2 = this.e;
                if (!egl102.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.d)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.y3.u(this.b, new StringBuilder("eglMakeCurrent failed "));
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
            if (this.y) {
                z4 = false;
            } else {
                z50 z50Var6 = this.E;
                if (z50Var6.V0 == null) {
                    z50Var6.V0 = new y50(z50Var6);
                }
                z50 z50Var7 = this.E;
                if (z50Var7.V0.C0) {
                    if (!z50Var7.C) {
                        this.E.C = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.q50
                            public final /* synthetic */ r50 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        this.b.E.j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        break;
                                    default:
                                        z50 z50Var8 = this.b.E;
                                        if (z50Var8.i0 != null) {
                                            Bitmap bitmap = z50Var8.W0;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                z50Var8.W0 = null;
                                            }
                                            z50Var8.W0 = z50Var8.i0.getBitmap();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                    z4 = false;
                } else {
                    z4 = true;
                }
                z50 z50Var8 = this.E;
                y50 y50Var2 = z50Var8.V0;
                n50 n50Var = z50Var8.U;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (y50Var2.C0 && y50Var2.Q != null && y50Var2.Q.getLooper() != null && y50Var2.Q.getLooper().getThread() != null && y50Var2.Q.getLooper().getThread().isAlive()) {
                    y50Var2.w = eglGetCurrentContext;
                    y50Var2.Q.sendMessage(y50Var2.Q.obtainMessage(0, 1, 0));
                }
                y50Var2.C0 = true;
                int i16 = MessagesController.getInstance(y50Var2.E0.a).roundVideoSize;
                int i17 = MessagesController.getInstance(y50Var2.E0.a).roundVideoBitrate * 1024;
                AndroidUtilities.runOnUIThread(new v50(y50Var2, i12));
                y50Var2.a = n50Var;
                y50Var2.d = i16;
                y50Var2.e = i16;
                y50Var2.f = i17;
                y50Var2.w = eglGetCurrentContext;
                synchronized (y50Var2.R) {
                    try {
                        if (!y50Var2.T) {
                            y50Var2.T = true;
                            Thread thread = new Thread(y50Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!y50Var2.S) {
                                try {
                                    y50Var2.R.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            y50Var2.x0.clear();
                            y50Var2.z0 = 0;
                            DispatchQueue dispatchQueue = y50Var2.y0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                y50Var2.y0.recycle();
                            }
                            y50Var2.y0 = new DispatchQueue("keyframes_thumb_queue");
                            y50Var2.Q.sendMessage(y50Var2.Q.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                int currentOrientation = obj4 instanceof CameraSession ? ((CameraSession) obj4).getCurrentOrientation() : obj4 instanceof Camera2Session ? ((Camera2Session) obj4).getCurrentOrientation() : 0;
                if (currentOrientation == 90 || currentOrientation == 270) {
                    z50 z50Var9 = this.E;
                    float f22 = z50Var9.y0;
                    z50Var9.y0 = z50Var9.z0;
                    z50Var9.z0 = f22;
                }
                this.y = true;
                this.E.r();
            }
            z50 z50Var10 = this.E;
            if (z50Var10.V0 != null && ((z50Var10.X0 == 0 && z11) || (this.E.X0 == 1 && z12))) {
                z50 z50Var11 = this.E;
                y50 y50Var3 = z50Var11.V0;
                SurfaceTexture surfaceTexture2 = this.n[z50Var11.X0];
                z50 z50Var12 = this.E;
                if (z50Var12.m0) {
                    i14 = z50Var12.X0;
                }
                y50Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.n[this.E.X0].getTransformMatrix(this.E.t0);
            GLES20.glUseProgram(this.r);
            GLES20.glActiveTexture(33984);
            z50 z50Var13 = this.E;
            GLES20.glBindTexture(36197, z50Var13.Q[z50Var13.X0]);
            GLES20.glVertexAttribPointer(this.w, 3, 5126, false, 12, (Buffer) this.E.v0);
            GLES20.glEnableVertexAttribArray(this.w);
            GLES20.glVertexAttribPointer(this.x, 2, 5126, false, 8, (Buffer) this.E.w0);
            GLES20.glEnableVertexAttribArray(this.x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.E.t0, 0);
            GLES20.glUniformMatrix4fv(this.s, 1, false, this.E.s0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.w);
            GLES20.glDisableVertexAttribArray(this.x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.b.eglSwapBuffers(this.c, this.e);
            if (z4) {
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.q50
                    public final /* synthetic */ r50 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.b.E.j0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                break;
                            default:
                                z50 z50Var82 = this.b.E;
                                if (z50Var82.i0 != null) {
                                    Bitmap bitmap = z50Var82.W0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        z50Var82.W0 = null;
                                    }
                                    z50Var82.W0 = z50Var82.i0.getBitmap();
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
    }

    public final void requestRender(boolean z4, boolean z10) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(0, this.B.intValue(), (z4 ? 1 : 0) + (z10 ? 2 : 0)), 0);
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
        boolean z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.y3.u(this.b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.y3.u(this.b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.y3.u(this.b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.y3.u(this.b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                            c();
                            z50 z50Var = this.E;
                            float f10 = z50Var.y0;
                            int[] iArr2 = z50Var.Q;
                            float f11 = (1.0f / f10) / 2.0f;
                            float f12 = (1.0f / z50Var.z0) / 2.0f;
                            float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                            float f13 = 0.5f - f11;
                            float f14 = 0.5f - f12;
                            float f15 = f11 + 0.5f;
                            float f16 = f12 + 0.5f;
                            int i10 = 4;
                            float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                            if (z50Var.V0 == null) {
                                z50Var.V0 = new y50(z50Var);
                            }
                            FloatBuffer k10 = org.telegram.messenger.y3.k(ByteBuffer.allocateDirect(48));
                            z50Var.v0 = k10;
                            k10.put(fArr).position(0);
                            FloatBuffer k11 = org.telegram.messenger.y3.k(ByteBuffer.allocateDirect(32));
                            z50Var.w0 = k11;
                            k11.put(fArr2).position(0);
                            Matrix.setIdentityM(z50Var.t0, 0);
                            int a2 = z50.a(z50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                            int a10 = z50.a(z50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
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
                                Matrix.setIdentityM(z50Var.s0, 0);
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
                                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.telegram.ui.Components.p50
                                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                            r50 r50Var = r50.this;
                                            int i12 = i11;
                                            r50Var.E.O = true;
                                            r50Var.requestRender(i12 == 0, i12 == 1);
                                        }
                                    });
                                    AndroidUtilities.runOnUIThread(new gy(z50Var, i11, surfaceTextureArr[i11], i10));
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("InstantCamera gl initied");
                                }
                                z4 = true;
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.y3.u(this.b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
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
                org.telegram.messenger.y3.u(this.b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        }
        this.f = z4;
        super.run();
    }
}
