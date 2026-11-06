package fi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class b1 extends CameraView {
    public static final int[] a0 = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    public final Matrix D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public long K;
    public final Matrix L;
    public a1 M;
    public a1 N;
    public final float[] O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public final float[] U;
    public float[] V;
    public float[] W;
    public boolean a;
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

    public b1(Context context, boolean z9) {
        super(context, z9, false);
        this.b = new PointF();
        this.c = new PointF();
        this.n = new Matrix();
        this.r = new Matrix();
        this.y = new Matrix();
        this.D = new Matrix();
        this.E = true;
        this.L = new Matrix();
        this.O = new float[2];
        new Matrix();
        this.U = new float[2];
        this.a = q(context);
    }

    private Matrix getSavedDualMatrix() {
        String string = qp.e1().getString("dualmatrix", null);
        if (string != null) {
            String[] split = string.split(";");
            if (split.length == 9) {
                float[] fArr = new float[9];
                for (int i7 = 0; i7 < split.length; i7++) {
                    try {
                        fArr[i7] = Float.parseFloat(split[i7]);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
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

    public static boolean p(Context context, boolean z9) {
        int i7 = 0;
        boolean z10 = true;
        boolean z11 = iz.o() >= 1 && Camera.getNumberOfCameras() > 1 && iz.b();
        if (!z11) {
            return z11;
        }
        boolean z12 = context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        if (z12 || !z9) {
            return z12;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        while (true) {
            if (i7 >= 32) {
                z10 = z12;
                break;
            }
            if (a0[i7] == hashCode) {
                break;
            }
            i7++;
        }
        if (!z10) {
            (Build.MANUFACTURER + Build.MODEL).toUpperCase().getClass();
        }
        return z10;
    }

    public static boolean q(Context context) {
        return qp.e1().getBoolean("dual_available", p(context, true));
    }

    public static void t(boolean z9) {
        boolean p10 = p(org.telegram.messenger.t0.b, false);
        if (qp.s1(p10.s0).I3) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(p10.s0).getCurrentTime();
                tL_inputAppEvent.type = "android_dual_camera";
                TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
                TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
                tL_jsonObjectValue.key = "device";
                TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
                tL_jsonString.value = "" + Build.MANUFACTURER + Build.MODEL;
                tL_jsonObjectValue.value = tL_jsonString;
                tL_jsonObject.value.add(tL_jsonObjectValue);
                tL_inputAppEvent.data = tL_jsonObject;
                tL_inputAppEvent.peer = (z9 ? 1 : 0) | (p10 ? 2 : 0);
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(p10.s0).sendRequest(tL_help_saveAppLog, new di.u5(4));
            } catch (Exception unused) {
            }
        }
        org.telegram.messenger.t0.a.getClass();
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void destroy(boolean z9, Runnable runnable) {
        v();
        super.destroy(z9, runnable);
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void onDualCameraSuccess() {
        v();
        if (this.H) {
            y9 y9Var = (y9) this;
            if (qp.e1().getInt("storysvddualhint", 0) < 2) {
                org.telegram.messenger.g0.i3(new h9(y9Var, 3), 340L);
            }
            va vaVar = y9Var.b0;
            vaVar.F0.setValue(y9Var.isDual());
            vaVar.F0.setContentDescription(hd.M0(y9Var.isDual() ? 2131754886 : 2131754887, null));
        }
        t(true);
    }

    @Override // org.telegram.messenger.camera.CameraView, org.telegram.messenger.camera.CameraController.ErrorCallback
    public final void onError(int i7, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!p(getContext(), false)) {
                SharedPreferences.Editor edit = qp.e1().edit();
                this.a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                String M0 = hd.M0(2131751341, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = hd.M0(2131751342, null);
                jg.g.C(null, 2131747830, alertDialog$Builder, null);
            }
            t(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        qp.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() == 0 && s(motionEvent.getX(), motionEvent.getY())) ? x(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Matrix matrix = this.y;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.D);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (this.E) {
            if (q(getContext()) && qp.e1().getBoolean("dualcam", p(org.telegram.messenger.t0.b, false))) {
                this.H = true;
                w();
                this.dual = true;
            }
            this.E = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i7, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || x(motionEvent);
    }

    public final void r(Matrix matrix) {
        float[] fArr = this.O;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.P = fArr[0];
        this.Q = fArr[1];
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.R = (float) Math.toDegrees(Math.atan2(fArr[1] - this.Q, fArr[0] - this.P));
        this.S = a8.r9.a(this.P, this.Q, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.T = a8.r9.a(this.P, this.Q, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean s(float f10, float f11) {
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.U;
        fArr[0] = f10;
        fArr[1] = f11;
        this.D.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.L;
        dualPosition.invert(matrix);
        matrix.mapPoints(fArr);
        int dualShape = getDualShape() % 3;
        float f12 = (dualShape == 0 || dualShape == 1 || dualShape == 3) ? 0.5625f : 1.0f;
        float f13 = fArr[0];
        if (f13 >= -1.0f && f13 <= 1.0f) {
            float f14 = fArr[1];
            if (f14 >= (-f12) && f14 <= f12) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public void toggleDual() {
        if (isDual() || this.a) {
            if (isDual()) {
                qp.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
            } else {
                w();
            }
            super.toggleDual();
        }
    }

    public abstract void u(boolean z9);

    public final void v() {
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            StringBuilder sb2 = new StringBuilder(qs.t1);
            sb2.append(fArr[0]);
            for (int i7 = 1; i7 < 9; i7++) {
                sb2.append(";");
                sb2.append(fArr[i7]);
            }
            edit.putString("dualmatrix", sb2.toString());
        } else {
            edit.remove("dualmatrix");
        }
        edit.apply();
    }

    public final void w() {
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
            dualPosition.postConcat(this.D);
        }
        updateDualPosition();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(MotionEvent motionEvent) {
        boolean z9;
        double d;
        float f10;
        boolean z10;
        float f11;
        Matrix matrix;
        float f12;
        float f13;
        float width;
        float f14;
        a1 a1Var;
        float f15;
        float f16;
        if (motionEvent.getAction() == 0) {
            this.K = System.currentTimeMillis();
            this.I = motionEvent.getX();
            this.J = motionEvent.getY();
            this.N = null;
            a1 a1Var2 = this.M;
            if (a1Var2 != null) {
                org.telegram.messenger.g0.r(a1Var2);
                this.M = null;
            }
            if (s(this.I, this.J)) {
                a1 a1Var3 = new a1(this, 0);
                this.M = a1Var3;
                org.telegram.messenger.g0.i3(a1Var3, ViewConfiguration.getLongPressTimeout());
                z9 = true;
                if (isDual()) {
                    return z9;
                }
                Matrix dualPosition = getDualPosition();
                boolean z11 = motionEvent.getPointerCount() > 1;
                PointF pointF = this.c;
                if (z11) {
                    pointF.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                    pointF.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                    f10 = a8.r9.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                    d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
                } else {
                    pointF.x = motionEvent.getX(0);
                    pointF.y = motionEvent.getY(0);
                    d = 0.0d;
                    f10 = 0.0f;
                }
                boolean z12 = this.f;
                PointF pointF2 = this.b;
                if (z12 != z11) {
                    pointF2.x = pointF.x;
                    pointF2.y = pointF.y;
                    this.d = f10;
                    this.e = d;
                    this.f = z11;
                }
                float f17 = pointF.x;
                float f18 = pointF.y;
                float f19 = pointF2.x;
                float f20 = pointF2.y;
                int action = motionEvent.getAction();
                Matrix matrix2 = this.n;
                if (action == 0) {
                    matrix2.set(dualPosition);
                    matrix2.postConcat(this.y);
                    this.w = 0.0f;
                    this.x = false;
                    float f21 = pointF.x;
                    f11 = 0.0f;
                    float f22 = pointF.y;
                    if (this.V == null) {
                        z10 = z9;
                        this.V = new float[8];
                    } else {
                        z10 = z9;
                    }
                    if (this.W == null) {
                        this.W = new float[8];
                    }
                    int dualShape = getDualShape() % 3;
                    if (dualShape != 0) {
                        f15 = 1.0f;
                        if (dualShape != 1 && dualShape != 3) {
                            f16 = 1.0f;
                            float[] fArr = this.V;
                            fArr[0] = -1.0f;
                            float f23 = -f16;
                            fArr[1] = f23;
                            fArr[2] = f15;
                            fArr[3] = f23;
                            fArr[4] = f15;
                            fArr[5] = f16;
                            fArr[6] = -1.0f;
                            fArr[7] = f16;
                            matrix2.mapPoints(this.W, fArr);
                            float[] fArr2 = this.W;
                            float f24 = fArr2[0] - fArr2[2];
                            float f25 = fArr2[1] - fArr2[3];
                            double sqrt = Math.sqrt((f25 * f25) + (f24 * f24));
                            float[] fArr3 = this.W;
                            float f26 = fArr3[2] - fArr3[4];
                            float f27 = fArr3[3] - fArr3[5];
                            double sqrt2 = Math.sqrt((f27 * f27) + (f26 * f26));
                            float[] fArr4 = this.W;
                            float f28 = fArr4[4] - fArr4[6];
                            float f29 = fArr4[5] - fArr4[7];
                            double sqrt3 = Math.sqrt((f29 * f29) + (f28 * f28));
                            float[] fArr5 = this.W;
                            float f30 = fArr5[6] - fArr5[0];
                            float f31 = fArr5[7] - fArr5[1];
                            double sqrt4 = Math.sqrt((f31 * f31) + (f30 * f30));
                            float[] fArr6 = this.W;
                            float f32 = fArr6[0] - f21;
                            float f33 = fArr6[1] - f22;
                            double sqrt5 = Math.sqrt((f33 * f33) + (f32 * f32));
                            float[] fArr7 = this.W;
                            float f34 = fArr7[2] - f21;
                            float f35 = fArr7[3] - f22;
                            double sqrt6 = Math.sqrt((f35 * f35) + (f34 * f34));
                            float[] fArr8 = this.W;
                            float f36 = fArr8[4] - f21;
                            float f37 = fArr8[5] - f22;
                            double sqrt7 = Math.sqrt((f37 * f37) + (f36 * f36));
                            float[] fArr9 = this.W;
                            float f38 = fArr9[6] - f21;
                            float f39 = fArr9[7] - f22;
                            double sqrt8 = Math.sqrt((f39 * f39) + (f38 * f38));
                            double d2 = ((sqrt + sqrt5) + sqrt6) / 2.0d;
                            double d10 = ((sqrt2 + sqrt6) + sqrt7) / 2.0d;
                            double d11 = ((sqrt3 + sqrt7) + sqrt8) / 2.0d;
                            double d12 = ((sqrt4 + sqrt8) + sqrt5) / 2.0d;
                            this.s = (Math.sqrt((d12 - sqrt5) * ((d12 - sqrt8) * ((d12 - sqrt4) * d12))) + (Math.sqrt((d11 - sqrt8) * ((d11 - sqrt7) * ((d11 - sqrt3) * d11))) + (Math.sqrt((d10 - sqrt7) * ((d10 - sqrt6) * ((d10 - sqrt2) * d10))) + Math.sqrt((d2 - sqrt6) * ((d2 - sqrt5) * ((d2 - sqrt) * d2)))))) - (sqrt * sqrt2) >= 1.0d;
                        }
                    } else {
                        f15 = 1.0f;
                    }
                    f16 = 0.5625f;
                    float[] fArr10 = this.V;
                    fArr10[0] = -1.0f;
                    float f232 = -f16;
                    fArr10[1] = f232;
                    fArr10[2] = f15;
                    fArr10[3] = f232;
                    fArr10[4] = f15;
                    fArr10[5] = f16;
                    fArr10[6] = -1.0f;
                    fArr10[7] = f16;
                    matrix2.mapPoints(this.W, fArr10);
                    float[] fArr22 = this.W;
                    float f242 = fArr22[0] - fArr22[2];
                    float f252 = fArr22[1] - fArr22[3];
                    double sqrt9 = Math.sqrt((f252 * f252) + (f242 * f242));
                    float[] fArr32 = this.W;
                    float f262 = fArr32[2] - fArr32[4];
                    float f272 = fArr32[3] - fArr32[5];
                    double sqrt22 = Math.sqrt((f272 * f272) + (f262 * f262));
                    float[] fArr42 = this.W;
                    float f282 = fArr42[4] - fArr42[6];
                    float f292 = fArr42[5] - fArr42[7];
                    double sqrt32 = Math.sqrt((f292 * f292) + (f282 * f282));
                    float[] fArr52 = this.W;
                    float f302 = fArr52[6] - fArr52[0];
                    float f312 = fArr52[7] - fArr52[1];
                    double sqrt42 = Math.sqrt((f312 * f312) + (f302 * f302));
                    float[] fArr62 = this.W;
                    float f322 = fArr62[0] - f21;
                    float f332 = fArr62[1] - f22;
                    double sqrt52 = Math.sqrt((f332 * f332) + (f322 * f322));
                    float[] fArr72 = this.W;
                    float f342 = fArr72[2] - f21;
                    float f352 = fArr72[3] - f22;
                    double sqrt62 = Math.sqrt((f352 * f352) + (f342 * f342));
                    float[] fArr82 = this.W;
                    float f362 = fArr82[4] - f21;
                    float f372 = fArr82[5] - f22;
                    double sqrt72 = Math.sqrt((f372 * f372) + (f362 * f362));
                    float[] fArr92 = this.W;
                    float f382 = fArr92[6] - f21;
                    float f392 = fArr92[7] - f22;
                    double sqrt82 = Math.sqrt((f392 * f392) + (f382 * f382));
                    double d22 = ((sqrt9 + sqrt52) + sqrt62) / 2.0d;
                    double d102 = ((sqrt22 + sqrt62) + sqrt72) / 2.0d;
                    double d112 = ((sqrt32 + sqrt72) + sqrt82) / 2.0d;
                    double d122 = ((sqrt42 + sqrt82) + sqrt52) / 2.0d;
                    this.s = (Math.sqrt((d122 - sqrt52) * ((d122 - sqrt82) * ((d122 - sqrt42) * d122))) + (Math.sqrt((d112 - sqrt82) * ((d112 - sqrt72) * ((d112 - sqrt32) * d112))) + (Math.sqrt((d102 - sqrt72) * ((d102 - sqrt62) * ((d102 - sqrt22) * d102))) + Math.sqrt((d22 - sqrt62) * ((d22 - sqrt52) * ((d22 - sqrt9) * d22)))))) - (sqrt9 * sqrt22) >= 1.0d;
                } else {
                    z10 = z9;
                    f11 = 0.0f;
                }
                if (motionEvent.getAction() == 2 && this.s) {
                    if (a8.r9.a(f17, f18, f19, f20) > org.telegram.messenger.g0.L(2.0f) && (a1Var = this.M) != null) {
                        org.telegram.messenger.g0.r(a1Var);
                        this.M = null;
                    }
                    if (motionEvent.getPointerCount() > 1) {
                        if (this.d != f11) {
                            r(matrix2);
                            float f40 = f10 / this.d;
                            if (this.S * f40 > getWidth() * 0.7f) {
                                width = getWidth() * 0.7f;
                                f14 = this.S;
                            } else {
                                if (this.S * f40 < getWidth() * 0.2f) {
                                    width = getWidth() * 0.2f;
                                    f14 = this.S;
                                }
                                matrix2.postScale(f40, f40, f17, f18);
                            }
                            f40 = width / f14;
                            matrix2.postScale(f40, f40, f17, f18);
                        }
                        matrix = matrix2;
                        float degrees = (float) Math.toDegrees(d - this.e);
                        float f41 = this.w + degrees;
                        this.w = f41;
                        if (this.h) {
                            f12 = 90.0f;
                        } else {
                            boolean z13 = Math.abs(f41) > 20.0f;
                            this.h = z13;
                            if (z13) {
                                f12 = 90.0f;
                            } else {
                                r(matrix);
                                f12 = 90.0f;
                                this.h = (((float) Math.round(this.R / 90.0f)) * 90.0f) - this.R > 20.0f;
                            }
                            if (!this.x) {
                                org.telegram.messenger.g0.c4(this);
                                this.x = true;
                            }
                        }
                        if (this.h) {
                            matrix.postRotate(degrees, f17, f18);
                        }
                    } else {
                        matrix = matrix2;
                        f12 = 90.0f;
                    }
                    matrix.postTranslate(f17 - f19, f18 - f20);
                    Matrix matrix3 = this.r;
                    matrix3.set(matrix);
                    r(matrix3);
                    float round = (Math.round(this.R / f12) * f12) - this.R;
                    if (this.h) {
                        if (Math.abs(round) < 5.0f) {
                            matrix3.postRotate(round, this.P, this.Q);
                            if (!this.x) {
                                org.telegram.messenger.g0.c4(this);
                                this.x = true;
                            }
                        } else {
                            this.x = false;
                        }
                    }
                    float f42 = this.P;
                    if (f42 < f11) {
                        f13 = f11;
                        matrix3.postTranslate(-f42, f13);
                    } else {
                        f13 = f11;
                        if (f42 > getWidth()) {
                            matrix3.postTranslate(getWidth() - this.P, f13);
                        }
                    }
                    float f43 = this.Q;
                    if (f43 < f13) {
                        matrix3.postTranslate(f13, -f43);
                    } else if (f43 > getHeight() - org.telegram.messenger.g0.L(150.0f)) {
                        matrix3.postTranslate(0.0f, (getHeight() - org.telegram.messenger.g0.L(150.0f)) - this.Q);
                    }
                    matrix3.postConcat(this.D);
                    dualPosition.set(matrix3);
                    updateDualPosition();
                    float f44 = this.Q;
                    boolean z14 = Math.min(f44, f44 - (this.T / 2.0f)) < ((float) org.telegram.messenger.g0.L(66.0f));
                    float f45 = this.Q;
                    boolean z15 = Math.max(f45, (this.T / 2.0f) + f45) > ((float) (getHeight() - org.telegram.messenger.g0.L(66.0f)));
                    if (this.F != z14) {
                        this.F = z14;
                        va vaVar = ((y9) this).b0;
                        vaVar.o1.a(true, z14, vaVar.i0);
                    }
                    if (this.G != z15) {
                        this.G = z15;
                        u(z15);
                    }
                }
                if (motionEvent.getAction() == 1) {
                    this.h = false;
                    this.w = 0.0f;
                    this.x = false;
                    invalidate();
                    this.s = false;
                    if (this.F) {
                        this.F = false;
                        va vaVar2 = ((y9) this).b0;
                        vaVar2.o1.a(true, false, vaVar2.i0);
                    }
                    if (this.G) {
                        this.G = false;
                        u(false);
                    }
                } else if (motionEvent.getAction() == 3) {
                    this.s = false;
                    if (this.F) {
                        this.F = false;
                        va vaVar3 = ((y9) this).b0;
                        vaVar3.o1.a(true, false, vaVar3.i0);
                    }
                    if (this.G) {
                        this.G = false;
                        u(false);
                    }
                }
                pointF2.x = pointF.x;
                pointF2.y = pointF.y;
                this.d = f10;
                this.e = d;
                return this.s || z10;
            }
        } else if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.K <= ViewConfiguration.getTapTimeout() && a8.r9.a(this.I, this.J, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.g0.L(10.0f)) {
                if (s(this.I, this.J)) {
                    switchCamera();
                    this.N = null;
                } else {
                    this.N = new a1(this, 1);
                }
            }
            this.K = -1L;
            a1 a1Var4 = this.M;
            if (a1Var4 != null) {
                org.telegram.messenger.g0.r(a1Var4);
                this.M = null;
            }
        } else if (motionEvent.getAction() == 3) {
            this.K = -1L;
            this.N = null;
            a1 a1Var5 = this.M;
            if (a1Var5 != null) {
                org.telegram.messenger.g0.r(a1Var5);
                this.M = null;
            }
        }
        z9 = false;
        if (isDual()) {
        }
    }
}
