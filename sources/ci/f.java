package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.xn;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ q1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ o f;

    public f(o oVar, q1 q1Var, float f7, float f10, float f11, float f12) {
        this.f = oVar;
        this.a = q1Var;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q1 q1Var = this.a;
        q1Var.getTransitionParams().e();
        q1Var.getPhotoImage().y0(this.b, this.c, this.d, this.e);
        xn xnVar = this.f.P;
        if (xnVar != null) {
            xnVar.h.setAlpha(1.0f);
        }
        q1Var.invalidate();
    }
}
