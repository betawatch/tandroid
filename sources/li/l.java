package li;

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
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class l {
    public CameraCaptureSession A;
    public boolean A0;
    public CameraCaptureSession B;
    public long B0;
    public CaptureRequest.Builder C;
    public long C0;
    public CaptureRequest.Builder D;
    public long D0;
    public z E;
    public boolean E0;
    public volatile q0 F;
    public long F0;
    public q0 G;
    public long G0;
    public q0 H;
    public long H0;
    public r0 I;
    public long I0;
    public s0 J;
    public long J0;
    public Range K;
    public long K0;
    public j6.m L;
    public long L0;
    public long M;
    public long M0;
    public volatile float N;
    public long N0;
    public long O0;
    public boolean P;
    public double P0;
    public boolean Q;
    public long Q0;
    public int R;
    public long R0;
    public int S;
    public long S0;
    public int T;
    public long T0;
    public int U;
    public long U0;
    public volatile boolean V;
    public long V0;
    public boolean W;
    public long W0;
    public boolean X;
    public long X0;
    public boolean Y;
    public long Y0;
    public boolean Z;
    public long Z0;
    public final Context a;
    public volatile boolean a0;
    public long a1;
    public final CameraManager b;
    public volatile boolean b0;
    public long b1;
    public final TextureView c;
    public volatile boolean c0;
    public long c1;
    public final v0 d;
    public boolean d0;
    public long d1;
    public final int e;
    public boolean e0;
    public double e1;
    public final int f;
    public boolean f0;
    public long f1;
    public final r0 g;
    public boolean g0;
    public long g1;
    public final s0 h;
    public boolean h0;
    public long h1;
    public final boolean i;
    public int i0;
    public long i1;
    public final p j;
    public j j0;
    public long j1;
    public final a4.l k;
    public j k0;
    public long k1;
    public boolean l0;
    public long l1;
    public HandlerThread m;
    public boolean m0;
    public final dg.c m1;
    public Handler n;
    public boolean n0;
    public final a n1;
    public String o;
    public boolean o0;
    public final a o1;
    public CameraCharacteristics p;
    public boolean p0;
    public final e p1;
    public Size q;
    public boolean q0;
    public final f q1;
    public volatile Size r;
    public boolean r0;
    public final f r1;
    public volatile int s;
    public boolean s0;
    public final g s1;
    public Surface t;
    public CameraDevice t0;
    public final g t1;
    public Surface u;
    public CameraDevice u0;
    public final h u1;
    public Surface v;
    public CameraDevice v0;
    public v w;
    public CameraDevice w0;
    public o x;
    public j x0;
    public o y;
    public q0 y0;
    public CameraDevice z;
    public boolean z0;
    public final Rect l = new Rect();
    public float O = 1.0f;

    public l(Context context, TextureView textureView, v0 v0Var, int i10, r0 r0Var, s0 s0Var, boolean z10, p pVar, a4.l lVar) {
        dg.c cVar = new dg.c(this, 1);
        this.m1 = cVar;
        this.n1 = new a(this, 4);
        this.o1 = new a(this, 5);
        int i11 = 0;
        this.p1 = new e(this, i11);
        this.q1 = new f(this, i11);
        this.r1 = new f(this, 1);
        this.s1 = new g(this, 0);
        this.t1 = new g(this, 1);
        this.u1 = new h(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = textureView;
        this.d = v0Var;
        this.e = v0Var.a;
        this.f = i10;
        this.g = r0Var;
        this.h = s0Var;
        this.i = z10;
        this.j = pVar;
        this.k = lVar;
        textureView.addOnLayoutChangeListener(cVar);
    }

    public static Range C(Range[] rangeArr, int i10) {
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        int i11 = i10 / 2;
        Range range2 = null;
        for (Range range3 : rangeArr) {
            if (range3.contains((Range) Integer.valueOf(i10))) {
                if (((Integer) range3.getUpper()).intValue() == i10 && ((Integer) range3.getLower()).intValue() >= i11 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
                if (range2 == null || ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue() || (((Integer) range3.getLower()).equals(range2.getLower()) && ((Integer) range3.getUpper()).intValue() < ((Integer) range2.getUpper()).intValue())) {
                    range2 = range3;
                }
            }
        }
        return range != null ? range : range2;
    }

    public static boolean D(CameraCharacteristics cameraCharacteristics) {
        Integer num;
        return (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) ? false : true;
    }

    public static int V(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float W(double d, long j10, long j11) {
        if (j11 == 0) {
            return 0.0f;
        }
        double d10 = j11;
        double d11 = j10 / d10;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d10) - (d11 * d11))) / 1000000.0d);
    }

    public static void a(l lVar) {
        CameraDevice cameraDevice = lVar.z;
        CameraDevice cameraDevice2 = lVar.t0;
        if (!lVar.n0 || cameraDevice == null || cameraDevice2 == null || lVar.u == null || lVar.v == null || lVar.A != null || lVar.B != null) {
            return;
        }
        lVar.p0 = false;
        lVar.q0 = false;
        try {
            lVar.H0 = SystemClock.elapsedRealtimeNanos();
            lVar.j.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + lVar.r + ", fpsRange=" + lVar.K);
            cameraDevice.createCaptureSession(Arrays.asList(lVar.u), lVar.t1, lVar.n);
            cameraDevice2.createCaptureSession(Arrays.asList(lVar.v), lVar.s1, lVar.n);
        } catch (CameraAccessException | IllegalArgumentException e) {
            lVar.A("session request failed", e, false);
        }
    }

    public static void b(l lVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        boolean z10 = cameraDevice == lVar.z;
        if (!z10 && lVar.n0) {
            p pVar = lVar.j;
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=standby device ");
            sb2.append(str);
            if (illegalStateException == null) {
                str2 = "";
            } else {
                str2 = ", error=" + illegalStateException;
            }
            sb2.append(str2);
            pVar.b(sb2.toString());
            lVar.n0 = false;
            lVar.l0 = false;
            lVar.m0 = true;
            lVar.s0 = false;
            lVar.t0 = null;
            lVar.x0 = null;
            lVar.r();
            lVar.u0 = cameraDevice;
            lVar.z0 = lVar.V && lVar.z != null && lVar.A == null && !lVar.X;
            cameraDevice.close();
            return;
        }
        if (cameraDevice == lVar.t0) {
            lVar.t0 = null;
        }
        lVar.s0 = false;
        cameraDevice.close();
        if (z10) {
            lVar.q();
            lVar.z = null;
            if (illegalStateException != null) {
                lVar.N(illegalStateException);
                return;
            } else {
                lVar.N(new IllegalStateException(sc.e.h("Active warm camera ", str)));
                return;
            }
        }
        lVar.y("standby device " + str, illegalStateException);
        if (lVar.y0 != null) {
            lVar.t();
            return;
        }
        if (!lVar.V || lVar.z == null || lVar.A != null || lVar.X) {
            return;
        }
        lVar.j.b("warm camera failed during startup; configuring active camera only");
        lVar.u();
    }

    public static String c(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "CAMERA_SERVICE" : "CAMERA_DEVICE" : "CAMERA_DISABLED" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE";
    }

    public static boolean d(l lVar, CameraDevice cameraDevice) {
        if (!lVar.G(cameraDevice)) {
            return false;
        }
        if (cameraDevice == lVar.v0) {
            lVar.v0 = null;
        }
        if (cameraDevice == lVar.w0) {
            lVar.w0 = null;
        }
        p pVar = lVar.j;
        StringBuilder sb2 = new StringBuilder("camera closed for warm-switch recovery: id=");
        sb2.append(cameraDevice.getId());
        sb2.append(", targetRemaining=");
        CameraDevice cameraDevice2 = lVar.v0;
        sb2.append(cameraDevice2 == null ? "none" : cameraDevice2.getId());
        sb2.append(", standbyRemaining=");
        CameraDevice cameraDevice3 = lVar.w0;
        sb2.append(cameraDevice3 != null ? cameraDevice3.getId() : "none");
        pVar.b(sb2.toString());
        lVar.H();
        return true;
    }

    public static boolean e(l lVar, CameraDevice cameraDevice) {
        if (cameraDevice != lVar.u0) {
            return false;
        }
        lVar.u0 = null;
        lVar.j.b("standby camera closed: id=" + cameraDevice.getId());
        if (!lVar.z0) {
            if (!lVar.X || lVar.y0 == null) {
                return true;
            }
            lVar.j.b("continuing pending switch after DUAL_ACTIVE fallback");
            lVar.t();
            return true;
        }
        lVar.z0 = false;
        if (!lVar.V || lVar.b0 || lVar.z == null) {
            return true;
        }
        lVar.j.b("retrying capture session after standby camera closed");
        lVar.u();
        return true;
    }

    public static void f(l lVar) {
        q0 q0Var = lVar.y0;
        if (q0Var != null && lVar.n0 && lVar.p0 && lVar.q0) {
            lVar.y0 = null;
            if (lVar.b0(q0Var)) {
                return;
            }
            lVar.X = false;
            lVar.a0(q0Var);
        }
    }

    public static long i(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float j(long j10, long j11) {
        if (j11 == 0) {
            return 0.0f;
        }
        return (j10 / j11) / 1000000.0f;
    }

    public static j6.m m(Size[] sizeArr, v0 v0Var, r0 r0Var) {
        int i10;
        j6.m o10;
        r0 r0Var2;
        j6.m o11;
        r0 r0Var3 = r0.c;
        if (r0Var == r0Var3) {
            i10 = v0Var.a;
        } else {
            v0 v0Var2 = v0.b;
            r0 r0Var4 = r0.a;
            if (v0Var == v0Var2) {
                if (r0Var == r0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (r0Var != r0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.m o12 = o(sizeArr, i10, r0Var);
        if (o12 != null) {
            return o12;
        }
        if (v0Var == v0.c && r0Var == (r0Var2 = r0.b) && (o11 = o(sizeArr, 480, r0Var2)) != null) {
            return o11;
        }
        int i11 = v0Var.a;
        if (r0Var != r0Var3 && (o10 = o(sizeArr, i11, r0Var3)) != null) {
            return o10;
        }
        int i12 = v0Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (V(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || i(size2) < i(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (V(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && i(size3) < i(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.m(n(sizeArr, size), size, r0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size n(Size[] sizeArr, Size size) {
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(V(size2) - 720);
                if ((abs != abs2 ? Integer.compare(abs, abs2) : Long.compare(i(size3), i(size2))) < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.m o(Size[] sizeArr, int i10, r0 r0Var) {
        int compare;
        j6.m mVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int V = V(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (V >= i10 && V <= i11 && max <= min) {
                Size n10 = n(sizeArr, size);
                j6.m mVar2 = new j6.m(n10, size, r0Var, i10);
                if (mVar != null) {
                    Size size2 = (Size) mVar.b;
                    int abs = Math.abs(Math.min(n10.getWidth(), n10.getHeight()) - 720);
                    Size size3 = (Size) mVar.c;
                    int abs2 = Math.abs(V(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long i12 = i(size) + i(n10);
                        long i13 = i(size3) + i(size2);
                        compare = i12 != i13 ? Long.compare(i12, i13) : Long.compare(i(size), i(size3));
                    }
                    if (compare >= 0) {
                    }
                }
                mVar = mVar2;
            }
        }
        return mVar;
    }

    public static boolean s(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long z(long j10) {
        if (j10 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j10) / 1000000;
    }

    public final void A(String str, Exception exc, boolean z10) {
        String str2;
        if (this.n0) {
            StringBuilder sb2 = new StringBuilder("camera dual-active fallback: reason=");
            sb2.append(str);
            sb2.append(", keepActive=");
            sb2.append(z10);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb2.append(str2);
            this.j.b(sb2.toString());
            this.n0 = false;
            this.l0 = false;
            this.m0 = true;
            this.p0 = false;
            this.q0 = false;
            if (!z10 || this.A == null) {
                L("DUAL_ACTIVE ".concat(str), exc);
                return;
            }
            r();
            CameraDevice cameraDevice = this.t0;
            this.t0 = null;
            this.x0 = null;
            if (cameraDevice != null) {
                this.u0 = cameraDevice;
                cameraDevice.close();
            }
            if (this.u0 == null && this.X && this.y0 != null) {
                t();
            }
        }
    }

    public final void B(String str, Exception exc) {
        String str2;
        boolean z10;
        o oVar = this.x;
        if (oVar != null) {
            synchronized (oVar) {
                z10 = oVar.E;
            }
            if (z10) {
                N(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.f0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            N(exc);
            return;
        }
        this.f0 = true;
        this.h0 = true;
        q();
        j6.m mVar = this.L;
        if (mVar == null) {
            N(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.J = s0.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.K = C(cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES), 30);
        this.q = (Size) mVar.b;
        this.r = (Size) mVar.c;
        this.s = mVar.a;
        this.I = (r0) mVar.d;
        this.j0 = null;
        this.k0 = null;
        y("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
        }
        v vVar = this.w;
        if (vVar != null) {
            vVar.l();
            this.w = null;
        }
        o oVar2 = this.x;
        if (oVar2 != null) {
            oVar2.u();
            this.x = null;
        }
        this.u = null;
        try {
            v();
            O();
            p pVar = this.j;
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
            sb2.append(this.K);
            pVar.b(sb2.toString());
            Handler handler = this.n;
            if (!this.V || handler == null) {
                return;
            }
            handler.post(new a(this, 0));
        } catch (Exception e) {
            N(e);
        }
    }

    public final boolean E(String str, String str2) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        for (Set<String> set : this.b.getConcurrentCameraIds()) {
            if (set.contains(str) && set.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        CameraCharacteristics cameraCharacteristics;
        return this.G == q0.b && (cameraCharacteristics = this.p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
    }

    public final boolean G(CameraDevice cameraDevice) {
        if (this.A0) {
            return cameraDevice == this.v0 || cameraDevice == this.w0;
        }
        return false;
    }

    public final void H() {
        if (this.A0 && this.v0 == null && this.w0 == null) {
            this.A0 = false;
            this.X = false;
            this.j.b("camera warm-switch recovery reopening target sequentially: facing=" + this.F + ", switchElapsedMs=" + z(this.I0));
            if (!this.V || this.b0) {
                return;
            }
            I();
        }
    }

    public final void I() {
        if (this.V && !this.W && this.z == null) {
            if (f0.c.b(this.a, "android.permission.CAMERA") != 0) {
                N(new SecurityException("Camera permission is not granted"));
                return;
            }
            if (f0.c.b(this.a, "android.permission.RECORD_AUDIO") != 0) {
                N(new SecurityException("Audio recording permission is not granted"));
                return;
            }
            boolean z10 = false;
            try {
                this.D0 = SystemClock.elapsedRealtimeNanos();
                S(this.F);
                long z11 = z(this.D0);
                if (this.z == null && this.x == null) {
                    K();
                }
                SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                if (surfaceTexture == null) {
                    return;
                }
                if (this.n0) {
                    int max = Math.max(1, Math.min(720, Math.min(this.c.getWidth(), this.c.getHeight())));
                    surfaceTexture.setDefaultBufferSize(max, max);
                } else {
                    surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
                }
                if (this.t == null) {
                    this.t = new Surface(surfaceTexture);
                }
                if (this.x == null) {
                    w(surfaceTexture);
                } else {
                    v vVar = this.w;
                    if (vVar != null) {
                        vVar.n(this.r, this.s, D(this.p));
                        Surface surface = null;
                        if (!this.n0 && this.r0) {
                            this.r0 = false;
                            v vVar2 = this.w;
                            Handler handler = vVar2.u;
                            if (vVar2.r0 && handler != null) {
                                handler.post(new ag.j0(vVar2, z10, surface, 5));
                            }
                        }
                        v vVar3 = this.w;
                        Surface surface2 = vVar3.w;
                        if (surface2 == null) {
                            throw new IllegalStateException("GL processor is not started");
                        }
                        this.u = surface2;
                        if (this.n0 && (!vVar3.f || (surface = vVar3.y) == null)) {
                            throw new IllegalStateException("Secondary GL camera surface is unavailable");
                        }
                        this.v = surface;
                    }
                }
                J();
                this.W = true;
                this.G0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("camera open requested: id=" + this.o + ", preview=" + this.q + ", recording=" + this.r + ", crop=" + this.s + ", selectionElapsedMs=" + z11 + ", dualActive=" + this.n0);
                this.b.openCamera(this.o, this.q1, this.n);
            } catch (Exception e) {
                this.W = false;
                N(e);
            }
        }
    }

    public final void J() {
        boolean z10;
        CameraDevice cameraDevice;
        if (!this.l0 || this.m0 || (z10 = this.s0) || (cameraDevice = this.t0) != null) {
            return;
        }
        q0 q0Var = this.H;
        q0 q0Var2 = q0.a;
        j jVar = (q0Var == q0Var2 ? q0.b : q0Var2) == q0Var2 ? this.j0 : this.k0;
        if (jVar != null) {
            String str = jVar.a;
            if (z10 || cameraDevice != null) {
                return;
            }
            try {
                this.x0 = jVar;
                this.s0 = true;
                this.B0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("warm camera open requested: id=" + str + ", facing=" + jVar.b);
                this.b.openCamera(str, this.r1, this.n);
            } catch (Exception e) {
                this.s0 = false;
                y("open request failed", e);
            }
        }
    }

    public final void K() {
        if (this.m0) {
            return;
        }
        if (this.l0) {
            this.n0 = true;
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        p pVar = this.j;
        if (i10 < 30) {
            this.m0 = true;
            pVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        j l4 = l();
        s0 s0Var = l4.h;
        String str = l4.a;
        q0 q0Var = l4.b;
        q0 q0Var2 = q0.a;
        if (q0Var == q0Var2) {
            q0Var2 = q0.b;
        }
        try {
            try {
                S(q0Var2);
                j l10 = l();
                s0 s0Var2 = l10.h;
                String str2 = l10.a;
                boolean E = E(str, str2);
                this.l0 = E;
                if (E && s0Var != s0Var2) {
                    this.l0 = false;
                    pVar.b("camera dual-active capability rejected: incompatible frame rate, first=" + l4.e + "/" + l4.f + ", second=" + l10.e + "/" + l10.f + ", firstFps=" + s0Var.a + ", secondFps=" + s0Var2.a);
                }
                boolean z10 = this.l0;
                if (!z10) {
                    this.m0 = true;
                }
                this.n0 = z10;
                StringBuilder sb2 = new StringBuilder("camera dual-active capability: supported=");
                sb2.append(this.l0);
                sb2.append(", pair=");
                sb2.append(str);
                sb2.append("+");
                sb2.append(str2);
                sb2.append(this.l0 ? "" : ", reason=pair not advertised");
                pVar.b(sb2.toString());
                h(l4);
            } catch (Exception e) {
                this.m0 = true;
                pVar.b("camera warm-switch capability unavailable: " + e);
                h(l4);
            }
        } catch (Throwable th2) {
            h(l4);
            throw th2;
        }
    }

    public final void L(String str, Exception exc) {
        String str2;
        if (this.A0) {
            return;
        }
        this.A0 = true;
        this.m0 = true;
        this.l0 = false;
        this.z0 = false;
        this.y0 = null;
        this.E0 = false;
        this.W = false;
        q();
        r();
        CameraDevice cameraDevice = this.z;
        this.v0 = cameraDevice;
        CameraDevice cameraDevice2 = this.t0;
        this.w0 = cameraDevice2;
        this.z = null;
        this.t0 = null;
        this.x0 = null;
        CameraDevice cameraDevice3 = this.u0;
        if (cameraDevice3 == cameraDevice || cameraDevice3 == cameraDevice2) {
            this.u0 = null;
        }
        p pVar = this.j;
        StringBuilder u10 = a1.g.u("camera warm-switch recovery started: reason=", str, ", target=");
        u10.append(this.F);
        u10.append(", targetId=");
        CameraDevice cameraDevice4 = this.v0;
        u10.append(cameraDevice4 == null ? "none" : cameraDevice4.getId());
        u10.append(", standbyId=");
        CameraDevice cameraDevice5 = this.w0;
        u10.append(cameraDevice5 != null ? cameraDevice5.getId() : "none");
        u10.append(", fps=");
        s0 s0Var = this.J;
        u10.append(s0Var == null ? "unknown" : Integer.valueOf(s0Var.a));
        u10.append(", switchElapsedMs=");
        u10.append(z(this.I0));
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        u10.append(str2);
        pVar.b(u10.toString());
        CameraDevice cameraDevice6 = this.v0;
        if (cameraDevice6 != null) {
            cameraDevice6.close();
        }
        CameraDevice cameraDevice7 = this.w0;
        if (cameraDevice7 != null && cameraDevice7 != this.v0) {
            cameraDevice7.close();
        }
        H();
    }

    public final void M() {
        this.V = false;
        this.c.setSurfaceTextureListener(null);
        this.c.removeOnLayoutChangeListener(this.m1);
        Handler handler = this.n;
        HandlerThread handlerThread = this.m;
        this.n = null;
        this.m = null;
        if (handler == null || handlerThread == null) {
            return;
        }
        handler.post(new k2.u(13, this, handlerThread));
    }

    public final void N(Exception exc) {
        this.j.a("camera error", exc);
        a4.l lVar = this.k;
        ((x0) lVar.b).i.post(new n0(lVar, exc, 1));
    }

    public final void O() {
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.a1 = 0L;
        this.b1 = 0L;
        this.c1 = 0L;
        this.d1 = 0L;
        this.e1 = 0.0d;
        this.f1 = 0L;
        this.g1 = 0L;
        this.h1 = 0L;
        this.i1 = 0L;
        this.j1 = 0L;
        this.k1 = 0L;
        this.l1 = 0L;
    }

    public final void P() {
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = 0L;
        this.P0 = 0.0d;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
    }

    public final k Q(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.m mVar) {
        Range[] rangeArr;
        j6.m mVar2;
        int i10;
        Range[] rangeArr2;
        Range[] rangeArr3;
        Range[] rangeArr4 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        p pVar = this.j;
        s0 s0Var = this.h;
        s0 s0Var2 = s0.b;
        if (s0Var == s0Var2) {
            rangeArr = rangeArr4;
            mVar2 = mVar;
            i10 = 30;
        } else {
            if (!this.h0) {
                int i11 = s0Var.a;
                Range C = C(rangeArr4, i11);
                if (C != null) {
                    ArrayList arrayList = new ArrayList(sizeArr.length);
                    int length = sizeArr.length;
                    int i12 = 0;
                    while (i12 < length) {
                        Size size = sizeArr[i12];
                        int i13 = i12;
                        int i14 = length;
                        long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                        if (outputMinFrameDuration > 0) {
                            rangeArr3 = rangeArr4;
                            if (outputMinFrameDuration > 1000000000 / i11) {
                                rangeArr4 = rangeArr3;
                                length = i14;
                                i12 = i13 + 1;
                            }
                        } else {
                            rangeArr3 = rangeArr4;
                        }
                        arrayList.add(size);
                        rangeArr4 = rangeArr3;
                        length = i14;
                        i12 = i13 + 1;
                    }
                    rangeArr2 = rangeArr4;
                    Size[] sizeArr2 = (Size[]) arrayList.toArray(new Size[0]);
                    try {
                        j6.m m10 = m(sizeArr2, this.d, this.g);
                        pVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + C + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                        return new k(s0.c, C, m10, 0);
                    } catch (RuntimeException unused) {
                        pVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
                    }
                } else {
                    rangeArr2 = rangeArr4;
                    pVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr2));
                }
                Range C2 = C(rangeArr2, 30);
                pVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + C2);
                return new k(s0Var2, C2, mVar, 0);
            }
            rangeArr = rangeArr4;
            i10 = 30;
            mVar2 = mVar;
        }
        Range C3 = C(rangeArr, i10);
        StringBuilder u10 = a1.g.u("fps selection: id=", str, ", requested=");
        u10.append(s0Var.a);
        u10.append(", mode=REGULAR, range=");
        u10.append(C3);
        u10.append(this.h0 ? ", reason=session-wide fallback" : "");
        pVar.b(u10.toString());
        return new k(s0Var2, C3, mVar2, 0);
    }

    public final void R(String str, Exception exc) {
        this.z0 = true;
        y(str, exc);
        if (this.u0 == null) {
            this.z0 = false;
            u();
        } else {
            this.j.b("capture session retry waiting for standby camera close: id=" + this.u0.getId());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cb, code lost:
    
        if ((r31 == r8 && r6.equals(r4.get(r9)) && !r6.equals(((android.hardware.camera2.CameraCharacteristics) r14.b).get(r9))) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fa, code lost:
    
        if ((r31 == r8 && r6.equals(r4.get(r9)) && !r6.equals(((android.hardware.camera2.CameraCharacteristics) r15.b).get(r9))) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0312 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(q0 q0Var) {
        q0 q0Var2;
        float floatValue;
        long outputMinFrameDuration;
        StreamConfigurationMap streamConfigurationMap;
        String str;
        long outputMinFrameDuration2;
        String str2;
        int i10;
        j l4;
        CameraCharacteristics.Key key;
        int i11;
        int i12;
        String[] strArr;
        int i13;
        bh.d dVar;
        String str3;
        String str4;
        k Q;
        bh.d dVar2;
        p pVar;
        StringBuilder sb2;
        Boolean bool;
        CameraCharacteristics.Key key2;
        s0 s0Var;
        q0 q0Var3 = q0.b;
        q0 q0Var4 = q0.a;
        j jVar = q0Var == q0Var4 ? this.j0 : this.k0;
        String str5 = ", facing=";
        if (jVar != null) {
            h(jVar);
            this.j.b("camera outputs restored from cache: id=" + jVar.a + ", facing=" + q0Var + ", preview=" + jVar.d + ", recording=" + jVar.e + ", fps=" + jVar.h.a);
            return;
        }
        boolean z10 = true;
        if (!this.g0) {
            this.g0 = true;
            if (this.h == s0.c) {
                boolean Z = Z(q0Var4);
                boolean Z2 = Z(q0Var3);
                this.h0 = (Z && Z2) ? false : true;
                p pVar2 = this.j;
                StringBuilder sb3 = new StringBuilder("60 fps session capability: front=");
                sb3.append(Z);
                sb3.append(", back=");
                sb3.append(Z2);
                sb3.append(", selected=");
                sb3.append(this.h0 ? 30 : 60);
                pVar2.b(sb3.toString());
            }
        }
        int i14 = q0Var == q0Var4 ? 0 : 1;
        String[] cameraIdList = this.b.getCameraIdList();
        int length = cameraIdList.length;
        bh.d dVar3 = null;
        bh.d dVar4 = null;
        int i15 = 0;
        while (true) {
            q0Var2 = q0Var4;
            if (i15 >= length) {
                break;
            }
            String str6 = cameraIdList[i15];
            String[] strArr2 = cameraIdList;
            CameraCharacteristics cameraCharacteristics = this.b.getCameraCharacteristics(str6);
            int i16 = length;
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num == null || num.intValue() != i14) {
                i11 = i14;
                i12 = i15;
                strArr = strArr2;
                i13 = i16;
                dVar = dVar3;
            } else {
                StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                i12 = i15;
                if (streamConfigurationMap2 == null) {
                    this.j.b("camera candidate rejected: id=" + str6 + ", reason=no stream map");
                    i11 = i14;
                    dVar = dVar3;
                    strArr = strArr2;
                    i13 = i16;
                } else {
                    int i17 = i14;
                    Size[] outputSizes = streamConfigurationMap2.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        strArr = strArr2;
                        i13 = i16;
                        i11 = i17;
                        dVar = dVar3;
                        str3 = str5;
                        this.j.b("camera candidate rejected: id=" + str6 + ", reason=no SurfaceTexture outputs");
                    } else {
                        try {
                        } catch (RuntimeException e) {
                            e = e;
                            str4 = "camera candidate rejected: id=";
                            strArr = strArr2;
                            i13 = i16;
                            i11 = i17;
                        }
                        try {
                            j6.m m10 = m(outputSizes, this.d, this.g);
                            str4 = "camera candidate rejected: id=";
                            strArr = strArr2;
                            i13 = i16;
                            i11 = i17;
                            str6 = str6;
                            dVar = dVar3;
                            try {
                                Q = Q(str6, cameraCharacteristics, streamConfigurationMap2, outputSizes, m10);
                                try {
                                    dVar2 = new bh.d(str6, cameraCharacteristics, outputSizes, m10, Q);
                                    str6 = str6;
                                    pVar = this.j;
                                    sb2 = new StringBuilder();
                                    sb2.append("camera candidate accepted: id=");
                                    sb2.append(str6);
                                    sb2.append(str5);
                                    sb2.append(q0Var);
                                    sb2.append(", flashAvailable=");
                                    bool = Boolean.TRUE;
                                    key2 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                                    str3 = str5;
                                } catch (RuntimeException e7) {
                                    e = e7;
                                    str6 = str6;
                                    str3 = str5;
                                    this.j.b(str4 + str6 + ", reason=" + e);
                                    dVar3 = dVar;
                                    i15 = i12 + 1;
                                    q0Var4 = q0Var2;
                                    str5 = str3;
                                    i14 = i11;
                                    cameraIdList = strArr;
                                    length = i13;
                                    z10 = true;
                                }
                            } catch (RuntimeException e10) {
                                e = e10;
                            }
                            try {
                                sb2.append(bool.equals(cameraCharacteristics.get(key2)));
                                sb2.append(", fps=");
                                sb2.append(((s0) Q.b).a);
                                sb2.append(", preview=");
                                sb2.append((Size) ((j6.m) Q.d).b);
                                sb2.append(", recording=");
                                sb2.append((Size) ((j6.m) Q.d).c);
                                pVar.b(sb2.toString());
                                if (dVar4 != null) {
                                }
                                dVar4 = dVar2;
                                s0Var = this.h;
                            } catch (RuntimeException e11) {
                                e = e11;
                                this.j.b(str4 + str6 + ", reason=" + e);
                                dVar3 = dVar;
                                i15 = i12 + 1;
                                q0Var4 = q0Var2;
                                str5 = str3;
                                i14 = i11;
                                cameraIdList = strArr;
                                length = i13;
                                z10 = true;
                            }
                        } catch (RuntimeException e12) {
                            e = e12;
                            str4 = "camera candidate rejected: id=";
                            strArr = strArr2;
                            i13 = i16;
                            i11 = i17;
                            str6 = str6;
                            dVar = dVar3;
                            str3 = str5;
                            this.j.b(str4 + str6 + ", reason=" + e);
                            dVar3 = dVar;
                            i15 = i12 + 1;
                            q0Var4 = q0Var2;
                            str5 = str3;
                            i14 = i11;
                            cameraIdList = strArr;
                            length = i13;
                            z10 = true;
                        }
                        if (s0Var == s0.b || ((s0) Q.b) == s0Var) {
                            if (dVar != null) {
                            }
                            dVar3 = dVar2;
                            i15 = i12 + 1;
                            q0Var4 = q0Var2;
                            str5 = str3;
                            i14 = i11;
                            cameraIdList = strArr;
                            length = i13;
                            z10 = true;
                        }
                    }
                    dVar3 = dVar;
                    i15 = i12 + 1;
                    q0Var4 = q0Var2;
                    str5 = str3;
                    i14 = i11;
                    cameraIdList = strArr;
                    length = i13;
                    z10 = true;
                }
            }
            str3 = str5;
            dVar3 = dVar;
            i15 = i12 + 1;
            q0Var4 = q0Var2;
            str5 = str3;
            i14 = i11;
            cameraIdList = strArr;
            length = i13;
            z10 = true;
        }
        bh.d dVar5 = dVar3;
        String str7 = str5;
        bh.d dVar6 = dVar5 == null ? dVar4 : dVar5;
        if (dVar6 == null) {
            throw new IllegalStateException("Requested camera is not available");
        }
        String str8 = (String) dVar6.a;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) dVar6.b;
        Size[] sizeArr = (Size[]) dVar6.c;
        j6.m mVar = (j6.m) dVar6.d;
        k kVar = (k) dVar6.e;
        j6.m mVar2 = (j6.m) kVar.d;
        this.o = str8;
        this.H = q0Var;
        this.p = cameraCharacteristics2;
        this.J = (s0) kVar.b;
        this.K = (Range) kVar.c;
        this.f0 = false;
        this.L = mVar;
        O();
        this.q = (Size) mVar2.b;
        this.r = (Size) mVar2.c;
        this.s = mVar2.a;
        this.I = (r0) mVar2.d;
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 30) {
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
        this.O = Math.max(1.0f, Math.min(4.0f, floatValue));
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
                    str = ", flashAvailable=";
                    outputMinFrameDuration2 = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size2);
                } catch (RuntimeException unused2) {
                }
                p pVar3 = this.j;
                String str9 = str;
                StringBuilder sb4 = new StringBuilder("camera outputs selected: output=");
                sb4.append(this.e);
                sb4.append("x");
                sb4.append(this.e);
                sb4.append(", cameraMode=");
                sb4.append(this.I);
                if (this.I != this.g) {
                    str2 = " (fallback from " + this.g + ")";
                } else {
                    str2 = "";
                }
                sb4.append(str2);
                sb4.append(", crop=");
                sb4.append(this.s);
                sb4.append(", preview=");
                sb4.append(this.q);
                sb4.append(", recording=");
                sb4.append(this.r);
                sb4.append(", previewMinFrameDurationNs=");
                sb4.append(outputMinFrameDuration);
                sb4.append(", recordingMinFrameDurationNs=");
                sb4.append(outputMinFrameDuration2);
                sb4.append(", fps=");
                sb4.append(this.J.a);
                sb4.append(", fpsRange=");
                sb4.append(this.K);
                sb4.append(", timestampSource=");
                sb4.append(D(this.p) ? "REALTIME" : "UNKNOWN");
                sb4.append(this.J != this.h ? a1.g.p(new StringBuilder(" (fallback from "), this.h.a, ")") : "");
                pVar3.b(sb4.toString());
                if (q0Var == q0Var2) {
                    if (!this.d0) {
                        i10 = 1;
                        this.d0 = true;
                        Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                        Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                        int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                        Boolean bool2 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                        Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        p pVar4 = this.j;
                        StringBuilder sb5 = new StringBuilder("camera capabilities: id=");
                        sb5.append(str8);
                        sb5.append(str7);
                        sb5.append(q0Var);
                        sb5.append(", hardwareLevel=");
                        sb5.append(num2 != null ? "unknown" : num2.intValue() == 2 ? "LEGACY" : num2.intValue() == 0 ? "LIMITED" : num2.intValue() == i10 ? "FULL" : num2.intValue() == 3 ? "LEVEL_3" : (i18 < 28 || num2.intValue() != 4) ? String.valueOf(num2) : "EXTERNAL");
                        sb5.append(", sensorOrientation=");
                        sb5.append(num3);
                        sb5.append(", activeArray=");
                        sb5.append(rect);
                        sb5.append(str9);
                        sb5.append(bool2);
                        sb5.append(", aeModes=");
                        sb5.append(Arrays.toString(iArr));
                        sb5.append(", fpsRanges=");
                        sb5.append(Arrays.toString(rangeArr));
                        sb5.append(", outputSizes=");
                        sb5.append(Arrays.toString(sizeArr));
                        pVar4.b(sb5.toString());
                    }
                    l4 = l();
                    if (l4.b != q0Var2) {
                        this.j0 = l4;
                        return;
                    } else {
                        this.k0 = l4;
                        return;
                    }
                }
                i10 = 1;
                if (!this.e0) {
                    this.e0 = true;
                    Integer num22 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    Integer num32 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    int[] iArr2 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                    Boolean bool22 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    Rect rect2 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    p pVar42 = this.j;
                    StringBuilder sb52 = new StringBuilder("camera capabilities: id=");
                    sb52.append(str8);
                    sb52.append(str7);
                    sb52.append(q0Var);
                    sb52.append(", hardwareLevel=");
                    sb52.append(num22 != null ? "unknown" : num22.intValue() == 2 ? "LEGACY" : num22.intValue() == 0 ? "LIMITED" : num22.intValue() == i10 ? "FULL" : num22.intValue() == 3 ? "LEVEL_3" : (i18 < 28 || num22.intValue() != 4) ? String.valueOf(num22) : "EXTERNAL");
                    sb52.append(", sensorOrientation=");
                    sb52.append(num32);
                    sb52.append(", activeArray=");
                    sb52.append(rect2);
                    sb52.append(str9);
                    sb52.append(bool22);
                    sb52.append(", aeModes=");
                    sb52.append(Arrays.toString(iArr2));
                    sb52.append(", fpsRanges=");
                    sb52.append(Arrays.toString(rangeArr2));
                    sb52.append(", outputSizes=");
                    sb52.append(Arrays.toString(sizeArr));
                    pVar42.b(sb52.toString());
                }
                l4 = l();
                if (l4.b != q0Var2) {
                }
            }
            str = ", flashAvailable=";
            outputMinFrameDuration2 = -1;
            p pVar32 = this.j;
            String str92 = str;
            StringBuilder sb42 = new StringBuilder("camera outputs selected: output=");
            sb42.append(this.e);
            sb42.append("x");
            sb42.append(this.e);
            sb42.append(", cameraMode=");
            sb42.append(this.I);
            if (this.I != this.g) {
            }
            sb42.append(str2);
            sb42.append(", crop=");
            sb42.append(this.s);
            sb42.append(", preview=");
            sb42.append(this.q);
            sb42.append(", recording=");
            sb42.append(this.r);
            sb42.append(", previewMinFrameDurationNs=");
            sb42.append(outputMinFrameDuration);
            sb42.append(", recordingMinFrameDurationNs=");
            sb42.append(outputMinFrameDuration2);
            sb42.append(", fps=");
            sb42.append(this.J.a);
            sb42.append(", fpsRange=");
            sb42.append(this.K);
            sb42.append(", timestampSource=");
            sb42.append(D(this.p) ? "REALTIME" : "UNKNOWN");
            sb42.append(this.J != this.h ? a1.g.p(new StringBuilder(" (fallback from "), this.h.a, ")") : "");
            pVar32.b(sb42.toString());
            if (q0Var == q0Var2) {
            }
        }
        outputMinFrameDuration = -1;
        Size size22 = this.r;
        streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
        }
        str = ", flashAvailable=";
        outputMinFrameDuration2 = -1;
        p pVar322 = this.j;
        String str922 = str;
        StringBuilder sb422 = new StringBuilder("camera outputs selected: output=");
        sb422.append(this.e);
        sb422.append("x");
        sb422.append(this.e);
        sb422.append(", cameraMode=");
        sb422.append(this.I);
        if (this.I != this.g) {
        }
        sb422.append(str2);
        sb422.append(", crop=");
        sb422.append(this.s);
        sb422.append(", preview=");
        sb422.append(this.q);
        sb422.append(", recording=");
        sb422.append(this.r);
        sb422.append(", previewMinFrameDurationNs=");
        sb422.append(outputMinFrameDuration);
        sb422.append(", recordingMinFrameDurationNs=");
        sb422.append(outputMinFrameDuration2);
        sb422.append(", fps=");
        sb422.append(this.J.a);
        sb422.append(", fpsRange=");
        sb422.append(this.K);
        sb422.append(", timestampSource=");
        sb422.append(D(this.p) ? "REALTIME" : "UNKNOWN");
        sb422.append(this.J != this.h ? a1.g.p(new StringBuilder(" (fallback from "), this.h.a, ")") : "");
        pVar322.b(sb422.toString());
        if (q0Var == q0Var2) {
        }
    }

    public final void T(boolean z10) {
        Handler handler = this.n;
        if (!this.V || handler == null) {
            return;
        }
        handler.post(new k2.v(1, this, z10));
    }

    public final boolean U(float f7) {
        this.N = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.n;
        if (!this.V || handler == null) {
            return false;
        }
        handler.removeCallbacks(this.o1);
        handler.post(this.o1);
        return true;
    }

    public final void X(z zVar, long j10, q0 q0Var) {
        if (this.m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
        this.E = zVar;
        this.M = j10;
        this.F = q0Var;
        this.V = true;
        this.b0 = false;
        this.f0 = false;
        this.y = null;
        this.c0 = true;
        this.F0 = SystemClock.elapsedRealtimeNanos();
        P();
        O();
        this.j.b("camera segment start: facing=" + q0Var + ", timelineOffsetUs=" + j10 + ", textureAvailable=" + this.c.isAvailable());
        this.c.setSurfaceTextureListener(this.p1);
        Handler handler = this.n;
        if (this.V && handler != null && this.c.isAvailable()) {
            handler.post(new a(this, 7));
        }
    }

    public final boolean Y() {
        Handler handler = this.n;
        if (!this.V || this.b0 || handler == null) {
            return false;
        }
        this.b0 = true;
        this.c0 = false;
        this.j.b("camera segment stop requested");
        handler.post(new a(this, 6));
        return true;
    }

    public final boolean Z(q0 q0Var) {
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        int i10 = q0Var == q0.a ? 0 : 1;
        CameraManager cameraManager = this.b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((s0) Q(str, cameraCharacteristics, streamConfigurationMap, outputSizes, m(outputSizes, this.d, this.g)).b) == s0.c) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(q0 q0Var) {
        q0 q0Var2;
        j jVar;
        if (!this.V || this.X || q0Var == this.G) {
            return;
        }
        this.X = true;
        this.Z = true;
        this.P = false;
        this.Q = false;
        this.N = 0.0f;
        a4.l lVar = this.k;
        ((x0) lVar.b).i.post(new k2.u(15, lVar, q0Var));
        this.I0 = SystemClock.elapsedRealtimeNanos();
        this.E0 = false;
        this.j.b("camera device switch started: from=" + this.G + ", to=" + q0Var);
        if (b0(q0Var)) {
            return;
        }
        if (this.n0) {
            this.y0 = q0Var;
            this.j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
            return;
        }
        v vVar = this.w;
        if (vVar != null) {
            q0 q0Var3 = this.G;
            Handler handler = vVar.u;
            if (vVar.r0 && handler != null) {
                q0Var2 = q0Var;
                handler.post(new ag.q0(vVar, q0Var3, q0Var2, handler, 8));
                if (c0(q0Var2)) {
                    if (!this.s0 || (jVar = this.x0) == null || jVar.b != q0Var2) {
                        t();
                        return;
                    } else {
                        this.y0 = q0Var2;
                        this.j.b("camera switch path: waiting for warm device open");
                        return;
                    }
                }
                return;
            }
        }
        q0Var2 = q0Var;
        if (c0(q0Var2)) {
        }
    }

    public final boolean b0(q0 q0Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        j jVar;
        if (!this.n0 || !this.p0 || !this.q0 || (cameraDevice = this.z) == null || (cameraDevice2 = this.t0) == null || (cameraCaptureSession = this.A) == null || (cameraCaptureSession2 = this.B) == null || (jVar = this.x0) == null || jVar.b != q0Var || this.w == null) {
            return false;
        }
        this.z = cameraDevice2;
        this.t0 = cameraDevice;
        this.A = cameraCaptureSession2;
        this.B = cameraCaptureSession;
        CaptureRequest.Builder builder = this.C;
        this.C = this.D;
        this.D = builder;
        Surface surface = this.u;
        this.u = this.v;
        this.v = surface;
        this.x0 = this.G == q0.a ? this.j0 : this.k0;
        h(jVar);
        this.G = q0Var;
        boolean z10 = true;
        try {
            try {
                CaptureRequest.Builder x10 = x(this.z, this.u, jVar, true, false);
                try {
                    this.C = x10;
                    this.A.setRepeatingRequest(x10.build(), this.u1, this.n);
                    j jVar2 = this.x0;
                    if (jVar2 != null) {
                        CaptureRequest.Builder x11 = x(this.t0, this.v, jVar2, false, false);
                        this.D = x11;
                        this.B.setRepeatingRequest(x11.build(), this.u1, this.n);
                    }
                    boolean z11 = !this.r0;
                    this.r0 = z11;
                    long j10 = this.I0;
                    v vVar = this.w;
                    b bVar = new b(this, q0Var, j10, 0);
                    Handler handler = vVar.u;
                    if (vVar.r0 && handler != null) {
                        handler.post(new ag.j0(vVar, z11, bVar, 5));
                    }
                    this.p0 = true;
                    this.q0 = true;
                    this.E0 = true;
                    this.Z = false;
                    this.X = false;
                    this.a0 = false;
                    O();
                    this.j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.z.getId() + ", standbyId=" + this.t0.getId() + ", input=" + (this.r0 ? 1 : 0) + ", elapsedMs=" + z(this.I0));
                    this.c.post(new a(this, 1));
                    a4.l lVar = this.k;
                    ((x0) lVar.b).i.post(new ag.j0(lVar, new i(this.G, this.I, this.J, this.q, this.r, this.O, F()), z10, 6));
                    return true;
                } catch (CameraAccessException e) {
                    e = e;
                    A("role switch request failed", e, false);
                    return true;
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    A("role switch request failed", e, false);
                    return true;
                } catch (IllegalStateException e10) {
                    e = e10;
                    A("role switch request failed", e, false);
                    return true;
                }
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e11) {
                e = e11;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e12) {
            e = e12;
        }
    }

    public final boolean c0(q0 q0Var) {
        CameraDevice cameraDevice = this.t0;
        j jVar = this.x0;
        if (cameraDevice == null || jVar == null || jVar.b != q0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
        if (surfaceTexture == null) {
            y("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.z;
        q0 q0Var2 = this.G;
        j jVar2 = q0Var2 != null ? q0Var2 == q0.a ? this.j0 : this.k0 : null;
        q();
        this.t0 = cameraDevice2;
        this.x0 = jVar2;
        this.z = cameraDevice;
        h(jVar);
        surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
        v vVar = this.w;
        if (vVar != null) {
            vVar.n(this.r, this.s, D(this.p));
            Surface surface = this.w.w;
            if (surface == null) {
                throw new IllegalStateException("GL processor is not started");
            }
            this.u = surface;
        }
        this.E0 = true;
        p pVar = this.j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.o);
        sb2.append(", standbyId=");
        sb2.append(cameraDevice2 == null ? "none" : cameraDevice2.getId());
        sb2.append(", preparationMs=");
        sb2.append(z(this.I0));
        pVar.b(sb2.toString());
        u();
        return true;
    }

    public final void d0() {
        Integer num;
        if (this.c0) {
            if (this.o0) {
                this.c.setTransform(new Matrix());
                this.j.b("preview transform: GL output, identity matrix, view=" + this.c.getWidth() + "x" + this.c.getHeight());
                return;
            }
            Size size = this.r;
            if (size == null || this.c.getWidth() == 0 || this.c.getHeight() == 0) {
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
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        CameraDevice cameraDevice;
        CameraCaptureSession cameraCaptureSession = this.A;
        if (!this.V || cameraCaptureSession == null || (cameraDevice = this.z) == null) {
            return;
        }
        try {
            if (cameraDevice != null) {
                try {
                    if (this.u != null) {
                        CaptureRequest.Builder x10 = x(cameraDevice, this.u, l(), true, false);
                        this.C = x10;
                        CameraCaptureSession cameraCaptureSession2 = this.A;
                        if (cameraCaptureSession2 != null) {
                            cameraCaptureSession2.setRepeatingRequest(x10.build(), this.u1, this.n);
                            return;
                        }
                        return;
                    }
                } catch (CameraAccessException e) {
                    e = e;
                    if (!this.n0) {
                        A("active repeating request failed", e, false);
                        return;
                    } else if (this.J == s0.c) {
                        B("60 fps updated request rejected", e);
                        return;
                    } else {
                        N(e);
                        return;
                    }
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    if (!this.n0) {
                    }
                } catch (IllegalStateException e10) {
                    e = e10;
                    if (this.n0) {
                        A("active repeating request rejected", e, false);
                        return;
                    }
                    if (!this.V || this.b0 || cameraCaptureSession != this.A) {
                        this.j.b("stale repeating request rejection ignored: " + e.getMessage());
                        return;
                    }
                    this.j.b("repeating request rejected by closed camera; reopening device: " + e.getMessage());
                    q();
                    CameraDevice cameraDevice2 = this.z;
                    this.z = null;
                    this.W = false;
                    if (cameraDevice2 == null) {
                        I();
                        return;
                    } else {
                        this.Y = true;
                        cameraDevice2.close();
                        return;
                    }
                }
            }
            throw new IllegalStateException("Camera request surfaces are unavailable");
        } catch (CameraAccessException e11) {
            e = e11;
        } catch (IllegalArgumentException e12) {
            e = e12;
        } catch (IllegalStateException e13) {
            e = e13;
        }
    }

    public final void h(j jVar) {
        this.o = jVar.a;
        this.H = jVar.b;
        this.p = jVar.c;
        this.q = jVar.d;
        this.r = jVar.e;
        this.s = jVar.f;
        this.I = jVar.g;
        this.J = jVar.h;
        this.K = jVar.i;
        this.L = jVar.j;
        this.O = jVar.k;
        this.f0 = false;
        O();
    }

    public final void k() {
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacks(this.n1);
        }
        this.y = null;
    }

    public final j l() {
        return new j(this.o, this.H, this.p, this.q, this.r, this.s, this.I, this.J, this.K, this.L, this.O);
    }

    public final void p() {
        k();
        this.W = false;
        this.X = false;
        this.Y = false;
        this.A0 = false;
        this.z0 = false;
        this.v0 = null;
        this.w0 = null;
        this.c0 = false;
        this.Z = false;
        this.a0 = false;
        this.C = null;
        this.Q = false;
        this.y0 = null;
        this.s0 = false;
        q();
        r();
        CameraDevice cameraDevice = this.z;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.z = null;
        }
        CameraDevice cameraDevice2 = this.t0;
        this.t0 = null;
        this.x0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.u0;
        this.u0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        v vVar = this.w;
        if (vVar != null) {
            vVar.l();
            this.w = null;
        }
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        this.u = null;
        this.v = null;
        this.n0 = false;
        this.o0 = false;
        this.p0 = false;
        this.q0 = false;
        this.r0 = false;
    }

    public final void q() {
        CameraCaptureSession cameraCaptureSession = this.A;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A = null;
        }
        this.C = null;
    }

    public final void r() {
        CameraCaptureSession cameraCaptureSession = this.B;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.B = null;
        }
        this.D = null;
        this.q0 = false;
    }

    public final void t() {
        this.y0 = null;
        this.E0 = false;
        this.j.b("camera switch path: sequential".concat(this.l0 ? ", reason=warm device not ready" : ", reason=concurrent pair unavailable"));
        q();
        CameraDevice cameraDevice = this.z;
        if (cameraDevice != null) {
            this.z = null;
            this.C0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else {
            if (this.W) {
                return;
            }
            this.X = false;
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        CameraDevice cameraDevice = this.z;
        if (cameraDevice == null || this.t == null || this.u == null) {
            return;
        }
        try {
            this.H0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("capture session requested: preview=" + this.q + ", recording=" + this.r + ", fpsRange=" + this.K + ", glPreview=" + this.o0);
            cameraDevice.createCaptureSession(this.o0 ? Arrays.asList(this.u) : Arrays.asList(this.t, this.u), this.t1, this.n);
        } catch (CameraAccessException e) {
            e = e;
            if (this.t0 != null || this.m0) {
                if (this.J != s0.c) {
                    B("60 fps session creation rejected", e);
                    return;
                } else {
                    N(e);
                    return;
                }
            }
            if (this.X && this.E0) {
                L("session request failed", e);
                return;
            }
            this.j.b("camera session request failed with warm device open: " + e);
            R("session request failed", e);
        } catch (IllegalArgumentException e7) {
            e = e7;
            if (this.t0 != null) {
            }
            if (this.J != s0.c) {
            }
        }
    }

    public final void v() {
        Surface surface;
        Surface surface2;
        Surface surface3;
        this.o0 = this.n0;
        z zVar = this.E;
        long j10 = this.M;
        int i10 = this.e;
        int i11 = this.f;
        int i12 = this.i0;
        if (i12 <= 0) {
            i12 = this.J.a;
        }
        int i13 = i12;
        p pVar = this.j;
        a4.l lVar = this.k;
        Objects.requireNonNull(lVar);
        c cVar = new c(lVar, 0);
        a4.l lVar2 = this.k;
        Objects.requireNonNull(lVar2);
        o oVar = new o(zVar, j10, i10, i11, i13, pVar, cVar, new c(lVar2, 1));
        this.x = oVar;
        synchronized (oVar) {
            if (oVar.D) {
                surface = oVar.q;
            } else {
                oVar.q();
                long nanoTime = System.nanoTime();
                try {
                    oVar.b();
                    oVar.a();
                    oVar.n.start();
                    oVar.D = true;
                    oVar.f.b("codecs prepared: video=" + oVar.n.getName() + ", audio=" + oVar.o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = oVar.q;
                } catch (IOException | RuntimeException e) {
                    oVar.n();
                    throw e;
                }
            }
        }
        Surface surface4 = surface;
        Size size = this.r;
        Surface surface5 = this.o0 ? this.t : null;
        boolean z10 = this.n0;
        int i14 = this.e;
        int i15 = this.s;
        boolean D = D(this.p);
        boolean z11 = this.i;
        p pVar2 = this.j;
        o oVar2 = this.x;
        a4.l lVar3 = this.k;
        Objects.requireNonNull(lVar3);
        int i16 = 2;
        v vVar = new v(size, surface4, surface5, z10, i14, i15, D, z11, pVar2, oVar2, new c(lVar3, i16));
        this.w = vVar;
        vVar.t0 = new a(this, i16);
        v vVar2 = this.w;
        if (vVar2.r0) {
            surface2 = vVar2.w;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            vVar2.t = handlerThread;
            handlerThread.start();
            vVar2.q0 = System.nanoTime();
            p pVar3 = vVar2.i;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(vVar2.a);
            sb2.append(", crop=");
            sb2.append(vVar2.j);
            sb2.append(", output=");
            sb2.append(vVar2.g);
            sb2.append("x");
            sb2.append(vVar2.g);
            sb2.append(", filter=");
            sb2.append(vVar2.j == vVar2.g ? "NEAREST" : "LINEAR");
            sb2.append(", composition=");
            sb2.append(vVar2.h);
            sb2.append(", dualInput=");
            sb2.append(vVar2.f);
            sb2.append(", glPreview=");
            sb2.append(vVar2.e != null);
            pVar3.b(sb2.toString());
            Handler handler = new Handler(vVar2.t.getLooper());
            vVar2.u = handler;
            handler.post(new k2.u(14, vVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (vVar2.w0 != null) {
                    RuntimeException runtimeException = vVar2.w0;
                    vVar2.w0 = null;
                    vVar2.l();
                    throw runtimeException;
                }
                surface2 = vVar2.w;
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                vVar2.l();
                throw new IllegalStateException("GL initialization was interrupted", e7);
            }
        }
        this.u = surface2;
        if (!this.n0) {
            this.v = null;
            return;
        }
        q0 q0Var = this.H;
        q0 q0Var2 = q0.a;
        j jVar = (q0Var == q0Var2 ? q0.b : q0Var2) == q0Var2 ? this.j0 : this.k0;
        if (jVar == null) {
            throw new IllegalStateException("Secondary camera selection is unavailable");
        }
        v vVar3 = this.w;
        Size size2 = jVar.e;
        int i17 = jVar.f;
        boolean D2 = D(jVar.c);
        Handler handler2 = vVar3.u;
        if (vVar3.r0 && vVar3.f && handler2 != null) {
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler2.post(new r(vVar3, size2, i17, D2, runtimeExceptionArr, countDownLatch2, 0));
            try {
                countDownLatch2.await();
                RuntimeException runtimeException2 = runtimeExceptionArr[0];
                if (runtimeException2 != null) {
                    throw runtimeException2;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Secondary input update was interrupted", e10);
            }
        }
        v vVar4 = this.w;
        if (!vVar4.f || (surface3 = vVar4.y) == null) {
            throw new IllegalStateException("Secondary GL camera surface is unavailable");
        }
        this.v = surface3;
    }

    public final void w(SurfaceTexture surfaceTexture) {
        try {
            v();
        } catch (IOException | RuntimeException e) {
            if (!this.n0) {
                throw e;
            }
            this.j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
            v vVar = this.w;
            if (vVar != null) {
                vVar.l();
                this.w = null;
            }
            o oVar = this.x;
            if (oVar != null) {
                oVar.u();
                this.x = null;
            }
            this.u = null;
            this.v = null;
            this.n0 = false;
            this.o0 = false;
            this.l0 = false;
            this.m0 = true;
            surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
            v();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CaptureRequest.Builder x(CameraDevice cameraDevice, Surface surface, j jVar, boolean z10, boolean z11) {
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Range range;
        Surface surface2;
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
        if (z10 && !this.o0 && (surface2 = this.t) != null) {
            createCaptureRequest.addTarget(surface2);
        }
        createCaptureRequest.addTarget(surface);
        createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
        createCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
        CameraCharacteristics cameraCharacteristics2 = jVar.c;
        if (s(cameraCharacteristics2 == null ? null : (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES), 3)) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
        }
        Range range2 = jVar.i;
        if (range2 != null) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
            if (z11) {
                this.j.b("capture FPS range selected: " + jVar.i + ", cameraId=" + jVar.a + ", active=" + z10);
            }
        }
        if (z10) {
            float z12 = c3.i0.z(this.O, 1.0f, this.N, 1.0f);
            if (Build.VERSION.SDK_INT >= 30) {
                CameraCharacteristics cameraCharacteristics3 = this.p;
                if (cameraCharacteristics3 == null) {
                    range = null;
                } else {
                    key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                    range = (Range) cameraCharacteristics3.get(key);
                }
                if (range != null) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), z12))));
                    boolean z13 = !this.P && F();
                    cameraCharacteristics = this.p;
                    if (s(cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) : null, 1)) {
                        createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    }
                    CaptureRequest.Key key2 = CaptureRequest.FLASH_MODE;
                    createCaptureRequest.set(key2, Integer.valueOf(z13 ? 2 : 0));
                    if (this.Q) {
                        this.j.b("torch request configured: requested=" + this.P + ", applied=" + z13 + ", aeMode=" + createCaptureRequest.get(CaptureRequest.CONTROL_AE_MODE) + ", flashMode=" + createCaptureRequest.get(key2) + ", cameraId=" + this.o);
                    }
                }
            }
            CameraCharacteristics cameraCharacteristics4 = this.p;
            Rect rect = cameraCharacteristics4 == null ? null : (Rect) cameraCharacteristics4.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect != null) {
                int max = Math.max(1, Math.round(rect.width() / z12));
                int max2 = Math.max(1, Math.round(rect.height() / z12));
                int centerX = rect.centerX() - (max / 2);
                int centerY = rect.centerY() - (max2 / 2);
                this.l.set(centerX, centerY, max + centerX, max2 + centerY);
                createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.l);
            }
            if (this.P) {
            }
            cameraCharacteristics = this.p;
            if (s(cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) : null, 1)) {
            }
            CaptureRequest.Key key22 = CaptureRequest.FLASH_MODE;
            createCaptureRequest.set(key22, Integer.valueOf(z13 ? 2 : 0));
            if (this.Q) {
            }
        } else {
            if (s((int[]) jVar.c.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES), 1)) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
            }
            createCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
        }
        int i10 = this.T + 1;
        this.T = i10;
        createCaptureRequest.setTag(Integer.valueOf(i10));
        if (this.Q) {
            this.U = this.T;
        }
        return createCaptureRequest;
    }

    public final void y(String str, Exception exc) {
        String str2;
        this.m0 = true;
        this.l0 = false;
        this.n0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.j.b(sb2.toString());
        r();
        CameraDevice cameraDevice = this.t0;
        this.t0 = null;
        this.x0 = null;
        if (cameraDevice == null || cameraDevice == this.z) {
            return;
        }
        this.u0 = cameraDevice;
        cameraDevice.close();
    }
}
