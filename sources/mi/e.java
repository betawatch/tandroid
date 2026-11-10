package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.on;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        on onVar = this.f.P;
        if (onVar != null) {
            onVar.h.setAlpha(1.0f);
        }
        q1Var.invalidate();
    }
}
