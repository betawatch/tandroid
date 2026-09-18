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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class m {
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public int N;
    public long O;
    public int P;
    public long Q;
    public long R;
    public long S;
    public volatile boolean T;
    public volatile a V;
    public boolean W;
    public volatile RuntimeException X;
    public Size a;
    public final Surface b;
    public final int c;
    public final j d;
    public int e;
    public final i g;
    public final b h;
    public HandlerThread i;
    public Handler j;
    public SurfaceTexture k;
    public Surface l;
    public int p;
    public int q;
    public int r;
    public v u;
    public int v;
    public int w;
    public long x;
    public long z;
    public EGLDisplay m = EGL14.EGL_NO_DISPLAY;
    public EGLContext n = EGL14.EGL_NO_CONTEXT;
    public EGLSurface o = EGL14.EGL_NO_SURFACE;
    public final int[] s = new int[1];
    public final float[] t = new float[16];
    public long y = -1;
    public long A = -1;
    public final k Y = new k(this, 0);
    public volatile long f = 0;
    public volatile boolean U = false;

    public m(Size size, Surface surface, int i10, int i11, j jVar, i iVar, b bVar) {
        this.a = size;
        this.b = surface;
        this.c = i10;
        this.e = i11;
        this.d = jVar;
        this.q = i10;
        this.r = i10;
        this.g = iVar;
        this.h = bVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder j3 = t8.b.j(str, ": 0x");
        j3.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(j3.toString());
    }

    public static float f(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return (3.0f - (max * 2.0f)) * max * max;
    }

    public final long b() {
        return Math.max(this.f == 0 ? this.A + 33333333 : Math.max(0L, System.nanoTime() - this.f), this.A + 1);
    }

    public final void c() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.m = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new IllegalStateException("Unable to get EGL display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new IllegalStateException("Unable to initialize EGL");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(this.m, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
            throw new IllegalStateException("Unable to choose EGL config");
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.m, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.n = eglCreateContext;
        a("Unable to create EGL context", eglCreateContext != EGL14.EGL_NO_CONTEXT);
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.m, eGLConfigArr[0], this.b, new int[]{12344}, 0);
        this.o = eglCreateWindowSurface;
        a("Unable to create EGL surface", eglCreateWindowSurface != EGL14.EGL_NO_SURFACE);
        EGLDisplay eGLDisplay = this.m;
        EGLSurface eGLSurface = this.o;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.n)) {
            throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        this.d.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.S) / 1000000));
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        int i10 = iArr3[0];
        this.p = i10;
        GLES20.glBindTexture(36197, i10);
        e();
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.p);
        this.k = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
        this.k.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ki.l
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
                m mVar = m.this;
                if (!mVar.T || (surfaceTexture3 = mVar.k) == null) {
                    return;
                }
                try {
                    surfaceTexture3.updateTexImage();
                    mVar.k.getTransformMatrix(mVar.t);
                    long timestamp = mVar.k.getTimestamp();
                    long j11 = mVar.K + 1;
                    mVar.K = j11;
                    if (j11 == 1) {
                        mVar.d.b("first GL input frame: cameraTimestampNs=" + timestamp + ", elapsedMs=" + ((System.nanoTime() - mVar.S) / 1000000));
                    }
                    if (!mVar.U) {
                        a aVar = mVar.V;
                        if (mVar.W || aVar == null) {
                            return;
                        }
                        mVar.W = true;
                        aVar.run();
                        return;
                    }
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = mVar.x;
                    if (j12 != 0) {
                        long j13 = elapsedRealtimeNanos - j12;
                        j3 = 0;
                        mVar.O = Math.max(mVar.O, j13);
                        if (j13 > 50000000) {
                            mVar.N++;
                        }
                    } else {
                        j3 = 0;
                    }
                    long j14 = mVar.x;
                    if (j14 != j3 && elapsedRealtimeNanos - j14 <= 50000000) {
                        int i11 = mVar.w;
                        mVar.w = i11 + 1;
                    }
                    mVar.k();
                    mVar.x = elapsedRealtimeNanos;
                    if (mVar.E != 0) {
                        if (mVar.D) {
                            boolean z10 = mVar.C;
                            if (!z10) {
                                mVar.u.f(mVar.t, mVar.p, true);
                            }
                            mVar.C = true;
                            if (!z10) {
                                mVar.d.b("camera switch first new frame: waitMs=" + ((SystemClock.elapsedRealtimeNanos() - mVar.G) / 1000000.0f) + " ms");
                            }
                            if (mVar.E == 2) {
                                mVar.E = 3;
                                mVar.F = SystemClock.elapsedRealtimeNanos();
                                Handler handler = mVar.j;
                                if (handler != null) {
                                    handler.removeCallbacks(mVar.Y);
                                    mVar.j.post(mVar.Y);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    mVar.B = true;
                    int i12 = mVar.v;
                    mVar.v = i12 + 1;
                    boolean z11 = i12 % 30 == 0;
                    if (z11) {
                        GLES20.glFinish();
                        j10 = System.nanoTime();
                    } else {
                        j10 = j3;
                    }
                    mVar.u.k(mVar.p, mVar.t, elapsedRealtimeNanos, mVar.q, mVar.r);
                    if (z11) {
                        GLES20.glFinish();
                        long nanoTime = System.nanoTime() - j10;
                        mVar.P++;
                        mVar.Q += nanoTime;
                        mVar.R = Math.max(mVar.R, nanoTime);
                        mVar.d.b("GPU pipeline sample: currentMs=" + (nanoTime / 1000000.0f) + ", averageMs=" + ((mVar.Q / mVar.P) / 1000000.0f) + ", maxMs=" + (mVar.R / 1000000.0f));
                    }
                    if (mVar.f != j3) {
                        if (mVar.y < j3) {
                            mVar.y = timestamp;
                            mVar.z = mVar.b();
                        }
                        timestamp = Math.max(j3, timestamp - mVar.y) + mVar.z;
                    }
                    mVar.i(Math.max(timestamp, mVar.A + 1));
                } catch (RuntimeException e) {
                    mVar.d.a("GL error", e);
                    b bVar = mVar.h;
                    if (bVar != null) {
                        k2.u uVar = bVar.a;
                        ((h0) uVar.b).h.post(new c0(0, uVar, e));
                    }
                }
            }
        }, this.j);
        this.l = new Surface(this.k);
        Size size = this.a;
        int i11 = this.e;
        int i12 = this.c;
        this.u = new v(i12, size, i11);
        GLES20.glViewport(0, 0, i12, i12);
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        long nanoTime = this.S == 0 ? 0L : System.nanoTime() - this.S;
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.K);
        sb2.append(", inputFps=");
        sb2.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.K * 1.0E9d) / nanoTime));
        sb2.append(", submittedFrames=");
        sb2.append(this.L);
        sb2.append(", submittedFps=");
        sb2.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.L * 1.0E9d) / nanoTime));
        sb2.append(", syntheticFrames=");
        sb2.append(this.M);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.N);
        sb2.append(", maxFrameGapMs=");
        sb2.append(this.O / 1000000.0f);
        sb2.append(", gpuSamples=");
        sb2.append(this.P);
        sb2.append(", gpuAverageMs=");
        int i10 = this.P;
        sb2.append(i10 == 0 ? "n/a" : Float.valueOf((this.Q / i10) / 1000000.0f));
        sb2.append(", gpuMaxMs=");
        sb2.append(this.R / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i11 = this.H;
        sb2.append(i11 != 0 ? Float.valueOf((this.I / i11) / 1000000.0f) : "n/a");
        sb2.append(", swapMaxMs=");
        sb2.append(this.J / 1000000.0f);
        this.d.b(sb2.toString());
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacks(this.Y);
        }
        EGLDisplay eGLDisplay = this.m;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.o) != EGL14.EGL_NO_SURFACE && (eGLContext = this.n) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.k;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        Surface surface = this.l;
        if (surface != null) {
            surface.release();
            this.l = null;
        }
        SurfaceTexture surfaceTexture2 = this.k;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.k = null;
        }
        v vVar = this.u;
        if (vVar != null) {
            vVar.d.a();
            vVar.e.a();
            vVar.f.a();
            vVar.g.a();
            vVar.h.a();
            vVar.i.a();
            int[] iArr = vVar.o;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = vVar.n;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.u = null;
        }
        int i12 = this.p;
        if (i12 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.p = 0;
        }
        EGLDisplay eGLDisplay2 = this.m;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.o;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.m, eGLSurface3);
            }
            EGLContext eGLContext2 = this.n;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.m, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.m);
        }
        this.m = EGL14.EGL_NO_DISPLAY;
        this.n = EGL14.EGL_NO_CONTEXT;
        this.o = EGL14.EGL_NO_SURFACE;
    }

    public final void e() {
        GLES20.glBindTexture(36197, this.p);
        int i10 = this.e == this.c ? 9728 : 9729;
        GLES20.glTexParameteri(36197, 10241, i10);
        GLES20.glTexParameteri(36197, 10240, i10);
    }

    public final Surface g() {
        if (this.T) {
            return this.l;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
        this.i = handlerThread;
        handlerThread.start();
        this.S = System.nanoTime();
        j jVar = this.d;
        StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
        sb2.append(this.a);
        sb2.append(", crop=");
        sb2.append(this.e);
        sb2.append(", output=");
        sb2.append(this.c);
        sb2.append("x");
        sb2.append(this.c);
        sb2.append(", filter=");
        sb2.append(this.e == this.c ? "NEAREST" : "LINEAR");
        jVar.b(sb2.toString());
        Handler handler = new Handler(this.i.getLooper());
        this.j = handler;
        handler.post(new x1(28, this, countDownLatch));
        try {
            countDownLatch.await();
            if (this.X == null) {
                return this.l;
            }
            RuntimeException runtimeException = this.X;
            this.X = null;
            h();
            throw runtimeException;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            h();
            throw new IllegalStateException("GL initialization was interrupted", e);
        }
    }

    public final void h() {
        Handler handler = this.j;
        HandlerThread handlerThread = this.i;
        if (handler != null) {
            handler.removeCallbacks(this.Y);
        }
        this.j = null;
        this.i = null;
        this.T = false;
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
        this.A = j3;
        EGLExt.eglPresentationTimeANDROID(this.m, this.o, j3);
        long nanoTime = System.nanoTime();
        if (!EGL14.eglSwapBuffers(this.m, this.o)) {
            throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        long nanoTime2 = System.nanoTime();
        this.L++;
        long j10 = nanoTime2 - nanoTime;
        this.H++;
        this.I += j10;
        this.J = Math.max(this.J, j10);
        if (this.H % 30 == 0) {
            this.d.b("encoder swap: average=" + ((this.I / this.H) / 1000000.0f) + " ms, max=" + (this.J / 1000000.0f) + " ms");
        }
        i iVar = this.g;
        if (iVar != null) {
            long j11 = iVar.q;
            int i10 = (int) (j11 % 256);
            iVar.h[i10] = j3 / 1000;
            iVar.i[i10] = nanoTime2;
            iVar.q = j11 + 1;
        }
    }

    public final void j(Size size, int i10) {
        Handler handler = this.j;
        if (!this.T || handler == null) {
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
        EGLDisplay eGLDisplay = this.m;
        EGLSurface eGLSurface = this.o;
        int[] iArr = this.s;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.m, this.o, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 <= 0 || i11 <= 0) {
                    return;
                }
                if (i10 == this.q && i11 == this.r) {
                    return;
                }
                this.q = i10;
                this.r = i11;
                this.d.b("EGL output size changed: " + i10 + "x" + i11);
            }
        }
    }
}
