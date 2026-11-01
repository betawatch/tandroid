package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd1 b;

    public /* synthetic */ kd1(zd1 zd1Var, int i10) {
        this.a = i10;
        this.b = zd1Var;
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
                org.telegram.ui.Components.voip.c1 c1Var = this.b.Z;
                c1Var.c0 = false;
                c1Var.invalidate();
                break;
            case 5:
                zd1 zd1Var = this.b;
                zd1Var.q0 = zd1Var.p0;
                zd1Var.G();
                break;
            case 6:
                this.b.A();
                break;
            case 7:
                int[] iArr = new int[2];
                zd1 zd1Var2 = this.b;
                zd1Var2.e0.getLocationOnScreen(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                zd1Var2.e.getLocationOnScreen(iArr);
                zd1Var2.e.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                zd1Var2.e.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                zd1Var2.h.getLocationOnScreen(iArr);
                zd1Var2.h.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                zd1Var2.h.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                zd1Var2.f.getLocationOnScreen(iArr);
                zd1Var2.f.setTranslationX(org.telegram.messenger.i0.L(42.0f) + (i10 - iArr[0]));
                zd1Var2.f.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                zd1Var2.n.getLocationOnScreen(iArr);
                zd1Var2.n.setTranslationX((((zd1Var2.e0.getWidth() + i10) - iArr[0]) - org.telegram.messenger.i0.L(49.0f)) - org.telegram.messenger.i0.L(60.0f));
                zd1Var2.n.setTranslationY(org.telegram.messenger.i0.L(44.0f) + (i11 - iArr[1]));
                zd1Var2.n.setAlpha(1.0f);
                zd1Var2.e.setAlpha(1.0f);
                zd1Var2.h.setAlpha(1.0f);
                zd1Var2.f.setAlpha(1.0f);
                ViewPropertyAnimator translationX = zd1Var2.n.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f);
                long j10 = org.telegram.messenger.at.e3;
                translationX.setDuration(j10).start();
                zd1Var2.e.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                zd1Var2.h.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                zd1Var2.f.animate().setStartDelay(0L).translationY(0.0f).setInterpolator(new LinearInterpolator()).translationX(0.0f).setDuration(j10).start();
                break;
            case 8:
                this.b.u0.b();
                break;
            case 9:
                int i12 = org.telegram.messenger.uz.f1;
                if (i12 < 2) {
                    org.telegram.messenger.uz.f1 = i12 + 1;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.uz.f1);
                    edit.apply();
                    zd1 zd1Var3 = this.b;
                    zd1Var3.O0.setTranslationY(zd1Var3.N.getY() + org.telegram.messenger.i0.L(36.0f));
                    zd1Var3.O0.u();
                    break;
                }
                break;
            case 10:
                this.b.u0.b();
                break;
            case 11:
                zd1 zd1Var4 = this.b;
                zd1Var4.u0.setAlpha(1.0f);
                zd1Var4.u0.invalidate();
                ValueAnimator b10 = zd1Var4.b(true);
                zd1Var4.H.setAlpha(0.0f);
                zd1Var4.I.setAlpha(0.0f);
                zd1Var4.N.setAlpha(0.0f);
                zd1Var4.X.setAlpha(0.0f);
                zd1Var4.j0.setAlpha(0.0f);
                zd1Var4.h0.setAlpha(0.0f);
                zd1Var4.i0.setAlpha(0.0f);
                zd1Var4.K.setAlpha(0.0f);
                zd1Var4.M0.setAlpha(0.0f);
                zd1Var4.Y.b0 = true;
                org.telegram.messenger.i0.h3(new y01(23, zd1Var4, b10), 32L);
                break;
            case 12:
                zd1 zd1Var5 = this.b;
                zd1Var5.R0 = false;
                org.telegram.ui.Components.voip.l2 l2Var = zd1Var5.N0;
                boolean z10 = l2Var != null && l2Var.V;
                if (zd1Var5.z0 && zd1Var5.x0 && !zd1Var5.C0 && !z10) {
                    zd1Var5.K0 = System.currentTimeMillis();
                    zd1Var5.z(false);
                    zd1Var5.q0 = zd1Var5.p0;
                    zd1Var5.G();
                    break;
                }
                break;
            default:
                zd1 zd1Var6 = this.b;
                if (zd1Var6.p0 == 3) {
                    zd1Var6.D.b(true, false);
                    org.telegram.ui.Components.voip.k2 k2Var = zd1Var6.w;
                    if (!k2Var.R) {
                        k2Var.R = true;
                        break;
                    }
                }
                break;
        }
    }
}
