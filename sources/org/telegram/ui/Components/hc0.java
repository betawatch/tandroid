package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic0 b;

    public /* synthetic */ hc0(ic0 ic0Var, int i7) {
        this.a = i7;
        this.b = ic0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                oc0 oc0Var = this.b.d;
                if (!oc0Var.Q) {
                    oc0Var.b0 = 1.0f;
                    oc0Var.h(1.0f);
                    break;
                }
                break;
            default:
                ic0 ic0Var = this.b;
                oc0 oc0Var2 = ic0Var.d;
                if (!oc0Var2.Q) {
                    Runnable runnable = ic0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.bz.r == 1 && oc0Var2.y.getVisibility() != 0 && (editTextBoldCursor = oc0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(oc0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
