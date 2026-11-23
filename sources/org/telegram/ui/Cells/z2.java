package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class z2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ z2(a3 a3Var, int i7) {
        this.a = i7;
        this.b = a3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                Runnable runnable = a3Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == a3Var.e) {
                    a3Var.e = null;
                    break;
                }
                break;
            default:
                a3 a3Var2 = this.b;
                Runnable runnable2 = a3Var2.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == a3Var2.e) {
                    a3Var2.e = null;
                    break;
                }
                break;
        }
    }
}
