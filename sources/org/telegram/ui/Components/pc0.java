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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc0 implements ImageReceiver.ImageReceiverDelegate, r0.o, qu0, ru0, org.telegram.ui.ActionBar.a2, GenericProvider, LanguageDetector.ExceptionCallback, bc0 {
    public final /* synthetic */ int a;

    public /* synthetic */ pc0(int i10) {
        this.a = i10;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        return r0.m1.b;
    }

    @Override // org.telegram.ui.Components.ru0
    public void b(Object obj, float f10) {
        switch (this.a) {
            case 3:
                sf0 sf0Var = (sf0) obj;
                WindowManager.LayoutParams layoutParams = sf0Var.c;
                sf0Var.G = f10;
                layoutParams.x = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(sf0Var.b, sf0Var.d, layoutParams);
                    break;
                } catch (IllegalArgumentException unused) {
                    sf0Var.I.c();
                    return;
                }
            case 5:
                sf0 sf0Var2 = (sf0) obj;
                WindowManager.LayoutParams layoutParams2 = sf0Var2.c;
                sf0Var2.H = f10;
                layoutParams2.y = (int) f10;
                try {
                    AndroidUtilities.updateViewLayout(sf0Var2.b, sf0Var2.d, layoutParams2);
                    break;
                } catch (IllegalArgumentException unused2) {
                    sf0Var2.J.c();
                    return;
                }
            case 10:
                go0 go0Var = (go0) obj;
                go0Var.n = f10;
                go0Var.invalidate();
                break;
            case 21:
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) obj;
                WindowManager.LayoutParams layoutParams3 = g1Var.c;
                g1Var.M = f10;
                layoutParams3.x = (int) f10;
                AndroidUtilities.updateViewLayout(g1Var.b, g1Var.d, layoutParams3);
                break;
            default:
                org.telegram.ui.Components.voip.g1 g1Var2 = (org.telegram.ui.Components.voip.g1) obj;
                WindowManager.LayoutParams layoutParams4 = g1Var2.c;
                g1Var2.N = f10;
                layoutParams4.y = (int) f10;
                AndroidUtilities.updateViewLayout(g1Var2.b, g1Var2.d, layoutParams4);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oi0 lottieAnimation;
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
                int i11 = ex0.q0;
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

    @Override // org.telegram.ui.Components.bc0
    public String g(int i10) {
        switch (this.a) {
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.Components.qu0
    public float get(Object obj) {
        switch (this.a) {
            case 2:
                return ((sf0) obj).G;
            case 4:
                return ((sf0) obj).H;
            case 9:
                return ((go0) obj).n;
            case 20:
                return ((org.telegram.ui.Components.voip.g1) obj).M;
            default:
                return ((org.telegram.ui.Components.voip.g1) obj).N;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = sp0.W0;
        return 0;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    private final void a(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
    }
}
