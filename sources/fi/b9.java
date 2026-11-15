package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;

    public /* synthetic */ b9(r8 r8Var, int i7) {
        this.a = i7;
        this.b = r8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                i9 i9Var = this.b.b;
                w6 w6Var = i9Var.u1;
                if (w6Var != null) {
                    w6Var.b();
                    i9Var.w.removeView(i9Var.u1);
                }
                i9Var.u1 = null;
                i9Var.V();
                break;
            default:
                super.onAnimationEnd(animator);
                w6 w6Var2 = this.b.b.u1;
                if (w6Var2 != null) {
                    w6Var2.a(true);
                    break;
                }
                break;
        }
    }
}
