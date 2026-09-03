package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l81 b;

    public /* synthetic */ a81(l81 l81Var, int i10) {
        this.a = i10;
        this.b = l81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l81 l81Var = this.b;
                View[] viewArr = l81Var.e;
                View[] viewArr2 = l81Var.e;
                if (viewArr[1] != null) {
                    l81Var.F();
                    l81Var.h.put(l81Var.f[1], viewArr2[1]);
                    l81Var.removeView(viewArr2[1]);
                    l81Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                l81Var.N = null;
                l81Var.w(true);
                b81 b81Var = l81Var.J;
                if (b81Var != null) {
                    b81Var.v.invalidate();
                    l81Var.J.v.e1();
                    l81Var.J.invalidate();
                }
                l81Var.u();
                l81Var.G.unlock();
                break;
            case 1:
                l81 l81Var2 = this.b;
                l81Var2.w = null;
                View[] viewArr3 = l81Var2.e;
                if (viewArr3[1] != null) {
                    if (!l81Var2.C) {
                        l81Var2.F();
                    }
                    l81Var2.h.put(l81Var2.f[1], viewArr3[1]);
                    l81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                l81Var2.x = false;
                l81Var2.F = false;
                b81 b81Var2 = l81Var2.J;
                if (b81Var2 != null) {
                    b81Var2.setEnabled(true);
                }
                l81Var2.w(false);
                l81Var2.u();
                l81Var2.G.unlock();
                break;
            case 2:
                l81 l81Var3 = this.b;
                l81Var3.w = null;
                View[] viewArr4 = l81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    l81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                l81Var3.x = false;
                b81 b81Var3 = l81Var3.J;
                if (b81Var3 != null) {
                    b81Var3.setEnabled(true);
                    b81 b81Var4 = l81Var3.J;
                    b81Var4.G = false;
                    b81Var4.a = 1.0f;
                    b81Var4.v.e1();
                    l81Var3.J.invalidate();
                    break;
                }
                break;
            default:
                l81 l81Var4 = this.b;
                l81Var4.w = null;
                View[] viewArr5 = l81Var4.e;
                if (viewArr5[1] != null) {
                    if (!l81Var4.C) {
                        l81Var4.F();
                    }
                    l81Var4.h.put(l81Var4.f[1], viewArr5[1]);
                    l81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                l81Var4.x = false;
                l81Var4.F = false;
                b81 b81Var5 = l81Var4.J;
                if (b81Var5 != null) {
                    b81Var5.setEnabled(true);
                }
                l81Var4.w(false);
                l81Var4.u();
                l81Var4.G.unlock();
                break;
        }
    }
}
