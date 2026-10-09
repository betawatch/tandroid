package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o91 b;

    public /* synthetic */ c91(o91 o91Var, int i10) {
        this.a = i10;
        this.b = o91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o91 o91Var = this.b;
                View[] viewArr = o91Var.e;
                View[] viewArr2 = o91Var.e;
                if (viewArr[1] != null) {
                    o91Var.F();
                    o91Var.h.put(o91Var.f[1], viewArr2[1]);
                    o91Var.removeView(viewArr2[1]);
                    o91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                o91Var.Q = null;
                o91Var.w(true);
                d91 d91Var = o91Var.M;
                if (d91Var != null) {
                    d91Var.v.invalidate();
                    o91Var.M.v.f1();
                    o91Var.M.invalidate();
                }
                o91Var.u();
                o91Var.J.unlock();
                break;
            case 1:
                o91 o91Var2 = this.b;
                o91Var2.w = null;
                View[] viewArr3 = o91Var2.e;
                if (viewArr3[1] != null) {
                    if (!o91Var2.F) {
                        o91Var2.F();
                    }
                    o91Var2.h.put(o91Var2.f[1], viewArr3[1]);
                    o91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                o91Var2.x = false;
                o91Var2.I = false;
                d91 d91Var2 = o91Var2.M;
                if (d91Var2 != null) {
                    d91Var2.setEnabled(true);
                }
                o91Var2.w(false);
                o91Var2.u();
                o91Var2.J.unlock();
                break;
            case 2:
                o91 o91Var3 = this.b;
                o91Var3.w = null;
                View[] viewArr4 = o91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    o91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                o91Var3.x = false;
                d91 d91Var3 = o91Var3.M;
                if (d91Var3 != null) {
                    d91Var3.setEnabled(true);
                    d91 d91Var4 = o91Var3.M;
                    d91Var4.J = false;
                    d91Var4.a = 1.0f;
                    d91Var4.v.f1();
                    o91Var3.M.invalidate();
                    break;
                }
                break;
            default:
                o91 o91Var4 = this.b;
                o91Var4.w = null;
                View[] viewArr5 = o91Var4.e;
                if (viewArr5[1] != null) {
                    if (!o91Var4.F) {
                        o91Var4.F();
                    }
                    o91Var4.h.put(o91Var4.f[1], viewArr5[1]);
                    o91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                o91Var4.x = false;
                o91Var4.I = false;
                d91 d91Var5 = o91Var4.M;
                if (d91Var5 != null) {
                    d91Var5.setEnabled(true);
                }
                o91Var4.w(false);
                o91Var4.u();
                o91Var4.J.unlock();
                break;
        }
    }
}
