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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class h {
    public q A;
    public h0 B;
    public h0 C;
    public h0 D;
    public i0 E;
    public j0 F;
    public Range G;
    public j6.l H;
    public long I;
    public float J;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public volatile boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public long X;
    public long Y;
    public long Z;
    public final Context a;
    public long a0;
    public final CameraManager b;
    public long b0;
    public final TextureView c;
    public long c0;
    public final m0 d;
    public long d0;
    public final int e;
    public long e0;
    public final int f;
    public long f0;
    public final i0 g;
    public final g4 g0;
    public final j0 h;
    public final b h0;
    public final boolean i;
    public final c i0;
    public final k j;
    public final d j0;
    public final k2.u k;
    public final e k0;
    public final f l0;
    public HandlerThread m;
    public Handler n;
    public String o;
    public CameraCharacteristics p;
    public Size q;
    public Size r;
    public int s;
    public Surface t;
    public Surface u;
    public o v;
    public j w;
    public CameraDevice x;
    public CameraCaptureSession y;
    public CaptureRequest.Builder z;
    public final Rect l = new Rect();
    public float K = 1.0f;

    public h(Context context, TextureView textureView, m0 m0Var, int i10, i0 i0Var, j0 j0Var, boolean z10, k kVar, k2.u uVar) {
        g4 g4Var = new g4(this, 2);
        this.g0 = g4Var;
        this.h0 = new b(this, 3);
        this.i0 = new c(this, 0);
        this.j0 = new d(this);
        this.k0 = new e(this);
        this.l0 = new f(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = textureView;
        this.d = m0Var;
        this.e = m0Var.a;
        this.f = i10;
        this.g = i0Var;
        this.h = j0Var;
        this.i = z10;
        this.j = kVar;
        this.k = uVar;
        textureView.addOnLayoutChangeListener(g4Var);
    }

    public static long c(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static n4.y d(StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, int i10, i0 i0Var, int i11) {
        Range<Integer> range;
        Size size = null;
        Range<Integer> range2 = null;
        for (Size size2 : sizeArr) {
            if (p(size2, i10)) {
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
                    if (range != null && (size == null || c(size2) < c(size))) {
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
        return new n4.y(new j6.l(size, size, i0Var, i10), range2);
    }

    public static j6.l e(Size[] sizeArr, m0 m0Var, i0 i0Var) {
        int i10;
        j6.l g10;
        i0 i0Var2;
        j6.l g11;
        i0 i0Var3 = i0.c;
        if (i0Var == i0Var3) {
            i10 = m0Var.a;
        } else {
            m0 m0Var2 = m0.b;
            i0 i0Var4 = i0.a;
            if (m0Var == m0Var2) {
                if (i0Var == i0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (i0Var != i0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l g12 = g(sizeArr, i10, i0Var);
        if (g12 != null) {
            return g12;
        }
        if (m0Var == m0.c && i0Var == (i0Var2 = i0.b) && (g11 = g(sizeArr, 480, i0Var2)) != null) {
            return g11;
        }
        int i11 = m0Var.a;
        if (i0Var != i0Var3 && (g10 = g(sizeArr, i11, i0Var3)) != null) {
            return g10;
        }
        int i12 = m0Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (x(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || c(size2) < c(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (x(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && c(size3) < c(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(f(sizeArr, size), size, i0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size f(Size[] sizeArr, Size size) {
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(x(size2) - 720);
                if ((abs != abs2 ? Integer.compare(abs, abs2) : Long.compare(c(size3), c(size2))) < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.l g(Size[] sizeArr, int i10, i0 i0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            if (p(size, i10)) {
                Size f7 = f(sizeArr, size);
                j6.l lVar2 = new j6.l(f7, size, i0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.b;
                    int abs = Math.abs(Math.min(f7.getWidth(), f7.getHeight()) - 720);
                    Size size3 = (Size) lVar.c;
                    int abs2 = Math.abs(x(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long c10 = c(size) + c(f7);
                        long c11 = c(size3) + c(size2);
                        compare = c10 != c11 ? Long.compare(c10, c11) : Long.compare(c(size), c(size3));
                    }
                    if (compare >= 0) {
                    }
                }
                lVar = lVar2;
            }
        }
        return lVar;
    }

    public static boolean i(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String k(CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap) {
        if (Build.VERSION.SDK_INT < 23) {
            return "unavailable before API 23";
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (!i(iArr, 9)) {
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

    public static long l(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static Range n(Range[] rangeArr, int i10) {
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

    public static boolean p(Size size, int i10) {
        int i11 = ((i10 * 15) / 100) + i10;
        int min = Math.min(1920, i10 * 2);
        int x10 = x(size);
        return x10 >= i10 && x10 <= i11 && Math.max(size.getWidth(), size.getHeight()) <= min;
    }

    public static int x(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public final void A() {
        CameraCaptureSession cameraCaptureSession = this.y;
        CaptureRequest.Builder builder = this.z;
        if (cameraCaptureSession == null || builder == null) {
            return;
        }
        CaptureRequest build = builder.build();
        boolean z10 = this.V;
        f fVar = this.l0;
        if (!z10 || Build.VERSION.SDK_INT < 23) {
            cameraCaptureSession.setRepeatingRequest(build, fVar, this.n);
            return;
        }
        List<CaptureRequest> createHighSpeedRequestList = ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(build);
        cameraCaptureSession.setRepeatingBurst(createHighSpeedRequestList, fVar, this.n);
        this.j.b("high-speed repeating burst submitted: requests=" + createHighSpeedRequestList.size() + ", fpsRange=" + this.G);
    }

    public final void B(h0 h0Var) {
        if (!this.M || this.O || h0Var == this.C) {
            return;
        }
        this.O = true;
        this.P = true;
        this.L = false;
        this.J = 0.0f;
        k2.u uVar = this.k;
        ((o0) uVar.b).h.post(new l(1, uVar, h0Var));
        this.a0 = SystemClock.elapsedRealtimeNanos();
        this.j.b("camera device switch started: from=" + this.C + ", to=" + h0Var);
        o oVar = this.v;
        if (oVar != null) {
            Handler handler = oVar.k;
            if (oVar.U && handler != null) {
                handler.post(new l(0, oVar, handler));
            }
        }
        CameraCaptureSession cameraCaptureSession = this.y;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.y = null;
        }
        this.z = null;
        CameraDevice cameraDevice = this.x;
        if (cameraDevice != null) {
            this.x = null;
            cameraDevice.close();
        } else {
            if (this.N) {
                return;
            }
            this.O = false;
            q();
        }
    }

    public final void C() {
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

    public final void a(CaptureRequest.Builder builder) {
        boolean z10 = this.L && o();
        CameraCharacteristics cameraCharacteristics = this.p;
        if (i(cameraCharacteristics == null ? null : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES), 1)) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
        }
        builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z10 ? 2 : 0));
    }

    public final void b(CaptureRequest.Builder builder) {
        CameraCharacteristics.Key key;
        Range range;
        float z10 = e2.z(this.K, 1.0f, this.J, 1.0f);
        if (Build.VERSION.SDK_INT >= 30) {
            CameraCharacteristics cameraCharacteristics = this.p;
            if (cameraCharacteristics == null) {
                range = null;
            } else {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) cameraCharacteristics.get(key);
            }
            if (range != null) {
                builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), z10))));
                return;
            }
        }
        CameraCharacteristics cameraCharacteristics2 = this.p;
        Rect rect = cameraCharacteristics2 != null ? (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE) : null;
        if (rect == null) {
            return;
        }
        int max = Math.max(1, Math.round(rect.width() / z10));
        int max2 = Math.max(1, Math.round(rect.height() / z10));
        int centerX = rect.centerX() - (max / 2);
        int centerY = rect.centerY() - (max2 / 2);
        Rect rect2 = this.l;
        rect2.set(centerX, centerY, max + centerX, max2 + centerY);
        builder.set(CaptureRequest.SCALER_CROP_REGION, rect2);
    }

    public final void h() {
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.z = null;
        CameraCaptureSession cameraCaptureSession = this.y;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.y = null;
        }
        this.z = null;
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        CameraDevice cameraDevice = this.x;
        if (cameraDevice == null || this.t == null || this.u == null) {
            return;
        }
        try {
            this.Z = SystemClock.elapsedRealtimeNanos();
            k kVar = this.j;
            StringBuilder sb2 = new StringBuilder("capture session requested: preview=");
            sb2.append(this.q);
            sb2.append(", recording=");
            sb2.append(this.r);
            sb2.append(", mode=");
            sb2.append(this.U ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
            sb2.append(", fpsRange=");
            sb2.append(this.G);
            kVar.b(sb2.toString());
            List<Surface> asList = Arrays.asList(this.t, this.u);
            boolean z10 = this.U;
            e eVar = this.k0;
            if (!z10 || Build.VERSION.SDK_INT < 23) {
                cameraDevice.createCaptureSession(asList, eVar, this.n);
            } else {
                cameraDevice.createConstrainedHighSpeedCaptureSession(asList, eVar, this.n);
            }
        } catch (CameraAccessException e) {
            e = e;
            if (this.F != j0.c) {
                m("60 fps session creation rejected", e);
            } else {
                s(e);
            }
        } catch (IllegalArgumentException e7) {
            e = e7;
            if (this.F != j0.c) {
            }
        }
    }

    public final void m(String str, Exception exc) {
        String str2;
        if (this.W) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            s(exc);
            return;
        }
        this.W = true;
        this.U = false;
        this.V = false;
        CameraCaptureSession cameraCaptureSession = this.y;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.y = null;
        }
        this.z = null;
        j6.l lVar = this.H;
        if (lVar == null) {
            s(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.F = j0.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.G = n(cameraCharacteristics != null ? (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES) : null, 30);
        this.q = (Size) lVar.b;
        this.r = (Size) lVar.c;
        this.s = lVar.a;
        this.E = (i0) lVar.d;
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
        this.d0 = 0L;
        this.e0 = 0L;
        this.f0 = 0L;
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
        if (!this.M || handler == null) {
            return;
        }
        handler.post(new b(this, 1));
    }

    public final boolean o() {
        CameraCharacteristics cameraCharacteristics = this.p;
        return this.C == h0.b && Boolean.TRUE.equals(cameraCharacteristics == null ? null : (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
    }

    public final void q() {
        if (this.M && !this.N && this.x == null) {
            if (f0.e.b(this.a, "android.permission.CAMERA") != 0) {
                s(new SecurityException("Camera permission is not granted"));
                return;
            }
            try {
                u(this.B);
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
                    k2.u uVar = this.k;
                    Objects.requireNonNull(uVar);
                    j jVar = new j(qVar, j3, i10, i11, i12, kVar, new a(uVar));
                    this.w = jVar;
                    Surface f7 = jVar.f();
                    Size size = this.r;
                    int i13 = this.e;
                    int i14 = this.s;
                    boolean z10 = this.i;
                    k kVar2 = this.j;
                    j jVar2 = this.w;
                    k2.u uVar2 = this.k;
                    Objects.requireNonNull(uVar2);
                    o oVar = new o(size, f7, i13, i14, z10, kVar2, jVar2, new a(uVar2));
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
                this.N = true;
                this.Y = SystemClock.elapsedRealtimeNanos();
                this.j.b("camera open requested: id=" + this.o + ", preview=" + this.q + ", recording=" + this.r + ", crop=" + this.s);
                this.b.openCamera(this.o, this.j0, this.n);
            } catch (Exception e) {
                this.N = false;
                s(e);
            }
        }
    }

    public final void r() {
        this.M = false;
        TextureView textureView = this.c;
        textureView.setSurfaceTextureListener(null);
        textureView.removeOnLayoutChangeListener(this.g0);
        Handler handler = this.n;
        HandlerThread handlerThread = this.m;
        this.n = null;
        this.m = null;
        if (handler == null || handlerThread == null) {
            return;
        }
        handler.post(new x1(28, this, handlerThread));
    }

    public final void s(Exception exc) {
        this.j.a("camera error", exc);
        k2.u uVar = this.k;
        ((o0) uVar.b).h.post(new l(2, uVar, exc));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.firebase.messaging.m t(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        j0 j0Var;
        Size[] highSpeedVideoSizes;
        int i10;
        i0 i0Var;
        StreamConfigurationMap streamConfigurationMap2 = streamConfigurationMap;
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        k kVar = this.j;
        j0 j0Var2 = this.h;
        j0 j0Var3 = j0.b;
        if (j0Var2 == j0Var3) {
            Range n10 = n(rangeArr, 30);
            kVar.b("fps selection: id=" + str + ", requested=30, mode=REGULAR, range=" + n10);
            return new com.google.firebase.messaging.m(j0Var3, n10, lVar, false);
        }
        int i11 = j0Var2.a;
        Range n11 = n(rangeArr, i11);
        j0 j0Var4 = j0.c;
        i0 i0Var2 = this.g;
        m0 m0Var = this.d;
        if (n11 != null) {
            j0Var = j0Var3;
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
                j6.l e = e(sizeArr2, m0Var, i0Var2);
                kVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=REGULAR, range=" + n11 + ", compatibleSizes=" + Arrays.toString(sizeArr2));
                return new com.google.firebase.messaging.m(j0Var4, n11, e, false);
            } catch (RuntimeException unused) {
                kVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr2));
            }
        } else {
            j0Var = j0Var3;
            kVar.b("fps selection: id=" + str + ", regular " + i11 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
        }
        n4.y yVar = null;
        if (Build.VERSION.SDK_INT >= 23 && i((int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES), 9)) {
            try {
                highSpeedVideoSizes = streamConfigurationMap.getHighSpeedVideoSizes();
            } catch (RuntimeException e7) {
                kVar.b("high-speed configuration query failed: " + e7);
            }
            if (highSpeedVideoSizes != null && highSpeedVideoSizes.length != 0) {
                i0 i0Var3 = i0.c;
                if (i0Var2 == i0Var3) {
                    i10 = m0Var.a;
                } else {
                    m0 m0Var2 = m0.b;
                    i0 i0Var4 = i0.a;
                    if (m0Var == m0Var2) {
                        if (i0Var2 == i0Var4) {
                            i10 = 960;
                        }
                        i10 = 720;
                    } else {
                        if (i0Var2 != i0Var4) {
                            i10 = 540;
                        }
                        i10 = 720;
                    }
                }
                n4.y d = d(streamConfigurationMap, highSpeedVideoSizes, i10, i0Var2, i11);
                if (d != null || (m0Var == m0.c && i0Var2 == (i0Var = i0.b) && (d = d(streamConfigurationMap, highSpeedVideoSizes, 480, i0Var, i11)) != null)) {
                    yVar = d;
                } else if (i0Var2 != i0Var3) {
                    yVar = d(streamConfigurationMap, highSpeedVideoSizes, m0Var.a, i0Var3, i11);
                }
                if (yVar != null) {
                    Range n12 = n(rangeArr, 30);
                    kVar.b("fps selection: id=" + str + ", requested=" + i11 + ", fallback=30, range=" + n12 + ", highSpeed=" + k(cameraCharacteristics, streamConfigurationMap));
                    return new com.google.firebase.messaging.m(j0Var, n12, lVar, false);
                }
                j6.l lVar2 = (j6.l) yVar.a;
                Range range = (Range) yVar.b;
                kVar.b("fps selection: id=" + str + ", requested=" + i11 + ", mode=CONSTRAINED_HIGH_SPEED, range=" + range + ", size=" + ((Size) lVar2.c));
                return new com.google.firebase.messaging.m(j0Var4, range, lVar2, true);
            }
        }
        if (yVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(h0 h0Var) {
        j0 j0Var;
        i0 i0Var;
        k kVar;
        cf.c cVar;
        float floatValue;
        long outputMinFrameDuration;
        StreamConfigurationMap streamConfigurationMap;
        Size[] sizeArr;
        long outputMinFrameDuration2;
        String str;
        CameraCharacteristics.Key key;
        int i10;
        int i11;
        j6.l e;
        com.google.firebase.messaging.m t10;
        h0 h0Var2 = h0.a;
        int i12 = h0Var == h0Var2 ? 0 : 1;
        CameraManager cameraManager = this.b;
        String[] cameraIdList = cameraManager.getCameraIdList();
        int length = cameraIdList.length;
        int i13 = 0;
        cf.c cVar2 = null;
        while (true) {
            j0 j0Var2 = this.h;
            i0 i0Var2 = this.g;
            k kVar2 = this.j;
            if (i13 >= length) {
                j0Var = j0Var2;
                i0Var = i0Var2;
                kVar = kVar2;
                cVar = null;
                break;
            }
            int i14 = i13;
            String str2 = cameraIdList[i14];
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i12) {
                StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap2 == null) {
                    kVar2.b("camera candidate rejected: id=" + str2 + ", reason=no stream map");
                } else {
                    Size[] outputSizes = streamConfigurationMap2.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        i10 = i14;
                        i11 = i12;
                        kVar2.b("camera candidate rejected: id=" + str2 + ", reason=no SurfaceTexture outputs");
                    } else {
                        try {
                            e = e(outputSizes, this.d, i0Var2);
                            i0Var = i0Var2;
                            i10 = i14;
                            i11 = i12;
                            j0Var = j0Var2;
                            kVar = kVar2;
                            try {
                                t10 = t(str2, cameraCharacteristics, streamConfigurationMap2, outputSizes, e);
                            } catch (RuntimeException e7) {
                                e = e7;
                            }
                        } catch (RuntimeException e10) {
                            e = e10;
                            i10 = i14;
                            i11 = i12;
                            kVar = kVar2;
                        }
                        try {
                            cVar = new cf.c(str2, cameraCharacteristics, outputSizes, e, t10);
                            if (cVar2 == null) {
                                cVar2 = cVar;
                            }
                            if (j0Var == j0.b || ((j0) t10.b) == j0Var) {
                                break;
                            }
                        } catch (RuntimeException e11) {
                            e = e11;
                            str2 = str2;
                            kVar.b("camera candidate rejected: id=" + str2 + ", reason=" + e);
                            i13 = i10 + 1;
                            i12 = i11;
                        }
                    }
                    i13 = i10 + 1;
                    i12 = i11;
                }
            }
            i10 = i14;
            i11 = i12;
            i13 = i10 + 1;
            i12 = i11;
        }
        cf.c cVar3 = cVar == null ? cVar2 : cVar;
        if (cVar3 == null) {
            throw new IllegalStateException("Requested camera is not available");
        }
        String str3 = (String) cVar3.a;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) cVar3.b;
        Size[] sizeArr2 = (Size[]) cVar3.c;
        j6.l lVar = (j6.l) cVar3.d;
        com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) cVar3.e;
        j6.l lVar2 = (j6.l) mVar.d;
        this.o = str3;
        this.D = h0Var;
        this.p = cameraCharacteristics2;
        this.F = (j0) mVar.b;
        this.G = (Range) mVar.c;
        this.U = mVar.a;
        this.V = false;
        this.W = false;
        this.H = lVar;
        this.d0 = 0L;
        this.e0 = 0L;
        this.f0 = 0L;
        this.q = (Size) lVar2.b;
        this.r = (Size) lVar2.c;
        this.s = lVar2.a;
        this.E = (i0) lVar2.d;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 30) {
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
        if (streamConfigurationMap3 != null) {
            try {
                outputMinFrameDuration = streamConfigurationMap3.getOutputMinFrameDuration(SurfaceTexture.class, size);
            } catch (RuntimeException unused) {
            }
            Size size2 = this.r;
            streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                try {
                    sizeArr = sizeArr2;
                    outputMinFrameDuration2 = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size2);
                } catch (RuntimeException unused2) {
                }
                Size[] sizeArr3 = sizeArr;
                int i16 = this.e;
                StringBuilder l4 = hg.k0.l("camera outputs selected: output=", i16, "x", i16, ", cameraMode=");
                l4.append(this.E);
                if (this.E != i0Var) {
                    str = " (fallback from " + i0Var + ")";
                } else {
                    str = "";
                }
                l4.append(str);
                l4.append(", crop=");
                l4.append(this.s);
                l4.append(", preview=");
                l4.append(this.q);
                l4.append(", recording=");
                l4.append(this.r);
                l4.append(", previewMinFrameDurationNs=");
                l4.append(outputMinFrameDuration);
                l4.append(", recordingMinFrameDurationNs=");
                l4.append(outputMinFrameDuration2);
                l4.append(", fps=");
                l4.append(this.F.a);
                l4.append(", fpsRange=");
                l4.append(this.G);
                l4.append(", sessionMode=");
                l4.append(this.U ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
                l4.append(this.F != j0Var ? a4.a.n(j0Var.a, ")", new StringBuilder(" (fallback from ")) : "");
                kVar.b(l4.toString());
                if (h0Var == h0Var2) {
                    if (this.S) {
                        return;
                    } else {
                        this.S = true;
                    }
                } else if (this.T) {
                    return;
                } else {
                    this.T = true;
                }
                Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                StreamConfigurationMap streamConfigurationMap4 = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                StringBuilder sb2 = new StringBuilder("camera capabilities: id=");
                sb2.append(str3);
                sb2.append(", facing=");
                sb2.append(h0Var);
                sb2.append(", hardwareLevel=");
                sb2.append(num2 == null ? "unknown" : num2.intValue() == 2 ? "LEGACY" : num2.intValue() == 0 ? "LIMITED" : num2.intValue() == 1 ? "FULL" : num2.intValue() == 3 ? "LEVEL_3" : (i15 < 28 || num2.intValue() != 4) ? String.valueOf(num2) : "EXTERNAL");
                sb2.append(", sensorOrientation=");
                sb2.append(num3);
                sb2.append(", activeArray=");
                sb2.append(rect);
                sb2.append(", capabilities=");
                sb2.append(Arrays.toString(iArr));
                sb2.append(", fpsRanges=");
                sb2.append(Arrays.toString(rangeArr));
                sb2.append(", outputSizes=");
                sb2.append(Arrays.toString(sizeArr3));
                sb2.append(", highSpeed=");
                sb2.append(streamConfigurationMap4 == null ? "no stream map" : k(cameraCharacteristics2, streamConfigurationMap4));
                kVar.b(sb2.toString());
            }
            sizeArr = sizeArr2;
            outputMinFrameDuration2 = -1;
            Size[] sizeArr32 = sizeArr;
            int i162 = this.e;
            StringBuilder l42 = hg.k0.l("camera outputs selected: output=", i162, "x", i162, ", cameraMode=");
            l42.append(this.E);
            if (this.E != i0Var) {
            }
            l42.append(str);
            l42.append(", crop=");
            l42.append(this.s);
            l42.append(", preview=");
            l42.append(this.q);
            l42.append(", recording=");
            l42.append(this.r);
            l42.append(", previewMinFrameDurationNs=");
            l42.append(outputMinFrameDuration);
            l42.append(", recordingMinFrameDurationNs=");
            l42.append(outputMinFrameDuration2);
            l42.append(", fps=");
            l42.append(this.F.a);
            l42.append(", fpsRange=");
            l42.append(this.G);
            l42.append(", sessionMode=");
            l42.append(this.U ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
            l42.append(this.F != j0Var ? a4.a.n(j0Var.a, ")", new StringBuilder(" (fallback from ")) : "");
            kVar.b(l42.toString());
            if (h0Var == h0Var2) {
            }
            Integer num22 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            Integer num32 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
            Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int[] iArr2 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            StreamConfigurationMap streamConfigurationMap42 = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            Rect rect2 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            StringBuilder sb22 = new StringBuilder("camera capabilities: id=");
            sb22.append(str3);
            sb22.append(", facing=");
            sb22.append(h0Var);
            sb22.append(", hardwareLevel=");
            sb22.append(num22 == null ? "unknown" : num22.intValue() == 2 ? "LEGACY" : num22.intValue() == 0 ? "LIMITED" : num22.intValue() == 1 ? "FULL" : num22.intValue() == 3 ? "LEVEL_3" : (i15 < 28 || num22.intValue() != 4) ? String.valueOf(num22) : "EXTERNAL");
            sb22.append(", sensorOrientation=");
            sb22.append(num32);
            sb22.append(", activeArray=");
            sb22.append(rect2);
            sb22.append(", capabilities=");
            sb22.append(Arrays.toString(iArr2));
            sb22.append(", fpsRanges=");
            sb22.append(Arrays.toString(rangeArr2));
            sb22.append(", outputSizes=");
            sb22.append(Arrays.toString(sizeArr32));
            sb22.append(", highSpeed=");
            sb22.append(streamConfigurationMap42 == null ? "no stream map" : k(cameraCharacteristics2, streamConfigurationMap42));
            kVar.b(sb22.toString());
        }
        outputMinFrameDuration = -1;
        Size size22 = this.r;
        streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
        }
        sizeArr = sizeArr2;
        outputMinFrameDuration2 = -1;
        Size[] sizeArr322 = sizeArr;
        int i1622 = this.e;
        StringBuilder l422 = hg.k0.l("camera outputs selected: output=", i1622, "x", i1622, ", cameraMode=");
        l422.append(this.E);
        if (this.E != i0Var) {
        }
        l422.append(str);
        l422.append(", crop=");
        l422.append(this.s);
        l422.append(", preview=");
        l422.append(this.q);
        l422.append(", recording=");
        l422.append(this.r);
        l422.append(", previewMinFrameDurationNs=");
        l422.append(outputMinFrameDuration);
        l422.append(", recordingMinFrameDurationNs=");
        l422.append(outputMinFrameDuration2);
        l422.append(", fps=");
        l422.append(this.F.a);
        l422.append(", fpsRange=");
        l422.append(this.G);
        l422.append(", sessionMode=");
        l422.append(this.U ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
        l422.append(this.F != j0Var ? a4.a.n(j0Var.a, ")", new StringBuilder(" (fallback from ")) : "");
        kVar.b(l422.toString());
        if (h0Var == h0Var2) {
        }
        Integer num222 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Integer num322 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Range[] rangeArr22 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int[] iArr22 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        StreamConfigurationMap streamConfigurationMap422 = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        Rect rect22 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder sb222 = new StringBuilder("camera capabilities: id=");
        sb222.append(str3);
        sb222.append(", facing=");
        sb222.append(h0Var);
        sb222.append(", hardwareLevel=");
        sb222.append(num222 == null ? "unknown" : num222.intValue() == 2 ? "LEGACY" : num222.intValue() == 0 ? "LIMITED" : num222.intValue() == 1 ? "FULL" : num222.intValue() == 3 ? "LEVEL_3" : (i15 < 28 || num222.intValue() != 4) ? String.valueOf(num222) : "EXTERNAL");
        sb222.append(", sensorOrientation=");
        sb222.append(num322);
        sb222.append(", activeArray=");
        sb222.append(rect22);
        sb222.append(", capabilities=");
        sb222.append(Arrays.toString(iArr22));
        sb222.append(", fpsRanges=");
        sb222.append(Arrays.toString(rangeArr22));
        sb222.append(", outputSizes=");
        sb222.append(Arrays.toString(sizeArr322));
        sb222.append(", highSpeed=");
        sb222.append(streamConfigurationMap422 == null ? "no stream map" : k(cameraCharacteristics2, streamConfigurationMap422));
        kVar.b(sb222.toString());
    }

    public final void v(boolean z10) {
        this.L = z10;
        this.j.b("torch requested: enabled=" + z10 + ", available=" + o() + ", facing=" + this.C);
        Handler handler = this.n;
        if (!this.M || handler == null) {
            return;
        }
        handler.post(new b(this, 3));
    }

    public final boolean w(float f7) {
        this.J = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.n;
        if (!this.M || handler == null) {
            return false;
        }
        b bVar = this.h0;
        handler.removeCallbacks(bVar);
        handler.post(bVar);
        return true;
    }

    public final void y(q qVar, long j3, h0 h0Var) {
        if (this.m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
        this.A = qVar;
        this.I = j3;
        this.B = h0Var;
        this.M = true;
        this.R = false;
        this.X = SystemClock.elapsedRealtimeNanos();
        this.b0 = 0L;
        this.c0 = 0L;
        this.d0 = 0L;
        this.e0 = 0L;
        this.f0 = 0L;
        StringBuilder sb2 = new StringBuilder("camera segment start: facing=");
        sb2.append(h0Var);
        sb2.append(", timelineOffsetUs=");
        sb2.append(j3);
        sb2.append(", textureAvailable=");
        TextureView textureView = this.c;
        sb2.append(textureView.isAvailable());
        this.j.b(sb2.toString());
        textureView.setSurfaceTextureListener(this.i0);
        Handler handler = this.n;
        if (this.M && handler != null && textureView.isAvailable()) {
            handler.post(new b(this, 4));
        }
    }

    public final boolean z() {
        Handler handler = this.n;
        if (!this.M || this.R || handler == null) {
            return false;
        }
        this.R = true;
        this.j.b("camera segment stop requested");
        handler.post(new b(this, 5));
        return true;
    }
}
