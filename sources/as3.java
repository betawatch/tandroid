// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class as3 extends CameraView {
    public static final int[] b0 = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    public final Matrix E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public long L;
    public final Matrix M;
    public zr3 N;
    public zr3 O;
    public final float[] P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public final float[] V;
    public float[] W;
    public boolean a;
    public float[] a0;
    public final PointF b;
    public final PointF c;
    public float d;
    public double e;
    public boolean f;
    public boolean h;
    public final Matrix n;
    public final Matrix r;
    public boolean s;
    public float w;
    public boolean x;
    public final Matrix y;

    public as3(Context context, boolean z) {
        super(context, z, false);
        this.b = new PointF();
        this.c = new PointF();
        this.n = new Matrix();
        this.r = new Matrix();
        this.y = new Matrix();
        this.E = new Matrix();
        this.F = true;
        this.M = new Matrix();
        this.P = new float[2];
        this.V = new float[2];
        this.a = g0(context);
    }

    public static boolean f0(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        boolean z3 = xea.o() >= 1 && Camera.getNumberOfCameras() > 1 && xea.b();
        if (!z3) {
            return z3;
        }
        boolean z4 = context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        if (z4 || !z) {
            return z4;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        while (true) {
            if (i >= 32) {
                z2 = z4;
                break;
            }
            if (b0[i] == hashCode) {
                break;
            }
            i++;
        }
        if (!z2) {
            (Build.MANUFACTURER + Build.MODEL).toUpperCase().getClass();
        }
        return z2;
    }

    public static boolean g0(Context context) {
        return uc7.e1().getBoolean("dual_available", f0(context, true));
    }

    private Matrix getSavedDualMatrix() {
        String string = uc7.e1().getString("dualmatrix", null);
        if (string != null) {
            String[] split = string.split(";");
            if (split.length == 9) {
                float[] fArr = new float[9];
                for (int i = 0; i < split.length; i++) {
                    try {
                        fArr[i] = Float.parseFloat(split[i]);
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return null;
                    }
                }
                Matrix matrix = new Matrix();
                matrix.setValues(fArr);
                return matrix;
            }
        }
        return null;
    }

    public static void j0(boolean z) {
        byte b = 0;
        boolean f0 = f0(a.b, false);
        if (uc7.s1(yac.t0).k4.s3.f) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(yac.t0).getCurrentTime();
                tL_inputAppEvent.type = "android_dual_camera";
                TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
                TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
                tL_jsonObjectValue.key = "device";
                TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
                tL_jsonString.value = "" + Build.MANUFACTURER + Build.MODEL;
                tL_jsonObjectValue.value = tL_jsonString;
                tL_jsonObject.value.add(tL_jsonObjectValue);
                tL_inputAppEvent.data = tL_jsonObject;
                tL_inputAppEvent.peer = (z ? 1 : 0) | (f0 ? 2 : 0);
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(yac.t0).sendRequest(tL_help_saveAppLog, new xe2(b));
            } catch (Exception unused) {
            }
        }
        a.a.getClass();
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void destroy(boolean z, Runnable runnable) {
        l0();
        super.destroy(z, runnable);
    }

    public final void h0(Matrix matrix) {
        float[] fArr = this.P;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.Q = fArr[0];
        this.R = fArr[1];
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.S = (float) Math.toDegrees(Math.atan2(fArr[1] - this.R, fArr[0] - this.Q));
        this.T = dte.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.U = dte.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean i0(float f, float f2) {
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.V;
        fArr[0] = f;
        fArr[1] = f2;
        this.E.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.M;
        dualPosition.invert(matrix);
        matrix.mapPoints(fArr);
        int dualShape = getDualShape() % 3;
        float f3 = (dualShape == 0 || dualShape == 1 || dualShape == 3) ? 0.5625f : 1.0f;
        float f4 = fArr[0];
        if (f4 >= -1.0f && f4 <= 1.0f) {
            float f5 = fArr[1];
            if (f5 >= (-f3) && f5 <= f3) {
                return true;
            }
        }
        return false;
    }

    public abstract void k0(boolean z);

    public final void l0() {
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            StringBuilder sb = new StringBuilder(jn7.s1);
            sb.append(fArr[0]);
            for (int i = 1; i < 9; i++) {
                sb.append(";");
                sb.append(fArr[i]);
            }
            edit.putString("dualmatrix", sb.toString());
        } else {
            edit.remove("dualmatrix");
        }
        edit.apply();
    }

    public final void m0() {
        Matrix dualPosition = getDualPosition();
        dualPosition.reset();
        Matrix savedDualMatrix = getSavedDualMatrix();
        if (savedDualMatrix != null) {
            dualPosition.set(savedDualMatrix);
        } else {
            dualPosition.postConcat(this.y);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float min = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), (getMeasuredHeight() * 0.43f) / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - min) - measuredWidth, min);
            dualPosition.postConcat(this.E);
        }
        updateDualPosition();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n0(MotionEvent motionEvent) {
        boolean z;
        double d;
        float f;
        boolean z2;
        float f2;
        Matrix matrix;
        float f3;
        float f4;
        float width;
        float f5;
        zr3 zr3Var;
        float f6;
        float f7;
        if (motionEvent.getAction() == 0) {
            this.L = System.currentTimeMillis();
            this.J = motionEvent.getX();
            this.K = motionEvent.getY();
            this.O = null;
            zr3 zr3Var2 = this.N;
            if (zr3Var2 != null) {
                hl.r(zr3Var2);
                this.N = null;
            }
            if (i0(this.J, this.K)) {
                zr3 zr3Var3 = new zr3(this, (byte) 0);
                this.N = zr3Var3;
                hl.d3(zr3Var3, ViewConfiguration.getLongPressTimeout());
                z = true;
                if (isDual()) {
                    return z;
                }
                Matrix dualPosition = getDualPosition();
                boolean z3 = motionEvent.getPointerCount() > 1;
                PointF pointF = this.c;
                if (z3) {
                    pointF.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                    pointF.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                    f = dte.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                    d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
                } else {
                    pointF.x = motionEvent.getX(0);
                    pointF.y = motionEvent.getY(0);
                    d = 0.0d;
                    f = 0.0f;
                }
                boolean z4 = this.f;
                PointF pointF2 = this.b;
                if (z4 != z3) {
                    pointF2.x = pointF.x;
                    pointF2.y = pointF.y;
                    this.d = f;
                    this.e = d;
                    this.f = z3;
                }
                float f8 = pointF.x;
                float f9 = pointF.y;
                float f10 = pointF2.x;
                float f11 = pointF2.y;
                int action = motionEvent.getAction();
                Matrix matrix2 = this.n;
                if (action == 0) {
                    matrix2.set(dualPosition);
                    matrix2.postConcat(this.y);
                    this.w = 0.0f;
                    this.x = false;
                    float f12 = pointF.x;
                    f2 = 0.0f;
                    float f13 = pointF.y;
                    if (this.W == null) {
                        z2 = z;
                        this.W = new float[8];
                    } else {
                        z2 = z;
                    }
                    if (this.a0 == null) {
                        this.a0 = new float[8];
                    }
                    int dualShape = getDualShape() % 3;
                    if (dualShape != 0) {
                        f6 = 1.0f;
                        if (dualShape != 1 && dualShape != 3) {
                            f7 = 1.0f;
                            float[] fArr = this.W;
                            fArr[0] = -1.0f;
                            float f14 = -f7;
                            fArr[1] = f14;
                            fArr[2] = f6;
                            fArr[3] = f14;
                            fArr[4] = f6;
                            fArr[5] = f7;
                            fArr[6] = -1.0f;
                            fArr[7] = f7;
                            matrix2.mapPoints(this.a0, fArr);
                            float[] fArr2 = this.a0;
                            float f15 = fArr2[0] - fArr2[2];
                            float f16 = fArr2[1] - fArr2[3];
                            double sqrt = Math.sqrt((f16 * f16) + (f15 * f15));
                            float[] fArr3 = this.a0;
                            float f17 = fArr3[2] - fArr3[4];
                            float f18 = fArr3[3] - fArr3[5];
                            double sqrt2 = Math.sqrt((f18 * f18) + (f17 * f17));
                            float[] fArr4 = this.a0;
                            float f19 = fArr4[4] - fArr4[6];
                            float f20 = fArr4[5] - fArr4[7];
                            double sqrt3 = Math.sqrt((f20 * f20) + (f19 * f19));
                            float[] fArr5 = this.a0;
                            float f21 = fArr5[6] - fArr5[0];
                            float f22 = fArr5[7] - fArr5[1];
                            double sqrt4 = Math.sqrt((f22 * f22) + (f21 * f21));
                            float[] fArr6 = this.a0;
                            float f23 = fArr6[0] - f12;
                            float f24 = fArr6[1] - f13;
                            double sqrt5 = Math.sqrt((f24 * f24) + (f23 * f23));
                            float[] fArr7 = this.a0;
                            float f25 = fArr7[2] - f12;
                            float f26 = fArr7[3] - f13;
                            double sqrt6 = Math.sqrt((f26 * f26) + (f25 * f25));
                            float[] fArr8 = this.a0;
                            float f27 = fArr8[4] - f12;
                            float f28 = fArr8[5] - f13;
                            double sqrt7 = Math.sqrt((f28 * f28) + (f27 * f27));
                            float[] fArr9 = this.a0;
                            float f29 = fArr9[6] - f12;
                            float f30 = fArr9[7] - f13;
                            double sqrt8 = Math.sqrt((f30 * f30) + (f29 * f29));
                            double d2 = ((sqrt + sqrt5) + sqrt6) / 2.0d;
                            double d3 = ((sqrt2 + sqrt6) + sqrt7) / 2.0d;
                            double d4 = ((sqrt3 + sqrt7) + sqrt8) / 2.0d;
                            double d5 = ((sqrt4 + sqrt8) + sqrt5) / 2.0d;
                            this.s = (Math.sqrt((d5 - sqrt5) * ((d5 - sqrt8) * ((d5 - sqrt4) * d5))) + (Math.sqrt((d4 - sqrt8) * ((d4 - sqrt7) * ((d4 - sqrt3) * d4))) + (Math.sqrt((d3 - sqrt7) * ((d3 - sqrt6) * ((d3 - sqrt2) * d3))) + Math.sqrt((d2 - sqrt6) * ((d2 - sqrt5) * ((d2 - sqrt) * d2)))))) - (sqrt * sqrt2) >= 1.0d;
                        }
                    } else {
                        f6 = 1.0f;
                    }
                    f7 = 0.5625f;
                    float[] fArr10 = this.W;
                    fArr10[0] = -1.0f;
                    float f142 = -f7;
                    fArr10[1] = f142;
                    fArr10[2] = f6;
                    fArr10[3] = f142;
                    fArr10[4] = f6;
                    fArr10[5] = f7;
                    fArr10[6] = -1.0f;
                    fArr10[7] = f7;
                    matrix2.mapPoints(this.a0, fArr10);
                    float[] fArr22 = this.a0;
                    float f152 = fArr22[0] - fArr22[2];
                    float f162 = fArr22[1] - fArr22[3];
                    double sqrt9 = Math.sqrt((f162 * f162) + (f152 * f152));
                    float[] fArr32 = this.a0;
                    float f172 = fArr32[2] - fArr32[4];
                    float f182 = fArr32[3] - fArr32[5];
                    double sqrt22 = Math.sqrt((f182 * f182) + (f172 * f172));
                    float[] fArr42 = this.a0;
                    float f192 = fArr42[4] - fArr42[6];
                    float f202 = fArr42[5] - fArr42[7];
                    double sqrt32 = Math.sqrt((f202 * f202) + (f192 * f192));
                    float[] fArr52 = this.a0;
                    float f212 = fArr52[6] - fArr52[0];
                    float f222 = fArr52[7] - fArr52[1];
                    double sqrt42 = Math.sqrt((f222 * f222) + (f212 * f212));
                    float[] fArr62 = this.a0;
                    float f232 = fArr62[0] - f12;
                    float f242 = fArr62[1] - f13;
                    double sqrt52 = Math.sqrt((f242 * f242) + (f232 * f232));
                    float[] fArr72 = this.a0;
                    float f252 = fArr72[2] - f12;
                    float f262 = fArr72[3] - f13;
                    double sqrt62 = Math.sqrt((f262 * f262) + (f252 * f252));
                    float[] fArr82 = this.a0;
                    float f272 = fArr82[4] - f12;
                    float f282 = fArr82[5] - f13;
                    double sqrt72 = Math.sqrt((f282 * f282) + (f272 * f272));
                    float[] fArr92 = this.a0;
                    float f292 = fArr92[6] - f12;
                    float f302 = fArr92[7] - f13;
                    double sqrt82 = Math.sqrt((f302 * f302) + (f292 * f292));
                    double d22 = ((sqrt9 + sqrt52) + sqrt62) / 2.0d;
                    double d32 = ((sqrt22 + sqrt62) + sqrt72) / 2.0d;
                    double d42 = ((sqrt32 + sqrt72) + sqrt82) / 2.0d;
                    double d52 = ((sqrt42 + sqrt82) + sqrt52) / 2.0d;
                    this.s = (Math.sqrt((d52 - sqrt52) * ((d52 - sqrt82) * ((d52 - sqrt42) * d52))) + (Math.sqrt((d42 - sqrt82) * ((d42 - sqrt72) * ((d42 - sqrt32) * d42))) + (Math.sqrt((d32 - sqrt72) * ((d32 - sqrt62) * ((d32 - sqrt22) * d32))) + Math.sqrt((d22 - sqrt62) * ((d22 - sqrt52) * ((d22 - sqrt9) * d22)))))) - (sqrt9 * sqrt22) >= 1.0d;
                } else {
                    z2 = z;
                    f2 = 0.0f;
                }
                if (motionEvent.getAction() == 2 && this.s) {
                    if (dte.a(f8, f9, f10, f11) > hl.L(2.0f) && (zr3Var = this.N) != null) {
                        hl.r(zr3Var);
                        this.N = null;
                    }
                    if (motionEvent.getPointerCount() > 1) {
                        if (this.d != f2) {
                            h0(matrix2);
                            float f31 = f / this.d;
                            if (this.T * f31 > getWidth() * 0.7f) {
                                width = getWidth() * 0.7f;
                                f5 = this.T;
                            } else {
                                if (this.T * f31 < getWidth() * 0.2f) {
                                    width = getWidth() * 0.2f;
                                    f5 = this.T;
                                }
                                matrix2.postScale(f31, f31, f8, f9);
                            }
                            f31 = width / f5;
                            matrix2.postScale(f31, f31, f8, f9);
                        }
                        matrix = matrix2;
                        float degrees = (float) Math.toDegrees(d - this.e);
                        float f32 = this.w + degrees;
                        this.w = f32;
                        if (this.h) {
                            f3 = 90.0f;
                        } else {
                            boolean z5 = Math.abs(f32) > 20.0f;
                            this.h = z5;
                            if (z5) {
                                f3 = 90.0f;
                            } else {
                                h0(matrix);
                                f3 = 90.0f;
                                this.h = (((float) Math.round(this.S / 90.0f)) * 90.0f) - this.S > 20.0f;
                            }
                            if (!this.x) {
                                hl.W3(this);
                                this.x = true;
                            }
                        }
                        if (this.h) {
                            matrix.postRotate(degrees, f8, f9);
                        }
                    } else {
                        matrix = matrix2;
                        f3 = 90.0f;
                    }
                    matrix.postTranslate(f8 - f10, f9 - f11);
                    Matrix matrix3 = this.r;
                    matrix3.set(matrix);
                    h0(matrix3);
                    float round = (Math.round(this.S / f3) * f3) - this.S;
                    if (this.h) {
                        if (Math.abs(round) < 5.0f) {
                            matrix3.postRotate(round, this.Q, this.R);
                            if (!this.x) {
                                hl.W3(this);
                                this.x = true;
                            }
                        } else {
                            this.x = false;
                        }
                    }
                    float f33 = this.Q;
                    if (f33 < f2) {
                        f4 = f2;
                        matrix3.postTranslate(-f33, f4);
                    } else {
                        f4 = f2;
                        if (f33 > getWidth()) {
                            matrix3.postTranslate(getWidth() - this.Q, f4);
                        }
                    }
                    float f34 = this.R;
                    if (f34 < f4) {
                        matrix3.postTranslate(f4, -f34);
                    } else if (f34 > getHeight() - hl.L(150.0f)) {
                        matrix3.postTranslate(0.0f, (getHeight() - hl.L(150.0f)) - this.R);
                    }
                    matrix3.postConcat(this.E);
                    dualPosition.set(matrix3);
                    updateDualPosition();
                    float f35 = this.R;
                    boolean z6 = Math.min(f35, f35 - (this.U / 2.0f)) < ((float) hl.L(66.0f));
                    float f36 = this.R;
                    boolean z7 = Math.max(f36, (this.U / 2.0f) + f36) > ((float) (getHeight() - hl.L(66.0f)));
                    if (this.G != z6) {
                        this.G = z6;
                        rbb rbbVar = ((wab) this).c0;
                        rbbVar.p1.a(true, z6, rbbVar.j0);
                    }
                    if (this.H != z7) {
                        this.H = z7;
                        k0(z7);
                    }
                }
                if (motionEvent.getAction() == 1) {
                    this.h = false;
                    this.w = 0.0f;
                    this.x = false;
                    invalidate();
                    this.s = false;
                    if (this.G) {
                        this.G = false;
                        rbb rbbVar2 = ((wab) this).c0;
                        rbbVar2.p1.a(true, false, rbbVar2.j0);
                    }
                    if (this.H) {
                        this.H = false;
                        k0(false);
                    }
                } else if (motionEvent.getAction() == 3) {
                    this.s = false;
                    if (this.G) {
                        this.G = false;
                        rbb rbbVar3 = ((wab) this).c0;
                        rbbVar3.p1.a(true, false, rbbVar3.j0);
                    }
                    if (this.H) {
                        this.H = false;
                        k0(false);
                    }
                }
                pointF2.x = pointF.x;
                pointF2.y = pointF.y;
                this.d = f;
                this.e = d;
                return this.s || z2;
            }
        } else if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.L <= ViewConfiguration.getTapTimeout() && dte.a(this.J, this.K, motionEvent.getX(), motionEvent.getY()) < hl.L(10.0f)) {
                if (i0(this.J, this.K)) {
                    switchCamera();
                    this.O = null;
                } else {
                    this.O = new zr3(this, (byte) 1);
                }
            }
            this.L = -1L;
            zr3 zr3Var4 = this.N;
            if (zr3Var4 != null) {
                hl.r(zr3Var4);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 3) {
            this.L = -1L;
            this.O = null;
            zr3 zr3Var5 = this.N;
            if (zr3Var5 != null) {
                hl.r(zr3Var5);
                this.N = null;
            }
        }
        z = false;
        if (isDual()) {
        }
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void onDualCameraSuccess() {
        l0();
        if (this.I) {
            wab wabVar = (wab) this;
            if (uc7.e1().getInt("storysvddualhint", 0) < 2) {
                hl.d3(new s8b(wabVar, (byte) 5), 340L);
            }
            rbb rbbVar = wabVar.c0;
            rbbVar.G0.setValue(wabVar.isDual());
            rbbVar.G0.setContentDescription(ob6.M0(wabVar.isDual() ? 2131754882 : 2131754883, null));
        }
        j0(true);
    }

    @Override // org.telegram.messenger.camera.CameraView, org.telegram.messenger.camera.CameraController.ErrorCallback
    public final void onError(int i, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!f0(getContext(), false)) {
                SharedPreferences.Editor edit = uc7.e1().edit();
                this.a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                String M0 = ob6.M0(2131751305, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131751306, null);
                c00.u(null, 2131747558, alertDialog$Builder, null);
            }
            j0(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        uc7.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() == 0 && i0(motionEvent.getX(), motionEvent.getY())) ? n0(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Matrix matrix = this.y;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.E);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.F) {
            if (g0(getContext()) && uc7.e1().getBoolean("dualcam", f0(a.b, false))) {
                this.I = true;
                m0();
                this.dual = true;
            }
            this.F = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || n0(motionEvent);
    }

    @Override // org.telegram.messenger.camera.CameraView
    public void toggleDual() {
        if (isDual() || this.a) {
            if (isDual()) {
                uc7.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
            } else {
                m0();
            }
            super.toggleDual();
        }
    }
}
