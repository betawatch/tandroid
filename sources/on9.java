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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class on9 {
    public CameraCaptureSession A;
    public long A0;
    public CaptureRequest.Builder B;
    public int B0;
    public CaptureRequest.Builder C;
    public long C0;
    public bo9 D;
    public long D0;
    public volatile cp9 E;
    public long E0;
    public cp9 F;
    public long F0;
    public cp9 G;
    public long G0;
    public dp9 H;
    public long H0;
    public ep9 I;
    public long I0;
    public Range J;
    public long J0;
    public lp K;
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
    public final uq5 c;
    public boolean c0;
    public long c1;
    public final hp9 d;
    public boolean d0;
    public long d1;
    public final short e;
    public boolean e0;
    public long e1;
    public final int f;
    public byte f0;
    public long f1;
    public final dp9 g;
    public mn9 g0;
    public long g1;
    public final ep9 h;
    public mn9 h0;
    public long h1;
    public final boolean i;
    public boolean i0;
    public long i1;
    public final sn9 j;
    public boolean j0;
    public final pk1 j1;
    public final pq8 k;
    public boolean k0;
    public final dn9 k1;
    public boolean l0;
    public final dn9 l1;
    public HandlerThread m;
    public boolean m0;
    public final wr5 m1;
    public Handler n;
    public boolean n0;
    public final in9 n1;
    public String o;
    public CameraDevice o0;
    public final in9 o1;
    public CameraCharacteristics p;
    public mn9 p0;
    public final jn9 p1;
    public volatile Size q;
    public cp9 q0;
    public final jn9 q1;
    public volatile int r;
    public final kn9 r1;
    public Surface s;
    public Surface t;
    public volatile boolean t0;
    public Surface u;
    public nn9 u0;
    public xn9 v;
    public nn9 v0;
    public rn9 w;
    public int w0;
    public rn9 x;
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

    public on9(Context context, uq5 uq5Var, hp9 hp9Var, int i, dp9 dp9Var, ep9 ep9Var, boolean z, sn9 sn9Var, pq8 pq8Var) {
        byte b = 1;
        pk1 pk1Var = new pk1(this, (byte) 5);
        this.j1 = pk1Var;
        this.k1 = new dn9(this, (byte) 7);
        this.l1 = new dn9(this, (byte) 8);
        this.m1 = new wr5(this, (byte) 2);
        byte b2 = 0;
        this.n1 = new in9(this, b2);
        this.o1 = new in9(this, b);
        this.p1 = new jn9(this, b2);
        this.q1 = new jn9(this, b);
        this.r1 = new kn9(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = uq5Var;
        this.d = hp9Var;
        this.e = hp9Var.a;
        this.f = i;
        this.g = dp9Var;
        this.h = ep9Var;
        this.i = z;
        this.j = sn9Var;
        this.k = pq8Var;
        uq5Var.addOnLayoutChangeListener(pk1Var);
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

    public static lp h(Size[] sizeArr, float f, hp9 hp9Var, dp9 dp9Var) {
        short s;
        lp i;
        dp9 dp9Var2;
        lp i2;
        dp9 dp9Var3 = dp9.c;
        if (dp9Var == dp9Var3) {
            s = hp9Var.a;
        } else {
            s = 720;
            hp9 hp9Var2 = hp9.b;
            dp9 dp9Var4 = dp9.a;
            if (hp9Var == hp9Var2) {
                if (dp9Var == dp9Var4) {
                    s = 960;
                }
            } else if (dp9Var != dp9Var4) {
                s = 540;
            }
        }
        lp i3 = i(sizeArr, f, s, dp9Var);
        if (i3 != null) {
            return i3;
        }
        if (hp9Var == hp9.c && dp9Var == (dp9Var2 = dp9.b) && (i2 = i(sizeArr, f, 480, dp9Var2)) != null) {
            return i2;
        }
        short s2 = hp9Var.a;
        if (dp9Var != dp9Var3 && (i = i(sizeArr, f, s2, dp9Var3)) != null) {
            return i;
        }
        short s3 = hp9Var.a;
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
                grb.i("Camera has no output at or below the bandwidth cap");
                return null;
            }
        }
        return new lp((Object) size, (Object) dp9Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088), (byte) 14);
    }

    public static lp i(Size[] sizeArr, float f, int i, dp9 dp9Var) {
        lp lpVar = null;
        float f2 = 0.0f;
        for (Size size : sizeArr) {
            int y = qu6.y(i, 15, 100, i);
            int min = Math.min(1920, i << 1);
            int min2 = Math.min(size.getWidth(), size.getHeight());
            int max = Math.max(size.getWidth(), size.getHeight());
            if (min2 >= i && min2 <= y && max <= min) {
                float min3 = (Math.min(1.0f, f / (Math.max(size.getWidth(), size.getHeight()) / Math.min(size.getWidth(), size.getHeight()))) * i) / Math.min(size.getWidth(), size.getHeight());
                if (lpVar == null || min3 > f2 || (min3 == f2 && c(size) < c((Size) lpVar.c))) {
                    lpVar = new lp((Object) size, (Object) dp9Var, i, (byte) 14);
                    f2 = min3;
                }
            }
        }
        return lpVar;
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
        sn9 sn9Var = this.j;
        StringBuilder l = c00.l("camera dual-active fallback: reason=standby device ", str);
        if (illegalStateException == null) {
            str2 = "";
        } else {
            str2 = ", error=" + illegalStateException;
        }
        l.append(str2);
        sn9Var.b(l.toString());
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
        return this.F == cp9.b && (cameraCharacteristics = this.p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
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
        sn9 sn9Var = this.j;
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
        sn9Var.b(sb.toString());
        if (this.s0.isEmpty()) {
            int i2 = this.s1;
            this.s1 = 1;
            if (!this.U || this.Y || i2 == 1) {
                return;
            }
            int F = ik8.F(i2);
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
            if (sr.b(this.a, "android.permission.CAMERA") != 0) {
                M(new SecurityException("Camera permission is not granted"));
                return;
            }
            if (sr.b(this.a, "android.permission.RECORD_AUDIO") != 0) {
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
                    uq5 uq5Var = this.c;
                    int max = Math.max(1, Math.min(720, Math.min(uq5Var.getWidth(), uq5Var.getHeight())));
                    surfaceTexture.setDefaultBufferSize(max, max);
                    if (this.s == null) {
                        this.s = new Surface(surfaceTexture);
                    }
                    boolean z = false;
                    if (this.w == null) {
                        t();
                    } else {
                        xn9 xn9Var = this.v;
                        if (xn9Var != null) {
                            xn9Var.n(this.q, this.r, C(this.p));
                            Surface surface = null;
                            if (!this.k0 && this.n0) {
                                this.n0 = false;
                                xn9 xn9Var2 = this.v;
                                Handler handler = xn9Var2.u;
                                if (xn9Var2.r0 && handler != null) {
                                    handler.post(new yn6((Object) xn9Var2, z, (Object) surface, (byte) 19));
                                }
                            }
                            xn9 xn9Var3 = this.v;
                            Surface surface2 = xn9Var3.w;
                            if (surface2 == null) {
                                throw new IllegalStateException("GL processor is not started");
                            }
                            this.t = surface2;
                            if (this.k0 && (!xn9Var3.f || (surface = xn9Var3.y) == null)) {
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
        nn9 nn9Var = new nn9(this, z ? this.o1 : this.n1, z);
        if (z) {
            this.v0 = nn9Var;
        } else {
            this.u0 = nn9Var;
        }
        try {
            this.b.openCamera(str, nn9Var, this.n);
        } catch (CameraAccessException | RuntimeException e) {
            nn9Var.c();
            if (z) {
                if (this.v0 == nn9Var) {
                    this.v0 = null;
                }
            } else if (this.u0 == nn9Var) {
                this.u0 = null;
            }
            throw e;
        }
    }

    public final void I() {
        if (this.k0 && !this.j0 && this.v0 == null && this.o0 == null) {
            cp9 cp9Var = this.G;
            cp9 cp9Var2 = cp9.a;
            mn9 mn9Var = (cp9Var == cp9Var2 ? cp9.b : cp9Var2) == cp9Var2 ? this.g0 : this.h0;
            if (mn9Var != null) {
                try {
                    String str = mn9Var.a;
                    this.p0 = mn9Var;
                    this.y0 = SystemClock.elapsedRealtimeNanos();
                    this.j.b("warm camera open requested: id=" + str + ", facing=" + mn9Var.b);
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
        sn9 sn9Var = this.j;
        if (i < 30) {
            this.j0 = true;
            sn9Var.b("camera dual-active capability: supported=false, reason=API<30");
            return;
        }
        mn9 g = g();
        ep9 ep9Var = g.g;
        String str = g.a;
        cp9 cp9Var = g.b;
        cp9 cp9Var2 = cp9.a;
        if (cp9Var == cp9Var2) {
            cp9Var2 = cp9.b;
        }
        try {
            try {
                Q(cp9Var2);
                mn9 g2 = g();
                ep9 ep9Var2 = g2.g;
                String str2 = g2.a;
                boolean D = D(str, str2);
                this.i0 = D;
                if (D && ep9Var != ep9Var2) {
                    this.i0 = false;
                    sn9Var.b("camera dual-active capability rejected: incompatible frame rate, first=" + g.d + "/" + g.e + ", second=" + g2.d + "/" + g2.e + ", firstFps=" + ((int) ep9Var.a) + ", secondFps=" + ((int) ep9Var2.a));
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
                sn9Var.b(sb.toString());
            } catch (Exception e) {
                this.j0 = true;
                sn9Var.b("camera dual-active capability unavailable: " + e);
            }
        } finally {
            b(g);
        }
    }

    public final void K() {
        this.t0 = true;
        byte b = 0;
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
        handler.post(new en9(this, handlerThread, b));
    }

    public final void L(IllegalStateException illegalStateException) {
        boolean z;
        rn9 rn9Var = this.w;
        if (rn9Var != null) {
            synchronized (rn9Var) {
                z = rn9Var.E;
            }
            if (z) {
                this.j.a("camera lost while recording", illegalStateException);
                pq8 pq8Var = this.k;
                ((jp9) pq8Var.b).i.post(new zo9(pq8Var, illegalStateException, (byte) 1));
                return;
            }
        }
        M(illegalStateException);
    }

    public final void M(Exception exc) {
        this.j.a("camera error", exc);
        pq8 pq8Var = this.k;
        ((jp9) pq8Var.b).i.post(new zo9(pq8Var, exc, (byte) 0));
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

    public final pm3 P(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, lp lpVar) {
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        sn9 sn9Var = this.j;
        ep9 ep9Var = this.h;
        ep9 ep9Var2 = ep9.b;
        if (ep9Var == ep9Var2 || this.e0) {
            Range A = A(rangeArr, 30);
            StringBuilder p = ik8.p("fps selection: id=", str, ", requested=");
            p.append((int) ep9Var.a);
            p.append(", mode=REGULAR, range=");
            p.append(A);
            p.append(this.e0 ? ", reason=session-wide fallback" : "");
            sn9Var.b(p.toString());
            return new pm3((Object) ep9Var2, (Object) A, (Object) lpVar, (byte) 29);
        }
        byte b = ep9Var.a;
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
                lp h = h(sizeArr2, R(cameraCharacteristics), this.d, this.g);
                sn9Var.b("fps selection: id=" + str + ", requested=" + ((int) b) + ", mode=REGULAR, range=" + A2 + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                return new pm3((Object) ep9.c, (Object) A2, (Object) h, (byte) 29);
            } catch (RuntimeException unused) {
                sn9Var.b("fps selection: id=" + str + ", regular " + ((int) b) + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
            }
        } else {
            sn9Var.b("fps selection: id=" + str + ", regular " + ((int) b) + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
        }
        Range A3 = A(rangeArr, 30);
        sn9Var.b("fps selection: id=" + str + ", requested=" + ((int) b) + ", fallback=30, range=" + A3);
        return new pm3((Object) ep9Var2, (Object) A3, (Object) lpVar, (byte) 29);
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
    public final void Q(cp9 cp9Var) {
        float floatValue;
        String str;
        mn9 g;
        CameraCharacteristics.Key key;
        int i;
        cp9 cp9Var2;
        int i2;
        int i3;
        String[] strArr;
        String str2;
        am2 am2Var;
        am2 am2Var2;
        String str3;
        am2 am2Var3;
        pm3 P;
        am2 am2Var4;
        sn9 sn9Var;
        StringBuilder sb;
        Boolean bool;
        CameraCharacteristics.Key key2;
        ep9 ep9Var;
        cp9 cp9Var3 = cp9.b;
        cp9 cp9Var4 = cp9.a;
        mn9 mn9Var = cp9Var == cp9Var4 ? this.g0 : this.h0;
        String str4 = ", facing=";
        if (mn9Var != null) {
            b(mn9Var);
            this.j.b("camera outputs restored from cache: id=" + mn9Var.a + ", facing=" + cp9Var + ", recording=" + mn9Var.d + ", fps=" + ((int) mn9Var.g.a));
            return;
        }
        if (!this.d0) {
            this.d0 = true;
            if (this.h == ep9.c) {
                boolean X = X(cp9Var4);
                boolean X2 = X(cp9Var3);
                this.e0 = (X && X2) ? false : true;
                sn9 sn9Var2 = this.j;
                StringBuilder sb2 = new StringBuilder("60 fps session capability: front=");
                sb2.append(X);
                sb2.append(", back=");
                sb2.append(X2);
                sb2.append(", selected=");
                sb2.append(this.e0 ? 30 : 60);
                sn9Var2.b(sb2.toString());
            }
        }
        int i4 = cp9Var == cp9Var4 ? 0 : 1;
        String[] cameraIdList = this.b.getCameraIdList();
        int length = cameraIdList.length;
        am2 am2Var5 = null;
        am2 am2Var6 = null;
        int i5 = 0;
        while (i5 < length) {
            String[] strArr2 = cameraIdList;
            String str5 = strArr2[i5];
            int i6 = length;
            CameraCharacteristics cameraCharacteristics = this.b.getCameraCharacteristics(str5);
            am2 am2Var7 = am2Var5;
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num == null || num.intValue() != i4) {
                i = i4;
                cp9Var2 = cp9Var4;
                i2 = i5;
            } else {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                i2 = i5;
                if (streamConfigurationMap == null) {
                    this.j.b("camera candidate rejected: id=" + str5 + ", reason=no stream map");
                    i = i4;
                    cp9Var2 = cp9Var4;
                } else {
                    int i7 = i4;
                    String str6 = str5;
                    Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        cp9Var2 = cp9Var4;
                        strArr = strArr2;
                        i3 = i6;
                        am2Var = am2Var7;
                        i = i7;
                        am2Var2 = am2Var6;
                        str2 = str4;
                        this.j.b("camera candidate rejected: id=" + str6 + ", reason=no SurfaceTexture outputs");
                        am2Var6 = am2Var2;
                        am2Var5 = am2Var;
                        i5 = i2 + 1;
                        str4 = str2;
                        cp9Var4 = cp9Var2;
                        i4 = i;
                        cameraIdList = strArr;
                        length = i3;
                    } else {
                        try {
                            try {
                                lp h = h(outputSizes, R(cameraCharacteristics), this.d, this.g);
                                cp9Var2 = cp9Var4;
                                strArr = strArr2;
                                i3 = i6;
                                am2Var = am2Var7;
                                i = i7;
                                am2Var3 = am2Var6;
                                str6 = str6;
                                try {
                                    P = P(str6, cameraCharacteristics, streamConfigurationMap, outputSizes, h);
                                    try {
                                        am2Var4 = new am2(str6, cameraCharacteristics, outputSizes, h, P, (byte) 13);
                                        sn9Var = this.j;
                                        sb = new StringBuilder();
                                        str3 = "camera candidate rejected: id=";
                                        try {
                                            sb.append("camera candidate accepted: id=");
                                            sb.append(str6);
                                            sb.append(str4);
                                            sb.append(cp9Var);
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
                                        am2Var6 = am2Var3;
                                        this.j.b(str3 + str6 + ", reason=" + e);
                                        am2Var5 = am2Var;
                                        i5 = i2 + 1;
                                        str4 = str2;
                                        cp9Var4 = cp9Var2;
                                        i4 = i;
                                        cameraIdList = strArr;
                                        length = i3;
                                    }
                                    try {
                                        sb.append(bool.equals(cameraCharacteristics.get(key2)));
                                        sb.append(", fps=");
                                        sb.append((int) ((ep9) P.b).a);
                                        sb.append(", recording=");
                                        sb.append((Size) ((lp) P.d).c);
                                        sb.append(", crop=");
                                        sb.append(((lp) P.d).b);
                                        sn9Var.b(sb.toString());
                                    } catch (RuntimeException e3) {
                                        e = e3;
                                        am2Var6 = am2Var3;
                                        this.j.b(str3 + str6 + ", reason=" + e);
                                        am2Var5 = am2Var;
                                        i5 = i2 + 1;
                                        str4 = str2;
                                        cp9Var4 = cp9Var2;
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
                                cp9Var2 = cp9Var4;
                                strArr = strArr2;
                                i3 = i6;
                                am2Var = am2Var7;
                                i = i7;
                                str6 = str6;
                                str2 = str4;
                                str3 = "camera candidate rejected: id=";
                                this.j.b(str3 + str6 + ", reason=" + e);
                                am2Var5 = am2Var;
                                i5 = i2 + 1;
                                str4 = str2;
                                cp9Var4 = cp9Var2;
                                i4 = i;
                                cameraIdList = strArr;
                                length = i3;
                            }
                        } catch (RuntimeException e6) {
                            e = e6;
                            cp9Var2 = cp9Var4;
                            strArr = strArr2;
                            i3 = i6;
                            am2Var = am2Var7;
                            i = i7;
                        }
                        if (am2Var3 != null) {
                            if (!(cp9Var == cp9Var3 && bool.equals(cameraCharacteristics.get(key2)) && !bool.equals(((CameraCharacteristics) am2Var3.c).get(key2)))) {
                                am2Var6 = am2Var3;
                                ep9Var = this.h;
                                if (ep9Var != ep9.b || ((ep9) P.b) == ep9Var) {
                                    if (am2Var != null) {
                                    }
                                    am2Var5 = am2Var4;
                                    i5 = i2 + 1;
                                    str4 = str2;
                                    cp9Var4 = cp9Var2;
                                    i4 = i;
                                    cameraIdList = strArr;
                                    length = i3;
                                }
                                am2Var5 = am2Var;
                                i5 = i2 + 1;
                                str4 = str2;
                                cp9Var4 = cp9Var2;
                                i4 = i;
                                cameraIdList = strArr;
                                length = i3;
                            }
                        }
                        am2Var6 = am2Var4;
                        ep9Var = this.h;
                        if (ep9Var != ep9.b) {
                        }
                        if (am2Var != null) {
                        }
                        am2Var5 = am2Var4;
                        i5 = i2 + 1;
                        str4 = str2;
                        cp9Var4 = cp9Var2;
                        i4 = i;
                        cameraIdList = strArr;
                        length = i3;
                    }
                }
            }
            strArr = strArr2;
            i3 = i6;
            am2Var = am2Var7;
            am2Var2 = am2Var6;
            str2 = str4;
            am2Var6 = am2Var2;
            am2Var5 = am2Var;
            i5 = i2 + 1;
            str4 = str2;
            cp9Var4 = cp9Var2;
            i4 = i;
            cameraIdList = strArr;
            length = i3;
        }
        cp9 cp9Var5 = cp9Var4;
        String str7 = str4;
        am2 am2Var8 = am2Var6;
        if (am2Var5 == null) {
            am2Var5 = am2Var8;
        }
        if (am2Var5 == null) {
            grb.i("Requested camera is not available");
            return;
        }
        String str8 = (String) am2Var5.b;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) am2Var5.c;
        Size[] sizeArr = (Size[]) am2Var5.d;
        lp lpVar = (lp) am2Var5.e;
        pm3 pm3Var = (pm3) am2Var5.f;
        lp lpVar2 = (lp) pm3Var.d;
        this.o = str8;
        this.G = cp9Var;
        this.p = cameraCharacteristics2;
        this.I = (ep9) pm3Var.b;
        this.J = (Range) pm3Var.c;
        this.c0 = false;
        this.K = lpVar;
        N();
        this.q = (Size) lpVar2.c;
        this.r = lpVar2.b;
        this.H = (dp9) lpVar2.d;
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
        sn9 sn9Var3 = this.j;
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
        sb3.append(this.I != this.h ? uh9.l(new StringBuilder(" (fallback from "), this.h.a, ")") : "");
        sn9Var3.b(sb3.toString());
        if (cp9Var == cp9Var5) {
            if (!this.a0) {
                this.a0 = true;
                Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                Boolean bool2 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                sn9 sn9Var4 = this.j;
                StringBuilder sb4 = new StringBuilder("camera capabilities: id=");
                sb4.append(str8);
                sb4.append(str7);
                sb4.append(cp9Var);
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
                sn9Var4.b(sb4.toString());
            }
            g = g();
            if (g.b != cp9Var5) {
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
            sn9 sn9Var42 = this.j;
            StringBuilder sb42 = new StringBuilder("camera capabilities: id=");
            sb42.append(str8);
            sb42.append(str7);
            sb42.append(cp9Var);
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
            sn9Var42.b(sb42.toString());
        }
        g = g();
        if (g.b != cp9Var5) {
        }
    }

    public final void S(boolean z) {
        Handler handler = this.n;
        if (!this.U || handler == null) {
            return;
        }
        handler.post(new q38((byte) 7, (Object) this, z));
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

    public final void V(bo9 bo9Var, long j, cp9 cp9Var) {
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
        this.D = bo9Var;
        this.L = j;
        this.E = cp9Var;
        byte b = 1;
        this.U = true;
        this.Y = false;
        this.c0 = false;
        this.x = null;
        this.Z = true;
        this.C0 = SystemClock.elapsedRealtimeNanos();
        O();
        N();
        this.j.b("camera segment start: facing=" + cp9Var + ", timelineOffsetUs=" + j + ", textureAvailable=" + this.c.isAvailable());
        this.c.setSurfaceTextureListener(this.m1);
        Handler handler = this.n;
        if (this.U && handler != null && this.c.isAvailable()) {
            handler.post(new dn9(this, b));
        }
    }

    public final boolean W() {
        Handler handler = this.n;
        byte b = 0;
        if (!this.U || this.Y || handler == null) {
            return false;
        }
        this.Y = true;
        this.Z = false;
        this.j.b("camera segment stop requested");
        handler.post(new dn9(this, b));
        return true;
    }

    public final boolean X(cp9 cp9Var) {
        on9 on9Var;
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        int i = cp9Var == cp9.a ? 0 : 1;
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
                    on9Var = this;
                    try {
                    } catch (RuntimeException unused) {
                        continue;
                    }
                } catch (RuntimeException unused2) {
                }
                if (((ep9) on9Var.P(str, cameraCharacteristics, streamConfigurationMap, outputSizes, h(outputSizes, R(cameraCharacteristics), this.d, this.g)).b) == ep9.c) {
                    return true;
                }
                i2++;
                this = on9Var;
            }
            on9Var = this;
            i2++;
            this = on9Var;
        }
        return false;
    }

    public final void Y(cp9 cp9Var) {
        if (!this.U || this.V || cp9Var == this.F) {
            return;
        }
        this.V = true;
        this.W = true;
        this.O = false;
        this.P = false;
        this.M = 0.0f;
        pq8 pq8Var = this.k;
        ((jp9) pq8Var.b).i.post(new en9(pq8Var, cp9Var, (byte) 3));
        this.F0 = SystemClock.elapsedRealtimeNanos();
        this.j.b("camera device switch started: from=" + this.F + ", to=" + cp9Var);
        if (Z(cp9Var)) {
            return;
        }
        if (this.k0) {
            this.q0 = cp9Var;
            this.j.b("camera switch path: waiting for DUAL_ACTIVE standby session");
            return;
        }
        xn9 xn9Var = this.v;
        if (xn9Var != null) {
            cp9 cp9Var2 = this.F;
            Handler handler = xn9Var.u;
            if (xn9Var.r0 && handler != null) {
                handler.post(new vp8((Object) xn9Var, (Object) cp9Var2, (Object) cp9Var, (Object) handler, (byte) 11));
            }
        }
        p();
    }

    public final boolean Z(cp9 cp9Var) {
        CameraDevice cameraDevice;
        CameraDevice cameraDevice2;
        CameraCaptureSession cameraCaptureSession;
        CameraCaptureSession cameraCaptureSession2;
        mn9 mn9Var;
        on9 on9Var;
        Exception exc;
        CaptureRequest.Builder u;
        if (!this.k0 || !this.l0 || !this.m0 || (cameraDevice = this.y) == null || (cameraDevice2 = this.o0) == null || (cameraCaptureSession = this.z) == null || (cameraCaptureSession2 = this.A) == null || (mn9Var = this.p0) == null || mn9Var.b != cp9Var || this.v == null) {
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
        this.p0 = this.F == cp9.a ? this.g0 : this.h0;
        b(mn9Var);
        this.F = cp9Var;
        boolean z = true;
        try {
            try {
                u = u(this.y, this.t, mn9Var, true, false);
            } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e) {
                e = e;
                on9Var = this;
            }
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e2) {
            e = e2;
            on9Var = this;
        }
        try {
            this.B = u;
            this.z.setRepeatingRequest(u.build(), this.r1, this.n);
            mn9 mn9Var2 = this.p0;
            if (mn9Var2 != null) {
                try {
                    CaptureRequest.Builder u2 = u(this.o0, this.u, mn9Var2, false, false);
                    this.C = u2;
                    this.A.setRepeatingRequest(u2.build(), this.r1, this.n);
                } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e3) {
                    exc = e3;
                    on9Var = this;
                    on9Var.y("role switch request failed", exc, false);
                    return true;
                }
            }
            boolean z2 = !this.n0;
            this.n0 = z2;
            long j = this.F0;
            xn9 xn9Var = this.v;
            fn9 fn9Var = new fn9(this, cp9Var, j, (byte) 0);
            Handler handler = xn9Var.u;
            if (xn9Var.r0 && handler != null) {
                handler.post(new yn6((Object) xn9Var, z2, (Object) fn9Var, (byte) 19));
            }
            this.l0 = true;
            this.m0 = true;
            this.W = false;
            this.V = false;
            this.X = false;
            N();
            this.j.b("camera switch path: DUAL_ACTIVE, activeId=" + this.y.getId() + ", standbyId=" + this.o0.getId() + ", input=" + (this.n0 ? 1 : 0) + ", elapsedMs=" + x(this.F0));
            this.c.post(new dn9(this, (byte) 4));
            pq8 pq8Var = this.k;
            ((jp9) pq8Var.b).i.post(new yn6((Object) pq8Var, (Object) new ln9(this.F, this.H, this.I, this.q, this.N, E()), z, (byte) 20));
            return true;
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException e4) {
            e = e4;
            on9Var = this;
            exc = e;
            on9Var.y("role switch request failed", exc, false);
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
                    } else if (this.I == ep9.c) {
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
                dn9 dn9Var = new dn9(this, (byte) 3);
                Handler handler = this.n;
                if (handler != null) {
                    handler.post(dn9Var);
                }
            }
        }
    }

    public final void b(mn9 mn9Var) {
        this.o = mn9Var.a;
        this.G = mn9Var.b;
        this.p = mn9Var.c;
        this.q = mn9Var.d;
        this.r = mn9Var.e;
        this.H = mn9Var.f;
        this.I = mn9Var.g;
        this.J = mn9Var.h;
        this.K = mn9Var.i;
        this.N = mn9Var.j;
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

    public final mn9 g() {
        return new mn9(this.o, this.G, this.p, this.q, this.r, this.H, this.I, this.J, this.K, this.N);
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
        xn9 xn9Var = this.v;
        if (xn9Var != null) {
            xn9Var.l();
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
        cp9 cp9Var = this.q0;
        if (cp9Var != null && this.k0 && this.l0 && this.m0) {
            this.q0 = null;
            if (Z(cp9Var)) {
                return;
            }
            this.V = false;
            Y(cp9Var);
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
            if (this.I == ep9.c) {
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
        bo9 bo9Var = this.D;
        long j = this.L;
        short s = this.e;
        int i = this.f;
        byte b = this.f0;
        if (b <= 0) {
            b = this.I.a;
        }
        sn9 sn9Var = this.j;
        pq8 pq8Var = this.k;
        Objects.requireNonNull(pq8Var);
        gn9 gn9Var = new gn9(pq8Var, (byte) 0);
        pq8 pq8Var2 = this.k;
        Objects.requireNonNull(pq8Var2);
        byte b2 = 1;
        rn9 rn9Var = new rn9(bo9Var, j, s, i, b, sn9Var, gn9Var, new gn9(pq8Var2, b2));
        this.w = rn9Var;
        synchronized (rn9Var) {
            if (rn9Var.D) {
                surface = rn9Var.q;
            } else {
                rn9Var.q();
                long nanoTime = System.nanoTime();
                try {
                    rn9Var.b();
                    rn9Var.a();
                    rn9Var.n.start();
                    rn9Var.D = true;
                    rn9Var.f.b("codecs prepared: video=" + rn9Var.n.getName() + ", audio=" + rn9Var.o.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = rn9Var.q;
                } catch (IOException | RuntimeException e) {
                    rn9Var.n();
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
        sn9 sn9Var2 = this.j;
        rn9 rn9Var2 = this.w;
        pq8 pq8Var3 = this.k;
        Objects.requireNonNull(pq8Var3);
        xn9 xn9Var = new xn9(size, surface3, surface4, z, s2, i2, C, z2, sn9Var2, rn9Var2, new gn9(pq8Var3, (byte) 2));
        this.v = xn9Var;
        xn9Var.u0 = new dn9(this, (byte) 5);
        int w = w();
        this.B0 = w;
        xn9 xn9Var2 = this.v;
        xn9Var2.s0 = w;
        Handler handler = xn9Var2.u;
        if (xn9Var2.r0 && handler != null) {
            handler.post(new me7((Object) xn9Var2, w, (byte) 15));
        }
        xn9 xn9Var3 = this.v;
        if (!xn9Var3.r0) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            xn9Var3.t = handlerThread;
            handlerThread.start();
            xn9Var3.q0 = System.nanoTime();
            sn9 sn9Var3 = xn9Var3.i;
            StringBuilder sb = new StringBuilder("GL processor start requested: input=");
            sb.append(xn9Var3.a);
            sb.append(", crop=");
            sb.append(xn9Var3.j);
            sb.append(", output=");
            sb.append((int) xn9Var3.g);
            sb.append("x");
            sb.append((int) xn9Var3.g);
            sb.append(", filter=");
            sb.append(xn9Var3.j == xn9Var3.g ? "NEAREST" : "LINEAR");
            sb.append(", composition=");
            sb.append(xn9Var3.h);
            sb.append(", dualInput=");
            sb.append(xn9Var3.f);
            sb.append(", glPreview=");
            sb.append(xn9Var3.e != null);
            sn9Var3.b(sb.toString());
            Handler handler2 = new Handler(xn9Var3.t.getLooper());
            xn9Var3.u = handler2;
            handler2.post(new en9(xn9Var3, countDownLatch, b2));
            try {
                countDownLatch.await();
                if (xn9Var3.x0 != null) {
                    RuntimeException runtimeException = xn9Var3.x0;
                    xn9Var3.x0 = null;
                    xn9Var3.l();
                    throw runtimeException;
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                xn9Var3.l();
                su3.f("GL initialization was interrupted", e2);
                return;
            }
        }
        this.t = xn9Var3.w;
        if (!this.k0) {
            this.u = null;
            return;
        }
        cp9 cp9Var = this.G;
        cp9 cp9Var2 = cp9.a;
        mn9 mn9Var = (cp9Var == cp9Var2 ? cp9.b : cp9Var2) == cp9Var2 ? this.g0 : this.h0;
        if (mn9Var == null) {
            grb.i("Secondary camera selection is unavailable");
            return;
        }
        xn9 xn9Var4 = this.v;
        Size size2 = mn9Var.d;
        int i3 = mn9Var.e;
        boolean C2 = C(mn9Var.c);
        Handler handler3 = xn9Var4.u;
        if (xn9Var4.r0 && xn9Var4.f && handler3 != null) {
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            handler3.post(new vn9(xn9Var4, size2, i3, C2, runtimeExceptionArr, countDownLatch2, (byte) 0));
            try {
                countDownLatch2.await();
                RuntimeException runtimeException2 = runtimeExceptionArr[0];
                if (runtimeException2 != null) {
                    throw runtimeException2;
                }
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                su3.f("Secondary input update was interrupted", e3);
                return;
            }
        }
        xn9 xn9Var5 = this.v;
        if (!xn9Var5.f || (surface2 = xn9Var5.y) == null) {
            grb.i("Secondary GL camera surface is unavailable");
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
            xn9 xn9Var = this.v;
            if (xn9Var != null) {
                xn9Var.l();
                this.v = null;
            }
            rn9 rn9Var = this.w;
            if (rn9Var != null) {
                rn9Var.u();
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
    public final CaptureRequest.Builder u(CameraDevice cameraDevice, Surface surface, mn9 mn9Var, boolean z, boolean z2) {
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Range range;
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
        createCaptureRequest.addTarget(surface);
        createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
        createCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
        CameraCharacteristics cameraCharacteristics2 = mn9Var.c;
        if (o(cameraCharacteristics2 == null ? null : (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES), 3)) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
        }
        Range range2 = mn9Var.h;
        if (range2 != null) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
            if (z2) {
                this.j.b("capture FPS range selected: " + mn9Var.h + ", cameraId=" + mn9Var.a + ", active=" + z);
            }
        }
        if (z) {
            float A = this.k0 ? 1.0f : qd4.A(this.N, 1.0f, this.M, 1.0f);
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
            if (o((int[]) mn9Var.c.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES), 1)) {
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
        StringBuilder l = c00.l("camera dual-active disabled: reason=", str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        l.append(str2);
        this.j.b(l.toString());
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
            return jn7.J2;
        }
        if (rotation != 3) {
            return 0;
        }
        return jn7.s4;
    }

    public final void y(String str, Exception exc, boolean z) {
        String str2;
        if (this.k0) {
            sn9 sn9Var = this.j;
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
            sn9Var.b(sb.toString());
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
            sn9 sn9Var2 = this.j;
            StringBuilder p = ik8.p("camera recovery: reason=", concat, ", target=");
            p.append(this.E);
            p.append(", devices=");
            p.append(this.r0.size());
            p.append(", switchElapsedMs=");
            p.append(x(this.F0));
            if (exc != null) {
                str3 = ", error=" + exc;
            }
            p.append(str3);
            sn9Var2.b(p.toString());
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
        rn9 rn9Var = this.w;
        if (rn9Var != null) {
            synchronized (rn9Var) {
                z = rn9Var.E;
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
        lp lpVar = this.K;
        if (lpVar == null) {
            M(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.I = ep9.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.J = A(cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES), 30);
        this.q = (Size) lpVar.c;
        this.r = lpVar.b;
        this.H = (dp9) lpVar.d;
        this.g0 = null;
        this.h0 = null;
        v("frame-rate fallback changed stream configuration", exc, 1);
        xn9 xn9Var = this.v;
        if (xn9Var != null) {
            xn9Var.l();
            this.v = null;
        }
        rn9 rn9Var2 = this.w;
        if (rn9Var2 != null) {
            rn9Var2.u();
            this.w = null;
        }
        this.t = null;
        try {
            s();
            N();
            sn9 sn9Var = this.j;
            StringBuilder l = c00.l("60 fps fallback: reason=", str);
            if (exc == null) {
                str2 = "";
            } else {
                str2 = ", error=" + exc;
            }
            l.append(str2);
            l.append(", recording=");
            l.append(this.q);
            l.append(", crop=");
            l.append(this.r);
            l.append(", fpsRange=");
            l.append(this.J);
            sn9Var.b(l.toString());
            Handler handler = this.n;
            if (!this.U || handler == null) {
                return;
            }
            handler.post(new dn9(this, (byte) 2));
        } catch (Exception e) {
            M(e);
        }
    }
}
