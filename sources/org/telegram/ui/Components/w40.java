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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w40 extends DispatchQueue {
    public Integer A;
    public int B;
    public int C;
    public final /* synthetic */ f50 D;
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
    public w40(f50 f50Var, SurfaceTexture surfaceTexture, int i9, int i10) {
        super("CameraGLThread");
        this.D = f50Var;
        this.n = new SurfaceTexture[2];
        this.A = 0;
        this.a = surfaceTexture;
        this.B = i9;
        this.C = i10;
    }

    public final void b(long j10, int i9, boolean z10, int i10, int i11) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i9, 0, new z40(j10, i10, i11, z10, 0L)), 0);
        }
    }

    public final void c() {
        f50 f50Var = this.D;
        if (f50Var.e0[f50Var.W0] != null) {
            f50 f50Var2 = this.D;
            int width = f50Var2.e0[f50Var2.W0].getWidth();
            f50 f50Var3 = this.D;
            float min = this.B / Math.min(width, r1);
            int i9 = (int) (width * min);
            int height = (int) (f50Var3.e0[f50Var3.W0].getHeight() * min);
            if (i9 == height) {
                f50 f50Var4 = this.D;
                f50Var4.x0 = 1.0f;
                f50Var4.y0 = 1.0f;
            } else if (i9 > height) {
                f50 f50Var5 = this.D;
                f50Var5.x0 = 1.0f;
                f50Var5.y0 = i9 / this.C;
            } else {
                f50 f50Var6 = this.D;
                f50Var6.x0 = height / this.B;
                f50Var6.y0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.D.x0 + " scaleY = " + this.D.y0);
        }
    }

    public final void finish() {
        EGLContext eGLContext;
        if (this.n != null) {
            for (int i9 = 0; i9 < 2; i9++) {
                SurfaceTexture surfaceTexture = this.n[i9];
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    this.n[i9] = null;
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
        e50 e50Var;
        int i9 = message.what;
        final int i10 = 1;
        final int i11 = 0;
        if (i9 != 0) {
            if (i9 == 1) {
                finish();
                if (this.y && ((!((z11 = (obj = message.obj) instanceof z40)) || ((z40) obj).c != -2) && (e50Var = this.D.U0) != null)) {
                    e50Var.i(message.arg1, z11 ? (z40) obj : null);
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            }
            int i12 = 7;
            if (i9 != 2) {
                if (i9 == 3) {
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
                if (i9 != 4) {
                    return;
                }
                f50 f50Var = this.D;
                f50Var.W0 = 1 - f50Var.W0;
                c();
                f50 f50Var2 = this.D;
                float f10 = (1.0f / f50Var2.x0) / 2.0f;
                float f11 = (1.0f / f50Var2.y0) / 2.0f;
                float f12 = 0.5f - f10;
                float f13 = 0.5f - f11;
                float f14 = f10 + 0.5f;
                float f15 = f11 + 0.5f;
                f50Var2.v0 = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(32));
                this.D.v0.put(new float[]{f12, f13, f14, f13, f12, f15, f14, f15}).position(0);
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
                f50 f50Var3 = this.D;
                int[] iArr = f50Var3.Q;
                int[] iArr2 = f50Var3.P;
                iArr[0] = iArr2[0];
                f50Var3.R = 0.0f;
                iArr2[0] = 0;
                f50Var3.w0 = f50Var3.v0.duplicate();
                f50 f50Var4 = this.D;
                f50Var4.z0 = f50Var4.e0[0];
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
            this.n[0].setOnFrameAvailableListener(new gz(this, 1));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(this.D, i11, this.n[0], i12));
            c();
            f50 f50Var5 = this.D;
            float f16 = (1.0f / f50Var5.x0) / 2.0f;
            float f17 = (1.0f / f50Var5.y0) / 2.0f;
            float f18 = 0.5f - f16;
            float f19 = 0.5f - f17;
            float f20 = f16 + 0.5f;
            float f21 = f17 + 0.5f;
            f50Var5.v0 = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(32));
            this.D.v0.put(new float[]{f18, f19, f20, f19, f18, f21, f20, f21}).position(0);
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
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ll.t(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                f50 f50Var6 = this.D;
                if (f50Var6.U0 == null) {
                    f50Var6.U0 = new e50(f50Var6);
                }
                f50 f50Var7 = this.D;
                if (f50Var7.U0.B0) {
                    if (!f50Var7.B) {
                        this.D.B = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.v40
                            public final /* synthetic */ w40 b;

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
                                        f50 f50Var8 = this.b.D;
                                        if (f50Var8.h0 != null) {
                                            Bitmap bitmap = f50Var8.V0;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                f50Var8.V0 = null;
                                            }
                                            f50Var8.V0 = f50Var8.h0.getBitmap();
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
                f50 f50Var8 = this.D;
                e50 e50Var2 = f50Var8.U0;
                s40 s40Var = f50Var8.T;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (e50Var2.B0 && e50Var2.P != null && e50Var2.P.getLooper() != null && e50Var2.P.getLooper().getThread() != null && e50Var2.P.getLooper().getThread().isAlive()) {
                    e50Var2.w = eglGetCurrentContext;
                    e50Var2.P.sendMessage(e50Var2.P.obtainMessage(0, 1, 0));
                }
                e50Var2.B0 = true;
                int i15 = MessagesController.getInstance(e50Var2.D0.a).roundVideoSize;
                int i16 = MessagesController.getInstance(e50Var2.D0.a).roundVideoBitrate * 1024;
                AndroidUtilities.runOnUIThread(new b50(e50Var2, i10));
                e50Var2.a = s40Var;
                e50Var2.d = i15;
                e50Var2.e = i15;
                e50Var2.f = i16;
                e50Var2.w = eglGetCurrentContext;
                synchronized (e50Var2.Q) {
                    try {
                        if (!e50Var2.S) {
                            e50Var2.S = true;
                            Thread thread = new Thread(e50Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!e50Var2.R) {
                                try {
                                    e50Var2.Q.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            e50Var2.w0.clear();
                            e50Var2.y0 = 0;
                            DispatchQueue dispatchQueue = e50Var2.x0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                e50Var2.x0.recycle();
                            }
                            e50Var2.x0 = new DispatchQueue("keyframes_thumb_queue");
                            e50Var2.P.sendMessage(e50Var2.P.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                int currentOrientation = obj4 instanceof CameraSession ? ((CameraSession) obj4).getCurrentOrientation() : obj4 instanceof Camera2Session ? ((Camera2Session) obj4).getCurrentOrientation() : 0;
                if (currentOrientation == 90 || currentOrientation == 270) {
                    f50 f50Var9 = this.D;
                    float f22 = f50Var9.x0;
                    f50Var9.x0 = f50Var9.y0;
                    f50Var9.y0 = f22;
                }
                this.y = true;
                this.D.r();
            }
            f50 f50Var10 = this.D;
            if (f50Var10.U0 != null && ((f50Var10.W0 == 0 && z12) || (this.D.W0 == 1 && z13))) {
                f50 f50Var11 = this.D;
                e50 e50Var3 = f50Var11.U0;
                SurfaceTexture surfaceTexture2 = this.n[f50Var11.W0];
                f50 f50Var12 = this.D;
                if (f50Var12.l0) {
                    i13 = f50Var12.W0;
                }
                e50Var3.f(surfaceTexture2, Integer.valueOf(i13), System.nanoTime());
            }
            this.n[this.D.W0].getTransformMatrix(this.D.s0);
            GLES20.glUseProgram(this.r);
            GLES20.glActiveTexture(33984);
            f50 f50Var13 = this.D;
            GLES20.glBindTexture(36197, f50Var13.P[f50Var13.W0]);
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
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.v40
                    public final /* synthetic */ w40 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.b.D.i0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                break;
                            default:
                                f50 f50Var82 = this.b.D;
                                if (f50Var82.h0 != null) {
                                    Bitmap bitmap = f50Var82.V0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        f50Var82.V0 = null;
                                    }
                                    f50Var82.V0 = f50Var82.h0.getBitmap();
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
                org.telegram.messenger.ll.t(this.b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.ll.t(this.b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.ll.t(this.b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.ll.t(this.b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                            c();
                            f50 f50Var = this.D;
                            float f10 = f50Var.x0;
                            int[] iArr2 = f50Var.P;
                            float f11 = (1.0f / f10) / 2.0f;
                            float f12 = (1.0f / f50Var.y0) / 2.0f;
                            float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                            float f13 = 0.5f - f11;
                            float f14 = 0.5f - f12;
                            float f15 = f11 + 0.5f;
                            float f16 = f12 + 0.5f;
                            int i9 = 7;
                            float[] fArr2 = {f13, f14, f15, f14, f13, f16, f15, f16};
                            if (f50Var.U0 == null) {
                                f50Var.U0 = new e50(f50Var);
                            }
                            FloatBuffer h = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(48));
                            f50Var.u0 = h;
                            h.put(fArr).position(0);
                            FloatBuffer h10 = org.telegram.messenger.ll.h(ByteBuffer.allocateDirect(32));
                            f50Var.v0 = h10;
                            h10.put(fArr2).position(0);
                            Matrix.setIdentityM(f50Var.s0, 0);
                            int a2 = f50.a(f50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                            int a3 = f50.a(f50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
                            if (a2 == 0 || a3 == 0) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("InstantCamera failed creating shader");
                                }
                                finish();
                            } else {
                                int glCreateProgram = GLES20.glCreateProgram();
                                this.r = glCreateProgram;
                                GLES20.glAttachShader(glCreateProgram, a2);
                                GLES20.glAttachShader(this.r, a3);
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
                                Matrix.setIdentityM(f50Var.r0, 0);
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
                                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.telegram.ui.Components.u40
                                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                            w40 w40Var = w40.this;
                                            int i11 = i10;
                                            w40Var.D.N = true;
                                            w40Var.requestRender(i11 == 0, i11 == 1);
                                        }
                                    });
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(f50Var, i10, surfaceTextureArr[i10], i9));
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("InstantCamera gl initied");
                                }
                                z10 = true;
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.ll.t(this.b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
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
                org.telegram.messenger.ll.t(this.b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        }
        this.f = z10;
        super.run();
    }
}
