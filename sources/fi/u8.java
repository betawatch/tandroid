package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class u8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ u8(w8 w8Var, int i7) {
        this.a = i7;
        this.b = w8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                i9 i9Var = this.b.s0;
                i9Var.Y = 0.0f;
                i9.i(i9Var);
                break;
            default:
                i9 i9Var2 = this.b.s0;
                i9Var2.X = 0.0f;
                i9Var2.a0 = 0.0f;
                i9.i(i9Var2);
                break;
        }
    }
}
