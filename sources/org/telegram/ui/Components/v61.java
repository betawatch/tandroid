package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class v61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g71 b;

    public /* synthetic */ v61(g71 g71Var, int i7) {
        this.a = i7;
        this.b = g71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g71 g71Var = this.b;
                View[] viewArr = g71Var.e;
                View[] viewArr2 = g71Var.e;
                if (viewArr[1] != null) {
                    g71Var.C();
                    g71Var.h.put(g71Var.f[1], viewArr2[1]);
                    g71Var.removeView(viewArr2[1]);
                    g71Var.B(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                g71Var.T = null;
                g71Var.t(true);
                w61 w61Var = g71Var.N;
                if (w61Var != null) {
                    w61Var.w.invalidate();
                    g71Var.N.w.g1();
                    g71Var.N.invalidate();
                }
                g71Var.q();
                g71Var.K.e();
                break;
            case 1:
                g71 g71Var2 = this.b;
                g71Var2.x = null;
                View[] viewArr3 = g71Var2.e;
                if (viewArr3[1] != null) {
                    if (!g71Var2.G) {
                        g71Var2.C();
                    }
                    g71Var2.h.put(g71Var2.f[1], viewArr3[1]);
                    g71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                g71Var2.y = false;
                g71Var2.J = false;
                w61 w61Var2 = g71Var2.N;
                if (w61Var2 != null) {
                    w61Var2.setEnabled(true);
                }
                g71Var2.t(false);
                g71Var2.q();
                g71Var2.K.e();
                break;
            case 2:
                g71 g71Var3 = this.b;
                g71Var3.x = null;
                View[] viewArr4 = g71Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    g71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                g71Var3.y = false;
                w61 w61Var3 = g71Var3.N;
                if (w61Var3 != null) {
                    w61Var3.setEnabled(true);
                    w61 w61Var4 = g71Var3.N;
                    w61Var4.K = false;
                    w61Var4.a = 1.0f;
                    w61Var4.w.g1();
                    g71Var3.N.invalidate();
                    break;
                }
                break;
            default:
                g71 g71Var4 = this.b;
                g71Var4.x = null;
                View[] viewArr5 = g71Var4.e;
                if (viewArr5[1] != null) {
                    if (!g71Var4.G) {
                        g71Var4.C();
                    }
                    g71Var4.h.put(g71Var4.f[1], viewArr5[1]);
                    g71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                g71Var4.y = false;
                g71Var4.J = false;
                w61 w61Var5 = g71Var4.N;
                if (w61Var5 != null) {
                    w61Var5.setEnabled(true);
                }
                g71Var4.t(false);
                g71Var4.q();
                g71Var4.K.e();
                break;
        }
    }
}
