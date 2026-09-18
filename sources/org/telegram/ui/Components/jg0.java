package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements tv0, org.telegram.ui.ActionBar.a2, sv0, GenericProvider, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, zc0, FlagSecureReason.FlagSecureCondition {
    public final /* synthetic */ int a;

    public /* synthetic */ jg0(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.tv0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                pg0 pg0Var = (pg0) obj;
                WindowManager.LayoutParams layoutParams = pg0Var.c;
                pg0Var.L = f7;
                layoutParams.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(pg0Var.b, pg0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    pg0Var.N.c();
                    return;
                }
            case 5:
                kp0 kp0Var = (kp0) obj;
                kp0Var.n = f7;
                kp0Var.invalidate();
                break;
            case 16:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams2 = j1Var.c;
                j1Var.Q = f7;
                layoutParams2.x = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var.b, j1Var.d, layoutParams2);
                break;
            default:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams3 = j1Var2.c;
                j1Var2.R = f7;
                layoutParams3.y = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var2.b, j1Var2.d, layoutParams3);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.canInvertBitmap()) {
            imageReceiver.setColorFilter(new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 2:
                b2Var.dismiss();
                break;
            case 3:
                b2Var.dismiss();
                break;
            case 4:
            case 5:
            case 6:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
            case 7:
                b2Var.dismiss();
                break;
            case 8:
                b2Var.dismiss();
                break;
            case 9:
                b2Var.dismiss();
                break;
            case 10:
                int i11 = hy0.u0;
                break;
            case 11:
                b2Var.dismiss();
                break;
            case 13:
                b2Var.dismiss();
                break;
            case 19:
                b2Var.dismiss();
                break;
            case 20:
                break;
            case 21:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public float get(Object obj) {
        switch (this.a) {
            case 4:
                return ((kp0) obj).n;
            case 15:
                return ((org.telegram.ui.Components.voip.j1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.j1) obj).R;
        }
    }

    @Override // org.telegram.ui.Components.zc0
    public String j(int i10) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 6:
                int i10 = vq0.a1;
                return 0;
            case 25:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 26:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f7 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.B1;
                return new org.telegram.ui.fh0();
        }
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        Pattern pattern = LaunchActivity.B1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    private final void a(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
    }
}
