package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class yb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb0 b;

    public /* synthetic */ yb0(zb0 zb0Var, int i7) {
        this.a = i7;
        this.b = zb0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                fc0 fc0Var = this.b.d;
                if (!fc0Var.P) {
                    fc0Var.a0 = 1.0f;
                    fc0Var.h(1.0f);
                    break;
                }
                break;
            default:
                zb0 zb0Var = this.b;
                fc0 fc0Var2 = zb0Var.d;
                if (!fc0Var2.P) {
                    Runnable runnable = zb0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.iz.r == 1 && fc0Var2.y.getVisibility() != 0 && (editTextBoldCursor = fc0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(fc0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
