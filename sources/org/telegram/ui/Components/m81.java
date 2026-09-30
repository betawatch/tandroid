package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class m81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ y81 b;

    public /* synthetic */ m81(y81 y81Var, int i10) {
        this.a = i10;
        this.b = y81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                y81 y81Var = this.b;
                View[] viewArr = y81Var.e;
                View[] viewArr2 = y81Var.e;
                if (viewArr[1] != null) {
                    y81Var.F();
                    y81Var.h.put(y81Var.f[1], viewArr2[1]);
                    y81Var.removeView(viewArr2[1]);
                    y81Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                y81Var.Q = null;
                y81Var.w(true);
                n81 n81Var = y81Var.M;
                if (n81Var != null) {
                    n81Var.v.invalidate();
                    y81Var.M.v.f1();
                    y81Var.M.invalidate();
                }
                y81Var.u();
                y81Var.J.unlock();
                break;
            case 1:
                y81 y81Var2 = this.b;
                y81Var2.w = null;
                View[] viewArr3 = y81Var2.e;
                if (viewArr3[1] != null) {
                    if (!y81Var2.F) {
                        y81Var2.F();
                    }
                    y81Var2.h.put(y81Var2.f[1], viewArr3[1]);
                    y81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                y81Var2.x = false;
                y81Var2.I = false;
                n81 n81Var2 = y81Var2.M;
                if (n81Var2 != null) {
                    n81Var2.setEnabled(true);
                }
                y81Var2.w(false);
                y81Var2.u();
                y81Var2.J.unlock();
                break;
            case 2:
                y81 y81Var3 = this.b;
                y81Var3.w = null;
                View[] viewArr4 = y81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    y81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                y81Var3.x = false;
                n81 n81Var3 = y81Var3.M;
                if (n81Var3 != null) {
                    n81Var3.setEnabled(true);
                    n81 n81Var4 = y81Var3.M;
                    n81Var4.J = false;
                    n81Var4.a = 1.0f;
                    n81Var4.v.f1();
                    y81Var3.M.invalidate();
                    break;
                }
                break;
            default:
                y81 y81Var4 = this.b;
                y81Var4.w = null;
                View[] viewArr5 = y81Var4.e;
                if (viewArr5[1] != null) {
                    if (!y81Var4.F) {
                        y81Var4.F();
                    }
                    y81Var4.h.put(y81Var4.f[1], viewArr5[1]);
                    y81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                y81Var4.x = false;
                y81Var4.I = false;
                n81 n81Var5 = y81Var4.M;
                if (n81Var5 != null) {
                    n81Var5.setEnabled(true);
                }
                y81Var4.w(false);
                y81Var4.u();
                y81Var4.J.unlock();
                break;
        }
    }
}
