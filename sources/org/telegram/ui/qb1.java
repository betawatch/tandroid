package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ec1 b;

    public /* synthetic */ qb1(ec1 ec1Var, int i7) {
        this.a = i7;
        this.b = ec1Var;
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
                org.telegram.ui.Components.voip.r1 r1Var = this.b.a0;
                r1Var.d0 = false;
                r1Var.invalidate();
                break;
            case 5:
                ec1 ec1Var = this.b;
                ec1Var.q0 = ec1Var.p0;
                ec1Var.y();
                break;
            case 6:
                this.b.s();
                break;
            case 7:
                int[] iArr = new int[2];
                ec1 ec1Var2 = this.b;
                ec1Var2.f0.getLocationOnScreen(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                ec1Var2.e.getLocationOnScreen(iArr);
                ec1Var2.e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ec1Var2.e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.h.getLocationOnScreen(iArr);
                ec1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ec1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.f.getLocationOnScreen(iArr);
                ec1Var2.f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i7 - iArr[0]));
                ec1Var2.f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.n.getLocationOnScreen(iArr);
                ec1Var2.n.setTranslationX((((ec1Var2.f0.getWidth() + i7) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                ec1Var2.n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                ec1Var2.n.setAlpha(1.0f);
                ec1Var2.e.setAlpha(1.0f);
                ec1Var2.h.setAlpha(1.0f);
                ec1Var2.f.setAlpha(1.0f);
                ViewPropertyAnimator translationX = ec1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f);
                long j3 = org.telegram.messenger.ns.e3;
                translationX.setDuration(j3).start();
                ec1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ec1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                ec1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j3).start();
                break;
            case 8:
                this.b.u0.b();
                break;
            case 9:
                int i11 = org.telegram.messenger.gz.f1;
                if (i11 < 2) {
                    org.telegram.messenger.gz.f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.gz.f1);
                    edit.apply();
                    ec1 ec1Var3 = this.b;
                    ec1Var3.O0.setTranslationY(ec1Var3.O.getY() + org.telegram.messenger.g0.L(36.0f));
                    ec1Var3.O0.w();
                    break;
                }
                break;
            case 10:
                this.b.u0.b();
                break;
            case 11:
                ec1 ec1Var4 = this.b;
                ec1Var4.u0.setAlpha(1.0f);
                ec1Var4.u0.invalidate();
                ValueAnimator b10 = ec1Var4.b(true);
                ec1Var4.I.setAlpha(0.0f);
                ec1Var4.J.setAlpha(0.0f);
                ec1Var4.O.setAlpha(0.0f);
                ec1Var4.Y.setAlpha(0.0f);
                ec1Var4.j0.setAlpha(0.0f);
                ec1Var4.h0.setAlpha(0.0f);
                ec1Var4.i0.setAlpha(0.0f);
                ec1Var4.L.setAlpha(0.0f);
                ec1Var4.M0.setAlpha(0.0f);
                ec1Var4.Z.c0 = true;
                org.telegram.messenger.g0.i3(new fy0(26, ec1Var4, b10), 32L);
                break;
            case 12:
                ec1 ec1Var5 = this.b;
                ec1Var5.R0 = false;
                org.telegram.ui.Components.ip ipVar = ec1Var5.N0;
                boolean z10 = ipVar != null && ipVar.W;
                if (ec1Var5.z0 && ec1Var5.x0 && !ec1Var5.C0 && !z10) {
                    ec1Var5.K0 = System.currentTimeMillis();
                    ec1Var5.r(false);
                    ec1Var5.q0 = ec1Var5.p0;
                    ec1Var5.y();
                    break;
                }
                break;
            case 13:
                ec1 ec1Var6 = this.b;
                if (ec1Var6.p0 == 3) {
                    ec1Var6.E.b(true, false);
                    org.telegram.ui.Components.voip.y2 y2Var = ec1Var6.w;
                    if (!y2Var.S) {
                        y2Var.S = true;
                        break;
                    }
                }
                break;
            default:
                ec1 ec1Var7 = this.b;
                if (!ec1Var7.G0 && !ec1Var7.E0) {
                    ec1Var7.g();
                    break;
                }
                break;
        }
    }
}
