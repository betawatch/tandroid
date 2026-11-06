package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class xb0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;

    public /* synthetic */ xb0(yb0 yb0Var, int i7) {
        this.a = i7;
        this.b = yb0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.a) {
            case 0:
                ec0 ec0Var = this.b.d;
                if (!ec0Var.P) {
                    ec0Var.a0 = 1.0f;
                    ec0Var.h(1.0f);
                    break;
                }
                break;
            default:
                yb0 yb0Var = this.b;
                ec0 ec0Var2 = yb0Var.d;
                if (!ec0Var2.P) {
                    Runnable runnable = yb0Var.c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.iz.r == 1 && ec0Var2.y.getVisibility() != 0 && (editTextBoldCursor = ec0Var2.r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(ec0Var2.r);
                        break;
                    }
                }
                break;
        }
    }
}
