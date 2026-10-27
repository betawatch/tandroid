package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.vo;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ s1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ m f;

    public e(m mVar, s1 s1Var, float f7, float f10, float f11, float f12) {
        this.f = mVar;
        this.a = s1Var;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var = this.a;
        s1Var.getTransitionParams().j();
        s1Var.getPhotoImage().setImageCoords(this.b, this.c, this.d, this.e);
        vo voVar = this.f.P;
        if (voVar != null) {
            voVar.h.setAlpha(1.0f);
        }
        s1Var.invalidate();
    }
}
