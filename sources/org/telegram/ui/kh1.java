package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai1 b;

    public /* synthetic */ kh1(ai1 ai1Var, int i10) {
        this.a = i10;
        this.b = ai1Var;
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
                org.telegram.ui.Components.voip.s1 s1Var = this.b.W;
                s1Var.W = false;
                s1Var.invalidate();
                break;
            case 5:
                ai1 ai1Var = this.b;
                ai1Var.n0 = ai1Var.m0;
                ai1Var.H();
                break;
            case 6:
                this.b.B();
                break;
            case 7:
                int[] iArr = new int[2];
                ai1 ai1Var2 = this.b;
                ai1Var2.b0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ai1Var2.e.getLocationOnScreen(iArr);
                ai1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ai1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ai1Var2.h.getLocationOnScreen(iArr);
                ai1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ai1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ai1Var2.f.getLocationOnScreen(iArr);
                ai1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ai1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ai1Var2.n.getLocationOnScreen(iArr);
                ai1Var2.n.setTranslationX((((ai1Var2.b0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ai1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ai1Var2.n.setAlpha(1.0f);
                ai1Var2.e.setAlpha(1.0f);
                ai1Var2.h.setAlpha(1.0f);
                ai1Var2.f.setAlpha(1.0f);
                long j10 = 200;
                ai1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ai1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ai1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                ai1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.b.r0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ai1 ai1Var3 = this.b;
                    ai1Var3.L0.setTranslationY(ai1Var3.K.getY() + AndroidUtilities.dp(36.0f));
                    ai1Var3.L0.v();
                    break;
                }
                break;
            case 10:
                this.b.r0.b();
                break;
            case 11:
                ai1 ai1Var4 = this.b;
                ai1Var4.r0.setAlpha(1.0f);
                ai1Var4.r0.invalidate();
                ValueAnimator k10 = ai1Var4.k(true);
                ai1Var4.E.setAlpha(0.0f);
                ai1Var4.F.setAlpha(0.0f);
                ai1Var4.K.setAlpha(0.0f);
                ai1Var4.U.setAlpha(0.0f);
                ai1Var4.g0.setAlpha(0.0f);
                ai1Var4.e0.setAlpha(0.0f);
                ai1Var4.f0.setAlpha(0.0f);
                ai1Var4.H.setAlpha(0.0f);
                ai1Var4.J0.setAlpha(0.0f);
                ai1Var4.V.V = true;
                AndroidUtilities.runOnUIThread(new kg1(4, ai1Var4, k10), 32L);
                break;
            case 12:
                ai1 ai1Var5 = this.b;
                ai1Var5.O0 = false;
                org.telegram.ui.Components.voip.d3 d3Var = ai1Var5.K0;
                boolean z4 = d3Var != null && d3Var.S;
                if (ai1Var5.w0 && ai1Var5.u0 && !ai1Var5.z0 && !z4) {
                    ai1Var5.H0 = System.currentTimeMillis();
                    ai1Var5.A(false);
                    ai1Var5.n0 = ai1Var5.m0;
                    ai1Var5.H();
                    break;
                }
                break;
            default:
                ai1 ai1Var6 = this.b;
                if (ai1Var6.m0 == 3) {
                    ai1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.c3 c3Var = ai1Var6.v;
                    if (!c3Var.O) {
                        c3Var.O = true;
                        break;
                    }
                }
                break;
        }
    }
}
