package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class y61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j71 b;

    public /* synthetic */ y61(j71 j71Var, int i7) {
        this.a = i7;
        this.b = j71Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j71 j71Var = this.b;
                View[] viewArr = j71Var.e;
                View[] viewArr2 = j71Var.e;
                if (viewArr[1] != null) {
                    j71Var.C();
                    j71Var.h.put(j71Var.f[1], viewArr2[1]);
                    j71Var.removeView(viewArr2[1]);
                    j71Var.B(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                j71Var.T = null;
                j71Var.t(true);
                z61 z61Var = j71Var.N;
                if (z61Var != null) {
                    z61Var.w.invalidate();
                    j71Var.N.w.g1();
                    j71Var.N.invalidate();
                }
                j71Var.q();
                j71Var.K.e();
                break;
            case 1:
                j71 j71Var2 = this.b;
                j71Var2.x = null;
                View[] viewArr3 = j71Var2.e;
                if (viewArr3[1] != null) {
                    if (!j71Var2.G) {
                        j71Var2.C();
                    }
                    j71Var2.h.put(j71Var2.f[1], viewArr3[1]);
                    j71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                j71Var2.y = false;
                j71Var2.J = false;
                z61 z61Var2 = j71Var2.N;
                if (z61Var2 != null) {
                    z61Var2.setEnabled(true);
                }
                j71Var2.t(false);
                j71Var2.q();
                j71Var2.K.e();
                break;
            case 2:
                j71 j71Var3 = this.b;
                j71Var3.x = null;
                View[] viewArr4 = j71Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    j71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                j71Var3.y = false;
                z61 z61Var3 = j71Var3.N;
                if (z61Var3 != null) {
                    z61Var3.setEnabled(true);
                    z61 z61Var4 = j71Var3.N;
                    z61Var4.K = false;
                    z61Var4.a = 1.0f;
                    z61Var4.w.g1();
                    j71Var3.N.invalidate();
                    break;
                }
                break;
            default:
                j71 j71Var4 = this.b;
                j71Var4.x = null;
                View[] viewArr5 = j71Var4.e;
                if (viewArr5[1] != null) {
                    if (!j71Var4.G) {
                        j71Var4.C();
                    }
                    j71Var4.h.put(j71Var4.f[1], viewArr5[1]);
                    j71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                j71Var4.y = false;
                j71Var4.J = false;
                z61 z61Var5 = j71Var4.N;
                if (z61Var5 != null) {
                    z61Var5.setEnabled(true);
                }
                j71Var4.t(false);
                j71Var4.q();
                j71Var4.K.e();
                break;
        }
    }
}
