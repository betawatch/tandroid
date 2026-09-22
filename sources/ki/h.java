package ki;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
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
import ci.g4;
import com.google.android.gms.internal.vision.e2;
import gg.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class h {
    public q A;
    public long A0;
    public i0 B;
    public long B0;
    public i0 C;
    public double C0;
    public i0 D;
    public long D0;
    public j0 E;
    public long E0;
    public k0 F;
    public long F0;
    public Range G;
    public long G0;
    public j6.l H;
    public long H0;
    public long I;
    public long I0;
    public float J;
    public long J0;
    public final g4 K0;
    public boolean L;
    public final b L0;
    public boolean M;
    public final c M0;
    public int N;
    public final d N0;
    public int O;
    public final e O0;
    public int P;
    public final f P0;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public volatile boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Context a;
    public boolean a0;
    public final CameraManager b;
    public boolean b0;
    public final TextureView c;
    public boolean c0;
    public final o0 d;
    public long d0;
    public final int e;
    public long e0;
    public final int f;
    public long f0;
    public final j0 g;
    public long g0;
    public final k0 h;
    public long h0;
    public final boolean i;
    public long i0;
    public final k j;
    public long j0;
    public final e0 k;
    public long k0;
    public long l0;
    public HandlerThread m;
    public long m0;
    public Handler n;
    public double n0;
    public String o;
    public long o0;
    public CameraCharacteristics p;
    public long p0;
    public Size q;
    public long q0;
    public Size r;
    public long r0;
    public int s;
    public long s0;
    public Surface t;
    public long t0;
    public Surface u;
    public long u0;
    public o v;
    public long v0;
    public j w;
    public long w0;
    public CameraDevice x;
    public long x0;
    public CameraCaptureSession y;
    public long y0;
    public CaptureRequest.Builder z;
    public long z0;
    public final Rect l = new Rect();
    public float K = 1.0f;

    public h(Context context, TextureView textureView, o0 o0Var, int i10, j0 j0Var, k0 k0Var, boolean z10, k kVar, e0 e0Var) {
        g4 g4Var = new g4(this, 2);
        this.K0 = g4Var;
        this.L0 = new b(this, 3);
        this.M0 = new c(this, 0);
        this.N0 = new d(this);
        this.O0 = new e(this);
        this.P0 = new f(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = textureView;
        this.d = o0Var;
        this.e = o0Var.a;
        this.f = i10;
        this.g = j0Var;
        this.h = k0Var;
        this.i = z10;
        this.j = kVar;
        this.k = e0Var;
        textureView.addOnLayoutChangeListener(g4Var);
    }

    public static int B(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public static float C(double d, long j3, long j10) {
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

    public static n4.y d(StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, int i10, j0 j0Var, int i11) {
        Range<Integer> range;
        Size size = null;
        Range<Integer> range2 = null;
        for (Size size2 : sizeArr) {
            if (r(size2, i10)) {
                try {
                    Range<Integer>[] highSpeedVideoFpsRangesFor = streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size2);
                    if (highSpeedVideoFpsRangesFor == null) {
                        range = null;
                    } else {
                        range = null;
                        for (Range<Integer> range3 : highSpeedVideoFpsRangesFor) {
                            if (range3.getUpper().intValue() == i11) {
                                try {
                                    if (range3.contains((Range<Integer>) Integer.valueOf(i11)) && (range == null || range3.getLower().intValue() > range.getLower().intValue())) {
                                        range = range3;
                                    }
                                } catch (RuntimeException unused) {
                                }
                            }
                        }
                    }
                    if (range != null && (size == null || b(size2) < b(size))) {
                        size = size2;
                        range2 = range;
                    }
                } catch (RuntimeException unused2) {
                }
            }
        }
        if (size == null || range2 == null) {
            return null;
        }
        return new n4.y(new j6.l(size, size, j0Var, i10), range2);
    }

    public static j6.l e(Size[] sizeArr, o0 o0Var, j0 j0Var) {
        int i10;
        j6.l g10;
        j0 j0Var2;
        j6.l g11;
        j0 j0Var3 = j0.c;
        if (j0Var == j0Var3) {
            i10 = o0Var.a;
        } else {
            o0 o0Var2 = o0.b;
            j0 j0Var4 = j0.a;
            if (o0Var == o0Var2) {
                if (j0Var == j0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (j0Var != j0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l g12 = g(sizeArr, i10, j0Var);
        if (g12 != null) {
            return g12;
        }
        if (o0Var == o0.c && j0Var == (j0Var2 = j0.b) && (g11 = g(sizeArr, 480, j0Var2)) != null) {
            return g11;
        }
        int i11 = o0Var.a;
        if (j0Var != j0Var3 && (g10 = g(sizeArr, i11, j0Var3)) != null) {
            return g10;
        }
        int i12 = o0Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (B(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || b(size2) < b(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (B(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && b(size3) < b(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(f(sizeArr, size), size, j0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size f(Size[] sizeArr, Size size) {
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(B(size2) - 720);
                if ((abs != abs2 ? Integer.compare(abs, abs2) : Long.compare(b(size3), b(size2))) < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.l g(Size[] sizeArr, int i10, j0 j0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            if (r(size, i10)) {
                Size f7 = f(sizeArr, size);
                j6.l lVar2 = new j6.l(f7, size, j0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.b;
                    int abs = Math.abs(Math.min(f7.getWidth(), f7.getHeight()) - 720);
                    Size size3 = (Size) lVar.c;
                    int abs2 = Math.abs(B(size2) - 720);
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

    public static boolean j(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String m(CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap) {
        if (Build.VERSION.SDK_INT < 23) {
            return "unavailable before API 23";
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (!j(iArr, 9)) {
            return "unsupported, capabilities=" + Arrays.toString(iArr);
        }
        try {
            Size[] highSpeedVideoSizes = streamConfigurationMap.getHighSpeedVideoSizes();
            StringBuilder sb2 = new StringBuilder("supported{");
            for (int i10 = 0; i10 < highSpeedVideoSizes.length; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                Size size = highSpeedVideoSizes[i10];
                sb2.append(size);
                sb2.append('=');
                sb2.append(Arrays.toString(streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size)));
            }
            sb2.append('}');
            return sb2.toString();
        } catch (RuntimeException e) {
            return "query failed: " + e;
        }
    }

    public static long n(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range p(Range[] rangeArr, int i10) {
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

    public static boolean r(Size size, int i10) {
        int i11 = ((i10 * 15) / 100) + i10;
        int min = Math.min(1920, i10 * 2);
        int B = B(size);
        return B >= i10 && B <= i11 && Math.max(size.getWidth(), size.getHeight()) <= min;
    }

    public final boolean A(float f7) {
        this.J = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.n;
        if (!this.R || handler == null) {
            return false;
        }
        b bVar = this.L0;
        handler.removeCallbacks(bVar);
        handler.post(bVar);
        return true;
    }

    public final void D(q qVar, long j3, i0 i0Var) {
        if (this.m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
        this.A = qVar;
        this.I = j3;
        this.B = i0Var;
        this.R = true;
        this.X = false;
        this.d0 = SystemClock.elapsedRealtimeNanos();
        w();
        v();
        StringBuilder sb2 = new StringBuilder("camera segment start: facing=");
        sb2.append(i0Var);
        sb2.append(", timelineOffsetUs=");
        sb2.append(j3);
        sb2.append(", textureAvailable=");
        TextureView textureView = this.c;
        sb2.append(textureView.isAvailable());
        this.j.b(sb2.toString());
        textureView.setSurfaceTextureListener(this.M0);
        Handler handler = this.n;
        if (this.R && handler != null && textureView.isAvailable()) {
            handler.post(new b(this, 4));
        }
    }

    public final boolean E() {
        Handler handler = this.n;
        if (!this.R || this.X || handler == null) {
            return false;
        }
        this.X = true;
        this.j.b("camera segment stop requested");
        handler.post(new b(this, 5));
        return true;
    }

    public final void F() {
        CameraCaptureSession cameraCaptureSession = this.y;
        CaptureRequest.Builder builder = this.z;
        if (cameraCaptureSession == null || builder == null) {
            return;
        }
        CaptureRequest build = builder.build();
        boolean z10 = this.b0;
        f fVar = this.P0;
        if (!z10 || Build.VERSION.SDK_INT < 23) {
            cameraCaptureSession.setRepeatingRequest(build, fVar, this.n);
            return;
        }
        List<CaptureRequest> createHighSpeedRequestList = ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(build);
        cameraCaptureSession.setRepeatingBurst(createHighSpeedRequestList, fVar, this.n);
        this.j.b("high-speed repeating burst submitted: requests=" + createHighSpeedRequestList.size() + ", fpsRange=" + this.G);
    }

    public final void G(i0 i0Var) {
        if (!this.R || this.T || i0Var == this.C) {
            return;
        }
        this.T = true;
        this.V = true;
        this.L = false;
        this.M = false;
        this.J = 0.0f;
        e0 e0Var = this.k;
        ((q0) e0Var.b).h.post(new l(1, e0Var, i0Var));
        this.g0 = SystemClock.elapsedRealtimeNanos();
        this.j.b("camera device switch started: from=" + this.C + ", to=" + i0Var);
        o oVar = this.v;
        if (oVar != null) {
            Handler handler = oVar.k;
            if (oVar.U && handler != null) {
                handler.post(new l(0, oVar, handler));
            }
        }
        i();
        CameraDevice cameraDevice = this.x;
        if (cameraDevice != null) {
            this.x = null;
            cameraDevice.close();
        } else {
            if (this.S) {
                return;
            }
            this.T = false;
            s();
        }
    }

    public final void H() {
        Integer num;
        Size size = this.r;
        if (size != null) {
            TextureView textureView = this.c;
            if (textureView.getWidth() == 0 || textureView.getHeight() == 0) {
                return;
            }
            int min = Math.min(this.s, Math.min(size.getWidth(), size.getHeight()));
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
            matrix.setScale(height, width, textureView.getWidth() * 0.5f, textureView.getHeight() * 0.5f);
            textureView.setTransform(matrix);
            this.j.b("preview transform: view=" + textureView.getWidth() + "x" + textureView.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + height + "x" + width);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        CameraCaptureSession cameraCaptureSession = this.y;
        if (!this.R || cameraCaptureSession == null || this.x == null) {
            return;
        }
        try {
            this.z = l(false);
            F();
        } catch (CameraAccessException e) {
            e = e;
            if (this.F != k0.c) {
                o("60 fps updated request rejected", e);
            } else {
                u(e);
            }
        } catch (IllegalArgumentException e7) {
            e = e7;
            if (this.F != k0.c) {
            }
        } catch (IllegalStateException e10) {
            boolean z10 = this.R;
            k kVar = this.j;
            if (!z10 || this.X || cameraCaptureSession != this.y) {
                kVar.b("stale repeating request rejection ignored: " + e10.getMessage());
                return;
            }
            kVar.b("repeating request rejected by closed camera; reopening device: " + e10.getMessage());
            i();
            CameraDevice cameraDevice = this.x;
            this.x = null;
            this.S = false;
            if (cameraDevice == null) {
                s();
            } else {
                this.U = true;
                cameraDevice.close();
            }
        }
    }

    public final void h() {
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.z = null;
        this.M = false;
        i();
        CameraDevice cameraDevice = this.x;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.x = null;
        }
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        o oVar = this.v;
        if (oVar != null) {
            oVar.h();
            this.v = null;
        }
        this.u = null;
    }

    public final void i() {
        CameraCaptureSession cameraCaptureSession = this.y;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.y = null;
        }
        this.z = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        CameraDevice cameraDevice = this.x;
        if (cameraDevice == null || this.t == null || this.u == null) {
            return;
        }
        try {
            this.f0 = SystemClock.elapsedRealtimeNanos();
            k kVar = this.j;
            StringBuilder sb2 = new StringBuilder("capture session requested: preview=");
            sb2.append(this.q);
            sb2.append(", recording=");
            sb2.append(this.r);
            sb2.append(", mode=");
            sb2.append(this.a0 ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
            sb2.append(", fpsRange=");
            sb2.append(this.G);
            kVar.b(sb2.toString());
            List<Surface> asList = Arrays.asList(this.t, this.u);
            boolean z10 = this.a0;
            e eVar = this.O0;
            if (!z10 || Build.VERSION.SDK_INT < 23) {
                cameraDevice.createCaptureSession(asList, eVar, this.n);
            } else {
                cameraDevice.createConstrainedHighSpeedCaptureSession(asList, eVar, this.n);
            }
        } catch (CameraAccessException e) {
            e = e;
            if (this.F != k0.c) {
                o("60 fps session creation rejected", e);
            } else {
                u(e);
            }
        } catch (IllegalArgumentException e7) {
            e = e7;
            if (this.F != k0.c) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CaptureRequest.Builder l(boolean z10) {
        CameraCharacteristics cameraCharacteristics;
        CameraCharacteristics.Key key;
        Range range;
        CameraDevice cameraDevice = this.x;
        if (cameraDevice == null || this.t == null || this.u == null) {
            throw new IllegalStateException("Camera request surfaces are unavailable");
        }
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(3);
        createCaptureRequest.addTarget(this.t);
        createCaptureRequest.addTarget(this.u);
        createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
        createCaptureRequest.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 3);
        CameraCharacteristics cameraCharacteristics2 = this.p;
        if (j(cameraCharacteristics2 == null ? null : (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES), 3)) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, 3);
        }
        Range range2 = this.G;
        k kVar = this.j;
        if (range2 != null) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
            if (z10) {
                kVar.b("capture FPS range selected: " + this.G);
            }
        } else if (z10) {
            kVar.b("capture FPS range unavailable; HAL default will be used");
        }
        float z11 = e2.z(this.K, 1.0f, this.J, 1.0f);
        if (Build.VERSION.SDK_INT >= 30) {
            CameraCharacteristics cameraCharacteristics3 = this.p;
            if (cameraCharacteristics3 == null) {
                range = null;
            } else {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) cameraCharacteristics3.get(key);
            }
            if (range != null) {
                createCaptureRequest.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), z11))));
                boolean z12 = !this.L && q();
                cameraCharacteristics = this.p;
                if (j(cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) : null, 1)) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                }
                CaptureRequest.Key key2 = CaptureRequest.FLASH_MODE;
                createCaptureRequest.set(key2, Integer.valueOf(z12 ? 2 : 0));
                if (this.M) {
                    kVar.b("torch request configured: requested=" + this.L + ", applied=" + z12 + ", aeMode=" + createCaptureRequest.get(CaptureRequest.CONTROL_AE_MODE) + ", flashMode=" + createCaptureRequest.get(key2) + ", cameraId=" + this.o);
                }
                int i10 = this.P + 1;
                this.P = i10;
                createCaptureRequest.setTag(Integer.valueOf(i10));
                if (this.M) {
                    this.Q = this.P;
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
            Rect rect2 = this.l;
            rect2.set(centerX, centerY, max + centerX, max2 + centerY);
            createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, rect2);
        }
        if (this.L) {
        }
        cameraCharacteristics = this.p;
        if (j(cameraCharacteristics != null ? (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES) : null, 1)) {
        }
        CaptureRequest.Key key22 = CaptureRequest.FLASH_MODE;
        createCaptureRequest.set(key22, Integer.valueOf(z12 ? 2 : 0));
        if (this.M) {
        }
        int i102 = this.P + 1;
        this.P = i102;
        createCaptureRequest.setTag(Integer.valueOf(i102));
        if (this.M) {
        }
        return createCaptureRequest;
    }

    public final void o(String str, Exception exc) {
        String str2;
        if (this.c0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            u(exc);
            return;
        }
        this.c0 = true;
        this.a0 = false;
        this.b0 = false;
        i();
        j6.l lVar = this.H;
        if (lVar == null) {
            u(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.F = k0.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.G = p(cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES), 30);
        this.q = (Size) lVar.b;
        this.r = (Size) lVar.c;
        this.s = lVar.a;
        this.E = (j0) lVar.d;
        SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
        }
        o oVar = this.v;
        if (oVar != null) {
            oVar.j(this.r, this.s);
            Surface surface = this.v.m;
            if (surface == null) {
                throw new IllegalStateException("GL processor is not started");
            }
            this.u = surface;
        }
        v();
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
        sb2.append(this.G);
        this.j.b(sb2.toString());
        Handler handler = this.n;
        if (!this.R || handler == null) {
            return;
        }
        handler.post(new b(this, 1));
    }

    public final boolean q() {
        CameraCharacteristics cameraCharacteristics;
        return this.C == i0.b && (cameraCharacteristics = this.p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
    }

    public final void s() {
        if (this.R && !this.S && this.x == null) {
            if (f0.e.b(this.a, "android.permission.CAMERA") != 0) {
                u(new SecurityException("Camera permission is not granted"));
                return;
            }
            try {
                y(this.B);
                SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                if (surfaceTexture == null) {
                    return;
                }
                surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
                if (this.t == null) {
                    this.t = new Surface(surfaceTexture);
                }
                if (this.w == null) {
                    q qVar = this.A;
                    long j3 = this.I;
                    int i10 = this.e;
                    int i11 = this.f;
                    int i12 = this.h.a;
                    k kVar = this.j;
                    e0 e0Var = this.k;
                    Objects.requireNonNull(e0Var);
                    j jVar = new j(qVar, j3, i10, i11, i12, kVar, new a(e0Var));
                    this.w = jVar;
                    Surface f7 = jVar.f();
                    Size size = this.r;
                    int i13 = this.e;
                    int i14 = this.s;
                    boolean z10 = this.i;
                    k kVar2 = this.j;
                    j jVar2 = this.w;
                    e0 e0Var2 = this.k;
                    Objects.requireNonNull(e0Var2);
                    o oVar = new o(size, f7, i13, i14, z10, kVar2, jVar2, new a(e0Var2));
                    this.v = oVar;
                    oVar.W = new b(this, 0);
                    this.u = this.v.g();
                } else {
                    o oVar2 = this.v;
                    if (oVar2 != null) {
                        oVar2.j(this.r, this.s);
                        Surface surface = this.v.m;
                        if (surface == null) {
                            throw new IllegalStateException("GL processor is not started");
                        }
                        this.u = surface;
                    }
                }
                this.S = true;
                this.e0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("camera open requested: id=" + this.o + ", preview=" + this.q + ", recording=" + this.r + ", crop=" + this.s);
                this.b.openCamera(this.o, this.N0, this.n);
            } catch (Exception e) {
                this.S = false;
                u(e);
            }
        }
    }

    public final void t() {
        this.R = false;
        TextureView textureView = this.c;
        textureView.setSurfaceTextureListener(null);
        textureView.removeOnLayoutChangeListener(this.K0);
        Handler handler = this.n;
        HandlerThread handlerThread = this.m;
        this.n = null;
        this.m = null;
        if (handler == null || handlerThread == null) {
            return;
        }
        handler.post(new x1(28, this, handlerThread));
    }

    public final void u(Exception exc) {
        this.j.a("camera error", exc);
        e0 e0Var = this.k;
        ((q0) e0Var.b).h.post(new l(2, e0Var, exc));
    }

    public final void v() {
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
    }

    public final void w() {
        this.h0 = 0L;
        this.i0 = 0L;
        this.j0 = 0L;
        this.k0 = 0L;
        this.l0 = 0L;
        this.m0 = 0L;
        this.n0 = 0.0d;
        this.o0 = 0L;
        this.p0 = 0L;
        this.q0 = 0L;
        this.r0 = 0L;
        this.s0 = 0L;
        this.t0 = 0L;
        this.u0 = 0L;
        this.v0 = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.firebase.messaging.m x(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        k0 k0Var;
        Size[] highSpeedVideoSizes;
        int i10;
        j0 j0Var;
        StreamConfigurationMap streamConfigurationMap2 = streamConfigurationMap;
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        k kVar = this.j;
        k0 k0Var2 = this.h;
        k0 k0Var3 = k0.b;
        if (k0Var2 == k0Var3) {
            Range p5 = p(rangeArr, 30);
            kVar.b("fps selection: id=" + str + ", requested=30, mode=REGULAR, range=" + p5);
            return new com.google.firebase.messaging.m(k0Var3, p5, lVar, false);
        }
        int i11 = k0Var2.a;
        Range p10 = p(rangeArr, i11);
        k0 k0Var4 = k0.c;
        j0 j0Var2 = this.g;
        o0 o0Var = this.d;
        if (p10 != null) {
            k0Var = k0Var3;
            ArrayList arrayList = new ArrayList(sizeArr.length);
            int length = sizeArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = i12;
                Size size = sizeArr[i13];
                int i14 = length;
                long outputMinFrameDuration = streamConfigurationMap2.getOutputMinFrameDuration(SurfaceTexture.class, size);
                if (outputMinFrameDuration <= 0 || outputMinFrameDuration <= 1000000000 / i11) {
                    arrayList.add(size);
                }
                i12 = i13 + 1;
                streamConfigurationMap2 = streamConfigurationMap;
                length = i14;
            }
            Size[] sizeArr2 = (Size[]) arrayList.toArray(new Size[0]);
            try {
                j6.l e = e(sizeArr2, o0Var, j0Var2);
                kVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + p10 + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                return new com.google.firebase.messaging.m(k0Var4, p10, e, false);
            } catch (RuntimeException unused) {
                kVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
            }
        } else {
            k0Var = k0Var3;
            kVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
        }
        n4.y yVar = null;
        if (Build.VERSION.SDK_INT >= 23 && j((int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES), 9)) {
            try {
                highSpeedVideoSizes = streamConfigurationMap.getHighSpeedVideoSizes();
            } catch (RuntimeException e7) {
                kVar.b("high-speed configuration query failed: " + e7);
            }
            if (highSpeedVideoSizes != null && highSpeedVideoSizes.length != 0) {
                j0 j0Var3 = j0.c;
                if (j0Var2 == j0Var3) {
                    i10 = o0Var.a;
                } else {
                    o0 o0Var2 = o0.b;
                    j0 j0Var4 = j0.a;
                    if (o0Var == o0Var2) {
                        if (j0Var2 == j0Var4) {
                            i10 = 960;
                        }
                        i10 = 720;
                    } else {
                        if (j0Var2 != j0Var4) {
                            i10 = 540;
                        }
                        i10 = 720;
                    }
                }
                n4.y d = d(streamConfigurationMap, highSpeedVideoSizes, i10, j0Var2, i11);
                if (d != null || (o0Var == o0.c && j0Var2 == (j0Var = j0.b) && (d = d(streamConfigurationMap, highSpeedVideoSizes, 480, j0Var, i11)) != null)) {
                    yVar = d;
                } else if (j0Var2 != j0Var3) {
                    yVar = d(streamConfigurationMap, highSpeedVideoSizes, o0Var.a, j0Var3, i11);
                }
                if (yVar != null) {
                    Range p11 = p(rangeArr, 30);
                    kVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + p11 + ", highSpeed=" + m(cameraCharacteristics, streamConfigurationMap));
                    return new com.google.firebase.messaging.m(k0Var, p11, lVar, false);
                }
                j6.l lVar2 = (j6.l) yVar.a;
                Range range = (Range) yVar.b;
                kVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=CONSTRAINED_HIGH_SPEED, range=" + range + ", size=" + ((Size) lVar2.c));
                return new com.google.firebase.messaging.m(k0Var4, range, lVar2, true);
            }
        }
        if (yVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x013a, code lost:
    
        if ((r31 == r0 && r6.equals(r4.get(r8)) && !r6.equals(((android.hardware.camera2.CameraCharacteristics) r12.b).get(r8))) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0167, code lost:
    
        if ((r31 == r0 && r6.equals(r4.get(r8)) && !r6.equals(((android.hardware.camera2.CameraCharacteristics) r15.b).get(r8))) != false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(i0 i0Var) {
        k0 k0Var;
        cf.c cVar;
        j0 j0Var;
        i0 i0Var2;
        k kVar;
        float floatValue;
        String str;
        long j3;
        StreamConfigurationMap streamConfigurationMap;
        String str2;
        CameraCharacteristics.Key key;
        int i10;
        int i11;
        CameraManager cameraManager;
        int i12;
        cf.c cVar2;
        String str3;
        String str4;
        j6.l e;
        com.google.firebase.messaging.m x10;
        i0 i0Var3 = i0.a;
        int i13 = i0Var == i0Var3 ? 0 : 1;
        CameraManager cameraManager2 = this.b;
        String[] cameraIdList = cameraManager2.getCameraIdList();
        int length = cameraIdList.length;
        cf.c cVar3 = null;
        cf.c cVar4 = null;
        int i14 = 0;
        while (true) {
            String[] strArr = cameraIdList;
            k0Var = this.h;
            cVar = cVar3;
            j0Var = this.g;
            i0Var2 = i0Var3;
            kVar = this.j;
            if (i14 >= length) {
                break;
            }
            int i15 = i14;
            String str5 = strArr[i15];
            CameraCharacteristics cameraCharacteristics = cameraManager2.getCameraCharacteristics(str5);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num == null || num.intValue() != i13) {
                i10 = i13;
            } else {
                StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                i10 = i13;
                if (streamConfigurationMap2 == null) {
                    kVar.b("camera candidate rejected: id=" + str5 + ", reason=no stream map");
                } else {
                    Size[] outputSizes = streamConfigurationMap2.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        cameraManager = cameraManager2;
                        i11 = length;
                        cVar2 = cVar;
                        i12 = i15;
                        kVar.b("camera candidate rejected: id=" + str5 + ", reason=no SurfaceTexture outputs");
                    } else {
                        try {
                            e = e(outputSizes, this.d, j0Var);
                            str3 = "camera candidate rejected: id=";
                            cameraManager = cameraManager2;
                            i11 = length;
                            cVar2 = cVar;
                            i12 = i15;
                            str4 = str5;
                            try {
                                x10 = x(str4, cameraCharacteristics, streamConfigurationMap2, outputSizes, e);
                            } catch (RuntimeException e7) {
                                e = e7;
                            }
                        } catch (RuntimeException e10) {
                            e = e10;
                            str3 = "camera candidate rejected: id=";
                            cameraManager = cameraManager2;
                            i11 = length;
                            cVar2 = cVar;
                            i12 = i15;
                            str4 = str5;
                        }
                        try {
                            cf.c cVar5 = new cf.c(str4, cameraCharacteristics, outputSizes, e, x10);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("camera candidate accepted: id=");
                            sb2.append(str4);
                            sb2.append(", facing=");
                            sb2.append(i0Var);
                            sb2.append(", flashAvailable=");
                            Boolean bool = Boolean.TRUE;
                            CameraCharacteristics.Key key2 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                            sb2.append(bool.equals(cameraCharacteristics.get(key2)));
                            sb2.append(", fps=");
                            sb2.append(((k0) x10.b).a);
                            sb2.append(", preview=");
                            sb2.append((Size) ((j6.l) x10.d).b);
                            sb2.append(", recording=");
                            sb2.append((Size) ((j6.l) x10.d).c);
                            kVar.b(sb2.toString());
                            i0 i0Var4 = i0.b;
                            if (cVar2 != null) {
                            }
                            cVar2 = cVar5;
                            if (k0Var == k0.b || ((k0) x10.b) == k0Var) {
                                if (cVar4 != null) {
                                }
                                cVar4 = cVar5;
                            }
                        } catch (RuntimeException e11) {
                            e = e11;
                            str4 = str4;
                            kVar.b(str3 + str4 + ", reason=" + e);
                            cVar3 = cVar2;
                            i14 = i12 + 1;
                            cameraIdList = strArr;
                            i0Var3 = i0Var2;
                            i13 = i10;
                            cameraManager2 = cameraManager;
                            length = i11;
                        }
                    }
                    cVar3 = cVar2;
                    i14 = i12 + 1;
                    cameraIdList = strArr;
                    i0Var3 = i0Var2;
                    i13 = i10;
                    cameraManager2 = cameraManager;
                    length = i11;
                }
            }
            cameraManager = cameraManager2;
            i11 = length;
            cVar2 = cVar;
            i12 = i15;
            cVar3 = cVar2;
            i14 = i12 + 1;
            cameraIdList = strArr;
            i0Var3 = i0Var2;
            i13 = i10;
            cameraManager2 = cameraManager;
            length = i11;
        }
        if (cVar4 == null) {
            cVar4 = cVar;
        }
        if (cVar4 == null) {
            throw new IllegalStateException("Requested camera is not available");
        }
        String str6 = (String) cVar4.a;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) cVar4.b;
        Size[] sizeArr = (Size[]) cVar4.c;
        j6.l lVar = (j6.l) cVar4.d;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) cVar4.e;
        j6.l lVar2 = (j6.l) mVar.d;
        this.o = str6;
        this.D = i0Var;
        this.p = cameraCharacteristics2;
        this.F = (k0) mVar.b;
        this.G = (Range) mVar.c;
        this.a0 = mVar.a;
        this.b0 = false;
        this.c0 = false;
        this.H = lVar;
        v();
        this.q = (Size) lVar2.b;
        this.r = (Size) lVar2.c;
        this.s = lVar2.a;
        this.E = (j0) lVar2.d;
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 30) {
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
        this.K = Math.max(1.0f, Math.min(4.0f, floatValue));
        Size size = this.q;
        StreamConfigurationMap streamConfigurationMap3 = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        long j10 = -1;
        if (streamConfigurationMap3 != null) {
            try {
                long outputMinFrameDuration = streamConfigurationMap3.getOutputMinFrameDuration(SurfaceTexture.class, size);
                str = ", facing=";
                j3 = outputMinFrameDuration;
            } catch (RuntimeException unused) {
            }
            Size size2 = this.r;
            String str7 = str;
            streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                try {
                    j10 = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size2);
                } catch (RuntimeException unused2) {
                }
            }
            long j11 = j10;
            int i17 = this.e;
            StringBuilder l4 = hg.k0.l("camera outputs selected: output=", i17, "x", i17, ", cameraMode=");
            l4.append(this.E);
            if (this.E == j0Var) {
                str2 = " (fallback from " + j0Var + ")";
            } else {
                str2 = "";
            }
            l4.append(str2);
            l4.append(", crop=");
            l4.append(this.s);
            l4.append(", preview=");
            l4.append(this.q);
            l4.append(", recording=");
            l4.append(this.r);
            l4.append(", previewMinFrameDurationNs=");
            l4.append(j3);
            l4.append(", recordingMinFrameDurationNs=");
            l4.append(j11);
            l4.append(", fps=");
            l4.append(this.F.a);
            l4.append(", fpsRange=");
            l4.append(this.G);
            l4.append(", sessionMode=");
            l4.append(!this.a0 ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
            l4.append(this.F == k0Var ? a4.a.n(k0Var.a, ")", new StringBuilder(" (fallback from ")) : "");
            kVar.b(l4.toString());
            if (i0Var != i0Var2) {
                if (this.Y) {
                    return;
                } else {
                    this.Y = true;
                }
            } else if (this.Z) {
                return;
            } else {
                this.Z = true;
            }
            Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
            Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            int[] iArr2 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            Boolean bool2 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
            StreamConfigurationMap streamConfigurationMap4 = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            StringBuilder sb3 = new StringBuilder("camera capabilities: id=");
            sb3.append(str6);
            sb3.append(str7);
            sb3.append(i0Var);
            sb3.append(", hardwareLevel=");
            sb3.append(num2 != null ? "unknown" : num2.intValue() == 2 ? "LEGACY" : num2.intValue() == 0 ? "LIMITED" : num2.intValue() == 1 ? "FULL" : num2.intValue() == 3 ? "LEVEL_3" : (i16 < 28 || num2.intValue() != 4) ? String.valueOf(num2) : "EXTERNAL");
            sb3.append(", sensorOrientation=");
            sb3.append(num3);
            sb3.append(", activeArray=");
            sb3.append(rect);
            sb3.append(", capabilities=");
            sb3.append(Arrays.toString(iArr));
            sb3.append(", flashAvailable=");
            sb3.append(bool2);
            sb3.append(", aeModes=");
            sb3.append(Arrays.toString(iArr2));
            sb3.append(", fpsRanges=");
            sb3.append(Arrays.toString(rangeArr));
            sb3.append(", outputSizes=");
            sb3.append(Arrays.toString(sizeArr));
            sb3.append(", highSpeed=");
            sb3.append(streamConfigurationMap4 != null ? "no stream map" : m(cameraCharacteristics2, streamConfigurationMap4));
            kVar.b(sb3.toString());
        }
        str = ", facing=";
        j3 = -1;
        Size size22 = this.r;
        String str72 = str;
        streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
        }
        long j112 = j10;
        int i172 = this.e;
        StringBuilder l42 = hg.k0.l("camera outputs selected: output=", i172, "x", i172, ", cameraMode=");
        l42.append(this.E);
        if (this.E == j0Var) {
        }
        l42.append(str2);
        l42.append(", crop=");
        l42.append(this.s);
        l42.append(", preview=");
        l42.append(this.q);
        l42.append(", recording=");
        l42.append(this.r);
        l42.append(", previewMinFrameDurationNs=");
        l42.append(j3);
        l42.append(", recordingMinFrameDurationNs=");
        l42.append(j112);
        l42.append(", fps=");
        l42.append(this.F.a);
        l42.append(", fpsRange=");
        l42.append(this.G);
        l42.append(", sessionMode=");
        l42.append(!this.a0 ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
        l42.append(this.F == k0Var ? a4.a.n(k0Var.a, ")", new StringBuilder(" (fallback from ")) : "");
        kVar.b(l42.toString());
        if (i0Var != i0Var2) {
        }
        Integer num22 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Integer num32 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int[] iArr3 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        int[] iArr22 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        Boolean bool22 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        StreamConfigurationMap streamConfigurationMap42 = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        Rect rect2 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder sb32 = new StringBuilder("camera capabilities: id=");
        sb32.append(str6);
        sb32.append(str72);
        sb32.append(i0Var);
        sb32.append(", hardwareLevel=");
        sb32.append(num22 != null ? "unknown" : num22.intValue() == 2 ? "LEGACY" : num22.intValue() == 0 ? "LIMITED" : num22.intValue() == 1 ? "FULL" : num22.intValue() == 3 ? "LEVEL_3" : (i16 < 28 || num22.intValue() != 4) ? String.valueOf(num22) : "EXTERNAL");
        sb32.append(", sensorOrientation=");
        sb32.append(num32);
        sb32.append(", activeArray=");
        sb32.append(rect2);
        sb32.append(", capabilities=");
        sb32.append(Arrays.toString(iArr3));
        sb32.append(", flashAvailable=");
        sb32.append(bool22);
        sb32.append(", aeModes=");
        sb32.append(Arrays.toString(iArr22));
        sb32.append(", fpsRanges=");
        sb32.append(Arrays.toString(rangeArr2));
        sb32.append(", outputSizes=");
        sb32.append(Arrays.toString(sizeArr));
        sb32.append(", highSpeed=");
        sb32.append(streamConfigurationMap42 != null ? "no stream map" : m(cameraCharacteristics2, streamConfigurationMap42));
        kVar.b(sb32.toString());
    }

    public final void z(boolean z10) {
        Handler handler = this.n;
        if (!this.R || handler == null) {
            return;
        }
        handler.post(new bi.f(8, this, z10));
    }
}
