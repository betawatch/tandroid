package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class z4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ z4(o5 o5Var, int i7) {
        this.a = i7;
        this.b = o5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                o5Var.K1 = 0.0f;
                o5Var.I1.setAlpha(1.0f);
                o5Var.I1.setVisibility(8);
                o5Var.I1.n();
                break;
            case 1:
                this.b.Y1.setTranslationY(0.0f);
                break;
            default:
                o5 o5Var2 = this.b;
                o5Var2.b2 = false;
                o5Var2.Y1.setTranslationY(0.0f);
                o5Var2.t0();
                break;
        }
    }
}
