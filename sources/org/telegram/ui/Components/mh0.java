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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh0 implements org.telegram.ui.ActionBar.c2, gv0, hv0, GenericProvider, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, uc0, FlagSecureReason.FlagSecureCondition {
    public final /* synthetic */ int a;

    public /* synthetic */ mh0(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.hv0
    public void b(Object obj, float f10) {
        switch (this.a) {
            case 4:
                ap0 ap0Var = (ap0) obj;
                ap0Var.n = f10;
                ap0Var.invalidate();
                break;
            case 15:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams = h1Var.c;
                h1Var.N = f10;
                layoutParams.x = (int) f10;
                AndroidUtilities.updateViewLayout(h1Var.b, h1Var.d, layoutParams);
                break;
            default:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) obj;
                WindowManager.LayoutParams layoutParams2 = h1Var2.c;
                h1Var2.O = f10;
                layoutParams2.y = (int) f10;
                AndroidUtilities.updateViewLayout(h1Var2.b, h1Var2.d, layoutParams2);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        if (imageReceiver.canInvertBitmap()) {
            imageReceiver.setColorFilter(new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.uc0
    public String e(int i10) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.Components.gv0
    public float get(Object obj) {
        switch (this.a) {
            case 3:
                return ((ap0) obj).n;
            case 14:
                return ((org.telegram.ui.Components.voip.h1) obj).N;
            default:
                return ((org.telegram.ui.Components.voip.h1) obj).O;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                d2Var.dismiss();
                break;
            case 2:
                d2Var.dismiss();
                break;
            case 3:
            case 4:
            case 5:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            default:
                d2Var.dismiss();
                break;
            case 6:
                d2Var.dismiss();
                break;
            case 7:
                d2Var.dismiss();
                break;
            case 8:
                d2Var.dismiss();
                break;
            case 9:
                int i11 = xx0.r0;
                break;
            case 10:
                d2Var.dismiss();
                break;
            case 12:
                d2Var.dismiss();
                break;
            case 18:
                d2Var.dismiss();
                break;
            case 19:
                break;
            case 20:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
            case 21:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 5:
                int i10 = lq0.X0;
                return 0;
            case 24:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 25:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f10 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f10, f10, f10, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.y1;
                return new org.telegram.ui.wg0();
        }
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        Pattern pattern = LaunchActivity.y1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    private final void a(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
    }
}
