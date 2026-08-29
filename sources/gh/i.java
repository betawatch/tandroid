package gh;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i extends Thread {
    public EGLContext A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int[] K;
    public float L;
    public final /* synthetic */ j M;
    public final f c;
    public final SurfaceTexture d;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public EGL10 v;
    public EGLDisplay w;
    public EGLConfig x;
    public EGLSurface y;
    public volatile boolean a = true;
    public volatile boolean b = false;
    public final Object e = new Object();
    public final float s = AndroidUtilities.dpf2(1.2f);
    public boolean I = true;
    public int J = 0;

    public i(j jVar, SurfaceTexture surfaceTexture, int i10, int i11, f fVar) {
        this.M = jVar;
        this.c = fVar;
        this.d = surfaceTexture;
        this.h = i10;
        this.n = i11;
        this.r = (int) Utilities.clamp(((i10 * i11) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
    }

    public static void a() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            FileLog.e("spoiler gles error " + glGetError);
        }
    }

    public final void b() {
        int[] iArr = this.K;
        if (iArr != null) {
            GLES20.glDeleteBuffers(2, iArr, 0);
        }
        int[] iArr2 = new int[2];
        this.K = iArr2;
        GLES20.glGenBuffers(2, iArr2, 0);
        for (int i10 = 0; i10 < 2; i10++) {
            GLES20.glBindBuffer(34962, this.K[i10]);
            GLES20.glBufferData(34962, this.r * 24, null, 35048);
        }
        a();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i10;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.v = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(0);
        this.w = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            this.a = false;
        } else {
            if (this.v.eglInitialize(eglGetDisplay, new int[2])) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (this.v.eglChooseConfig(this.w, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    this.x = eGLConfig;
                    EGLContext eglCreateContext = this.v.eglCreateContext(this.w, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
                    this.A = eglCreateContext;
                    if (eglCreateContext == null) {
                        this.a = false;
                    } else {
                        EGLSurface eglCreateWindowSurface = this.v.eglCreateWindowSurface(this.w, this.x, this.d, null);
                        this.y = eglCreateWindowSurface;
                        if (eglCreateWindowSurface == null) {
                            this.a = false;
                        } else if (this.v.eglMakeCurrent(this.w, eglCreateWindowSurface, eglCreateWindowSurface, this.A)) {
                            b();
                            int glCreateShader = GLES20.glCreateShader(35633);
                            int glCreateShader2 = GLES20.glCreateShader(35632);
                            if (glCreateShader == 0 || glCreateShader2 == 0) {
                                this.a = false;
                            } else {
                                GLES20.glShaderSource(glCreateShader, AndroidUtilities.readRes(R.raw.spoiler_vertex));
                                GLES20.glCompileShader(glCreateShader);
                                int[] iArr = new int[1];
                                GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
                                if (iArr[0] == 0) {
                                    FileLog.e("SpoilerEffect2, compile vertex shader error: " + GLES20.glGetShaderInfoLog(glCreateShader));
                                    GLES20.glDeleteShader(glCreateShader);
                                    this.a = false;
                                } else {
                                    GLES20.glShaderSource(glCreateShader2, AndroidUtilities.readRes(R.raw.spoiler_fragment));
                                    GLES20.glCompileShader(glCreateShader2);
                                    GLES20.glGetShaderiv(glCreateShader2, 35713, iArr, 0);
                                    if (iArr[0] == 0) {
                                        FileLog.e("SpoilerEffect2, compile fragment shader error: " + GLES20.glGetShaderInfoLog(glCreateShader2));
                                        GLES20.glDeleteShader(glCreateShader2);
                                        this.a = false;
                                    } else {
                                        int glCreateProgram = GLES20.glCreateProgram();
                                        this.B = glCreateProgram;
                                        if (glCreateProgram == 0) {
                                            this.a = false;
                                        } else {
                                            GLES20.glAttachShader(glCreateProgram, glCreateShader);
                                            GLES20.glAttachShader(this.B, glCreateShader2);
                                            GLES30.glTransformFeedbackVaryings(this.B, new String[]{"outPosition", "outVelocity", "outTime", "outDuration"}, 35980);
                                            GLES20.glLinkProgram(this.B);
                                            GLES20.glGetProgramiv(this.B, 35714, iArr, 0);
                                            if (iArr[0] == 0) {
                                                FileLog.e("SpoilerEffect2, link draw program error: " + GLES20.glGetProgramInfoLog(this.B));
                                                this.a = false;
                                            } else {
                                                this.C = GLES20.glGetUniformLocation(this.B, "reset");
                                                this.D = GLES20.glGetUniformLocation(this.B, "time");
                                                this.E = GLES20.glGetUniformLocation(this.B, "deltaTime");
                                                this.F = GLES20.glGetUniformLocation(this.B, "size");
                                                this.G = GLES20.glGetUniformLocation(this.B, "r");
                                                this.H = GLES20.glGetUniformLocation(this.B, "seed");
                                                GLES20.glViewport(0, 0, this.h, this.n);
                                                GLES20.glEnable(3042);
                                                GLES20.glBlendFunc(770, 771);
                                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                                                GLES20.glUseProgram(this.B);
                                                GLES20.glUniform2f(this.F, this.h, this.n);
                                                GLES20.glUniform1f(this.C, this.I ? 1.0f : 0.0f);
                                                GLES20.glUniform1f(this.G, this.s);
                                                GLES20.glUniform1f(this.H, Utilities.fastRandom.nextInt(256) / 256.0f);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            this.a = false;
                        }
                    }
                } else {
                    this.a = false;
                }
            } else {
                this.a = false;
            }
        }
        long nanoTime = System.nanoTime();
        while (this.a) {
            long nanoTime2 = System.nanoTime();
            double d = (nanoTime2 - nanoTime) / 1.0E9d;
            j jVar = this.M;
            double d10 = jVar.a;
            if (d < d10) {
                double d11 = d10 - d;
                long j10 = (long) (d11 * 1000.0d);
                i10 = 3;
                try {
                    Thread.sleep(j10, (int) ((d11 - (j10 / 1000.0d)) * 1.0E9d));
                } catch (Exception unused) {
                }
                d = this.M.a;
            } else {
                i10 = 3;
                double d12 = jVar.b;
                if (d > d12) {
                    d = d12;
                }
            }
            while (this.b) {
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused2) {
                }
            }
            synchronized (this.e) {
                try {
                    if (this.f) {
                        GLES20.glUniform2f(this.F, this.h, this.n);
                        GLES20.glViewport(0, 0, this.h, this.n);
                        int clamp = (int) Utilities.clamp(((this.h * this.n) / 250000.0f) * 1000.0f, 10000.0f, 500.0f);
                        if (clamp > this.r) {
                            this.I = true;
                            b();
                        }
                        this.r = clamp;
                        this.f = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            float f9 = (float) d;
            EGL10 egl102 = this.v;
            EGLDisplay eGLDisplay = this.w;
            EGLSurface eGLSurface = this.y;
            if (egl102.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
                float f10 = f9 * 0.65f;
                float f11 = this.L + f10;
                this.L = f11;
                if (f11 > 1000.0f) {
                    this.L = 0.0f;
                }
                GLES20.glClear(16384);
                GLES20.glBindBuffer(34962, this.K[this.J]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i10);
                GLES30.glBindBufferBase(35982, 0, this.K[1 - this.J]);
                GLES20.glVertexAttribPointer(0, 2, 5126, false, 24, 0);
                GLES20.glEnableVertexAttribArray(0);
                GLES20.glVertexAttribPointer(1, 2, 5126, false, 24, 8);
                GLES20.glEnableVertexAttribArray(1);
                GLES20.glVertexAttribPointer(2, 1, 5126, false, 24, 16);
                GLES20.glEnableVertexAttribArray(2);
                GLES20.glVertexAttribPointer(3, 1, 5126, false, 24, 20);
                GLES20.glEnableVertexAttribArray(i10);
                GLES20.glUniform1f(this.D, this.L);
                GLES20.glUniform1f(this.E, f10);
                GLES30.glBeginTransformFeedback(0);
                GLES20.glDrawArrays(0, 0, this.r);
                GLES30.glEndTransformFeedback();
                if (this.I) {
                    this.I = false;
                    GLES20.glUniform1f(this.C, 0.0f);
                }
                this.J = 1 - this.J;
                this.v.eglSwapBuffers(this.w, this.y);
                a();
            } else {
                this.a = false;
            }
            AndroidUtilities.cancelRunOnUIThread(this.c);
            AndroidUtilities.runOnUIThread(this.c);
            nanoTime = nanoTime2;
        }
        int[] iArr2 = this.K;
        if (iArr2 != null) {
            try {
                GLES20.glDeleteBuffers(2, iArr2, 0);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            this.K = null;
        }
        int i11 = this.B;
        if (i11 != 0) {
            try {
                GLES20.glDeleteProgram(i11);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            this.B = 0;
        }
        EGL10 egl103 = this.v;
        if (egl103 != null) {
            try {
                EGLDisplay eGLDisplay2 = this.w;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl103.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
            } catch (Exception e12) {
                FileLog.e(e12);
            }
            try {
                this.v.eglDestroySurface(this.w, this.y);
            } catch (Exception e13) {
                FileLog.e(e13);
            }
            try {
                this.v.eglDestroyContext(this.w, this.A);
            } catch (Exception e14) {
                FileLog.e(e14);
            }
        }
        try {
            this.d.release();
        } catch (Exception e15) {
            FileLog.e(e15);
        }
        a();
    }
}
