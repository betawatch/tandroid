package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tb0 b;

    public /* synthetic */ sb0(tb0 tb0Var, int i3) {
        this.a = i3;
        this.b = tb0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                zb0 zb0Var = this.b.d;
                if (!zb0Var.Q) {
                    zb0Var.b0 = 1.0f;
                    zb0Var.h(1.0f);
                    break;
                }
                break;
            default:
                tb0 tb0Var = this.b;
                zb0 zb0Var2 = tb0Var.d;
                if (!zb0Var2.Q) {
                    Runnable runnable = tb0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.az.r == 1 && zb0Var2.y.getVisibility() != 0 && (editTextBoldCursor = zb0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(zb0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
