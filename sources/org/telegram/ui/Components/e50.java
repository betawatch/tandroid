package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class e50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b60 b;

    public /* synthetic */ e50(b60 b60Var, int i10) {
        this.a = i10;
        this.b = b60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                b60 b60Var = this.b;
                if (animator.equals(b60Var.J)) {
                    b60Var.J = null;
                    break;
                }
                break;
            case 1:
                b60 b60Var2 = this.b;
                if (b60Var2.e1 != null) {
                    b60Var2.e1 = null;
                    break;
                }
                break;
            default:
                b60 b60Var3 = this.b;
                if (animator.equals(b60Var3.c0)) {
                    b60Var3.d(true);
                    b60Var3.Z0 = false;
                    b60Var3.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
