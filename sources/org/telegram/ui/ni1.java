package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj1 b;

    public /* synthetic */ ni1(dj1 dj1Var, int i10) {
        this.a = i10;
        this.b = dj1Var;
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
                dj1 dj1Var = this.b;
                dj1Var.q0 = dj1Var.p0;
                dj1Var.G();
                break;
            case 6:
                this.b.A();
                break;
            case 7:
                int[] iArr = new int[2];
                dj1 dj1Var2 = this.b;
                dj1Var2.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                dj1Var2.e.getLocationOnScreen(iArr);
                dj1Var2.e.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                dj1Var2.e.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                dj1Var2.h.getLocationOnScreen(iArr);
                dj1Var2.h.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                dj1Var2.h.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                dj1Var2.f.getLocationOnScreen(iArr);
                dj1Var2.f.setTranslationX(AndroidUtilities.dp(42.0f) + (i10 - iArr[0]));
                dj1Var2.f.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                dj1Var2.n.getLocationOnScreen(iArr);
                dj1Var2.n.setTranslationX((((dj1Var2.e0.getWidth() + i10) - iArr[0]) - AndroidUtilities.dp(49.0f)) - AndroidUtilities.dp(60.0f));
                dj1Var2.n.setTranslationY(AndroidUtilities.dp(44.0f) + (i11 - iArr[1]));
                dj1Var2.n.setAlpha(1.0f);
                dj1Var2.e.setAlpha(1.0f);
                dj1Var2.h.setAlpha(1.0f);
                dj1Var2.f.setAlpha(1.0f);
                long j10 = 200;
                dj1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                dj1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                dj1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                dj1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.b.u0.b();
                break;
            case 9:
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(1);
                    dj1 dj1Var3 = this.b;
                    dj1Var3.O0.setTranslationY(dj1Var3.N.getY() + AndroidUtilities.dp(36.0f));
                    dj1Var3.O0.u();
                    break;
                }
                break;
            case 10:
                this.b.u0.b();
                break;
            case 11:
                dj1 dj1Var4 = this.b;
                dj1Var4.u0.setAlpha(1.0f);
                dj1Var4.u0.invalidate();
                ValueAnimator j11 = dj1Var4.j(true);
                dj1Var4.H.setAlpha(0.0f);
                dj1Var4.I.setAlpha(0.0f);
                dj1Var4.N.setAlpha(0.0f);
                dj1Var4.X.setAlpha(0.0f);
                dj1Var4.j0.setAlpha(0.0f);
                dj1Var4.h0.setAlpha(0.0f);
                dj1Var4.i0.setAlpha(0.0f);
                dj1Var4.K.setAlpha(0.0f);
                dj1Var4.M0.setAlpha(0.0f);
                dj1Var4.Y.b0 = true;
                AndroidUtilities.runOnUIThread(new je1(11, dj1Var4, j11), 32L);
                break;
            case 12:
                dj1 dj1Var5 = this.b;
                dj1Var5.R0 = false;
                org.telegram.ui.Components.voip.c3 c3Var = dj1Var5.N0;
                boolean z10 = c3Var != null && c3Var.V;
                if (dj1Var5.z0 && dj1Var5.x0 && !dj1Var5.C0 && !z10) {
                    dj1Var5.K0 = System.currentTimeMillis();
                    dj1Var5.z(false);
                    dj1Var5.q0 = dj1Var5.p0;
                    dj1Var5.G();
                    break;
                }
                break;
            default:
                dj1 dj1Var6 = this.b;
                if (dj1Var6.p0 == 3) {
                    dj1Var6.y.b(true, false);
                    org.telegram.ui.Components.voip.b3 b3Var = dj1Var6.v;
                    if (!b3Var.R) {
                        b3Var.R = true;
                        break;
                    }
                }
                break;
        }
    }
}
