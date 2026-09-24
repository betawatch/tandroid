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
import org.telegram.messenger.BuildVars;
import org.webrtc.EglBase;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class q {
    public long B;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public long K;
    public long L;
    public long M;
    public long N;
    public int O;
    public int P;
    public long Q;
    public int R;
    public long S;
    public long T;
    public long U;
    public volatile boolean V;
    public volatile b X;
    public boolean Y;
    public volatile RuntimeException Z;
    public Size a;
    public final Surface b;
    public final int c;
    public final boolean d;
    public final l e;
    public int f;
    public boolean g;
    public final p i;
    public final a j;
    public HandlerThread k;
    public Handler l;
    public SurfaceTexture m;
    public Surface n;
    public int r;
    public int s;
    public int t;
    public a0 w;
    public int x;
    public int y;
    public long z;
    public EGLDisplay o = EGL14.EGL_NO_DISPLAY;
    public EGLContext p = EGL14.EGL_NO_CONTEXT;
    public EGLSurface q = EGL14.EGL_NO_SURFACE;
    public final int[] u = new int[1];
    public final float[] v = new float[16];
    public long A = -1;
    public long C = -1;
    public final m a0 = new m(this, 0);
    public volatile long h = 0;
    public volatile boolean W = false;

    public q(Size size, Surface surface, int i10, int i11, boolean z10, boolean z11, l lVar, p pVar, a aVar) {
        this.a = size;
        this.b = surface;
        this.c = i10;
        this.f = i11;
        this.g = z10;
        this.d = z11;
        this.e = lVar;
        this.s = i10;
        this.t = i10;
        this.i = pVar;
        this.j = aVar;
    }

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        StringBuilder h = v7.j.h(str, ": 0x");
        h.append(Integer.toHexString(EGL14.eglGetError()));
        throw new IllegalStateException(h.toString());
    }

    public static float f(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        return (3.0f - (max * 2.0f)) * max * max;
    }

    public final long b() {
        return Math.max(this.h == 0 ? this.C + 33333333 : Math.max(0L, SystemClock.elapsedRealtimeNanos() - this.h), this.C + 1);
    }

    public final void c() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.o = eglGetDisplay;
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new IllegalStateException("Unable to get EGL display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new IllegalStateException("Unable to initialize EGL");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig(this.o, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0) {
            throw new IllegalStateException("Unable to choose EGL config");
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.o, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.p = eglCreateContext;
        a("Unable to create EGL context", eglCreateContext != EGL14.EGL_NO_CONTEXT);
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.o, eGLConfigArr[0], this.b, new int[]{12344}, 0);
        this.q = eglCreateWindowSurface;
        a("Unable to create EGL surface", eglCreateWindowSurface != EGL14.EGL_NO_SURFACE);
        EGLDisplay eGLDisplay = this.o;
        EGLSurface eGLSurface = this.q;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.p)) {
            throw new IllegalStateException("Unable to make EGL context current: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        this.e.b("GL initialized: egl=" + iArr[0] + "." + iArr[1] + ", vendor=" + GLES20.glGetString(7936) + ", renderer=" + GLES20.glGetString(7937) + ", version=" + GLES20.glGetString(7938) + ", elapsedMs=" + ((System.nanoTime() - this.U) / 1000000));
        int[] iArr3 = new int[1];
        GLES20.glGenTextures(1, iArr3, 0);
        int i10 = iArr3[0];
        this.r = i10;
        GLES20.glBindTexture(36197, i10);
        e();
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.r);
        this.m = surfaceTexture;
        surfaceTexture.setDefaultBufferSize(this.a.getWidth(), this.a.getHeight());
        this.m.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: ki.o
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
            
                if ((r4 % 60) == 0) goto L31;
             */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0124 A[Catch: RuntimeException -> 0x0054, TryCatch #0 {RuntimeException -> 0x0054, blocks: (B:6:0x0014, B:8:0x002f, B:9:0x0057, B:11:0x005c, B:14:0x0064, B:19:0x006a, B:21:0x007b, B:23:0x008b, B:24:0x0093, B:26:0x0099, B:28:0x009f, B:30:0x00ac, B:32:0x00b5, B:36:0x00bb, B:38:0x00bf, B:39:0x00c8, B:41:0x00cc, B:42:0x00eb, B:44:0x00f0, B:46:0x00fd, B:50:0x010a, B:52:0x0115, B:56:0x0124, B:57:0x012e, B:59:0x0143, B:60:0x018d, B:62:0x0193, B:64:0x0197, B:65:0x01a1, B:67:0x01a9, B:68:0x01b1, B:69:0x01bd, B:73:0x00a9), top: B:5:0x0014 }] */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0143 A[Catch: RuntimeException -> 0x0054, TryCatch #0 {RuntimeException -> 0x0054, blocks: (B:6:0x0014, B:8:0x002f, B:9:0x0057, B:11:0x005c, B:14:0x0064, B:19:0x006a, B:21:0x007b, B:23:0x008b, B:24:0x0093, B:26:0x0099, B:28:0x009f, B:30:0x00ac, B:32:0x00b5, B:36:0x00bb, B:38:0x00bf, B:39:0x00c8, B:41:0x00cc, B:42:0x00eb, B:44:0x00f0, B:46:0x00fd, B:50:0x010a, B:52:0x0115, B:56:0x0124, B:57:0x012e, B:59:0x0143, B:60:0x018d, B:62:0x0193, B:64:0x0197, B:65:0x01a1, B:67:0x01a9, B:68:0x01b1, B:69:0x01bd, B:73:0x00a9), top: B:5:0x0014 }] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0193 A[Catch: RuntimeException -> 0x0054, TryCatch #0 {RuntimeException -> 0x0054, blocks: (B:6:0x0014, B:8:0x002f, B:9:0x0057, B:11:0x005c, B:14:0x0064, B:19:0x006a, B:21:0x007b, B:23:0x008b, B:24:0x0093, B:26:0x0099, B:28:0x009f, B:30:0x00ac, B:32:0x00b5, B:36:0x00bb, B:38:0x00bf, B:39:0x00c8, B:41:0x00cc, B:42:0x00eb, B:44:0x00f0, B:46:0x00fd, B:50:0x010a, B:52:0x0115, B:56:0x0124, B:57:0x012e, B:59:0x0143, B:60:0x018d, B:62:0x0193, B:64:0x0197, B:65:0x01a1, B:67:0x01a9, B:68:0x01b1, B:69:0x01bd, B:73:0x00a9), top: B:5:0x0014 }] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                SurfaceTexture surfaceTexture3;
                long j3;
                boolean z10;
                long j10;
                q qVar = q.this;
                if (!qVar.V || (surfaceTexture3 = qVar.m) == null) {
                    return;
                }
                try {
                    surfaceTexture3.updateTexImage();
                    qVar.m.getTransformMatrix(qVar.v);
                    long timestamp = qVar.m.getTimestamp();
                    long j11 = qVar.M + 1;
                    qVar.M = j11;
                    if (j11 == 1) {
                        qVar.e.b("first GL input frame: cameraTimestampNs=" + timestamp + ", elapsedMs=" + ((System.nanoTime() - qVar.U) / 1000000));
                    }
                    if (!qVar.W) {
                        b bVar = qVar.X;
                        if (qVar.Y || bVar == null) {
                            return;
                        }
                        qVar.Y = true;
                        bVar.run();
                        return;
                    }
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j12 = qVar.z;
                    if (j12 != 0) {
                        long j13 = elapsedRealtimeNanos - j12;
                        j3 = 0;
                        qVar.Q = Math.max(qVar.Q, j13);
                        if (j13 > 50000000) {
                            qVar.P++;
                        }
                    } else {
                        j3 = 0;
                    }
                    long j14 = qVar.z;
                    if (j14 != j3 && elapsedRealtimeNanos - j14 <= 50000000) {
                        int i11 = qVar.y;
                        qVar.y = i11 + 1;
                    }
                    qVar.j();
                    qVar.z = elapsedRealtimeNanos;
                    if (qVar.G != 0) {
                        if (qVar.F) {
                            boolean z11 = qVar.E;
                            if (!z11) {
                                qVar.w.g(qVar.v, qVar.r, true);
                            }
                            qVar.E = true;
                            if (!z11) {
                                qVar.e.b("camera switch first new frame: waitMs=" + ((SystemClock.elapsedRealtimeNanos() - qVar.I) / 1000000.0f) + " ms");
                            }
                            if (qVar.G == 2) {
                                qVar.G = 3;
                                qVar.H = SystemClock.elapsedRealtimeNanos();
                                Handler handler = qVar.l;
                                if (handler != null) {
                                    handler.removeCallbacks(qVar.a0);
                                    qVar.l.post(qVar.a0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    qVar.D = true;
                    qVar.e.getClass();
                    if (BuildVars.LOGS_ENABLED) {
                        int i12 = qVar.x;
                        qVar.x = i12 + 1;
                        if (i12 % 30 == 0) {
                            z10 = true;
                            if (z10) {
                                j10 = j3;
                            } else {
                                GLES20.glFinish();
                                j10 = System.nanoTime();
                            }
                            qVar.w.l(qVar.r, qVar.v, elapsedRealtimeNanos, qVar.s, qVar.t);
                            if (z10) {
                                GLES20.glFinish();
                                long nanoTime = System.nanoTime() - j10;
                                qVar.R++;
                                qVar.S += nanoTime;
                                qVar.T = Math.max(qVar.T, nanoTime);
                                qVar.e.b("GPU pipeline sample: currentMs=" + (nanoTime / 1000000.0f) + ", averageMs=" + ((qVar.S / qVar.R) / 1000000.0f) + ", maxMs=" + (qVar.T / 1000000.0f));
                            }
                            if (qVar.h != j3) {
                                if (qVar.g) {
                                    timestamp = Math.max(j3, timestamp - qVar.h);
                                } else {
                                    if (qVar.A < j3) {
                                        qVar.A = timestamp;
                                        qVar.B = qVar.b();
                                    }
                                    timestamp = Math.max(0L, timestamp - qVar.A) + qVar.B;
                                }
                            }
                            qVar.h(Math.max(timestamp, qVar.C + 1));
                        }
                    }
                    z10 = false;
                    if (z10) {
                    }
                    qVar.w.l(qVar.r, qVar.v, elapsedRealtimeNanos, qVar.s, qVar.t);
                    if (z10) {
                    }
                    if (qVar.h != j3) {
                    }
                    qVar.h(Math.max(timestamp, qVar.C + 1));
                } catch (RuntimeException e) {
                    qVar.e.a("GL error", e);
                    a aVar = qVar.j;
                    if (aVar != null) {
                        k2.u uVar = aVar.a;
                        ((r0) uVar.b).h.post(new n(2, uVar, e));
                    }
                }
            }
        }, this.l);
        this.n = new Surface(this.m);
        Size size = this.a;
        int i11 = this.f;
        boolean z10 = this.d;
        int i12 = this.c;
        this.w = new a0(i12, size, i11, z10);
        GLES20.glViewport(0, 0, i12, i12);
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLContext eGLContext;
        long nanoTime = this.U == 0 ? 0L : System.nanoTime() - this.U;
        StringBuilder sb2 = new StringBuilder("GL summary: inputFrames=");
        sb2.append(this.M);
        sb2.append(", inputFps=");
        sb2.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.M * 1.0E9d) / nanoTime));
        sb2.append(", submittedFrames=");
        sb2.append(this.N);
        sb2.append(", submittedFps=");
        sb2.append(nanoTime <= 0 ? "n/a" : String.valueOf((this.N * 1.0E9d) / nanoTime));
        sb2.append(", syntheticFrames=");
        sb2.append(this.O);
        sb2.append(", largeFrameGaps=");
        sb2.append(this.P);
        sb2.append(", maxFrameGapMs=");
        sb2.append(this.Q / 1000000.0f);
        sb2.append(", gpuSamples=");
        sb2.append(this.R);
        sb2.append(", gpuAverageMs=");
        int i10 = this.R;
        sb2.append(i10 == 0 ? "n/a" : Float.valueOf((this.S / i10) / 1000000.0f));
        sb2.append(", gpuMaxMs=");
        sb2.append(this.T / 1000000.0f);
        sb2.append(", swapAverageMs=");
        int i11 = this.J;
        sb2.append(i11 != 0 ? Float.valueOf((this.K / i11) / 1000000.0f) : "n/a");
        sb2.append(", swapMaxMs=");
        sb2.append(this.L / 1000000.0f);
        this.e.b(sb2.toString());
        Handler handler = this.l;
        if (handler != null) {
            handler.removeCallbacks(this.a0);
        }
        EGLDisplay eGLDisplay = this.o;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY && (eGLSurface = this.q) != EGL14.EGL_NO_SURFACE && (eGLContext = this.p) != EGL14.EGL_NO_CONTEXT) {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        }
        SurfaceTexture surfaceTexture = this.m;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        Surface surface = this.n;
        if (surface != null) {
            surface.release();
            this.n = null;
        }
        SurfaceTexture surfaceTexture2 = this.m;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.m = null;
        }
        a0 a0Var = this.w;
        if (a0Var != null) {
            a0Var.e.a();
            a0Var.f.a();
            a0Var.g.a();
            a0Var.h.a();
            a0Var.i.a();
            x xVar = a0Var.j;
            if (xVar != null) {
                xVar.a();
            }
            int[] iArr = a0Var.p;
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int[] iArr2 = a0Var.o;
            GLES20.glDeleteFramebuffers(iArr2.length, iArr2, 0);
            this.w = null;
        }
        int i12 = this.r;
        if (i12 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
            this.r = 0;
        }
        EGLDisplay eGLDisplay2 = this.o;
        if (eGLDisplay2 != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface3 = this.q;
            if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.o, eGLSurface3);
            }
            EGLContext eGLContext2 = this.p;
            if (eGLContext2 != EGL14.EGL_NO_CONTEXT) {
                EGL14.eglDestroyContext(this.o, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.o);
        }
        this.o = EGL14.EGL_NO_DISPLAY;
        this.p = EGL14.EGL_NO_CONTEXT;
        this.q = EGL14.EGL_NO_SURFACE;
    }

    public final void e() {
        GLES20.glBindTexture(36197, this.r);
        int i10 = this.f == this.c ? 9728 : 9729;
        GLES20.glTexParameteri(36197, 10241, i10);
        GLES20.glTexParameteri(36197, 10240, i10);
    }

    public final void g() {
        Handler handler = this.l;
        HandlerThread handlerThread = this.k;
        if (handler != null) {
            handler.removeCallbacks(this.a0);
        }
        this.l = null;
        this.k = null;
        this.V = false;
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

    public final void h(long j3) {
        this.C = j3;
        EGLExt.eglPresentationTimeANDROID(this.o, this.q, j3);
        long nanoTime = System.nanoTime();
        if (!EGL14.eglSwapBuffers(this.o, this.q)) {
            throw new IllegalStateException("Unable to swap EGL buffers: 0x" + Integer.toHexString(EGL14.eglGetError()));
        }
        long nanoTime2 = System.nanoTime();
        this.N++;
        long j10 = nanoTime2 - nanoTime;
        this.J++;
        this.K += j10;
        this.L = Math.max(this.L, j10);
        if (this.J % 30 == 0) {
            this.e.b("encoder swap: average=" + ((this.K / this.J) / 1000000.0f) + " ms, max=" + (this.L / 1000000.0f) + " ms");
        }
        p pVar = this.i;
        if (pVar != null) {
            k kVar = (k) pVar;
            long j11 = kVar.t;
            int i10 = (int) (j11 % 256);
            kVar.k[i10] = j3 / 1000;
            kVar.l[i10] = nanoTime2;
            kVar.t = j11 + 1;
        }
    }

    public final void i(Size size, int i10, boolean z10) {
        Handler handler = this.l;
        if (!this.V || handler == null) {
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

    public final void j() {
        EGLDisplay eGLDisplay = this.o;
        EGLSurface eGLSurface = this.q;
        int[] iArr = this.u;
        if (EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0)) {
            int i10 = iArr[0];
            if (EGL14.eglQuerySurface(this.o, this.q, 12374, iArr, 0)) {
                int i11 = iArr[0];
                if (i10 <= 0 || i11 <= 0) {
                    return;
                }
                if (i10 == this.s && i11 == this.t) {
                    return;
                }
                this.s = i10;
                this.t = i11;
                this.e.b("EGL output size changed: " + i10 + "x" + i11);
            }
        }
    }
}
