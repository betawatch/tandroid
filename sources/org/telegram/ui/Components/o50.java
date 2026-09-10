package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f60 b;

    public /* synthetic */ o50(f60 f60Var, int i10) {
        this.a = i10;
        this.b = f60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f60 f60Var = this.b;
                if (animator.equals(f60Var.G)) {
                    f60Var.G = null;
                    break;
                }
                break;
            case 1:
                f60 f60Var2 = this.b;
                if (f60Var2.b1 != null) {
                    f60Var2.b1 = null;
                    break;
                }
                break;
            default:
                f60 f60Var3 = this.b;
                if (animator.equals(f60Var3.W)) {
                    f60Var3.h(true);
                    f60Var3.W0 = false;
                    f60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
