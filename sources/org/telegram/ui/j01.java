package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k01 b;

    public /* synthetic */ j01(k01 k01Var, int i10) {
        this.a = i10;
        this.b = k01Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k01 k01Var = this.b;
                if (k01Var.h != null) {
                    k01Var.h = null;
                    k01Var.e = 0.0f;
                    k01Var.g();
                    k01Var.n.e();
                    ex exVar = k01Var.a;
                    if (exVar != null) {
                        exVar.onPause();
                        k01Var.a.onFragmentDestroy();
                        k01Var.removeAllViews();
                        k01Var.a = null;
                        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.r4, new Object[0]);
                    }
                    k01Var.d(false);
                    break;
                }
                break;
            default:
                k01 k01Var2 = this.b;
                if (k01Var2.h != null) {
                    k01Var2.h = null;
                    k01Var2.d(true);
                    break;
                }
                break;
        }
    }
}
