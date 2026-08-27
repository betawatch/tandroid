package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class b9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;

    public /* synthetic */ b9(r8 r8Var, int i10) {
        this.a = i10;
        this.b = r8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.b.b;
                w6 w6Var = i9Var.q1;
                if (w6Var != null) {
                    w6Var.b();
                    i9Var.v.removeView(i9Var.q1);
                }
                i9Var.q1 = null;
                i9Var.P();
                break;
            default:
                super.onAnimationEnd(animator);
                w6 w6Var2 = this.b.b.q1;
                if (w6Var2 != null) {
                    w6Var2.a(true);
                    break;
                }
                break;
        }
    }
}
