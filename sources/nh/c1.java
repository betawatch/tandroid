package nh;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class c1 extends CameraView {
    public static final int[] T = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public float E;
    public float F;
    public long G;
    public final Matrix H;
    public b1 I;
    public b1 J;
    public final float[] K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public final float[] Q;
    public float[] R;
    public float[] S;
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
    public float v;
    public boolean w;
    public final Matrix x;
    public final Matrix y;

    public c1(Context context, boolean z10) {
        super(context, z10, false);
        this.b = new PointF();
        this.c = new PointF();
        this.n = new Matrix();
        this.r = new Matrix();
        this.x = new Matrix();
        this.y = new Matrix();
        this.A = true;
        this.H = new Matrix();
        this.K = new float[2];
        new Matrix();
        this.Q = new float[2];
        this.a = q(context);
    }

    private Matrix getSavedDualMatrix() {
        String string = MessagesController.getGlobalMainSettings().getString("dualmatrix", null);
        if (string == null) {
            return null;
        }
        String[] split = string.split(";");
        if (split.length != 9) {
            return null;
        }
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                fArr[i10] = Float.parseFloat(split[i10]);
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public static boolean p(Context context, boolean z10) {
        int i10 = 0;
        boolean z11 = true;
        boolean z12 = SharedConfig.getDevicePerformanceClass() >= 1 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers();
        if (!z12) {
            return z12;
        }
        boolean z13 = context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        if (z13 || !z10) {
            return z13;
        }
        int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        while (true) {
            if (i10 >= 32) {
                z11 = z13;
                break;
            }
            if (T[i10] == hashCode) {
                break;
            }
            i10++;
        }
        if (!z11) {
            (Build.MANUFACTURER + Build.MODEL).toUpperCase().getClass();
        }
        return z11;
    }

    public static boolean q(Context context) {
        return MessagesController.getGlobalMainSettings().getBoolean("dual_available", p(context, true));
    }

    public static void t(boolean z10) {
        boolean p10 = p(ApplicationLoader.applicationContext, false);
        if (MessagesController.getInstance(UserConfig.selectedAccount).collectDeviceStats) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
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
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new lh.o5(4));
            } catch (Exception unused) {
            }
        }
        ApplicationLoader.logDualCamera(z10, p10);
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void destroy(boolean z10, Runnable runnable) {
        v();
        super.destroy(z10, runnable);
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void onDualCameraSuccess() {
        v();
        if (this.D) {
            ka kaVar = (ka) this;
            if (MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) < 2) {
                AndroidUtilities.runOnUIThread(new m6(kaVar, 7), 340L);
            }
            gb gbVar = kaVar.U;
            gbVar.B0.setValue(kaVar.isDual());
            gbVar.B0.setContentDescription(LocaleController.getString(kaVar.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        }
        t(true);
    }

    @Override // org.telegram.messenger.camera.CameraView, org.telegram.messenger.camera.CameraController.ErrorCallback
    public final void onError(int i10, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!p(getContext(), false)) {
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                this.a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.DualErrorTitle);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.DualErrorMessage);
                j7.l1.C(R.string.OK, alertDialog$Builder, null);
            }
            t(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        MessagesController.getGlobalMainSettings().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() == 0 && s(motionEvent.getX(), motionEvent.getY())) ? x(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Matrix matrix = this.x;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.y);
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.A) {
            if (q(getContext()) && MessagesController.getGlobalMainSettings().getBoolean("dualcam", p(ApplicationLoader.applicationContext, false))) {
                this.D = true;
                w();
                this.dual = true;
            }
            this.A = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || x(motionEvent);
    }

    public final void r(Matrix matrix) {
        float[] fArr = this.K;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.L = fArr[0];
        this.M = fArr[1];
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.N = (float) Math.toDegrees(Math.atan2(fArr[1] - this.M, fArr[0] - this.L));
        this.O = i7.z5.a(this.L, this.M, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.P = i7.z5.a(this.L, this.M, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean s(float f9, float f10) {
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.Q;
        fArr[0] = f9;
        fArr[1] = f10;
        this.y.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.H;
        dualPosition.invert(matrix);
        matrix.mapPoints(fArr);
        int dualShape = getDualShape() % 3;
        float f11 = (dualShape == 0 || dualShape == 1 || dualShape == 3) ? 0.5625f : 1.0f;
        float f12 = fArr[0];
        if (f12 >= -1.0f && f12 <= 1.0f) {
            float f13 = fArr[1];
            if (f13 >= (-f11) && f13 <= f11) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.messenger.camera.CameraView
    public void toggleDual() {
        if (isDual() || this.a) {
            if (isDual()) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
            } else {
                w();
            }
            super.toggleDual();
        }
    }

    public abstract void u(boolean z10);

    public final void v() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            StringBuilder sb2 = new StringBuilder(108);
            sb2.append(fArr[0]);
            for (int i10 = 1; i10 < 9; i10++) {
                sb2.append(";");
                sb2.append(fArr[i10]);
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
            dualPosition.postConcat(this.x);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float min = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), (getMeasuredHeight() * 0.43f) / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - min) - measuredWidth, min);
            dualPosition.postConcat(this.y);
        }
        updateDualPosition();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(MotionEvent motionEvent) {
        boolean z10;
        double d;
        float f9;
        boolean z11;
        float f10;
        Matrix matrix;
        float f11;
        float f12;
        float width;
        float f13;
        b1 b1Var;
        float f14;
        float f15;
        if (motionEvent.getAction() == 0) {
            this.G = System.currentTimeMillis();
            this.E = motionEvent.getX();
            this.F = motionEvent.getY();
            this.J = null;
            b1 b1Var2 = this.I;
            if (b1Var2 != null) {
                AndroidUtilities.cancelRunOnUIThread(b1Var2);
                this.I = null;
            }
            if (s(this.E, this.F)) {
                b1 b1Var3 = new b1(this, 0);
                this.I = b1Var3;
                AndroidUtilities.runOnUIThread(b1Var3, ViewConfiguration.getLongPressTimeout());
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
                    f9 = i7.z5.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                    d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
                } else {
                    pointF.x = motionEvent.getX(0);
                    pointF.y = motionEvent.getY(0);
                    d = 0.0d;
                    f9 = 0.0f;
                }
                boolean z13 = this.f;
                PointF pointF2 = this.b;
                if (z13 != z12) {
                    pointF2.x = pointF.x;
                    pointF2.y = pointF.y;
                    this.d = f9;
                    this.e = d;
                    this.f = z12;
                }
                float f16 = pointF.x;
                float f17 = pointF.y;
                float f18 = pointF2.x;
                float f19 = pointF2.y;
                int action = motionEvent.getAction();
                Matrix matrix2 = this.n;
                if (action == 0) {
                    matrix2.set(dualPosition);
                    matrix2.postConcat(this.x);
                    this.v = 0.0f;
                    this.w = false;
                    float f20 = pointF.x;
                    f10 = 0.0f;
                    float f21 = pointF.y;
                    if (this.R == null) {
                        z11 = z10;
                        this.R = new float[8];
                    } else {
                        z11 = z10;
                    }
                    if (this.S == null) {
                        this.S = new float[8];
                    }
                    int dualShape = getDualShape() % 3;
                    if (dualShape != 0) {
                        f14 = 1.0f;
                        if (dualShape != 1 && dualShape != 3) {
                            f15 = 1.0f;
                            float[] fArr = this.R;
                            fArr[0] = -1.0f;
                            float f22 = -f15;
                            fArr[1] = f22;
                            fArr[2] = f14;
                            fArr[3] = f22;
                            fArr[4] = f14;
                            fArr[5] = f15;
                            fArr[6] = -1.0f;
                            fArr[7] = f15;
                            matrix2.mapPoints(this.S, fArr);
                            float[] fArr2 = this.S;
                            float f23 = fArr2[0] - fArr2[2];
                            float f24 = fArr2[1] - fArr2[3];
                            double sqrt = Math.sqrt((f24 * f24) + (f23 * f23));
                            float[] fArr3 = this.S;
                            float f25 = fArr3[2] - fArr3[4];
                            float f26 = fArr3[3] - fArr3[5];
                            double sqrt2 = Math.sqrt((f26 * f26) + (f25 * f25));
                            float[] fArr4 = this.S;
                            float f27 = fArr4[4] - fArr4[6];
                            float f28 = fArr4[5] - fArr4[7];
                            double sqrt3 = Math.sqrt((f28 * f28) + (f27 * f27));
                            float[] fArr5 = this.S;
                            float f29 = fArr5[6] - fArr5[0];
                            float f30 = fArr5[7] - fArr5[1];
                            double sqrt4 = Math.sqrt((f30 * f30) + (f29 * f29));
                            float[] fArr6 = this.S;
                            float f31 = fArr6[0] - f20;
                            float f32 = fArr6[1] - f21;
                            double sqrt5 = Math.sqrt((f32 * f32) + (f31 * f31));
                            float[] fArr7 = this.S;
                            float f33 = fArr7[2] - f20;
                            float f34 = fArr7[3] - f21;
                            double sqrt6 = Math.sqrt((f34 * f34) + (f33 * f33));
                            float[] fArr8 = this.S;
                            float f35 = fArr8[4] - f20;
                            float f36 = fArr8[5] - f21;
                            double sqrt7 = Math.sqrt((f36 * f36) + (f35 * f35));
                            float[] fArr9 = this.S;
                            float f37 = fArr9[6] - f20;
                            float f38 = fArr9[7] - f21;
                            double sqrt8 = Math.sqrt((f38 * f38) + (f37 * f37));
                            double d10 = ((sqrt + sqrt5) + sqrt6) / 2.0d;
                            double d11 = ((sqrt2 + sqrt6) + sqrt7) / 2.0d;
                            double d12 = ((sqrt3 + sqrt7) + sqrt8) / 2.0d;
                            double d13 = ((sqrt4 + sqrt8) + sqrt5) / 2.0d;
                            this.s = (Math.sqrt((d13 - sqrt5) * ((d13 - sqrt8) * ((d13 - sqrt4) * d13))) + (Math.sqrt((d12 - sqrt8) * ((d12 - sqrt7) * ((d12 - sqrt3) * d12))) + (Math.sqrt((d11 - sqrt7) * ((d11 - sqrt6) * ((d11 - sqrt2) * d11))) + Math.sqrt((d10 - sqrt6) * ((d10 - sqrt5) * ((d10 - sqrt) * d10)))))) - (sqrt * sqrt2) >= 1.0d;
                        }
                    } else {
                        f14 = 1.0f;
                    }
                    f15 = 0.5625f;
                    float[] fArr10 = this.R;
                    fArr10[0] = -1.0f;
                    float f222 = -f15;
                    fArr10[1] = f222;
                    fArr10[2] = f14;
                    fArr10[3] = f222;
                    fArr10[4] = f14;
                    fArr10[5] = f15;
                    fArr10[6] = -1.0f;
                    fArr10[7] = f15;
                    matrix2.mapPoints(this.S, fArr10);
                    float[] fArr22 = this.S;
                    float f232 = fArr22[0] - fArr22[2];
                    float f242 = fArr22[1] - fArr22[3];
                    double sqrt9 = Math.sqrt((f242 * f242) + (f232 * f232));
                    float[] fArr32 = this.S;
                    float f252 = fArr32[2] - fArr32[4];
                    float f262 = fArr32[3] - fArr32[5];
                    double sqrt22 = Math.sqrt((f262 * f262) + (f252 * f252));
                    float[] fArr42 = this.S;
                    float f272 = fArr42[4] - fArr42[6];
                    float f282 = fArr42[5] - fArr42[7];
                    double sqrt32 = Math.sqrt((f282 * f282) + (f272 * f272));
                    float[] fArr52 = this.S;
                    float f292 = fArr52[6] - fArr52[0];
                    float f302 = fArr52[7] - fArr52[1];
                    double sqrt42 = Math.sqrt((f302 * f302) + (f292 * f292));
                    float[] fArr62 = this.S;
                    float f312 = fArr62[0] - f20;
                    float f322 = fArr62[1] - f21;
                    double sqrt52 = Math.sqrt((f322 * f322) + (f312 * f312));
                    float[] fArr72 = this.S;
                    float f332 = fArr72[2] - f20;
                    float f342 = fArr72[3] - f21;
                    double sqrt62 = Math.sqrt((f342 * f342) + (f332 * f332));
                    float[] fArr82 = this.S;
                    float f352 = fArr82[4] - f20;
                    float f362 = fArr82[5] - f21;
                    double sqrt72 = Math.sqrt((f362 * f362) + (f352 * f352));
                    float[] fArr92 = this.S;
                    float f372 = fArr92[6] - f20;
                    float f382 = fArr92[7] - f21;
                    double sqrt82 = Math.sqrt((f382 * f382) + (f372 * f372));
                    double d102 = ((sqrt9 + sqrt52) + sqrt62) / 2.0d;
                    double d112 = ((sqrt22 + sqrt62) + sqrt72) / 2.0d;
                    double d122 = ((sqrt32 + sqrt72) + sqrt82) / 2.0d;
                    double d132 = ((sqrt42 + sqrt82) + sqrt52) / 2.0d;
                    this.s = (Math.sqrt((d132 - sqrt52) * ((d132 - sqrt82) * ((d132 - sqrt42) * d132))) + (Math.sqrt((d122 - sqrt82) * ((d122 - sqrt72) * ((d122 - sqrt32) * d122))) + (Math.sqrt((d112 - sqrt72) * ((d112 - sqrt62) * ((d112 - sqrt22) * d112))) + Math.sqrt((d102 - sqrt62) * ((d102 - sqrt52) * ((d102 - sqrt9) * d102)))))) - (sqrt9 * sqrt22) >= 1.0d;
                } else {
                    z11 = z10;
                    f10 = 0.0f;
                }
                if (motionEvent.getAction() == 2 && this.s) {
                    if (i7.z5.a(f16, f17, f18, f19) > AndroidUtilities.dp(2.0f) && (b1Var = this.I) != null) {
                        AndroidUtilities.cancelRunOnUIThread(b1Var);
                        this.I = null;
                    }
                    if (motionEvent.getPointerCount() > 1) {
                        if (this.d != f10) {
                            r(matrix2);
                            float f39 = f9 / this.d;
                            if (this.O * f39 > getWidth() * 0.7f) {
                                width = getWidth() * 0.7f;
                                f13 = this.O;
                            } else {
                                if (this.O * f39 < getWidth() * 0.2f) {
                                    width = getWidth() * 0.2f;
                                    f13 = this.O;
                                }
                                matrix2.postScale(f39, f39, f16, f17);
                            }
                            f39 = width / f13;
                            matrix2.postScale(f39, f39, f16, f17);
                        }
                        matrix = matrix2;
                        float degrees = (float) Math.toDegrees(d - this.e);
                        float f40 = this.v + degrees;
                        this.v = f40;
                        if (this.h) {
                            f11 = 90.0f;
                        } else {
                            boolean z14 = Math.abs(f40) > 20.0f;
                            this.h = z14;
                            if (z14) {
                                f11 = 90.0f;
                            } else {
                                r(matrix);
                                f11 = 90.0f;
                                this.h = (((float) Math.round(this.N / 90.0f)) * 90.0f) - this.N > 20.0f;
                            }
                            if (!this.w) {
                                AndroidUtilities.vibrateCursor(this);
                                this.w = true;
                            }
                        }
                        if (this.h) {
                            matrix.postRotate(degrees, f16, f17);
                        }
                    } else {
                        matrix = matrix2;
                        f11 = 90.0f;
                    }
                    matrix.postTranslate(f16 - f18, f17 - f19);
                    Matrix matrix3 = this.r;
                    matrix3.set(matrix);
                    r(matrix3);
                    float round = (Math.round(this.N / f11) * f11) - this.N;
                    if (this.h) {
                        if (Math.abs(round) < 5.0f) {
                            matrix3.postRotate(round, this.L, this.M);
                            if (!this.w) {
                                AndroidUtilities.vibrateCursor(this);
                                this.w = true;
                            }
                        } else {
                            this.w = false;
                        }
                    }
                    float f41 = this.L;
                    if (f41 < f10) {
                        f12 = 0.0f;
                        matrix3.postTranslate(-f41, 0.0f);
                    } else {
                        f12 = 0.0f;
                        if (f41 > getWidth()) {
                            matrix3.postTranslate(getWidth() - this.L, 0.0f);
                        }
                    }
                    float f42 = this.M;
                    if (f42 < f12) {
                        matrix3.postTranslate(f12, -f42);
                    } else if (f42 > getHeight() - AndroidUtilities.dp(150.0f)) {
                        matrix3.postTranslate(0.0f, (getHeight() - AndroidUtilities.dp(150.0f)) - this.M);
                    }
                    matrix3.postConcat(this.y);
                    dualPosition.set(matrix3);
                    updateDualPosition();
                    float f43 = this.M;
                    boolean z15 = Math.min(f43, f43 - (this.P / 2.0f)) < ((float) AndroidUtilities.dp(66.0f));
                    float f44 = this.M;
                    boolean z16 = Math.max(f44, (this.P / 2.0f) + f44) > ((float) (getHeight() - AndroidUtilities.dp(66.0f)));
                    if (this.B != z15) {
                        this.B = z15;
                        gb gbVar = ((ka) this).U;
                        gbVar.k1.a(true, z15, gbVar.e0);
                    }
                    if (this.C != z16) {
                        this.C = z16;
                        u(z16);
                    }
                }
                if (motionEvent.getAction() == 1) {
                    this.h = false;
                    this.v = 0.0f;
                    this.w = false;
                    invalidate();
                    this.s = false;
                    if (this.B) {
                        this.B = false;
                        gb gbVar2 = ((ka) this).U;
                        gbVar2.k1.a(true, false, gbVar2.e0);
                    }
                    if (this.C) {
                        this.C = false;
                        u(false);
                    }
                } else if (motionEvent.getAction() == 3) {
                    this.s = false;
                    if (this.B) {
                        this.B = false;
                        gb gbVar3 = ((ka) this).U;
                        gbVar3.k1.a(true, false, gbVar3.e0);
                    }
                    if (this.C) {
                        this.C = false;
                        u(false);
                    }
                }
                pointF2.x = pointF.x;
                pointF2.y = pointF.y;
                this.d = f9;
                this.e = d;
                return this.s || z11;
            }
        } else if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.G <= ViewConfiguration.getTapTimeout() && i7.z5.a(this.E, this.F, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(10.0f)) {
                if (s(this.E, this.F)) {
                    switchCamera();
                    this.J = null;
                } else {
                    this.J = new b1(this, 1);
                }
            }
            this.G = -1L;
            b1 b1Var4 = this.I;
            if (b1Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(b1Var4);
                this.I = null;
            }
        } else if (motionEvent.getAction() == 3) {
            this.G = -1L;
            this.J = null;
            b1 b1Var5 = this.I;
            if (b1Var5 != null) {
                AndroidUtilities.cancelRunOnUIThread(b1Var5);
                this.I = null;
            }
        }
        z10 = false;
        if (isDual()) {
        }
    }
}
