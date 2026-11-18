package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class x5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z5 b;

    public /* synthetic */ x5(z5 z5Var, int i7) {
        this.a = i7;
        this.b = z5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.k0 = false;
                break;
            case 1:
                this.b.k0 = false;
                break;
            case 2:
                this.b.P.setVisibility(4);
                break;
            case 3:
                z5 z5Var = this.b;
                z5Var.z0 = z5Var.y0;
                z5Var.d(z5Var.b0);
                break;
            default:
                z5 z5Var2 = this.b;
                z5Var2.A0 = 1.0f;
                z5Var2.b.setScaleX(1.0f);
                z5Var2.b.setScaleY(z5Var2.A0);
                z5Var2.invalidate();
                break;
        }
    }
}
