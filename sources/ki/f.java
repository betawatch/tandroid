package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.io;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ t1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ o f;

    public f(o oVar, t1 t1Var, float f7, float f10, float f11, float f12) {
        this.f = oVar;
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
        io ioVar = this.f.P;
        if (ioVar != null) {
            ioVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
