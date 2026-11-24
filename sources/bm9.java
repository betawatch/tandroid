// default package

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
import android.view.Display;
import android.view.Surface;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class bm9 {
    public CameraCaptureSession A;
    public long A0;
    public CaptureRequest.Builder B;
    public int B0;
    public CaptureRequest.Builder C;
    public long C0;
    public om9 D;
    public long D0;
    public volatile nn9 E;
    public long E0;
    public nn9 F;
    public long F0;
    public nn9 G;
    public long G0;
    public on9 H;
    public long H0;
    public pn9 I;
    public long I0;
    public Range J;
    public long J0;
    public kq K;
    public long K0;
    public long L;
    public long L0;
    public volatile float M;
    public double M0;
    public long N0;
    public boolean O;
    public long O0;
    public boolean P;
    public long P0;
    public int Q;
    public long Q0;
    public int R;
    public long R0;
    public int S;
    public long S0;
    public int T;
    public long T0;
    public volatile boolean U;
    public long U0;
    public boolean V;
    public long V0;
    public boolean W;
    public long W0;
    public volatile boolean X;
    public long X0;
    public volatile boolean Y;
    public long Y0;
    public volatile boolean Z;
    public long Z0;
    public final Context a;
    public boolean a0;
    public long a1;
    public final CameraManager b;
    public boolean b0;
    public double b1;
    public final rq5 c;
    public boolean c0;
    public long c1;
    public final sn9 d;
    public boolean d0;
    public long d1;
    public final short e;
    public boolean e0;
    public long e1;
    public final int f;
    public byte f0;
    public long f1;
    public final on9 g;
    public zl9 g0;
    public long g1;
    public final pn9 h;
    public zl9 h0;
    public long h1;
    public final boolean i;
    public boolean i0;
    public long i1;
    public final fm9 j;
    public boolean j0;
    public final ol1 j1;
    public final et8 k;
    public boolean k0;
    public final rl9 k1;
    public boolean l0;
    public final rl9 l1;
    public HandlerThread m;
    public boolean m0;
    public final tr5 m1;
    public Handler n;
    public boolean n0;
    public final vl9 n1;
    public String o;
    public CameraDevice o0;
    public final vl9 o1;
    public CameraCharacteristics p;
    public zl9 p0;
    public final wl9 p1;
    public volatile Size q;
    public nn9 q0;
    public final wl9 q1;
    public volatile int r;
    public final xl9 r1;
    public Surface s;
    public Surface t;
    public volatile boolean t0;
    public Surface u;
    public am9 u0;
    public km9 v;
    public am9 v0;
    public em9 w;
    public int w0;
    public em9 x;
    public HandlerThread x0;
    public CameraDevice y;
    public long y0;
    public CameraCaptureSession z;
    public long z0;
    public final Rect l = new Rect();
    public float N = 1.0f;
    public final ArrayList r0 = new ArrayList();
    public final ArrayList s0 = new ArrayList();
    public int s1 = 1;

    public bm9(Context context, rq5 rq5Var, sn9 sn9Var, int i, on9 on9Var, pn9 pn9Var, boolean z, fm9 fm9Var, et8 et8Var) {
        byte b = 1;
        byte b2 = 5;
        ol1 ol1Var = new ol1(this, b2);
        this.j1 = ol1Var;
        this.k1 = new rl9(this, b2);
        this.l1 = new rl9(this, (byte) 6);
        this.m1 = new tr5(this, (byte) 2);
        byte b3 = 0;
        this.n1 = new vl9(this, b3);
        this.o1 = new vl9(this, b);
        this.p1 = new wl9(this, b3);
        this.q1 = new wl9(this, b);
        this.r1 = new xl9(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = rq5Var;
        this.d = sn9Var;
        this.e = sn9Var.a;
        this.f = i;
        this.g = on9Var;
        this.h = pn9Var;
        this.i = z;
        this.j = fm9Var;
        this.k = et8Var;
        rq5Var.addOnLayoutChangeListener(ol1Var);
    }

    public static Range A(Range[] rangeArr, int i) {
        Range range = null;
        if (rangeArr == null) {
            return null;
        }
        int i2 = i > 30 ? i / 2 : 1;
        Range range2 = null;
        for (Range range3 : rangeArr) {
            if (range3.contains((Range) Integer.valueOf(i))) {
                if (((Integer) range3.getUpper()).intValue() == i && ((Integer) range3.getLower()).intValue() >= i2 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
                if (range2 == null || ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue() || (((Integer) range3.getLower()).equals(range2.getLower()) && ((Integer) range3.getUpper()).intValue() < ((Integer) range2.getUpper()).intValue())) {
                    range2 = range3;
                }
            }
        }
        return range != null ? range : range2;
    }

    public static boolean C(CameraCharacteristics cameraCharacteristics) {
        Integer num;
        return (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) ? false : true;
    }

    public static float R(CameraCharacteristics cameraCharacteristics) {
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect == null || rect.width() <= 0 || rect.height() <= 0) {
            return 1.3333334f;
        }
        return Math.max(rect.width(), rect.height()) / Math.min(rect.width(), rect.height());
    }

    public static float U(double d, long j, long j2) {
        if (j2 == 0) {
            return 0.0f;
        }
        double d2 = j2;
        double d3 = j / d2;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d2) - (d3 * d3))) / 1000000.0d);
    }

    public static long c(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float d(long j, long j2) {
        if (j2 == 0) {
            return 0.0f;
        }
        return (j / j2) / 1000000.0f;
    }

    public static String e(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "CAMERA_SERVICE" : "CAMERA_DEVICE" : "CAMERA_DISABLED" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE";
    }

    public static kq h(Size[] sizeArr, float f, sn9 sn9Var, on9 on9Var) {
        short s;
        kq i;
        on9 on9Var2;
        kq i2;
        on9 on9Var3 = on9.c;
        if (on9Var == on9Var3) {
            s = sn9Var.a;
        } else {
            s = 720;
            sn9 sn9Var2 = sn9.b;
            on9 on9Var4 = on9.a;
            if (sn9Var == sn9Var2) {
                if (on9Var == on9Var4) {
                    s = 960;
                }
            } else if (on9Var != on9Var4) {
                s = 540;
            }
        }
        kq i3 = i(sizeArr, f, s, on9Var);
        if (i3 != null) {
            return i3;
        }
        if (sn9Var == sn9.c && on9Var == (on9Var2 = on9.b) && (i2 = i(sizeArr, f, 480, on9Var2)) != null) {
            return i2;
        }
        short s2 = sn9Var.a;
        if (on9Var != on9Var3 && (i = i(sizeArr, f, s2, on9Var3)) != null) {
            return i;
        }
        short s3 = sn9Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (Math.min(size2.getWidth(), size2.getHeight()) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= s3 && (size == null || c(size2) < c(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (Math.min(size3.getWidth(), size3.getHeight()) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && c(size3) < c(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                dq9.m("Camera has no output at or below the bandwidth cap");
                return null;
            }
        }
        return new kq((Object) size, (Object) on9Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088), (byte) 13);
    }

    public static kq i(Size[] sizeArr, float f, int i, on9 on9Var) {
        kq kqVar = null;
        float f2 = 0.0f;
        for (Size size : sizeArr) {
            int z = kt6.z(i, 15, 100, i);
            int min = Math.min(1920, i << 1);
            int min2 = Math.min(size.getWidth(), size.getHeight());
            int max = Math.max(size.getWidth(), size.getHeight());
            if (min2 >= i && min2 <= z && max <= min) {
                float min3 = (Math.min(1.0f, f / (Math.max(size.getWidth(), size.getHeight()) / Math.min(size.getWidth(), size.getHeight()))) * i) / Math.min(size.getWidth(), size.getHeight());
                if (kqVar == null || min3 > f2 || (min3 == f2 && c(size) < c((Size) kqVar.c))) {
                    kqVar = new kq((Object) size, (Object) on9Var, i, (byte) 13);
                    f2 = min3;
                }
            }
        }
        return kqVar;
    }

    public static boolean o(int[] iArr, int i) {
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long x(long j) {
        if (j == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j) / 1000000;
    }

    public final void B(CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        String str2;
        int i = 1;
        if (cameraDevice == this.y) {
            k();
            this.y = null;
            l(cameraDevice, 1);
            if (illegalStateException == null) {
                illegalStateException = new IllegalStateException("Active camera ".concat(str));
            }
            L(illegalStateException);
            return;
        }
        if (cameraDevice == this.o0) {
            this.o0 = null;
        }
        if (!this.k0) {
            l(cameraDevice, 1);
            return;
        }
        fm9 fm9Var = this.j;
        StringBuilder k = b10.k("camera dual-active fallback: reason=standby device ", str);
        if (illegalStateException == null) {
            str2 = "";
        } else {
            str2 = ", error=" + illegalStateException;
        }
        k.append(str2);
        fm9Var.b(k.toString());
        boolean z = false;
        this.k0 = false;
        this.i0 = false;
        this.j0 = true;
        this.p0 = null;
        m();
        boolean z2 = this.U && this.y != null && this.z == null && !this.V;
        if (this.V && this.q0 != null) {
            z = true;
        }
        if (z2) {
            i = 3;
        } else if (z) {
            i = 4;
        }
        l(cameraDevice, i);
    }

    public final boolean D(String str, String str2) {
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

    public final boolean E() {
        CameraCharacteristics cameraCharacteristics;
        return this.F == nn9.b && (cameraCharacteristics = this.p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
    }

    public final void F(CameraDevice cameraDevice) {
        this.r0.remove(cameraDevice);
        this.s0.remove(cameraDevice);
        if (cameraDevice == this.y) {
            this.y = null;
        }
        if (cameraDevice == this.o0) {
            this.o0 = null;
        }
        fm9 fm9Var = this.j;
        StringBuilder sb = new StringBuilder("camera device closed: id=");
        sb.append(cameraDevice.getId());
        sb.append(", owned=");
        sb.append(this.r0.size());
        sb.append(", closing=");
        sb.append(this.s0.size());
        sb.append(", afterClose=");
        int i = this.s1;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "APPLY_REQUEST" : "CONTINUE_SWITCH" : "RETRY_SESSION" : "REOPEN" : "NONE");
        sb.append(", closeElapsedMs=");
        sb.append(x(this.z0));
        fm9Var.b(sb.toString());
        if (this.s0.isEmpty()) {
            int i2 = this.s1;
            this.s1 = 1;
            if (!this.U || this.Y || i2 == 1) {
                return;
            }
            int F = wi8.F(i2);
            if (F == 1) {
                this.V = false;
                G();
                return;
            }
            if (F == 2) {
                if (this.y == null || this.z != null) {
                    return;
                }
                this.j.b("retrying capture session after standby camera closed");
                q();
                return;
            }
            if (F == 3) {
                this.j.b("continuing pending switch after DUAL_ACTIVE fallback");
                p();
            } else if (F == 4) {
                a();
            }
        }
    }

    public final void G() {
        if (this.U && this.u0 == null && this.y == null) {
            if (rs.b(this.a, "android.permission.CAMERA") != 0) {
                M(new SecurityException("Camera permission is not granted"));
                return;
            }
            if (rs.b(this.a, "android.permission.RECORD_AUDIO") != 0) {
                M(new SecurityException("Audio recording permission is not granted"));
                return;
            }
            try {
                this.A0 = SystemClock.elapsedRealtimeNanos();
                Q(this.E);
                long x = x(this.A0);
                if (this.y == null && this.w == null) {
                    J();
                }
                SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                if (surfaceTexture != null) {
                    rq5 rq5Var = this.c;
                    int max = Math.max(1, Math.min(720, Math.min(rq5Var.getWidth(), rq5Var.getHeight())));
                    surfaceTexture.setDefaultBufferSize(max, max);
                    if (this.s == null) {
                        this.s = new Surface(surfaceTexture);
                    }
                    boolean z = false;
                    if (this.w == null) {
                        t();
                    } else {
                        km9 km9Var = this.v;
                        if (km9Var != null) {
                            km9Var.n(this.q, this.r, C(this.p));
                            Surface surface = null;
                            if (!this.k0 && this.n0) {
                                this.n0 = false;
                                km9 km9Var2 = this.v;
                                Handler handler = km9Var2.u;
                                if (km9Var2.r0 && handler != null) {
                                    handler.post(new yl6((Object) km9Var2, z, (Object) surface, (byte) 20));
                                }
                            }
                            km9 km9Var3 = this.v;
                            Surface surface2 = km9Var3.w;
                            if (surface2 == null) {
                                throw new IllegalStateException("GL processor is not started");
                            }
                            this.t = surface2;
                            if (this.k0 && (!km9Var3.f || (surface = km9Var3.y) == null)) {
                                throw new IllegalStateException("Secondary GL camera surface is unavailable");
                            }
                            this.u = surface;
                        }
                    }
                    I();
                    this.D0 = SystemClock.elapsedRealtimeNanos();
                    this.j.b("camera open requested: id=" + this.o + ", recording=" + this.q + ", crop=" + this.r + ", selectionElapsedMs=" + x + ", dualActive=" + this.k0);
                    H(this.o, false);
                }
            } catch (Exception e) {
                M(e);
            }
        }
    }

    public final void H(String str, boolean z) {
        am9 am9Var = new am9(this, z ? this.o1 : this.n1, z);
        if (z) {
            this.v0 = am9Var;
        } else {
            this.u0 = am9Var;
        }
        try {
            this.b.openCamera(str, am9Var, this.n);
        } catch (CameraAccessException | RuntimeException e) {
            am9Var.c();
            if (z) {
                if (this.v0 == am9Var) {
                    this.v0 = null;
                }
            } else if (this.u0 == am9Var) {
                this.u0 = null;
            }
            throw e;
        }
    }

    public final void I() {
        if (this.k0 && !this.j0 && this.v0 == null && this.o0 == null) {
            nn9 nn9Var = this.G;
            nn9 nn9Var2 = nn9.a;
            zl9 zl9Var = (nn9Var == nn9Var2 ? nn9.b : nn9Var2) == nn9Var2 ? this.g0 : this.h0;
            if (zl9Var != null) {
                try {
                    String str = zl9Var.a;
                    this.p0 = zl9Var;
                    this.y0 = SystemClock.elapsedRealtimeNanos();
                    this.j.b("warm camera open requested: id=" + str + ", facing=" + zl9Var.b);
                    H(str, true);
                } catch (Exception e) {
                    v("standby open request failed", e, 1);
                }
            }
        }
    }

    public final void J() {
        if (this.j0) {
            return;
        }
        if (this.i0) {
            this.k0 = true;
            return;
        }
        int i = Build.VERSION.SDK_INT;
        fm9 fm9Var = this.j;
        if (i < 30) {
            this.j0 = true;
            fm9Var.b("camera dual-active capability: supported=false, reason=API<30");
            return;
        }
        zl9 g = g();
        pn9 pn9Var = g.g;
        String str = g.a;
        nn9 nn9Var = g.b;
        nn9 nn9Var2 = nn9.a;
        if (nn9Var == nn9Var2) {
            nn9Var2 = nn9.b;
        }
        try {
            try {
                Q(nn9Var2);
                zl9 g2 = g();
                pn9 pn9Var2 = g2.g;
                String str2 = g2.a;
                boolean D = D(str, str2);
                this.i0 = D;
                if (D && pn9Var != pn9Var2) {
                    this.i0 = false;
                    fm9Var.b("camera dual-active capability rejected: incompatible frame rate, first=" + g.d + "/" + g.e + ", second=" + g2.d + "/" + g2.e + ", firstFps=" + ((int) pn9Var.a) + ", secondFps=" + ((int) pn9Var2.a));
                }
                boolean z = this.i0;
                if (!z) {
                    this.j0 = true;
                }
                this.k0 = z;
                StringBuilder sb = new StringBuilder("camera dual-active capability: supported=");
                sb.append(this.i0);
                sb.append(", pair=");
                sb.append(str);
                sb.append("+");
                sb.append(str2);
                sb.append(this.i0 ? "" : ", reason=pair not advertised");
                fm9Var.b(sb.toString());
            } catch (Exception e) {
                this.j0 = true;
                fm9Var.b("camera dual-active capability unavailable: " + e);
            }
        } finally {
            b(g);
        }
    }

    public final void K() {
        this.t0 = true;
        this.U = false;
        this.c.setSurfaceTextureListener(null);
        this.c.removeOnLayoutChangeListener(this.j1);
        Handler handler = this.n;
        HandlerThread handlerThread = this.m;
        this.n = null;
        this.m = null;
        if (handler == null || handlerThread == null) {
            return;
        }
        handler.post(new il9(this, handlerThread, (byte) 3));
    }

    public final void L(IllegalStateException illegalStateException) {
        boolean z;
        em9 em9Var = this.w;
        if (em9Var != null) {
            synchronized (em9Var) {
                z = em9Var.E;
            }
            if (z) {
                this.j.a("camera lost while recording", illegalStateException);
                et8 et8Var = this.k;
                ((un9) et8Var.b).i.post(new kn9(et8Var, illegalStateException, (byte) 0));
                return;
            }
        }
        M(illegalStateException);
    }

    public final void M(Exception exc) {
        this.j.a("camera error", exc);
        et8 et8Var = this.k;
        ((un9) et8Var.b).i.post(new kn9(et8Var, exc, (byte) 1));
    }

    public final void N() {
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
        this.Z0 = 0L;
        this.a1 = 0L;
        this.b1 = 0.0d;
        this.c1 = 0L;
        this.d1 = 0L;
        this.e1 = 0L;
        this.f1 = 0L;
        this.g1 = 0L;
        this.h1 = 0L;
        this.i1 = 0L;
    }

    public final void O() {
        this.G0 = 0L;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
        this.L0 = 0L;
        this.M0 = 0.0d;
        this.N0 = 0L;
        this.O0 = 0L;
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0L;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
    }

    public final in3 P(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, kq kqVar) {
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        fm9 fm9Var = this.j;
        pn9 pn9Var = this.h;
        pn9 pn9Var2 = pn9.b;
        if (pn9Var == pn9Var2 || this.e0) {
            Range A = A(rangeArr, 30);
            StringBuilder p = wi8.p("fps selection: id=", str, ", requested=");
            p.append((int) pn9Var.a);
            p.append(", mode=REGULAR, range=");
            p.append(A);
            p.append(this.e0 ? ", reason=session-wide fallback" : "");
            fm9Var.b(p.toString());
            return new in3((Object) pn9Var2, (Object) A, (Object) kqVar, (byte) 29);
        }
        byte b = pn9Var.a;
        Range A2 = A(rangeArr, b);
        if (A2 != null) {
            ArrayList arrayList = new ArrayList(sizeArr.length);
            int length = sizeArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i;
                Size size = sizeArr[i2];
                int i3 = length;
                long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size);
                if (outputMinFrameDuration <= 0 || outputMinFrameDuration <= 1000000000 / b) {
                    arrayList.add(size);
                }
                i = i2 + 1;
                length = i3;
            }
            Size[] sizeArr2 = (Size[]) arrayList.toArray(new Size[0]);
            try {
                kq h = h(sizeArr2, R(cameraCharacteristics), this.d, this.g);
                fm9Var.b("fps selection: id=" + str + ", requested=" + ((int) b) + ", mode=REGULAR, range=" + A2 + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                return new in3((Object) pn9.c, (Object) A2, (Object) h, (byte) 29);
            } catch (RuntimeException unused) {
                fm9Var.b("fps selection: id=" + str + ", regular " + ((int) b) + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
            }
        } else {
            fm9Var.b("fps selection: id=" + str + ", regular " + ((int) b) + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
        }
        Range A3 = A(rangeArr, 30);
        fm9Var.b("fps selection: id=" + str + ", requested=" + ((int) b) + ", fallback=30, range=" + A3);
        return new in3((Object) pn9Var2, (Object) A3, (Object) kqVar, (byte) 29);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|(2:(1:91)(1:69)|(7:71|72|73|(4:(1:(1:85)(1:83))|86|87|39)|37|38|39))|92|72|73|(1:75)|(0)|86|87|39) */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e6, code lost:
    
        if ((r31 == r8 && r13.equals(r4.get(r15)) && !r13.equals(((android.hardware.camera2.CameraCharacteristics) r14.c).get(r15))) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ec, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(nn9 nn9Var) {
        float floatValue;
        String str;
        zl9 g;
        CameraCharacteristics.Key key;
        int i;
        nn9 nn9Var2;
        int i2;
        int i3;
        String[] strArr;
        String str2;
        sm2 sm2Var;
        sm2 sm2Var2;
        String str3;
        sm2 sm2Var3;
        in3 P;
        sm2 sm2Var4;
        fm9 fm9Var;
        StringBuilder sb;
        Boolean bool;
        CameraCharacteristics.Key key2;
        pn9 pn9Var;
        nn9 nn9Var3 = nn9.b;
        nn9 nn9Var4 = nn9.a;
        zl9 zl9Var = nn9Var == nn9Var4 ? this.g0 : this.h0;
        String str4 = ", facing=";
        if (zl9Var != null) {
            b(zl9Var);
            this.j.b("camera outputs restored from cache: id=" + zl9Var.a + ", facing=" + nn9Var + ", recording=" + zl9Var.d + ", fps=" + ((int) zl9Var.g.a));
            return;
        }
        if (!this.d0) {
            this.d0 = true;
            if (this.h == pn9.c) {
                boolean X = X(nn9Var4);
                boolean X2 = X(nn9Var3);
                this.e0 = (X && X2) ? false : true;
                fm9 fm9Var2 = this.j;
                StringBuilder sb2 = new StringBuilder("60 fps session capability: front=");
                sb2.append(X);
                sb2.append(", back=");
                sb2.append(X2);
                sb2.append(", selected=");
                sb2.append(this.e0 ? 30 : 60);
                fm9Var2.b(sb2.toString());
            }
        }
        int i4 = nn9Var == nn9Var4 ? 0 : 1;
        String[] cameraIdList = this.b.getCameraIdList();
        int length = cameraIdList.length;
        sm2 sm2Var5 = null;
        sm2 sm2Var6 = null;
        int i5 = 0;
        while (i5 < length) {
            String[] strArr2 = cameraIdList;
            String str5 = strArr2[i5];
            int i6 = length;
            CameraCharacteristics cameraCharacteristics = this.b.getCameraCharacteristics(str5);
            sm2 sm2Var7 = sm2Var5;
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num == null || num.intValue() != i4) {
                i = i4;
                nn9Var2 = nn9Var4;
                i2 = i5;
            } else {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                i2 = i5;
                if (streamConfigurationMap == null) {
                    this.j.b("camera candidate rejected: id=" + str5 + ", reason=no stream map");
                    i = i4;
                    nn9Var2 = nn9Var4;
                } else {
                    int i7 = i4;
                    String str6 = str5;
                    Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        nn9Var2 = nn9Var4;
                        strArr = strArr2;
                        i3 = i6;
                        sm2Var = sm2Var7;
                        i = i7;
                        sm2Var2 = sm2Var6;
                        str2 = str4;
                        this.j.b("camera candidate rejected: id=" + str6 + ", reason=no SurfaceTexture outputs");
                        sm2Var6 = sm2Var2;
                        sm2Var5 = sm2Var;
                        i5 = i2 + 1;
                        str4 = str2;
                        nn9Var4 = nn9Var2;
                        i4 = i;
                        cameraIdList = strArr;
                        length = i3;
                    } else {
                        try {
                            try {
                                kq h = h(outputSizes, R(cameraCharacteristics), this.d, this.g);
                                nn9Var2 = nn9Var4;
                                strArr = strArr2;
                                i3 = i6;
                                sm2Var = sm2Var7;
                                i = i7;
                                sm2Var3 = sm2Var6;
                                str6 = str6;
                                try {
                                    P = P(str6, cameraCharacteristics, streamConfigurationMap, outputSizes, h);
                                    try {
                                        sm2Var4 = new sm2(str6, cameraCharacteristics, outputSizes, h, P, (byte) 14);
                                        fm9Var = this.j;
                                        sb = new StringBuilder();
                                        str3 = "camera candidate rejected: id=";
                                        try {
                                            sb.append("camera candidate accepted: id=");
                                            sb.append(str6);
                                            sb.append(str4);
                                            sb.append(nn9Var);
                                            sb.append(", flashAvailable=");
                                            bool = Boolean.TRUE;
                                            key2 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                                            str2 = str4;
                                        } catch (RuntimeException e) {
                                            e = e;
                                            str2 = str4;
                                        }
                                    } catch (RuntimeException e2) {
                                        e = e2;
                                        str2 = str4;
                                        str6 = str6;
                                        str3 = "camera candidate rejected: id=";
                                        sm2Var6 = sm2Var3;
                                        this.j.b(str3 + str6 + ", reason=" + e);
                                        sm2Var5 = sm2Var;
                                        i5 = i2 + 1;
                                        str4 = str2;
                                        nn9Var4 = nn9Var2;
                                        i4 = i;
                                        cameraIdList = strArr;
                                        length = i3;
                                    }
                                    try {
                                        sb.append(bool.equals(cameraCharacteristics.get(key2)));
                                        sb.append(", fps=");
                                        sb.append((int) ((pn9) P.b).a);
                                        sb.append(", recording=");
                                        sb.append((Size) ((kq) P.d).c);
                                        sb.append(", crop=");
                                        sb.append(((kq) P.d).b);
                                        fm9Var.b(sb.toString());
                                    } catch (RuntimeException e3) {
                                        e = e3;
                                        sm2Var6 = sm2Var3;
                                        this.j.b(str3 + str6 + ", reason=" + e);
                                        sm2Var5 = sm2Var;
                                        i5 = i2 + 1;
                                        str4 = str2;
                                        nn9Var4 = nn9Var2;
                                        i4 = i;
                                        cameraIdList = strArr;
                                        length = i3;
                                    }
                                } catch (RuntimeException e4) {
                                    e = e4;
                                    str2 = str4;
                                }
                            } catch (RuntimeException e5) {
                                e = e5;
                                nn9Var2 = nn9Var4;
                                strArr = strArr2;
                                i3 = i6;
                                sm2Var = sm2Var7;
                                i = i7;
                                str6 = str6;
                                str2 = str4;
                                str3 = "camera candidate rejected: id=";
                                this.j.b(str3 + str6 + ", reason=" + e);
                                sm2Var5 = sm2Var;
                                i5 = i2 + 1;
                                str4 = str2;
                                nn9Var4 = nn9Var2;
                                i4 = i;
                                cameraIdList = strArr;
                                length = i3;
                            }
                        } catch (RuntimeException e6) {
                            e = e6;
                            nn9Var2 = nn9Var4;
                            strArr = strArr2;
                            i3 = i6;
                            sm2Var = sm2Var7;
                            i = i7;
                        }
                        if (sm2Var3 != null) {
                            if (!(nn9Var == nn9Var3 && bool.equals(cameraCharacteristics.get(key2)) && !bool.equals(((CameraCharacteristics) sm2Var3.c).get(key2)))) {
                                sm2Var6 = sm2Var3;
                                pn9Var = this.h;
                                if (pn9Var != pn9.b || ((pn9) P.b) == pn9Var) {
                                    if (sm2Var != null) {
                                    }
                                    sm2Var5 = sm2Var4;
                                    i5 = i2 + 1;
                                    str4 = str2;
                                    nn9Var4 = nn9Var2;
                                    i4 = i;
                                    cameraIdList = strArr;
                                    length = i3;
                                }
                                sm2Var5 = sm2Var;
                                i5 = i2 + 1;
                                str4 = str2;
                                nn9Var4 = nn9Var2;
                                i4 = i;
                                cameraIdList = strArr;
                                length = i3;
                            }
                        }
                        sm2Var6 = sm2Var4;
                        pn9Var = this.h;
                        if (pn9Var != pn9.b) {
                        }
                        if (sm2Var != null) {
                        }
                        sm2Var5 = sm2Var4;
                        i5 = i2 + 1;
                        str4 = str2;
                        nn9Var4 = nn9Var2;
                        i4 = i;
                        cameraIdList = strArr;
                        length = i3;
                    }
                }
            }
            strArr = strArr2;
            i3 = i6;
            sm2Var = sm2Var7;
            sm2Var2 = sm2Var6;
            str2 = str4;
            sm2Var6 = sm2Var2;
            sm2Var5 = sm2Var;
            i5 = i2 + 1;
            str4 = str2;
            nn9Var4 = nn9Var2;
            i4 = i;
            cameraIdList = strArr;
            length = i3;
        }
        nn9 nn9Var5 = nn9Var4;
        String str7 = str4;
        sm2 sm2Var8 = sm2Var6;
        if (sm2Var5 == null) {
            sm2Var5 = sm2Var8;
        }
        if (sm2Var5 == null) {
            dq9.m("Requested camera is not available");
            return;
        }
        String str8 = (String) sm2Var5.b;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) sm2Var5.c;
        Size[] sizeArr = (Size[]) sm2Var5.d;
        kq kqVar = (kq) sm2Var5.e;
        in3 in3Var = (in3) sm2Var5.f;
        kq kqVar2 = (kq) in3Var.d;
        this.o = str8;
        this.G = nn9Var;
        this.p = cameraCharacteristics2;
        this.I = (pn9) in3Var.b;
        this.J = (Range) in3Var.c;
        this.c0 = false;
        this.K = kqVar;
        N();
        this.q = (Size) kqVar2.c;
        this.r = kqVar2.b;
        this.H = (on9) kqVar2.d;
        if (Build.VERSION.SDK_INT >= 30) {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            Range range = (Range) cameraCharacteristics2.get(key);
            if (range != null) {
                floatValue = ((Float) range.getUpper()).floatValue();
            }
            floatValue = 1.0f;
        } else {
            Float f = (Float) cameraCharacteristics2.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f != null) {
                floatValue = f.floatValue();
            }
            floatValue = 1.0f;
        }
        this.N = Math.max(1.0f, Math.min(4.0f, floatValue));
        Size size = this.q;
        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        long j = -1;
        if (streamConfigurationMap2 != null) {
            try {
                j = streamConfigurationMap2.getOutputMinFrameDuration(SurfaceTexture.class, size);
            } catch (RuntimeException unused) {
            }
        }
        fm9 fm9Var3 = this.j;
        StringBuilder sb3 = new StringBuilder("camera outputs selected: output=");
        sb3.append((int) this.e);
        sb3.append("x");
        sb3.append((int) this.e);
        sb3.append(", displayRotation=");
        sb3.append(w());
        sb3.append(", cameraMode=");
        sb3.append(this.H);
        if (this.H != this.g) {
            str = " (fallback from " + this.g + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append(", crop=");
        sb3.append(this.r);
        sb3.append(", recording=");
        sb3.append(this.q);
        sb3.append(", sensorAspect=");
        sb3.append(R(cameraCharacteristics2));
        sb3.append(", recordingMinFrameDurationNs=");
        sb3.append(j);
        sb3.append(", fps=");
        sb3.append((int) this.I.a);
        sb3.append(", fpsRange=");
        sb3.append(this.J);
        sb3.append(", timestampSource=");
        sb3.append(C(this.p) ? "REALTIME" : "UNKNOWN");
        sb3.append(this.I != this.h ? hg9.k(new StringBuilder(" (fallback from "), this.h.a, ")") : "");
        fm9Var3.b(sb3.toString());
        if (nn9Var == nn9Var5) {
            if (!this.a0) {
                this.a0 = true;
                Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                Boolean bool2 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                fm9 fm9Var4 = this.j;
                StringBuilder sb4 = new StringBuilder("camera capabilities: id=");
                sb4.append(str8);
                sb4.append(str7);
                sb4.append(nn9Var);
                sb4.append(", hardwareLevel=");
                sb4.append(num2 != null ? "unknown" : num2.intValue() == 2 ? "LEGACY" : num2.intValue() == 0 ? "LIMITED" : num2.intValue() == 1 ? "FULL" : num2.intValue() == 3 ? "LEVEL_3" : (Build.VERSION.SDK_INT < 28 || num2.intValue() != 4) ? String.valueOf(num2) : "EXTERNAL");
                sb4.append(", sensorOrientation=");
                sb4.append(num3);
                sb4.append(", activeArray=");
                sb4.append(rect);
                sb4.append(", flashAvailable=");
                sb4.append(bool2);
                sb4.append(", aeModes=");
                sb4.append(Arrays.toString(iArr));
                sb4.append(", fpsRanges=");
                sb4.append(Arrays.toString(rangeArr));
                sb4.append(", outputSizes=");
                sb4.append(Arrays.toString(sizeArr));
                fm9Var4.b(sb4.toString());
            }
            g = g();
            if (g.b != nn9Var5) {
                this.g0 = g;
                return;
            } else {
                this.h0 = g;
                return;
            }
        }
        if (!this.b0) {
            this.b0 = true;
            Integer num22 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            Integer num32 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
            Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int[] iArr2 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            Boolean bool22 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
            Rect rect2 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            fm9 fm9Var42 = this.j;
            StringBuilder sb42 = new StringBuilder("camera capabilities: id=");
            sb42.append(str8);
            sb42.append(str7);
            sb42.append(nn9Var);
            sb42.append(", hardwareLevel=");
            sb42.append(num22 != null ? "unknown" : num22.intValue() == 2 ? "LEGACY" : num22.intValue() == 0 ? "LIMITED" : num22.intValue() == 1 ? "FULL" : num22.intValue() == 3 ? "LEVEL_3" : (Build.VERSION.SDK_INT < 28 || num22.intValue() != 4) ? String.valueOf(num22) : "EXTERNAL");
            sb42.append(", sensorOrientation=");
            sb42.append(num32);
            sb42.append(", activeArray=");
            sb42.append(rect2);
            sb42.append(", flashAvailable=");
            sb42.append(bool22);
            sb42.append(", aeModes=");
            sb42.append(Arrays.toString(iArr2));
            sb42.append(", fpsRanges=");
            sb42.append(Arrays.toString(rangeArr2));
            sb42.append(", outputSizes=");
            sb42.append(Arrays.toString(sizeArr));
            fm9Var42.b(sb42.toString());
        }
        g = g();
        if (g.b != nn9Var5) {
        }
    }

    public final void S(boolean z) {
        Handler handler = this.n;
        if (!this.U || handler == null) {
            return;
        }
        handler.post(new n28((byte) 7, (Object) this, z));
    }

    public final boolean T(float f) {
        this.M = Math.max(0.0f, Math.min(1.0f, f));
        Handler handler = this.n;
        if (!this.U || handler == null) {
            return false;
        }
        handler.removeCallbacks(this.l1);
        handler.post(this.l1);
        return true;
    }

    public final void V(om9 om9Var, long j, nn9 nn9Var) {
        if (this.t0) {
            this.j.b("camera segment start ignored: controller released");
            return;
        }
        if (this.m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
        this.D = om9Var;
        this.L = j;
        this.E = nn9Var;
        this.U = true;
        this.Y = false;
        this.c0 = false;
        this.x = null;
        this.Z = true;
        this.C0 = SystemClock.elapsedRealtimeNanos();
        O();
        N();
        this.j.b("camera segment start: facing=" + nn9Var + ", timelineOffsetUs=" + j + ", textureAvailable=" + this.c.isAvailable());
        this.c.setSurfaceTextureListener(this.m1);
        Handler handler = this.n;
        if (this.U && handler != null && this.c.isAvailable()) {
            handler.post(new rl9(this, (byte) 8));
        }
    }

    public final boolean W() {
        Handler handler = this.n;
        if (!this.U || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.j.b("camera segment stop requested");
        handler.post(new rl9(this, (byte) 7));
        return true;
    }

    public final boolean X(nn9 nn9Var) {
        bm9 bm9Var;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        int i = nn9Var == nn9.a ? 0 : 1;
        CameraManager cameraManager = this.b;
        String[] cameraIdList = cameraManager.getCameraIdList();
        int length = cameraIdList.length;
        int i2 = 0;
        while (i2 < length) {
            String str = cameraIdList[i2];
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    bm9Var = this;
                    try {
                    } catch (RuntimeException unused) {
                        continue;
                    }
                } catch (RuntimeException unused2) {
                }
                if (((pn9) bm9Var.P(str, cameraCharacteristics, streamConfigurationMap, outputSizes, h(outputSizes, R(cameraCharacteristics), this.d, this.g)).b) == pn9.c) {
                    return true;
                }
                i2++;
                this = bm9Var;
            }
            bm9Var = this;
            i2++;
            this = bm9Var;
        }
        return false;
    }

    public final void Y(nn9 nn9Var) {
        if (!this.U || this.V || nn9Var == this.F) {
            return;
        }
        this.V = true;
        this.W = true;
        this.O = false;
        this.P = false;
        this.M = 0.0f;
        et8 et8Var = this.k;
        ((un9) et8Var.b).i.post(new il9(et8Var, nn9Var, (byte) 6));
        this.F0 = SystemClock.elapsedRealtimeNanos();
        this.j.b("camera device switch started: from=" + this.F + ", to=" + nn9Var);
        if (Z(nn9Var)) {
            return;
        }
        if (this.k0) {
            this.q0 = nn9Var;
            this.j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
            return;
        }
        km9 km9Var = this.v;
        if (km9Var != null) {
            nn9 nn9Var2 = this.F;
            Handler handler = km9Var.u;
            if (km9Var.r0 && handler != null) {
                handler.post(new no8((Object) km9Var, (Object) nn9Var2, (Object) nn9Var, (Object) handler, (byte) 10));
            }
        }
        p();
    }

    public final boolean Z(nn9 nn9Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        zl9 zl9Var;
        bm9 bm9Var;
        Exception exc;
        CaptureRequest.Builder u;
        if (!this.k0 || !this.l0 || !this.m0 || (cameraDevice = this.y) == null || (cameraDevice2 = this.o0) == null || (cameraCaptureSession = this.z) == null || (cameraCaptureSession2 = this.A) == null || (zl9Var = this.p0) == null || zl9Var.b != nn9Var || this.v == null) {
            return false;
        }
        this.y = cameraDevice2;
        this.o0 = cameraDevice;
        this.z = cameraCaptureSession2;
        this.A = cameraCaptureSession;
        CaptureRequest.Builder builder = this.B;
        this.B = this.C;
        this.C = builder;
        Surface surface = this.t;
        this.t = this.u;
        this.u = surface;
        this.p0 = this.F == nn9.a ? this.g0 : this.h0;
        b(zl9Var);
        this.F = nn9Var;
        boolean z = true;
        try {
            try {
                u = u(this.y, this.t, zl9Var, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                e = e;
                bm9Var = this;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e2) {
            e = e2;
            bm9Var = this;
        }
        try {
            this.B = u;
            this.z.setRepeatingRequest(u.build(), this.r1, this.n);
            zl9 zl9Var2 = this.p0;
            if (zl9Var2 != null) {
                try {
                    CaptureRequest.Builder u2 = u(this.o0, this.u, zl9Var2, false, false);
                    this.C = u2;
                    this.A.setRepeatingRequest(u2.build(), this.r1, this.n);
                } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e3) {
                    exc = e3;
                    bm9Var = this;
                    bm9Var.y("role switch request failed", exc, false);
                    return true;
                }
            }
            boolean z2 = !this.n0;
            this.n0 = z2;
            long j = this.F0;
            km9 km9Var = this.v;
            sl9 sl9Var = new sl9(this, nn9Var, j, (byte) 0);
            Handler handler = km9Var.u;
            if (km9Var.r0 && handler != null) {
                handler.post(new yl6((Object) km9Var, z2, (Object) sl9Var, (byte) 20));
            }
            this.l0 = true;
            this.m0 = true;
            this.W = false;
            this.V = false;
            this.X = false;
            N();
            this.j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.y.getId() + ", standbyId=" + this.o0.getId() + ", input=" + (this.n0 ? 1 : 0) + ", elapsedMs=" + x(this.F0));
            this.c.post(new rl9(this, (byte) 2));
            et8 et8Var = this.k;
            ((un9) et8Var.b).i.post(new yl6((Object) et8Var, (Object) new yl9(this.F, this.H, this.I, this.q, this.N, E()), z, (byte) 21));
            return true;
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e4) {
            e = e4;
            bm9Var = this;
            exc = e;
            bm9Var.y("role switch request failed", exc, false);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        CameraDevice cameraDevice;
        CameraCaptureSession cameraCaptureSession = this.z;
        if (!this.U || cameraCaptureSession == null || (cameraDevice = this.y) == null) {
            return;
        }
        try {
            if (cameraDevice != null) {
                try {
                    if (this.t != null) {
                        CaptureRequest.Builder u = u(cameraDevice, this.t, g(), true, false);
                        this.B = u;
                        CameraCaptureSession cameraCaptureSession2 = this.z;
                        if (cameraCaptureSession2 != null) {
                            cameraCaptureSession2.setRepeatingRequest(u.build(), this.r1, this.n);
                            return;
                        }
                        return;
                    }
                } catch (CameraAccessException e) {
                    e = e;
                    Exception exc = e;
                    if (!this.k0) {
                        y("active repeating request failed", exc, false);
                        return;
                    } else if (this.I == pn9.c) {
                        z("60 fps updated request rejected", exc);
                        return;
                    } else {
                        M(exc);
                        return;
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    Exception exc2 = e;
                    if (!this.k0) {
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    IllegalStateException illegalStateException = e;
                    if (this.k0) {
                        y("active repeating request rejected", illegalStateException, false);
                        return;
                    }
                    if (!this.U || this.Y || cameraCaptureSession != this.z) {
                        this.j.b("stale repeating request rejection ignored: " + illegalStateException.getMessage());
                        return;
                    }
                    this.j.b("repeating request rejected by closed camera; reopening device: " + illegalStateException.getMessage());
                    k();
                    CameraDevice cameraDevice2 = this.y;
                    this.y = null;
                    if (cameraDevice2 == null) {
                        G();
                        return;
                    } else {
                        this.z0 = SystemClock.elapsedRealtimeNanos();
                        l(cameraDevice2, 2);
                        return;
                    }
                }
            }
            throw new IllegalStateException("Camera request surfaces are unavailable");
        } catch (CameraAccessException e4) {
            e = e4;
        } catch (IllegalArgumentException e5) {
            e = e5;
        } catch (IllegalStateException e6) {
            e = e6;
        }
    }

    public final void a0() {
        if (this.Z) {
            this.c.setTransform(new Matrix());
            if (w() != this.B0) {
                rl9 rl9Var = new rl9(this, (byte) 1);
                Handler handler = this.n;
                if (handler != null) {
                    handler.post(rl9Var);
                }
            }
        }
    }

    public final void b(zl9 zl9Var) {
        this.o = zl9Var.a;
        this.G = zl9Var.b;
        this.p = zl9Var.c;
        this.q = zl9Var.d;
        this.r = zl9Var.e;
        this.H = zl9Var.f;
        this.I = zl9Var.g;
        this.J = zl9Var.h;
        this.K = zl9Var.i;
        this.N = zl9Var.j;
        this.c0 = false;
        N();
    }

    public final void f() {
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacks(this.k1);
        }
        this.x = null;
    }

    public final zl9 g() {
        return new zl9(this.o, this.G, this.p, this.q, this.r, this.H, this.I, this.J, this.K, this.N);
    }

    public final void j() {
        f();
        this.V = false;
        this.s1 = 1;
        this.u0 = null;
        this.v0 = null;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.B = null;
        this.P = false;
        this.q0 = null;
        k();
        m();
        this.y = null;
        this.o0 = null;
        this.p0 = null;
        if (!this.r0.isEmpty()) {
            this.z0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("closing camera devices: count=" + this.r0.size());
            ArrayList arrayList = new ArrayList(this.r0);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l((CameraDevice) obj, 1);
            }
        }
        km9 km9Var = this.v;
        if (km9Var != null) {
            km9Var.l();
            this.v = null;
        }
        Surface surface = this.s;
        if (surface != null) {
            surface.release();
            this.s = null;
        }
        this.t = null;
        this.u = null;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = false;
    }

    public final void k() {
        CameraCaptureSession cameraCaptureSession = this.z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.z = null;
        }
        this.B = null;
    }

    public final void l(CameraDevice cameraDevice, int i) {
        ArrayList arrayList = this.s0;
        if (!arrayList.contains(cameraDevice)) {
            arrayList.add(cameraDevice);
        }
        if (i != 1) {
            this.s1 = i;
        }
        cameraDevice.close();
    }

    public final void m() {
        CameraCaptureSession cameraCaptureSession = this.A;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.A = null;
        }
        this.C = null;
        this.m0 = false;
    }

    public final void n() {
        nn9 nn9Var = this.q0;
        if (nn9Var != null && this.k0 && this.l0 && this.m0) {
            this.q0 = null;
            if (Z(nn9Var)) {
                return;
            }
            this.V = false;
            Y(nn9Var);
        }
    }

    public final void p() {
        this.q0 = null;
        this.j.b("camera switch path: sequential".concat(this.i0 ? ", reason=standby session not ready" : ", reason=concurrent pair unavailable"));
        k();
        CameraDevice cameraDevice = this.y;
        if (cameraDevice != null) {
            this.y = null;
            this.z0 = SystemClock.elapsedRealtimeNanos();
            l(cameraDevice, 2);
        } else {
            if (this.u0 != null) {
                return;
            }
            this.V = false;
            G();
        }
    }

    public final void q() {
        CameraDevice cameraDevice = this.y;
        if (cameraDevice == null || this.s == null || this.t == null) {
            return;
        }
        try {
            this.E0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("capture session requested: recording=" + this.q + ", fpsRange=" + this.J);
            cameraDevice.createCaptureSession(Arrays.asList(this.t), this.q1, this.n);
        } catch (CameraAccessException | IllegalArgumentException e) {
            if (this.I == pn9.c) {
                z("60 fps session creation rejected", e);
            } else {
                M(e);
            }
        }
    }

    public final void r() {
        CameraDevice cameraDevice = this.y;
        CameraDevice cameraDevice2 = this.o0;
        if (!this.k0 || cameraDevice == null || cameraDevice2 == null || this.t == null || this.u == null || this.z != null || this.A != null) {
            return;
        }
        this.l0 = false;
        this.m0 = false;
        try {
            this.E0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("dual capture sessions requested: activeId=" + cameraDevice.getId() + ", standbyId=" + cameraDevice2.getId() + ", input=" + this.q + ", fpsRange=" + this.J);
            cameraDevice.createCaptureSession(Arrays.asList(this.t), this.q1, this.n);
            cameraDevice2.createCaptureSession(Arrays.asList(this.u), this.p1, this.n);
        } catch (CameraAccessException | IllegalArgumentException e) {
            y("session request failed", e, false);
        }
    }

    public final void s() {
        Surface surface;
        Surface surface2;
        om9 om9Var = this.D;
        long j = this.L;
        short s = this.e;
        int i = this.f;
        byte b = this.f0;
        if (b <= 0) {
            b = this.I.a;
        }
        fm9 fm9Var = this.j;
        et8 et8Var = this.k;
        Objects.requireNonNull(et8Var);
        tl9 tl9Var = new tl9(et8Var, (byte) 0);
        et8 et8Var2 = this.k;
        Objects.requireNonNull(et8Var2);
        em9 em9Var = new em9(om9Var, j, s, i, b, fm9Var, tl9Var, new tl9(et8Var2, (byte) 1));
        this.w = em9Var;
        synchronized (em9Var) {
            if (em9Var.D) {
                surface = em9Var.q;
            } else {
                em9Var.q();
                long nanoTime = System.nanoTime();
                try {
                    em9Var.b();
                    em9Var.a();
                    em9Var.n.start();
                    em9Var.D = true;
                    em9Var.f.b("codecs prepared: video=" + em9Var.n.getName() + ", audio=" + em9Var.o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = em9Var.q;
                } catch (IOException | RuntimeException e) {
                    em9Var.n();
                    throw e;
                }
            }
        }
        Surface surface3 = surface;
        Size size = this.q;
        Surface surface4 = this.s;
        boolean z = this.k0;
        short s2 = this.e;
        int i2 = this.r;
        boolean C = C(this.p);
        boolean z2 = this.i;
        fm9 fm9Var2 = this.j;
        em9 em9Var2 = this.w;
        et8 et8Var3 = this.k;
        Objects.requireNonNull(et8Var3);
        km9 km9Var = new km9(size, surface3, surface4, z, s2, i2, C, z2, fm9Var2, em9Var2, new tl9(et8Var3, (byte) 2));
        this.v = km9Var;
        km9Var.u0 = new rl9(this, (byte) 3);
        int w = w();
        this.B0 = w;
        km9 km9Var2 = this.v;
        km9Var2.s0 = w;
        Handler handler = km9Var2.u;
        if (km9Var2.r0 && handler != null) {
            handler.post(new ge7((Object) km9Var2, w, (byte) 14));
        }
        km9 km9Var3 = this.v;
        if (!km9Var3.r0) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            km9Var3.t = handlerThread;
            handlerThread.start();
            km9Var3.q0 = System.nanoTime();
            fm9 fm9Var3 = km9Var3.i;
            StringBuilder sb = new StringBuilder("GL processor start requested: input=");
            sb.append(km9Var3.a);
            sb.append(", crop=");
            sb.append(km9Var3.j);
            sb.append(", output=");
            sb.append((int) km9Var3.g);
            sb.append("x");
            sb.append((int) km9Var3.g);
            sb.append(", filter=");
            sb.append(km9Var3.j == km9Var3.g ? "NEAREST" : "LINEAR");
            sb.append(", composition=");
            sb.append(km9Var3.h);
            sb.append(", dualInput=");
            sb.append(km9Var3.f);
            sb.append(", glPreview=");
            sb.append(km9Var3.e != null);
            fm9Var3.b(sb.toString());
            Handler handler2 = new Handler(km9Var3.t.getLooper());
            km9Var3.u = handler2;
            handler2.post(new il9(km9Var3, countDownLatch, (byte) 4));
            try {
                countDownLatch.await();
                if (km9Var3.x0 != null) {
                    RuntimeException runtimeException = km9Var3.x0;
                    km9Var3.x0 = null;
                    km9Var3.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                km9Var3.l();
                wa3.h("GL initialization was interrupted", e2);
                return;
            }
        }
        this.t = km9Var3.w;
        if (!this.k0) {
            this.u = null;
            return;
        }
        nn9 nn9Var = this.G;
        nn9 nn9Var2 = nn9.a;
        zl9 zl9Var = (nn9Var == nn9Var2 ? nn9.b : nn9Var2) == nn9Var2 ? this.g0 : this.h0;
        if (zl9Var == null) {
            dq9.m("Secondary camera selection is unavailable");
            return;
        }
        km9 km9Var4 = this.v;
        Size size2 = zl9Var.d;
        int i3 = zl9Var.e;
        boolean C2 = C(zl9Var.c);
        Handler handler3 = km9Var4.u;
        if (km9Var4.r0 && km9Var4.f && handler3 != null) {
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler3.post(new im9(km9Var4, size2, i3, C2, runtimeExceptionArr, countDownLatch2, (byte) 0));
            try {
                countDownLatch2.await();
                RuntimeException runtimeException2 = runtimeExceptionArr[0];
                if (runtimeException2 != null) {
                    throw runtimeException2;
                }
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                wa3.h("Secondary input update was interrupted", e3);
                return;
            }
        }
        km9 km9Var5 = this.v;
        if (!km9Var5.f || (surface2 = km9Var5.y) == null) {
            dq9.m("Secondary GL camera surface is unavailable");
        } else {
            this.u = surface2;
        }
    }

    public final void t() {
        try {
            s();
        } catch (IOException | RuntimeException e) {
            if (!this.k0) {
                throw e;
            }
            this.j.b("camera dual-active fallback: reason=GL pipeline initialization failed, error=" + e);
            km9 km9Var = this.v;
            if (km9Var != null) {
                km9Var.l();
                this.v = null;
            }
            em9 em9Var = this.w;
            if (em9Var != null) {
                em9Var.u();
                this.w = null;
            }
            this.t = null;
            this.u = null;
            this.k0 = false;
            this.i0 = false;
            this.j0 = true;
            s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CaptureRequest.Builder u(CameraDevice cameraDevice, Surface surface, zl9 zl9Var, boolean z, boolean z2) {
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Range range;
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
        createCaptureRequest.addTarget(surface);
        createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
        createCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
        CameraCharacteristics cameraCharacteristics2 = zl9Var.c;
        if (o(cameraCharacteristics2 == null ? null : (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES), 3)) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
        }
        Range range2 = zl9Var.h;
        if (range2 != null) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
            if (z2) {
                this.j.b("capture FPS range selected: " + zl9Var.h + ", cameraId=" + zl9Var.a + ", active=" + z);
            }
        }
        if (z) {
            float A = this.k0 ? 1.0f : td4.A(this.N, 1.0f, this.M, 1.0f);
            if (Build.VERSION.SDK_INT >= 30) {
                CameraCharacteristics cameraCharacteristics3 = this.p;
                if (cameraCharacteristics3 == null) {
                    range = null;
                } else {
                    key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                    range = (Range) cameraCharacteristics3.get(key);
                }
                if (range != null) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), A))));
                    boolean z3 = !this.O && E();
                    cameraCharacteristics = this.p;
                    if (o(cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) : null, 1)) {
                        createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    }
                    CaptureRequest.Key key2 = CaptureRequest.FLASH_MODE;
                    createCaptureRequest.set(key2, Integer.valueOf(z3 ? 2 : 0));
                    if (this.P) {
                        this.j.b("torch request configured: requested=" + this.O + ", applied=" + z3 + ", aeMode=" + createCaptureRequest.get(CaptureRequest.CONTROL_AE_MODE) + ", flashMode=" + createCaptureRequest.get(key2) + ", cameraId=" + this.o);
                    }
                }
            }
            CameraCharacteristics cameraCharacteristics4 = this.p;
            Rect rect = cameraCharacteristics4 == null ? null : (Rect) cameraCharacteristics4.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (rect != null) {
                int max = Math.max(1, Math.round(rect.width() / A));
                int max2 = Math.max(1, Math.round(rect.height() / A));
                int centerX = rect.centerX() - (max / 2);
                int centerY = rect.centerY() - (max2 / 2);
                this.l.set(centerX, centerY, max + centerX, max2 + centerY);
                createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.l);
            }
            if (this.O) {
            }
            cameraCharacteristics = this.p;
            if (o(cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) : null, 1)) {
            }
            CaptureRequest.Key key22 = CaptureRequest.FLASH_MODE;
            createCaptureRequest.set(key22, Integer.valueOf(z3 ? 2 : 0));
            if (this.P) {
            }
        } else {
            if (o((int[]) zl9Var.c.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES), 1)) {
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
            }
            createCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
        }
        int i = this.S + 1;
        this.S = i;
        createCaptureRequest.setTag(Integer.valueOf(i));
        if (this.P) {
            this.T = this.S;
        }
        return createCaptureRequest;
    }

    public final void v(String str, Exception exc, int i) {
        String str2;
        this.j0 = true;
        this.i0 = false;
        this.k0 = false;
        StringBuilder k = b10.k("camera dual-active disabled: reason=", str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        k.append(str2);
        this.j.b(k.toString());
        m();
        CameraDevice cameraDevice = this.o0;
        this.o0 = null;
        this.p0 = null;
        this.v0 = null;
        if (cameraDevice != null && cameraDevice != this.y) {
            l(cameraDevice, i);
        } else if (i == 5) {
            a();
        }
    }

    public final int w() {
        Display display = this.c.getDisplay();
        if (display == null) {
            return 0;
        }
        int rotation = display.getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation == 2) {
            return nm7.J2;
        }
        if (rotation != 3) {
            return 0;
        }
        return nm7.s4;
    }

    public final void y(String str, Exception exc, boolean z) {
        String str2;
        if (this.k0) {
            fm9 fm9Var = this.j;
            StringBuilder sb = new StringBuilder("camera dual-active fallback: reason=");
            sb.append(str);
            sb.append(", keepActive=");
            sb.append(z);
            String str3 = "";
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            sb.append(str2);
            fm9Var.b(sb.toString());
            int i = 0;
            this.k0 = false;
            this.i0 = false;
            this.j0 = true;
            this.l0 = false;
            this.m0 = false;
            if (z && this.z != null) {
                m();
                CameraDevice cameraDevice = this.o0;
                this.o0 = null;
                this.p0 = null;
                if (this.V && this.q0 != null) {
                    i = 1;
                }
                if (cameraDevice != null) {
                    l(cameraDevice, i != 0 ? 4 : 1);
                    return;
                } else {
                    if (i != 0) {
                        p();
                        return;
                    }
                    return;
                }
            }
            String concat = "DUAL_ACTIVE ".concat(str);
            this.j0 = true;
            this.i0 = false;
            this.k0 = false;
            this.q0 = null;
            k();
            m();
            this.y = null;
            this.o0 = null;
            this.p0 = null;
            this.u0 = null;
            this.v0 = null;
            fm9 fm9Var2 = this.j;
            StringBuilder p = wi8.p("camera recovery: reason=", concat, ", target=");
            p.append(this.E);
            p.append(", devices=");
            p.append(this.r0.size());
            p.append(", switchElapsedMs=");
            p.append(x(this.F0));
            if (exc != null) {
                str3 = ", error=" + exc;
            }
            p.append(str3);
            fm9Var2.b(p.toString());
            if (this.r0.isEmpty()) {
                this.V = false;
                if (!this.U || this.Y) {
                    return;
                }
                G();
                return;
            }
            this.z0 = SystemClock.elapsedRealtimeNanos();
            ArrayList arrayList = new ArrayList(this.r0);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                l((CameraDevice) obj, 2);
            }
        }
    }

    public final void z(String str, Exception exc) {
        String str2;
        boolean z;
        em9 em9Var = this.w;
        if (em9Var != null) {
            synchronized (em9Var) {
                z = em9Var.E;
            }
            if (z) {
                M(new IllegalStateException("Unable to apply 30 fps fallback after recording started: ".concat(str), exc));
                return;
            }
        }
        if (this.c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            M(exc);
            return;
        }
        this.c0 = true;
        this.e0 = true;
        k();
        kq kqVar = this.K;
        if (kqVar == null) {
            M(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.I = pn9.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.J = A(cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES), 30);
        this.q = (Size) kqVar.c;
        this.r = kqVar.b;
        this.H = (on9) kqVar.d;
        this.g0 = null;
        this.h0 = null;
        v("frame-rate fallback changed stream configuration", exc, 1);
        km9 km9Var = this.v;
        if (km9Var != null) {
            km9Var.l();
            this.v = null;
        }
        em9 em9Var2 = this.w;
        if (em9Var2 != null) {
            em9Var2.u();
            this.w = null;
        }
        this.t = null;
        try {
            s();
            N();
            fm9 fm9Var = this.j;
            StringBuilder k = b10.k("60 fps fallback: reason=", str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            k.append(str2);
            k.append(", recording=");
            k.append(this.q);
            k.append(", crop=");
            k.append(this.r);
            k.append(", fpsRange=");
            k.append(this.J);
            fm9Var.b(k.toString());
            Handler handler = this.n;
            if (!this.U || handler == null) {
                return;
            }
            handler.post(new rl9(this, (byte) 0));
        } catch (Exception e) {
            M(e);
        }
    }
}
