package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j81 b;

    public /* synthetic */ y71(j81 j81Var, int i10) {
        this.a = i10;
        this.b = j81Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j81 j81Var = this.b;
                View[] viewArr = j81Var.e;
                View[] viewArr2 = j81Var.e;
                if (viewArr[1] != null) {
                    j81Var.G();
                    j81Var.h.put(j81Var.f[1], viewArr2[1]);
                    j81Var.removeView(viewArr2[1]);
                    j81Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                j81Var.R = null;
                j81Var.x(true);
                z71 z71Var = j81Var.M;
                if (z71Var != null) {
                    z71Var.v.invalidate();
                    j81Var.M.v.g1();
                    j81Var.M.invalidate();
                }
                j81Var.u();
                j81Var.J.unlock();
                break;
            case 1:
                j81 j81Var2 = this.b;
                j81Var2.w = null;
                View[] viewArr3 = j81Var2.e;
                if (viewArr3[1] != null) {
                    if (!j81Var2.F) {
                        j81Var2.G();
                    }
                    j81Var2.h.put(j81Var2.f[1], viewArr3[1]);
                    j81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                j81Var2.x = false;
                j81Var2.I = false;
                z71 z71Var2 = j81Var2.M;
                if (z71Var2 != null) {
                    z71Var2.setEnabled(true);
                }
                j81Var2.x(false);
                j81Var2.u();
                j81Var2.J.unlock();
                break;
            case 2:
                j81 j81Var3 = this.b;
                j81Var3.w = null;
                View[] viewArr4 = j81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    j81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                j81Var3.x = false;
                z71 z71Var3 = j81Var3.M;
                if (z71Var3 != null) {
                    z71Var3.setEnabled(true);
                    z71 z71Var4 = j81Var3.M;
                    z71Var4.J = false;
                    z71Var4.a = 1.0f;
                    z71Var4.v.g1();
                    j81Var3.M.invalidate();
                    break;
                }
                break;
            default:
                j81 j81Var4 = this.b;
                j81Var4.w = null;
                View[] viewArr5 = j81Var4.e;
                if (viewArr5[1] != null) {
                    if (!j81Var4.F) {
                        j81Var4.G();
                    }
                    j81Var4.h.put(j81Var4.f[1], viewArr5[1]);
                    j81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                j81Var4.x = false;
                j81Var4.I = false;
                z71 z71Var5 = j81Var4.M;
                if (z71Var5 != null) {
                    z71Var5.setEnabled(true);
                }
                j81Var4.x(false);
                j81Var4.u();
                j81Var4.J.unlock();
                break;
        }
    }
}
