package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.jo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ t1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ n f;

    public e(n nVar, t1 t1Var, float f7, float f10, float f11, float f12) {
        this.f = nVar;
        this.a = t1Var;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.b, this.c, this.d, this.e);
        jo joVar = this.f.P;
        if (joVar != null) {
            joVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
