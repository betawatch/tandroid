// default package

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class jk9 {
    public EGLSurface B;
    public EGLSurface C;
    public int D;
    public int E;
    public volatile boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final int[] K;
    public final float[] L;
    public final float[] M;
    public tk9 N;
    public int O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public boolean T;
    public boolean U;
    public boolean V;
    public byte W;
    public long X;
    public long Y;
    public long Z;
    public Size a;
    public long a0;
    public Size b;
    public int b0;
    public Size c;
    public float c0;
    public final Surface d;
    public nl9 d0;
    public final Surface e;
    public nl9 e0;
    public final boolean f;
    public int f0;
    public final short g;
    public long g0;
    public final boolean h;
    public long h0;
    public final ek9 i;
    public long i0;
    public int j;
    public long j0;
    public int k;
    public long k0;
    public int l;
    public long l0;
    public boolean m;
    public long m0;
    public boolean n;
    public int n0;
    public boolean o;
    public int o0;
    public volatile long p;
    public long p0;
    public long q0;
    public final ik9 r;
    public volatile boolean r0;
    public final rj9 s;
    public volatile int s0;
    public HandlerThread t;
    public volatile boolean t0;
    public Handler u;
    public volatile pj9 u0;
    public SurfaceTexture v;
    public qj9 v0;
    public Surface w;
    public boolean w0;
    public SurfaceTexture x;
    public volatile RuntimeException x0;
    public Surface y;
    public final gk9 y0;
    public volatile long q = Long.MAX_VALUE;
    public EGLDisplay z = EGL14.EGL_NO_DISPLAY;
    public EGLContext A = EGL14.EGL_NO_CONTEXT;

    /* JADX WARN: Multi-variable type inference failed */
    public jk9(Size size, Surface surface, Surface surface2, boolean z, int i, int i2, boolean z2, boolean z3, ek9 ek9Var, ik9 ik9Var, rj9 rj9Var) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface;
        this.C = eGLSurface;
        this.K = new int[1];
        this.L = new float[16];
        this.M = new float[16];
        this.Q = -1L;
        this.S = -1L;
        this.y0 = new gk9(this, (byte) 1);
        this.a = size;
        this.b = size;
        this.c = size;
        this.d = surface;
        this.e = surface2;
        this.f = z;
        this.g = i;
        this.j = i2;
        this.k = i2;
        this.l = i2;
        this.m = z2;
        this.n = z2;
        this.o = z2;
        this.h = z3;
        this.i = ek9Var;
        this.G = i;
        this.H = i;
        this.p = 0L;
        this.t0 = false;
        this.r = ik9Var;
        this.s = rj9Var;
    }

    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        fyb.k(b00.k(str, ": 0x"), Integer.toHexString(EGL14.eglGetError()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fa, code lost:
    
        if ((r0 % 60) == 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z) {
        long j;
        long j2;
        long j3;
        SurfaceTexture surfaceTexture = z ? this.x : this.v;
        if (!this.r0 || surfaceTexture == null) {
            return;
        }
        byte b = 1;
        try {
            float[] fArr = z ? this.M : this.L;
            int i = z ? this.E : this.D;
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(fArr);
            long timestamp = surfaceTexture.getTimestamp();
            this.i0++;
            if (z) {
                j = this.k0 + 1;
                this.k0 = j;
            } else {
                j = this.j0 + 1;
                this.j0 = j;
            }
            if (j == 1) {
                this.i.b("first GL input frame: input=" + (z ? 1 : 0) + ", cameraTimestampNs=" + timestamp + ", elapsedMs=" + ((System.nanoTime() - this.q0) / 1000000));
            }
            if (z == this.F) {
                if (!this.t0) {
                    j(i, fArr);
                    pj9 pj9Var = this.u0;
                    if (this.w0 || pj9Var == null) {
                        return;
                    }
                    this.w0 = true;
                    pj9Var.run();
                    return;
                }
                if (this.m && timestamp < this.p) {
                    j(i, fArr);
                    long j4 = this.l0 + 1;
                    this.l0 = j4;
                    if (j4 == 1) {
                        this.i.b("dropping pre-origin camera frame: deltaUs=" + ((timestamp - this.p) / 1000));
                        return;
                    }
                    return;
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long j5 = this.P;
                if (j5 != 0) {
                    long j6 = elapsedRealtimeNanos - j5;
                    j2 = 0;
                    this.p0 = Math.max(this.p0, j6);
                    if (j6 > 50000000) {
                        this.o0++;
                    }
                } else {
                    j2 = 0;
                }
                long j7 = this.P;
                if (j7 != j2 && elapsedRealtimeNanos - j7 <= 50000000) {
                    int i2 = this.O;
                    this.O = i2 + 1;
                }
                o();
                this.P = elapsedRealtimeNanos;
                if (this.W == 0) {
                    this.T = true;
                    long j8 = j2;
                    this.N.m(i, fArr, elapsedRealtimeNanos, this.G, this.H);
                    if (this.p == j8) {
                        j3 = timestamp;
                    } else if (this.m) {
                        j3 = Math.max(j8, timestamp - this.p);
                    } else {
                        if (this.Q < j8) {
                            this.Q = timestamp;
                            this.R = d();
                        }
                        j3 = this.R + Math.max(j8, timestamp - this.Q);
                    }
                    long max = Math.max(j3, this.S + 1);
                    if (max < this.q) {
                        m(max);
                    }
                    j(i, fArr);
                    return;
                }
                j(i, fArr);
                if (this.V) {
                    boolean z2 = this.U;
                    this.N.f(fArr, i, true);
                    this.U = true;
                    if (!z2) {
                        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                        float f = (elapsedRealtimeNanos2 - this.Y) / 1000000.0f;
                        int d = xl9.d(this.d0, this.e0, Math.round(f));
                        this.i.b("camera switch first new frame: waitMs=" + f + ", rollingAverageMs=" + d);
                        this.W = (byte) 3;
                        this.X = elapsedRealtimeNanos2;
                    }
                    byte b2 = this.W;
                    if (b2 == 3 || b2 == 4) {
                        Handler handler = this.u;
                        if (handler != null) {
                            handler.removeCallbacks(this.y0);
                        }
                        c();
                    }
                }
            }
        } catch (RuntimeException e) {
            this.i.a("GL error", e);
            g29 g29Var = this.s.b;
            ((ul9) g29Var.b).i.post(new kl9(g29Var, e, b));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6 A[Catch: RuntimeException -> 0x0150, TryCatch #0 {RuntimeException -> 0x0150, blocks: (B:7:0x000d, B:9:0x0024, B:11:0x0039, B:14:0x0040, B:17:0x0093, B:19:0x00b6, B:20:0x00b9, B:24:0x00c6, B:27:0x00e3, B:28:0x00ce, B:30:0x00d2, B:31:0x00e0, B:32:0x0108, B:34:0x010c, B:36:0x0110, B:40:0x0118, B:41:0x012f, B:44:0x0142, B:48:0x0136, B:49:0x011f, B:55:0x0049, B:58:0x0059, B:60:0x0063, B:62:0x0075), top: B:6:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce A[Catch: RuntimeException -> 0x0150, TryCatch #0 {RuntimeException -> 0x0150, blocks: (B:7:0x000d, B:9:0x0024, B:11:0x0039, B:14:0x0040, B:17:0x0093, B:19:0x00b6, B:20:0x00b9, B:24:0x00c6, B:27:0x00e3, B:28:0x00ce, B:30:0x00d2, B:31:0x00e0, B:32:0x0108, B:34:0x010c, B:36:0x0110, B:40:0x0118, B:41:0x012f, B:44:0x0142, B:48:0x0136, B:49:0x011f, B:55:0x0049, B:58:0x0059, B:60:0x0063, B:62:0x0075), top: B:6:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean z;
        float f;
        float f2;
        long d;
        byte b;
        long j;
        long j2;
        long j3;
        tk9 tk9Var;
        byte b2;
        if (!this.r0 || this.W == 0) {
            return;
        }
        try {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j4 = elapsedRealtimeNanos - this.X;
            byte b3 = this.W;
            float f3 = 0.0f;
            if (b3 == 1) {
                this.c0 = e(elapsedRealtimeNanos);
                z = true;
                if (j4 >= Math.max(33L, this.b0) * 1000000) {
                    this.W = this.U ? (byte) 3 : (byte) 2;
                    this.X = elapsedRealtimeNanos;
                }
            } else {
                z = true;
                if (b3 == 2) {
                    this.c0 = e(elapsedRealtimeNanos);
                } else if (b3 == 3 || b3 == 4) {
                    long j5 = this.Z;
                    if (j4 >= j5) {
                        this.W = (byte) 4;
                        float max = Math.max(0.0f, Math.min(1.0f, (j4 - j5) / this.a0));
                        f = 1.0f - ((3.0f - (max * 2.0f)) * (max * max));
                        f2 = 1.0f;
                        this.N.o(this.c0, f, f2, this.G, this.H);
                        this.n0++;
                        d = d();
                        if (d < this.q) {
                            m(d);
                        }
                        long j6 = this.Z + this.a0;
                        if (this.W == 4 && j4 >= j6) {
                            tk9Var = this.N;
                            if (tk9Var.C) {
                                b2 = 0;
                            } else {
                                if (tk9Var.e) {
                                    tk9Var.w = tk9Var.z;
                                    tk9Var.x = tk9Var.y;
                                    tk9Var.B = z;
                                    tk9Var.A = elapsedRealtimeNanos;
                                }
                                b2 = 0;
                                tk9Var.C = false;
                            }
                            this.W = b2;
                            this.i.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - this.Y) / 1000000.0f) + ", syntheticFrames=" + this.n0);
                        }
                        b = this.W;
                        if (b != 0 || this.u == null) {
                        }
                        if (this.U && (b == 3 || b == 4)) {
                            j2 = j6 - j4;
                            j3 = 70;
                            j = 33;
                        } else {
                            j = 33;
                            long max2 = Math.max(33L, this.b0);
                            Long.signum(max2);
                            j2 = (max2 * 1000000) - j4;
                            j3 = 33;
                        }
                        this.u.postDelayed(this.y0, Math.min(j3, this.W == 2 ? j : Math.max(1L, (j2 + 999999) / 1000000)));
                        return;
                    }
                    float max3 = Math.max(0.0f, Math.min(1.0f, j4 / j5));
                    f3 = yjb.B(max3, 2.0f, 3.0f, max3 * max3);
                }
            }
            f = 1.0f;
            f2 = f3;
            this.N.o(this.c0, f, f2, this.G, this.H);
            this.n0++;
            d = d();
            if (d < this.q) {
            }
            long j62 = this.Z + this.a0;
            if (this.W == 4) {
                tk9Var = this.N;
                if (tk9Var.C) {
                }
                this.W = b2;
                this.i.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - this.Y) / 1000000.0f) + ", syntheticFrames=" + this.n0);
            }
            b = this.W;
            if (b != 0) {
            }
        } catch (RuntimeException e) {
            this.W = (byte) 0;
            this.i.a("GL error", e);
            g29 g29Var = this.s.b;
            ((ul9) g29Var.b).i.post(new kl9(g29Var, e, (byte) 1));
        }
    }

    public final long d() {
        return Math.max(this.p == 0 ? this.S + 33333333 : Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.p), this.S + 1);
    }

    public final float e(long j) {
        long max = Math.max(0L, j - this.Y);
        long max2 = Math.max(33L, this.b0) * 1000000;
        float f = ((this.N.a * 4.0f) / 48.0f) * 1.15f;
        if (max > max2) {
            return f * ((float) Math.sqrt((Math.log1p((max - max2) / max2) * 0.3499999940395355d) + 1.0d));
        }
        float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, max / max2));
        return (1.0f - (((max3 * max3) * max3) * max3)) * f;
    }

    public final void f() {
        final byte b = 0;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.z = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            sc8.j("Unable to get EGL display");
            return;
        }
        int[] iArr = new int[2];
        final byte b2 = 1;
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            sc8.j("Unable to initialize EGL");
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(this.z, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
            sc8.j("Unable to choose EGL config");
            return;
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.z, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.A = eglCreateContext;
        a("Unable to create EGL context", eglCreateContext != EGL14.EGL_NO_CONTEXT);
        int[] iArr3 = {12344};
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.z, eGLConfigArr[0], this.d, iArr3, 0);
        this.B = eglCreateWindowSurface;
        a("Unable to create EGL surface", eglCreateWindowSurface != EGL14.EGL_NO_SURFACE);
        Surface surface = this.e;
        if (surface != null) {
            EGLSurface eglCreateWindowSurface2 = EGL14.eglCreateWindowSurface(this.z, eGLConfigArr[0], surface, iArr3, 0);
            this.C = eglCreateWindowSurface2;
            a("Unable to create preview EGL surface", eglCreateWindowSurface2 != EGL14.EGL_NO_SURFACE);
            this.I = h(this.C, 12375);
            this.J = h(this.C, 12374);
        }
        g();
        this.i.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.q0) / 1000000));
        boolean z = this.f;
        int i = z ? 2 : 1;
        int[] iArr4 = new int[i];
        GLES20.glGenTextures(i, iArr4, 0);
        int i2 = iArr4[0];
        this.D = i2;
        GLES20.glBindTexture(36197, i2);
        k(i2, this.j);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.D);
        this.v = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
        this.v.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener(this) { // from class: fk9
            public final /* synthetic */ jk9 b;

            {
                this.b = this;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                byte b3 = b2;
                jk9 jk9Var = this.b;
                switch (b3) {
                    case 0:
                        jk9Var.b(true);
                        break;
                    default:
                        jk9Var.b(false);
                        break;
                }
            }
        }, this.u);
        this.w = new Surface(this.v);
        if (z) {
            int i3 = iArr4[1];
            this.E = i3;
            GLES20.glBindTexture(36197, i3);
            k(i3, this.j);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.E);
            this.x = surfaceTexture2;
            surfaceTexture2.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
            this.x.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener(this) { // from class: fk9
                public final /* synthetic */ jk9 b;

                {
                    this.b = this;
                }

                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture22) {
                    byte b3 = b;
                    jk9 jk9Var = this.b;
                    switch (b3) {
                        case 0:
                            jk9Var.b(true);
                            break;
                        default:
                            jk9Var.b(false);
                            break;
                    }
                }
            }, this.u);
            this.y = new Surface(this.x);
        }
        tk9 tk9Var = new tk9(this.g, this.j, this.a, this.h);
        this.N = tk9Var;
        int i4 = ((this.s0 % 360) + 360) % 360;
        if (tk9Var.s != i4) {
            tk9Var.s = i4;
            tk9Var.v();
        }
        short s = this.g;
        GLES20.glViewport(0, 0, s, s);
    }

    public final void g() {
        EGLDisplay eGLDisplay = this.z;
        EGLSurface eGLSurface = this.B;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A)) {
            return;
        }
        wn4.p(Integer.toHexString(EGL14.eglGetError()), "Unable to make EGL context current: 0x");
    }

    public final int h(EGLSurface eGLSurface, int i) {
        EGLDisplay eGLDisplay = this.z;
        int[] iArr = this.K;
        return !EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i, iArr, 0) ? this.g : Math.max(1, iArr[0]);
    }

    public final void i() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        long nanoTime = this.q0 == 0 ? 0L : System.nanoTime() - this.q0;
        StringBuilder sb = new StringBuilder("GL summary: inputFrames=");
        sb.append(this.i0);
        sb.append(", inputFps=");
        sb.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.i0 * 1.0E9d) / nanoTime));
        sb.append(", primaryInputFrames=");
        sb.append(this.j0);
        sb.append(", secondaryInputFrames=");
        sb.append(this.k0);
        sb.append(", preOriginFrames=");
        sb.append(this.l0);
        sb.append(", submittedFrames=");
        sb.append(this.m0);
        sb.append(", submittedFps=");
        sb.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.m0 * 1.0E9d) / nanoTime));
        sb.append(", syntheticFrames=");
        sb.append(this.n0);
        sb.append(", largeFrameGaps=");
        sb.append(this.o0);
        sb.append(", maxFrameGapMs=");
        sb.append(this.p0 / 1000000.0f);
        sb.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=0.0, swapAverageMs=");
        int i = this.f0;
        sb.append(i != 0 ? Float.valueOf((this.g0 / i) / 1000000.0f) : "n/a");
        sb.append(", swapMaxMs=");
        sb.append(this.h0 / 1000000.0f);
        this.i.b(sb.toString());
        Handler handler = this.u;
        if (handler != null) {
            handler.removeCallbacks(this.y0);
        }
        EGLDisplay eGLDisplay = this.z;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.B) != EGL14.EGL_NO_SURFACE && (eGLContext = this.A) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.v;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        SurfaceTexture surfaceTexture2 = this.x;
        if (surfaceTexture2 != null) {
            surfaceTexture2.setOnFrameAvailableListener(null);
        }
        Surface surface = this.w;
        if (surface != null) {
            surface.release();
            this.w = null;
        }
        SurfaceTexture surfaceTexture3 = this.v;
        if (surfaceTexture3 != null) {
            surfaceTexture3.release();
            this.v = null;
        }
        Surface surface2 = this.y;
        if (surface2 != null) {
            surface2.release();
            this.y = null;
        }
        SurfaceTexture surfaceTexture4 = this.x;
        if (surfaceTexture4 != null) {
            surfaceTexture4.release();
            this.x = null;
        }
        tk9 tk9Var = this.N;
        if (tk9Var != null) {
            tk9Var.g.b();
            tk9Var.h.b();
            qk9 qk9Var = tk9Var.i;
            if (qk9Var != null) {
                qk9Var.b();
            }
            pk9 pk9Var = tk9Var.j;
            if (pk9Var != null) {
                pk9Var.b();
            }
            tk9Var.k.b();
            tk9Var.l.b();
            tk9Var.m.b();
            pc0 pc0Var = tk9Var.n;
            if (pc0Var != null) {
                pc0Var.b();
            }
            int[] iArr = tk9Var.u;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = tk9Var.t;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.N = null;
        }
        int i2 = this.D;
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.D = 0;
        }
        int i3 = this.E;
        if (i3 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
            this.E = 0;
        }
        EGLDisplay eGLDisplay2 = this.z;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.B;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.z, eGLSurface3);
            }
            EGLSurface eGLSurface4 = this.C;
            if (eGLSurface4 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.z, eGLSurface4);
            }
            EGLContext eGLContext2 = this.A;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.z, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.z);
        }
        this.z = EGL14.EGL_NO_DISPLAY;
        this.A = EGL14.EGL_NO_CONTEXT;
        EGLSurface eGLSurface5 = EGL14.EGL_NO_SURFACE;
        this.B = eGLSurface5;
        this.C = eGLSurface5;
    }

    public final void j(int i, float[] fArr) {
        EGLSurface eGLSurface = this.C;
        if (eGLSurface != EGL14.EGL_NO_SURFACE && this.N != null) {
            if (!EGL14.eglMakeCurrent(this.z, eGLSurface, eGLSurface, this.A)) {
                wn4.p(Integer.toHexString(EGL14.eglGetError()), "Unable to make preview EGL surface current: 0x");
                return;
            }
            tk9 tk9Var = this.N;
            int i2 = this.I;
            int i3 = this.J;
            tk9Var.getClass();
            GLES20.glDisable(3042);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i2, i3);
            tk9Var.b(tk9Var.g, fArr);
            tk9.c(i);
            GLES20.glDrawArrays(5, 0, 4);
            if (!EGL14.eglSwapBuffers(this.z, this.C)) {
                wn4.p(Integer.toHexString(EGL14.eglGetError()), "Unable to swap preview EGL buffers: 0x");
                return;
            }
            g();
        }
        qj9 qj9Var = this.v0;
        if (qj9Var != null) {
            this.v0 = null;
            qj9Var.run();
        }
    }

    public final void k(int i, int i2) {
        GLES20.glBindTexture(36197, i);
        int i3 = i2 == this.g ? 9728 : 9729;
        GLES20.glTexParameteri(36197, 10241, i3);
        GLES20.glTexParameteri(36197, 10240, i3);
    }

    public final void l() {
        Handler handler = this.u;
        HandlerThread handlerThread = this.t;
        if (handler != null) {
            handler.removeCallbacks(this.y0);
        }
        this.u = null;
        this.t = null;
        this.r0 = false;
        if (handler == null || handlerThread == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new gm8(this, handlerThread, countDownLatch, (byte) 16));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void m(long j) {
        this.S = j;
        EGLExt.eglPresentationTimeANDROID(this.z, this.B, j);
        long nanoTime = System.nanoTime();
        if (!EGL14.eglSwapBuffers(this.z, this.B)) {
            wn4.p(Integer.toHexString(EGL14.eglGetError()), "Unable to swap EGL buffers: 0x");
            return;
        }
        long nanoTime2 = System.nanoTime();
        this.m0++;
        long j2 = nanoTime2 - nanoTime;
        this.f0++;
        this.g0 += j2;
        this.h0 = Math.max(this.h0, j2);
        if (this.f0 % 30 == 0) {
            this.i.b("encoder swap: average=" + ((this.g0 / this.f0) / 1000000.0f) + " ms, max=" + (this.h0 / 1000000.0f) + " ms");
        }
        ik9 ik9Var = this.r;
        if (ik9Var != null) {
            dk9 dk9Var = (dk9) ik9Var;
            long j3 = dk9Var.C;
            int i = (int) (j3 % 256);
            dk9Var.l[i] = j / 1000;
            dk9Var.m[i] = nanoTime2;
            dk9Var.C = j3 + 1;
            synchronized (dk9Var) {
                if (dk9Var.u == null || dk9Var.v) {
                    return;
                }
                sj9 sj9Var = dk9Var.u;
                dk9Var.u = null;
                dk9Var.f.b("first synchronized video frame submitted");
                sj9Var.run();
            }
        }
    }

    public final void n(Size size, int i, boolean z) {
        Handler handler = this.u;
        if (!this.r0 || handler == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
        handler.post(new hk9(this, size, i, z, runtimeExceptionArr, countDownLatch, (byte) 1));
        try {
            countDownLatch.await();
            RuntimeException runtimeException = runtimeExceptionArr[0];
            if (runtimeException != null) {
                throw runtimeException;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            k93.h("Input size update was interrupted", e);
        }
    }

    public final void o() {
        EGLDisplay eGLDisplay = this.z;
        EGLSurface eGLSurface = this.B;
        int[] iArr = this.K;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i = iArr[0];
            if (EGL14.eglQuerySurface(this.z, this.B, 12374, iArr, 0)) {
                int i2 = iArr[0];
                if (i > 0 && i2 > 0 && (i != this.G || i2 != this.H)) {
                    this.G = i;
                    this.H = i2;
                    this.i.b("EGL output size changed: " + i + "x" + i2);
                }
                EGLSurface eGLSurface2 = this.C;
                if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                    this.I = h(eGLSurface2, 12375);
                    this.J = h(this.C, 12374);
                }
            }
        }
    }
}
