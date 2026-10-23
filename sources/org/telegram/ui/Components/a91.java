package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class a91 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l91 b;

    public /* synthetic */ a91(l91 l91Var, int i10) {
        this.a = i10;
        this.b = l91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                l91 l91Var = this.b;
                View[] viewArr = l91Var.e;
                View[] viewArr2 = l91Var.e;
                if (viewArr[1] != null) {
                    l91Var.F();
                    l91Var.h.put(l91Var.f[1], viewArr2[1]);
                    l91Var.removeView(viewArr2[1]);
                    l91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                l91Var.Q = null;
                l91Var.w(true);
                b91 b91Var = l91Var.M;
                if (b91Var != null) {
                    b91Var.v.invalidate();
                    l91Var.M.v.g1();
                    l91Var.M.invalidate();
                }
                l91Var.u();
                l91Var.J.unlock();
                break;
            case 1:
                l91 l91Var2 = this.b;
                l91Var2.w = null;
                View[] viewArr3 = l91Var2.e;
                if (viewArr3[1] != null) {
                    if (!l91Var2.F) {
                        l91Var2.F();
                    }
                    l91Var2.h.put(l91Var2.f[1], viewArr3[1]);
                    l91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                l91Var2.x = false;
                l91Var2.I = false;
                b91 b91Var2 = l91Var2.M;
                if (b91Var2 != null) {
                    b91Var2.setEnabled(true);
                }
                l91Var2.w(false);
                l91Var2.u();
                l91Var2.J.unlock();
                break;
            case 2:
                l91 l91Var3 = this.b;
                l91Var3.w = null;
                View[] viewArr4 = l91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    l91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                l91Var3.x = false;
                b91 b91Var3 = l91Var3.M;
                if (b91Var3 != null) {
                    b91Var3.setEnabled(true);
                    b91 b91Var4 = l91Var3.M;
                    b91Var4.J = false;
                    b91Var4.a = 1.0f;
                    b91Var4.v.g1();
                    l91Var3.M.invalidate();
                    break;
                }
                break;
            default:
                l91 l91Var4 = this.b;
                l91Var4.w = null;
                View[] viewArr5 = l91Var4.e;
                if (viewArr5[1] != null) {
                    if (!l91Var4.F) {
                        l91Var4.F();
                    }
                    l91Var4.h.put(l91Var4.f[1], viewArr5[1]);
                    l91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                l91Var4.x = false;
                l91Var4.I = false;
                b91 b91Var5 = l91Var4.M;
                if (b91Var5 != null) {
                    b91Var5.setEnabled(true);
                }
                l91Var4.w(false);
                l91Var4.u();
                l91Var4.J.unlock();
                break;
        }
    }
}
