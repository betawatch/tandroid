package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ko;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ u1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ n f;

    public e(n nVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f = nVar;
        this.a = u1Var;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u1 u1Var = this.a;
        u1Var.getTransitionParams().j();
        u1Var.getPhotoImage().setImageCoords(this.b, this.c, this.d, this.e);
        ko koVar = this.f.P;
        if (koVar != null) {
            koVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
