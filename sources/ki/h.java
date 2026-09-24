package ki;

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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class h {
    public t A;
    public long A0;
    public volatile k0 B;
    public long B0;
    public k0 C;
    public long C0;
    public k0 D;
    public double D0;
    public l0 E;
    public long E0;
    public m0 F;
    public long F0;
    public Range G;
    public long G0;
    public j6.l H;
    public long H0;
    public long I;
    public long I0;
    public volatile float J;
    public long J0;
    public long K0;
    public boolean L;
    public final f4 L0;
    public boolean M;
    public final b M0;
    public int N;
    public final c N0;
    public int O;
    public final d O0;
    public int P;
    public final e P0;
    public int Q;
    public final f Q0;
    public volatile boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public volatile boolean W;
    public volatile boolean X;
    public volatile boolean Y;
    public boolean Z;
    public final Context a;
    public boolean a0;
    public final CameraManager b;
    public boolean b0;
    public final TextureView c;
    public boolean c0;
    public final p0 d;
    public boolean d0;
    public final int e;
    public long e0;
    public final int f;
    public long f0;
    public final l0 g;
    public long g0;
    public final m0 h;
    public long h0;
    public final boolean i;
    public long i0;
    public final l j;
    public long j0;
    public final k2.u k;
    public long k0;
    public long l0;
    public HandlerThread m;
    public long m0;
    public Handler n;
    public long n0;
    public String o;
    public double o0;
    public CameraCharacteristics p;
    public long p0;
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
    public k w;
    public long w0;
    public CameraDevice x;
    public long x0;
    public CameraCaptureSession y;
    public long y0;
    public CaptureRequest.Builder z;
    public long z0;
    public final Rect l = new Rect();
    public float K = 1.0f;

    public h(Context context, TextureView textureView, p0 p0Var, int i10, l0 l0Var, m0 m0Var, boolean z10, l lVar, k2.u uVar) {
        f4 f4Var = new f4(this, 2);
        this.L0 = f4Var;
        this.M0 = new b(this, 2);
        this.N0 = new c(this, 0);
        this.O0 = new d(this);
        this.P0 = new e(this);
        this.Q0 = new f(this);
        this.a = context.getApplicationContext();
        this.b = (CameraManager) context.getSystemService("camera");
        this.c = textureView;
        this.d = p0Var;
        this.e = p0Var.a;
        this.f = i10;
        this.g = l0Var;
        this.h = m0Var;
        this.i = z10;
        this.j = lVar;
        this.k = uVar;
        textureView.addOnLayoutChangeListener(f4Var);
    }

    public static float A(double d, long j3, long j10) {
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

    public static j6.l d(Size[] sizeArr, p0 p0Var, l0 l0Var) {
        int i10;
        j6.l f7;
        l0 l0Var2;
        j6.l f10;
        l0 l0Var3 = l0.c;
        if (l0Var == l0Var3) {
            i10 = p0Var.a;
        } else {
            p0 p0Var2 = p0.b;
            l0 l0Var4 = l0.a;
            if (p0Var == p0Var2) {
                if (l0Var == l0Var4) {
                    i10 = 960;
                }
                i10 = 720;
            } else {
                if (l0Var != l0Var4) {
                    i10 = 540;
                }
                i10 = 720;
            }
        }
        j6.l f11 = f(sizeArr, i10, l0Var);
        if (f11 != null) {
            return f11;
        }
        if (p0Var == p0.c && l0Var == (l0Var2 = l0.b) && (f10 = f(sizeArr, 480, l0Var2)) != null) {
            return f10;
        }
        int i11 = p0Var.a;
        if (l0Var != l0Var3 && (f7 = f(sizeArr, i11, l0Var3)) != null) {
            return f7;
        }
        int i12 = p0Var.a;
        Size size = null;
        for (Size size2 : sizeArr) {
            if (z(size2) <= 1088 && Math.max(size2.getWidth(), size2.getHeight()) <= 1920 && Math.min(size2.getWidth(), size2.getHeight()) >= i12 && (size == null || b(size2) < b(size))) {
                size = size2;
            }
        }
        if (size == null) {
            for (Size size3 : sizeArr) {
                if (z(size3) <= 1088 && Math.max(size3.getWidth(), size3.getHeight()) <= 1920 && (size == null || Math.min(size3.getWidth(), size3.getHeight()) > Math.min(size.getWidth(), size.getHeight()) || (Math.min(size3.getWidth(), size3.getHeight()) == Math.min(size.getWidth(), size.getHeight()) && b(size3) < b(size)))) {
                    size = size3;
                }
            }
            if (size == null) {
                throw new IllegalStateException("Camera has no output at or below the bandwidth cap");
            }
        }
        return new j6.l(e(sizeArr, size), size, l0Var3, Math.min(Math.min(size.getWidth(), size.getHeight()), 1088));
    }

    public static Size e(Size[] sizeArr, Size size) {
        Size size2 = size;
        for (Size size3 : sizeArr) {
            if (size3.getWidth() * size.getHeight() == size3.getHeight() * size.getWidth()) {
                int abs = Math.abs(Math.min(size3.getWidth(), size3.getHeight()) - 720);
                int abs2 = Math.abs(z(size2) - 720);
                if ((abs != abs2 ? Integer.compare(abs, abs2) : Long.compare(b(size3), b(size2))) < 0) {
                    size2 = size3;
                }
            }
        }
        return size2;
    }

    public static j6.l f(Size[] sizeArr, int i10, l0 l0Var) {
        int compare;
        j6.l lVar = null;
        for (Size size : sizeArr) {
            int i11 = ((i10 * 15) / 100) + i10;
            int min = Math.min(1920, i10 * 2);
            int z10 = z(size);
            int max = Math.max(size.getWidth(), size.getHeight());
            if (z10 >= i10 && z10 <= i11 && max <= min) {
                Size e = e(sizeArr, size);
                j6.l lVar2 = new j6.l(e, size, l0Var, i10);
                if (lVar != null) {
                    Size size2 = (Size) lVar.b;
                    int abs = Math.abs(Math.min(e.getWidth(), e.getHeight()) - 720);
                    Size size3 = (Size) lVar.c;
                    int abs2 = Math.abs(z(size2) - 720);
                    if (abs != abs2) {
                        compare = Integer.compare(abs, abs2);
                    } else {
                        long b10 = b(size) + b(e);
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

    public static int z(Size size) {
        return Math.min(size.getWidth(), size.getHeight());
    }

    public final void B(t tVar, long j3, k0 k0Var) {
        if (this.m == null) {
            HandlerThread handlerThread = new HandlerThread("RoundVideoCamera2");
            this.m = handlerThread;
            handlerThread.start();
            this.n = new Handler(this.m.getLooper());
        }
        this.A = tVar;
        this.I = j3;
        this.B = k0Var;
        this.R = true;
        this.X = false;
        this.Y = true;
        this.e0 = SystemClock.elapsedRealtimeNanos();
        u();
        t();
        this.j.b("camera segment start: facing=" + k0Var + ", timelineOffsetUs=" + j3 + ", textureAvailable=" + this.c.isAvailable());
        this.c.setSurfaceTextureListener(this.N0);
        Handler handler = this.n;
        if (this.R && handler != null && this.c.isAvailable()) {
            handler.post(new b(this, 3));
        }
    }

    public final boolean C() {
        Handler handler = this.n;
        if (!this.R || this.X || handler == null) {
            return false;
        }
        this.X = true;
        this.Y = false;
        this.j.b("camera segment stop requested");
        handler.post(new b(this, 4));
        return true;
    }

    public final boolean D(k0 k0Var) {
        StreamConfigurationMap streamConfigurationMap;
        Size[] outputSizes;
        int i10 = k0Var == k0.a ? 0 : 1;
        CameraManager cameraManager = this.b;
        for (String str : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == i10 && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) != null && outputSizes.length != 0) {
                try {
                    if (((m0) v(str, cameraCharacteristics, streamConfigurationMap, outputSizes, d(outputSizes, this.d, this.g)).b) == m0.c) {
                        return true;
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
        return false;
    }

    public final void E(k0 k0Var) {
        if (!this.R || this.T || k0Var == this.C) {
            return;
        }
        this.T = true;
        this.V = true;
        this.L = false;
        this.M = false;
        this.J = 0.0f;
        k2.u uVar = this.k;
        ((r0) uVar.b).h.post(new n(1, uVar, k0Var));
        this.h0 = SystemClock.elapsedRealtimeNanos();
        this.j.b("camera device switch started: from=" + this.C + ", to=" + k0Var);
        q qVar = this.v;
        if (qVar != null) {
            Handler handler = qVar.l;
            if (qVar.V && handler != null) {
                handler.post(new n(0, qVar, handler));
            }
        }
        h();
        CameraDevice cameraDevice = this.x;
        if (cameraDevice != null) {
            this.x = null;
            cameraDevice.close();
        } else {
            if (this.S) {
                return;
            }
            this.T = false;
            q();
        }
    }

    public final void F() {
        Size size;
        Integer num;
        if (!this.Y || (size = this.r) == null || this.c.getWidth() == 0 || this.c.getHeight() == 0) {
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
        CameraCaptureSession cameraCaptureSession = this.y;
        if (!this.R || cameraCaptureSession == null || this.x == null) {
            return;
        }
        try {
            CaptureRequest.Builder k10 = k(false);
            this.z = k10;
            CameraCaptureSession cameraCaptureSession2 = this.y;
            if (cameraCaptureSession2 != null) {
                cameraCaptureSession2.setRepeatingRequest(k10.build(), this.Q0, this.n);
            }
        } catch (CameraAccessException e) {
            e = e;
            if (this.F != m0.c) {
                m("60 fps updated request rejected", e);
            } else {
                s(e);
            }
        } catch (IllegalArgumentException e7) {
            e = e7;
            if (this.F != m0.c) {
            }
        } catch (IllegalStateException e10) {
            if (!this.R || this.X || cameraCaptureSession != this.y) {
                this.j.b("stale repeating request rejection ignored: " + e10.getMessage());
                return;
            }
            this.j.b("repeating request rejected by closed camera; reopening device: " + e10.getMessage());
            h();
            CameraDevice cameraDevice = this.x;
            this.x = null;
            this.S = false;
            if (cameraDevice == null) {
                q();
            } else {
                this.U = true;
                cameraDevice.close();
            }
        }
    }

    public final void g() {
        this.S = false;
        this.T = false;
        this.U = false;
        this.Y = false;
        this.V = false;
        this.W = false;
        this.z = null;
        this.M = false;
        h();
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
        q qVar = this.v;
        if (qVar != null) {
            qVar.g();
            this.v = null;
        }
        this.u = null;
    }

    public final void h() {
        CameraCaptureSession cameraCaptureSession = this.y;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.y = null;
        }
        this.z = null;
    }

    public final void i() {
        CameraDevice cameraDevice = this.x;
        if (cameraDevice == null || this.t == null || this.u == null) {
            return;
        }
        try {
            this.g0 = SystemClock.elapsedRealtimeNanos();
            this.j.b("capture session requested: preview=" + this.q + ", recording=" + this.r + ", fpsRange=" + this.G);
            cameraDevice.createCaptureSession(Arrays.asList(this.t, this.u), this.P0, this.n);
        } catch (CameraAccessException | IllegalArgumentException e) {
            if (this.F == m0.c) {
                m("60 fps session creation rejected", e);
            } else {
                s(e);
            }
        }
    }

    public final void j() {
        Surface surface;
        Surface surface2;
        t tVar = this.A;
        long j3 = this.I;
        int i10 = this.e;
        int i11 = this.f;
        int i12 = this.F.a;
        l lVar = this.j;
        k2.u uVar = this.k;
        Objects.requireNonNull(uVar);
        k kVar = new k(tVar, j3, i10, i11, i12, lVar, new a(uVar));
        this.w = kVar;
        synchronized (kVar) {
            if (kVar.u) {
                surface = kVar.p;
            } else {
                kVar.k();
                long nanoTime = System.nanoTime();
                try {
                    kVar.b();
                    kVar.a();
                    kVar.m.start();
                    kVar.u = true;
                    kVar.f.b("codecs prepared: video=" + kVar.m.getName() + ", audio=" + kVar.n.getName() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
                    surface = kVar.p;
                } catch (IOException | RuntimeException e) {
                    kVar.i();
                    throw e;
                }
            }
        }
        Surface surface3 = surface;
        Size size = this.r;
        int i13 = this.e;
        int i14 = this.s;
        boolean o9 = o();
        boolean z10 = this.i;
        l lVar2 = this.j;
        k kVar2 = this.w;
        k2.u uVar2 = this.k;
        Objects.requireNonNull(uVar2);
        q qVar = new q(size, surface3, i13, i14, o9, z10, lVar2, kVar2, new a(uVar2));
        this.v = qVar;
        qVar.X = new b(this, 0);
        q qVar2 = this.v;
        if (qVar2.V) {
            surface2 = qVar2.n;
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            HandlerThread handlerThread = new HandlerThread("RoundVideoGlProcessor");
            qVar2.k = handlerThread;
            handlerThread.start();
            qVar2.U = System.nanoTime();
            l lVar3 = qVar2.e;
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
            lVar3.b(sb2.toString());
            Handler handler = new Handler(qVar2.k.getLooper());
            qVar2.l = handler;
            handler.post(new x1(29, qVar2, countDownLatch));
            try {
                countDownLatch.await();
                if (qVar2.Z != null) {
                    RuntimeException runtimeException = qVar2.Z;
                    qVar2.Z = null;
                    qVar2.g();
                    throw runtimeException;
                }
                surface2 = qVar2.n;
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                qVar2.g();
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
    public final CaptureRequest.Builder k(boolean z10) {
        int[] iArr;
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
        l lVar = this.j;
        Range range2 = this.G;
        if (range2 != null) {
            createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
            if (z10) {
                lVar.b("capture FPS range selected: " + this.G);
            }
        } else if (z10) {
            lVar.b("capture FPS range unavailable; HAL default will be used");
        }
        float z11 = e2.z(this.K, 1.0f, this.J, 1.0f);
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
                boolean z12 = !this.L && p();
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
                if (this.M) {
                    this.j.b("torch request configured: requested=" + this.L + ", applied=" + z12 + ", aeMode=" + createCaptureRequest.get(CaptureRequest.CONTROL_AE_MODE) + ", flashMode=" + createCaptureRequest.get(key2) + ", cameraId=" + this.o);
                }
                int i12 = this.P + 1;
                this.P = i12;
                createCaptureRequest.setTag(Integer.valueOf(i12));
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
            this.l.set(centerX, centerY, max + centerX, max2 + centerY);
            createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.l);
        }
        if (this.L) {
        }
        CameraCharacteristics cameraCharacteristics32 = this.p;
        if (cameraCharacteristics32 != null) {
        }
        if (iArr != null) {
        }
        CaptureRequest.Key key22 = CaptureRequest.FLASH_MODE;
        createCaptureRequest.set(key22, Integer.valueOf(z12 ? 2 : 0));
        if (this.M) {
        }
        int i122 = this.P + 1;
        this.P = i122;
        createCaptureRequest.setTag(Integer.valueOf(i122));
        if (this.M) {
        }
        return createCaptureRequest;
    }

    public final void m(String str, Exception exc) {
        String str2;
        boolean z10;
        if (this.b0) {
            if (exc == null) {
                exc = new IllegalStateException("30 fps fallback session failed");
            }
            s(exc);
            return;
        }
        this.b0 = true;
        h();
        j6.l lVar = this.H;
        if (lVar == null) {
            s(new IllegalStateException("Regular camera fallback is unavailable", exc));
            return;
        }
        this.F = m0.b;
        CameraCharacteristics cameraCharacteristics = this.p;
        this.G = n(cameraCharacteristics == null ? null : (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES), 30);
        this.q = (Size) lVar.b;
        this.r = (Size) lVar.c;
        this.s = lVar.a;
        this.E = (l0) lVar.d;
        SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
        }
        k kVar = this.w;
        if (kVar != null) {
            synchronized (kVar) {
                z10 = kVar.v;
            }
            if (z10) {
                s(new IllegalStateException("Unable to change encoder frame rate after recording started", exc));
                return;
            }
        }
        q qVar = this.v;
        if (qVar != null) {
            qVar.g();
            this.v = null;
        }
        k kVar2 = this.w;
        if (kVar2 != null) {
            kVar2.o();
            this.w = null;
        }
        this.u = null;
        try {
            j();
            t();
            l lVar2 = this.j;
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
            lVar2.b(sb2.toString());
            Handler handler = this.n;
            if (!this.R || handler == null) {
                return;
            }
            handler.post(new b(this, 5));
        } catch (Exception e) {
            s(e);
        }
    }

    public final boolean o() {
        Integer num;
        CameraCharacteristics cameraCharacteristics = this.p;
        return (cameraCharacteristics == null || (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE)) == null || num.intValue() != 1) ? false : true;
    }

    public final boolean p() {
        CameraCharacteristics cameraCharacteristics;
        return this.C == k0.b && (cameraCharacteristics = this.p) != null && Boolean.TRUE.equals(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE));
    }

    public final void q() {
        if (this.R && !this.S && this.x == null) {
            if (f0.e.b(this.a, "android.permission.CAMERA") != 0) {
                s(new SecurityException("Camera permission is not granted"));
                return;
            }
            if (f0.e.b(this.a, "android.permission.RECORD_AUDIO") != 0) {
                s(new SecurityException("Audio recording permission is not granted"));
                return;
            }
            try {
                w(this.B);
                SurfaceTexture surfaceTexture = this.c.getSurfaceTexture();
                if (surfaceTexture == null) {
                    return;
                }
                surfaceTexture.setDefaultBufferSize(this.q.getWidth(), this.q.getHeight());
                if (this.t == null) {
                    this.t = new Surface(surfaceTexture);
                }
                if (this.w == null) {
                    j();
                } else {
                    q qVar = this.v;
                    if (qVar != null) {
                        qVar.i(this.r, this.s, o());
                        Surface surface = this.v.n;
                        if (surface == null) {
                            throw new IllegalStateException("GL processor is not started");
                        }
                        this.u = surface;
                    }
                }
                this.S = true;
                this.f0 = SystemClock.elapsedRealtimeNanos();
                this.j.b("camera open requested: id=" + this.o + ", preview=" + this.q + ", recording=" + this.r + ", crop=" + this.s);
                this.b.openCamera(this.o, this.O0, this.n);
            } catch (Exception e) {
                this.S = false;
                s(e);
            }
        }
    }

    public final void r() {
        this.R = false;
        this.c.setSurfaceTextureListener(null);
        this.c.removeOnLayoutChangeListener(this.L0);
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
        ((r0) uVar.b).h.post(new n(2, uVar, exc));
    }

    public final void t() {
        this.x0 = 0L;
        this.y0 = 0L;
        this.z0 = 0L;
        this.A0 = 0L;
        this.B0 = 0L;
        this.C0 = 0L;
        this.D0 = 0.0d;
        this.E0 = 0L;
        this.F0 = 0L;
        this.G0 = 0L;
        this.H0 = 0L;
        this.I0 = 0L;
        this.J0 = 0L;
        this.K0 = 0L;
    }

    public final void u() {
        this.i0 = 0L;
        this.j0 = 0L;
        this.k0 = 0L;
        this.l0 = 0L;
        this.m0 = 0L;
        this.n0 = 0L;
        this.o0 = 0.0d;
        this.p0 = 0L;
        this.q0 = 0L;
        this.r0 = 0L;
        this.s0 = 0L;
        this.t0 = 0L;
        this.u0 = 0L;
        this.v0 = 0L;
        this.w0 = 0L;
    }

    public final aa.a v(String str, CameraCharacteristics cameraCharacteristics, StreamConfigurationMap streamConfigurationMap, Size[] sizeArr, j6.l lVar) {
        Range[] rangeArr;
        Range[] rangeArr2;
        Size[] sizeArr2 = sizeArr;
        Range[] rangeArr3 = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        l lVar2 = this.j;
        m0 m0Var = this.h;
        m0 m0Var2 = m0.b;
        if (m0Var == m0Var2 || this.d0) {
            Range n10 = n(rangeArr3, 30);
            StringBuilder w10 = a4.a.w("fps selection: id=", str, ", requested=");
            w10.append(m0Var.a);
            w10.append(", mode=REGULAR, range=");
            w10.append(n10);
            w10.append(this.d0 ? ", reason=session-wide fallback" : "");
            lVar2.b(w10.toString());
            return new aa.a(m0Var2, n10, lVar, false, 27);
        }
        int i10 = m0Var.a;
        Range n11 = n(rangeArr3, i10);
        if (n11 != null) {
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
                j6.l d = d(sizeArr3, this.d, this.g);
                lVar2.b("fps selection: id=" + str + ", requested=" + i10 + ", mode=REGULAR, range=" + n11 + ", compatibleSizes=" + Arrays.toString(sizeArr3));
                return new aa.a(m0.c, n11, d, false, 27);
            } catch (RuntimeException unused) {
                lVar2.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: no compatible output pair, compatibleSizes=" + Arrays.toString(sizeArr3));
            }
        } else {
            rangeArr = rangeArr3;
            lVar2.b("fps selection: id=" + str + ", regular " + i10 + " fps rejected: advertisedRanges=" + Arrays.toString(rangeArr));
        }
        Range n12 = n(rangeArr, 30);
        lVar2.b("fps selection: id=" + str + ", requested=" + i10 + ", fallback=30, range=" + n12);
        return new aa.a(m0Var2, n12, lVar, false, 27);
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
    public final void w(k0 k0Var) {
        float floatValue;
        long outputMinFrameDuration;
        StreamConfigurationMap streamConfigurationMap;
        Size[] sizeArr;
        int i10;
        long j3;
        String str;
        CameraCharacteristics.Key key;
        k0 k0Var2;
        int i11;
        int i12;
        int i13;
        String[] strArr;
        cf.c cVar;
        cf.c cVar2;
        String str2;
        j6.l d;
        aa.a v;
        cf.c cVar3;
        m0 m0Var;
        k0 k0Var3 = k0.b;
        k0 k0Var4 = k0.a;
        if (!this.c0) {
            this.c0 = true;
            if (this.h == m0.c) {
                boolean D = D(k0Var4);
                boolean D2 = D(k0Var3);
                this.d0 = (D && D2) ? false : true;
                l lVar = this.j;
                StringBuilder sb2 = new StringBuilder("60 fps session capability: front=");
                sb2.append(D);
                sb2.append(", back=");
                sb2.append(D2);
                sb2.append(", selected=");
                sb2.append(this.d0 ? 30 : 60);
                lVar.b(sb2.toString());
            }
        }
        int i14 = k0Var == k0Var4 ? 0 : 1;
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
                k0Var2 = k0Var4;
                i11 = i14;
            } else {
                StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                i11 = i14;
                if (streamConfigurationMap2 == null) {
                    this.j.b("camera candidate rejected: id=" + str3 + ", reason=no stream map");
                    k0Var2 = k0Var4;
                } else {
                    Size[] outputSizes = streamConfigurationMap2.getOutputSizes(SurfaceTexture.class);
                    if (outputSizes == null || outputSizes.length == 0) {
                        k0Var2 = k0Var4;
                        strArr = cameraIdList;
                        i13 = length;
                        cVar2 = cVar6;
                        cVar = cVar7;
                        i12 = i16;
                        this.j.b("camera candidate rejected: id=" + str3 + ", reason=no SurfaceTexture outputs");
                    } else {
                        try {
                            try {
                                d = d(outputSizes, this.d, this.g);
                                k0Var2 = k0Var4;
                                strArr = cameraIdList;
                                i13 = length;
                                cVar2 = cVar6;
                                cVar = cVar7;
                                i12 = i16;
                                str3 = str3;
                                try {
                                    v = v(str3, cameraCharacteristics, streamConfigurationMap2, outputSizes, d);
                                } catch (RuntimeException e) {
                                    e = e;
                                }
                            } catch (RuntimeException e7) {
                                e = e7;
                                k0Var2 = k0Var4;
                                strArr = cameraIdList;
                                i13 = length;
                                cVar2 = cVar6;
                                cVar = cVar7;
                                i12 = i16;
                                str3 = str3;
                            }
                        } catch (RuntimeException e10) {
                            e = e10;
                            k0Var2 = k0Var4;
                            strArr = cameraIdList;
                            i13 = length;
                            cVar2 = cVar6;
                            cVar = cVar7;
                            i12 = i16;
                        }
                        try {
                            cVar3 = new cf.c(str3, cameraCharacteristics, outputSizes, d, v);
                            str3 = str3;
                            l lVar2 = this.j;
                            StringBuilder sb3 = new StringBuilder();
                            str2 = "camera candidate rejected: id=";
                            try {
                                sb3.append("camera candidate accepted: id=");
                                sb3.append(str3);
                                sb3.append(", facing=");
                                sb3.append(k0Var);
                                sb3.append(", flashAvailable=");
                                Boolean bool = Boolean.TRUE;
                                CameraCharacteristics.Key key2 = CameraCharacteristics.FLASH_INFO_AVAILABLE;
                                sb3.append(bool.equals(cameraCharacteristics.get(key2)));
                                sb3.append(", fps=");
                                sb3.append(((m0) v.b).a);
                                sb3.append(", preview=");
                                sb3.append((Size) ((j6.l) v.d).b);
                                sb3.append(", recording=");
                                sb3.append((Size) ((j6.l) v.d).c);
                                lVar2.b(sb3.toString());
                                if (cVar != null) {
                                }
                                cVar = cVar3;
                                m0Var = this.h;
                            } catch (RuntimeException e11) {
                                e = e11;
                                cVar5 = cVar;
                                this.j.b(str2 + str3 + ", reason=" + e);
                                cVar4 = cVar2;
                                i15 = i12 + 1;
                                i14 = i11;
                                cameraIdList = strArr;
                                length = i13;
                                k0Var4 = k0Var2;
                            }
                        } catch (RuntimeException e12) {
                            e = e12;
                            str3 = str3;
                            str2 = "camera candidate rejected: id=";
                            cVar5 = cVar;
                            this.j.b(str2 + str3 + ", reason=" + e);
                            cVar4 = cVar2;
                            i15 = i12 + 1;
                            i14 = i11;
                            cameraIdList = strArr;
                            length = i13;
                            k0Var4 = k0Var2;
                        }
                        if (m0Var == m0.b || ((m0) v.b) == m0Var) {
                            if (cVar2 != null) {
                            }
                            cVar4 = cVar3;
                            cVar5 = cVar;
                            i15 = i12 + 1;
                            i14 = i11;
                            cameraIdList = strArr;
                            length = i13;
                            k0Var4 = k0Var2;
                        }
                    }
                    cVar4 = cVar2;
                    cVar5 = cVar;
                    i15 = i12 + 1;
                    i14 = i11;
                    cameraIdList = strArr;
                    length = i13;
                    k0Var4 = k0Var2;
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
            k0Var4 = k0Var2;
        }
        cf.c cVar8 = cVar4;
        cf.c cVar9 = cVar5;
        k0 k0Var5 = k0Var4;
        if (cVar8 == null) {
            cVar8 = cVar9;
        }
        if (cVar8 == null) {
            throw new IllegalStateException("Requested camera is not available");
        }
        String str4 = (String) cVar8.a;
        CameraCharacteristics cameraCharacteristics2 = (CameraCharacteristics) cVar8.b;
        Size[] sizeArr2 = (Size[]) cVar8.c;
        j6.l lVar3 = (j6.l) cVar8.d;
        aa.a aVar = (aa.a) cVar8.e;
        j6.l lVar4 = (j6.l) aVar.d;
        this.o = str4;
        this.D = k0Var;
        this.p = cameraCharacteristics2;
        this.F = (m0) aVar.b;
        this.G = (Range) aVar.c;
        this.b0 = false;
        this.H = lVar3;
        t();
        this.q = (Size) lVar4.b;
        this.r = (Size) lVar4.c;
        this.s = lVar4.a;
        this.E = (l0) lVar4.d;
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
                    long outputMinFrameDuration2 = streamConfigurationMap.getOutputMinFrameDuration(SurfaceTexture.class, size2);
                    sizeArr = sizeArr2;
                    i10 = i17;
                    j3 = outputMinFrameDuration2;
                } catch (RuntimeException unused2) {
                }
                l lVar5 = this.j;
                Size[] sizeArr3 = sizeArr;
                int i18 = i10;
                StringBuilder sb4 = new StringBuilder("camera outputs selected: output=");
                sb4.append(this.e);
                sb4.append("x");
                sb4.append(this.e);
                sb4.append(", cameraMode=");
                sb4.append(this.E);
                if (this.E != this.g) {
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
                sb4.append(this.F.a);
                sb4.append(", fpsRange=");
                sb4.append(this.G);
                sb4.append(", timestampSource=");
                sb4.append(o() ? "REALTIME" : "UNKNOWN");
                sb4.append(this.F != this.h ? a4.a.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
                lVar5.b(sb4.toString());
                if (k0Var == k0Var5) {
                    if (this.Z) {
                        return;
                    } else {
                        this.Z = true;
                    }
                } else if (this.a0) {
                    return;
                } else {
                    this.a0 = true;
                }
                Integer num2 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                Integer num3 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
                Range[] rangeArr = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                int[] iArr = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
                Boolean bool2 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                Rect rect = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                l lVar6 = this.j;
                StringBuilder sb5 = new StringBuilder("camera capabilities: id=");
                sb5.append(str4);
                sb5.append(", facing=");
                sb5.append(k0Var);
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
                lVar6.b(sb5.toString());
            }
            sizeArr = sizeArr2;
            i10 = i17;
            j3 = -1;
            l lVar52 = this.j;
            Size[] sizeArr32 = sizeArr;
            int i182 = i10;
            StringBuilder sb42 = new StringBuilder("camera outputs selected: output=");
            sb42.append(this.e);
            sb42.append("x");
            sb42.append(this.e);
            sb42.append(", cameraMode=");
            sb42.append(this.E);
            if (this.E != this.g) {
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
            sb42.append(this.F.a);
            sb42.append(", fpsRange=");
            sb42.append(this.G);
            sb42.append(", timestampSource=");
            sb42.append(o() ? "REALTIME" : "UNKNOWN");
            sb42.append(this.F != this.h ? a4.a.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
            lVar52.b(sb42.toString());
            if (k0Var == k0Var5) {
            }
            Integer num22 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            Integer num32 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
            Range[] rangeArr2 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            int[] iArr2 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            Boolean bool22 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
            Rect rect2 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            l lVar62 = this.j;
            StringBuilder sb52 = new StringBuilder("camera capabilities: id=");
            sb52.append(str4);
            sb52.append(", facing=");
            sb52.append(k0Var);
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
            lVar62.b(sb52.toString());
        }
        outputMinFrameDuration = -1;
        Size size22 = this.r;
        streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics2.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
        }
        sizeArr = sizeArr2;
        i10 = i17;
        j3 = -1;
        l lVar522 = this.j;
        Size[] sizeArr322 = sizeArr;
        int i1822 = i10;
        StringBuilder sb422 = new StringBuilder("camera outputs selected: output=");
        sb422.append(this.e);
        sb422.append("x");
        sb422.append(this.e);
        sb422.append(", cameraMode=");
        sb422.append(this.E);
        if (this.E != this.g) {
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
        sb422.append(this.F.a);
        sb422.append(", fpsRange=");
        sb422.append(this.G);
        sb422.append(", timestampSource=");
        sb422.append(o() ? "REALTIME" : "UNKNOWN");
        sb422.append(this.F != this.h ? a4.a.o(this.h.a, ")", new StringBuilder(" (fallback from ")) : "");
        lVar522.b(sb422.toString());
        if (k0Var == k0Var5) {
        }
        Integer num222 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Integer num322 = (Integer) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Range[] rangeArr22 = (Range[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int[] iArr22 = (int[]) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        Boolean bool222 = (Boolean) cameraCharacteristics2.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        Rect rect22 = (Rect) cameraCharacteristics2.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        l lVar622 = this.j;
        StringBuilder sb522 = new StringBuilder("camera capabilities: id=");
        sb522.append(str4);
        sb522.append(", facing=");
        sb522.append(k0Var);
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
        lVar622.b(sb522.toString());
    }

    public final void x(boolean z10) {
        Handler handler = this.n;
        if (!this.R || handler == null) {
            return;
        }
        handler.post(new bi.f(8, this, z10));
    }

    public final boolean y(float f7) {
        this.J = Math.max(0.0f, Math.min(1.0f, f7));
        Handler handler = this.n;
        if (!this.R || handler == null) {
            return false;
        }
        handler.removeCallbacks(this.M0);
        handler.post(this.M0);
        return true;
    }
}
