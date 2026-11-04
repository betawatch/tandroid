package gi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class b1 extends CameraView {
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
    public a1 N;
    public a1 O;
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

    public b1(Context context, boolean z10) {
        super(context, z10, false);
        this.b = new PointF();
        this.c = new PointF();
        this.n = new Matrix();
        this.r = new Matrix();
        this.y = new Matrix();
        this.E = new Matrix();
        this.F = true;
        this.M = new Matrix();
        this.P = new float[2];
        new Matrix();
        this.V = new float[2];
        this.a = q(context);
    }

    private Matrix getSavedDualMatrix() {
        String string = hp.e1().getString("dualmatrix", null);
        if (string != null) {
            String[] split = string.split(";");
            if (split.length == 9) {
                float[] fArr = new float[9];
                for (int i3 = 0; i3 < split.length; i3++) {
                    try {
                        fArr[i3] = Float.parseFloat(split[i3]);
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

    public static boolean p(Context context, boolean z10) {
        int i3 = 0;
        boolean z11 = true;
        boolean z12 = az.o() >= 1 && Camera.getNumberOfCameras() > 1 && az.b();
        if (!z12) {
            return z12;
        }
        boolean z13 = context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        if (z13 || !z10) {
            return z13;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        while (true) {
            if (i3 >= 32) {
                z11 = z13;
                break;
            }
            if (b0[i3] == hashCode) {
                break;
            }
            i3++;
        }
        if (!z11) {
            (Build.MANUFACTURER + Build.MODEL).toUpperCase().getClass();
        }
        return z11;
    }

    public static boolean q(Context context) {
        return hp.e1().getBoolean("dual_available", p(context, true));
    }

    public static void t(boolean z10) {
        boolean p10 = p(org.telegram.messenger.t0.b, false);
        if (hp.s1(h10.t0).J3) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(h10.t0).getCurrentTime();
                tL_inputAppEvent.type = "android_dual_camera";
                TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
                TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
                tL_jsonObjectValue.key = "device";
                TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
                tL_jsonString.value = "" + Build.MANUFACTURER + Build.MODEL;
                tL_jsonObjectValue.value = tL_jsonString;
                tL_jsonObject.value.add(tL_jsonObjectValue);
                tL_inputAppEvent.data = tL_jsonObject;
                tL_inputAppEvent.peer = (z10 ? 1 : 0) | (p10 ? 2 : 0);
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(h10.t0).sendRequest(tL_help_saveAppLog, new ei.u5(4));
            } catch (Exception unused) {
            }
        }
        org.telegram.messenger.t0.a.getClass();
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void destroy(boolean z10, Runnable runnable) {
        v();
        super.destroy(z10, runnable);
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void onDualCameraSuccess() {
        v();
        if (this.I) {
            y9 y9Var = (y9) this;
            if (hp.e1().getInt("storysvddualhint", 0) < 2) {
                org.telegram.messenger.g0.i3(new f6(y9Var, 7), 340L);
            }
            va vaVar = y9Var.c0;
            vaVar.G0.setValue(y9Var.isDual());
            vaVar.G0.setContentDescription(bd.M0(y9Var.isDual() ? 2131754886 : 2131754887, null));
        }
        t(true);
    }

    @Override // org.telegram.messenger.camera.CameraView, org.telegram.messenger.camera.CameraController.ErrorCallback
    public final void onError(int i3, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!p(getContext(), false)) {
                SharedPreferences.Editor edit = hp.e1().edit();
                this.a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                String M0 = bd.M0(2131751341, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131751342, null);
                k2.p1.B(null, 2131747839, alertDialog$Builder, null);
            }
            t(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        hp.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() == 0 && s(motionEvent.getX(), motionEvent.getY())) ? x(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        Matrix matrix = this.y;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.E);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        if (this.F) {
            if (q(getContext()) && hp.e1().getBoolean("dualcam", p(org.telegram.messenger.t0.b, false))) {
                this.I = true;
                w();
                this.dual = true;
            }
            this.F = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i3, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || x(motionEvent);
    }

    public final void r(Matrix matrix) {
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
        this.T = a7.h.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.U = a7.h.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean s(float f10, float f11) {
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.V;
        fArr[0] = f10;
        fArr[1] = f11;
        this.E.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.M;
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
                hp.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
            } else {
                w();
            }
            super.toggleDual();
        }
    }

    public abstract void u(boolean z10);

    public final void v() {
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            StringBuilder sb2 = new StringBuilder(hs.t1);
            sb2.append(fArr[0]);
            for (int i3 = 1; i3 < 9; i3++) {
                sb2.append(";");
                sb2.append(fArr[i3]);
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
            dualPosition.postConcat(this.E);
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
        boolean z10;
        double d;
        float f10;
        boolean z11;
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
            this.L = System.currentTimeMillis();
            this.J = motionEvent.getX();
            this.K = motionEvent.getY();
            this.O = null;
            a1 a1Var2 = this.N;
            if (a1Var2 != null) {
                org.telegram.messenger.g0.r(a1Var2);
                this.N = null;
            }
            if (s(this.J, this.K)) {
                a1 a1Var3 = new a1(this, 0);
                this.N = a1Var3;
                org.telegram.messenger.g0.i3(a1Var3, ViewConfiguration.getLongPressTimeout());
                z10 = true;
                if (isDual()) {
                    return z10;
                }
                Matrix dualPosition = getDualPosition();
                boolean z12 = motionEvent.getPointerCount() > 1;
                PointF pointF = this.c;
                if (z12) {
                    pointF.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                    pointF.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                    f10 = a7.h.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                    d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
                } else {
                    pointF.x = motionEvent.getX(0);
                    pointF.y = motionEvent.getY(0);
                    d = 0.0d;
                    f10 = 0.0f;
                }
                boolean z13 = this.f;
                PointF pointF2 = this.b;
                if (z13 != z12) {
                    pointF2.x = pointF.x;
                    pointF2.y = pointF.y;
                    this.d = f10;
                    this.e = d;
                    this.f = z12;
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
                    if (this.W == null) {
                        z11 = z10;
                        this.W = new float[8];
                    } else {
                        z11 = z10;
                    }
                    if (this.a0 == null) {
                        this.a0 = new float[8];
                    }
                    int dualShape = getDualShape() % 3;
                    if (dualShape != 0) {
                        f15 = 1.0f;
                        if (dualShape != 1 && dualShape != 3) {
                            f16 = 1.0f;
                            float[] fArr = this.W;
                            fArr[0] = -1.0f;
                            float f23 = -f16;
                            fArr[1] = f23;
                            fArr[2] = f15;
                            fArr[3] = f23;
                            fArr[4] = f15;
                            fArr[5] = f16;
                            fArr[6] = -1.0f;
                            fArr[7] = f16;
                            matrix2.mapPoints(this.a0, fArr);
                            float[] fArr2 = this.a0;
                            float f24 = fArr2[0] - fArr2[2];
                            float f25 = fArr2[1] - fArr2[3];
                            double sqrt = Math.sqrt((f25 * f25) + (f24 * f24));
                            float[] fArr3 = this.a0;
                            float f26 = fArr3[2] - fArr3[4];
                            float f27 = fArr3[3] - fArr3[5];
                            double sqrt2 = Math.sqrt((f27 * f27) + (f26 * f26));
                            float[] fArr4 = this.a0;
                            float f28 = fArr4[4] - fArr4[6];
                            float f29 = fArr4[5] - fArr4[7];
                            double sqrt3 = Math.sqrt((f29 * f29) + (f28 * f28));
                            float[] fArr5 = this.a0;
                            float f30 = fArr5[6] - fArr5[0];
                            float f31 = fArr5[7] - fArr5[1];
                            double sqrt4 = Math.sqrt((f31 * f31) + (f30 * f30));
                            float[] fArr6 = this.a0;
                            float f32 = fArr6[0] - f21;
                            float f33 = fArr6[1] - f22;
                            double sqrt5 = Math.sqrt((f33 * f33) + (f32 * f32));
                            float[] fArr7 = this.a0;
                            float f34 = fArr7[2] - f21;
                            float f35 = fArr7[3] - f22;
                            double sqrt6 = Math.sqrt((f35 * f35) + (f34 * f34));
                            float[] fArr8 = this.a0;
                            float f36 = fArr8[4] - f21;
                            float f37 = fArr8[5] - f22;
                            double sqrt7 = Math.sqrt((f37 * f37) + (f36 * f36));
                            float[] fArr9 = this.a0;
                            float f38 = fArr9[6] - f21;
                            float f39 = fArr9[7] - f22;
                            double sqrt8 = Math.sqrt((f39 * f39) + (f38 * f38));
                            double d10 = ((sqrt + sqrt5) + sqrt6) / 2.0d;
                            double d11 = ((sqrt2 + sqrt6) + sqrt7) / 2.0d;
                            double d12 = ((sqrt3 + sqrt7) + sqrt8) / 2.0d;
                            double d13 = ((sqrt4 + sqrt8) + sqrt5) / 2.0d;
                            this.s = (Math.sqrt((d13 - sqrt5) * ((d13 - sqrt8) * ((d13 - sqrt4) * d13))) + (Math.sqrt((d12 - sqrt8) * ((d12 - sqrt7) * ((d12 - sqrt3) * d12))) + (Math.sqrt((d11 - sqrt7) * ((d11 - sqrt6) * ((d11 - sqrt2) * d11))) + Math.sqrt((d10 - sqrt6) * ((d10 - sqrt5) * ((d10 - sqrt) * d10)))))) - (sqrt * sqrt2) >= 1.0d;
                        }
                    } else {
                        f15 = 1.0f;
                    }
                    f16 = 0.5625f;
                    float[] fArr10 = this.W;
                    fArr10[0] = -1.0f;
                    float f232 = -f16;
                    fArr10[1] = f232;
                    fArr10[2] = f15;
                    fArr10[3] = f232;
                    fArr10[4] = f15;
                    fArr10[5] = f16;
                    fArr10[6] = -1.0f;
                    fArr10[7] = f16;
                    matrix2.mapPoints(this.a0, fArr10);
                    float[] fArr22 = this.a0;
                    float f242 = fArr22[0] - fArr22[2];
                    float f252 = fArr22[1] - fArr22[3];
                    double sqrt9 = Math.sqrt((f252 * f252) + (f242 * f242));
                    float[] fArr32 = this.a0;
                    float f262 = fArr32[2] - fArr32[4];
                    float f272 = fArr32[3] - fArr32[5];
                    double sqrt22 = Math.sqrt((f272 * f272) + (f262 * f262));
                    float[] fArr42 = this.a0;
                    float f282 = fArr42[4] - fArr42[6];
                    float f292 = fArr42[5] - fArr42[7];
                    double sqrt32 = Math.sqrt((f292 * f292) + (f282 * f282));
                    float[] fArr52 = this.a0;
                    float f302 = fArr52[6] - fArr52[0];
                    float f312 = fArr52[7] - fArr52[1];
                    double sqrt42 = Math.sqrt((f312 * f312) + (f302 * f302));
                    float[] fArr62 = this.a0;
                    float f322 = fArr62[0] - f21;
                    float f332 = fArr62[1] - f22;
                    double sqrt52 = Math.sqrt((f332 * f332) + (f322 * f322));
                    float[] fArr72 = this.a0;
                    float f342 = fArr72[2] - f21;
                    float f352 = fArr72[3] - f22;
                    double sqrt62 = Math.sqrt((f352 * f352) + (f342 * f342));
                    float[] fArr82 = this.a0;
                    float f362 = fArr82[4] - f21;
                    float f372 = fArr82[5] - f22;
                    double sqrt72 = Math.sqrt((f372 * f372) + (f362 * f362));
                    float[] fArr92 = this.a0;
                    float f382 = fArr92[6] - f21;
                    float f392 = fArr92[7] - f22;
                    double sqrt82 = Math.sqrt((f392 * f392) + (f382 * f382));
                    double d102 = ((sqrt9 + sqrt52) + sqrt62) / 2.0d;
                    double d112 = ((sqrt22 + sqrt62) + sqrt72) / 2.0d;
                    double d122 = ((sqrt32 + sqrt72) + sqrt82) / 2.0d;
                    double d132 = ((sqrt42 + sqrt82) + sqrt52) / 2.0d;
                    this.s = (Math.sqrt((d132 - sqrt52) * ((d132 - sqrt82) * ((d132 - sqrt42) * d132))) + (Math.sqrt((d122 - sqrt82) * ((d122 - sqrt72) * ((d122 - sqrt32) * d122))) + (Math.sqrt((d112 - sqrt72) * ((d112 - sqrt62) * ((d112 - sqrt22) * d112))) + Math.sqrt((d102 - sqrt62) * ((d102 - sqrt52) * ((d102 - sqrt9) * d102)))))) - (sqrt9 * sqrt22) >= 1.0d;
                } else {
                    z11 = z10;
                    f11 = 0.0f;
                }
                if (motionEvent.getAction() == 2 && this.s) {
                    if (a7.h.a(f17, f18, f19, f20) > org.telegram.messenger.g0.L(2.0f) && (a1Var = this.N) != null) {
                        org.telegram.messenger.g0.r(a1Var);
                        this.N = null;
                    }
                    if (motionEvent.getPointerCount() > 1) {
                        if (this.d != f11) {
                            r(matrix2);
                            float f40 = f10 / this.d;
                            if (this.T * f40 > getWidth() * 0.7f) {
                                width = getWidth() * 0.7f;
                                f14 = this.T;
                            } else {
                                if (this.T * f40 < getWidth() * 0.2f) {
                                    width = getWidth() * 0.2f;
                                    f14 = this.T;
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
                            boolean z14 = Math.abs(f41) > 20.0f;
                            this.h = z14;
                            if (z14) {
                                f12 = 90.0f;
                            } else {
                                r(matrix);
                                f12 = 90.0f;
                                this.h = (((float) Math.round(this.S / 90.0f)) * 90.0f) - this.S > 20.0f;
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
                    float round = (Math.round(this.S / f12) * f12) - this.S;
                    if (this.h) {
                        if (Math.abs(round) < 5.0f) {
                            matrix3.postRotate(round, this.Q, this.R);
                            if (!this.x) {
                                org.telegram.messenger.g0.c4(this);
                                this.x = true;
                            }
                        } else {
                            this.x = false;
                        }
                    }
                    float f42 = this.Q;
                    if (f42 < f11) {
                        f13 = f11;
                        matrix3.postTranslate(-f42, f13);
                    } else {
                        f13 = f11;
                        if (f42 > getWidth()) {
                            matrix3.postTranslate(getWidth() - this.Q, f13);
                        }
                    }
                    float f43 = this.R;
                    if (f43 < f13) {
                        matrix3.postTranslate(f13, -f43);
                    } else if (f43 > getHeight() - org.telegram.messenger.g0.L(150.0f)) {
                        matrix3.postTranslate(0.0f, (getHeight() - org.telegram.messenger.g0.L(150.0f)) - this.R);
                    }
                    matrix3.postConcat(this.E);
                    dualPosition.set(matrix3);
                    updateDualPosition();
                    float f44 = this.R;
                    boolean z15 = Math.min(f44, f44 - (this.U / 2.0f)) < ((float) org.telegram.messenger.g0.L(66.0f));
                    float f45 = this.R;
                    boolean z16 = Math.max(f45, (this.U / 2.0f) + f45) > ((float) (getHeight() - org.telegram.messenger.g0.L(66.0f)));
                    if (this.G != z15) {
                        this.G = z15;
                        va vaVar = ((y9) this).c0;
                        vaVar.p1.a(true, z15, vaVar.j0);
                    }
                    if (this.H != z16) {
                        this.H = z16;
                        u(z16);
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
                        va vaVar2 = ((y9) this).c0;
                        vaVar2.p1.a(true, false, vaVar2.j0);
                    }
                    if (this.H) {
                        this.H = false;
                        u(false);
                    }
                } else if (motionEvent.getAction() == 3) {
                    this.s = false;
                    if (this.G) {
                        this.G = false;
                        va vaVar3 = ((y9) this).c0;
                        vaVar3.p1.a(true, false, vaVar3.j0);
                    }
                    if (this.H) {
                        this.H = false;
                        u(false);
                    }
                }
                pointF2.x = pointF.x;
                pointF2.y = pointF.y;
                this.d = f10;
                this.e = d;
                return this.s || z11;
            }
        } else if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.L <= ViewConfiguration.getTapTimeout() && a7.h.a(this.J, this.K, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.g0.L(10.0f)) {
                if (s(this.J, this.K)) {
                    switchCamera();
                    this.O = null;
                } else {
                    this.O = new a1(this, 1);
                }
            }
            this.L = -1L;
            a1 a1Var4 = this.N;
            if (a1Var4 != null) {
                org.telegram.messenger.g0.r(a1Var4);
                this.N = null;
            }
        } else if (motionEvent.getAction() == 3) {
            this.L = -1L;
            this.O = null;
            a1 a1Var5 = this.N;
            if (a1Var5 != null) {
                org.telegram.messenger.g0.r(a1Var5);
                this.N = null;
            }
        }
        z10 = false;
        if (isDual()) {
        }
    }
}
