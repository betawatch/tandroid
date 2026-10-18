package li;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.to;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ u1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ m f;

    public e(m mVar, u1 u1Var, float f7, float f10, float f11, float f12) {
        this.f = mVar;
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
        to toVar = this.f.P;
        if (toVar != null) {
            toVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
