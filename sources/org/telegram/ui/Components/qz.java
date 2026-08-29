package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Locale;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qz extends DispatchQueue {
    public final int[] A;
    public boolean B;
    public boolean C;
    public final ga D;
    public ma E;
    public final uz F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final FloatBuffer U;
    public boolean V;
    public long W;
    public final cv X;
    public boolean Y;
    public final Runnable Z;
    public final SurfaceTexture a;
    public EGL10 b;
    public EGLDisplay c;
    public EGLContext d;
    public EGLSurface e;
    public boolean f;
    public final boolean h;
    public volatile int n;
    public volatile int r;
    public Bitmap s;
    public final int v;
    public SurfaceTexture w;
    public boolean x;
    public final float[] y;

    public qz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, ga gaVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.y = new float[16];
        this.A = new int[1];
        this.Z = new nz(this, 1);
        this.a = surfaceTexture;
        this.n = i11;
        this.r = i12;
        this.s = bitmap;
        this.v = i10;
        this.D = gaVar;
        boolean z12 = gaVar != null;
        this.C = z12;
        if (z12) {
            ma maVar = new ma();
            this.E = maVar;
            ga gaVar2 = maVar.t;
            if (gaVar2 != null && gaVar2.m != null) {
                gaVar2.m = null;
            }
            maVar.t = gaVar;
            if (gaVar != null && gaVar.m != maVar) {
                gaVar.m = maVar;
                gaVar.d();
            }
        }
        this.h = false;
        uz uzVar = new uz(false, null);
        this.F = uzVar;
        uzVar.i1 = z11;
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (z10) {
            fArr[2] = 0.0f;
            fArr[0] = 1.0f;
            fArr[6] = 0.0f;
            fArr[4] = 1.0f;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.U = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        start();
    }

    public static void b(qz qzVar) {
        tz tzVar;
        if (qzVar.f) {
            qzVar.c();
            if (qzVar.x) {
                qzVar.w.updateTexImage();
                qzVar.w.getTransformMatrix(qzVar.y);
                qzVar.g();
                qzVar.x = false;
                uz uzVar = qzVar.F;
                uzVar.P0 = qzVar.y;
                uzVar.W0 = false;
                qzVar.B = true;
            }
            if (qzVar.V) {
                if (qzVar.h && ((tzVar = qzVar.F.f1) == null || tzVar.b())) {
                    GLES20.glViewport(0, 0, qzVar.n, qzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(qzVar.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, qzVar.A[0]);
                    GLES20.glUniform1i(qzVar.O, 0);
                    GLES20.glEnableVertexAttribArray(qzVar.N);
                    int i10 = qzVar.N;
                    FloatBuffer floatBuffer = qzVar.U;
                    if (floatBuffer == null) {
                        floatBuffer = qzVar.F.a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(qzVar.L);
                    GLES20.glVertexAttribPointer(qzVar.L, 2, 5126, false, 8, (Buffer) qzVar.F.b1);
                    GLES20.glUniformMatrix4fv(qzVar.M, 1, false, qzVar.y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    qzVar.b.eglSwapBuffers(qzVar.c, qzVar.e);
                    ma maVar = qzVar.E;
                    if (maVar != null) {
                        maVar.a(qzVar.y, qzVar.A[0], qzVar.S, qzVar.T);
                        return;
                    }
                    return;
                }
                if (qzVar.X == null || qzVar.B) {
                    GLES20.glViewport(0, 0, qzVar.Q, qzVar.R);
                    qzVar.F.f();
                    qzVar.F.d();
                    if (qzVar.X == null) {
                        qzVar.F.e();
                    }
                    qzVar.F.c();
                    qzVar.P = qzVar.F.b();
                    qzVar.Y = true;
                }
                if (qzVar.Y) {
                    GLES20.glViewport(0, 0, qzVar.n, qzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = qzVar.F.g(1 ^ (qzVar.P ? 1 : 0));
                    GLES20.glUseProgram(qzVar.G);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(qzVar.J, 0);
                    GLES20.glEnableVertexAttribArray(qzVar.I);
                    int i11 = qzVar.I;
                    FloatBuffer floatBuffer2 = qzVar.U;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = qzVar.F.a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(qzVar.H);
                    GLES20.glVertexAttribPointer(qzVar.H, 2, 5126, false, 8, (Buffer) qzVar.F.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    qzVar.b.eglSwapBuffers(qzVar.c, qzVar.e);
                    ma maVar2 = qzVar.E;
                    if (maVar2 != null) {
                        maVar2.a(null, g10, qzVar.Q, qzVar.R);
                    }
                }
            }
        }
    }

    public final void c() {
        if (this.d.equals(this.b.eglGetCurrentContext()) && this.e.equals(this.b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = this.b;
        EGLDisplay eGLDisplay = this.c;
        EGLSurface eGLSurface = this.e;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) || !BuildVars.LOGS_ENABLED) {
            return;
        }
        org.telegram.messenger.x3.u(this.b, new StringBuilder("eglMakeCurrent failed "));
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        postRunnable(new oz(this, z10, z12, z11, 0));
    }

    public final void f(tz tzVar) {
        postRunnable(new gt(12, this, tzVar));
    }

    public final void finish() {
        this.s = null;
        if (this.e != null) {
            EGL10 egl10 = this.b;
            EGLDisplay eGLDisplay = this.c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.b.eglDestroySurface(this.c, this.e);
            this.e = null;
        }
        EGLContext eGLContext = this.d;
        if (eGLContext != null) {
            ga gaVar = this.D;
            if (gaVar != null) {
                synchronized (gaVar.f) {
                    try {
                        if (gaVar.g == eGLContext) {
                            gaVar.g = null;
                        }
                    } finally {
                    }
                }
            }
            this.b.eglDestroyContext(this.c, this.d);
            this.d = null;
        }
        EGLDisplay eGLDisplay2 = this.c;
        if (eGLDisplay2 != null) {
            this.b.eglTerminate(eGLDisplay2);
            this.c = null;
        }
        SurfaceTexture surfaceTexture = this.a;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public final void g() {
        int i10;
        int i11;
        if (this.V || (i10 = this.S) <= 0 || (i11 = this.T) <= 0) {
            return;
        }
        this.F.i(this.s, this.v, this.A[0], i10, i11);
        this.V = true;
        uz uzVar = this.F;
        this.Q = uzVar.X0;
        this.R = uzVar.Y0;
    }

    public final boolean h(nh.n7 n7Var) {
        int h;
        int h10;
        int a2 = n7Var != null ? n7Var.a() : 0;
        String readRes = a2 == 1 ? AndroidUtilities.readRes(R.raw.hdr2sdr_hlg) : a2 == 2 ? AndroidUtilities.readRes(R.raw.hdr2sdr_pq) : "";
        if (a2 != 0) {
            h = uz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = uz.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", readRes));
        } else {
            h = uz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = uz.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
        }
        if (h == 0 || h10 == 0) {
            return false;
        }
        int i10 = this.K;
        if (i10 != 0) {
            GLES20.glDeleteProgram(i10);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.K = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.K, h10);
        GLES20.glBindAttribLocation(this.K, 0, "position");
        GLES20.glBindAttribLocation(this.K, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.K);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.K, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.K);
            this.K = 0;
        } else {
            this.L = GLES20.glGetAttribLocation(this.K, "position");
            this.N = GLES20.glGetAttribLocation(this.K, "inputTexCoord");
            this.O = GLES20.glGetUniformLocation(this.K, "sourceImage");
            this.M = GLES20.glGetUniformLocation(this.K, "videoMatrix");
        }
        return true;
    }

    public final void i(int i10, int i11) {
        if (this.E == null) {
            return;
        }
        postRunnable(new mz(this, i10, i11, 2));
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        ma maVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.x3.u(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else {
            int i12 = 2;
            if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.x3.u(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    int[] iArr2 = {12440, 2, 12344};
                    ga gaVar = this.D;
                    if (gaVar != null) {
                        synchronized (gaVar.f) {
                            try {
                                eGLContext = gaVar.g;
                                if (eGLContext == null) {
                                    eGLContext = EGL10.EGL_NO_CONTEXT;
                                }
                            } finally {
                            }
                        }
                    } else {
                        eGLContext = EGL10.EGL_NO_CONTEXT;
                    }
                    EGLContext eglCreateContext = this.b.eglCreateContext(this.c, eGLConfig, eGLContext, iArr2);
                    this.d = eglCreateContext;
                    if (eglCreateContext == null) {
                        if (BuildVars.LOGS_ENABLED) {
                            org.telegram.messenger.x3.u(this.b, new StringBuilder("eglCreateContext failed "));
                        }
                        finish();
                    } else {
                        ga gaVar2 = this.D;
                        if (gaVar2 != null) {
                            gaVar2.a(eglCreateContext);
                        }
                        SurfaceTexture surfaceTexture = this.a;
                        if (surfaceTexture != null) {
                            EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                            this.e = eglCreateWindowSurface;
                            if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.x3.u(this.b, new StringBuilder("createWindowSurface failed "));
                                }
                                finish();
                            } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                int h = uz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = uz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
                                if (h != 0 && h10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.G = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, h);
                                    GLES20.glAttachShader(this.G, h10);
                                    GLES20.glBindAttribLocation(this.G, 0, "position");
                                    GLES20.glBindAttribLocation(this.G, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.G);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.G, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        GLES20.glDeleteProgram(this.G);
                                        this.G = 0;
                                    } else {
                                        this.H = GLES20.glGetAttribLocation(this.G, "position");
                                        this.I = GLES20.glGetAttribLocation(this.G, "inputTexCoord");
                                        this.J = GLES20.glGetUniformLocation(this.G, "sourceImage");
                                    }
                                    if (h(null)) {
                                        Bitmap bitmap = this.s;
                                        if (bitmap != null) {
                                            i10 = bitmap.getWidth();
                                            i11 = this.s.getHeight();
                                        } else {
                                            i10 = this.S;
                                            i11 = this.T;
                                        }
                                        int i13 = i10;
                                        int i14 = i11;
                                        if (this.X != null) {
                                            GLES20.glGenTextures(1, this.A, 0);
                                            Matrix.setIdentityM(this.y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.A[0]);
                                            this.w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new pz(this, 0));
                                            GLES20.glBindTexture(36197, this.A[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new nz(this, i12));
                                        }
                                        if (this.C && (maVar = this.E) != null && !maVar.b(this.n / this.r, this.D.a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.C = false;
                                            this.E = null;
                                        }
                                        if (this.F.a()) {
                                            if (i13 != 0 && i14 != 0) {
                                                this.F.i(this.s, this.v, this.A[0], i13, i14);
                                                this.V = true;
                                                uz uzVar = this.F;
                                                this.Q = uzVar.X0;
                                                this.R = uzVar.Y0;
                                            }
                                            z10 = true;
                                        } else {
                                            finish();
                                        }
                                    }
                                }
                            } else {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.x3.u(this.b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            }
                        } else {
                            finish();
                        }
                    }
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("eglConfig not initialized");
                    }
                    finish();
                }
            } else {
                if (BuildVars.LOGS_ENABLED) {
                    org.telegram.messenger.x3.u(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }

    public qz(SurfaceTexture surfaceTexture, cv cvVar, nh.n7 n7Var, ga gaVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.y = new float[16];
        this.A = new int[1];
        this.Z = new nz(this, 1);
        this.a = surfaceTexture;
        this.n = i10;
        this.r = i11;
        this.X = cvVar;
        this.D = gaVar;
        boolean z10 = gaVar != null;
        this.C = z10;
        if (z10) {
            ma maVar = new ma();
            this.E = maVar;
            ga gaVar2 = maVar.t;
            if (gaVar2 != null && gaVar2.m != null) {
                gaVar2.m = null;
            }
            maVar.t = gaVar;
            if (gaVar != null && gaVar.m != maVar) {
                gaVar.m = maVar;
                gaVar.d();
            }
        }
        this.h = true;
        this.F = new uz(true, n7Var);
        start();
    }
}
