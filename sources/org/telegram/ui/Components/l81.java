package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class l81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x81 b;

    public /* synthetic */ l81(x81 x81Var, int i10) {
        this.a = i10;
        this.b = x81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x81 x81Var = this.b;
                View[] viewArr = x81Var.e;
                View[] viewArr2 = x81Var.e;
                if (viewArr[1] != null) {
                    x81Var.G();
                    x81Var.h.put(x81Var.f[1], viewArr2[1]);
                    x81Var.removeView(viewArr2[1]);
                    x81Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                x81Var.R = null;
                x81Var.x(true);
                m81 m81Var = x81Var.M;
                if (m81Var != null) {
                    m81Var.v.invalidate();
                    x81Var.M.v.g1();
                    x81Var.M.invalidate();
                }
                x81Var.u();
                x81Var.J.unlock();
                break;
            case 1:
                x81 x81Var2 = this.b;
                x81Var2.w = null;
                View[] viewArr3 = x81Var2.e;
                if (viewArr3[1] != null) {
                    if (!x81Var2.F) {
                        x81Var2.G();
                    }
                    x81Var2.h.put(x81Var2.f[1], viewArr3[1]);
                    x81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                x81Var2.x = false;
                x81Var2.I = false;
                m81 m81Var2 = x81Var2.M;
                if (m81Var2 != null) {
                    m81Var2.setEnabled(true);
                }
                x81Var2.x(false);
                x81Var2.u();
                x81Var2.J.unlock();
                break;
            case 2:
                x81 x81Var3 = this.b;
                x81Var3.w = null;
                View[] viewArr4 = x81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    x81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                x81Var3.x = false;
                m81 m81Var3 = x81Var3.M;
                if (m81Var3 != null) {
                    m81Var3.setEnabled(true);
                    m81 m81Var4 = x81Var3.M;
                    m81Var4.J = false;
                    m81Var4.a = 1.0f;
                    m81Var4.v.g1();
                    x81Var3.M.invalidate();
                    break;
                }
                break;
            default:
                x81 x81Var4 = this.b;
                x81Var4.w = null;
                View[] viewArr5 = x81Var4.e;
                if (viewArr5[1] != null) {
                    if (!x81Var4.F) {
                        x81Var4.G();
                    }
                    x81Var4.h.put(x81Var4.f[1], viewArr5[1]);
                    x81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                x81Var4.x = false;
                x81Var4.I = false;
                m81 m81Var5 = x81Var4.M;
                if (m81Var5 != null) {
                    m81Var5.setEnabled(true);
                }
                x81Var4.x(false);
                x81Var4.u();
                x81Var4.J.unlock();
                break;
        }
    }
}
