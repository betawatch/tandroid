package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k71 b;

    public /* synthetic */ z61(k71 k71Var, int i7) {
        this.a = i7;
        this.b = k71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k71 k71Var = this.b;
                View[] viewArr = k71Var.e;
                View[] viewArr2 = k71Var.e;
                if (viewArr[1] != null) {
                    k71Var.E();
                    k71Var.h.put(k71Var.f[1], viewArr2[1]);
                    k71Var.removeView(viewArr2[1]);
                    k71Var.D(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                k71Var.T = null;
                k71Var.u(true);
                a71 a71Var = k71Var.N;
                if (a71Var != null) {
                    a71Var.w.invalidate();
                    k71Var.N.w.g1();
                    k71Var.N.invalidate();
                }
                k71Var.r();
                k71Var.K.e();
                break;
            case 1:
                k71 k71Var2 = this.b;
                k71Var2.x = null;
                View[] viewArr3 = k71Var2.e;
                if (viewArr3[1] != null) {
                    if (!k71Var2.G) {
                        k71Var2.E();
                    }
                    k71Var2.h.put(k71Var2.f[1], viewArr3[1]);
                    k71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                k71Var2.y = false;
                k71Var2.J = false;
                a71 a71Var2 = k71Var2.N;
                if (a71Var2 != null) {
                    a71Var2.setEnabled(true);
                }
                k71Var2.u(false);
                k71Var2.r();
                k71Var2.K.e();
                break;
            case 2:
                k71 k71Var3 = this.b;
                k71Var3.x = null;
                View[] viewArr4 = k71Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    k71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                k71Var3.y = false;
                a71 a71Var3 = k71Var3.N;
                if (a71Var3 != null) {
                    a71Var3.setEnabled(true);
                    a71 a71Var4 = k71Var3.N;
                    a71Var4.K = false;
                    a71Var4.a = 1.0f;
                    a71Var4.w.g1();
                    k71Var3.N.invalidate();
                    break;
                }
                break;
            default:
                k71 k71Var4 = this.b;
                k71Var4.x = null;
                View[] viewArr5 = k71Var4.e;
                if (viewArr5[1] != null) {
                    if (!k71Var4.G) {
                        k71Var4.E();
                    }
                    k71Var4.h.put(k71Var4.f[1], viewArr5[1]);
                    k71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                k71Var4.y = false;
                k71Var4.J = false;
                a71 a71Var5 = k71Var4.N;
                if (a71Var5 != null) {
                    a71Var5.setEnabled(true);
                }
                k71Var4.u(false);
                k71Var4.r();
                k71Var4.K.e();
                break;
        }
    }
}
