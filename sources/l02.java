// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class l02 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s02 c;

    public /* synthetic */ l02(s02 s02Var, boolean z, byte b) {
        this.a = b;
        this.c = s02Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int L;
        byte b = this.a;
        boolean z = this.b;
        s02 s02Var = this.c;
        switch (b) {
            case 0:
                n12 n12Var = s02Var.e;
                if (z) {
                    n12Var.u3.setVisibility(8);
                    L = hl.L(36.0f);
                } else {
                    n12Var.B3.setVisibility(8);
                    L = 0;
                }
                for (int i = 0; i < n12Var.u2.size(); i++) {
                    ((j22) n12Var.u2.valueAt(i)).setMeasureOffsetY(L);
                }
                if (s02Var.a == animator) {
                    s02Var.a = null;
                    break;
                }
                break;
            default:
                n12 n12Var2 = s02Var.e;
                n12Var2.y3 = z;
                if (!z) {
                    n12Var2.z3.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                n12 n12Var = this.c.e;
                if (this.b) {
                    n12Var.B3.setAlpha(0.0f);
                    n12Var.B3.setVisibility(0);
                    int L = hl.L(36.0f);
                    for (int i = 0; i < n12Var.u2.size(); i++) {
                        ((j22) n12Var.u2.valueAt(i)).setMeasureOffsetY(L);
                    }
                    break;
                } else {
                    n12Var.u3.setAlpha(0.0f);
                    n12Var.u3.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
