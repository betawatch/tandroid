package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class md1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ be1 b;

    public /* synthetic */ md1(be1 be1Var, int i10) {
        this.a = i10;
        this.b = be1Var;
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
                org.telegram.ui.Components.voip.b1 b1Var = this.b.Z;
                b1Var.c0 = false;
                b1Var.invalidate();
                break;
            case 5:
                be1 be1Var = this.b;
                be1Var.q0 = be1Var.p0;
                be1Var.G();
                break;
            case 6:
                this.b.A();
                break;
            case 7:
                int[] iArr = new int[2];
                be1 be1Var2 = this.b;
                be1Var2.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                be1Var2.e.getLocationOnScreen(iArr);
                be1Var2.e.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                be1Var2.e.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                be1Var2.h.getLocationOnScreen(iArr);
                be1Var2.h.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                be1Var2.h.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                be1Var2.f.getLocationOnScreen(iArr);
                be1Var2.f.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                be1Var2.f.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                be1Var2.n.getLocationOnScreen(iArr);
                be1Var2.n.setTranslationX((((be1Var2.e0.getWidth() + i10) - iArr[0]) - org.telegram.messenger.i0.L(49.0f)) - org.telegram.messenger.i0.L(60.0f));
                be1Var2.n.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                be1Var2.n.setAlpha(1.0f);
                be1Var2.e.setAlpha(1.0f);
                be1Var2.h.setAlpha(1.0f);
                be1Var2.f.setAlpha(1.0f);
                ViewPropertyAnimator translationX = be1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f);
                long j10 = org.telegram.messenger.zs.e3;
                translationX.setDuration(j10).start();
                be1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                be1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                be1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.b.u0.b();
                break;
            case 9:
                int i12 = org.telegram.messenger.tz.f1;
                if (i12 < 2) {
                    org.telegram.messenger.tz.f1 = i12 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.tz.f1);
                    edit.apply();
                    be1 be1Var3 = this.b;
                    be1Var3.O0.setTranslationY(be1Var3.N.getY() + org.telegram.messenger.i0.L(36.0f));
                    be1Var3.O0.u();
                    break;
                }
                break;
            case 10:
                this.b.u0.b();
                break;
            case 11:
                be1 be1Var4 = this.b;
                be1Var4.u0.setAlpha(1.0f);
                be1Var4.u0.invalidate();
                ValueAnimator b10 = be1Var4.b(true);
                be1Var4.H.setAlpha(0.0f);
                be1Var4.I.setAlpha(0.0f);
                be1Var4.N.setAlpha(0.0f);
                be1Var4.X.setAlpha(0.0f);
                be1Var4.j0.setAlpha(0.0f);
                be1Var4.h0.setAlpha(0.0f);
                be1Var4.i0.setAlpha(0.0f);
                be1Var4.K.setAlpha(0.0f);
                be1Var4.M0.setAlpha(0.0f);
                be1Var4.Y.b0 = true;
                org.telegram.messenger.i0.h3(new t11(22, be1Var4, b10), 32L);
                break;
            case 12:
                be1 be1Var5 = this.b;
                be1Var5.R0 = false;
                org.telegram.ui.Components.voip.k2 k2Var = be1Var5.N0;
                boolean z10 = k2Var != null && k2Var.V;
                if (be1Var5.z0 && be1Var5.x0 && !be1Var5.C0 && !z10) {
                    be1Var5.K0 = System.currentTimeMillis();
                    be1Var5.z(false);
                    be1Var5.q0 = be1Var5.p0;
                    be1Var5.G();
                    break;
                }
                break;
            default:
                be1 be1Var6 = this.b;
                if (be1Var6.p0 == 3) {
                    be1Var6.D.b(true, false);
                    org.telegram.ui.Components.voip.j2 j2Var = be1Var6.w;
                    if (!j2Var.R) {
                        j2Var.R = true;
                        break;
                    }
                }
                break;
        }
    }
}
