package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb1 b;

    public /* synthetic */ kb1(zb1 zb1Var, int i3) {
        this.a = i3;
        this.b = zb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.v0.b();
                break;
            case 1:
                this.b.v0.b();
                break;
            case 2:
                this.b.v0.b();
                break;
            case 3:
                this.b.v0.b();
                break;
            case 4:
                org.telegram.ui.Components.voip.c1 c1Var = this.b.a0;
                c1Var.d0 = false;
                c1Var.invalidate();
                break;
            case 5:
                zb1 zb1Var = this.b;
                zb1Var.r0 = zb1Var.q0;
                zb1Var.G();
                break;
            case 6:
                this.b.A();
                break;
            case 7:
                int[] iArr = new int[2];
                zb1 zb1Var2 = this.b;
                zb1Var2.f0.getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i10 = iArr[1];
                zb1Var2.e.getLocationOnScreen(iArr);
                zb1Var2.e.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i3 - iArr[0]));
                zb1Var2.e.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                zb1Var2.h.getLocationOnScreen(iArr);
                zb1Var2.h.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i3 - iArr[0]));
                zb1Var2.h.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                zb1Var2.f.getLocationOnScreen(iArr);
                zb1Var2.f.setTranslationX(org.telegram.messenger.g0.L(42.0f) + (i3 - iArr[0]));
                zb1Var2.f.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                zb1Var2.n.getLocationOnScreen(iArr);
                zb1Var2.n.setTranslationX((((zb1Var2.f0.getWidth() + i3) - iArr[0]) - org.telegram.messenger.g0.L(49.0f)) - org.telegram.messenger.g0.L(60.0f));
                zb1Var2.n.setTranslationY(org.telegram.messenger.g0.L(44.0f) + (i10 - iArr[1]));
                zb1Var2.n.setAlpha(1.0f);
                zb1Var2.e.setAlpha(1.0f);
                zb1Var2.h.setAlpha(1.0f);
                zb1Var2.f.setAlpha(1.0f);
                ViewPropertyAnimator translationX = zb1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f);
                long j10 = org.telegram.messenger.hs.e3;
                translationX.setDuration(j10).start();
                zb1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                zb1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                zb1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.b.v0.b();
                break;
            case 9:
                int i11 = org.telegram.messenger.az.f1;
                if (i11 < 2) {
                    org.telegram.messenger.az.f1 = i11 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.az.f1);
                    edit.apply();
                    zb1 zb1Var3 = this.b;
                    zb1Var3.P0.setTranslationY(zb1Var3.O.getY() + org.telegram.messenger.g0.L(36.0f));
                    zb1Var3.P0.w();
                    break;
                }
                break;
            case 10:
                this.b.v0.b();
                break;
            case 11:
                zb1 zb1Var4 = this.b;
                zb1Var4.v0.setAlpha(1.0f);
                zb1Var4.v0.invalidate();
                ValueAnimator b10 = zb1Var4.b(true);
                zb1Var4.I.setAlpha(0.0f);
                zb1Var4.J.setAlpha(0.0f);
                zb1Var4.O.setAlpha(0.0f);
                zb1Var4.Y.setAlpha(0.0f);
                zb1Var4.k0.setAlpha(0.0f);
                zb1Var4.i0.setAlpha(0.0f);
                zb1Var4.j0.setAlpha(0.0f);
                zb1Var4.L.setAlpha(0.0f);
                zb1Var4.N0.setAlpha(0.0f);
                zb1Var4.Z.c0 = true;
                org.telegram.messenger.g0.i3(new ma1(4, zb1Var4, b10), 32L);
                break;
            case 12:
                zb1 zb1Var5 = this.b;
                zb1Var5.S0 = false;
                org.telegram.ui.Components.zo zoVar = zb1Var5.O0;
                boolean z10 = zoVar != null && zoVar.W;
                if (zb1Var5.A0 && zb1Var5.y0 && !zb1Var5.D0 && !z10) {
                    zb1Var5.L0 = System.currentTimeMillis();
                    zb1Var5.z(false);
                    zb1Var5.r0 = zb1Var5.q0;
                    zb1Var5.G();
                    break;
                }
                break;
            default:
                zb1 zb1Var6 = this.b;
                if (zb1Var6.q0 == 3) {
                    zb1Var6.E.b(true, false);
                    org.telegram.ui.Components.voip.j2 j2Var = zb1Var6.w;
                    if (!j2Var.S) {
                        j2Var.S = true;
                        break;
                    }
                }
                break;
        }
    }
}
