package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m81 b;

    public /* synthetic */ b81(m81 m81Var, int i10) {
        this.a = i10;
        this.b = m81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                m81 m81Var = this.b;
                View[] viewArr = m81Var.e;
                View[] viewArr2 = m81Var.e;
                if (viewArr[1] != null) {
                    m81Var.F();
                    m81Var.h.put(m81Var.f[1], viewArr2[1]);
                    m81Var.removeView(viewArr2[1]);
                    m81Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                m81Var.N = null;
                m81Var.w(true);
                c81 c81Var = m81Var.J;
                if (c81Var != null) {
                    c81Var.v.invalidate();
                    m81Var.J.v.f1();
                    m81Var.J.invalidate();
                }
                m81Var.u();
                m81Var.G.unlock();
                break;
            case 1:
                m81 m81Var2 = this.b;
                m81Var2.w = null;
                View[] viewArr3 = m81Var2.e;
                if (viewArr3[1] != null) {
                    if (!m81Var2.C) {
                        m81Var2.F();
                    }
                    m81Var2.h.put(m81Var2.f[1], viewArr3[1]);
                    m81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                m81Var2.x = false;
                m81Var2.F = false;
                c81 c81Var2 = m81Var2.J;
                if (c81Var2 != null) {
                    c81Var2.setEnabled(true);
                }
                m81Var2.w(false);
                m81Var2.u();
                m81Var2.G.unlock();
                break;
            case 2:
                m81 m81Var3 = this.b;
                m81Var3.w = null;
                View[] viewArr4 = m81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    m81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                m81Var3.x = false;
                c81 c81Var3 = m81Var3.J;
                if (c81Var3 != null) {
                    c81Var3.setEnabled(true);
                    c81 c81Var4 = m81Var3.J;
                    c81Var4.G = false;
                    c81Var4.a = 1.0f;
                    c81Var4.v.f1();
                    m81Var3.J.invalidate();
                    break;
                }
                break;
            default:
                m81 m81Var4 = this.b;
                m81Var4.w = null;
                View[] viewArr5 = m81Var4.e;
                if (viewArr5[1] != null) {
                    if (!m81Var4.C) {
                        m81Var4.F();
                    }
                    m81Var4.h.put(m81Var4.f[1], viewArr5[1]);
                    m81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                m81Var4.x = false;
                m81Var4.F = false;
                c81 c81Var5 = m81Var4.J;
                if (c81Var5 != null) {
                    c81Var5.setEnabled(true);
                }
                m81Var4.w(false);
                m81Var4.u();
                m81Var4.G.unlock();
                break;
        }
    }
}
