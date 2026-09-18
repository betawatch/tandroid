package ki;

import ai.n8;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
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
import ci.g4;
import com.google.android.gms.internal.vision.e2;
import gg.x1;
import hg.k0;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class g {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public final g4 M;
    public final a N;
    public final c O;
    public final d P;
    public final e Q;
    public final int R;
    public final int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final Context a;
    public final CameraManager b;
    public final TextureView c;
    public final int d;
    public final int e;
    public final j f;
    public final k2.u g;
    public HandlerThread i;
    public Handler j;
    public String k;
    public CameraCharacteristics l;
    public Size m;
    public Size n;
    public int o;
    public Surface p;
    public Surface q;
    public m r;
    public i s;
    public CameraDevice t;
    public CameraCaptureSession u;
    public CaptureRequest.Builder v;
    public o w;
    public long x;
    public float y;
    public final Rect h = new Rect();
    public float z = 1.0f;

    public g(Context context, TextureView textureView, j jVar, k2.u uVar) {
        g4 g4Var = new g4(this, 2);
        this.M = g4Var;
        this.N = new a(this, 3);
        this.O = new c(this, 0);
        this.P = new d(this);
        this.Q = new e(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = textureView;
        this.R = 1;
        this.d = 480;
        this.e = 1150000;
        this.S = 1;
        this.f = jVar;
        this.g = uVar;
        textureView.addOnLayoutChangeListener(g4Var);
    }

    public static void a(g gVar, CaptureRequest.Builder builder) {
        j jVar = gVar.f;
        CameraCharacteristics cameraCharacteristics = gVar.l;
        Range range = null;
        Range[] rangeArr = cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr == null) {
            return;
        }
        for (Range range2 : rangeArr) {
            if (range2.contains((Range) 30) && (range == null || ((Integer) range2.getUpper()).intValue() - ((Integer) range2.getLower()).intValue() < ((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue())) {
                range = range2;
            }
        }
        if (range == null) {
            jVar.b("capture FPS range: no range containing 30 fps");
            return;
        }
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        jVar.b("capture FPS range selected: " + range);
    }

    public static long c(Size size) {
        return size.getWidth() * size.getHeight();
    }

    public static Size d(Size[] sizeArr, Size size) {
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(o(size2) - 720);
                if ((abs != abs2 ? Integer.compare(abs, abs2) : Long.compare(c(size3), c(size2))) < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static e2.a0 e(Size[] sizeArr, int i10, int i11) {
        int compare;
        e2.a0 a0Var = null;
        for (Size size : sizeArr) {
            int i12 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int o9 = o(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (o9 >= i10 && o9 <= i12 && max <= min) {
                Size d = d(sizeArr, size);
                e2.a0 a0Var2 = new e2.a0(d, size, i11, i10);
                if (a0Var != null) {
                    Size size2 = (Size) a0Var.c;
                    int abs = Math.abs(Math.min(d.getWidth(), d.getHeight()) - 720);
                    Size size3 = (Size) a0Var.d;
                    int abs2 = Math.abs(o(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long c10 = c(size) + c(d);
                        long c11 = c(size3) + c(size2);
                        compare = c10 != c11 ? Long.compare(c10, c11) : Long.compare(c(size), c(size3));
                    }
                    if (compare >= 0) {
                    }
                }
                a0Var = a0Var2;
            }
        }
        return a0Var;
    }

    public static long g(long j3) {
        if (j3 == 0) {
            return -1L;
        }
        return (SystemClock.elapsedRealtimeNanos() - j3) / 1000000;
    }

    public static int o(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public final void b(CaptureRequest.Builder builder) {
        float z10 = e2.z(this.z, 1.0f, this.y, 1.0f);
        if (Build.VERSION.SDK_INT >= 30) {
            CameraCharacteristics cameraCharacteristics = this.l;
            Range range = cameraCharacteristics == null ? null : (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            if (range != null) {
                builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(Math.max(((Float) range.getLower()).floatValue(), Math.min(((Float) range.getUpper()).floatValue(), z10))));
                return;
            }
        }
        CameraCharacteristics cameraCharacteristics2 = this.l;
        Rect rect = cameraCharacteristics2 != null ? (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE) : null;
        if (rect == null) {
            return;
        }
        int max = Math.max(1, Math.round(rect.width() / z10));
        int max2 = Math.max(1, Math.round(rect.height() / z10));
        int centerX = rect.centerX() - (max / 2);
        int centerY = rect.centerY() - (max2 / 2);
        Rect rect2 = this.h;
        rect2.set(centerX, centerY, max + centerX, max2 + centerY);
        builder.set(CaptureRequest.SCALER_CROP_REGION, rect2);
    }

    public final void f() {
        this.C = false;
        this.D = false;
        this.E = false;
        this.v = null;
        CameraCaptureSession cameraCaptureSession = this.u;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.u = null;
        }
        this.v = null;
        CameraDevice cameraDevice = this.t;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.t = null;
        }
        Surface surface = this.p;
        if (surface != null) {
            surface.release();
            this.p = null;
        }
        m mVar = this.r;
        if (mVar != null) {
            mVar.h();
            this.r = null;
        }
        this.q = null;
    }

    public final boolean h() {
        CameraCharacteristics cameraCharacteristics = this.l;
        return this.U == 2 && Boolean.TRUE.equals(cameraCharacteristics == null ? null : (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
    }

    public final void i() {
        if (this.B && !this.C && this.t == null) {
            if (f0.e.b(this.a, "android.permission.CAMERA") != 0) {
                k(new SecurityException("Camera permission is not granted"));
                return;
            }
            try {
                l(this.T);
                SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                if (surfaceTexture == null) {
                    return;
                }
                surfaceTexture.setDefaultBufferSize(this.m.getWidth(), this.m.getHeight());
                if (this.p == null) {
                    this.p = new Surface(surfaceTexture);
                }
                if (this.s == null) {
                    o oVar = this.w;
                    long j3 = this.x;
                    int i10 = this.d;
                    int i11 = this.e;
                    j jVar = this.f;
                    k2.u uVar = this.g;
                    Objects.requireNonNull(uVar);
                    i iVar = new i(oVar, j3, i10, i11, jVar, new b(uVar));
                    this.s = iVar;
                    Surface f7 = iVar.f();
                    Size size = this.n;
                    int i12 = this.d;
                    int i13 = this.o;
                    j jVar2 = this.f;
                    i iVar2 = this.s;
                    k2.u uVar2 = this.g;
                    Objects.requireNonNull(uVar2);
                    m mVar = new m(size, f7, i12, i13, jVar2, iVar2, new b(uVar2));
                    this.r = mVar;
                    mVar.V = new a(this, 0);
                    this.q = this.r.g();
                } else {
                    m mVar2 = this.r;
                    if (mVar2 != null) {
                        mVar2.j(this.n, this.o);
                        Surface surface = this.r.l;
                        if (surface == null) {
                            throw new IllegalStateException("GL processor is not started");
                        }
                        this.q = surface;
                    }
                }
                this.C = true;
                this.J = SystemClock.elapsedRealtimeNanos();
                this.f.b("camera open requested: id=" + this.k + ", preview=" + this.m + ", recording=" + this.n + ", crop=" + this.o);
                this.b.openCamera(this.k, this.P, this.j);
            } catch (Exception e) {
                this.C = false;
                k(e);
            }
        }
    }

    public final void j() {
        this.B = false;
        TextureView textureView = this.c;
        textureView.setSurfaceTextureListener(null);
        textureView.removeOnLayoutChangeListener(this.M);
        Handler handler = this.j;
        HandlerThread handlerThread = this.i;
        this.j = null;
        this.i = null;
        if (handler == null || handlerThread == null) {
            return;
        }
        handler.post(new x1(27, this, handlerThread));
    }

    public final void k(Exception exc) {
        this.f.a("camera error", exc);
        k2.u uVar = this.g;
        ((h0) uVar.b).h.post(new c0(0, uVar, exc));
    }

    public final void l(int i10) {
        Size size;
        String str;
        CameraCharacteristics cameraCharacteristics;
        int i11;
        float floatValue;
        String str2;
        int i12;
        int i13 = i10 == 1 ? 0 : 1;
        CameraManager cameraManager = this.b;
        String[] cameraIdList = cameraManager.getCameraIdList();
        int length = cameraIdList.length;
        int i14 = 0;
        while (true) {
            size = null;
            if (i14 >= length) {
                str = null;
                cameraCharacteristics = null;
                break;
            }
            str = cameraIdList[i14];
            cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i13) {
                break;
            } else {
                i14++;
            }
        }
        if (str == null || cameraCharacteristics == null) {
            throw new IllegalStateException("Requested camera is not available");
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new IllegalStateException("Camera has no stream configuration map");
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null || outputSizes.length == 0) {
            throw new IllegalStateException("Camera has no SurfaceTexture output sizes");
        }
        this.k = str;
        this.V = i10;
        this.l = cameraCharacteristics;
        int i15 = this.S;
        int i16 = this.R;
        if (i15 == 3) {
            i11 = k0.d(i16);
        } else {
            i11 = 720;
            if (i16 == 1) {
                if (i15 == 1) {
                    i11 = 960;
                }
            } else if (i15 != 1) {
                i11 = 540;
            }
        }
        e2.a0 e = e(outputSizes, i11, i15);
        if (e == null && (i16 != 2 || i15 != 2 || (e = e(outputSizes, 480, 2)) == null)) {
            int d = k0.d(i16);
            if (i15 == 3 || (e = e(outputSizes, d, 3)) == null) {
                int d10 = k0.d(i16);
                int length2 = outputSizes.length;
                int i17 = 0;
                while (true) {
                    i12 = 1920;
                    if (i17 >= length2) {
                        break;
                    }
                    Size size2 = outputSizes[i17];
                    if (o(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= d10 && (size == null || c(size2) < c(size))) {
                        size = size2;
                    }
                    i17++;
                }
                if (size == null) {
                    int length3 = outputSizes.length;
                    int i18 = 0;
                    while (i18 < length3) {
                        Size size3 = outputSizes[i18];
                        if (o(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= i12 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && c(size3) < c(size)))) {
                            size = size3;
                        }
                        i18++;
                        i12 = 1920;
                    }
                    if (size == null) {
                        throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
                    }
                }
                e = new e2.a0(d(outputSizes, size), size, 3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
            }
        }
        this.m = (Size) e.c;
        this.n = (Size) e.d;
        this.o = e.b;
        this.W = e.a;
        int i19 = Build.VERSION.SDK_INT;
        if (i19 >= 30) {
            Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            if (range != null) {
                floatValue = ((Float) range.getUpper()).floatValue();
            }
            floatValue = 1.0f;
        } else {
            Float f7 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f7 != null) {
                floatValue = f7.floatValue();
            }
            floatValue = 1.0f;
        }
        this.z = Math.max(1.0f, Math.min(4.0f, floatValue));
        int i20 = this.d;
        StringBuilder k10 = k0.k("camera outputs selected: output=", i20, "x", i20, ", cameraMode=");
        k10.append(k0.A(this.W));
        if (this.W != i15) {
            str2 = " (fallback from " + k0.A(i15) + ")";
        } else {
            str2 = "";
        }
        k10.append(str2);
        k10.append(", crop=");
        k10.append(this.o);
        k10.append(", preview=");
        k10.append(this.m);
        k10.append(", recording=");
        k10.append(this.n);
        String sb2 = k10.toString();
        j jVar = this.f;
        jVar.b(sb2);
        if (i10 == 1) {
            if (this.G) {
                return;
            } else {
                this.G = true;
            }
        } else if (this.H) {
            return;
        } else {
            this.H = true;
        }
        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Integer num3 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder v = a4.a.v("camera capabilities: id=", str, ", facing=");
        v.append(k0.z(i10));
        v.append(", hardwareLevel=");
        v.append(num2 == null ? "unknown" : num2.intValue() == 2 ? "LEGACY" : num2.intValue() == 0 ? "LIMITED" : num2.intValue() == 1 ? "FULL" : num2.intValue() == 3 ? "LEVEL_3" : (i19 < 28 || num2.intValue() != 4) ? String.valueOf(num2) : "EXTERNAL");
        v.append(", sensorOrientation=");
        v.append(num3);
        v.append(", activeArray=");
        v.append(rect);
        v.append(", fpsRanges=");
        v.append(Arrays.toString(rangeArr));
        v.append(", outputSizes=");
        v.append(Arrays.toString(outputSizes));
        jVar.b(v.toString());
    }

    public final void m(boolean z10) {
        this.A = z10;
        Handler handler = this.j;
        if (!this.B || handler == null) {
            return;
        }
        handler.post(new a(this, 3));
    }

    public final boolean n(float f7) {
        this.y = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.j;
        if (!this.B || handler == null) {
            return false;
        }
        a aVar = this.N;
        handler.removeCallbacks(aVar);
        handler.post(aVar);
        return true;
    }

    public final void p(o oVar, long j3, int i10) {
        if (this.i == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.i = handlerThread;
            handlerThread.start();
            this.j = new Handler(this.i.getLooper());
        }
        this.w = oVar;
        this.x = j3;
        this.T = i10;
        this.B = true;
        this.F = false;
        this.I = SystemClock.elapsedRealtimeNanos();
        StringBuilder sb2 = new StringBuilder("camera segment start: facing=");
        sb2.append(k0.z(i10));
        sb2.append(", timelineOffsetUs=");
        sb2.append(j3);
        sb2.append(", textureAvailable=");
        TextureView textureView = this.c;
        sb2.append(textureView.isAvailable());
        this.f.b(sb2.toString());
        textureView.setSurfaceTextureListener(this.O);
        Handler handler = this.j;
        if (this.B && handler != null && textureView.isAvailable()) {
            handler.post(new a(this, 2));
        }
    }

    public final boolean q() {
        Handler handler = this.j;
        if (!this.B || this.F || handler == null) {
            return false;
        }
        this.F = true;
        this.f.b("camera segment stop requested");
        handler.post(new a(this, 4));
        return true;
    }

    public final void r(int i10) {
        if (!this.B || this.D || i10 == this.U) {
            return;
        }
        this.D = true;
        this.E = true;
        this.A = false;
        this.y = 0.0f;
        k2.u uVar = this.g;
        ((h0) uVar.b).h.post(new n8(uVar, i10, 13));
        this.L = SystemClock.elapsedRealtimeNanos();
        this.f.b("camera device switch started: from=" + k0.z(this.U) + ", to=" + k0.z(i10));
        m mVar = this.r;
        if (mVar != null) {
            Handler handler = mVar.j;
            if (mVar.T && handler != null) {
                handler.post(new x1(29, mVar, handler));
            }
        }
        CameraCaptureSession cameraCaptureSession = this.u;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.u = null;
        }
        this.v = null;
        CameraDevice cameraDevice = this.t;
        if (cameraDevice != null) {
            this.t = null;
            cameraDevice.close();
        } else {
            if (this.C) {
                return;
            }
            this.D = false;
            i();
        }
    }

    public final void s() {
        Integer num;
        Size size = this.n;
        if (size != null) {
            TextureView textureView = this.c;
            if (textureView.getWidth() == 0 || textureView.getHeight() == 0) {
                return;
            }
            int min = Math.min(this.o, Math.min(size.getWidth(), size.getHeight()));
            boolean z10 = false;
            if (this.l != null && textureView.getDisplay() != null && (num = (Integer) this.l.get(CameraCharacteristics.SENSOR_ORIENTATION)) != null) {
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
            this.f.b("preview transform: view=" + textureView.getWidth() + "x" + textureView.getHeight() + ", source=" + size + ", crop=" + min + ", axesSwapped=" + z10 + ", scale=" + height + "x" + width);
        }
    }
}
