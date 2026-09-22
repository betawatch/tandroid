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
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements org.telegram.ui.ActionBar.a2, gv0, hv0, GenericProvider, ImageReceiver.ImageReceiverDelegate, LanguageDetector.ExceptionCallback, qc0, FlagSecureReason.FlagSecureCondition {
    public final /* synthetic */ int a;

    public /* synthetic */ in0(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.hv0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 2:
                wo0 wo0Var = (wo0) obj;
                wo0Var.n = f7;
                wo0Var.invalidate();
                break;
            case 13:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams = j1Var.c;
                j1Var.Q = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var.b, j1Var.d, layoutParams);
                break;
            default:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams2 = j1Var2.c;
                j1Var2.R = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var2.b, j1Var2.d, layoutParams2);
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

    @Override // org.telegram.ui.Components.qc0
    public String e(int i10) {
        switch (this.a) {
            case 20:
                break;
            case 21:
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                b2Var.dismiss();
                break;
            case 4:
                b2Var.dismiss();
                break;
            case 5:
                b2Var.dismiss();
                break;
            case 6:
                b2Var.dismiss();
                break;
            case 7:
                int i11 = vx0.u0;
                break;
            case 8:
                b2Var.dismiss();
                break;
            case 10:
                b2Var.dismiss();
                break;
            case 16:
                b2Var.dismiss();
                break;
            case 17:
                break;
            case 18:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
            case 19:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
            case 27:
                b2Var.dismiss();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                break;
        }
    }

    @Override // org.telegram.ui.Components.gv0
    public float get(Object obj) {
        switch (this.a) {
            case 1:
                return ((wo0) obj).n;
            case 12:
                return ((org.telegram.ui.Components.voip.j1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.j1) obj).R;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 3:
                int i10 = hq0.a1;
                return 0;
            case 22:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 23:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f7 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.B1;
                return new org.telegram.ui.eh0();
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
