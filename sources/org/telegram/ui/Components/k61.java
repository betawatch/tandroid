package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w61 b;

    public /* synthetic */ k61(w61 w61Var, int i7) {
        this.a = i7;
        this.b = w61Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w61 w61Var = this.b;
                View[] viewArr = w61Var.e;
                View[] viewArr2 = w61Var.e;
                if (viewArr[1] != null) {
                    w61Var.G();
                    w61Var.h.put(w61Var.f[1], viewArr2[1]);
                    w61Var.removeView(viewArr2[1]);
                    w61Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                w61Var.S = null;
                w61Var.x(true);
                l61 l61Var = w61Var.M;
                if (l61Var != null) {
                    l61Var.w.invalidate();
                    w61Var.M.w.g1();
                    w61Var.M.invalidate();
                }
                w61Var.u();
                w61Var.J.e();
                break;
            case 1:
                w61 w61Var2 = this.b;
                w61Var2.x = null;
                View[] viewArr3 = w61Var2.e;
                if (viewArr3[1] != null) {
                    if (!w61Var2.F) {
                        w61Var2.G();
                    }
                    w61Var2.h.put(w61Var2.f[1], viewArr3[1]);
                    w61Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                w61Var2.y = false;
                w61Var2.I = false;
                l61 l61Var2 = w61Var2.M;
                if (l61Var2 != null) {
                    l61Var2.setEnabled(true);
                }
                w61Var2.x(false);
                w61Var2.u();
                w61Var2.J.e();
                break;
            case 2:
                w61 w61Var3 = this.b;
                w61Var3.x = null;
                View[] viewArr4 = w61Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    w61Var3.removeView(view);
                    viewArr4[1] = null;
                }
                w61Var3.y = false;
                l61 l61Var3 = w61Var3.M;
                if (l61Var3 != null) {
                    l61Var3.setEnabled(true);
                    l61 l61Var4 = w61Var3.M;
                    l61Var4.J = false;
                    l61Var4.a = 1.0f;
                    l61Var4.w.g1();
                    w61Var3.M.invalidate();
                    break;
                }
                break;
            default:
                w61 w61Var4 = this.b;
                w61Var4.x = null;
                View[] viewArr5 = w61Var4.e;
                if (viewArr5[1] != null) {
                    if (!w61Var4.F) {
                        w61Var4.G();
                    }
                    w61Var4.h.put(w61Var4.f[1], viewArr5[1]);
                    w61Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                w61Var4.y = false;
                w61Var4.I = false;
                l61 l61Var5 = w61Var4.M;
                if (l61Var5 != null) {
                    l61Var5.setEnabled(true);
                }
                w61Var4.x(false);
                w61Var4.u();
                w61Var4.J.e();
                break;
        }
    }
}
