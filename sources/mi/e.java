package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.pn;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ q1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ l f;

    public e(l lVar, q1 q1Var, float f10, float f11, float f12, float f13) {
        this.f = lVar;
        this.a = q1Var;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q1 q1Var = this.a;
        q1Var.getTransitionParams().e();
        q1Var.getPhotoImage().y0(this.b, this.c, this.d, this.e);
        pn pnVar = this.f.P;
        if (pnVar != null) {
            pnVar.h.setAlpha(1.0f);
        }
        q1Var.invalidate();
    }
}
