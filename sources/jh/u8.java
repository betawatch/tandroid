package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                i9 i9Var = this.b.E0;
                i9Var.T = 0.0f;
                i9.k(i9Var);
                break;
            default:
                i9 i9Var2 = this.b.E0;
                i9Var2.S = 0.0f;
                i9Var2.V = 0.0f;
                i9.k(i9Var2);
                break;
        }
    }
}
