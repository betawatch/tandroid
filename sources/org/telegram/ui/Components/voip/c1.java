package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.WindowManager;
import bi.dd;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c7;
import org.telegram.ui.ActionBar.d7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pg0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c1 implements ow0, nw0, org.telegram.ui.ActionBar.b2, id0, GenericProvider, FlagSecureReason.FlagSecureCondition, Utilities.Callback2Return, yw0, c7, d7 {
    public final /* synthetic */ int a;

    public /* synthetic */ c1(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.ow0
    public void b(Object obj, float f7) {
        i1 i1Var = (i1) obj;
        switch (this.a) {
            case 0:
                WindowManager.LayoutParams layoutParams = i1Var.c;
                i1Var.Q = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = i1Var.c;
                i1Var.R = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(i1Var.b, i1Var.d, layoutParams2);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d7
    public void d(int i10, View view) {
        org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) view;
        ShapeDrawable shapeDrawable = f3Var.e0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i10);
            f3Var.e0.invalidateSelf();
        }
    }

    @Override // org.telegram.ui.ActionBar.c7
    public int e(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.f3) view).e0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.id0
    public String f(int i10) {
        switch (this.a) {
            case 7:
                break;
            case 8:
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

    @Override // org.telegram.ui.Components.nw0
    public float get(Object obj) {
        return ((i1) obj).R;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 3:
                e2Var.dismiss();
                break;
            case 4:
                break;
            case 5:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
            case 6:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
            case 13:
                e2Var.dismiss();
                break;
            case 15:
                Drawable[] drawableArr = PhotoViewer.U8;
                break;
            case 16:
                e2Var.dismiss();
                break;
            case 17:
                e2Var.dismiss();
                break;
            case 19:
                int i11 = ProfileActivity.R6;
                e2Var.dismiss();
                break;
            case 20:
                e2Var.dismiss();
                break;
            case 26:
                e2Var.dismiss();
                break;
            default:
                e2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.yw0
    public void j(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 9:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(y6.x0(null, y6.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 10:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f7 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.D1;
                return new pg0();
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return ((Integer) obj).intValue() == 0 ? dd.W0(false, LocaleController.formatPluralStringComma("Stars", ((Integer) obj2).intValue()), 0.66f, null) : LocaleController.formatNumber(r4.intValue(), ',');
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        Pattern pattern = LaunchActivity.D1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    @Override // org.telegram.ui.Components.yw0
    public /* synthetic */ void m() {
    }

    private final void a(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
    }
}
