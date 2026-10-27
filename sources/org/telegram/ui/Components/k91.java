package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v91 b;

    public /* synthetic */ k91(v91 v91Var, int i10) {
        this.a = i10;
        this.b = v91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v91 v91Var = this.b;
                View[] viewArr = v91Var.e;
                View[] viewArr2 = v91Var.e;
                if (viewArr[1] != null) {
                    v91Var.G();
                    v91Var.h.put(v91Var.f[1], viewArr2[1]);
                    v91Var.removeView(viewArr2[1]);
                    v91Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                v91Var.S = null;
                v91Var.x(true);
                l91 l91Var = v91Var.M;
                if (l91Var != null) {
                    l91Var.v.invalidate();
                    v91Var.M.v.g1();
                    v91Var.M.invalidate();
                }
                v91Var.u();
                v91Var.J.unlock();
                break;
            case 1:
                v91 v91Var2 = this.b;
                v91Var2.w = null;
                View[] viewArr3 = v91Var2.e;
                if (viewArr3[1] != null) {
                    if (!v91Var2.F) {
                        v91Var2.G();
                    }
                    v91Var2.h.put(v91Var2.f[1], viewArr3[1]);
                    v91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                v91Var2.x = false;
                v91Var2.I = false;
                l91 l91Var2 = v91Var2.M;
                if (l91Var2 != null) {
                    l91Var2.setEnabled(true);
                }
                v91Var2.x(false);
                v91Var2.u();
                v91Var2.J.unlock();
                break;
            case 2:
                v91 v91Var3 = this.b;
                v91Var3.w = null;
                View[] viewArr4 = v91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    v91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                v91Var3.x = false;
                l91 l91Var3 = v91Var3.M;
                if (l91Var3 != null) {
                    l91Var3.setEnabled(true);
                    l91 l91Var4 = v91Var3.M;
                    l91Var4.J = false;
                    l91Var4.a = 1.0f;
                    l91Var4.v.g1();
                    v91Var3.M.invalidate();
                    break;
                }
                break;
            default:
                v91 v91Var4 = this.b;
                v91Var4.w = null;
                View[] viewArr5 = v91Var4.e;
                if (viewArr5[1] != null) {
                    if (!v91Var4.F) {
                        v91Var4.G();
                    }
                    v91Var4.h.put(v91Var4.f[1], viewArr5[1]);
                    v91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                v91Var4.x = false;
                v91Var4.I = false;
                l91 l91Var5 = v91Var4.M;
                if (l91Var5 != null) {
                    l91Var5.setEnabled(true);
                }
                v91Var4.x(false);
                v91Var4.u();
                v91Var4.J.unlock();
                break;
        }
    }
}
