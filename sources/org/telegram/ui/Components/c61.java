package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n61 b;

    public /* synthetic */ c61(n61 n61Var, int i3) {
        this.a = i3;
        this.b = n61Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n61 n61Var = this.b;
                View[] viewArr = n61Var.e;
                View[] viewArr2 = n61Var.e;
                if (viewArr[1] != null) {
                    n61Var.F();
                    n61Var.h.put(n61Var.f[1], viewArr2[1]);
                    n61Var.removeView(viewArr2[1]);
                    n61Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                n61Var.T = null;
                n61Var.v(true);
                d61 d61Var = n61Var.N;
                if (d61Var != null) {
                    d61Var.w.invalidate();
                    n61Var.N.w.g1();
                    n61Var.N.invalidate();
                }
                n61Var.s();
                n61Var.K.e();
                break;
            case 1:
                n61 n61Var2 = this.b;
                n61Var2.x = null;
                View[] viewArr3 = n61Var2.e;
                if (viewArr3[1] != null) {
                    if (!n61Var2.G) {
                        n61Var2.F();
                    }
                    n61Var2.h.put(n61Var2.f[1], viewArr3[1]);
                    n61Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                n61Var2.y = false;
                n61Var2.J = false;
                d61 d61Var2 = n61Var2.N;
                if (d61Var2 != null) {
                    d61Var2.setEnabled(true);
                }
                n61Var2.v(false);
                n61Var2.s();
                n61Var2.K.e();
                break;
            case 2:
                n61 n61Var3 = this.b;
                n61Var3.x = null;
                View[] viewArr4 = n61Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    n61Var3.removeView(view);
                    viewArr4[1] = null;
                }
                n61Var3.y = false;
                d61 d61Var3 = n61Var3.N;
                if (d61Var3 != null) {
                    d61Var3.setEnabled(true);
                    d61 d61Var4 = n61Var3.N;
                    d61Var4.K = false;
                    d61Var4.a = 1.0f;
                    d61Var4.w.g1();
                    n61Var3.N.invalidate();
                    break;
                }
                break;
            default:
                n61 n61Var4 = this.b;
                n61Var4.x = null;
                View[] viewArr5 = n61Var4.e;
                if (viewArr5[1] != null) {
                    if (!n61Var4.G) {
                        n61Var4.F();
                    }
                    n61Var4.h.put(n61Var4.f[1], viewArr5[1]);
                    n61Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                n61Var4.y = false;
                n61Var4.J = false;
                d61 d61Var5 = n61Var4.N;
                if (d61Var5 != null) {
                    d61Var5.setEnabled(true);
                }
                n61Var4.v(false);
                n61Var4.s();
                n61Var4.K.e();
                break;
        }
    }
}
