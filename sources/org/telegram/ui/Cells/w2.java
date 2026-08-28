package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ w2(x2 x2Var, int i9) {
        this.a = i9;
        this.b = x2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b;
                Runnable runnable = x2Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == x2Var.e) {
                    x2Var.e = null;
                    break;
                }
                break;
            default:
                x2 x2Var2 = this.b;
                Runnable runnable2 = x2Var2.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == x2Var2.e) {
                    x2Var2.e = null;
                    break;
                }
                break;
        }
    }
}
