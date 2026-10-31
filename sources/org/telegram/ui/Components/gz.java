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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gz extends org.telegram.messenger.s5 {
    public final float[] D;
    public final int[] E;
    public boolean F;
    public boolean G;
    public final s9 H;
    public x9 I;
    public final jz J;
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
    public final px b0;
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

    public gz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, s9 s9Var, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.D = new float[16];
        this.E = new int[1];
        this.d0 = new dz(this, 1);
        this.a = surfaceTexture;
        this.n = i11;
        this.r = i12;
        this.s = bitmap;
        this.w = i10;
        this.H = s9Var;
        boolean z12 = s9Var != null;
        this.G = z12;
        if (z12) {
            x9 x9Var = new x9();
            this.I = x9Var;
            s9 s9Var2 = x9Var.t;
            if (s9Var2 != null && s9Var2.m != null) {
                s9Var2.m = null;
            }
            x9Var.t = s9Var;
            if (s9Var != null && s9Var.m != x9Var) {
                s9Var.m = x9Var;
                s9Var.d();
            }
        }
        this.h = false;
        jz jzVar = new jz(false, null);
        this.J = jzVar;
        jzVar.i1 = z11;
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
        this.Y = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        start();
    }

    public static void a(gz gzVar) {
        iz izVar;
        if (gzVar.f) {
            gzVar.b();
            if (gzVar.y) {
                gzVar.x.updateTexImage();
                gzVar.x.getTransformMatrix(gzVar.D);
                gzVar.f();
                gzVar.y = false;
                jz jzVar = gzVar.J;
                jzVar.P0 = gzVar.D;
                jzVar.W0 = false;
                gzVar.F = true;
            }
            if (gzVar.Z) {
                if (gzVar.h && ((izVar = gzVar.J.f1) == null || izVar.e())) {
                    GLES20.glViewport(0, 0, gzVar.n, gzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(gzVar.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, gzVar.E[0]);
                    GLES20.glUniform1i(gzVar.S, 0);
                    GLES20.glEnableVertexAttribArray(gzVar.R);
                    int i10 = gzVar.R;
                    FloatBuffer floatBuffer = gzVar.Y;
                    if (floatBuffer == null) {
                        floatBuffer = gzVar.J.a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(gzVar.P);
                    GLES20.glVertexAttribPointer(gzVar.P, 2, 5126, false, 8, (Buffer) gzVar.J.b1);
                    GLES20.glUniformMatrix4fv(gzVar.Q, 1, false, gzVar.D, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    gzVar.b.eglSwapBuffers(gzVar.c, gzVar.e);
                    x9 x9Var = gzVar.I;
                    if (x9Var != null) {
                        x9Var.a(gzVar.E[0], gzVar.W, gzVar.X, gzVar.D);
                        return;
                    }
                    return;
                }
                if (gzVar.b0 == null || gzVar.F) {
                    GLES20.glViewport(0, 0, gzVar.U, gzVar.V);
                    gzVar.J.f();
                    gzVar.J.d();
                    if (gzVar.b0 == null) {
                        gzVar.J.e();
                    }
                    gzVar.J.c();
                    gzVar.T = gzVar.J.b();
                    gzVar.c0 = true;
                }
                if (gzVar.c0) {
                    GLES20.glViewport(0, 0, gzVar.n, gzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = gzVar.J.g(1 ^ (gzVar.T ? 1 : 0));
                    GLES20.glUseProgram(gzVar.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(gzVar.N, 0);
                    GLES20.glEnableVertexAttribArray(gzVar.M);
                    int i11 = gzVar.M;
                    FloatBuffer floatBuffer2 = gzVar.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = gzVar.J.a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(gzVar.L);
                    GLES20.glVertexAttribPointer(gzVar.L, 2, 5126, false, 8, (Buffer) gzVar.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    gzVar.b.eglSwapBuffers(gzVar.c, gzVar.e);
                    x9 x9Var2 = gzVar.I;
                    if (x9Var2 != null) {
                        x9Var2.a(g10, gzVar.U, gzVar.V, null);
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
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.d) || !org.telegram.messenger.v2.a) {
            return;
        }
        org.telegram.messenger.z20.t(this.b, new StringBuilder("eglMakeCurrent failed "));
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        postRunnable(new ez(this, z10, z12, z11, 0));
    }

    public final void d(iz izVar) {
        postRunnable(new at(11, this, izVar));
    }

    public final void f() {
        int i10;
        int i11;
        if (this.Z || (i10 = this.W) <= 0 || (i11 = this.X) <= 0) {
            return;
        }
        this.J.i(this.s, this.w, this.E[0], i10, i11);
        this.Z = true;
        jz jzVar = this.J;
        this.U = jzVar.X0;
        this.V = jzVar.Y0;
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
            s9 s9Var = this.H;
            if (s9Var != null) {
                synchronized (s9Var.f) {
                    try {
                        if (s9Var.g == eGLContext) {
                            s9Var.g = null;
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

    public final boolean g(vh.m5 m5Var) {
        int h;
        int h10;
        int a2 = m5Var != null ? m5Var.a() : 0;
        String y22 = a2 == 1 ? org.telegram.messenger.i0.y2(null, R.raw.hdr2sdr_hlg) : a2 == 2 ? org.telegram.messenger.i0.y2(null, R.raw.hdr2sdr_pq) : "";
        if (a2 != 0) {
            h = jz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = jz.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", y22));
        } else {
            h = jz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = jz.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
        }
        if (h == 0 || h10 == 0) {
            return false;
        }
        int i10 = this.O;
        if (i10 != 0) {
            GLES20.glDeleteProgram(i10);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.O = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.O, h10);
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

    public final void h(int i10, int i11) {
        if (this.I == null) {
            return;
        }
        postRunnable(new cz(this, i10, i11, 2));
    }

    @Override // org.telegram.messenger.s5, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        x9 x9Var;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (org.telegram.messenger.v2.a) {
                org.telegram.messenger.z20.t(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else {
            int i12 = 2;
            if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.z20.t(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    int[] iArr2 = {12440, 2, 12344};
                    s9 s9Var = this.H;
                    if (s9Var != null) {
                        synchronized (s9Var.f) {
                            try {
                                eGLContext = s9Var.g;
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
                        if (org.telegram.messenger.v2.a) {
                            org.telegram.messenger.z20.t(this.b, new StringBuilder("eglCreateContext failed "));
                        }
                        finish();
                    } else {
                        s9 s9Var2 = this.H;
                        if (s9Var2 != null) {
                            s9Var2.a(eglCreateContext);
                        }
                        SurfaceTexture surfaceTexture = this.a;
                        if (surfaceTexture != null) {
                            EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                            this.e = eglCreateWindowSurface;
                            if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                if (org.telegram.messenger.v2.a) {
                                    org.telegram.messenger.z20.t(this.b, new StringBuilder("createWindowSurface failed "));
                                }
                                finish();
                            } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                int h = jz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = jz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
                                if (h != 0 && h10 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.K = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, h);
                                    GLES20.glAttachShader(this.K, h10);
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
                                            i10 = bitmap.getWidth();
                                            i11 = this.s.getHeight();
                                        } else {
                                            i10 = this.W;
                                            i11 = this.X;
                                        }
                                        int i13 = i10;
                                        int i14 = i11;
                                        if (this.b0 != null) {
                                            GLES20.glGenTextures(1, this.E, 0);
                                            Matrix.setIdentityM(this.D, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.x = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new fz(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            org.telegram.messenger.i0.g3(new dz(this, i12));
                                        }
                                        if (this.G && (x9Var = this.I) != null && !x9Var.b(this.n / this.r, this.H.a)) {
                                            org.telegram.messenger.f8.d("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (this.J.a()) {
                                            if (i13 != 0 && i14 != 0) {
                                                this.J.i(this.s, this.w, this.E[0], i13, i14);
                                                this.Z = true;
                                                jz jzVar = this.J;
                                                this.U = jzVar.X0;
                                                this.V = jzVar.Y0;
                                            }
                                            z10 = true;
                                        } else {
                                            finish();
                                        }
                                    }
                                }
                            } else {
                                if (org.telegram.messenger.v2.a) {
                                    org.telegram.messenger.z20.t(this.b, new StringBuilder("eglMakeCurrent failed "));
                                }
                                finish();
                            }
                        } else {
                            finish();
                        }
                    }
                } else {
                    if (org.telegram.messenger.v2.a) {
                        org.telegram.messenger.f8.d("eglConfig not initialized");
                    }
                    finish();
                }
            } else {
                if (org.telegram.messenger.v2.a) {
                    org.telegram.messenger.z20.t(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }

    public gz(SurfaceTexture surfaceTexture, px pxVar, vh.m5 m5Var, s9 s9Var, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.D = new float[16];
        this.E = new int[1];
        this.d0 = new dz(this, 1);
        this.a = surfaceTexture;
        this.n = i10;
        this.r = i11;
        this.b0 = pxVar;
        this.H = s9Var;
        boolean z10 = s9Var != null;
        this.G = z10;
        if (z10) {
            x9 x9Var = new x9();
            this.I = x9Var;
            s9 s9Var2 = x9Var.t;
            if (s9Var2 != null && s9Var2.m != null) {
                s9Var2.m = null;
            }
            x9Var.t = s9Var;
            if (s9Var != null && s9Var.m != x9Var) {
                s9Var.m = x9Var;
                s9Var.d();
            }
        }
        this.h = true;
        this.J = new jz(true, m5Var);
        start();
    }
}
