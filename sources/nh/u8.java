package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class u8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ u8(w8 w8Var, int i10) {
        this.a = i10;
        this.b = w8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i9 i9Var = this.b.F0;
                i9Var.U = 0.0f;
                i9.k(i9Var);
                break;
            default:
                i9 i9Var2 = this.b.F0;
                i9Var2.T = 0.0f;
                i9Var2.W = 0.0f;
                i9.k(i9Var2);
                break;
        }
    }
}
