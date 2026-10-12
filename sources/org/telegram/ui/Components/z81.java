package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class z81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k91 b;

    public /* synthetic */ z81(k91 k91Var, int i10) {
        this.a = i10;
        this.b = k91Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k91 k91Var = this.b;
                View[] viewArr = k91Var.e;
                View[] viewArr2 = k91Var.e;
                if (viewArr[1] != null) {
                    k91Var.F();
                    k91Var.h.put(k91Var.f[1], viewArr2[1]);
                    k91Var.removeView(viewArr2[1]);
                    k91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                k91Var.Q = null;
                k91Var.w(true);
                a91 a91Var = k91Var.M;
                if (a91Var != null) {
                    a91Var.v.invalidate();
                    k91Var.M.v.f1();
                    k91Var.M.invalidate();
                }
                k91Var.u();
                k91Var.J.unlock();
                break;
            case 1:
                k91 k91Var2 = this.b;
                k91Var2.w = null;
                View[] viewArr3 = k91Var2.e;
                if (viewArr3[1] != null) {
                    if (!k91Var2.F) {
                        k91Var2.F();
                    }
                    k91Var2.h.put(k91Var2.f[1], viewArr3[1]);
                    k91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                k91Var2.x = false;
                k91Var2.I = false;
                a91 a91Var2 = k91Var2.M;
                if (a91Var2 != null) {
                    a91Var2.setEnabled(true);
                }
                k91Var2.w(false);
                k91Var2.u();
                k91Var2.J.unlock();
                break;
            case 2:
                k91 k91Var3 = this.b;
                k91Var3.w = null;
                View[] viewArr4 = k91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    k91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                k91Var3.x = false;
                a91 a91Var3 = k91Var3.M;
                if (a91Var3 != null) {
                    a91Var3.setEnabled(true);
                    a91 a91Var4 = k91Var3.M;
                    a91Var4.J = false;
                    a91Var4.a = 1.0f;
                    a91Var4.v.f1();
                    k91Var3.M.invalidate();
                    break;
                }
                break;
            default:
                k91 k91Var4 = this.b;
                k91Var4.w = null;
                View[] viewArr5 = k91Var4.e;
                if (viewArr5[1] != null) {
                    if (!k91Var4.F) {
                        k91Var4.F();
                    }
                    k91Var4.h.put(k91Var4.f[1], viewArr5[1]);
                    k91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                k91Var4.x = false;
                k91Var4.I = false;
                a91 a91Var5 = k91Var4.M;
                if (a91Var5 != null) {
                    a91Var5.setEnabled(true);
                }
                k91Var4.w(false);
                k91Var4.u();
                k91Var4.J.unlock();
                break;
        }
    }
}
