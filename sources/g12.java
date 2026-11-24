// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g12 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ n12 c;

    public /* synthetic */ g12(n12 n12Var, boolean z, byte b) {
        this.a = b;
        this.c = n12Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int L;
        byte b = this.a;
        boolean z = this.b;
        n12 n12Var = this.c;
        switch (b) {
            case 0:
                i22 i22Var = n12Var.e;
                if (z) {
                    i22Var.u3.setVisibility(8);
                    L = gm.L(36.0f);
                } else {
                    i22Var.B3.setVisibility(8);
                    L = 0;
                }
                for (int i = 0; i < i22Var.u2.size(); i++) {
                    ((e32) i22Var.u2.valueAt(i)).setMeasureOffsetY(L);
                }
                if (n12Var.a == animator) {
                    n12Var.a = null;
                    break;
                }
                break;
            default:
                i22 i22Var2 = n12Var.e;
                i22Var2.y3 = z;
                if (!z) {
                    i22Var2.z3.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                i22 i22Var = this.c.e;
                if (this.b) {
                    i22Var.B3.setAlpha(0.0f);
                    i22Var.B3.setVisibility(0);
                    int L = gm.L(36.0f);
                    for (int i = 0; i < i22Var.u2.size(); i++) {
                        ((e32) i22Var.u2.valueAt(i)).setMeasureOffsetY(L);
                    }
                    break;
                } else {
                    i22Var.u3.setAlpha(0.0f);
                    i22Var.u3.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
