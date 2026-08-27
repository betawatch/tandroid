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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jz extends DispatchQueue {
    public final int[] A;
    public boolean B;
    public boolean C;
    public final z9 D;
    public fa E;
    public final nz F;
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
    public final vu X;
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

    public jz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, z9 z9Var, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.y = new float[16];
        this.A = new int[1];
        this.Z = new gz(this, 1);
        this.a = surfaceTexture;
        this.n = i11;
        this.r = i12;
        this.s = bitmap;
        this.v = i10;
        this.D = z9Var;
        boolean z12 = z9Var != null;
        this.C = z12;
        if (z12) {
            fa faVar = new fa();
            this.E = faVar;
            z9 z9Var2 = faVar.t;
            if (z9Var2 != null && z9Var2.m != null) {
                z9Var2.m = null;
            }
            faVar.t = z9Var;
            if (z9Var != null && z9Var.m != faVar) {
                z9Var.m = faVar;
                z9Var.d();
            }
        }
        this.h = false;
        nz nzVar = new nz(false, null);
        this.F = nzVar;
        nzVar.i1 = z11;
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

    public static void b(jz jzVar) {
        mz mzVar;
        if (jzVar.f) {
            jzVar.c();
            if (jzVar.x) {
                jzVar.w.updateTexImage();
                jzVar.w.getTransformMatrix(jzVar.y);
                jzVar.g();
                jzVar.x = false;
                nz nzVar = jzVar.F;
                nzVar.P0 = jzVar.y;
                nzVar.W0 = false;
                jzVar.B = true;
            }
            if (jzVar.V) {
                if (jzVar.h && ((mzVar = jzVar.F.f1) == null || mzVar.b())) {
                    GLES20.glViewport(0, 0, jzVar.n, jzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(jzVar.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, jzVar.A[0]);
                    GLES20.glUniform1i(jzVar.O, 0);
                    GLES20.glEnableVertexAttribArray(jzVar.N);
                    int i10 = jzVar.N;
                    FloatBuffer floatBuffer = jzVar.U;
                    if (floatBuffer == null) {
                        floatBuffer = jzVar.F.a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(jzVar.L);
                    GLES20.glVertexAttribPointer(jzVar.L, 2, 5126, false, 8, (Buffer) jzVar.F.b1);
                    GLES20.glUniformMatrix4fv(jzVar.M, 1, false, jzVar.y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    jzVar.b.eglSwapBuffers(jzVar.c, jzVar.e);
                    fa faVar = jzVar.E;
                    if (faVar != null) {
                        faVar.a(jzVar.y, jzVar.A[0], jzVar.S, jzVar.T);
                        return;
                    }
                    return;
                }
                if (jzVar.X == null || jzVar.B) {
                    GLES20.glViewport(0, 0, jzVar.Q, jzVar.R);
                    jzVar.F.f();
                    jzVar.F.d();
                    if (jzVar.X == null) {
                        jzVar.F.e();
                    }
                    jzVar.F.c();
                    jzVar.P = jzVar.F.b();
                    jzVar.Y = true;
                }
                if (jzVar.Y) {
                    GLES20.glViewport(0, 0, jzVar.n, jzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = jzVar.F.g(1 ^ (jzVar.P ? 1 : 0));
                    GLES20.glUseProgram(jzVar.G);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(jzVar.J, 0);
                    GLES20.glEnableVertexAttribArray(jzVar.I);
                    int i11 = jzVar.I;
                    FloatBuffer floatBuffer2 = jzVar.U;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = jzVar.F.a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(jzVar.H);
                    GLES20.glVertexAttribPointer(jzVar.H, 2, 5126, false, 8, (Buffer) jzVar.F.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    jzVar.b.eglSwapBuffers(jzVar.c, jzVar.e);
                    fa faVar2 = jzVar.E;
                    if (faVar2 != null) {
                        faVar2.a(null, g10, jzVar.Q, jzVar.R);
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
        org.telegram.messenger.rl.r(this.b, new StringBuilder("eglMakeCurrent failed "));
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        postRunnable(new hz(this, z10, z12, z11, 0));
    }

    public final void f(mz mzVar) {
        postRunnable(new xq(15, this, mzVar));
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
            z9 z9Var = this.D;
            if (z9Var != null) {
                synchronized (z9Var.f) {
                    try {
                        if (z9Var.g == eGLContext) {
                            z9Var.g = null;
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
        nz nzVar = this.F;
        this.Q = nzVar.X0;
        this.R = nzVar.Y0;
    }

    public final boolean h(lh.y7 y7Var) {
        int h;
        int h10;
        int a2 = y7Var != null ? y7Var.a() : 0;
        String readRes = a2 == 1 ? AndroidUtilities.readRes(R.raw.hdr2sdr_hlg) : a2 == 2 ? AndroidUtilities.readRes(R.raw.hdr2sdr_pq) : "";
        if (a2 != 0) {
            h = nz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = nz.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", readRes));
        } else {
            h = nz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = nz.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new fz(this, i10, i11, 2));
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        fa faVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.rl.r(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else {
            int i12 = 2;
            if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.rl.r(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    int[] iArr2 = {12440, 2, 12344};
                    z9 z9Var = this.D;
                    if (z9Var != null) {
                        synchronized (z9Var.f) {
                            try {
                                eGLContext = z9Var.g;
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
                            org.telegram.messenger.rl.r(this.b, new StringBuilder("eglCreateContext failed "));
                        }
                        finish();
                    } else {
                        z9 z9Var2 = this.D;
                        if (z9Var2 != null) {
                            z9Var2.a(eglCreateContext);
                        }
                        SurfaceTexture surfaceTexture = this.a;
                        if (surfaceTexture != null) {
                            EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                            this.e = eglCreateWindowSurface;
                            if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.rl.r(this.b, new StringBuilder("createWindowSurface failed "));
                                }
                                finish();
                            } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                int h = nz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = nz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                            surfaceTexture2.setOnFrameAvailableListener(new iz(this, 0));
                                            GLES20.glBindTexture(36197, this.A[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new gz(this, i12));
                                        }
                                        if (this.C && (faVar = this.E) != null && !faVar.b(this.n / this.r, this.D.a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.C = false;
                                            this.E = null;
                                        }
                                        if (this.F.a()) {
                                            if (i13 != 0 && i14 != 0) {
                                                this.F.i(this.s, this.v, this.A[0], i13, i14);
                                                this.V = true;
                                                nz nzVar = this.F;
                                                this.Q = nzVar.X0;
                                                this.R = nzVar.Y0;
                                            }
                                            z10 = true;
                                        } else {
                                            finish();
                                        }
                                    }
                                }
                            } else {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.rl.r(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                    org.telegram.messenger.rl.r(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }

    public jz(SurfaceTexture surfaceTexture, vu vuVar, lh.y7 y7Var, z9 z9Var, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.y = new float[16];
        this.A = new int[1];
        this.Z = new gz(this, 1);
        this.a = surfaceTexture;
        this.n = i10;
        this.r = i11;
        this.X = vuVar;
        this.D = z9Var;
        boolean z10 = z9Var != null;
        this.C = z10;
        if (z10) {
            fa faVar = new fa();
            this.E = faVar;
            z9 z9Var2 = faVar.t;
            if (z9Var2 != null && z9Var2.m != null) {
                z9Var2.m = null;
            }
            faVar.t = z9Var;
            if (z9Var != null && z9Var.m != faVar) {
                z9Var.m = faVar;
                z9Var.d();
            }
        }
        this.h = true;
        this.F = new nz(true, y7Var);
        start();
    }
}
