package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class u81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g91 b;

    public /* synthetic */ u81(g91 g91Var, int i10) {
        this.a = i10;
        this.b = g91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                g91 g91Var = this.b;
                View[] viewArr = g91Var.e;
                View[] viewArr2 = g91Var.e;
                if (viewArr[1] != null) {
                    g91Var.G();
                    g91Var.h.put(g91Var.f[1], viewArr2[1]);
                    g91Var.removeView(viewArr2[1]);
                    g91Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                g91Var.R = null;
                g91Var.x(true);
                v81 v81Var = g91Var.M;
                if (v81Var != null) {
                    v81Var.v.invalidate();
                    g91Var.M.v.h1();
                    g91Var.M.invalidate();
                }
                g91Var.u();
                g91Var.J.unlock();
                break;
            case 1:
                g91 g91Var2 = this.b;
                g91Var2.w = null;
                View[] viewArr3 = g91Var2.e;
                if (viewArr3[1] != null) {
                    if (!g91Var2.F) {
                        g91Var2.G();
                    }
                    g91Var2.h.put(g91Var2.f[1], viewArr3[1]);
                    g91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                g91Var2.x = false;
                g91Var2.I = false;
                v81 v81Var2 = g91Var2.M;
                if (v81Var2 != null) {
                    v81Var2.setEnabled(true);
                }
                g91Var2.x(false);
                g91Var2.u();
                g91Var2.J.unlock();
                break;
            case 2:
                g91 g91Var3 = this.b;
                g91Var3.w = null;
                View[] viewArr4 = g91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    g91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                g91Var3.x = false;
                v81 v81Var3 = g91Var3.M;
                if (v81Var3 != null) {
                    v81Var3.setEnabled(true);
                    v81 v81Var4 = g91Var3.M;
                    v81Var4.J = false;
                    v81Var4.a = 1.0f;
                    v81Var4.v.h1();
                    g91Var3.M.invalidate();
                    break;
                }
                break;
            default:
                g91 g91Var4 = this.b;
                g91Var4.w = null;
                View[] viewArr5 = g91Var4.e;
                if (viewArr5[1] != null) {
                    if (!g91Var4.F) {
                        g91Var4.G();
                    }
                    g91Var4.h.put(g91Var4.f[1], viewArr5[1]);
                    g91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                g91Var4.x = false;
                g91Var4.I = false;
                v81 v81Var5 = g91Var4.M;
                if (v81Var5 != null) {
                    v81Var5.setEnabled(true);
                }
                g91Var4.x(false);
                g91Var4.u();
                g91Var4.J.unlock();
                break;
        }
    }
}
