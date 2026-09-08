package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.io;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
