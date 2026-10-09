package ki;

import ai.i5;
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
import ci.e4;
import ci.u5;
import com.google.android.gms.internal.vision.e2;
import gg.w1;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class j {
    public CaptureRequest.Builder A;
    public long A0;
    public u B;
    public long B0;
    public volatile m0 C;
    public double C0;
    public m0 D;
    public long D0;
    public m0 E;
    public long E0;
    public n0 F;
    public long F0;
    public o0 G;
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
    public long M0;
    public boolean N;
    public long N0;
    public int O;
    public long O0;
    public int P;
    public long P0;
    public int Q;
    public long Q0;
    public int R;
    public double R0;
    public volatile boolean S;
    public long S0;
    public boolean T;
    public long T0;
    public boolean U;
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
    public final e4 Z0;
    public final Context a;
    public boolean a0;
    public final a a1;
    public final CameraManager b;
    public boolean b0;
    public final a b1;
    public final TextureView c;
    public boolean c0;
    public final d c1;
    public final r0 d;
    public boolean d0;
    public final e d1;
    public final int e;
    public boolean e0;
    public final e e1;
    public final int f;
    public i f0;
    public final f f1;
    public final n0 g;
    public i g0;
    public final g g1;
    public final o0 h;
    public boolean h0;
    public final boolean i;
    public boolean i0;
    public final n j;
    public boolean j0;
    public final xa.d k;
    public CameraDevice k0;
    public CameraDevice l0;
    public HandlerThread m;
    public i m0;
    public Handler n;
    public m0 n0;
    public String o;
    public long o0;
    public CameraCharacteristics p;
    public long p0;
    public Size q;
    public long q0;
    public volatile Size r;
    public boolean r0;
    public volatile int s;
    public long s0;
    public Surface t;
    public long t0;
    public Surface u;
    public long u0;
    public r v;
    public long v0;
    public m w;
    public long w0;
    public m x;
    public long x0;
    public CameraDevice y;
    public long y0;
    public CameraCaptureSession z;
    public long z0;
    public final Rect l = new Rect();
    public float L = 1.0f;

    public j(Context context, TextureView textureView, r0 r0Var, int i10, n0 n0Var, o0 o0Var, boolean z10, n nVar, xa.d dVar) {
        e4 e4Var = new e4(this, 2);
        this.Z0 = e4Var;
        this.a1 = new a(this, 3);
        this.b1 = new a(this, 4);
        this.c1 = new d(this, 0);
        this.d1 = new e(this, 0);
        this.e1 = new e(this, 1);
        this.f1 = new f(this);
        this.g1 = new g(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = textureView;
        this.d = r0Var;
        this.e = r0Var.a;
        this.f = i10;
        this.g = n0Var;
        this.h = o0Var;
        this.i = z10;
        this.j = nVar;
        this.k = dVar;
        textureView.addOnLayoutChangeListener(e4Var);
    }

    public static int J(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float K(double d, long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        double d10 = j10;
        double d11 = j3 / d10;
        return (float) (Math.sqrt(Math.max(0.0d, (d / d10) - (d11 * d11))) / 1000000.0d);
    }

    public static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "CAMERA_SERVICE" : "CAMERA_DEVICE" : "CAMERA_DISABLED" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE";
    }

    public static void b(j jVar, CameraDevice cameraDevice, String str, IllegalStateException illegalStateException) {
        boolean z10 = cameraDevice == jVar.y;
        if (cameraDevice == jVar.k0) {
            jVar.k0 = null;
        }
        jVar.j0 = false;
        cameraDevice.close();
        if (z10) {
            jVar.m();
            jVar.y = null;
            if (illegalStateException != null) {
                jVar.C(illegalStateException);
                return;
            } else {
                jVar.C(new IllegalStateException(sc.v.i("Active warm camera ", str)));
                return;
            }
        }
        jVar.r("standby device " + str, illegalStateException);
        if (jVar.n0 != null) {
            jVar.n();
            return;
        }
        if (!jVar.S || jVar.y == null || jVar.z != null || jVar.U) {
            return;
        }
        jVar.j.b("warm camera failed during startup; configuring active camera only");
        jVar.o();
    }

    public static long e(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static float f(long j3, long j10) {
        if (j10 == 0) {
            return 0.0f;
        }
        return (j3 / j10) / 1000000.0f;
    }

    public static j6.l i(Size[] sizeArr, r0 r0Var, n0 n0Var) {
        int i10;
        j6.l k10;
        n0 n0Var2;
        j6.l k11;
        n0 n0Var3 = n0.c;
        if (n0Var == n0Var3) {
            i10 = r0Var.a;
        } else {
            r0 r0Var2 = r0.b;
            n0 n0Var4 = n0.a;
            if (r0Var == r0Var2) {
                if (n0Var == n0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (n0Var != n0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l k12 = k(sizeArr, i10, n0Var);
        if (k12 != null) {
            return k12;
        }
        if (r0Var == r0.c && n0Var == (n0Var2 = n0.b) && (k11 = k(sizeArr, 480, n0Var2)) != null) {
            return k11;
        }
        int i11 = r0Var.a;
        if (n0Var != n0Var3 && (k10 = k(sizeArr, i11, n0Var3)) != null) {
            return k10;
        }
        int i12 = r0Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (J(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || e(size2) < e(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (J(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && e(size3) < e(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(j(sizeArr, size), size, n0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size j(Size[] sizeArr, Size size) {
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(J(size2) - 720);
                if ((abs != abs2 ? Integer.compare(abs, abs2) : Long.compare(e(size3), e(size2))) < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.l k(Size[] sizeArr, int i10, n0 n0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int J = J(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (J >= i10 && J <= i11 && max <= min) {
                Size j3 = j(sizeArr, size);
                j6.l lVar2 = new j6.l(j3, size, n0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.b;
                    int abs = Math.abs(Math.min(j3.getWidth(), j3.getHeight()) - 720);
                    Size size3 = (Size) lVar.c;
                    int abs2 = Math.abs(J(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long e7 = e(size) + e(j3);
                        long e10 = e(size3) + e(size2);
                        compare = e7 != e10 ? Long.compare(e7, e10) : Long.compare(e(size), e(size3));
                    }
                    if (compare >= 0) {
                    }
                }
                lVar = lVar2;
            }
        }
        return lVar;
    }

    public static long s(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range u(Range[] rangeArr, int i10) {
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

    public final void A() {
        if (this.i0 || this.h0) {
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.j;
        if (i10 < 30) {
            this.i0 = true;
            nVar.b("camera warm-switch capability: supported=false, reason=API<30");
            return;
        }
        i h = h();
        String str = h.a;
        m0 m0Var = h.b;
        m0 m0Var2 = m0.a;
        if (m0Var == m0Var2) {
            m0Var2 = m0.b;
        }
        try {
            try {
                G(m0Var2);
                String str2 = h().a;
                boolean w10 = w(str, str2);
                this.h0 = w10;
                if (!w10) {
                    this.i0 = true;
                }
                StringBuilder sb2 = new StringBuilder("camera warm-switch capability: supported=");
                sb2.append(this.h0);
                sb2.append(", pair=");
                sb2.append(str);
                sb2.append("+");
                sb2.append(str2);
                sb2.append(this.h0 ? "" : ", reason=pair not advertised");
                nVar.b(sb2.toString());
                d(h);
            } catch (Exception e7) {
                this.i0 = true;
                nVar.b("camera warm-switch capability unavailable: " + e7);
                d(h);
            }
        } catch (Throwable th2) {
            d(h);
            throw th2;
        }
    }

    public final void B() {
        this.S = false;
        this.c.setSurfaceTextureListener(null);
        this.c.removeOnLayoutChangeListener(this.Z0);
        Handler handler = this.n;
        HandlerThread handlerThread = this.m;
        this.n = null;
        this.m = null;
        if (handler == null || handlerThread == null) {
            return;
        }
        handler.post(new w1(28, this, handlerThread));
    }

    public final void C(Exception exc) {
        this.j.a("camera error", exc);
        xa.d dVar = this.k;
        ((t0) dVar.b).i.post(new i0(1, dVar, exc));
    }

    public final void D() {
        this.L0 = 0L;
        this.M0 = 0L;
        this.N0 = 0L;
        this.O0 = 0L;
        this.P0 = 0L;
        this.Q0 = 0L;
        this.R0 = 0.0d;
        this.S0 = 0L;
        this.T0 = 0L;
        this.U0 = 0L;
        this.V0 = 0L;
        this.W0 = 0L;
        this.X0 = 0L;
        this.Y0 = 0L;
    }

    public final void E() {
        this.w0 = 0L;
        this.x0 = 0L;
        this.y0 = 0L;
        this.z0 = 0L;
        this.A0 = 0L;
        this.B0 = 0L;
        this.C0 = 0.0d;
        this.D0 = 0L;
        this.E0 = 0L;
        this.F0 = 0L;
        this.G0 = 0L;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
    }

    public final aa.a F(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        Range[] rangeArr;
        Range[] rangeArr2;
        Size[] sizeArr2 = sizeArr;
        Range[] rangeArr3 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        n nVar = this.j;
        o0 o0Var = this.h;
        o0 o0Var2 = o0.b;
        if (o0Var == o0Var2 || this.e0) {
            Range u10 = u(rangeArr3, 30);
            StringBuilder w10 = a1.g.w("fps selection: id=", str, ", requested=");
            w10.append(o0Var.a);
            w10.append(", mode=REGULAR, range=");
            w10.append(u10);
            w10.append(this.e0 ? ", reason=session-wide fallback" : "");
            nVar.b(w10.toString());
            return new aa.a(o0Var2, u10, lVar, false, 27);
        }
        int i10 = o0Var.a;
        Range u11 = u(rangeArr3, i10);
        if (u11 != null) {
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
                j6.l i13 = i(sizeArr3, this.d, this.g);
                nVar.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + u11 + ", compatibleSizes=" + Arrays.toString(sizeArr3));
                return new aa.a(o0.c, u11, i13, false, 27);
            } catch (RuntimeException unused) {
                nVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr3));
            }
        } else {
            rangeArr = rangeArr3;
            nVar.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
        }
        Range u12 = u(rangeArr, 30);
        nVar.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + u12);
        return new aa.a(o0Var2, u12, lVar, false, 27);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cb, code lost:
    
        if ((r31 == r8 && r6.equals(r4.get(r9)) && !r6.equals(((android.hardware.camera2.CameraCharacteristics) r14.b).get(r9))) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fa, code lost:
    
        if ((r31 == r8 && r6.equals(r4.get(r9)) && !r6.equals(((android.hardware.camera2.CameraCharacteristics) r15.b).get(r9))) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0312 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(m0 m0Var) {
        m0 m0Var2;
        float floatValue;
        long outputMinFrameDuration;
        StreamConfigurationMap streamConfigurationMap;
        String str;
        long outputMinFrameDuration2;
        String str2;
        int i10;
        i h;
        CameraCharacteristics.Key key;
        int i11;
        int i12;
        String[] strArr;
        int i13;
        u5 u5Var;
        String str3;
        String str4;
        aa.a F;
        u5 u5Var2;
        n nVar;
        StringBuilder sb2;
        Boolean bool;
        CameraCharacteristics.Key key2;
        o0 o0Var;
        m0 m0Var3 = m0.b;
        m0 m0Var4 = m0.a;
        i iVar = m0Var == m0Var4 ? this.f0 : this.g0;
        String str5 = ", facing=";
        if (iVar != null) {
            d(iVar);
            this.j.b("camera outputs restored from cache: id=" + iVar.a + ", facing=" + m0Var + ", preview=" + iVar.d + ", recording=" + iVar.e + ", fps=" + iVar.h.a);
            return;
        }
        boolean z10 = true;
        if (!this.d0) {
            this.d0 = true;
            if (this.h == o0.c) {
                boolean N = N(m0Var4);
                boolean N2 = N(m0Var3);
                this.e0 = (N && N2) ? false : true;
                n nVar2 = this.j;
                StringBuilder sb3 = new StringBuilder("60 fps session capability: front=");
                sb3.append(N);
                sb3.append(", back=");
                sb3.append(N2);
                sb3.append(", selected=");
                sb3.append(this.e0 ? 30 : 60);
                nVar2.b(sb3.toString());
            }
        }
        int i14 = m0Var == m0Var4 ? 0 : 1;
        String[] cameraIdList = this.b.getCameraIdList();
        int length = cameraIdList.length;
        u5 u5Var3 = null;
        u5 u5Var4 = null;
        int i15 = 0;
        while (true) {
            m0Var2 = m0Var4;
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
                u5Var = u5Var3;
            } else {
                StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                i12 = i15;
                if (streamConfigurationMap2 == null) {
                    this.j.b("camera candidate rejected: id=" + str6 + ", reason=no stream map");
                    i11 = i14;
                    u5Var = u5Var3;
                    strArr = strArr2;
                    i13 = i16;
                } else {
                    int i17 = i14;
                    Size[] outputSizes = streamConfigurationMap2.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        strArr = strArr2;
                        i13 = i16;
                        i11 = i17;
                        u5Var = u5Var3;
                        str3 = str5;
                        this.j.b("camera candidate rejected: id=" + str6 + ", reason=no SurfaceTexture outputs");
                    } else {
                        try {
                        } catch (RuntimeException e7) {
                            e = e7;
                            str4 = "camera candidate rejected: id=";
                            strArr = strArr2;
                            i13 = i16;
                            i11 = i17;
                        }
                        try {
                            j6.l i18 = i(outputSizes, this.d, this.g);
                            str4 = "camera candidate rejected: id=";
                            strArr = strArr2;
                            i13 = i16;
                            i11 = i17;
                            str6 = str6;
                            u5Var = u5Var3;
                            try {
                                F = F(str6, cameraCharacteristics, streamConfigurationMap2, outputSizes, i18);
                                try {
                                    u5Var2 = new u5(str6, cameraCharacteristics, outputSizes, i18, F);
                                    str6 = str6;
                                    nVar = this.j;
                                    sb2 = new StringBuilder();
                                    sb2.append("camera candidate accepted: id=");
                                    sb2.append(str6);
                                    sb2.append(str5);
                                    sb2.append(m0Var);
                                    sb2.append(", flashAvailable=");
                                    bool = Boolean.TRUE;
                                    key2 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                                    str3 = str5;
                                } catch (RuntimeException e10) {
                                    e = e10;
                                    str6 = str6;
                                    str3 = str5;
                                    this.j.b(str4 + str6 + ", reason=" + e);
                                    u5Var3 = u5Var;
                                    i15 = i12 + 1;
                                    m0Var4 = m0Var2;
                                    str5 = str3;
                                    i14 = i11;
                                    cameraIdList = strArr;
                                    length = i13;
                                    z10 = true;
                                }
                            } catch (RuntimeException e11) {
                                e = e11;
                            }
                            try {
                                sb2.append(bool.equals(cameraCharacteristics.get(key2)));
                                sb2.append(", fps=");
                                sb2.append(((o0) F.b).a);
                                sb2.append(", preview=");
                                sb2.append((Size) ((j6.l) F.d).b);
                                sb2.append(", recording=");
                                sb2.append((Size) ((j6.l) F.d).c);
                                nVar.b(sb2.toString());
                                if (u5Var4 != null) {
                                }
                                u5Var4 = u5Var2;
                                o0Var = this.h;
                            } catch (RuntimeException e12) {
                                e = e12;
                                this.j.b(str4 + str6 + ", reason=" + e);
                                u5Var3 = u5Var;
                                i15 = i12 + 1;
                                m0Var4 = m0Var2;
                                str5 = str3;
                                i14 = i11;
                                cameraIdList = strArr;
                                length = i13;
                                z10 = true;
                            }
                        } catch (RuntimeException e13) {
                            e = e13;
                            str4 = "camera candidate rejected: id=";
                            strArr = strArr2;
                            i13 = i16;
                            i11 = i17;
                            str6 = str6;
                            u5Var = u5Var3;
                            str3 = str5;
                            this.j.b(str4 + str6 + ", reason=" + e);
                            u5Var3 = u5Var;
                            i15 = i12 + 1;
                            m0Var4 = m0Var2;
                            str5 = str3;
                            i14 = i11;
                            cameraIdList = strArr;
                            length = i13;
                            z10 = true;
                        }
                        if (o0Var == o0.b || ((o0) F.b) == o0Var) {
                            if (u5Var != null) {
                            }
                            u5Var3 = u5Var2;
                            i15 = i12 + 1;
                            m0Var4 = m0Var2;
                            str5 = str3;
                            i14 = i11;
                            cameraIdList = strArr;
                            length = i13;
                            z10 = true;
                        }
                    }
                    u5Var3 = u5Var;
                    i15 = i12 + 1;
                    m0Var4 = m0Var2;
                    str5 = str3;
                    i14 = i11;
                    cameraIdList = strArr;
                    length = i13;
                    z10 = true;
                }
            }
            str3 = str5;
            u5Var3 = u5Var;
            i15 = i12 + 1;
            m0Var4 = m0Var2;
            str5 = str3;
            i14 = i11;
            cameraIdList = strArr;
            length = i13;
            z10 = true;
        }
        u5 u5Var5 = u5Var3;
        String str7 = str5;
        u5 u5Var6 = u5Var5 == null ? u5Var4 : u5Var5;
        if (u5Var6 == null) {
            throw new IllegalStateException("Requested camera is not available");
        }
        String str8 = (String) u5Var6.a;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) u5Var6.b;
        Size[] sizeArr = (Size[]) u5Var6.c;
        j6.l lVar = (j6.l) u5Var6.d;
        aa.a aVar = (aa.a) u5Var6.e;
        j6.l lVar2 = (j6.l) aVar.d;
        this.o = str8;
        this.E = m0Var;
        this.p = cameraCharacteristics2;
        this.G = (o0) aVar.b;
        this.H = (Range) aVar.c;
        this.c0 = false;
        this.I = lVar;
        D();
        this.q = (Size) lVar2.b;
        this.r = (Size) lVar2.c;
        this.s = lVar2.a;
        this.F = (n0) lVar2.d;
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 30) {
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
                    str = ", flashAvailable=";
                    outputMinFrameDuration2 = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size2);
                } catch (RuntimeException unused2) {
                }
                n nVar3 = this.j;
                String str9 = str;
                StringBuilder sb4 = new StringBuilder("camera outputs selected: output=");
                sb4.append(this.e);
                sb4.append("x");
                sb4.append(this.e);
                sb4.append(", cameraMode=");
                sb4.append(this.F);
                if (this.F != this.g) {
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
                sb4.append(this.G.a);
                sb4.append(", fpsRange=");
                sb4.append(this.H);
                sb4.append(", timestampSource=");
                sb4.append(v() ? "REALTIME" : "UNKNOWN");
                sb4.append(this.G != this.h ? a1.g.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
                nVar3.b(sb4.toString());
                if (m0Var == m0Var2) {
                    if (!this.a0) {
                        i10 = 1;
                        this.a0 = true;
                        Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                        Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                        int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                        Boolean bool2 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                        Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        n nVar4 = this.j;
                        StringBuilder sb5 = new StringBuilder("camera capabilities: id=");
                        sb5.append(str8);
                        sb5.append(str7);
                        sb5.append(m0Var);
                        sb5.append(", hardwareLevel=");
                        sb5.append(num2 != null ? "unknown" : num2.intValue() == 2 ? "LEGACY" : num2.intValue() == 0 ? "LIMITED" : num2.intValue() == i10 ? "FULL" : num2.intValue() == 3 ? "LEVEL_3" : (i19 < 28 || num2.intValue() != 4) ? String.valueOf(num2) : "EXTERNAL");
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
                        nVar4.b(sb5.toString());
                    }
                    h = h();
                    if (h.b != m0Var2) {
                        this.f0 = h;
                        return;
                    } else {
                        this.g0 = h;
                        return;
                    }
                }
                i10 = 1;
                if (!this.b0) {
                    this.b0 = true;
                    Integer num22 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    Integer num32 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                    Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                    int[] iArr2 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                    Boolean bool22 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    Rect rect2 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    n nVar42 = this.j;
                    StringBuilder sb52 = new StringBuilder("camera capabilities: id=");
                    sb52.append(str8);
                    sb52.append(str7);
                    sb52.append(m0Var);
                    sb52.append(", hardwareLevel=");
                    sb52.append(num22 != null ? "unknown" : num22.intValue() == 2 ? "LEGACY" : num22.intValue() == 0 ? "LIMITED" : num22.intValue() == i10 ? "FULL" : num22.intValue() == 3 ? "LEVEL_3" : (i19 < 28 || num22.intValue() != 4) ? String.valueOf(num22) : "EXTERNAL");
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
                    nVar42.b(sb52.toString());
                }
                h = h();
                if (h.b != m0Var2) {
                }
            }
            str = ", flashAvailable=";
            outputMinFrameDuration2 = -1;
            n nVar32 = this.j;
            String str92 = str;
            StringBuilder sb42 = new StringBuilder("camera outputs selected: output=");
            sb42.append(this.e);
            sb42.append("x");
            sb42.append(this.e);
            sb42.append(", cameraMode=");
            sb42.append(this.F);
            if (this.F != this.g) {
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
            sb42.append(this.G.a);
            sb42.append(", fpsRange=");
            sb42.append(this.H);
            sb42.append(", timestampSource=");
            sb42.append(v() ? "REALTIME" : "UNKNOWN");
            sb42.append(this.G != this.h ? a1.g.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
            nVar32.b(sb42.toString());
            if (m0Var == m0Var2) {
            }
        }
        outputMinFrameDuration = -1;
        Size size22 = this.r;
        streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
        }
        str = ", flashAvailable=";
        outputMinFrameDuration2 = -1;
        n nVar322 = this.j;
        String str922 = str;
        StringBuilder sb422 = new StringBuilder("camera outputs selected: output=");
        sb422.append(this.e);
        sb422.append("x");
        sb422.append(this.e);
        sb422.append(", cameraMode=");
        sb422.append(this.F);
        if (this.F != this.g) {
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
        sb422.append(this.G.a);
        sb422.append(", fpsRange=");
        sb422.append(this.H);
        sb422.append(", timestampSource=");
        sb422.append(v() ? "REALTIME" : "UNKNOWN");
        sb422.append(this.G != this.h ? a1.g.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
        nVar322.b(sb422.toString());
        if (m0Var == m0Var2) {
        }
    }

    public final void H(boolean z10) {
        Handler handler = this.n;
        if (!this.S || handler == null) {
            return;
        }
        handler.post(new bi.f(9, this, z10));
    }

    public final boolean I(float f7) {
        this.K = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.n;
        if (!this.S || handler == null) {
            return false;
        }
        handler.removeCallbacks(this.b1);
        handler.post(this.b1);
        return true;
    }

    public final void L(u uVar, long j3, m0 m0Var) {
        if (this.m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
        this.B = uVar;
        this.J = j3;
        this.C = m0Var;
        this.S = true;
        this.Y = false;
        this.x = null;
        this.Z = true;
        this.s0 = SystemClock.elapsedRealtimeNanos();
        E();
        D();
        this.j.b("camera segment start: facing=" + m0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.c.isAvailable());
        this.c.setSurfaceTextureListener(this.c1);
        Handler handler = this.n;
        if (this.S && handler != null && this.c.isAvailable()) {
            handler.post(new a(this, 5));
        }
    }

    public final boolean M() {
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

    public final boolean N(m0 m0Var) {
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        int i10 = m0Var == m0.a ? 0 : 1;
        CameraManager cameraManager = this.b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((o0) F(str, cameraCharacteristics, streamConfigurationMap, outputSizes, i(outputSizes, this.d, this.g)).b) == o0.c) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(m0 m0Var) {
        m0 m0Var2;
        i iVar;
        if (!this.S || this.U || m0Var == this.D) {
            return;
        }
        this.U = true;
        this.W = true;
        this.M = false;
        this.N = false;
        this.K = 0.0f;
        xa.d dVar = this.k;
        ((t0) dVar.b).i.post(new i0(0, dVar, m0Var));
        this.v0 = SystemClock.elapsedRealtimeNanos();
        this.r0 = false;
        this.j.b("camera device switch started: from=" + this.D + ", to=" + m0Var);
        r rVar = this.v;
        if (rVar != null) {
            m0 m0Var3 = this.D;
            Handler handler = rVar.m;
            if (rVar.Z && handler != null) {
                m0Var2 = m0Var;
                handler.post(new i5(rVar, m0Var3, m0Var2, handler, 20));
                if (P(m0Var2)) {
                    if (!this.j0 || (iVar = this.m0) == null || iVar.b != m0Var2) {
                        n();
                        return;
                    } else {
                        this.n0 = m0Var2;
                        this.j.b("camera switch path: waiting for warm device open");
                        return;
                    }
                }
                return;
            }
        }
        m0Var2 = m0Var;
        if (P(m0Var2)) {
        }
    }

    public final boolean P(m0 m0Var) {
        CameraDevice cameraDevice = this.k0;
        i iVar = this.m0;
        if (cameraDevice == null || iVar == null || iVar.b != m0Var) {
            return false;
        }
        SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
        if (surfaceTexture == null) {
            r("preview SurfaceTexture unavailable", null);
            return false;
        }
        CameraDevice cameraDevice2 = this.y;
        m0 m0Var2 = this.D;
        i iVar2 = m0Var2 != null ? m0Var2 == m0.a ? this.f0 : this.g0 : null;
        m();
        this.k0 = cameraDevice2;
        this.m0 = iVar2;
        this.y = cameraDevice;
        d(iVar);
        surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
        r rVar = this.v;
        if (rVar != null) {
            rVar.j(this.r, this.s, v());
            Surface surface = this.v.o;
            if (surface == null) {
                throw new IllegalStateException("GL processor is not started");
            }
            this.u = surface;
        }
        this.r0 = true;
        n nVar = this.j;
        StringBuilder sb2 = new StringBuilder("camera switch path: warm device, targetId=");
        sb2.append(this.o);
        sb2.append(", standbyId=");
        sb2.append(cameraDevice2 == null ? "none" : cameraDevice2.getId());
        sb2.append(", preparationMs=");
        sb2.append(s(this.v0));
        nVar.b(sb2.toString());
        o();
        return true;
    }

    public final void Q() {
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
    public final void c() {
        CameraCaptureSession cameraCaptureSession = this.z;
        if (!this.S || cameraCaptureSession == null || this.y == null) {
            return;
        }
        try {
            CaptureRequest.Builder q6 = q(false);
            this.A = q6;
            CameraCaptureSession cameraCaptureSession2 = this.z;
            if (cameraCaptureSession2 != null) {
                cameraCaptureSession2.setRepeatingRequest(q6.build(), this.g1, this.n);
            }
        } catch (CameraAccessException e7) {
            e = e7;
            if (this.G != o0.c) {
                t("60 fps updated request rejected", e);
            } else {
                C(e);
            }
        } catch (IllegalArgumentException e10) {
            e = e10;
            if (this.G != o0.c) {
            }
        } catch (IllegalStateException e11) {
            if (!this.S || this.Y || cameraCaptureSession != this.z) {
                this.j.b("stale repeating request rejection ignored: " + e11.getMessage());
                return;
            }
            this.j.b("repeating request rejected by closed camera; reopening device: " + e11.getMessage());
            m();
            CameraDevice cameraDevice = this.y;
            this.y = null;
            this.T = false;
            if (cameraDevice == null) {
                y();
            } else {
                this.V = true;
                cameraDevice.close();
            }
        }
    }

    public final void d(i iVar) {
        this.o = iVar.a;
        this.E = iVar.b;
        this.p = iVar.c;
        this.q = iVar.d;
        this.r = iVar.e;
        this.s = iVar.f;
        this.F = iVar.g;
        this.G = iVar.h;
        this.H = iVar.i;
        this.I = iVar.j;
        this.L = iVar.k;
        this.c0 = false;
        D();
    }

    public final void g() {
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacks(this.a1);
        }
        this.x = null;
    }

    public final i h() {
        return new i(this.o, this.E, this.p, this.q, this.r, this.s, this.F, this.G, this.H, this.I, this.L);
    }

    public final void l() {
        g();
        this.T = false;
        this.U = false;
        this.V = false;
        this.Z = false;
        this.W = false;
        this.X = false;
        this.A = null;
        this.N = false;
        this.n0 = null;
        this.j0 = false;
        m();
        CameraDevice cameraDevice = this.y;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.y = null;
        }
        CameraDevice cameraDevice2 = this.k0;
        this.k0 = null;
        this.m0 = null;
        if (cameraDevice2 != null) {
            cameraDevice2.close();
        }
        CameraDevice cameraDevice3 = this.l0;
        this.l0 = null;
        if (cameraDevice3 != null && cameraDevice3 != cameraDevice2) {
            cameraDevice3.close();
        }
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        r rVar = this.v;
        if (rVar != null) {
            rVar.h();
            this.v = null;
        }
        this.u = null;
    }

    public final void m() {
        CameraCaptureSession cameraCaptureSession = this.z;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.z = null;
        }
        this.A = null;
    }

    public final void n() {
        this.n0 = null;
        this.r0 = false;
        this.j.b("camera switch path: sequential".concat(this.h0 ? ", reason=warm device not ready" : ", reason=concurrent pair unavailable"));
        m();
        CameraDevice cameraDevice = this.y;
        if (cameraDevice != null) {
            this.y = null;
            this.p0 = SystemClock.elapsedRealtimeNanos();
            cameraDevice.close();
        } else {
            if (this.T) {
                return;
            }
            this.U = false;
            y();
        }
    }

    public final void o() {
        CameraDevice cameraDevice = this.y;
        if (cameraDevice == null || this.t == null || this.u == null) {
            return;
        }
        try {
            this.u0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("capture session requested: preview=" + this.q + ", recording=" + this.r + ", fpsRange=" + this.H);
            cameraDevice.createCaptureSession(Arrays.asList(this.t, this.u), this.f1, this.n);
        } catch (CameraAccessException | IllegalArgumentException e7) {
            if (this.k0 == null || this.i0) {
                if (this.G == o0.c) {
                    t("60 fps session creation rejected", e7);
                    return;
                } else {
                    C(e7);
                    return;
                }
            }
            this.j.b("camera session request failed with warm device open; retrying with standby device closed: " + e7);
            if (this.U) {
                this.r0 = false;
            }
            r("session request failed", e7);
            o();
        }
    }

    public final void p() {
        Surface surface;
        Surface surface2;
        u uVar = this.B;
        long j3 = this.J;
        int i10 = this.e;
        int i11 = this.f;
        int i12 = this.G.a;
        n nVar = this.j;
        xa.d dVar = this.k;
        Objects.requireNonNull(dVar);
        m mVar = new m(uVar, j3, i10, i11, i12, nVar, new b(dVar));
        this.w = mVar;
        synchronized (mVar) {
            if (mVar.y) {
                surface = mVar.p;
            } else {
                mVar.m();
                long nanoTime = System.nanoTime();
                try {
                    mVar.b();
                    mVar.a();
                    mVar.m.start();
                    mVar.y = true;
                    mVar.f.b("codecs prepared: video=" + mVar.m.getName() + ", audio=" + mVar.n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = mVar.p;
                } catch (IOException | RuntimeException e7) {
                    mVar.j();
                    throw e7;
                }
            }
        }
        Surface surface3 = surface;
        Size size = this.r;
        int i13 = this.e;
        int i14 = this.s;
        boolean v = v();
        boolean z10 = this.i;
        n nVar2 = this.j;
        m mVar2 = this.w;
        xa.d dVar2 = this.k;
        Objects.requireNonNull(dVar2);
        r rVar = new r(size, surface3, i13, i14, v, z10, nVar2, mVar2, new b(dVar2));
        this.v = rVar;
        rVar.b0 = new a(this, 1);
        r rVar2 = this.v;
        if (rVar2.Z) {
            surface2 = rVar2.o;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            rVar2.l = handlerThread;
            handlerThread.start();
            rVar2.Y = System.nanoTime();
            n nVar3 = rVar2.e;
            StringBuilder sb2 = new StringBuilder("GL processor start requested: input=");
            sb2.append(rVar2.a);
            sb2.append(", crop=");
            sb2.append(rVar2.f);
            sb2.append(", output=");
            sb2.append(rVar2.c);
            sb2.append("x");
            sb2.append(rVar2.c);
            sb2.append(", filter=");
            sb2.append(rVar2.f == rVar2.c ? "NEAREST" : "LINEAR");
            sb2.append(", composition=");
            sb2.append(rVar2.d);
            nVar3.b(sb2.toString());
            Handler handler = new Handler(rVar2.l.getLooper());
            rVar2.m = handler;
            handler.post(new w1(29, rVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (rVar2.d0 != null) {
                    RuntimeException runtimeException = rVar2.d0;
                    rVar2.d0 = null;
                    rVar2.h();
                    throw runtimeException;
                }
                surface2 = rVar2.o;
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                rVar2.h();
                throw new IllegalStateException("GL initialization was interrupted", e10);
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
    public final CaptureRequest.Builder q(boolean z10) {
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
        n nVar = this.j;
        Range range2 = this.H;
        if (range2 != null) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
            if (z10) {
                nVar.b("capture FPS range selected: " + this.H);
            }
        } else if (z10) {
            nVar.b("capture FPS range unavailable; HAL default will be used");
        }
        float y3 = e2.y(this.L, 1.0f, this.K, 1.0f);
        if (Build.VERSION.SDK_INT >= 30) {
            CameraCharacteristics cameraCharacteristics2 = this.p;
            if (cameraCharacteristics2 == null) {
                range = null;
            } else {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) cameraCharacteristics2.get(key);
            }
            if (range != null) {
                createCaptureRequest.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), y3))));
                boolean z11 = !this.M && x();
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
                createCaptureRequest.set(key2, Integer.valueOf(z11 ? 2 : 0));
                if (this.N) {
                    this.j.b("torch request configured: requested=" + this.M + ", applied=" + z11 + ", aeMode=" + createCaptureRequest.get(CaptureRequest.CONTROL_AE_MODE) + ", flashMode=" + createCaptureRequest.get(key2) + ", cameraId=" + this.o);
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
            int max = Math.max(1, Math.round(rect.width() / y3));
            int max2 = Math.max(1, Math.round(rect.height() / y3));
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
        createCaptureRequest.set(key22, Integer.valueOf(z11 ? 2 : 0));
        if (this.N) {
        }
        int i122 = this.Q + 1;
        this.Q = i122;
        createCaptureRequest.setTag(Integer.valueOf(i122));
        if (this.N) {
        }
        return createCaptureRequest;
    }

    public final void r(String str, Exception exc) {
        String str2;
        this.i0 = true;
        this.h0 = false;
        StringBuilder sb2 = new StringBuilder("camera warm-switch disabled: reason=");
        sb2.append(str);
        if (exc == null) {
            str2 = "";
        } else {
            str2 = ", error=" + exc;
        }
        sb2.append(str2);
        this.j.b(sb2.toString());
        CameraDevice cameraDevice = this.k0;
        this.k0 = null;
        this.m0 = null;
        if (cameraDevice == null || cameraDevice == this.y) {
            return;
        }
        this.l0 = cameraDevice;
        cameraDevice.close();
    }

    public final void t(String str, Exception exc) {
        String str2;
        boolean z10;
        if (this.c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            C(exc);
            return;
        }
        this.c0 = true;
        m();
        j6.l lVar = this.I;
        if (lVar == null) {
            C(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.G = o0.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.H = u(cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES), 30);
        this.q = (Size) lVar.b;
        this.r = (Size) lVar.c;
        this.s = lVar.a;
        this.F = (n0) lVar.d;
        this.f0 = null;
        this.g0 = null;
        r("frame-rate fallback changed stream configuration", exc);
        SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
        }
        m mVar = this.w;
        if (mVar != null) {
            synchronized (mVar) {
                z10 = mVar.z;
            }
            if (z10) {
                C(new IllegalStateException("Unable to change encoder frame rate after recording started", exc));
                return;
            }
        }
        r rVar = this.v;
        if (rVar != null) {
            rVar.h();
            this.v = null;
        }
        m mVar2 = this.w;
        if (mVar2 != null) {
            mVar2.q();
            this.w = null;
        }
        this.u = null;
        try {
            p();
            D();
            n nVar = this.j;
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
            nVar.b(sb2.toString());
            Handler handler = this.n;
            if (!this.S || handler == null) {
                return;
            }
            handler.post(new a(this, 0));
        } catch (Exception e7) {
            C(e7);
        }
    }

    public final boolean v() {
        Integer num;
        CameraCharacteristics cameraCharacteristics = this.p;
        return (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) ? false : true;
    }

    public final boolean w(String str, String str2) {
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

    public final boolean x() {
        CameraCharacteristics cameraCharacteristics;
        return this.D == m0.b && (cameraCharacteristics = this.p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
    }

    public final void y() {
        if (this.S && !this.T && this.y == null) {
            if (f0.c.b(this.a, "android.permission.CAMERA") != 0) {
                C(new SecurityException("Camera permission is not granted"));
                return;
            }
            if (f0.c.b(this.a, "android.permission.RECORD_AUDIO") != 0) {
                C(new SecurityException("Audio recording permission is not granted"));
                return;
            }
            try {
                this.q0 = SystemClock.elapsedRealtimeNanos();
                G(this.C);
                long s10 = s(this.q0);
                if (this.y == null && this.w == null) {
                    A();
                }
                SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                if (surfaceTexture == null) {
                    return;
                }
                surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
                if (this.t == null) {
                    this.t = new Surface(surfaceTexture);
                }
                if (this.w == null) {
                    p();
                } else {
                    r rVar = this.v;
                    if (rVar != null) {
                        rVar.j(this.r, this.s, v());
                        Surface surface = this.v.o;
                        if (surface == null) {
                            throw new IllegalStateException("GL processor is not started");
                        }
                        this.u = surface;
                    }
                }
                z();
                this.T = true;
                this.t0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("camera open requested: id=" + this.o + ", preview=" + this.q + ", recording=" + this.r + ", crop=" + this.s + ", selectionElapsedMs=" + s10 + ", warmSwitch=" + this.h0);
                this.b.openCamera(this.o, this.d1, this.n);
            } catch (Exception e7) {
                this.T = false;
                C(e7);
            }
        }
    }

    public final void z() {
        boolean z10;
        CameraDevice cameraDevice;
        if (!this.h0 || this.i0 || (z10 = this.j0) || (cameraDevice = this.k0) != null) {
            return;
        }
        m0 m0Var = this.E;
        m0 m0Var2 = m0.a;
        i iVar = (m0Var == m0Var2 ? m0.b : m0Var2) == m0Var2 ? this.f0 : this.g0;
        if (iVar != null) {
            String str = iVar.a;
            if (z10 || cameraDevice != null) {
                return;
            }
            try {
                this.m0 = iVar;
                this.j0 = true;
                this.o0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("warm camera open requested: id=" + str + ", facing=" + iVar.b);
                this.b.openCamera(str, this.e1, this.n);
            } catch (Exception e7) {
                this.j0 = false;
                r("open request failed", e7);
            }
        }
    }
}
