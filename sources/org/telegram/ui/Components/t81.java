package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class t81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e91 b;

    public /* synthetic */ t81(e91 e91Var, int i10) {
        this.a = i10;
        this.b = e91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                e91 e91Var = this.b;
                View[] viewArr = e91Var.e;
                View[] viewArr2 = e91Var.e;
                if (viewArr[1] != null) {
                    e91Var.F();
                    e91Var.h.put(e91Var.f[1], viewArr2[1]);
                    e91Var.removeView(viewArr2[1]);
                    e91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                e91Var.Q = null;
                e91Var.w(true);
                u81 u81Var = e91Var.M;
                if (u81Var != null) {
                    u81Var.v.invalidate();
                    e91Var.M.v.f1();
                    e91Var.M.invalidate();
                }
                e91Var.u();
                e91Var.J.unlock();
                break;
            case 1:
                e91 e91Var2 = this.b;
                e91Var2.w = null;
                View[] viewArr3 = e91Var2.e;
                if (viewArr3[1] != null) {
                    if (!e91Var2.F) {
                        e91Var2.F();
                    }
                    e91Var2.h.put(e91Var2.f[1], viewArr3[1]);
                    e91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                e91Var2.x = false;
                e91Var2.I = false;
                u81 u81Var2 = e91Var2.M;
                if (u81Var2 != null) {
                    u81Var2.setEnabled(true);
                }
                e91Var2.w(false);
                e91Var2.u();
                e91Var2.J.unlock();
                break;
            case 2:
                e91 e91Var3 = this.b;
                e91Var3.w = null;
                View[] viewArr4 = e91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    e91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                e91Var3.x = false;
                u81 u81Var3 = e91Var3.M;
                if (u81Var3 != null) {
                    u81Var3.setEnabled(true);
                    u81 u81Var4 = e91Var3.M;
                    u81Var4.J = false;
                    u81Var4.a = 1.0f;
                    u81Var4.v.f1();
                    e91Var3.M.invalidate();
                    break;
                }
                break;
            default:
                e91 e91Var4 = this.b;
                e91Var4.w = null;
                View[] viewArr5 = e91Var4.e;
                if (viewArr5[1] != null) {
                    if (!e91Var4.F) {
                        e91Var4.F();
                    }
                    e91Var4.h.put(e91Var4.f[1], viewArr5[1]);
                    e91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                e91Var4.x = false;
                e91Var4.I = false;
                u81 u81Var5 = e91Var4.M;
                if (u81Var5 != null) {
                    u81Var5.setEnabled(true);
                }
                e91Var4.w(false);
                e91Var4.u();
                e91Var4.J.unlock();
                break;
        }
    }
}
