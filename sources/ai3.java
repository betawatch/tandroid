// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ai3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ cj3 c;

    public /* synthetic */ ai3(cj3 cj3Var, float f, byte b) {
        this.a = b;
        this.c = cj3Var;
        this.b = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        float f = this.b;
        int i = 0;
        cj3 cj3Var = this.c;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                cj3Var.x3 = null;
                cj3Var.P = false;
                cj3Var.R = true;
                cj3Var.S = true;
                cj3Var.fragmentView.invalidate();
                cj3Var.A3 = -(gl.L((cj3Var.L ? 81 : 0) + 48) - f);
                cj3Var.f0[0].setTranslationY(0.0f);
                while (true) {
                    bj3[] bj3VarArr = cj3Var.f0;
                    if (i >= bj3VarArr.length) {
                        cj3Var.fragmentView.requestLayout();
                        pi3 pi3Var = cj3Var.Y;
                        if (pi3Var != null && cj3Var.b.f) {
                            pi3Var.r.requestFocus();
                            gl.E3(cj3Var.Y.r);
                            break;
                        }
                    } else {
                        bj3 bj3Var = bj3VarArr[i];
                        if (bj3Var != null) {
                            bj3Var.a.requestLayout();
                        }
                        i++;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                cj3Var.x3 = null;
                cj3Var.Q = 0;
                cj3Var.P = true;
                cj3Var.A3 = gl.L((cj3Var.L ? 81 : 0) + 48) - f;
                cj3Var.f0[0].setTranslationY(0.0f);
                int i2 = 0;
                while (true) {
                    bj3[] bj3VarArr2 = cj3Var.f0;
                    if (i2 >= bj3VarArr2.length) {
                        cj3Var.F0.l(false, 1.0f);
                        cj3Var.fragmentView.requestLayout();
                        break;
                    } else {
                        bj3 bj3Var2 = bj3VarArr2[i2];
                        if (bj3Var2 != null) {
                            bj3Var2.a.requestLayout();
                        }
                        i2++;
                    }
                }
        }
    }
}
