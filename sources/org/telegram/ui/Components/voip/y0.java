package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class y0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;

    public /* synthetic */ y0(c1 c1Var, int i7) {
        this.a = i7;
        this.b = c1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                c1 c1Var = this.b;
                if (c1Var.getParent() != null) {
                    ((ViewGroup) c1Var.getParent()).removeView(c1Var);
                    break;
                }
                break;
            case 1:
                c1 c1Var2 = this.b;
                if (c1Var2.getParent() != null) {
                    ((ViewGroup) c1Var2.getParent()).removeView(c1Var2);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                c1 c1Var3 = this.b;
                if (c1Var3.getParent() != null) {
                    ((ViewGroup) c1Var3.getParent()).removeView(c1Var3);
                    break;
                }
                break;
        }
    }
}
