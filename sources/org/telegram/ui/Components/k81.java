package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class k81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w81 b;

    public /* synthetic */ k81(w81 w81Var, int i10) {
        this.a = i10;
        this.b = w81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w81 w81Var = this.b;
                View[] viewArr = w81Var.e;
                View[] viewArr2 = w81Var.e;
                if (viewArr[1] != null) {
                    w81Var.F();
                    w81Var.h.put(w81Var.f[1], viewArr2[1]);
                    w81Var.removeView(viewArr2[1]);
                    w81Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                w81Var.Q = null;
                w81Var.w(true);
                l81 l81Var = w81Var.M;
                if (l81Var != null) {
                    l81Var.v.invalidate();
                    w81Var.M.v.f1();
                    w81Var.M.invalidate();
                }
                w81Var.u();
                w81Var.J.unlock();
                break;
            case 1:
                w81 w81Var2 = this.b;
                w81Var2.w = null;
                View[] viewArr3 = w81Var2.e;
                if (viewArr3[1] != null) {
                    if (!w81Var2.F) {
                        w81Var2.F();
                    }
                    w81Var2.h.put(w81Var2.f[1], viewArr3[1]);
                    w81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                w81Var2.x = false;
                w81Var2.I = false;
                l81 l81Var2 = w81Var2.M;
                if (l81Var2 != null) {
                    l81Var2.setEnabled(true);
                }
                w81Var2.w(false);
                w81Var2.u();
                w81Var2.J.unlock();
                break;
            case 2:
                w81 w81Var3 = this.b;
                w81Var3.w = null;
                View[] viewArr4 = w81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    w81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                w81Var3.x = false;
                l81 l81Var3 = w81Var3.M;
                if (l81Var3 != null) {
                    l81Var3.setEnabled(true);
                    l81 l81Var4 = w81Var3.M;
                    l81Var4.J = false;
                    l81Var4.a = 1.0f;
                    l81Var4.v.f1();
                    w81Var3.M.invalidate();
                    break;
                }
                break;
            default:
                w81 w81Var4 = this.b;
                w81Var4.w = null;
                View[] viewArr5 = w81Var4.e;
                if (viewArr5[1] != null) {
                    if (!w81Var4.F) {
                        w81Var4.F();
                    }
                    w81Var4.h.put(w81Var4.f[1], viewArr5[1]);
                    w81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                w81Var4.x = false;
                w81Var4.I = false;
                l81 l81Var5 = w81Var4.M;
                if (l81Var5 != null) {
                    l81Var5.setEnabled(true);
                }
                w81Var4.w(false);
                w81Var4.u();
                w81Var4.J.unlock();
                break;
        }
    }
}
