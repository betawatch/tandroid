package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class di1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti1 b;

    public /* synthetic */ di1(ti1 ti1Var, int i10) {
        this.a = i10;
        this.b = ti1Var;
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
                org.telegram.ui.Components.voip.u1 u1Var = this.b.Z;
                u1Var.c0 = false;
                u1Var.invalidate();
                break;
            case 5:
                ti1 ti1Var = this.b;
                ti1Var.q0 = ti1Var.p0;
                ti1Var.H();
                break;
            case 6:
                this.b.B();
                break;
            case 7:
                int[] iArr = new int[2];
                ti1 ti1Var2 = this.b;
                ti1Var2.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                ti1Var2.e.getLocationOnScreen(iArr);
                ti1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ti1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ti1Var2.h.getLocationOnScreen(iArr);
                ti1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ti1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ti1Var2.f.getLocationOnScreen(iArr);
                ti1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                ti1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ti1Var2.n.getLocationOnScreen(iArr);
                ti1Var2.n.setTranslationX((((ti1Var2.e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                ti1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                ti1Var2.n.setAlpha(1.0f);
                ti1Var2.e.setAlpha(1.0f);
                ti1Var2.h.setAlpha(1.0f);
                ti1Var2.f.setAlpha(1.0f);
                long j3 = 200;
                ti1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ti1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ti1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ti1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                break;
            case 8:
                this.b.u0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    ti1 ti1Var3 = this.b;
                    ti1Var3.O0.setTranslationY(ti1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    ti1Var3.O0.u();
                    break;
                }
                break;
            case 10:
                this.b.u0.b();
                break;
            case 11:
                ti1 ti1Var4 = this.b;
                ti1Var4.u0.setAlpha(1.0f);
                ti1Var4.u0.invalidate();
                ValueAnimator k10 = ti1Var4.k(true);
                ti1Var4.H.setAlpha(0.0f);
                ti1Var4.I.setAlpha(0.0f);
                ti1Var4.N.setAlpha(0.0f);
                ti1Var4.X.setAlpha(0.0f);
                ti1Var4.j0.setAlpha(0.0f);
                ti1Var4.h0.setAlpha(0.0f);
                ti1Var4.i0.setAlpha(0.0f);
                ti1Var4.K.setAlpha(0.0f);
                ti1Var4.M0.setAlpha(0.0f);
                ti1Var4.Y.b0 = true;
                AndroidUtilities.runOnUIThread(new qb1(16, ti1Var4, k10), 32L);
                break;
            case 12:
                ti1 ti1Var5 = this.b;
                ti1Var5.R0 = false;
                org.telegram.ui.Components.voip.d3 d3Var = ti1Var5.N0;
                boolean z10 = d3Var != null && d3Var.V;
                if (ti1Var5.z0 && ti1Var5.x0 && !ti1Var5.C0 && !z10) {
                    ti1Var5.K0 = System.currentTimeMillis();
                    ti1Var5.A(false);
                    ti1Var5.q0 = ti1Var5.p0;
                    ti1Var5.H();
                    break;
                }
                break;
            default:
                ti1 ti1Var6 = this.b;
                if (ti1Var6.p0 == 3) {
                    ti1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.c3 c3Var = ti1Var6.v;
                    if (!c3Var.R) {
                        c3Var.R = true;
                        break;
                    }
                }
                break;
        }
    }
}
