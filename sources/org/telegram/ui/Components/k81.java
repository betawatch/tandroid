package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v81 b;

    public /* synthetic */ k81(v81 v81Var, int i10) {
        this.a = i10;
        this.b = v81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                v81 v81Var = this.b;
                View[] viewArr = v81Var.e;
                View[] viewArr2 = v81Var.e;
                if (viewArr[1] != null) {
                    v81Var.F();
                    v81Var.h.put(v81Var.f[1], viewArr2[1]);
                    v81Var.removeView(viewArr2[1]);
                    v81Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                v81Var.Q = null;
                v81Var.w(true);
                l81 l81Var = v81Var.M;
                if (l81Var != null) {
                    l81Var.v.invalidate();
                    v81Var.M.v.e1();
                    v81Var.M.invalidate();
                }
                v81Var.u();
                v81Var.J.unlock();
                break;
            case 1:
                v81 v81Var2 = this.b;
                v81Var2.w = null;
                View[] viewArr3 = v81Var2.e;
                if (viewArr3[1] != null) {
                    if (!v81Var2.F) {
                        v81Var2.F();
                    }
                    v81Var2.h.put(v81Var2.f[1], viewArr3[1]);
                    v81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                v81Var2.x = false;
                v81Var2.I = false;
                l81 l81Var2 = v81Var2.M;
                if (l81Var2 != null) {
                    l81Var2.setEnabled(true);
                }
                v81Var2.w(false);
                v81Var2.u();
                v81Var2.J.unlock();
                break;
            case 2:
                v81 v81Var3 = this.b;
                v81Var3.w = null;
                View[] viewArr4 = v81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    v81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                v81Var3.x = false;
                l81 l81Var3 = v81Var3.M;
                if (l81Var3 != null) {
                    l81Var3.setEnabled(true);
                    l81 l81Var4 = v81Var3.M;
                    l81Var4.J = false;
                    l81Var4.a = 1.0f;
                    l81Var4.v.e1();
                    v81Var3.M.invalidate();
                    break;
                }
                break;
            default:
                v81 v81Var4 = this.b;
                v81Var4.w = null;
                View[] viewArr5 = v81Var4.e;
                if (viewArr5[1] != null) {
                    if (!v81Var4.F) {
                        v81Var4.F();
                    }
                    v81Var4.h.put(v81Var4.f[1], viewArr5[1]);
                    v81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                v81Var4.x = false;
                v81Var4.I = false;
                l81 l81Var5 = v81Var4.M;
                if (l81Var5 != null) {
                    l81Var5.setEnabled(true);
                }
                v81Var4.w(false);
                v81Var4.u();
                v81Var4.J.unlock();
                break;
        }
    }
}
