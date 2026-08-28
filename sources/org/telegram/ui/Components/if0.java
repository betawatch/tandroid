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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class if0 implements ou0, org.telegram.ui.ActionBar.b2, nu0, GenericProvider, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, xb0, FlagSecureReason.FlagSecureCondition {
    public final /* synthetic */ int a;

    public /* synthetic */ if0(int i9) {
        this.a = i9;
    }

    @Override // org.telegram.ui.Components.ou0
    public void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                pf0 pf0Var = (pf0) obj;
                WindowManager.LayoutParams layoutParams = pf0Var.c;
                pf0Var.H = f10;
                layoutParams.y = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(pf0Var.b, pf0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    pf0Var.J.c();
                    return;
                }
            case 5:
                fo0 fo0Var = (fo0) obj;
                fo0Var.n = f10;
                fo0Var.invalidate();
                break;
            case 16:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) obj;
                WindowManager.LayoutParams layoutParams2 = g1Var.c;
                g1Var.M = f10;
                layoutParams2.x = (int) f10;
                AndroidUtilities.updateViewLayout(g1Var.b, g1Var.d, layoutParams2);
                break;
            default:
                org.telegram.ui.Components.voip.g1 g1Var2 = (org.telegram.ui.Components.voip.g1) obj;
                WindowManager.LayoutParams layoutParams3 = g1Var2.c;
                g1Var2.N = f10;
                layoutParams3.y = (int) f10;
                AndroidUtilities.updateViewLayout(g1Var2.b, g1Var2.d, layoutParams3);
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
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 2:
                c2Var.dismiss();
                break;
            case 3:
                c2Var.dismiss();
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
                c2Var.dismiss();
                break;
            case 8:
                c2Var.dismiss();
                break;
            case 9:
                c2Var.dismiss();
                break;
            case 10:
                int i10 = cx0.q0;
                break;
            case 11:
                c2Var.dismiss();
                break;
            case 13:
                c2Var.dismiss();
                break;
            case 19:
                c2Var.dismiss();
                break;
            case 20:
                break;
            case 21:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
        }
    }

    @Override // org.telegram.ui.Components.xb0
    public String g(int i9) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i9));
    }

    @Override // org.telegram.ui.Components.nu0
    public float get(Object obj) {
        switch (this.a) {
            case 4:
                return ((fo0) obj).n;
            case 15:
                return ((org.telegram.ui.Components.voip.g1) obj).M;
            default:
                return ((org.telegram.ui.Components.voip.g1) obj).N;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 6:
                int i9 = rp0.W0;
                return 0;
            case 25:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 26:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f10 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f10, f10, f10, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.x1;
                return new org.telegram.ui.ng0();
        }
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        Pattern pattern = LaunchActivity.x1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    private final void a(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
    }
}
