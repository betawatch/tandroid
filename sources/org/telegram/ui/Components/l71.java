package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w71 b;

    public /* synthetic */ l71(w71 w71Var, int i10) {
        this.a = i10;
        this.b = w71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                w71 w71Var = this.b;
                View[] viewArr = w71Var.e;
                View[] viewArr2 = w71Var.e;
                if (viewArr[1] != null) {
                    w71Var.G();
                    w71Var.h.put(w71Var.f[1], viewArr2[1]);
                    w71Var.removeView(viewArr2[1]);
                    w71Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                w71Var.S = null;
                w71Var.x(true);
                m71 m71Var = w71Var.M;
                if (m71Var != null) {
                    m71Var.w.invalidate();
                    w71Var.M.w.g1();
                    w71Var.M.invalidate();
                }
                w71Var.u();
                w71Var.J.e();
                break;
            case 1:
                w71 w71Var2 = this.b;
                w71Var2.x = null;
                View[] viewArr3 = w71Var2.e;
                if (viewArr3[1] != null) {
                    if (!w71Var2.F) {
                        w71Var2.G();
                    }
                    w71Var2.h.put(w71Var2.f[1], viewArr3[1]);
                    w71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                w71Var2.y = false;
                w71Var2.I = false;
                m71 m71Var2 = w71Var2.M;
                if (m71Var2 != null) {
                    m71Var2.setEnabled(true);
                }
                w71Var2.x(false);
                w71Var2.u();
                w71Var2.J.e();
                break;
            case 2:
                w71 w71Var3 = this.b;
                w71Var3.x = null;
                View[] viewArr4 = w71Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    w71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                w71Var3.y = false;
                m71 m71Var3 = w71Var3.M;
                if (m71Var3 != null) {
                    m71Var3.setEnabled(true);
                    m71 m71Var4 = w71Var3.M;
                    m71Var4.J = false;
                    m71Var4.a = 1.0f;
                    m71Var4.w.g1();
                    w71Var3.M.invalidate();
                    break;
                }
                break;
            default:
                w71 w71Var4 = this.b;
                w71Var4.x = null;
                View[] viewArr5 = w71Var4.e;
                if (viewArr5[1] != null) {
                    if (!w71Var4.F) {
                        w71Var4.G();
                    }
                    w71Var4.h.put(w71Var4.f[1], viewArr5[1]);
                    w71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                w71Var4.y = false;
                w71Var4.I = false;
                m71 m71Var5 = w71Var4.M;
                if (m71Var5 != null) {
                    m71Var5.setEnabled(true);
                }
                w71Var4.x(false);
                w71Var4.u();
                w71Var4.J.e();
                break;
        }
    }
}
