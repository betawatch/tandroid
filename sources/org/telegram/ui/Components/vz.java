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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vz extends DispatchQueue {
    public final int[] B;
    public boolean C;
    public boolean D;
    public final ba E;
    public ha F;
    public final a00 G;
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
    public final ev Y;
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

    public vz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z4, boolean z10, ba baVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.y = new float[16];
        this.B = new int[1];
        this.a0 = new sz(this, 1);
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
        a00 a00Var = new a00(false, null);
        this.G = a00Var;
        a00Var.i1 = z10;
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

    public static void b(vz vzVar) {
        yz yzVar;
        if (vzVar.f) {
            vzVar.c();
            if (vzVar.x) {
                vzVar.w.updateTexImage();
                vzVar.w.getTransformMatrix(vzVar.y);
                vzVar.g();
                vzVar.x = false;
                a00 a00Var = vzVar.G;
                a00Var.P0 = vzVar.y;
                a00Var.W0 = false;
                vzVar.C = true;
            }
            if (vzVar.W) {
                if (vzVar.h && ((yzVar = vzVar.G.f1) == null || yzVar.b())) {
                    GLES20.glViewport(0, 0, vzVar.n, vzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(vzVar.L);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, vzVar.B[0]);
                    GLES20.glUniform1i(vzVar.P, 0);
                    GLES20.glEnableVertexAttribArray(vzVar.O);
                    int i10 = vzVar.O;
                    FloatBuffer floatBuffer = vzVar.V;
                    if (floatBuffer == null) {
                        floatBuffer = vzVar.G.a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(vzVar.M);
                    GLES20.glVertexAttribPointer(vzVar.M, 2, 5126, false, 8, (Buffer) vzVar.G.b1);
                    GLES20.glUniformMatrix4fv(vzVar.N, 1, false, vzVar.y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    vzVar.b.eglSwapBuffers(vzVar.c, vzVar.e);
                    ha haVar = vzVar.F;
                    if (haVar != null) {
                        haVar.a(vzVar.y, vzVar.B[0], vzVar.T, vzVar.U);
                        return;
                    }
                    return;
                }
                if (vzVar.Y == null || vzVar.C) {
                    GLES20.glViewport(0, 0, vzVar.R, vzVar.S);
                    vzVar.G.f();
                    vzVar.G.d();
                    if (vzVar.Y == null) {
                        vzVar.G.e();
                    }
                    vzVar.G.c();
                    vzVar.Q = vzVar.G.b();
                    vzVar.Z = true;
                }
                if (vzVar.Z) {
                    GLES20.glViewport(0, 0, vzVar.n, vzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = vzVar.G.g(1 ^ (vzVar.Q ? 1 : 0));
                    GLES20.glUseProgram(vzVar.H);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(vzVar.K, 0);
                    GLES20.glEnableVertexAttribArray(vzVar.J);
                    int i11 = vzVar.J;
                    FloatBuffer floatBuffer2 = vzVar.V;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = vzVar.G.a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(vzVar.I);
                    GLES20.glVertexAttribPointer(vzVar.I, 2, 5126, false, 8, (Buffer) vzVar.G.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    vzVar.b.eglSwapBuffers(vzVar.c, vzVar.e);
                    ha haVar2 = vzVar.F;
                    if (haVar2 != null) {
                        haVar2.a(null, g10, vzVar.R, vzVar.S);
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
        postRunnable(new tz(this, z4, z11, z10, 0));
    }

    public final void f(yz yzVar) {
        postRunnable(new em(20, this, yzVar));
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
        a00 a00Var = this.G;
        this.R = a00Var.X0;
        this.S = a00Var.Y0;
    }

    public final boolean h(ph.s6 s6Var) {
        int h;
        int h9;
        int a2 = s6Var != null ? s6Var.a() : 0;
        String readRes = a2 == 1 ? AndroidUtilities.readRes(R.raw.hdr2sdr_hlg) : a2 == 2 ? AndroidUtilities.readRes(R.raw.hdr2sdr_pq) : "";
        if (a2 != 0) {
            h = a00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h9 = a00.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", readRes));
        } else {
            h = a00.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h9 = a00.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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
        postRunnable(new rz(this, i10, i11, 2));
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
                                int h = a00.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h9 = a00.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                            surfaceTexture2.setOnFrameAvailableListener(new uz(this, 0));
                                            GLES20.glBindTexture(36197, this.B[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new sz(this, i12));
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
                                                a00 a00Var = this.G;
                                                this.R = a00Var.X0;
                                                this.S = a00Var.Y0;
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

    public vz(SurfaceTexture surfaceTexture, ev evVar, ph.s6 s6Var, ba baVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.y = new float[16];
        this.B = new int[1];
        this.a0 = new sz(this, 1);
        this.a = surfaceTexture;
        this.n = i10;
        this.r = i11;
        this.Y = evVar;
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
        this.G = new a00(true, s6Var);
        start();
    }
}
