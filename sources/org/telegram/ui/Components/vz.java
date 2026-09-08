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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vz extends DispatchQueue {
    public final int[] E;
    public boolean F;
    public boolean G;
    public final ja H;
    public pa I;
    public final zz J;
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
    public final kv b0;
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
    public final int v;
    public SurfaceTexture w;
    public boolean x;
    public final float[] y;

    public vz(SurfaceTexture surfaceTexture, Bitmap bitmap, int i10, boolean z10, boolean z11, ja jaVar, int i11, int i12) {
        super("PhotoFilterGLThread", false);
        this.y = new float[16];
        this.E = new int[1];
        this.d0 = new sz(this, 1);
        this.a = surfaceTexture;
        this.n = i11;
        this.r = i12;
        this.s = bitmap;
        this.v = i10;
        this.H = jaVar;
        boolean z12 = jaVar != null;
        this.G = z12;
        if (z12) {
            pa paVar = new pa();
            this.I = paVar;
            ja jaVar2 = paVar.t;
            if (jaVar2 != null && jaVar2.m != null) {
                jaVar2.m = null;
            }
            paVar.t = jaVar;
            if (jaVar != null && jaVar.m != paVar) {
                jaVar.m = paVar;
                jaVar.d();
            }
        }
        this.h = false;
        zz zzVar = new zz(false, null);
        this.J = zzVar;
        zzVar.i1 = z11;
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

    public static void b(vz vzVar) {
        yz yzVar;
        if (vzVar.f) {
            vzVar.c();
            if (vzVar.x) {
                vzVar.w.updateTexImage();
                vzVar.w.getTransformMatrix(vzVar.y);
                vzVar.g();
                vzVar.x = false;
                zz zzVar = vzVar.J;
                zzVar.P0 = vzVar.y;
                zzVar.W0 = false;
                vzVar.F = true;
            }
            if (vzVar.Z) {
                if (vzVar.h && ((yzVar = vzVar.J.f1) == null || yzVar.b())) {
                    GLES20.glViewport(0, 0, vzVar.n, vzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glUseProgram(vzVar.O);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, vzVar.E[0]);
                    GLES20.glUniform1i(vzVar.S, 0);
                    GLES20.glEnableVertexAttribArray(vzVar.R);
                    int i10 = vzVar.R;
                    FloatBuffer floatBuffer = vzVar.Y;
                    if (floatBuffer == null) {
                        floatBuffer = vzVar.J.a1;
                    }
                    GLES20.glVertexAttribPointer(i10, 2, 5126, false, 8, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(vzVar.P);
                    GLES20.glVertexAttribPointer(vzVar.P, 2, 5126, false, 8, (Buffer) vzVar.J.b1);
                    GLES20.glUniformMatrix4fv(vzVar.Q, 1, false, vzVar.y, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    vzVar.b.eglSwapBuffers(vzVar.c, vzVar.e);
                    pa paVar = vzVar.I;
                    if (paVar != null) {
                        paVar.a(vzVar.y, vzVar.E[0], vzVar.W, vzVar.X);
                        return;
                    }
                    return;
                }
                if (vzVar.b0 == null || vzVar.F) {
                    GLES20.glViewport(0, 0, vzVar.U, vzVar.V);
                    vzVar.J.f();
                    vzVar.J.d();
                    if (vzVar.b0 == null) {
                        vzVar.J.e();
                    }
                    vzVar.J.c();
                    vzVar.T = vzVar.J.b();
                    vzVar.c0 = true;
                }
                if (vzVar.c0) {
                    GLES20.glViewport(0, 0, vzVar.n, vzVar.r);
                    GLES20.glBindFramebuffer(36160, 0);
                    int g10 = vzVar.J.g(1 ^ (vzVar.T ? 1 : 0));
                    GLES20.glUseProgram(vzVar.K);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, g10);
                    GLES20.glUniform1i(vzVar.N, 0);
                    GLES20.glEnableVertexAttribArray(vzVar.M);
                    int i11 = vzVar.M;
                    FloatBuffer floatBuffer2 = vzVar.Y;
                    if (floatBuffer2 == null) {
                        floatBuffer2 = vzVar.J.a1;
                    }
                    GLES20.glVertexAttribPointer(i11, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glEnableVertexAttribArray(vzVar.L);
                    GLES20.glVertexAttribPointer(vzVar.L, 2, 5126, false, 8, (Buffer) vzVar.J.Z0);
                    GLES20.glDrawArrays(5, 0, 4);
                    vzVar.b.eglSwapBuffers(vzVar.c, vzVar.e);
                    pa paVar2 = vzVar.I;
                    if (paVar2 != null) {
                        paVar2.a(null, g10, vzVar.U, vzVar.V);
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
        org.telegram.messenger.wl.s(this.b, new StringBuilder("eglMakeCurrent failed "));
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        postRunnable(new tz(this, z10, z12, z11, 0));
    }

    public final void f(yz yzVar) {
        postRunnable(new zu(9, this, yzVar));
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
            ja jaVar = this.H;
            if (jaVar != null) {
                synchronized (jaVar.f) {
                    try {
                        if (jaVar.g == eGLContext) {
                            jaVar.g = null;
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
        if (this.Z || (i10 = this.W) <= 0 || (i11 = this.X) <= 0) {
            return;
        }
        this.J.i(this.s, this.v, this.E[0], i10, i11);
        this.Z = true;
        zz zzVar = this.J;
        this.U = zzVar.X0;
        this.V = zzVar.Y0;
    }

    public final boolean h(di.n8 n8Var) {
        int h;
        int h10;
        int a2 = n8Var != null ? n8Var.a() : 0;
        String readRes = a2 == 1 ? AndroidUtilities.readRes(R.raw.hdr2sdr_hlg) : a2 == 2 ? AndroidUtilities.readRes(R.raw.hdr2sdr_pq) : "";
        if (a2 != 0) {
            h = zz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = zz.h(35632, String.format(Locale.US, "%1$s\nvarying highp vec2 vTextureCoord;void main() {gl_FragColor = TEX(vTextureCoord);}", readRes));
        } else {
            h = zz.h(35633, "attribute vec4 position;uniform mat4 videoMatrix;attribute vec4 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = vec2(videoMatrix * inputTexCoord).xy;}");
            h10 = zz.h(35632, "#extension GL_OES_EGL_image_external : require\n" + "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}".replace("sampler2D", "samplerExternalOES"));
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

    public final void i(int i10, int i11) {
        if (this.I == null) {
            return;
        }
        postRunnable(new rz(this, i10, i11, 2));
    }

    @Override // org.telegram.messenger.DispatchQueue, java.lang.Thread, java.lang.Runnable
    public final void run() {
        EGLContext eGLContext;
        int i10;
        int i11;
        pa paVar;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.c = eglGetDisplay;
        boolean z10 = false;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.wl.s(this.b, new StringBuilder("eglGetDisplay failed "));
            }
            finish();
        } else {
            int i12 = 2;
            if (this.b.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!this.b.eglChooseConfig(this.c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.wl.s(this.b, new StringBuilder("eglChooseConfig failed "));
                    }
                    finish();
                } else if (iArr[0] > 0) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    int[] iArr2 = {12440, 2, 12344};
                    ja jaVar = this.H;
                    if (jaVar != null) {
                        synchronized (jaVar.f) {
                            try {
                                eGLContext = jaVar.g;
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
                            org.telegram.messenger.wl.s(this.b, new StringBuilder("eglCreateContext failed "));
                        }
                        finish();
                    } else {
                        ja jaVar2 = this.H;
                        if (jaVar2 != null) {
                            jaVar2.a(eglCreateContext);
                        }
                        SurfaceTexture surfaceTexture = this.a;
                        if (surfaceTexture != null) {
                            EGLSurface eglCreateWindowSurface = this.b.eglCreateWindowSurface(this.c, eGLConfig, surfaceTexture, null);
                            this.e = eglCreateWindowSurface;
                            if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.wl.s(this.b, new StringBuilder("createWindowSurface failed "));
                                }
                                finish();
                            } else if (this.b.eglMakeCurrent(this.c, eglCreateWindowSurface, eglCreateWindowSurface, this.d)) {
                                int h = zz.h(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 vTextureCoord;void main() {gl_Position = position;vTextureCoord = inputTexCoord;}");
                                int h10 = zz.h(35632, "varying highp vec2 vTextureCoord;uniform sampler2D sTexture;void main() {gl_FragColor = texture2D(sTexture, vTextureCoord);}");
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
                                    if (h(null)) {
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
                                            Matrix.setIdentityM(this.y, 0);
                                            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E[0]);
                                            this.w = surfaceTexture2;
                                            surfaceTexture2.setOnFrameAvailableListener(new uz(this, 0));
                                            GLES20.glBindTexture(36197, this.E[0]);
                                            GLES20.glTexParameterf(36197, 10240, 9729.0f);
                                            GLES20.glTexParameterf(36197, 10241, 9728.0f);
                                            GLES20.glTexParameteri(36197, 10242, 33071);
                                            GLES20.glTexParameteri(36197, 10243, 33071);
                                            AndroidUtilities.runOnUIThread(new sz(this, i12));
                                        }
                                        if (this.G && (paVar = this.I) != null && !paVar.b(this.n / this.r, this.H.a)) {
                                            FileLog.e("Failed to create uiBlurFramebuffer");
                                            this.G = false;
                                            this.I = null;
                                        }
                                        if (this.J.a()) {
                                            if (i13 != 0 && i14 != 0) {
                                                this.J.i(this.s, this.v, this.E[0], i13, i14);
                                                this.Z = true;
                                                zz zzVar = this.J;
                                                this.U = zzVar.X0;
                                                this.V = zzVar.Y0;
                                            }
                                            z10 = true;
                                        } else {
                                            finish();
                                        }
                                    }
                                }
                            } else {
                                if (BuildVars.LOGS_ENABLED) {
                                    org.telegram.messenger.wl.s(this.b, new StringBuilder("eglMakeCurrent failed "));
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
                    org.telegram.messenger.wl.s(this.b, new StringBuilder("eglInitialize failed "));
                }
                finish();
            }
        }
        this.f = z10;
        super.run();
    }

    public vz(SurfaceTexture surfaceTexture, kv kvVar, di.n8 n8Var, ja jaVar, int i10, int i11) {
        super("VideoFilterGLThread", false);
        this.y = new float[16];
        this.E = new int[1];
        this.d0 = new sz(this, 1);
        this.a = surfaceTexture;
        this.n = i10;
        this.r = i11;
        this.b0 = kvVar;
        this.H = jaVar;
        boolean z10 = jaVar != null;
        this.G = z10;
        if (z10) {
            pa paVar = new pa();
            this.I = paVar;
            ja jaVar2 = paVar.t;
            if (jaVar2 != null && jaVar2.m != null) {
                jaVar2.m = null;
            }
            paVar.t = jaVar;
            if (jaVar != null && jaVar.m != paVar) {
                jaVar.m = paVar;
                jaVar.d();
            }
        }
        this.h = true;
        this.J = new zz(true, n8Var);
        start();
    }
}
