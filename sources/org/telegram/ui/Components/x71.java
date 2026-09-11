package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class x71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i81 b;

    public /* synthetic */ x71(i81 i81Var, int i10) {
        this.a = i10;
        this.b = i81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i81 i81Var = this.b;
                View[] viewArr = i81Var.e;
                View[] viewArr2 = i81Var.e;
                if (viewArr[1] != null) {
                    i81Var.F();
                    i81Var.h.put(i81Var.f[1], viewArr2[1]);
                    i81Var.removeView(viewArr2[1]);
                    i81Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                i81Var.Q = null;
                i81Var.w(true);
                y71 y71Var = i81Var.M;
                if (y71Var != null) {
                    y71Var.v.invalidate();
                    i81Var.M.v.e1();
                    i81Var.M.invalidate();
                }
                i81Var.u();
                i81Var.J.unlock();
                break;
            case 1:
                i81 i81Var2 = this.b;
                i81Var2.w = null;
                View[] viewArr3 = i81Var2.e;
                if (viewArr3[1] != null) {
                    if (!i81Var2.F) {
                        i81Var2.F();
                    }
                    i81Var2.h.put(i81Var2.f[1], viewArr3[1]);
                    i81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                i81Var2.x = false;
                i81Var2.I = false;
                y71 y71Var2 = i81Var2.M;
                if (y71Var2 != null) {
                    y71Var2.setEnabled(true);
                }
                i81Var2.w(false);
                i81Var2.u();
                i81Var2.J.unlock();
                break;
            case 2:
                i81 i81Var3 = this.b;
                i81Var3.w = null;
                View[] viewArr4 = i81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    i81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                i81Var3.x = false;
                y71 y71Var3 = i81Var3.M;
                if (y71Var3 != null) {
                    y71Var3.setEnabled(true);
                    y71 y71Var4 = i81Var3.M;
                    y71Var4.J = false;
                    y71Var4.a = 1.0f;
                    y71Var4.v.e1();
                    i81Var3.M.invalidate();
                    break;
                }
                break;
            default:
                i81 i81Var4 = this.b;
                i81Var4.w = null;
                View[] viewArr5 = i81Var4.e;
                if (viewArr5[1] != null) {
                    if (!i81Var4.F) {
                        i81Var4.F();
                    }
                    i81Var4.h.put(i81Var4.f[1], viewArr5[1]);
                    i81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                i81Var4.x = false;
                i81Var4.I = false;
                y71 y71Var5 = i81Var4.M;
                if (y71Var5 != null) {
                    y71Var5.setEnabled(true);
                }
                i81Var4.w(false);
                i81Var4.u();
                i81Var4.J.unlock();
                break;
        }
    }
}
