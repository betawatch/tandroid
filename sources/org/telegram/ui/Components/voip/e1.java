package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ch0;
import yh.x7;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements cw0, dw0, org.telegram.ui.ActionBar.a2, cd0, GenericProvider, FlagSecureReason.FlagSecureCondition, Utilities.Callback2Return, ow0 {
    public final /* synthetic */ int a;

    public /* synthetic */ e1(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.dw0
    public void b(Object obj, float f7) {
        k1 k1Var = (k1) obj;
        switch (this.a) {
            case 1:
                WindowManager.LayoutParams layoutParams = k1Var.c;
                k1Var.Q = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.b, k1Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = k1Var.c;
                k1Var.R = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(k1Var.b, k1Var.d, layoutParams2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cd0
    public String e(int i10) {
        switch (this.a) {
            case 8:
                break;
            case 9:
                break;
            default:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 4:
                b2Var.dismiss();
                break;
            case 5:
                break;
            case 6:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
            case 7:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
            case 15:
                b2Var.dismiss();
                break;
            case 17:
                Drawable[] drawableArr = PhotoViewer.U8;
                break;
            case 18:
                b2Var.dismiss();
                break;
            case 19:
                b2Var.dismiss();
                break;
            case 21:
                b2Var.dismiss();
                break;
            case 22:
                b2Var.dismiss();
                break;
            case 28:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.cw0
    public float get(Object obj) {
        k1 k1Var = (k1) obj;
        switch (this.a) {
            case 0:
                return k1Var.Q;
            default:
                return k1Var.R;
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public void j(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 10:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(i6.w0(null, i6.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 11:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f7 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.B1;
                return new ch0();
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return ((Integer) obj).intValue() == 0 ? x7.d1(false, LocaleController.formatPluralStringComma("Stars", ((Integer) obj2).intValue()), 0.66f, null) : LocaleController.formatNumber(r4.intValue(), ',');
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        Pattern pattern = LaunchActivity.B1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    @Override // org.telegram.ui.Components.ow0
    public /* synthetic */ void l() {
    }

    private final void a(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
    }
}
