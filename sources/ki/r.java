package ki;

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
import com.google.android.gms.internal.vision.e2;
import ii.s2;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class r {
    public long B;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public long J;
    public long K;
    public int L;
    public float M;
    public m0 N;
    public m0 O;
    public int P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public int V;
    public int W;
    public long X;
    public long Y;
    public volatile boolean Z;
    public Size a;
    public final Surface b;
    public volatile a b0;
    public final int c;
    public boolean c0;
    public final boolean d;
    public volatile RuntimeException d0;
    public final n e;
    public int f;
    public boolean g;
    public final q j;
    public final b k;
    public HandlerThread l;
    public Handler m;
    public SurfaceTexture n;
    public Surface o;
    public int s;
    public int t;
    public int u;
    public b0 x;
    public int y;
    public long z;
    public volatile long i = Long.MAX_VALUE;
    public EGLDisplay p = EGL14.EGL_NO_DISPLAY;
    public EGLContext q = EGL14.EGL_NO_CONTEXT;
    public EGLSurface r = EGL14.EGL_NO_SURFACE;
    public final int[] v = new int[1];
    public final float[] w = new float[16];
    public long A = -1;
    public long C = -1;
    public final o e0 = new o(this, 0);
    public volatile long h = 0;
    public volatile boolean a0 = false;

    public r(Size size, Surface surface, int i10, int i11, boolean z10, boolean z11, n nVar, q qVar, b bVar) {
        this.a = size;
        this.b = surface;
        this.c = i10;
        this.f = i11;
        this.g = z10;
        this.d = z11;
        this.e = nVar;
        this.t = i10;
        this.u = i10;
        this.j = qVar;
        this.k = bVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder j3 = sc.v.j(str, ": 0x");
        j3.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(j3.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0133, code lost:
    
        r9 = r9 - r5;
        r7 = 33;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1 A[Catch: RuntimeException -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0047, blocks: (B:11:0x0026, B:13:0x003b, B:16:0x0042, B:22:0x00c1, B:67:0x004f, B:74:0x006d), top: B:9:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i10;
        boolean z10;
        float f7;
        float f10;
        long c10;
        boolean z11;
        int i11;
        if (!this.Z || this.G == 0) {
            return;
        }
        try {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j3 = elapsedRealtimeNanos - this.H;
            int i12 = this.G;
            try {
                if (i12 == 1) {
                    this.M = d(elapsedRealtimeNanos);
                    z10 = true;
                    if (j3 >= Math.max(33L, this.L) * 1000000) {
                        this.G = this.E ? 3 : 2;
                        this.H = elapsedRealtimeNanos;
                    }
                } else {
                    z10 = true;
                    if (i12 == 2) {
                        this.M = d(elapsedRealtimeNanos);
                    } else if (i12 == 3 || i12 == 4) {
                        long j10 = this.J;
                        if (j3 < j10) {
                            float max = Math.max(0.0f, Math.min(1.0f, j3 / j10));
                            f10 = e2.B(max, 2.0f, 3.0f, max * max);
                            f7 = 1.0f;
                        } else {
                            this.G = 4;
                            float max2 = Math.max(0.0f, Math.min(1.0f, (j3 - j10) / this.K));
                            f7 = 1.0f - ((3.0f - (max2 * 2.0f)) * (max2 * max2));
                            f10 = 1.0f;
                        }
                        this.x.o(this.M, f7, f10, this.t, this.u);
                        this.V++;
                        c10 = c();
                        if (c10 < this.i) {
                            i(c10);
                        }
                        long j11 = this.J + this.K;
                        if (this.G == 4 || j3 < j11) {
                            z11 = z10;
                        } else {
                            b0 b0Var = this.x;
                            if (b0Var.B) {
                                if (b0Var.e) {
                                    b0Var.v = b0Var.y;
                                    b0Var.w = b0Var.x;
                                    z11 = z10;
                                    b0Var.A = z11;
                                    b0Var.z = elapsedRealtimeNanos;
                                } else {
                                    z11 = z10;
                                }
                                b0Var.B = false;
                            } else {
                                z11 = z10;
                            }
                            this.G = 0;
                            this.e.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - this.I) / 1000000.0f) + ", syntheticFrames=" + this.V);
                        }
                        i11 = this.G;
                        if (i11 != 0 || this.m == null) {
                        }
                        if (!this.E || (i11 != 3 && i11 != 4)) {
                            z11 = false;
                        }
                        long j12 = 33;
                        long max3 = Math.max(33L, this.L);
                        Long.signum(max3);
                        long j13 = (max3 * 1000000) - j3;
                        this.m.postDelayed(this.e0, Math.min(z11 ? 70L : j12, this.G == 2 ? j12 : Math.max(1L, (j13 + 999999) / 1000000)));
                        return;
                    }
                }
                f7 = 1.0f;
                f10 = 0.0f;
                this.x.o(this.M, f7, f10, this.t, this.u);
                this.V++;
                c10 = c();
                if (c10 < this.i) {
                }
                long j112 = this.J + this.K;
                if (this.G == 4) {
                }
                z11 = z10;
                i11 = this.G;
                if (i11 != 0) {
                }
            } catch (RuntimeException e7) {
                e = e7;
                i10 = 0;
                this.G = i10;
                this.e.a("GL error", e);
                b bVar = this.k;
                if (bVar != null) {
                    xa.d dVar = bVar.a;
                    ((t0) dVar.b).i.post(new i0(1, dVar, e));
                }
            }
        } catch (RuntimeException e10) {
            e = e10;
            i10 = 0;
        }
    }

    public final long c() {
        return Math.max(this.h == 0 ? this.C + 33333333 : Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.h), this.C + 1);
    }

    public final float d(long j3) {
        long max = Math.max(0L, j3 - this.I);
        long max2 = Math.max(33L, this.L) * 1000000;
        float f7 = ((this.x.a * 4.0f) / 48.0f) * 1.15f;
        if (max > max2) {
            return f7 * ((float) Math.sqrt((Math.log1p((max - max2) / max2) * 0.3499999940395355d) + 1.0d));
        }
        float max3 = 1.0f - Math.max(0.0f, Math.min(1.0f, max / max2));
        return (1.0f - (((max3 * max3) * max3) * max3)) * f7;
    }

    public final void e() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.p = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new IllegalStateException("Unable to get EGL display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new IllegalStateException("Unable to initialize EGL");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(this.p, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
            throw new IllegalStateException("Unable to choose EGL config");
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.p, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.q = eglCreateContext;
        a("Unable to create EGL context", eglCreateContext != EGL14.EGL_NO_CONTEXT);
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.p, eGLConfigArr[0], this.b, new int[]{12344}, 0);
        this.r = eglCreateWindowSurface;
        a("Unable to create EGL surface", eglCreateWindowSurface != EGL14.EGL_NO_SURFACE);
        EGLDisplay eGLDisplay = this.p;
        EGLSurface eGLSurface = this.r;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.q)) {
            throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        this.e.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.Y) / 1000000));
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        int i10 = iArr3[0];
        this.s = i10;
        GLES20.glBindTexture(36197, i10);
        g();
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.s);
        this.n = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
        this.n.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ki.p
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
            
                if ((r3 % 60) == 0) goto L39;
             */
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                SurfaceTexture surfaceTexture3;
                long j3;
                r rVar = r.this;
                if (!rVar.Z || (surfaceTexture3 = rVar.n) == null) {
                    return;
                }
                try {
                    surfaceTexture3.updateTexImage();
                    rVar.n.getTransformMatrix(rVar.w);
                    long timestamp = rVar.n.getTimestamp();
                    long j10 = rVar.S + 1;
                    rVar.S = j10;
                    if (j10 == 1) {
                        rVar.e.b("first GL input frame: cameraTimestampNs=" + timestamp + ", elapsedMs=" + ((System.nanoTime() - rVar.Y) / 1000000));
                    }
                    if (!rVar.a0) {
                        a aVar = rVar.b0;
                        if (rVar.c0 || aVar == null) {
                            return;
                        }
                        rVar.c0 = true;
                        aVar.run();
                        return;
                    }
                    if (rVar.g && timestamp < rVar.h) {
                        long j11 = rVar.T + 1;
                        rVar.T = j11;
                        if (j11 == 1) {
                            rVar.e.b("dropping pre-origin camera frame: deltaUs=" + ((timestamp - rVar.h) / 1000));
                            return;
                        }
                        return;
                    }
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = rVar.z;
                    if (j12 != 0) {
                        long j13 = elapsedRealtimeNanos - j12;
                        j3 = 1;
                        rVar.X = Math.max(rVar.X, j13);
                        if (j13 > 50000000) {
                            rVar.W++;
                        }
                    } else {
                        j3 = 1;
                    }
                    long j14 = rVar.z;
                    if (j14 != 0 && elapsedRealtimeNanos - j14 <= 50000000) {
                        int i11 = rVar.y;
                        rVar.y = i11 + 1;
                    }
                    rVar.k();
                    rVar.z = elapsedRealtimeNanos;
                    if (rVar.G == 0) {
                        rVar.D = true;
                        rVar.x.m(rVar.s, rVar.w, elapsedRealtimeNanos, rVar.t, rVar.u);
                        if (rVar.h != 0) {
                            if (rVar.g) {
                                timestamp = Math.max(0L, timestamp - rVar.h);
                            } else {
                                if (rVar.A < 0) {
                                    rVar.A = timestamp;
                                    rVar.B = rVar.c();
                                }
                                timestamp = Math.max(0L, timestamp - rVar.A) + rVar.B;
                            }
                        }
                        long max = Math.max(timestamp, rVar.C + j3);
                        if (max < rVar.i) {
                            rVar.i(max);
                            return;
                        }
                        return;
                    }
                    if (rVar.F) {
                        boolean z10 = rVar.E;
                        rVar.x.g(rVar.w, rVar.s, true);
                        rVar.E = true;
                        if (!z10) {
                            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                            float f7 = (elapsedRealtimeNanos2 - rVar.I) / 1000000.0f;
                            int d = u0.d(rVar.N, rVar.O, Math.round(f7));
                            rVar.e.b("camera switch first new frame: waitMs=" + f7 + ", rollingAverageMs=" + d);
                            rVar.G = 3;
                            rVar.H = elapsedRealtimeNanos2;
                        }
                        int i12 = rVar.G;
                        if (i12 == 3 || i12 == 4) {
                            Handler handler = rVar.m;
                            if (handler != null) {
                                handler.removeCallbacks(rVar.e0);
                            }
                            rVar.b();
                        }
                    }
                } catch (RuntimeException e7) {
                    rVar.e.a("GL error", e7);
                    b bVar = rVar.k;
                    if (bVar != null) {
                        xa.d dVar = bVar.a;
                        ((t0) dVar.b).i.post(new i0(1, dVar, e7));
                    }
                }
            }
        }, this.m);
        this.o = new Surface(this.n);
        Size size = this.a;
        int i11 = this.f;
        boolean z10 = this.d;
        int i12 = this.c;
        this.x = new b0(i12, size, i11, z10);
        GLES20.glViewport(0, 0, i12, i12);
    }

    public final void f() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        long nanoTime = this.Y == 0 ? 0L : System.nanoTime() - this.Y;
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.S);
        sb2.append(", inputFps=");
        sb2.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.S * 1.0E9d) / nanoTime));
        sb2.append(", preOriginFrames=");
        sb2.append(this.T);
        sb2.append(", submittedFrames=");
        sb2.append(this.U);
        sb2.append(", submittedFps=");
        sb2.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.U * 1.0E9d) / nanoTime));
        sb2.append(", syntheticFrames=");
        sb2.append(this.V);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.W);
        sb2.append(", maxFrameGapMs=");
        sb2.append(this.X / 1000000.0f);
        sb2.append(", gpuSamples=0, gpuAverageMs=n/a, gpuMaxMs=");
        sb2.append(0 / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i10 = this.P;
        sb2.append(i10 != 0 ? Float.valueOf((this.Q / i10) / 1000000.0f) : "n/a");
        sb2.append(", swapMaxMs=");
        sb2.append(this.R / 1000000.0f);
        this.e.b(sb2.toString());
        Handler handler = this.m;
        if (handler != null) {
            handler.removeCallbacks(this.e0);
        }
        EGLDisplay eGLDisplay = this.p;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.r) != EGL14.EGL_NO_SURFACE && (eGLContext = this.q) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.n;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        Surface surface = this.o;
        if (surface != null) {
            surface.release();
            this.o = null;
        }
        SurfaceTexture surfaceTexture2 = this.n;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.n = null;
        }
        b0 b0Var = this.x;
        if (b0Var != null) {
            b0Var.g.d();
            b0Var.h.d();
            y yVar = b0Var.i;
            if (yVar != null) {
                yVar.d();
            }
            w wVar = b0Var.j;
            if (wVar != null) {
                wVar.d();
            }
            b0Var.k.d();
            b0Var.l.d();
            b0Var.m.d();
            x xVar = b0Var.n;
            if (xVar != null) {
                xVar.d();
            }
            int[] iArr = b0Var.t;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = b0Var.s;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.x = null;
        }
        int i11 = this.s;
        if (i11 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i11}, 0);
            this.s = 0;
        }
        EGLDisplay eGLDisplay2 = this.p;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.r;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.p, eGLSurface3);
            }
            EGLContext eGLContext2 = this.q;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.p, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.p);
        }
        this.p = EGL14.EGL_NO_DISPLAY;
        this.q = EGL14.EGL_NO_CONTEXT;
        this.r = EGL14.EGL_NO_SURFACE;
    }

    public final void g() {
        GLES20.glBindTexture(36197, this.s);
        int i10 = this.f == this.c ? 9728 : 9729;
        GLES20.glTexParameteri(36197, 10241, i10);
        GLES20.glTexParameteri(36197, 10240, i10);
    }

    public final void h() {
        Handler handler = this.m;
        HandlerThread handlerThread = this.l;
        if (handler != null) {
            handler.removeCallbacks(this.e0);
        }
        this.m = null;
        this.l = null;
        this.Z = false;
        if (handler == null || handlerThread == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new gg.t(this, handlerThread, countDownLatch, 22));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void i(long j3) {
        this.C = j3;
        EGLExt.eglPresentationTimeANDROID(this.p, this.r, j3);
        long nanoTime = System.nanoTime();
        if (!EGL14.eglSwapBuffers(this.p, this.r)) {
            throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        long nanoTime2 = System.nanoTime();
        this.U++;
        long j10 = nanoTime2 - nanoTime;
        this.P++;
        this.Q += j10;
        this.R = Math.max(this.R, j10);
        if (this.P % 30 == 0) {
            this.e.b("encoder swap: average=" + ((this.Q / this.P) / 1000000.0f) + " ms, max=" + (this.R / 1000000.0f) + " ms");
        }
        q qVar = this.j;
        if (qVar != null) {
            m mVar = (m) qVar;
            long j11 = mVar.x;
            int i10 = (int) (j11 % 256);
            mVar.k[i10] = j3 / 1000;
            mVar.l[i10] = nanoTime2;
            mVar.x = j11 + 1;
            synchronized (mVar) {
                if (mVar.t != null && !mVar.u) {
                    c cVar = mVar.t;
                    mVar.t = null;
                    mVar.f.b("first synchronized video frame submitted");
                    cVar.run();
                }
            }
        }
    }

    public final void j(Size size, int i10, boolean z10) {
        Handler handler = this.m;
        if (!this.Z || handler == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
        handler.post(new s2(this, size, i10, z10, runtimeExceptionArr, countDownLatch));
        try {
            countDownLatch.await();
            RuntimeException runtimeException = runtimeExceptionArr[0];
            if (runtimeException != null) {
                throw runtimeException;
            }
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Input size update was interrupted", e7);
        }
    }

    public final void k() {
        EGLDisplay eGLDisplay = this.p;
        EGLSurface eGLSurface = this.r;
        int[] iArr = this.v;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.p, this.r, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 <= 0 || i11 <= 0) {
                    return;
                }
                if (i10 == this.t && i11 == this.u) {
                    return;
                }
                this.t = i10;
                this.u = i11;
                this.e.b("EGL output size changed: " + i10 + "x" + i11);
            }
        }
    }
}
