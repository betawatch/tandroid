package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x71 b;

    public /* synthetic */ m71(x71 x71Var, int i10) {
        this.a = i10;
        this.b = x71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x71 x71Var = this.b;
                View[] viewArr = x71Var.e;
                View[] viewArr2 = x71Var.e;
                if (viewArr[1] != null) {
                    x71Var.G();
                    x71Var.h.put(x71Var.f[1], viewArr2[1]);
                    x71Var.removeView(viewArr2[1]);
                    x71Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                x71Var.S = null;
                x71Var.x(true);
                n71 n71Var = x71Var.M;
                if (n71Var != null) {
                    n71Var.w.invalidate();
                    x71Var.M.w.g1();
                    x71Var.M.invalidate();
                }
                x71Var.u();
                x71Var.J.e();
                break;
            case 1:
                x71 x71Var2 = this.b;
                x71Var2.x = null;
                View[] viewArr3 = x71Var2.e;
                if (viewArr3[1] != null) {
                    if (!x71Var2.F) {
                        x71Var2.G();
                    }
                    x71Var2.h.put(x71Var2.f[1], viewArr3[1]);
                    x71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                x71Var2.y = false;
                x71Var2.I = false;
                n71 n71Var2 = x71Var2.M;
                if (n71Var2 != null) {
                    n71Var2.setEnabled(true);
                }
                x71Var2.x(false);
                x71Var2.u();
                x71Var2.J.e();
                break;
            case 2:
                x71 x71Var3 = this.b;
                x71Var3.x = null;
                View[] viewArr4 = x71Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    x71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                x71Var3.y = false;
                n71 n71Var3 = x71Var3.M;
                if (n71Var3 != null) {
                    n71Var3.setEnabled(true);
                    n71 n71Var4 = x71Var3.M;
                    n71Var4.J = false;
                    n71Var4.a = 1.0f;
                    n71Var4.w.g1();
                    x71Var3.M.invalidate();
                    break;
                }
                break;
            default:
                x71 x71Var4 = this.b;
                x71Var4.x = null;
                View[] viewArr5 = x71Var4.e;
                if (viewArr5[1] != null) {
                    if (!x71Var4.F) {
                        x71Var4.G();
                    }
                    x71Var4.h.put(x71Var4.f[1], viewArr5[1]);
                    x71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                x71Var4.y = false;
                x71Var4.I = false;
                n71 n71Var5 = x71Var4.M;
                if (n71Var5 != null) {
                    n71Var5.setEnabled(true);
                }
                x71Var4.x(false);
                x71Var4.u();
                x71Var4.J.e();
                break;
        }
    }
}
