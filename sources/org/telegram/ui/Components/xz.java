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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xz extends DispatchQueue {
    public final int[] B;
    public boolean C;
    public boolean D;
    public final ba E;
    public ha F;
    public final b00 G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final FloatBuffer V;
    public boolean W;
    public long X;
    public final hv Y;
    public boolean Z;
    public final SurfaceTexture a;
    public final Runnable a0;
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

    public xz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z4, boolean z10, ba baVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.y = new float[16];
        this.B = new int[1];
        this.a0 = new uz(this, 1);
        this.a = surfaceTexture;
        this.n = i11;
        this.r = i12;
        this.s = bitmap;
        this.v = i10;
        this.E = baVar;
        boolean z11 = baVar != null;
        this.D = z11;
        if (z11) {
            ha haVar = new ha();
            this.F = haVar;
            ba baVar2 = haVar.t;
            if (baVar2 != null && baVar2.m != null) {
                baVar2.m = null;
            }
            haVar.t = baVar;
            if (baVar != null && baVar.m != haVar) {
                baVar.m = haVar;
                baVar.d();
            }
        }
        this.h = false;
        b00 b00Var = new b00(false, null);
        this.G = b00Var;
        b00Var.i1 = z10;
        float[] fArr = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        if (z4) {
            fArr[2] = 0.0f;
            fArr[0] = 1.0f;
            fArr[6] = 0.0f;
            fArr[4] = 1.0f;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        this.V = asFloatBuffer;
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        start();
    }

    public static void b(xz xzVar) {
        a00 a00Var;
        if (xzVar.f) {
            xzVar.c();
            if (xzVar.x) {
                xzVar.w.updateTexImage();
                xzVar.w.getTransformMatrix(xzVar.y);
                xzVar.g();
                xzVar.x = false;
                b00 b00Var = xzVar.G;
                b00Var.P0 = xzVar.y;
                b00Var.W0 = false;
                xzVar.C = true;
            }
            if (xzVar.W) {
                if (xzVar.h && ((a00Var = xzVar.G.f1) == null || a00Var.b())) {
                    GLES20.glViewport(0, 0, xzVar.n, xzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(xzVar.L);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, xzVar.B[0]);
                    GLES20.glUniform1i(xzVar.P, 0);
                    GLES20.glEnableVertexAttribArray(xzVar.O);
                    int i10 = xzVar.O;
                    FloatBuffer floatBuffer = xzVar.V;
                    if (floatBuffer == null) {
                        floatBuffer = xzVar.G.a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(xzVar.M);
                    GLES20.glVertexAttribPointer(xzVar.M, 2, 5126, false, 8, (Buffer) xzVar.G.b1);
                    GLES20.glUniformMatrix4fv(xzVar.N, 1, false, xzVar.y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    xzVar.b.eglSwapBuffers(xzVar.c, xzVar.e);
                    ha haVar = xzVar.F;
                    if (haVar != null) {
                        haVar.a(xzVar.y, xzVar.B[0], xzVar.T, xzVar.U);
                        return;
                    }
                    return;
                }
                if (xzVar.Y == null || xzVar.C) {
                    GLES20.glViewport(0, 0, xzVar.R, xzVar.S);
                    xzVar.G.f();
                    xzVar.G.d();
                    if (xzVar.Y == null) {
                        xzVar.G.e();
                    }
                    xzVar.G.c();
                    xzVar.Q = xzVar.G.b();
                    xzVar.Z = true;
                }
                if (xzVar.Z) {
                    GLES20.glViewport(0, 0, xzVar.n, xzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = xzVar.G.g(1 ^ (xzVar.Q ? 1 : 0));
                    GLES20.glUseProgram(xzVar.H);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(xzVar.K, 0);
                    GLES20.glEnableVertexAttribArray(xzVar.J);
                    int i11 = xzVar.J;
                    FloatBuffer floatBuffer2 = xzVar.V;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = xzVar.G.a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(xzVar.I);
                    GLES20.glVertexAttribPointer(xzVar.I, 2, 5126, false, 8, (Buffer) xzVar.G.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    xzVar.b.eglSwapBuffers(xzVar.c, xzVar.e);
                    ha haVar2 = xzVar.F;
                    if (haVar2 != null) {
                        haVar2.a(null, g10, xzVar.R, xzVar.S);
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
        org.telegram.messenger.y3.u(this.b, new StringBuilder("eglMakeCurrent failed "));
    }

    public final void e(boolean z4, boolean z10, boolean z11) {
        postRunnable(new vz(this, z4, z11, z10, 0));
    }

    public final void f(a00 a00Var) {
        postRunnable(new gm(20, this, a00Var));
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
            ba baVar = this.E;
            if (baVar != null) {
                synchronized (baVar.f) {
                    try {
                        if (baVar.g == eGLContext) {
                            baVar.g = null;
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
        if (this.W || (i10 = this.T) <= 0 || (i11 = this.U) <= 0) {
            return;
        }
        this.G.i(this.s, this.v, this.B[0], i10, i11);
        this.W = true;
        b00 b00Var = this.G;
        this.R = b00Var.X0;
        this.S = b00Var.Y0;
    }

    public final boolean h(qh.r6 r6Var) {
        int h;
        int h9;
        int a2 = r6Var != null ? r6Var.a() : 0;
        String readRes = a2 == 1 ? AndroidUtilities.readRes(R.raw.hdr2sdr_hlg) : a2 == 2 ? AndroidUtilities.readRes(R.raw.hdr2sdr_pq) : "";
        if (a2 != 0) {
            h = b00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h9 = b00.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", readRes));
        } else {
            h = b00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h9 = b00.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
        }
        if (h == 0 || h9 == 0) {
            return false;
        }
        int i10 = this.L;
        if (i10 != 0) {
            GLES20.glDeleteProgram(i10);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.L = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glAttachShader(this.L, h9);
        GLES20.glBindAttribLocation(this.L, 0, "position");
        GLES20.glBindAttribLocation(this.L, 1, "inputTexCoord");
        GLES20.glLinkProgram(this.L);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.L, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.L);
            this.L = 0;
        } else {
            this.M = GLES20.glGetAttribLocation(this.L, "position");
            this.O = GLES20.glGetAttribLocation(this.L, "inputTexCoord");
            this.P = GLES20.glGetUniformLocation(this.L, "sourceImage");
            this.N = GLES20.glGetUniformLocation(this.L, "videoMatrix");
        }
        return true;
    }

    public final void i(int i10, int i11) {
        if (this.F == null) {
            return;
        }
        postRunnable(new tz(this, i10, i11, 2));
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        ha haVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z4 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.y3.u(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else {
            int i12 = 2;
            if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.y3.u(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    int[] iArr2 = {12440, 2, 12344};
                    ba baVar = this.E;
                    if (baVar != null) {
                        synchronized (baVar.f) {
                            try {
                                eGLContext = baVar.g;
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
                            org.telegram.messenger.y3.u(this.b, new StringBuilder("eglCreateContext failed "));
                        }
                        finish();
                    } else {
                        ba baVar2 = this.E;
                        if (baVar2 != null) {
                            baVar2.a(eglCreateContext);
                        }
                        SurfaceTexture surfaceTexture = this.a;
                        if (surfaceTexture != null) {
                            EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                            this.e = eglCreateWindowSurface;
                            if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.y3.u(this.b, new StringBuilder("createWindowSurface failed "));
                                }
                                finish();
                            } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                int h = b00.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h9 = b00.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
                                if (h != 0 && h9 != 0) {
                                    int glCreateProgram = GLES20.glCreateProgram();
                                    this.H = glCreateProgram;
                                    GLES20.glAttachShader(glCreateProgram, h);
                                    GLES20.glAttachShader(this.H, h9);
                                    GLES20.glBindAttribLocation(this.H, 0, "position");
                                    GLES20.glBindAttribLocation(this.H, 1, "inputTexCoord");
                                    GLES20.glLinkProgram(this.H);
                                    int[] iArr3 = new int[1];
                                    GLES20.glGetProgramiv(this.H, 35714, iArr3, 0);
                                    if (iArr3[0] == 0) {
                                        GLES20.glDeleteProgram(this.H);
                                        this.H = 0;
                                    } else {
                                        this.I = GLES20.glGetAttribLocation(this.H, "position");
                                        this.J = GLES20.glGetAttribLocation(this.H, "inputTexCoord");
                                        this.K = GLES20.glGetUniformLocation(this.H, "sourceImage");
                                    }
                                    if (h(null)) {
                                        Bitmap bitmap = this.s;
                                        if (bitmap != null) {
                                            i10 = bitmap.getWidth();
                                            i11 = this.s.getHeight();
                                        } else {
                                            i10 = this.T;
                                            i11 = this.U;
                                        }
                                        int i13 = i10;
                                        int i14 = i11;
                                        if (this.Y != null) {
                                            GLES20.glGenTextures(1, this.B, 0);
                                            Matrix.setIdentityM(this.y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.B[0]);
                                            this.w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new wz(this, 0));
                                            GLES20.glBindTexture(36197, this.B[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new uz(this, i12));
                                        }
                                        if (this.D && (haVar = this.F) != null && !haVar.b(this.n / this.r, this.E.a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.D = false;
                                            this.F = null;
                                        }
                                        if (this.G.a()) {
                                            if (i13 != 0 && i14 != 0) {
                                                this.G.i(this.s, this.v, this.B[0], i13, i14);
                                                this.W = true;
                                                b00 b00Var = this.G;
                                                this.R = b00Var.X0;
                                                this.S = b00Var.Y0;
                                            }
                                            z4 = true;
                                        } else {
                                            finish();
                                        }
                                    }
                                }
                            } else {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.y3.u(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                    org.telegram.messenger.y3.u(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z4;
        super.run();
    }

    public xz(SurfaceTexture surfaceTexture, hv hvVar, qh.r6 r6Var, ba baVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.y = new float[16];
        this.B = new int[1];
        this.a0 = new uz(this, 1);
        this.a = surfaceTexture;
        this.n = i10;
        this.r = i11;
        this.Y = hvVar;
        this.E = baVar;
        boolean z4 = baVar != null;
        this.D = z4;
        if (z4) {
            ha haVar = new ha();
            this.F = haVar;
            ba baVar2 = haVar.t;
            if (baVar2 != null && baVar2.m != null) {
                baVar2.m = null;
            }
            haVar.t = baVar;
            if (baVar != null && baVar.m != haVar) {
                baVar.m = haVar;
                baVar.d();
            }
        }
        this.h = true;
        this.G = new b00(true, r6Var);
        start();
    }
}
