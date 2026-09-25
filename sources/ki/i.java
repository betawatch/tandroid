package ki;

import ai.h5;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import ci.f4;
import com.google.android.gms.internal.vision.e2;
import gg.x1;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class i {
    public CaptureRequest.Builder A;
    public long A0;
    public t B;
    public long B0;
    public volatile l0 C;
    public long C0;
    public l0 D;
    public long D0;
    public l0 E;
    public double E0;
    public m0 F;
    public long F0;
    public n0 G;
    public long G0;
    public Range H;
    public long H0;
    public j6.l I;
    public long I0;
    public long J;
    public long J0;
    public volatile float K;
    public long K0;
    public long L0;
    public boolean M;
    public final f4 M0;
    public boolean N;
    public final a N0;
    public int O;
    public final a O0;
    public int P;
    public final d P0;
    public int Q;
    public final e Q0;
    public int R;
    public final f R0;
    public volatile boolean S;
    public final g S0;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public volatile boolean X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final Context a;
    public boolean a0;
    public final CameraManager b;
    public boolean b0;
    public final TextureView c;
    public boolean c0;
    public final q0 d;
    public boolean d0;
    public final int e;
    public boolean e0;
    public final int f;
    public long f0;
    public final m0 g;
    public long g0;
    public final n0 h;
    public long h0;
    public final boolean i;
    public long i0;
    public final m j;
    public long j0;
    public final k2.u k;
    public long k0;
    public long l0;
    public HandlerThread m;
    public long m0;
    public Handler n;
    public long n0;
    public String o;
    public long o0;
    public CameraCharacteristics p;
    public double p0;
    public Size q;
    public long q0;
    public volatile Size r;
    public long r0;
    public volatile int s;
    public long s0;
    public Surface t;
    public long t0;
    public Surface u;
    public long u0;
    public q v;
    public long v0;
    public l w;
    public long w0;
    public l x;
    public long x0;
    public CameraDevice y;
    public long y0;
    public CameraCaptureSession z;
    public long z0;
    public final Rect l = new Rect();
    public float L = 1.0f;

    public i(Context context, TextureView textureView, q0 q0Var, int i10, m0 m0Var, n0 n0Var, boolean z10, m mVar, k2.u uVar) {
        f4 f4Var = new f4(this, 2);
        this.M0 = f4Var;
        this.N0 = new a(this, 3);
        this.O0 = new a(this, 4);
        this.P0 = new d(this, 0);
        this.Q0 = new e(this);
        this.R0 = new f(this);
        this.S0 = new g(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = textureView;
        this.d = q0Var;
        this.e = q0Var.a;
        this.f = i10;
        this.g = m0Var;
        this.h = n0Var;
        this.i = z10;
        this.j = mVar;
        this.k = uVar;
        textureView.addOnLayoutChangeListener(f4Var);
    }

    public static int A(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float B(double d, long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        double d10 = j10;
        double d11 = j3 / d10;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d10) - (d11 * d11))) / 1000000.0d);
    }

    public static long b(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float c(long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        return (j3 / j10) / 1000000.0f;
    }

    public static j6.l e(Size[] sizeArr, q0 q0Var, m0 m0Var) {
        int i10;
        j6.l g10;
        m0 m0Var2;
        j6.l g11;
        m0 m0Var3 = m0.c;
        if (m0Var == m0Var3) {
            i10 = q0Var.a;
        } else {
            q0 q0Var2 = q0.b;
            m0 m0Var4 = m0.a;
            if (q0Var == q0Var2) {
                if (m0Var == m0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (m0Var != m0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l g12 = g(sizeArr, i10, m0Var);
        if (g12 != null) {
            return g12;
        }
        if (q0Var == q0.c && m0Var == (m0Var2 = m0.b) && (g11 = g(sizeArr, 480, m0Var2)) != null) {
            return g11;
        }
        int i11 = q0Var.a;
        if (m0Var != m0Var3 && (g10 = g(sizeArr, i11, m0Var3)) != null) {
            return g10;
        }
        int i12 = q0Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (A(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || b(size2) < b(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (A(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && b(size3) < b(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(f(sizeArr, size), size, m0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size f(Size[] sizeArr, Size size) {
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(A(size2) - 720);
                if ((abs != abs2 ? Integer.compare(abs, abs2) : Long.compare(b(size3), b(size2))) < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.l g(Size[] sizeArr, int i10, m0 m0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int A = A(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (A >= i10 && A <= i11 && max <= min) {
                Size f7 = f(sizeArr, size);
                j6.l lVar2 = new j6.l(f7, size, m0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.b;
                    int abs = Math.abs(Math.min(f7.getWidth(), f7.getHeight()) - 720);
                    Size size3 = (Size) lVar.c;
                    int abs2 = Math.abs(A(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long b10 = b(size) + b(f7);
                        long b11 = b(size3) + b(size2);
                        compare = b10 != b11 ? Long.compare(b10, b11) : Long.compare(b(size), b(size3));
                    }
                    if (compare >= 0) {
                    }
                }
                lVar = lVar2;
            }
        }
        return lVar;
    }

    public static long m(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range o(Range[] rangeArr, int i10) {
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        for (Range range2 : rangeArr) {
            if (range2.contains((Range) Integer.valueOf(i10)) && (range == null || ((Integer) range2.getLower()).intValue() > ((Integer) range.getLower()).intValue() || (((Integer) range2.getLower()).equals(range.getLower()) && ((Integer) range2.getUpper()).intValue() < ((Integer) range.getUpper()).intValue()))) {
                range = range2;
            }
        }
        return range;
    }

    public final void C(t tVar, long j3, l0 l0Var) {
        if (this.m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
        this.B = tVar;
        this.J = j3;
        this.C = l0Var;
        this.S = true;
        this.Y = false;
        this.x = null;
        this.Z = true;
        this.f0 = SystemClock.elapsedRealtimeNanos();
        v();
        u();
        this.j.b("camera segment start: facing=" + l0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.c.isAvailable());
        this.c.setSurfaceTextureListener(this.P0);
        Handler handler = this.n;
        if (this.S && handler != null && this.c.isAvailable()) {
            handler.post(new a(this, 5));
        }
    }

    public final boolean D() {
        Handler handler = this.n;
        if (!this.S || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean E(l0 l0Var) {
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        int i10 = l0Var == l0.a ? 0 : 1;
        CameraManager cameraManager = this.b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((n0) w(str, cameraCharacteristics, streamConfigurationMap, outputSizes, e(outputSizes, this.d, this.g)).b) == n0.c) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void F(l0 l0Var) {
        if (!this.S || this.U || l0Var == this.D) {
            return;
        }
        this.U = true;
        this.W = true;
        this.M = false;
        this.N = false;
        this.K = 0.0f;
        k2.u uVar = this.k;
        ((s0) uVar.b).h.post(new h0(0, uVar, l0Var));
        this.i0 = SystemClock.elapsedRealtimeNanos();
        this.j.b("camera device switch started: from=" + this.D + ", to=" + l0Var);
        q qVar = this.v;
        if (qVar != null) {
            l0 l0Var2 = this.D;
            Handler handler = qVar.m;
            if (qVar.Z && handler != null) {
                handler.post(new h5(qVar, l0Var2, l0Var, handler, 20));
            }
        }
        i();
        CameraDevice cameraDevice = this.y;
        if (cameraDevice != null) {
            this.y = null;
            cameraDevice.close();
        } else {
            if (this.T) {
                return;
            }
            this.U = false;
            r();
        }
    }

    public final void G() {
        Size size;
        Integer num;
        if (!this.Z || (size = this.r) == null || this.c.getWidth() == 0 || this.c.getHeight() == 0) {
            return;
        }
        int min = Math.min(this.s, Math.min(size.getWidth(), size.getHeight()));
        TextureView textureView = this.c;
        boolean z10 = false;
        if (this.p != null && textureView.getDisplay() != null && (num = (Integer) this.p.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
            int intValue = ((num.intValue() - (textureView.getDisplay().getRotation() * 90)) + 360) % 360;
            if (intValue == 90 || intValue == 270) {
                z10 = true;
            }
        }
        float f7 = min;
        float height = (z10 ? size.getHeight() : size.getWidth()) / f7;
        float width = (z10 ? size.getWidth() : size.getHeight()) / f7;
        Matrix matrix = new Matrix();
        matrix.setScale(height, width, this.c.getWidth() * 0.5f, this.c.getHeight() * 0.5f);
        this.c.setTransform(matrix);
        this.j.b("preview transform: view=" + this.c.getWidth() + "x" + this.c.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + height + "x" + width);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        CameraCaptureSession cameraCaptureSession = this.z;
        if (!this.S || cameraCaptureSession == null || this.y == null) {
            return;
        }
        try {
            CaptureRequest.Builder l4 = l(false);
            this.A = l4;
            CameraCaptureSession cameraCaptureSession2 = this.z;
            if (cameraCaptureSession2 != null) {
                cameraCaptureSession2.setRepeatingRequest(l4.build(), this.S0, this.n);
            }
        } catch (CameraAccessException e) {
            e = e;
            if (this.G != n0.c) {
                n("60 fps updated request rejected", e);
            } else {
                t(e);
            }
        } catch (IllegalArgumentException e7) {
            e = e7;
            if (this.G != n0.c) {
            }
        } catch (IllegalStateException e10) {
            if (!this.S || this.Y || cameraCaptureSession != this.z) {
                this.j.b("stale repeating request rejection ignored: " + e10.getMessage());
                return;
            }
            this.j.b("repeating request rejected by closed camera; reopening device: " + e10.getMessage());
            i();
            CameraDevice cameraDevice = this.y;
            this.y = null;
            this.T = false;
            if (cameraDevice == null) {
                r();
            } else {
                this.V = true;
                cameraDevice.close();
            }
        }
    }

    public final void d() {
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacks(this.N0);
        }
        this.x = null;
    }

    public final void h() {
        d();
        this.T = false;
        this.U = false;
        this.V = false;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.A = null;
        this.N = false;
        i();
        CameraDevice cameraDevice = this.y;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.y = null;
        }
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        q qVar = this.v;
        if (qVar != null) {
            qVar.h();
            this.v = null;
        }
        this.u = null;
    }

    public final void i() {
        CameraCaptureSession cameraCaptureSession = this.z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.z = null;
        }
        this.A = null;
    }

    public final void j() {
        CameraDevice cameraDevice = this.y;
        if (cameraDevice == null || this.t == null || this.u == null) {
            return;
        }
        try {
            this.h0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("capture session requested: preview=" + this.q + ", recording=" + this.r + ", fpsRange=" + this.H);
            cameraDevice.createCaptureSession(Arrays.asList(this.t, this.u), this.R0, this.n);
        } catch (CameraAccessException | IllegalArgumentException e) {
            if (this.G == n0.c) {
                n("60 fps session creation rejected", e);
            } else {
                t(e);
            }
        }
    }

    public final void k() {
        Surface surface;
        Surface surface2;
        t tVar = this.B;
        long j3 = this.J;
        int i10 = this.e;
        int i11 = this.f;
        int i12 = this.G.a;
        m mVar = this.j;
        k2.u uVar = this.k;
        Objects.requireNonNull(uVar);
        l lVar = new l(tVar, j3, i10, i11, i12, mVar, new b(uVar));
        this.w = lVar;
        synchronized (lVar) {
            if (lVar.y) {
                surface = lVar.p;
            } else {
                lVar.m();
                long nanoTime = System.nanoTime();
                try {
                    lVar.b();
                    lVar.a();
                    lVar.m.start();
                    lVar.y = true;
                    lVar.f.b("codecs prepared: video=" + lVar.m.getName() + ", audio=" + lVar.n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = lVar.p;
                } catch (IOException | RuntimeException e) {
                    lVar.j();
                    throw e;
                }
            }
        }
        Surface surface3 = surface;
        Size size = this.r;
        int i13 = this.e;
        int i14 = this.s;
        boolean p5 = p();
        boolean z10 = this.i;
        m mVar2 = this.j;
        l lVar2 = this.w;
        k2.u uVar2 = this.k;
        Objects.requireNonNull(uVar2);
        q qVar = new q(size, surface3, i13, i14, p5, z10, mVar2, lVar2, new b(uVar2));
        this.v = qVar;
        qVar.b0 = new a(this, 1);
        q qVar2 = this.v;
        if (qVar2.Z) {
            surface2 = qVar2.o;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            qVar2.l = handlerThread;
            handlerThread.start();
            qVar2.Y = System.nanoTime();
            m mVar3 = qVar2.e;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(qVar2.a);
            sb2.append(", crop=");
            sb2.append(qVar2.f);
            sb2.append(", output=");
            sb2.append(qVar2.c);
            sb2.append("x");
            sb2.append(qVar2.c);
            sb2.append(", filter=");
            sb2.append(qVar2.f == qVar2.c ? "NEAREST" : "LINEAR");
            sb2.append(", composition=");
            sb2.append(qVar2.d);
            mVar3.b(sb2.toString());
            Handler handler = new Handler(qVar2.l.getLooper());
            qVar2.m = handler;
            handler.post(new x1(29, qVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (qVar2.d0 != null) {
                    RuntimeException runtimeException = qVar2.d0;
                    qVar2.d0 = null;
                    qVar2.h();
                    throw runtimeException;
                }
                surface2 = qVar2.o;
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                qVar2.h();
                throw new IllegalStateException("GL initialization was interrupted", e7);
            }
        }
        this.u = surface2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CaptureRequest.Builder l(boolean z10) {
        int[] iArr;
        CameraCharacteristics.Key key;
        Range range;
        CameraDevice cameraDevice = this.y;
        if (cameraDevice == null || this.t == null || this.u == null) {
            throw new IllegalStateException("Camera request surfaces are unavailable");
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
        createCaptureRequest.addTarget(this.t);
        createCaptureRequest.addTarget(this.u);
        createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
        createCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
        CameraCharacteristics cameraCharacteristics = this.p;
        int[] iArr2 = cameraCharacteristics == null ? null : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 != null) {
            int length = iArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (iArr2[i10] == 3) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    break;
                }
                i10++;
            }
        }
        m mVar = this.j;
        Range range2 = this.H;
        if (range2 != null) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
            if (z10) {
                mVar.b("capture FPS range selected: " + this.H);
            }
        } else if (z10) {
            mVar.b("capture FPS range unavailable; HAL default will be used");
        }
        float z11 = e2.z(this.L, 1.0f, this.K, 1.0f);
        if (Build.VERSION.SDK_INT >= 30) {
            CameraCharacteristics cameraCharacteristics2 = this.p;
            if (cameraCharacteristics2 == null) {
                range = null;
            } else {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) cameraCharacteristics2.get(key);
            }
            if (range != null) {
                createCaptureRequest.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), z11))));
                boolean z12 = !this.M && q();
                CameraCharacteristics cameraCharacteristics3 = this.p;
                iArr = cameraCharacteristics3 != null ? (int[]) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) : null;
                if (iArr != null) {
                    int length2 = iArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            break;
                        }
                        if (iArr[i11] == 1) {
                            createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                            break;
                        }
                        i11++;
                    }
                }
                CaptureRequest.Key key2 = CaptureRequest.FLASH_MODE;
                createCaptureRequest.set(key2, Integer.valueOf(z12 ? 2 : 0));
                if (this.N) {
                    this.j.b("torch request configured: requested=" + this.M + ", applied=" + z12 + ", aeMode=" + createCaptureRequest.get(CaptureRequest.CONTROL_AE_MODE) + ", flashMode=" + createCaptureRequest.get(key2) + ", cameraId=" + this.o);
                }
                int i12 = this.Q + 1;
                this.Q = i12;
                createCaptureRequest.setTag(Integer.valueOf(i12));
                if (this.N) {
                    this.R = this.Q;
                }
                return createCaptureRequest;
            }
        }
        CameraCharacteristics cameraCharacteristics4 = this.p;
        Rect rect = cameraCharacteristics4 == null ? null : (Rect) cameraCharacteristics4.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            int max = Math.max(1, Math.round(rect.width() / z11));
            int max2 = Math.max(1, Math.round(rect.height() / z11));
            int centerX = rect.centerX() - (max / 2);
            int centerY = rect.centerY() - (max2 / 2);
            this.l.set(centerX, centerY, max + centerX, max2 + centerY);
            createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.l);
        }
        if (this.M) {
        }
        CameraCharacteristics cameraCharacteristics32 = this.p;
        if (cameraCharacteristics32 != null) {
        }
        if (iArr != null) {
        }
        CaptureRequest.Key key22 = CaptureRequest.FLASH_MODE;
        createCaptureRequest.set(key22, Integer.valueOf(z12 ? 2 : 0));
        if (this.N) {
        }
        int i122 = this.Q + 1;
        this.Q = i122;
        createCaptureRequest.setTag(Integer.valueOf(i122));
        if (this.N) {
        }
        return createCaptureRequest;
    }

    public final void n(String str, Exception exc) {
        String str2;
        boolean z10;
        if (this.c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            t(exc);
            return;
        }
        this.c0 = true;
        i();
        j6.l lVar = this.I;
        if (lVar == null) {
            t(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.G = n0.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.H = o(cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES), 30);
        this.q = (Size) lVar.b;
        this.r = (Size) lVar.c;
        this.s = lVar.a;
        this.F = (m0) lVar.d;
        SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
        }
        l lVar2 = this.w;
        if (lVar2 != null) {
            synchronized (lVar2) {
                z10 = lVar2.z;
            }
            if (z10) {
                t(new IllegalStateException("Unable to change encoder frame rate after recording started", exc));
                return;
            }
        }
        q qVar = this.v;
        if (qVar != null) {
            qVar.h();
            this.v = null;
        }
        l lVar3 = this.w;
        if (lVar3 != null) {
            lVar3.q();
            this.w = null;
        }
        this.u = null;
        try {
            k();
            u();
            m mVar = this.j;
            StringBuilder sb2 = new StringBuilder("60 fps fallback: reason=");
            sb2.append(str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            sb2.append(", preview=");
            sb2.append(this.q);
            sb2.append(", recording=");
            sb2.append(this.r);
            sb2.append(", crop=");
            sb2.append(this.s);
            sb2.append(", fpsRange=");
            sb2.append(this.H);
            mVar.b(sb2.toString());
            Handler handler = this.n;
            if (!this.S || handler == null) {
                return;
            }
            handler.post(new a(this, 0));
        } catch (Exception e) {
            t(e);
        }
    }

    public final boolean p() {
        Integer num;
        CameraCharacteristics cameraCharacteristics = this.p;
        return (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) ? false : true;
    }

    public final boolean q() {
        CameraCharacteristics cameraCharacteristics;
        return this.D == l0.b && (cameraCharacteristics = this.p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
    }

    public final void r() {
        if (this.S && !this.T && this.y == null) {
            if (f0.e.b(this.a, "android.permission.CAMERA") != 0) {
                t(new SecurityException("Camera permission is not granted"));
                return;
            }
            if (f0.e.b(this.a, "android.permission.RECORD_AUDIO") != 0) {
                t(new SecurityException("Audio recording permission is not granted"));
                return;
            }
            try {
                x(this.C);
                SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                if (surfaceTexture == null) {
                    return;
                }
                surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
                if (this.t == null) {
                    this.t = new Surface(surfaceTexture);
                }
                if (this.w == null) {
                    k();
                } else {
                    q qVar = this.v;
                    if (qVar != null) {
                        qVar.j(this.r, this.s, p());
                        Surface surface = this.v.o;
                        if (surface == null) {
                            throw new IllegalStateException("GL processor is not started");
                        }
                        this.u = surface;
                    }
                }
                this.T = true;
                this.g0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("camera open requested: id=" + this.o + ", preview=" + this.q + ", recording=" + this.r + ", crop=" + this.s);
                this.b.openCamera(this.o, this.Q0, this.n);
            } catch (Exception e) {
                this.T = false;
                t(e);
            }
        }
    }

    public final void s() {
        this.S = false;
        this.c.setSurfaceTextureListener(null);
        this.c.removeOnLayoutChangeListener(this.M0);
        Handler handler = this.n;
        HandlerThread handlerThread = this.m;
        this.n = null;
        this.m = null;
        if (handler == null || handlerThread == null) {
            return;
        }
        handler.post(new x1(28, this, handlerThread));
    }

    public final void t(Exception exc) {
        this.j.a("camera error", exc);
        k2.u uVar = this.k;
        ((s0) uVar.b).h.post(new h0(1, uVar, exc));
    }

    public final void u() {
        this.y0 = 0L;
        this.z0 = 0L;
        this.A0 = 0L;
        this.B0 = 0L;
        this.C0 = 0L;
        this.D0 = 0L;
        this.E0 = 0.0d;
        this.F0 = 0L;
        this.G0 = 0L;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
    }

    public final void v() {
        this.j0 = 0L;
        this.k0 = 0L;
        this.l0 = 0L;
        this.m0 = 0L;
        this.n0 = 0L;
        this.o0 = 0L;
        this.p0 = 0.0d;
        this.q0 = 0L;
        this.r0 = 0L;
        this.s0 = 0L;
        this.t0 = 0L;
        this.u0 = 0L;
        this.v0 = 0L;
        this.w0 = 0L;
        this.x0 = 0L;
    }

    public final aa.a w(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        Range[] rangeArr;
        Range[] rangeArr2;
        Size[] sizeArr2 = sizeArr;
        Range[] rangeArr3 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        m mVar = this.j;
        n0 n0Var = this.h;
        n0 n0Var2 = n0.b;
        if (n0Var == n0Var2 || this.e0) {
            Range o9 = o(rangeArr3, 30);
            StringBuilder w10 = a4.a.w("fps selection: id=", str, ", requested=");
            w10.append(n0Var.a);
            w10.append(", mode=REGULAR, range=");
            w10.append(o9);
            w10.append(this.e0 ? ", reason=session-wide fallback" : "");
            mVar.b(w10.toString());
            return new aa.a(n0Var2, o9, lVar, false, 27);
        }
        int i10 = n0Var.a;
        Range o10 = o(rangeArr3, i10);
        if (o10 != null) {
            ArrayList arrayList = new ArrayList(sizeArr2.length);
            int length = sizeArr2.length;
            int i11 = 0;
            while (i11 < length) {
                Size size = sizeArr2[i11];
                int i12 = i11;
                long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                if (outputMinFrameDuration > 0) {
                    rangeArr2 = rangeArr3;
                    if (outputMinFrameDuration > 1000000000 / i10) {
                        i11 = i12 + 1;
                        rangeArr3 = rangeArr2;
                        sizeArr2 = sizeArr;
                    }
                } else {
                    rangeArr2 = rangeArr3;
                }
                arrayList.add(size);
                i11 = i12 + 1;
                rangeArr3 = rangeArr2;
                sizeArr2 = sizeArr;
            }
            rangeArr = rangeArr3;
            Size[] sizeArr3 = (Size[]) arrayList.toArray(new Size[0]);
            try {
                j6.l e = e(sizeArr3, this.d, this.g);
                mVar.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + o10 + ", compatibleSizes=" + Arrays.toString(sizeArr3));
                return new aa.a(n0.c, o10, e, false, 27);
            } catch (RuntimeException unused) {
                mVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr3));
            }
        } else {
            rangeArr = rangeArr3;
            mVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
        }
        Range o11 = o(rangeArr, 30);
        mVar.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + o11);
        return new aa.a(n0Var2, o11, lVar, false, 27);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x018f, code lost:
    
        if ((r30 == r8 && r10.equals(r3.get(r11)) && !r10.equals(((android.hardware.camera2.CameraCharacteristics) r15.b).get(r11))) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01be, code lost:
    
        if ((r30 == r8 && r10.equals(r3.get(r11)) && !r10.equals(((android.hardware.camera2.CameraCharacteristics) r14.b).get(r11))) != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(l0 l0Var) {
        float floatValue;
        long outputMinFrameDuration;
        StreamConfigurationMap streamConfigurationMap;
        Size[] sizeArr;
        int i10;
        long j3;
        String str;
        CameraCharacteristics.Key key;
        l0 l0Var2;
        int i11;
        int i12;
        int i13;
        String[] strArr;
        cf.c cVar;
        cf.c cVar2;
        String str2;
        j6.l e;
        aa.a w10;
        cf.c cVar3;
        n0 n0Var;
        l0 l0Var3 = l0.b;
        l0 l0Var4 = l0.a;
        if (!this.d0) {
            this.d0 = true;
            if (this.h == n0.c) {
                boolean E = E(l0Var4);
                boolean E2 = E(l0Var3);
                this.e0 = (E && E2) ? false : true;
                m mVar = this.j;
                StringBuilder sb2 = new StringBuilder("60 fps session capability: front=");
                sb2.append(E);
                sb2.append(", back=");
                sb2.append(E2);
                sb2.append(", selected=");
                sb2.append(this.e0 ? 30 : 60);
                mVar.b(sb2.toString());
            }
        }
        int i14 = l0Var == l0Var4 ? 0 : 1;
        String[] cameraIdList = this.b.getCameraIdList();
        int length = cameraIdList.length;
        cf.c cVar4 = null;
        cf.c cVar5 = null;
        int i15 = 0;
        while (i15 < length) {
            cf.c cVar6 = cVar4;
            String str3 = cameraIdList[i15];
            cf.c cVar7 = cVar5;
            CameraCharacteristics cameraCharacteristics = this.b.getCameraCharacteristics(str3);
            int i16 = i15;
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num == null || num.intValue() != i14) {
                l0Var2 = l0Var4;
                i11 = i14;
            } else {
                StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                i11 = i14;
                if (streamConfigurationMap2 == null) {
                    this.j.b("camera candidate rejected: id=" + str3 + ", reason=no stream map");
                    l0Var2 = l0Var4;
                } else {
                    Size[] outputSizes = streamConfigurationMap2.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        l0Var2 = l0Var4;
                        strArr = cameraIdList;
                        i13 = length;
                        cVar2 = cVar6;
                        cVar = cVar7;
                        i12 = i16;
                        this.j.b("camera candidate rejected: id=" + str3 + ", reason=no SurfaceTexture outputs");
                    } else {
                        try {
                            try {
                                e = e(outputSizes, this.d, this.g);
                                l0Var2 = l0Var4;
                                strArr = cameraIdList;
                                i13 = length;
                                cVar2 = cVar6;
                                cVar = cVar7;
                                i12 = i16;
                                str3 = str3;
                                try {
                                    w10 = w(str3, cameraCharacteristics, streamConfigurationMap2, outputSizes, e);
                                } catch (RuntimeException e7) {
                                    e = e7;
                                }
                            } catch (RuntimeException e10) {
                                e = e10;
                                l0Var2 = l0Var4;
                                strArr = cameraIdList;
                                i13 = length;
                                cVar2 = cVar6;
                                cVar = cVar7;
                                i12 = i16;
                                str3 = str3;
                            }
                        } catch (RuntimeException e11) {
                            e = e11;
                            l0Var2 = l0Var4;
                            strArr = cameraIdList;
                            i13 = length;
                            cVar2 = cVar6;
                            cVar = cVar7;
                            i12 = i16;
                        }
                        try {
                            cVar3 = new cf.c(str3, cameraCharacteristics, outputSizes, e, w10);
                            str3 = str3;
                            m mVar2 = this.j;
                            StringBuilder sb3 = new StringBuilder();
                            str2 = "camera candidate rejected: id=";
                            try {
                                sb3.append("camera candidate accepted: id=");
                                sb3.append(str3);
                                sb3.append(", facing=");
                                sb3.append(l0Var);
                                sb3.append(", flashAvailable=");
                                Boolean bool = Boolean.TRUE;
                                CameraCharacteristics.Key key2 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                                sb3.append(bool.equals(cameraCharacteristics.get(key2)));
                                sb3.append(", fps=");
                                sb3.append(((n0) w10.b).a);
                                sb3.append(", preview=");
                                sb3.append((Size) ((j6.l) w10.d).b);
                                sb3.append(", recording=");
                                sb3.append((Size) ((j6.l) w10.d).c);
                                mVar2.b(sb3.toString());
                                if (cVar != null) {
                                }
                                cVar = cVar3;
                                n0Var = this.h;
                            } catch (RuntimeException e12) {
                                e = e12;
                                cVar5 = cVar;
                                this.j.b(str2 + str3 + ", reason=" + e);
                                cVar4 = cVar2;
                                i15 = i12 + 1;
                                i14 = i11;
                                cameraIdList = strArr;
                                length = i13;
                                l0Var4 = l0Var2;
                            }
                        } catch (RuntimeException e13) {
                            e = e13;
                            str3 = str3;
                            str2 = "camera candidate rejected: id=";
                            cVar5 = cVar;
                            this.j.b(str2 + str3 + ", reason=" + e);
                            cVar4 = cVar2;
                            i15 = i12 + 1;
                            i14 = i11;
                            cameraIdList = strArr;
                            length = i13;
                            l0Var4 = l0Var2;
                        }
                        if (n0Var == n0.b || ((n0) w10.b) == n0Var) {
                            if (cVar2 != null) {
                            }
                            cVar4 = cVar3;
                            cVar5 = cVar;
                            i15 = i12 + 1;
                            i14 = i11;
                            cameraIdList = strArr;
                            length = i13;
                            l0Var4 = l0Var2;
                        }
                    }
                    cVar4 = cVar2;
                    cVar5 = cVar;
                    i15 = i12 + 1;
                    i14 = i11;
                    cameraIdList = strArr;
                    length = i13;
                    l0Var4 = l0Var2;
                }
            }
            strArr = cameraIdList;
            i13 = length;
            cVar2 = cVar6;
            cVar = cVar7;
            i12 = i16;
            cVar4 = cVar2;
            cVar5 = cVar;
            i15 = i12 + 1;
            i14 = i11;
            cameraIdList = strArr;
            length = i13;
            l0Var4 = l0Var2;
        }
        cf.c cVar8 = cVar4;
        cf.c cVar9 = cVar5;
        l0 l0Var5 = l0Var4;
        if (cVar8 == null) {
            cVar8 = cVar9;
        }
        if (cVar8 == null) {
            throw new IllegalStateException("Requested camera is not available");
        }
        String str4 = (String) cVar8.a;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) cVar8.b;
        Size[] sizeArr2 = (Size[]) cVar8.c;
        j6.l lVar = (j6.l) cVar8.d;
        aa.a aVar = (aa.a) cVar8.e;
        j6.l lVar2 = (j6.l) aVar.d;
        this.o = str4;
        this.E = l0Var;
        this.p = cameraCharacteristics2;
        this.G = (n0) aVar.b;
        this.H = (Range) aVar.c;
        this.c0 = false;
        this.I = lVar;
        u();
        this.q = (Size) lVar2.b;
        this.r = (Size) lVar2.c;
        this.s = lVar2.a;
        this.F = (m0) lVar2.d;
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            Range range = (Range) cameraCharacteristics2.get(key);
            if (range != null) {
                floatValue = ((Float) range.getUpper()).floatValue();
            }
            floatValue = 1.0f;
        } else {
            Float f7 = (Float) cameraCharacteristics2.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f7 != null) {
                floatValue = f7.floatValue();
            }
            floatValue = 1.0f;
        }
        this.L = Math.max(1.0f, Math.min(4.0f, floatValue));
        Size size = this.q;
        StreamConfigurationMap streamConfigurationMap3 = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap3 != null) {
            try {
                outputMinFrameDuration = streamConfigurationMap3.getOutputMinFrameDuration(SurfaceTexture.class, size);
            } catch (RuntimeException unused) {
            }
            Size size2 = this.r;
            streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                try {
                    long outputMinFrameDuration2 = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size2);
                    sizeArr = sizeArr2;
                    i10 = i17;
                    j3 = outputMinFrameDuration2;
                } catch (RuntimeException unused2) {
                }
                m mVar3 = this.j;
                Size[] sizeArr3 = sizeArr;
                int i18 = i10;
                StringBuilder sb4 = new StringBuilder("camera outputs selected: output=");
                sb4.append(this.e);
                sb4.append("x");
                sb4.append(this.e);
                sb4.append(", cameraMode=");
                sb4.append(this.F);
                if (this.F != this.g) {
                    str = " (fallback from " + this.g + ")";
                } else {
                    str = "";
                }
                sb4.append(str);
                sb4.append(", crop=");
                sb4.append(this.s);
                sb4.append(", preview=");
                sb4.append(this.q);
                sb4.append(", recording=");
                sb4.append(this.r);
                sb4.append(", previewMinFrameDurationNs=");
                sb4.append(outputMinFrameDuration);
                sb4.append(", recordingMinFrameDurationNs=");
                sb4.append(j3);
                sb4.append(", fps=");
                sb4.append(this.G.a);
                sb4.append(", fpsRange=");
                sb4.append(this.H);
                sb4.append(", timestampSource=");
                sb4.append(p() ? "REALTIME" : "UNKNOWN");
                sb4.append(this.G != this.h ? a4.a.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
                mVar3.b(sb4.toString());
                if (l0Var == l0Var5) {
                    if (this.a0) {
                        return;
                    } else {
                        this.a0 = true;
                    }
                } else if (this.b0) {
                    return;
                } else {
                    this.b0 = true;
                }
                Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                Boolean bool2 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                m mVar4 = this.j;
                StringBuilder sb5 = new StringBuilder("camera capabilities: id=");
                sb5.append(str4);
                sb5.append(", facing=");
                sb5.append(l0Var);
                sb5.append(", hardwareLevel=");
                sb5.append(num2 == null ? "unknown" : num2.intValue() == 2 ? "LEGACY" : num2.intValue() == 0 ? "LIMITED" : num2.intValue() == 1 ? "FULL" : num2.intValue() == 3 ? "LEVEL_3" : (i18 < 28 || num2.intValue() != 4) ? String.valueOf(num2) : "EXTERNAL");
                sb5.append(", sensorOrientation=");
                sb5.append(num3);
                sb5.append(", activeArray=");
                sb5.append(rect);
                sb5.append(", flashAvailable=");
                sb5.append(bool2);
                sb5.append(", aeModes=");
                sb5.append(Arrays.toString(iArr));
                sb5.append(", fpsRanges=");
                sb5.append(Arrays.toString(rangeArr));
                sb5.append(", outputSizes=");
                sb5.append(Arrays.toString(sizeArr3));
                mVar4.b(sb5.toString());
            }
            sizeArr = sizeArr2;
            i10 = i17;
            j3 = -1;
            m mVar32 = this.j;
            Size[] sizeArr32 = sizeArr;
            int i182 = i10;
            StringBuilder sb42 = new StringBuilder("camera outputs selected: output=");
            sb42.append(this.e);
            sb42.append("x");
            sb42.append(this.e);
            sb42.append(", cameraMode=");
            sb42.append(this.F);
            if (this.F != this.g) {
            }
            sb42.append(str);
            sb42.append(", crop=");
            sb42.append(this.s);
            sb42.append(", preview=");
            sb42.append(this.q);
            sb42.append(", recording=");
            sb42.append(this.r);
            sb42.append(", previewMinFrameDurationNs=");
            sb42.append(outputMinFrameDuration);
            sb42.append(", recordingMinFrameDurationNs=");
            sb42.append(j3);
            sb42.append(", fps=");
            sb42.append(this.G.a);
            sb42.append(", fpsRange=");
            sb42.append(this.H);
            sb42.append(", timestampSource=");
            sb42.append(p() ? "REALTIME" : "UNKNOWN");
            sb42.append(this.G != this.h ? a4.a.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
            mVar32.b(sb42.toString());
            if (l0Var == l0Var5) {
            }
            Integer num22 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            Integer num32 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
            Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int[] iArr2 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            Boolean bool22 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
            Rect rect2 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            m mVar42 = this.j;
            StringBuilder sb52 = new StringBuilder("camera capabilities: id=");
            sb52.append(str4);
            sb52.append(", facing=");
            sb52.append(l0Var);
            sb52.append(", hardwareLevel=");
            sb52.append(num22 == null ? "unknown" : num22.intValue() == 2 ? "LEGACY" : num22.intValue() == 0 ? "LIMITED" : num22.intValue() == 1 ? "FULL" : num22.intValue() == 3 ? "LEVEL_3" : (i182 < 28 || num22.intValue() != 4) ? String.valueOf(num22) : "EXTERNAL");
            sb52.append(", sensorOrientation=");
            sb52.append(num32);
            sb52.append(", activeArray=");
            sb52.append(rect2);
            sb52.append(", flashAvailable=");
            sb52.append(bool22);
            sb52.append(", aeModes=");
            sb52.append(Arrays.toString(iArr2));
            sb52.append(", fpsRanges=");
            sb52.append(Arrays.toString(rangeArr2));
            sb52.append(", outputSizes=");
            sb52.append(Arrays.toString(sizeArr32));
            mVar42.b(sb52.toString());
        }
        outputMinFrameDuration = -1;
        Size size22 = this.r;
        streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
        }
        sizeArr = sizeArr2;
        i10 = i17;
        j3 = -1;
        m mVar322 = this.j;
        Size[] sizeArr322 = sizeArr;
        int i1822 = i10;
        StringBuilder sb422 = new StringBuilder("camera outputs selected: output=");
        sb422.append(this.e);
        sb422.append("x");
        sb422.append(this.e);
        sb422.append(", cameraMode=");
        sb422.append(this.F);
        if (this.F != this.g) {
        }
        sb422.append(str);
        sb422.append(", crop=");
        sb422.append(this.s);
        sb422.append(", preview=");
        sb422.append(this.q);
        sb422.append(", recording=");
        sb422.append(this.r);
        sb422.append(", previewMinFrameDurationNs=");
        sb422.append(outputMinFrameDuration);
        sb422.append(", recordingMinFrameDurationNs=");
        sb422.append(j3);
        sb422.append(", fps=");
        sb422.append(this.G.a);
        sb422.append(", fpsRange=");
        sb422.append(this.H);
        sb422.append(", timestampSource=");
        sb422.append(p() ? "REALTIME" : "UNKNOWN");
        sb422.append(this.G != this.h ? a4.a.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
        mVar322.b(sb422.toString());
        if (l0Var == l0Var5) {
        }
        Integer num222 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Integer num322 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Range[] rangeArr22 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int[] iArr22 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        Boolean bool222 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        Rect rect22 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        m mVar422 = this.j;
        StringBuilder sb522 = new StringBuilder("camera capabilities: id=");
        sb522.append(str4);
        sb522.append(", facing=");
        sb522.append(l0Var);
        sb522.append(", hardwareLevel=");
        sb522.append(num222 == null ? "unknown" : num222.intValue() == 2 ? "LEGACY" : num222.intValue() == 0 ? "LIMITED" : num222.intValue() == 1 ? "FULL" : num222.intValue() == 3 ? "LEVEL_3" : (i1822 < 28 || num222.intValue() != 4) ? String.valueOf(num222) : "EXTERNAL");
        sb522.append(", sensorOrientation=");
        sb522.append(num322);
        sb522.append(", activeArray=");
        sb522.append(rect22);
        sb522.append(", flashAvailable=");
        sb522.append(bool222);
        sb522.append(", aeModes=");
        sb522.append(Arrays.toString(iArr22));
        sb522.append(", fpsRanges=");
        sb522.append(Arrays.toString(rangeArr22));
        sb522.append(", outputSizes=");
        sb522.append(Arrays.toString(sizeArr322));
        mVar422.b(sb522.toString());
    }

    public final void y(boolean z10) {
        Handler handler = this.n;
        if (!this.S || handler == null) {
            return;
        }
        handler.post(new bi.f(8, this, z10));
    }

    public final boolean z(float f7) {
        this.K = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.n;
        if (!this.S || handler == null) {
            return false;
        }
        handler.removeCallbacks(this.O0);
        handler.post(this.O0);
        return true;
    }
}
