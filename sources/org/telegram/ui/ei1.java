package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui1 b;

    public /* synthetic */ ei1(ui1 ui1Var, int i10) {
        this.a = i10;
        this.b = ui1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.u0.b();
                break;
            case 1:
                this.b.u0.b();
                break;
            case 2:
                this.b.u0.b();
                break;
            case 3:
                this.b.u0.b();
                break;
            case 4:
                org.telegram.ui.Components.voip.s1 s1Var = this.b.Z;
                s1Var.c0 = false;
                s1Var.invalidate();
                break;
            case 5:
                ui1 ui1Var = this.b;
                ui1Var.q0 = ui1Var.p0;
                ui1Var.H();
                break;
            case 6:
                this.b.B();
                break;
            case 7:
                int[] iArr = new int[2];
                ui1 ui1Var2 = this.b;
                ui1Var2.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ui1Var2.e.getLocationOnScreen(iArr);
                ui1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.h.getLocationOnScreen(iArr);
                ui1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.f.getLocationOnScreen(iArr);
                ui1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ui1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.n.getLocationOnScreen(iArr);
                ui1Var2.n.setTranslationX((((ui1Var2.e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ui1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ui1Var2.n.setAlpha(1.0f);
                ui1Var2.e.setAlpha(1.0f);
                ui1Var2.h.setAlpha(1.0f);
                ui1Var2.f.setAlpha(1.0f);
                long j3 = 200;
                ui1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ui1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                break;
            case 8:
                this.b.u0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ui1 ui1Var3 = this.b;
                    ui1Var3.O0.setTranslationY(ui1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    ui1Var3.O0.u();
                    break;
                }
                break;
            case 10:
                this.b.u0.b();
                break;
            case 11:
                ui1 ui1Var4 = this.b;
                ui1Var4.u0.setAlpha(1.0f);
                ui1Var4.u0.invalidate();
                ValueAnimator k10 = ui1Var4.k(true);
                ui1Var4.H.setAlpha(0.0f);
                ui1Var4.I.setAlpha(0.0f);
                ui1Var4.N.setAlpha(0.0f);
                ui1Var4.X.setAlpha(0.0f);
                ui1Var4.j0.setAlpha(0.0f);
                ui1Var4.h0.setAlpha(0.0f);
                ui1Var4.i0.setAlpha(0.0f);
                ui1Var4.K.setAlpha(0.0f);
                ui1Var4.M0.setAlpha(0.0f);
                ui1Var4.Y.b0 = true;
                AndroidUtilities.runOnUIThread(new w81(22, ui1Var4, k10), 32L);
                break;
            case 12:
                ui1 ui1Var5 = this.b;
                ui1Var5.R0 = false;
                org.telegram.ui.Components.voip.b3 b3Var = ui1Var5.N0;
                boolean z10 = b3Var != null && b3Var.V;
                if (ui1Var5.z0 && ui1Var5.x0 && !ui1Var5.C0 && !z10) {
                    ui1Var5.K0 = System.currentTimeMillis();
                    ui1Var5.A(false);
                    ui1Var5.q0 = ui1Var5.p0;
                    ui1Var5.H();
                    break;
                }
                break;
            default:
                ui1 ui1Var6 = this.b;
                if (ui1Var6.p0 == 3) {
                    ui1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.a3 a3Var = ui1Var6.v;
                    if (!a3Var.R) {
                        a3Var.R = true;
                        break;
                    }
                }
                break;
        }
    }
}
