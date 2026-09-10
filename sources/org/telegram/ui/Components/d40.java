package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f40 b;

    public /* synthetic */ d40(f40 f40Var, int i10) {
        this.a = i10;
        this.b = f40Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f40 f40Var = this.b;
                if (f40Var.b0 == animator) {
                    f40Var.b0 = null;
                    f40Var.b();
                    break;
                }
                break;
            default:
                f40 f40Var2 = this.b;
                if (f40Var2.a0 == animator) {
                    f40Var2.a0 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                e40 e40Var = this.b.W;
                if (e40Var != null) {
                    ((org.telegram.ui.us0) e40Var).a.e0.requestLayout();
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
