package lh;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
            } catch (Exception e9) {
                FileLog.e(e9);
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
        boolean p6 = p(ApplicationLoader.applicationContext, false);
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
                tL_inputAppEvent.peer = (z10 ? 1 : 0) | (p6 ? 2 : 0);
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new jh.m5(4));
            } catch (Exception unused) {
            }
        }
        ApplicationLoader.logDualCamera(z10, p6);
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
            wa waVar = (wa) this;
            if (MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) < 2) {
                AndroidUtilities.runOnUIThread(new kh.c(waVar, 23), 340L);
            }
            sb sbVar = waVar.U;
            sbVar.B0.setValue(waVar.isDual());
            sbVar.B0.setContentDescription(LocaleController.getString(waVar.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
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
                i0.a.C(R.string.OK, alertDialog$Builder, null);
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
        this.O = h7.y.a(this.L, this.M, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.P = h7.y.a(this.L, this.M, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean s(float f10, float f11) {
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.Q;
        fArr[0] = f10;
        fArr[1] = f11;
        this.y.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.H;
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
        float f10;
        boolean z11;
        float f11;
        Matrix matrix;
        float f12;
        float f13;
        float width;
        float f14;
        b1 b1Var;
        float f15;
        float f16;
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
                    f10 = h7.y.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
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
                    matrix2.postConcat(this.x);
                    this.v = 0.0f;
                    this.w = false;
                    float f21 = pointF.x;
                    f11 = 0.0f;
                    float f22 = pointF.y;
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
                        f15 = 1.0f;
                        if (dualShape != 1 && dualShape != 3) {
                            f16 = 1.0f;
                            float[] fArr = this.R;
                            fArr[0] = -1.0f;
                            float f23 = -f16;
                            fArr[1] = f23;
                            fArr[2] = f15;
                            fArr[3] = f23;
                            fArr[4] = f15;
                            fArr[5] = f16;
                            fArr[6] = -1.0f;
                            fArr[7] = f16;
                            matrix2.mapPoints(this.S, fArr);
                            float[] fArr2 = this.S;
                            float f24 = fArr2[0] - fArr2[2];
                            float f25 = fArr2[1] - fArr2[3];
                            double sqrt = Math.sqrt((f25 * f25) + (f24 * f24));
                            float[] fArr3 = this.S;
                            float f26 = fArr3[2] - fArr3[4];
                            float f27 = fArr3[3] - fArr3[5];
                            double sqrt2 = Math.sqrt((f27 * f27) + (f26 * f26));
                            float[] fArr4 = this.S;
                            float f28 = fArr4[4] - fArr4[6];
                            float f29 = fArr4[5] - fArr4[7];
                            double sqrt3 = Math.sqrt((f29 * f29) + (f28 * f28));
                            float[] fArr5 = this.S;
                            float f30 = fArr5[6] - fArr5[0];
                            float f31 = fArr5[7] - fArr5[1];
                            double sqrt4 = Math.sqrt((f31 * f31) + (f30 * f30));
                            float[] fArr6 = this.S;
                            float f32 = fArr6[0] - f21;
                            float f33 = fArr6[1] - f22;
                            double sqrt5 = Math.sqrt((f33 * f33) + (f32 * f32));
                            float[] fArr7 = this.S;
                            float f34 = fArr7[2] - f21;
                            float f35 = fArr7[3] - f22;
                            double sqrt6 = Math.sqrt((f35 * f35) + (f34 * f34));
                            float[] fArr8 = this.S;
                            float f36 = fArr8[4] - f21;
                            float f37 = fArr8[5] - f22;
                            double sqrt7 = Math.sqrt((f37 * f37) + (f36 * f36));
                            float[] fArr9 = this.S;
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
                    float[] fArr10 = this.R;
                    fArr10[0] = -1.0f;
                    float f232 = -f16;
                    fArr10[1] = f232;
                    fArr10[2] = f15;
                    fArr10[3] = f232;
                    fArr10[4] = f15;
                    fArr10[5] = f16;
                    fArr10[6] = -1.0f;
                    fArr10[7] = f16;
                    matrix2.mapPoints(this.S, fArr10);
                    float[] fArr22 = this.S;
                    float f242 = fArr22[0] - fArr22[2];
                    float f252 = fArr22[1] - fArr22[3];
                    double sqrt9 = Math.sqrt((f252 * f252) + (f242 * f242));
                    float[] fArr32 = this.S;
                    float f262 = fArr32[2] - fArr32[4];
                    float f272 = fArr32[3] - fArr32[5];
                    double sqrt22 = Math.sqrt((f272 * f272) + (f262 * f262));
                    float[] fArr42 = this.S;
                    float f282 = fArr42[4] - fArr42[6];
                    float f292 = fArr42[5] - fArr42[7];
                    double sqrt32 = Math.sqrt((f292 * f292) + (f282 * f282));
                    float[] fArr52 = this.S;
                    float f302 = fArr52[6] - fArr52[0];
                    float f312 = fArr52[7] - fArr52[1];
                    double sqrt42 = Math.sqrt((f312 * f312) + (f302 * f302));
                    float[] fArr62 = this.S;
                    float f322 = fArr62[0] - f21;
                    float f332 = fArr62[1] - f22;
                    double sqrt52 = Math.sqrt((f332 * f332) + (f322 * f322));
                    float[] fArr72 = this.S;
                    float f342 = fArr72[2] - f21;
                    float f352 = fArr72[3] - f22;
                    double sqrt62 = Math.sqrt((f352 * f352) + (f342 * f342));
                    float[] fArr82 = this.S;
                    float f362 = fArr82[4] - f21;
                    float f372 = fArr82[5] - f22;
                    double sqrt72 = Math.sqrt((f372 * f372) + (f362 * f362));
                    float[] fArr92 = this.S;
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
                    if (h7.y.a(f17, f18, f19, f20) > AndroidUtilities.dp(2.0f) && (b1Var = this.I) != null) {
                        AndroidUtilities.cancelRunOnUIThread(b1Var);
                        this.I = null;
                    }
                    if (motionEvent.getPointerCount() > 1) {
                        if (this.d != f11) {
                            r(matrix2);
                            float f40 = f10 / this.d;
                            if (this.O * f40 > getWidth() * 0.7f) {
                                width = getWidth() * 0.7f;
                                f14 = this.O;
                            } else {
                                if (this.O * f40 < getWidth() * 0.2f) {
                                    width = getWidth() * 0.2f;
                                    f14 = this.O;
                                }
                                matrix2.postScale(f40, f40, f17, f18);
                            }
                            f40 = width / f14;
                            matrix2.postScale(f40, f40, f17, f18);
                        }
                        matrix = matrix2;
                        float degrees = (float) Math.toDegrees(d - this.e);
                        float f41 = this.v + degrees;
                        this.v = f41;
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
                                this.h = (((float) Math.round(this.N / 90.0f)) * 90.0f) - this.N > 20.0f;
                            }
                            if (!this.w) {
                                AndroidUtilities.vibrateCursor(this);
                                this.w = true;
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
                    float round = (Math.round(this.N / f12) * f12) - this.N;
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
                    float f42 = this.L;
                    if (f42 < f11) {
                        f13 = 0.0f;
                        matrix3.postTranslate(-f42, 0.0f);
                    } else {
                        f13 = 0.0f;
                        if (f42 > getWidth()) {
                            matrix3.postTranslate(getWidth() - this.L, 0.0f);
                        }
                    }
                    float f43 = this.M;
                    if (f43 < f13) {
                        matrix3.postTranslate(f13, -f43);
                    } else if (f43 > getHeight() - AndroidUtilities.dp(150.0f)) {
                        matrix3.postTranslate(0.0f, (getHeight() - AndroidUtilities.dp(150.0f)) - this.M);
                    }
                    matrix3.postConcat(this.y);
                    dualPosition.set(matrix3);
                    updateDualPosition();
                    float f44 = this.M;
                    boolean z15 = Math.min(f44, f44 - (this.P / 2.0f)) < ((float) AndroidUtilities.dp(66.0f));
                    float f45 = this.M;
                    boolean z16 = Math.max(f45, (this.P / 2.0f) + f45) > ((float) (getHeight() - AndroidUtilities.dp(66.0f)));
                    if (this.B != z15) {
                        this.B = z15;
                        sb sbVar = ((wa) this).U;
                        sbVar.k1.a(true, z15, sbVar.e0);
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
                        sb sbVar2 = ((wa) this).U;
                        sbVar2.k1.a(true, false, sbVar2.e0);
                    }
                    if (this.C) {
                        this.C = false;
                        u(false);
                    }
                } else if (motionEvent.getAction() == 3) {
                    this.s = false;
                    if (this.B) {
                        this.B = false;
                        sb sbVar3 = ((wa) this).U;
                        sbVar3.k1.a(true, false, sbVar3.e0);
                    }
                    if (this.C) {
                        this.C = false;
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
            if (System.currentTimeMillis() - this.G <= ViewConfiguration.getTapTimeout() && h7.y.a(this.E, this.F, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(10.0f)) {
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
