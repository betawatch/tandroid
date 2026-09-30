package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.lo;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
        lo loVar = this.f.P;
        if (loVar != null) {
            loVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
