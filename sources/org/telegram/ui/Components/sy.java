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
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class sy extends org.telegram.messenger.q5 {
    public final float[] D;
    public final int[] E;
    public boolean F;
    public boolean G;
    public final y9 H;
    public da I;
    public final wy J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public int U;
    public int V;
    public int W;
    public int X;
    public final FloatBuffer Y;
    public boolean Z;
    public final SurfaceTexture a;
    public long a0;
    public EGL10 b;
    public final bx b0;
    public EGLDisplay c;
    public boolean c0;
    public EGLContext d;
    public final Runnable d0;
    public EGLSurface e;
    public boolean f;
    public final boolean h;
    public volatile int n;
    public volatile int r;
    public Bitmap s;
    public final int w;
    public SurfaceTexture x;
    public boolean y;

    public sy(SurfaceTexture surfaceTexture, Bitmap bitmap, int i7, boolean z9, boolean z10, y9 y9Var, int i10, int i11) {
        super("PhotoFilterGLThread", false);
        this.D = new float[16];
        this.E = new int[1];
        this.d0 = new py(this, 1);
        this.a = surfaceTexture;
        this.n = i10;
        this.r = i11;
        this.s = bitmap;
        this.w = i7;
        this.H = y9Var;
        boolean z11 = y9Var != null;
        this.G = z11;
        if (z11) {
            da daVar = new da();
            this.I = daVar;
            y9 y9Var2 = daVar.t;
            if (y9Var2 != null && y9Var2.m != null) {
                y9Var2.m = null;
            }
            daVar.t = y9Var;
            if (y9Var != null && y9Var.m != daVar) {
                y9Var.m = daVar;
                y9Var.d();
            }
        }
        this.h = false;
        wy wyVar = new wy(false, null);
        this.J = wyVar;
        wyVar.i1 = z10;
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (z9) {
            fArr[2] = 0.0f;
            fArr[0] = 1.0f;
            fArr[6] = 0.0f;
            fArr[4] = 1.0f;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.Y = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        start();
    }

    public static void a(sy syVar) {
        uy uyVar;
        if (syVar.f) {
            syVar.b();
            if (syVar.y) {
                syVar.x.updateTexImage();
                syVar.x.getTransformMatrix(syVar.D);
                syVar.f();
                syVar.y = false;
                wy wyVar = syVar.J;
                wyVar.P0 = syVar.D;
                wyVar.W0 = false;
                syVar.F = true;
            }
            if (syVar.Z) {
                if (syVar.h && ((uyVar = syVar.J.f1) == null || uyVar.n())) {
                    GLES20.glViewport(0, 0, syVar.n, syVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(syVar.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, syVar.E[0]);
                    GLES20.glUniform1i(syVar.S, 0);
                    GLES20.glEnableVertexAttribArray(syVar.R);
                    int i7 = syVar.R;
                    FloatBuffer floatBuffer = syVar.Y;
                    if (floatBuffer == null) {
                        floatBuffer = syVar.J.a1;
                    }
                    GLES20.glVertexAttribPointer(i7, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(syVar.P);
                    GLES20.glVertexAttribPointer(syVar.P, 2, 5126, false, 8, (Buffer) syVar.J.b1);
                    GLES20.glUniformMatrix4fv(syVar.Q, 1, false, syVar.D, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    syVar.b.eglSwapBuffers(syVar.c, syVar.e);
                    da daVar = syVar.I;
                    if (daVar != null) {
                        daVar.a(syVar.E[0], syVar.W, syVar.X, syVar.D);
                        return;
                    }
                    return;
                }
                if (syVar.b0 == null || syVar.F) {
                    GLES20.glViewport(0, 0, syVar.U, syVar.V);
                    syVar.J.f();
                    syVar.J.d();
                    if (syVar.b0 == null) {
                        syVar.J.e();
                    }
                    syVar.J.c();
                    syVar.T = syVar.J.b();
                    syVar.c0 = true;
                }
                if (syVar.c0) {
                    GLES20.glViewport(0, 0, syVar.n, syVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = syVar.J.g(1 ^ (syVar.T ? 1 : 0));
                    GLES20.glUseProgram(syVar.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(syVar.N, 0);
                    GLES20.glEnableVertexAttribArray(syVar.M);
                    int i10 = syVar.M;
                    FloatBuffer floatBuffer2 = syVar.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = syVar.J.a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(syVar.L);
                    GLES20.glVertexAttribPointer(syVar.L, 2, 5126, false, 8, (Buffer) syVar.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    syVar.b.eglSwapBuffers(syVar.c, syVar.e);
                    da daVar2 = syVar.I;
                    if (daVar2 != null) {
                        daVar2.a(g10, syVar.U, syVar.V, null);
                    }
                }
            }
        }
    }

    public final void b() {
        if (this.d.equals(this.b.eglGetCurrentContext()) && this.e.equals(this.b.eglGetCurrentSurface(12377))) {
            return;
        }
        EGL10 egl10 = this.b;
        EGLDisplay eGLDisplay = this.c;
        EGLSurface eGLSurface = this.e;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) || !org.telegram.messenger.r2.a) {
            return;
        }
        org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglMakeCurrent failed "));
    }

    public final void c(boolean z9, boolean z10, boolean z11) {
        postRunnable(new qy(this, z9, z11, z10, 0));
    }

    public final void d(uy uyVar) {
        postRunnable(new fq(17, this, uyVar));
    }

    public final void f() {
        int i7;
        int i10;
        if (this.Z || (i7 = this.W) <= 0 || (i10 = this.X) <= 0) {
            return;
        }
        this.J.i(this.s, this.w, this.E[0], i7, i10);
        this.Z = true;
        wy wyVar = this.J;
        this.U = wyVar.X0;
        this.V = wyVar.Y0;
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
            y9 y9Var = this.H;
            if (y9Var != null) {
                synchronized (y9Var.f) {
                    try {
                        if (y9Var.g == eGLContext) {
                            y9Var.g = null;
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

    public final boolean g(fi.d7 d7Var) {
        int h;
        int h7;
        int a10 = d7Var != null ? d7Var.a() : 0;
        String y22 = a10 == 1 ? org.telegram.messenger.g0.y2(null, R.raw.hdr2sdr_hlg) : a10 == 2 ? org.telegram.messenger.g0.y2(null, R.raw.hdr2sdr_pq) : "";
        if (a10 != 0) {
            h = wy.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = wy.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", y22));
        } else {
            h = wy.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = wy.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
        }
        if (h == 0 || h7 == 0) {
            return false;
        }
        int i7 = this.O;
        if (i7 != 0) {
            GLES20.glDeleteProgram(i7);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.O = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.O, h7);
        GLES20.glBindAttribLocation(this.O, 0, "position");
        GLES20.glBindAttribLocation(this.O, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.O);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.O, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.O);
            this.O = 0;
        } else {
            this.P = GLES20.glGetAttribLocation(this.O, "position");
            this.R = GLES20.glGetAttribLocation(this.O, "inputTexCoord");
            this.S = GLES20.glGetUniformLocation(this.O, "sourceImage");
            this.Q = GLES20.glGetUniformLocation(this.O, "videoMatrix");
        }
        return true;
    }

    public final void h(int i7, int i10) {
        if (this.I == null) {
            return;
        }
        postRunnable(new oy(this, i7, i10, 2));
    }

    @Override // org.telegram.messenger.q5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        int i7;
        int i10;
        da daVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z9 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.r2.a) {
                org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else {
            int i11 = 2;
            if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    int[] iArr2 = {12440, 2, 12344};
                    y9 y9Var = this.H;
                    if (y9Var != null) {
                        synchronized (y9Var.f) {
                            try {
                                eGLContext = y9Var.g;
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
                        if (org.telegram.messenger.r2.a) {
                            org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglCreateContext failed "));
                        }
                        finish();
                    } else {
                        y9 y9Var2 = this.H;
                        if (y9Var2 != null) {
                            y9Var2.a(eglCreateContext);
                        }
                        SurfaceTexture surfaceTexture = this.a;
                        if (surfaceTexture != null) {
                            EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                            this.e = eglCreateWindowSurface;
                            if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                if (org.telegram.messenger.r2.a) {
                                    org.telegram.messenger.camera.q.t(this.b, new StringBuilder("createWindowSurface failed "));
                                }
                                finish();
                            } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                int h = wy.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h7 = wy.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
                                if (h != 0 && h7 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.K = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, h);
                                    GLES20.glAttachShader(this.K, h7);
                                    GLES20.glBindAttribLocation(this.K, 0, "position");
                                    GLES20.glBindAttribLocation(this.K, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.K);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.K, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        GLES20.glDeleteProgram(this.K);
                                        this.K = 0;
                                    } else {
                                        this.L = GLES20.glGetAttribLocation(this.K, "position");
                                        this.M = GLES20.glGetAttribLocation(this.K, "inputTexCoord");
                                        this.N = GLES20.glGetUniformLocation(this.K, "sourceImage");
                                    }
                                    if (g(null)) {
                                        Bitmap bitmap = this.s;
                                        if (bitmap != null) {
                                            i7 = bitmap.getWidth();
                                            i10 = this.s.getHeight();
                                        } else {
                                            i7 = this.W;
                                            i10 = this.X;
                                        }
                                        int i12 = i7;
                                        int i13 = i10;
                                        if (this.b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.D, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.x = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new ry(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            org.telegram.messenger.g0.h3(new py(this, i11));
                                        }
                                        if (this.G && (daVar = this.I) != null && !daVar.b(this.n / this.r, this.H.a)) {
                                            org.telegram.messenger.a8.d("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (this.J.a()) {
                                            if (i12 != 0 && i13 != 0) {
                                                this.J.i(this.s, this.w, this.E[0], i12, i13);
                                                this.Z = true;
                                                wy wyVar = this.J;
                                                this.U = wyVar.X0;
                                                this.V = wyVar.Y0;
                                            }
                                            z9 = true;
                                        } else {
                                            finish();
                                        }
                                    }
                                }
                            } else {
                                if (org.telegram.messenger.r2.a) {
                                    org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            }
                        } else {
                            finish();
                        }
                    }
                } else {
                    if (org.telegram.messenger.r2.a) {
                        org.telegram.messenger.a8.d("eglConfig not initialized");
                    }
                    finish();
                }
            } else {
                if (org.telegram.messenger.r2.a) {
                    org.telegram.messenger.camera.q.t(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z9;
        super.run();
    }

    public sy(SurfaceTexture surfaceTexture, bx bxVar, fi.d7 d7Var, y9 y9Var, int i7, int i10) {
        super("VideoFilterGLThread", false);
        this.D = new float[16];
        this.E = new int[1];
        this.d0 = new py(this, 1);
        this.a = surfaceTexture;
        this.n = i7;
        this.r = i10;
        this.b0 = bxVar;
        this.H = y9Var;
        boolean z9 = y9Var != null;
        this.G = z9;
        if (z9) {
            da daVar = new da();
            this.I = daVar;
            y9 y9Var2 = daVar.t;
            if (y9Var2 != null && y9Var2.m != null) {
                y9Var2.m = null;
            }
            daVar.t = y9Var;
            if (y9Var != null && y9Var.m != daVar) {
                y9Var.m = daVar;
                y9Var.d();
            }
        }
        this.h = true;
        this.J = new wy(true, d7Var);
        start();
    }
}
