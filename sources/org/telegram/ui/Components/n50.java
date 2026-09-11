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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class n50 extends DispatchQueue {
    public Integer E;
    public int F;
    public int G;
    public final /* synthetic */ w50 H;
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
    public n50(w50 w50Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        super("CameraGLThread");
        this.H = w50Var;
        this.n = new SurfaceTexture[2];
        this.E = 0;
        this.a = surfaceTexture;
        this.F = i10;
        this.G = i11;
    }

    public final void b(long j3, int i10, boolean z10, int i11, int i12) {
        Handler handler = getHandler();
        if (handler != null) {
            sendMessage(handler.obtainMessage(1, i10, 0, new q50(j3, i11, i12, z10, 0L)), 0);
        }
    }

    public final void c() {
        w50 w50Var = this.H;
        if (w50Var.i0[w50Var.a1] != null) {
            w50 w50Var2 = this.H;
            int width = w50Var2.i0[w50Var2.a1].getWidth();
            w50 w50Var3 = this.H;
            float min = this.F / Math.min(width, r1);
            int i10 = (int) (width * min);
            int height = (int) (w50Var3.i0[w50Var3.a1].getHeight() * min);
            if (i10 == height) {
                w50 w50Var4 = this.H;
                w50Var4.B0 = 1.0f;
                w50Var4.C0 = 1.0f;
            } else if (i10 > height) {
                w50 w50Var5 = this.H;
                w50Var5.B0 = 1.0f;
                w50Var5.C0 = i10 / this.G;
            } else {
                w50 w50Var6 = this.H;
                w50Var6.B0 = height / this.F;
                w50Var6.C0 = 1.0f;
            }
            FileLog.d("InstantCamera camera scaleX = " + this.H.B0 + " scaleY = " + this.H.C0);
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
        this.H.R = false;
        if (this.e != null && (eGLContext = this.d) != null) {
            if (!eGLContext.equals(this.b.eglGetCurrentContext()) || !this.e.equals(this.b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.b;
                EGLDisplay eGLDisplay = this.c;
                EGLSurface eGLSurface = this.e;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d);
            }
            int[] iArr = this.H.T;
            if (iArr != null && iArr[0] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr, 0);
                this.H.T[0] = Integer.MIN_VALUE;
            }
            int[] iArr2 = this.H.T;
            if (iArr2 != null && iArr2[1] != Integer.MIN_VALUE) {
                GLES20.glDeleteTextures(1, iArr2, 1);
                this.H.T[1] = Integer.MIN_VALUE;
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
        v50 v50Var;
        int i10 = message.what;
        final int i11 = 1;
        final int i12 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                finish();
                if (this.y && ((!((z11 = (obj = message.obj) instanceof q50)) || ((q50) obj).c != -2) && (v50Var = this.H.Y0) != null)) {
                    v50Var.i(message.arg1, z11 ? (q50) obj : null);
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            }
            int i13 = 7;
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
                    Matrix.setIdentityM(this.H.v0, 0);
                    if (worldAngle != 0) {
                        Matrix.rotateM(this.H.v0, 0, worldAngle, 0.0f, 0.0f, 1.0f);
                        return;
                    }
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                w50 w50Var = this.H;
                w50Var.a1 = 1 - w50Var.a1;
                c();
                w50 w50Var2 = this.H;
                float f7 = (1.0f / w50Var2.B0) / 2.0f;
                float f10 = (1.0f / w50Var2.C0) / 2.0f;
                float f11 = 0.5f - f7;
                float f12 = 0.5f - f10;
                float f13 = f7 + 0.5f;
                float f14 = f10 + 0.5f;
                w50Var2.z0 = org.telegram.messenger.vl.h(ByteBuffer.allocateDirect(32));
                this.H.z0.put(new float[]{f11, f12, f13, f12, f11, f14, f13, f14}).position(0);
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
                surfaceTexture.getTransformMatrix(this.H.x0);
                this.n[0].setOnFrameAvailableListener(null);
                this.n[0].release();
                w50 w50Var3 = this.H;
                int[] iArr = w50Var3.U;
                int[] iArr2 = w50Var3.T;
                iArr[0] = iArr2[0];
                w50Var3.V = 0.0f;
                iArr2[0] = 0;
                w50Var3.A0 = w50Var3.z0.duplicate();
                w50 w50Var4 = this.H;
                w50Var4.D0 = w50Var4.i0[0];
            }
            this.E = Integer.valueOf(this.E.intValue() + 1);
            this.H.F = false;
            GLES20.glGenTextures(1, this.H.T, 0);
            GLES20.glBindTexture(36197, this.H.T[0]);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            this.n[0] = new SurfaceTexture(this.H.T[0]);
            this.n[0].setOnFrameAvailableListener(new uz(this, 1));
            AndroidUtilities.runOnUIThread(new org.telegram.ui.dm(this.H, i12, this.n[0], i13));
            c();
            w50 w50Var5 = this.H;
            float f15 = (1.0f / w50Var5.B0) / 2.0f;
            float f16 = (1.0f / w50Var5.C0) / 2.0f;
            float f17 = 0.5f - f15;
            float f18 = 0.5f - f16;
            float f19 = f15 + 0.5f;
            float f20 = f16 + 0.5f;
            w50Var5.z0 = org.telegram.messenger.vl.h(ByteBuffer.allocateDirect(32));
            this.H.z0.put(new float[]{f17, f18, f19, f18, f17, f20, f19, f20}).position(0);
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
                        org.telegram.messenger.vl.s(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                w50 w50Var6 = this.H;
                if (w50Var6.Y0 == null) {
                    w50Var6.Y0 = new v50(w50Var6);
                }
                w50 w50Var7 = this.H;
                if (w50Var7.Y0.F0) {
                    if (!w50Var7.F) {
                        this.H.F = true;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.m50
                            public final /* synthetic */ n50 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        this.b.H.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                        break;
                                    default:
                                        w50 w50Var8 = this.b.H;
                                        if (w50Var8.l0 != null) {
                                            Bitmap bitmap = w50Var8.Z0;
                                            if (bitmap != null) {
                                                bitmap.recycle();
                                                w50Var8.Z0 = null;
                                            }
                                            w50Var8.Z0 = w50Var8.l0.getBitmap();
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
                w50 w50Var8 = this.H;
                v50 v50Var2 = w50Var8.Y0;
                i50 i50Var = w50Var8.a0;
                android.opengl.EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
                if (v50Var2.F0 && v50Var2.T != null && v50Var2.T.getLooper() != null && v50Var2.T.getLooper().getThread() != null && v50Var2.T.getLooper().getThread().isAlive()) {
                    v50Var2.w = eglGetCurrentContext;
                    v50Var2.T.sendMessage(v50Var2.T.obtainMessage(0, 1, 0));
                }
                v50Var2.F0 = true;
                int i16 = MessagesController.getInstance(v50Var2.H0.a).roundVideoSize;
                int i17 = MessagesController.getInstance(v50Var2.H0.a).roundVideoBitrate * 1024;
                AndroidUtilities.runOnUIThread(new r50(v50Var2, i11));
                v50Var2.a = i50Var;
                v50Var2.d = i16;
                v50Var2.e = i16;
                v50Var2.f = i17;
                v50Var2.w = eglGetCurrentContext;
                synchronized (v50Var2.U) {
                    try {
                        if (!v50Var2.W) {
                            v50Var2.W = true;
                            Thread thread = new Thread(v50Var2, "TextureMovieEncoder");
                            thread.setPriority(10);
                            thread.start();
                            while (!v50Var2.V) {
                                try {
                                    v50Var2.U.wait();
                                } catch (InterruptedException unused) {
                                }
                            }
                            v50Var2.A0.clear();
                            v50Var2.C0 = 0;
                            DispatchQueue dispatchQueue = v50Var2.B0;
                            if (dispatchQueue != null) {
                                dispatchQueue.cleanupQueue();
                                v50Var2.B0.recycle();
                            }
                            v50Var2.B0 = new DispatchQueue("keyframes_thumb_queue");
                            v50Var2.T.sendMessage(v50Var2.T.obtainMessage(0));
                        }
                    } finally {
                    }
                }
                Object obj4 = this.h;
                int currentOrientation = obj4 instanceof CameraSession ? ((CameraSession) obj4).getCurrentOrientation() : obj4 instanceof Camera2Session ? ((Camera2Session) obj4).getCurrentOrientation() : 0;
                if (currentOrientation == 90 || currentOrientation == 270) {
                    w50 w50Var9 = this.H;
                    float f21 = w50Var9.B0;
                    w50Var9.B0 = w50Var9.C0;
                    w50Var9.C0 = f21;
                }
                this.y = true;
                this.H.r();
            }
            w50 w50Var10 = this.H;
            if (w50Var10.Y0 != null && ((w50Var10.a1 == 0 && z12) || (this.H.a1 == 1 && z13))) {
                w50 w50Var11 = this.H;
                v50 v50Var3 = w50Var11.Y0;
                SurfaceTexture surfaceTexture2 = this.n[w50Var11.a1];
                w50 w50Var12 = this.H;
                if (w50Var12.p0) {
                    i14 = w50Var12.a1;
                }
                v50Var3.f(surfaceTexture2, Integer.valueOf(i14), System.nanoTime());
            }
            this.n[this.H.a1].getTransformMatrix(this.H.w0);
            GLES20.glUseProgram(this.r);
            GLES20.glActiveTexture(33984);
            w50 w50Var13 = this.H;
            GLES20.glBindTexture(36197, w50Var13.T[w50Var13.a1]);
            GLES20.glVertexAttribPointer(this.w, 3, 5126, false, 12, (Buffer) this.H.y0);
            GLES20.glEnableVertexAttribArray(this.w);
            GLES20.glVertexAttribPointer(this.x, 2, 5126, false, 8, (Buffer) this.H.z0);
            GLES20.glEnableVertexAttribArray(this.x);
            GLES20.glUniformMatrix4fv(this.v, 1, false, this.H.w0, 0);
            GLES20.glUniformMatrix4fv(this.s, 1, false, this.H.v0, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.w);
            GLES20.glDisableVertexAttribArray(this.x);
            GLES20.glBindTexture(36197, 0);
            GLES20.glUseProgram(0);
            this.b.eglSwapBuffers(this.c, this.e);
            if (z10) {
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.Components.m50
                    public final /* synthetic */ n50 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                this.b.H.m0.animate().setDuration(120L).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).start();
                                break;
                            default:
                                w50 w50Var82 = this.b.H;
                                if (w50Var82.l0 != null) {
                                    Bitmap bitmap = w50Var82.Z0;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        w50Var82.Z0 = null;
                                    }
                                    w50Var82.Z0 = w50Var82.l0.getBitmap();
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
                org.telegram.messenger.vl.s(this.b, new StringBuilder("InstantCamera eglGetDisplay failed "));
            }
            finish();
        } else if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.vl.s(this.b, new StringBuilder("InstantCamera eglChooseConfig failed "));
                }
                finish();
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.d = eglCreateContext;
                if (eglCreateContext == null) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.vl.s(this.b, new StringBuilder("InstantCamera eglCreateContext failed "));
                    }
                    finish();
                } else {
                    SurfaceTexture surfaceTexture = this.a;
                    if (surfaceTexture != null) {
                        EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                        this.e = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.vl.s(this.b, new StringBuilder("InstantCamera createWindowSurface failed "));
                            }
                            finish();
                        } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                            c();
                            w50 w50Var = this.H;
                            float f7 = w50Var.B0;
                            int[] iArr2 = w50Var.T;
                            float f10 = (1.0f / f7) / 2.0f;
                            float f11 = (1.0f / w50Var.C0) / 2.0f;
                            float[] fArr = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
                            float f12 = 0.5f - f10;
                            float f13 = 0.5f - f11;
                            float f14 = f10 + 0.5f;
                            float f15 = f11 + 0.5f;
                            int i10 = 7;
                            float[] fArr2 = {f12, f13, f14, f13, f12, f15, f14, f15};
                            if (w50Var.Y0 == null) {
                                w50Var.Y0 = new v50(w50Var);
                            }
                            FloatBuffer h = org.telegram.messenger.vl.h(ByteBuffer.allocateDirect(48));
                            w50Var.y0 = h;
                            h.put(fArr).position(0);
                            FloatBuffer h10 = org.telegram.messenger.vl.h(ByteBuffer.allocateDirect(32));
                            w50Var.z0 = h10;
                            h10.put(fArr2).position(0);
                            Matrix.setIdentityM(w50Var.w0, 0);
                            int a2 = w50.a(w50Var, 35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
                            int a10 = w50.a(w50Var, 35632, "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n   gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
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
                                Matrix.setIdentityM(w50Var.v0, 0);
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
                                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: org.telegram.ui.Components.l50
                                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                                            n50 n50Var = n50.this;
                                            int i12 = i11;
                                            n50Var.H.R = true;
                                            n50Var.requestRender(i12 == 0, i12 == 1);
                                        }
                                    });
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.dm(w50Var, i11, surfaceTextureArr[i11], i10));
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("InstantCamera gl initied");
                                }
                                z10 = true;
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                org.telegram.messenger.vl.s(this.b, new StringBuilder("InstantCamera eglMakeCurrent failed "));
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
                org.telegram.messenger.vl.s(this.b, new StringBuilder("InstantCamera eglInitialize failed "));
            }
            finish();
        }
        this.f = z10;
        super.run();
    }
}
