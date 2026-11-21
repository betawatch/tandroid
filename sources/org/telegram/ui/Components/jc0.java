package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class jc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc0 b;

    public /* synthetic */ jc0(kc0 kc0Var, int i7) {
        this.a = i7;
        this.b = kc0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                qc0 qc0Var = this.b.d;
                if (!qc0Var.Q) {
                    qc0Var.b0 = 1.0f;
                    qc0Var.h(1.0f);
                    break;
                }
                break;
            default:
                kc0 kc0Var = this.b;
                qc0 qc0Var2 = kc0Var.d;
                if (!qc0Var2.Q) {
                    Runnable runnable = kc0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.bz.r == 1 && qc0Var2.y.getVisibility() != 0 && (editTextBoldCursor = qc0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(qc0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
