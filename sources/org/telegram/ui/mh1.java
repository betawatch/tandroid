package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci1 b;

    public /* synthetic */ mh1(ci1 ci1Var, int i10) {
        this.a = i10;
        this.b = ci1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0.b();
                break;
            case 1:
                this.b.r0.b();
                break;
            case 2:
                this.b.r0.b();
                break;
            case 3:
                this.b.r0.b();
                break;
            case 4:
                org.telegram.ui.Components.voip.t1 t1Var = this.b.W;
                t1Var.W = false;
                t1Var.invalidate();
                break;
            case 5:
                ci1 ci1Var = this.b;
                ci1Var.n0 = ci1Var.m0;
                ci1Var.H();
                break;
            case 6:
                this.b.B();
                break;
            case 7:
                int[] iArr = new int[2];
                ci1 ci1Var2 = this.b;
                ci1Var2.b0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ci1Var2.e.getLocationOnScreen(iArr);
                ci1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ci1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ci1Var2.h.getLocationOnScreen(iArr);
                ci1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ci1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ci1Var2.f.getLocationOnScreen(iArr);
                ci1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ci1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ci1Var2.n.getLocationOnScreen(iArr);
                ci1Var2.n.setTranslationX((((ci1Var2.b0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ci1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ci1Var2.n.setAlpha(1.0f);
                ci1Var2.e.setAlpha(1.0f);
                ci1Var2.h.setAlpha(1.0f);
                ci1Var2.f.setAlpha(1.0f);
                long j10 = 200;
                ci1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ci1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ci1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ci1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.b.r0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ci1 ci1Var3 = this.b;
                    ci1Var3.L0.setTranslationY(ci1Var3.K.getY() + AndroidUtilities.dp(36.0f));
                    ci1Var3.L0.v();
                    break;
                }
                break;
            case 10:
                this.b.r0.b();
                break;
            case 11:
                ci1 ci1Var4 = this.b;
                ci1Var4.r0.setAlpha(1.0f);
                ci1Var4.r0.invalidate();
                ValueAnimator k10 = ci1Var4.k(true);
                ci1Var4.E.setAlpha(0.0f);
                ci1Var4.F.setAlpha(0.0f);
                ci1Var4.K.setAlpha(0.0f);
                ci1Var4.U.setAlpha(0.0f);
                ci1Var4.g0.setAlpha(0.0f);
                ci1Var4.e0.setAlpha(0.0f);
                ci1Var4.f0.setAlpha(0.0f);
                ci1Var4.H.setAlpha(0.0f);
                ci1Var4.J0.setAlpha(0.0f);
                ci1Var4.V.V = true;
                AndroidUtilities.runOnUIThread(new mg1(3, ci1Var4, k10), 32L);
                break;
            case 12:
                ci1 ci1Var5 = this.b;
                ci1Var5.O0 = false;
                org.telegram.ui.Components.voip.e3 e3Var = ci1Var5.K0;
                boolean z4 = e3Var != null && e3Var.S;
                if (ci1Var5.w0 && ci1Var5.u0 && !ci1Var5.z0 && !z4) {
                    ci1Var5.H0 = System.currentTimeMillis();
                    ci1Var5.A(false);
                    ci1Var5.n0 = ci1Var5.m0;
                    ci1Var5.H();
                    break;
                }
                break;
            default:
                ci1 ci1Var6 = this.b;
                if (ci1Var6.m0 == 3) {
                    ci1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.d3 d3Var = ci1Var6.v;
                    if (!d3Var.O) {
                        d3Var.O = true;
                        break;
                    }
                }
                break;
        }
    }
}
