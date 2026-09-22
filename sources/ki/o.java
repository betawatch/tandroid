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
import ei.l3;
import gg.x1;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class o {
    public long A;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public long H;
    public int I;
    public long J;
    public long K;
    public long L;
    public long M;
    public int N;
    public int O;
    public long P;
    public int Q;
    public long R;
    public long S;
    public long T;
    public volatile boolean U;
    public volatile b W;
    public boolean X;
    public volatile RuntimeException Y;
    public Size a;
    public final Surface b;
    public final int c;
    public final boolean d;
    public final k e;
    public int f;
    public final j h;
    public final a i;
    public HandlerThread j;
    public Handler k;
    public SurfaceTexture l;
    public Surface m;
    public int q;
    public int r;
    public int s;
    public x v;
    public int w;
    public int x;
    public long y;
    public EGLDisplay n = EGL14.EGL_NO_DISPLAY;
    public EGLContext o = EGL14.EGL_NO_CONTEXT;
    public EGLSurface p = EGL14.EGL_NO_SURFACE;
    public final int[] t = new int[1];
    public final float[] u = new float[16];
    public long z = -1;
    public long B = -1;
    public final m Z = new m(this, 0);
    public volatile long g = 0;
    public volatile boolean V = false;

    public o(Size size, Surface surface, int i10, int i11, boolean z10, k kVar, j jVar, a aVar) {
        this.a = size;
        this.b = surface;
        this.c = i10;
        this.f = i11;
        this.d = z10;
        this.e = kVar;
        this.r = i10;
        this.s = i10;
        this.h = jVar;
        this.i = aVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder h = v7.j0.h(str, ": 0x");
        h.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(h.toString());
    }

    public static float f(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return (3.0f - (max * 2.0f)) * max * max;
    }

    public final long b() {
        return Math.max(this.g == 0 ? this.B + 33333333 : Math.max(0L, System.nanoTime() - this.g), this.B + 1);
    }

    public final void c() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.n = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new IllegalStateException("Unable to get EGL display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new IllegalStateException("Unable to initialize EGL");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(this.n, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
            throw new IllegalStateException("Unable to choose EGL config");
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.n, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.o = eglCreateContext;
        a("Unable to create EGL context", eglCreateContext != EGL14.EGL_NO_CONTEXT);
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.n, eGLConfigArr[0], this.b, new int[]{12344}, 0);
        this.p = eglCreateWindowSurface;
        a("Unable to create EGL surface", eglCreateWindowSurface != EGL14.EGL_NO_SURFACE);
        EGLDisplay eGLDisplay = this.n;
        EGLSurface eGLSurface = this.p;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.o)) {
            throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        this.e.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.T) / 1000000));
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        int i10 = iArr3[0];
        this.q = i10;
        GLES20.glBindTexture(36197, i10);
        e();
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.q);
        this.l = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
        this.l.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ki.n
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
            
                if ((r4 % 60) == 0) goto L31;
             */
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                SurfaceTexture surfaceTexture3;
                long j3;
                long j10;
                o oVar = o.this;
                if (!oVar.U || (surfaceTexture3 = oVar.l) == null) {
                    return;
                }
                try {
                    surfaceTexture3.updateTexImage();
                    oVar.l.getTransformMatrix(oVar.u);
                    long timestamp = oVar.l.getTimestamp();
                    long j11 = oVar.L + 1;
                    oVar.L = j11;
                    if (j11 == 1) {
                        oVar.e.b("first GL input frame: cameraTimestampNs=" + timestamp + ", elapsedMs=" + ((System.nanoTime() - oVar.T) / 1000000));
                    }
                    if (!oVar.V) {
                        b bVar = oVar.W;
                        if (oVar.X || bVar == null) {
                            return;
                        }
                        oVar.X = true;
                        bVar.run();
                        return;
                    }
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = oVar.y;
                    if (j12 != 0) {
                        long j13 = elapsedRealtimeNanos - j12;
                        j3 = 0;
                        oVar.P = Math.max(oVar.P, j13);
                        if (j13 > 50000000) {
                            oVar.O++;
                        }
                    } else {
                        j3 = 0;
                    }
                    long j14 = oVar.y;
                    if (j14 != j3 && elapsedRealtimeNanos - j14 <= 50000000) {
                        int i11 = oVar.x;
                        oVar.x = i11 + 1;
                    }
                    oVar.k();
                    oVar.y = elapsedRealtimeNanos;
                    if (oVar.F != 0) {
                        if (oVar.E) {
                            boolean z10 = oVar.D;
                            if (!z10) {
                                oVar.v.g(oVar.u, oVar.q, true);
                            }
                            oVar.D = true;
                            if (!z10) {
                                oVar.e.b("camera switch first new frame: waitMs=" + ((SystemClock.elapsedRealtimeNanos() - oVar.H) / 1000000.0f) + " ms");
                            }
                            if (oVar.F == 2) {
                                oVar.F = 3;
                                oVar.G = SystemClock.elapsedRealtimeNanos();
                                Handler handler = oVar.k;
                                if (handler != null) {
                                    handler.removeCallbacks(oVar.Z);
                                    oVar.k.post(oVar.Z);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    oVar.C = true;
                    int i12 = oVar.w;
                    oVar.w = i12 + 1;
                    boolean z11 = i12 % 30 == 0;
                    if (z11) {
                        GLES20.glFinish();
                        j10 = System.nanoTime();
                    } else {
                        j10 = j3;
                    }
                    oVar.v.l(oVar.q, oVar.u, elapsedRealtimeNanos, oVar.r, oVar.s);
                    if (z11) {
                        GLES20.glFinish();
                        long nanoTime = System.nanoTime() - j10;
                        oVar.Q++;
                        oVar.R += nanoTime;
                        oVar.S = Math.max(oVar.S, nanoTime);
                        oVar.e.b("GPU pipeline sample: currentMs=" + (nanoTime / 1000000.0f) + ", averageMs=" + ((oVar.R / oVar.Q) / 1000000.0f) + ", maxMs=" + (oVar.S / 1000000.0f));
                    }
                    if (oVar.g != j3) {
                        if (oVar.z < j3) {
                            oVar.z = timestamp;
                            oVar.A = oVar.b();
                        }
                        timestamp = Math.max(j3, timestamp - oVar.z) + oVar.A;
                    }
                    oVar.i(Math.max(timestamp, oVar.B + 1));
                } catch (RuntimeException e) {
                    oVar.e.a("GL error", e);
                    a aVar = oVar.i;
                    if (aVar != null) {
                        e0 e0Var = aVar.a;
                        ((q0) e0Var.b).h.post(new l(2, e0Var, e));
                    }
                }
            }
        }, this.k);
        this.m = new Surface(this.l);
        Size size = this.a;
        int i11 = this.f;
        boolean z10 = this.d;
        int i12 = this.c;
        this.v = new x(i12, size, i11, z10);
        GLES20.glViewport(0, 0, i12, i12);
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        long nanoTime = this.T == 0 ? 0L : System.nanoTime() - this.T;
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.L);
        sb2.append(", inputFps=");
        sb2.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.L * 1.0E9d) / nanoTime));
        sb2.append(", submittedFrames=");
        sb2.append(this.M);
        sb2.append(", submittedFps=");
        sb2.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.M * 1.0E9d) / nanoTime));
        sb2.append(", syntheticFrames=");
        sb2.append(this.N);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.O);
        sb2.append(", maxFrameGapMs=");
        sb2.append(this.P / 1000000.0f);
        sb2.append(", gpuSamples=");
        sb2.append(this.Q);
        sb2.append(", gpuAverageMs=");
        int i10 = this.Q;
        sb2.append(i10 == 0 ? "n/a" : Float.valueOf((this.R / i10) / 1000000.0f));
        sb2.append(", gpuMaxMs=");
        sb2.append(this.S / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i11 = this.I;
        sb2.append(i11 != 0 ? Float.valueOf((this.J / i11) / 1000000.0f) : "n/a");
        sb2.append(", swapMaxMs=");
        sb2.append(this.K / 1000000.0f);
        this.e.b(sb2.toString());
        Handler handler = this.k;
        if (handler != null) {
            handler.removeCallbacks(this.Z);
        }
        EGLDisplay eGLDisplay = this.n;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.p) != EGL14.EGL_NO_SURFACE && (eGLContext = this.o) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.l;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        Surface surface = this.m;
        if (surface != null) {
            surface.release();
            this.m = null;
        }
        SurfaceTexture surfaceTexture2 = this.l;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.l = null;
        }
        x xVar = this.v;
        if (xVar != null) {
            xVar.e.a();
            xVar.f.a();
            xVar.g.a();
            xVar.h.a();
            xVar.i.a();
            u uVar = xVar.j;
            if (uVar != null) {
                uVar.a();
            }
            int[] iArr = xVar.p;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = xVar.o;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.v = null;
        }
        int i12 = this.q;
        if (i12 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.q = 0;
        }
        EGLDisplay eGLDisplay2 = this.n;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.p;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.n, eGLSurface3);
            }
            EGLContext eGLContext2 = this.o;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.n, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.n);
        }
        this.n = EGL14.EGL_NO_DISPLAY;
        this.o = EGL14.EGL_NO_CONTEXT;
        this.p = EGL14.EGL_NO_SURFACE;
    }

    public final void e() {
        GLES20.glBindTexture(36197, this.q);
        int i10 = this.f == this.c ? 9728 : 9729;
        GLES20.glTexParameteri(36197, 10241, i10);
        GLES20.glTexParameteri(36197, 10240, i10);
    }

    public final Surface g() {
        if (this.U) {
            return this.m;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
        this.j = handlerThread;
        handlerThread.start();
        this.T = System.nanoTime();
        k kVar = this.e;
        StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
        sb2.append(this.a);
        sb2.append(", crop=");
        sb2.append(this.f);
        sb2.append(", output=");
        sb2.append(this.c);
        sb2.append("x");
        sb2.append(this.c);
        sb2.append(", filter=");
        sb2.append(this.f == this.c ? "NEAREST" : "LINEAR");
        sb2.append(", composition=");
        sb2.append(this.d);
        kVar.b(sb2.toString());
        Handler handler = new Handler(this.j.getLooper());
        this.k = handler;
        handler.post(new x1(29, this, countDownLatch));
        try {
            countDownLatch.await();
            if (this.Y == null) {
                return this.m;
            }
            RuntimeException runtimeException = this.Y;
            this.Y = null;
            h();
            throw runtimeException;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            h();
            throw new IllegalStateException("GL initialization was interrupted", e);
        }
    }

    public final void h() {
        Handler handler = this.k;
        HandlerThread handlerThread = this.j;
        if (handler != null) {
            handler.removeCallbacks(this.Z);
        }
        this.k = null;
        this.j = null;
        this.U = false;
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
        this.B = j3;
        EGLExt.eglPresentationTimeANDROID(this.n, this.p, j3);
        long nanoTime = System.nanoTime();
        if (!EGL14.eglSwapBuffers(this.n, this.p)) {
            throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        long nanoTime2 = System.nanoTime();
        this.M++;
        long j10 = nanoTime2 - nanoTime;
        this.I++;
        this.J += j10;
        this.K = Math.max(this.K, j10);
        if (this.I % 30 == 0) {
            this.e.b("encoder swap: average=" + ((this.J / this.I) / 1000000.0f) + " ms, max=" + (this.K / 1000000.0f) + " ms");
        }
        j jVar = this.h;
        if (jVar != null) {
            long j11 = jVar.r;
            int i10 = (int) (j11 % 256);
            jVar.i[i10] = j3 / 1000;
            jVar.j[i10] = nanoTime2;
            jVar.r = j11 + 1;
        }
    }

    public final void j(Size size, int i10) {
        Handler handler = this.k;
        if (!this.U || handler == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
        handler.post(new l3(this, size, i10, runtimeExceptionArr, countDownLatch, 5));
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
        EGLDisplay eGLDisplay = this.n;
        EGLSurface eGLSurface = this.p;
        int[] iArr = this.t;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.n, this.p, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 <= 0 || i11 <= 0) {
                    return;
                }
                if (i10 == this.r && i11 == this.s) {
                    return;
                }
                this.r = i10;
                this.s = i11;
                this.e.b("EGL output size changed: " + i10 + "x" + i11);
            }
        }
    }
}
