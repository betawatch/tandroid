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
import ii.s2;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class q {
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
    public l0 N;
    public l0 O;
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
    public final m e;
    public int f;
    public boolean g;
    public final p j;
    public final b k;
    public HandlerThread l;
    public Handler m;
    public SurfaceTexture n;
    public Surface o;
    public int s;
    public int t;
    public int u;
    public a0 x;
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
    public final n e0 = new n(this, 0);
    public volatile long h = 0;
    public volatile boolean a0 = false;

    public q(Size size, Surface surface, int i10, int i11, boolean z10, boolean z11, m mVar, p pVar, b bVar) {
        this.a = size;
        this.b = surface;
        this.c = i10;
        this.f = i11;
        this.g = z10;
        this.d = z11;
        this.e = mVar;
        this.t = i10;
        this.u = i10;
        this.j = pVar;
        this.k = bVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder h = v7.j.h(str, ": 0x");
        h.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(h.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0133, code lost:
    
        r9 = r9 - r5;
        r7 = 33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8 A[Catch: RuntimeException -> 0x0047, TryCatch #0 {RuntimeException -> 0x0047, blocks: (B:7:0x000f, B:9:0x0026, B:11:0x003b, B:14:0x0042, B:17:0x00a5, B:19:0x00c8, B:20:0x00cb, B:24:0x00d8, B:27:0x00f5, B:28:0x011f, B:30:0x0123, B:32:0x0127, B:38:0x0133, B:41:0x014d, B:44:0x015f, B:48:0x0153, B:50:0x0137, B:55:0x00e0, B:57:0x00e4, B:58:0x00f3, B:63:0x004f, B:67:0x0060, B:69:0x0068, B:70:0x0083), top: B:6:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        float f7;
        float f10;
        long c10;
        boolean z10;
        int i10;
        if (!this.Z || this.G == 0) {
            return;
        }
        try {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j3 = elapsedRealtimeNanos - this.H;
            int i11 = this.G;
            if (i11 == 1) {
                this.M = d(elapsedRealtimeNanos);
                if (j3 >= Math.max(33L, this.L) * 1000000) {
                    this.G = this.E ? 3 : 2;
                    this.H = elapsedRealtimeNanos;
                }
            } else {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                        }
                    }
                    long j10 = this.J;
                    if (j3 < j10) {
                        float max = Math.max(0.0f, Math.min(1.0f, j3 / j10));
                        f10 = (3.0f - (max * 2.0f)) * max * max;
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
                        z10 = true;
                    } else {
                        a0 a0Var = this.x;
                        if (a0Var.B) {
                            if (a0Var.e) {
                                a0Var.v = a0Var.y;
                                a0Var.w = a0Var.x;
                                z10 = true;
                                a0Var.A = true;
                                a0Var.z = elapsedRealtimeNanos;
                            } else {
                                z10 = true;
                            }
                            a0Var.B = false;
                        } else {
                            z10 = true;
                        }
                        this.G = 0;
                        this.e.b("synthetic camera switch completed: elapsedMs=" + ((elapsedRealtimeNanos - this.I) / 1000000.0f) + ", syntheticFrames=" + this.V);
                    }
                    i10 = this.G;
                    if (i10 != 0 || this.m == null) {
                    }
                    if (!this.E || (i10 != 3 && i10 != 4)) {
                        z10 = false;
                    }
                    long j12 = 33;
                    long max3 = Math.max(33L, this.L);
                    Long.signum(max3);
                    long j13 = (max3 * 1000000) - j3;
                    this.m.postDelayed(this.e0, Math.min(z10 ? 70L : j12, this.G == 2 ? j12 : Math.max(1L, (j13 + 999999) / 1000000)));
                    return;
                }
                this.M = d(elapsedRealtimeNanos);
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
            z10 = true;
            i10 = this.G;
            if (i10 != 0) {
            }
        } catch (RuntimeException e) {
            this.G = 0;
            this.e.a("GL error", e);
            b bVar = this.k;
            if (bVar != null) {
                k2.u uVar = bVar.a;
                ((s0) uVar.b).h.post(new h0(1, uVar, e));
            }
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
        this.n.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ki.o
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
            
                if ((r3 % 60) == 0) goto L39;
             */
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                SurfaceTexture surfaceTexture3;
                long j3;
                q qVar = q.this;
                if (!qVar.Z || (surfaceTexture3 = qVar.n) == null) {
                    return;
                }
                try {
                    surfaceTexture3.updateTexImage();
                    qVar.n.getTransformMatrix(qVar.w);
                    long timestamp = qVar.n.getTimestamp();
                    long j10 = qVar.S + 1;
                    qVar.S = j10;
                    if (j10 == 1) {
                        qVar.e.b("first GL input frame: cameraTimestampNs=" + timestamp + ", elapsedMs=" + ((System.nanoTime() - qVar.Y) / 1000000));
                    }
                    if (!qVar.a0) {
                        a aVar = qVar.b0;
                        if (qVar.c0 || aVar == null) {
                            return;
                        }
                        qVar.c0 = true;
                        aVar.run();
                        return;
                    }
                    if (qVar.g && timestamp < qVar.h) {
                        long j11 = qVar.T + 1;
                        qVar.T = j11;
                        if (j11 == 1) {
                            qVar.e.b("dropping pre-origin camera frame: deltaUs=" + ((timestamp - qVar.h) / 1000));
                            return;
                        }
                        return;
                    }
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = qVar.z;
                    if (j12 != 0) {
                        long j13 = elapsedRealtimeNanos - j12;
                        j3 = 50000000;
                        qVar.X = Math.max(qVar.X, j13);
                        if (j13 > 50000000) {
                            qVar.W++;
                        }
                    } else {
                        j3 = 50000000;
                    }
                    long j14 = qVar.z;
                    if (j14 != 0 && elapsedRealtimeNanos - j14 <= j3) {
                        int i11 = qVar.y;
                        qVar.y = i11 + 1;
                    }
                    qVar.k();
                    qVar.z = elapsedRealtimeNanos;
                    if (qVar.G == 0) {
                        qVar.D = true;
                        qVar.x.m(qVar.s, qVar.w, elapsedRealtimeNanos, qVar.t, qVar.u);
                        if (qVar.h != 0) {
                            if (qVar.g) {
                                timestamp = Math.max(0L, timestamp - qVar.h);
                            } else {
                                if (qVar.A < 0) {
                                    qVar.A = timestamp;
                                    qVar.B = qVar.c();
                                }
                                timestamp = Math.max(0L, timestamp - qVar.A) + qVar.B;
                            }
                        }
                        long max = Math.max(timestamp, qVar.C + 1);
                        if (max < qVar.i) {
                            qVar.i(max);
                            return;
                        }
                        return;
                    }
                    if (qVar.F) {
                        boolean z10 = qVar.E;
                        qVar.x.g(qVar.w, qVar.s, true);
                        qVar.E = true;
                        if (!z10) {
                            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                            float f7 = (elapsedRealtimeNanos2 - qVar.I) / 1000000.0f;
                            int d = t0.d(qVar.N, qVar.O, Math.round(f7));
                            qVar.e.b("camera switch first new frame: waitMs=" + f7 + ", rollingAverageMs=" + d);
                            qVar.G = 3;
                            qVar.H = elapsedRealtimeNanos2;
                        }
                        int i12 = qVar.G;
                        if (i12 == 3 || i12 == 4) {
                            Handler handler = qVar.m;
                            if (handler != null) {
                                handler.removeCallbacks(qVar.e0);
                            }
                            qVar.b();
                        }
                    }
                } catch (RuntimeException e) {
                    qVar.e.a("GL error", e);
                    b bVar = qVar.k;
                    if (bVar != null) {
                        k2.u uVar = bVar.a;
                        ((s0) uVar.b).h.post(new h0(1, uVar, e));
                    }
                }
            }
        }, this.m);
        this.o = new Surface(this.n);
        Size size = this.a;
        int i11 = this.f;
        boolean z10 = this.d;
        int i12 = this.c;
        this.x = new a0(i12, size, i11, z10);
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
        a0 a0Var = this.x;
        if (a0Var != null) {
            a0Var.g.b();
            a0Var.h.b();
            x xVar = a0Var.i;
            if (xVar != null) {
                xVar.b();
            }
            v vVar = a0Var.j;
            if (vVar != null) {
                vVar.b();
            }
            a0Var.k.b();
            a0Var.l.b();
            a0Var.m.b();
            w wVar = a0Var.n;
            if (wVar != null) {
                wVar.b();
            }
            int[] iArr = a0Var.t;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = a0Var.s;
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
        p pVar = this.j;
        if (pVar != null) {
            l lVar = (l) pVar;
            long j11 = lVar.x;
            int i10 = (int) (j11 % 256);
            lVar.k[i10] = j3 / 1000;
            lVar.l[i10] = nanoTime2;
            lVar.x = j11 + 1;
            synchronized (lVar) {
                if (lVar.t != null && !lVar.u) {
                    c cVar = lVar.t;
                    lVar.t = null;
                    lVar.f.b("first synchronized video frame submitted");
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
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Input size update was interrupted", e);
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
