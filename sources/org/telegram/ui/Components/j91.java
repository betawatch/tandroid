package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u91 b;

    public /* synthetic */ j91(u91 u91Var, int i10) {
        this.a = i10;
        this.b = u91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                u91 u91Var = this.b;
                View[] viewArr = u91Var.e;
                View[] viewArr2 = u91Var.e;
                if (viewArr[1] != null) {
                    u91Var.G();
                    u91Var.h.put(u91Var.f[1], viewArr2[1]);
                    u91Var.removeView(viewArr2[1]);
                    u91Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                u91Var.S = null;
                u91Var.x(true);
                k91 k91Var = u91Var.M;
                if (k91Var != null) {
                    k91Var.v.invalidate();
                    u91Var.M.v.g1();
                    u91Var.M.invalidate();
                }
                u91Var.u();
                u91Var.J.unlock();
                break;
            case 1:
                u91 u91Var2 = this.b;
                u91Var2.w = null;
                View[] viewArr3 = u91Var2.e;
                if (viewArr3[1] != null) {
                    if (!u91Var2.F) {
                        u91Var2.G();
                    }
                    u91Var2.h.put(u91Var2.f[1], viewArr3[1]);
                    u91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                u91Var2.x = false;
                u91Var2.I = false;
                k91 k91Var2 = u91Var2.M;
                if (k91Var2 != null) {
                    k91Var2.setEnabled(true);
                }
                u91Var2.x(false);
                u91Var2.u();
                u91Var2.J.unlock();
                break;
            case 2:
                u91 u91Var3 = this.b;
                u91Var3.w = null;
                View[] viewArr4 = u91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    u91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                u91Var3.x = false;
                k91 k91Var3 = u91Var3.M;
                if (k91Var3 != null) {
                    k91Var3.setEnabled(true);
                    k91 k91Var4 = u91Var3.M;
                    k91Var4.J = false;
                    k91Var4.a = 1.0f;
                    k91Var4.v.g1();
                    u91Var3.M.invalidate();
                    break;
                }
                break;
            default:
                u91 u91Var4 = this.b;
                u91Var4.w = null;
                View[] viewArr5 = u91Var4.e;
                if (viewArr5[1] != null) {
                    if (!u91Var4.F) {
                        u91Var4.G();
                    }
                    u91Var4.h.put(u91Var4.f[1], viewArr5[1]);
                    u91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                u91Var4.x = false;
                u91Var4.I = false;
                k91 k91Var5 = u91Var4.M;
                if (k91Var5 != null) {
                    k91Var5.setEnabled(true);
                }
                u91Var4.x(false);
                u91Var4.u();
                u91Var4.J.unlock();
                break;
        }
    }
}
