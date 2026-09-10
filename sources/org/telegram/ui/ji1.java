package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ji1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi1 b;

    public /* synthetic */ ji1(zi1 zi1Var, int i10) {
        this.a = i10;
        this.b = zi1Var;
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
                org.telegram.ui.Components.voip.t1 t1Var = this.b.Z;
                t1Var.c0 = false;
                t1Var.invalidate();
                break;
            case 5:
                zi1 zi1Var = this.b;
                zi1Var.q0 = zi1Var.p0;
                zi1Var.H();
                break;
            case 6:
                this.b.B();
                break;
            case 7:
                int[] iArr = new int[2];
                zi1 zi1Var2 = this.b;
                zi1Var2.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                zi1Var2.e.getLocationOnScreen(iArr);
                zi1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                zi1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                zi1Var2.h.getLocationOnScreen(iArr);
                zi1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                zi1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                zi1Var2.f.getLocationOnScreen(iArr);
                zi1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                zi1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                zi1Var2.n.getLocationOnScreen(iArr);
                zi1Var2.n.setTranslationX((((zi1Var2.e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                zi1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                zi1Var2.n.setAlpha(1.0f);
                zi1Var2.e.setAlpha(1.0f);
                zi1Var2.h.setAlpha(1.0f);
                zi1Var2.f.setAlpha(1.0f);
                long j3 = 200;
                zi1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                zi1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                zi1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                zi1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                break;
            case 8:
                this.b.u0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    zi1 zi1Var3 = this.b;
                    zi1Var3.O0.setTranslationY(zi1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    zi1Var3.O0.u();
                    break;
                }
                break;
            case 10:
                this.b.u0.b();
                break;
            case 11:
                zi1 zi1Var4 = this.b;
                zi1Var4.u0.setAlpha(1.0f);
                zi1Var4.u0.invalidate();
                ValueAnimator k10 = zi1Var4.k(true);
                zi1Var4.H.setAlpha(0.0f);
                zi1Var4.I.setAlpha(0.0f);
                zi1Var4.N.setAlpha(0.0f);
                zi1Var4.X.setAlpha(0.0f);
                zi1Var4.j0.setAlpha(0.0f);
                zi1Var4.h0.setAlpha(0.0f);
                zi1Var4.i0.setAlpha(0.0f);
                zi1Var4.K.setAlpha(0.0f);
                zi1Var4.M0.setAlpha(0.0f);
                zi1Var4.Y.b0 = true;
                AndroidUtilities.runOnUIThread(new r91(19, zi1Var4, k10), 32L);
                break;
            case 12:
                zi1 zi1Var5 = this.b;
                zi1Var5.R0 = false;
                org.telegram.ui.Components.voip.d3 d3Var = zi1Var5.N0;
                boolean z10 = d3Var != null && d3Var.V;
                if (zi1Var5.z0 && zi1Var5.x0 && !zi1Var5.C0 && !z10) {
                    zi1Var5.K0 = System.currentTimeMillis();
                    zi1Var5.A(false);
                    zi1Var5.q0 = zi1Var5.p0;
                    zi1Var5.H();
                    break;
                }
                break;
            default:
                zi1 zi1Var6 = this.b;
                if (zi1Var6.p0 == 3) {
                    zi1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.c3 c3Var = zi1Var6.v;
                    if (!c3Var.R) {
                        c3Var.R = true;
                        break;
                    }
                }
                break;
        }
    }
}
