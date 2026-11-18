package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ic0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc0 b;

    public /* synthetic */ ic0(jc0 jc0Var, int i7) {
        this.a = i7;
        this.b = jc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                pc0 pc0Var = this.b.d;
                if (!pc0Var.Q) {
                    pc0Var.b0 = 1.0f;
                    pc0Var.h(1.0f);
                    break;
                }
                break;
            default:
                jc0 jc0Var = this.b;
                pc0 pc0Var2 = jc0Var.d;
                if (!pc0Var2.Q) {
                    Runnable runnable = jc0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.bz.r == 1 && pc0Var2.y.getVisibility() != 0 && (editTextBoldCursor = pc0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(pc0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
