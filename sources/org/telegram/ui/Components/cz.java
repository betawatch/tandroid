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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cz extends org.telegram.messenger.r5 {
    public final float[] E;
    public final int[] F;
    public boolean G;
    public boolean H;
    public final ca I;
    public ha J;
    public final fz K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public final FloatBuffer Z;
    public final SurfaceTexture a;
    public boolean a0;
    public EGL10 b;
    public long b0;
    public EGLDisplay c;
    public final iy c0;
    public EGLContext d;
    public boolean d0;
    public EGLSurface e;
    public final Runnable e0;
    public boolean f;
    public final boolean h;
    public volatile int n;
    public volatile int r;
    public Bitmap s;
    public final int w;
    public SurfaceTexture x;
    public boolean y;

    public cz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i7, boolean z10, boolean z11, ca caVar, int i10, int i11) {
        super("PhotoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.e0 = new zy(this, 1);
        this.a = surfaceTexture;
        this.n = i10;
        this.r = i11;
        this.s = bitmap;
        this.w = i7;
        this.I = caVar;
        boolean z12 = caVar != null;
        this.H = z12;
        if (z12) {
            ha haVar = new ha();
            this.J = haVar;
            ca caVar2 = haVar.t;
            if (caVar2 != null && caVar2.m != null) {
                caVar2.m = null;
            }
            haVar.t = caVar;
            if (caVar != null && caVar.m != haVar) {
                caVar.m = haVar;
                caVar.d();
            }
        }
        this.h = false;
        fz fzVar = new fz(false, null);
        this.K = fzVar;
        fzVar.i1 = z11;
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
        this.Z = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        start();
    }

    public static void a(cz czVar) {
        ez ezVar;
        if (czVar.f) {
            czVar.b();
            if (czVar.y) {
                czVar.x.updateTexImage();
                czVar.x.getTransformMatrix(czVar.E);
                czVar.f();
                czVar.y = false;
                fz fzVar = czVar.K;
                fzVar.P0 = czVar.E;
                fzVar.W0 = false;
                czVar.G = true;
            }
            if (czVar.a0) {
                if (czVar.h && ((ezVar = czVar.K.f1) == null || ezVar.q())) {
                    GLES20.glViewport(0, 0, czVar.n, czVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(czVar.P);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, czVar.F[0]);
                    GLES20.glUniform1i(czVar.T, 0);
                    GLES20.glEnableVertexAttribArray(czVar.S);
                    int i7 = czVar.S;
                    FloatBuffer floatBuffer = czVar.Z;
                    if (floatBuffer == null) {
                        floatBuffer = czVar.K.a1;
                    }
                    GLES20.glVertexAttribPointer(i7, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(czVar.Q);
                    GLES20.glVertexAttribPointer(czVar.Q, 2, 5126, false, 8, (Buffer) czVar.K.b1);
                    GLES20.glUniformMatrix4fv(czVar.R, 1, false, czVar.E, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    czVar.b.eglSwapBuffers(czVar.c, czVar.e);
                    ha haVar = czVar.J;
                    if (haVar != null) {
                        haVar.a(czVar.F[0], czVar.X, czVar.Y, czVar.E);
                        return;
                    }
                    return;
                }
                if (czVar.c0 == null || czVar.G) {
                    GLES20.glViewport(0, 0, czVar.V, czVar.W);
                    czVar.K.f();
                    czVar.K.d();
                    if (czVar.c0 == null) {
                        czVar.K.e();
                    }
                    czVar.K.c();
                    czVar.U = czVar.K.b();
                    czVar.d0 = true;
                }
                if (czVar.d0) {
                    GLES20.glViewport(0, 0, czVar.n, czVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = czVar.K.g(1 ^ (czVar.U ? 1 : 0));
                    GLES20.glUseProgram(czVar.L);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(czVar.O, 0);
                    GLES20.glEnableVertexAttribArray(czVar.N);
                    int i10 = czVar.N;
                    FloatBuffer floatBuffer2 = czVar.Z;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = czVar.K.a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(czVar.M);
                    GLES20.glVertexAttribPointer(czVar.M, 2, 5126, false, 8, (Buffer) czVar.K.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    czVar.b.eglSwapBuffers(czVar.c, czVar.e);
                    ha haVar2 = czVar.J;
                    if (haVar2 != null) {
                        haVar2.a(g10, czVar.V, czVar.W, null);
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
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) || !org.telegram.messenger.s2.a) {
            return;
        }
        org.telegram.messenger.n10.v(this.b, new StringBuilder("eglMakeCurrent failed "));
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        postRunnable(new az(this, z10, z12, z11, 0));
    }

    public final void d(ez ezVar) {
        postRunnable(new dw(7, this, ezVar));
    }

    public final void f() {
        int i7;
        int i10;
        if (this.a0 || (i7 = this.X) <= 0 || (i10 = this.Y) <= 0) {
            return;
        }
        this.K.i(this.s, this.w, this.F[0], i7, i10);
        this.a0 = true;
        fz fzVar = this.K;
        this.V = fzVar.X0;
        this.W = fzVar.Y0;
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
            ca caVar = this.I;
            if (caVar != null) {
                synchronized (caVar.f) {
                    try {
                        if (caVar.g == eGLContext) {
                            caVar.g = null;
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

    public final boolean g(hi.c7 c7Var) {
        int h;
        int h7;
        int a10 = c7Var != null ? c7Var.a() : 0;
        String y22 = a10 == 1 ? org.telegram.messenger.g0.y2(null, R.raw.hdr2sdr_hlg) : a10 == 2 ? org.telegram.messenger.g0.y2(null, R.raw.hdr2sdr_pq) : "";
        if (a10 != 0) {
            h = fz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = fz.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", y22));
        } else {
            h = fz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h7 = fz.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
        }
        if (h == 0 || h7 == 0) {
            return false;
        }
        int i7 = this.P;
        if (i7 != 0) {
            GLES20.glDeleteProgram(i7);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.P = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.P, h7);
        GLES20.glBindAttribLocation(this.P, 0, "position");
        GLES20.glBindAttribLocation(this.P, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.P);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.P, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.P);
            this.P = 0;
        } else {
            this.Q = GLES20.glGetAttribLocation(this.P, "position");
            this.S = GLES20.glGetAttribLocation(this.P, "inputTexCoord");
            this.T = GLES20.glGetUniformLocation(this.P, "sourceImage");
            this.R = GLES20.glGetUniformLocation(this.P, "videoMatrix");
        }
        return true;
    }

    public final void h(int i7, int i10) {
        if (this.J == null) {
            return;
        }
        postRunnable(new yy(this, i7, i10, 2));
    }

    @Override // org.telegram.messenger.r5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        int i7;
        int i10;
        ha haVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.s2.a) {
                org.telegram.messenger.n10.v(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else {
            int i11 = 2;
            if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.n10.v(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    int[] iArr2 = {12440, 2, 12344};
                    ca caVar = this.I;
                    if (caVar != null) {
                        synchronized (caVar.f) {
                            try {
                                eGLContext = caVar.g;
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
                        if (org.telegram.messenger.s2.a) {
                            org.telegram.messenger.n10.v(this.b, new StringBuilder("eglCreateContext failed "));
                        }
                        finish();
                    } else {
                        ca caVar2 = this.I;
                        if (caVar2 != null) {
                            caVar2.a(eglCreateContext);
                        }
                        SurfaceTexture surfaceTexture = this.a;
                        if (surfaceTexture != null) {
                            EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                            this.e = eglCreateWindowSurface;
                            if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                if (org.telegram.messenger.s2.a) {
                                    org.telegram.messenger.n10.v(this.b, new StringBuilder("createWindowSurface failed "));
                                }
                                finish();
                            } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                int h = fz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h7 = fz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
                                if (h != 0 && h7 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.L = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, h);
                                    GLES20.glAttachShader(this.L, h7);
                                    GLES20.glBindAttribLocation(this.L, 0, "position");
                                    GLES20.glBindAttribLocation(this.L, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.L);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.L, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        GLES20.glDeleteProgram(this.L);
                                        this.L = 0;
                                    } else {
                                        this.M = GLES20.glGetAttribLocation(this.L, "position");
                                        this.N = GLES20.glGetAttribLocation(this.L, "inputTexCoord");
                                        this.O = GLES20.glGetUniformLocation(this.L, "sourceImage");
                                    }
                                    if (g(null)) {
                                        Bitmap bitmap = this.s;
                                        if (bitmap != null) {
                                            i7 = bitmap.getWidth();
                                            i10 = this.s.getHeight();
                                        } else {
                                            i7 = this.X;
                                            i10 = this.Y;
                                        }
                                        int i12 = i7;
                                        int i13 = i10;
                                        if (this.c0 != null) {
                                            GLES20.glGenTextures(1, this.F, 0);
                                            Matrix.setIdentityM(this.E, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.F[0]);
                                            this.x = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new bz(this, 0));
                                            GLES20.glBindTexture(36197, this.F[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            org.telegram.messenger.g0.g3(new zy(this, i11));
                                        }
                                        if (this.H && (haVar = this.J) != null && !haVar.b(this.n / this.r, this.I.a)) {
                                            org.telegram.messenger.a8.d("Failed to create uiBlurFramebuffer");
                                            this.H = false;
                                            this.J = null;
                                        }
                                        if (this.K.a()) {
                                            if (i12 != 0 && i13 != 0) {
                                                this.K.i(this.s, this.w, this.F[0], i12, i13);
                                                this.a0 = true;
                                                fz fzVar = this.K;
                                                this.V = fzVar.X0;
                                                this.W = fzVar.Y0;
                                            }
                                            z10 = true;
                                        } else {
                                            finish();
                                        }
                                    }
                                }
                            } else {
                                if (org.telegram.messenger.s2.a) {
                                    org.telegram.messenger.n10.v(this.b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            }
                        } else {
                            finish();
                        }
                    }
                } else {
                    if (org.telegram.messenger.s2.a) {
                        org.telegram.messenger.a8.d("eglConfig not initialized");
                    }
                    finish();
                }
            } else {
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.n10.v(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }

    public cz(SurfaceTexture surfaceTexture, iy iyVar, hi.c7 c7Var, ca caVar, int i7, int i10) {
        super("VideoFilterGLThread", false);
        this.E = new float[16];
        this.F = new int[1];
        this.e0 = new zy(this, 1);
        this.a = surfaceTexture;
        this.n = i7;
        this.r = i10;
        this.c0 = iyVar;
        this.I = caVar;
        boolean z10 = caVar != null;
        this.H = z10;
        if (z10) {
            ha haVar = new ha();
            this.J = haVar;
            ca caVar2 = haVar.t;
            if (caVar2 != null && caVar2.m != null) {
                caVar2.m = null;
            }
            haVar.t = caVar;
            if (caVar != null && caVar.m != haVar) {
                caVar.m = haVar;
                caVar.d();
            }
        }
        this.h = true;
        this.K = new fz(true, c7Var);
        start();
    }
}
