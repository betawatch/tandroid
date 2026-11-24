// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mj3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ nk3 c;

    public /* synthetic */ mj3(nk3 nk3Var, float f, byte b) {
        this.a = b;
        this.c = nk3Var;
        this.b = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        int i = 0;
        nk3 nk3Var = this.c;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                nk3Var.x3 = null;
                nk3Var.P = false;
                nk3Var.R = true;
                nk3Var.S = true;
                nk3Var.fragmentView.invalidate();
                nk3Var.A3 = -(gm.L((nk3Var.L ? 81 : 0) + 48) - f);
                nk3Var.f0[0].setTranslationY(0.0f);
                while (true) {
                    mk3[] mk3VarArr = nk3Var.f0;
                    if (i >= mk3VarArr.length) {
                        nk3Var.fragmentView.requestLayout();
                        zj3 zj3Var = nk3Var.Y;
                        if (zj3Var != null && nk3Var.b.f) {
                            zj3Var.r.requestFocus();
                            gm.E3(nk3Var.Y.r);
                            break;
                        }
                    } else {
                        mk3 mk3Var = mk3VarArr[i];
                        if (mk3Var != null) {
                            mk3Var.a.requestLayout();
                        }
                        i++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                nk3Var.x3 = null;
                nk3Var.Q = 0;
                nk3Var.P = true;
                nk3Var.A3 = gm.L((nk3Var.L ? 81 : 0) + 48) - f;
                nk3Var.f0[0].setTranslationY(0.0f);
                int i2 = 0;
                while (true) {
                    mk3[] mk3VarArr2 = nk3Var.f0;
                    if (i2 >= mk3VarArr2.length) {
                        nk3Var.F0.l(false, 1.0f);
                        nk3Var.fragmentView.requestLayout();
                        break;
                    } else {
                        mk3 mk3Var2 = mk3VarArr2[i2];
                        if (mk3Var2 != null) {
                            mk3Var2.a.requestLayout();
                        }
                        i2++;
                    }
                }
        }
    }
}
