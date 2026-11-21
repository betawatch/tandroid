package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class x01 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ h11 b;

    public /* synthetic */ x01(h11 h11Var, int i7) {
        this.a = i7;
        this.b = h11Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                h11 h11Var = this.b;
                if (h11Var.b0 == animator) {
                    h11Var.b0 = null;
                    break;
                }
                break;
            case 1:
                h11 h11Var2 = this.b;
                if (h11Var2.k0 == animator) {
                    h11Var2.k0 = null;
                }
                h11Var2.c(1.0f);
                break;
            default:
                h11 h11Var3 = this.b;
                if (h11Var3.K == animator) {
                    h11Var3.K = null;
                    break;
                }
                break;
        }
    }
}
