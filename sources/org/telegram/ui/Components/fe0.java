package org.telegram.ui.Components;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fe0 implements ImageReceiver.ImageReceiverDelegate, r0.n, jw0, kw0, org.telegram.ui.ActionBar.a2, GenericProvider, LanguageDetector.ExceptionCallback, qd0 {
    public final /* synthetic */ int a;

    public /* synthetic */ fe0(int i10) {
        this.a = i10;
    }

    @Override // r0.n
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.kw0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 3:
                gh0 gh0Var = (gh0) obj;
                WindowManager.LayoutParams layoutParams = gh0Var.c;
                gh0Var.K = f7;
                layoutParams.x = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(gh0Var.b, gh0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    gh0Var.M.c();
                    return;
                }
            case 5:
                gh0 gh0Var2 = (gh0) obj;
                WindowManager.LayoutParams layoutParams2 = gh0Var2.c;
                gh0Var2.L = f7;
                layoutParams2.y = (int) f7;
                try {
                    AndroidUtilities.updateViewLayout(gh0Var2.b, gh0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    gh0Var2.N.c();
                    return;
                }
            case 10:
                bq0 bq0Var = (bq0) obj;
                bq0Var.n = f7;
                bq0Var.invalidate();
                break;
            case 21:
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams3 = j1Var.c;
                j1Var.Q = f7;
                layoutParams3.x = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var.b, j1Var.d, layoutParams3);
                break;
            default:
                org.telegram.ui.Components.voip.j1 j1Var2 = (org.telegram.ui.Components.voip.j1) obj;
                WindowManager.LayoutParams layoutParams4 = j1Var2.c;
                j1Var2.R = f7;
                layoutParams4.y = (int) f7;
                AndroidUtilities.updateViewLayout(j1Var2.b, j1Var2.d, layoutParams4);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ck0 lottieAnimation;
        switch (this.a) {
            case 0:
                if (z10 && !z11 && (lottieAnimation = imageReceiver.getLottieAnimation()) != null) {
                    lottieAnimation.start();
                    break;
                }
                break;
            default:
                if (imageReceiver.canInvertBitmap()) {
                    imageReceiver.setColorFilter(new ColorMatrixColorFilter(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 7:
                b2Var.dismiss();
                break;
            case 8:
                b2Var.dismiss();
                break;
            case 9:
            case 10:
            case 11:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            default:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
            case 12:
                b2Var.dismiss();
                break;
            case 13:
                b2Var.dismiss();
                break;
            case 14:
                b2Var.dismiss();
                break;
            case 15:
                int i11 = xy0.u0;
                break;
            case 16:
                b2Var.dismiss();
                break;
            case 18:
                b2Var.dismiss();
                break;
            case 24:
                b2Var.dismiss();
                break;
            case 25:
                break;
            case 26:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jw0
    public float get(Object obj) {
        switch (this.a) {
            case 2:
                return ((gh0) obj).K;
            case 4:
                return ((gh0) obj).L;
            case 9:
                return ((bq0) obj).n;
            case 20:
                return ((org.telegram.ui.Components.voip.j1) obj).Q;
            default:
                return ((org.telegram.ui.Components.voip.j1) obj).R;
        }
    }

    @Override // org.telegram.ui.Components.qd0
    public String i(int i10) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = mr0.a1;
        return 0;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    private final void a(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
    }
}
