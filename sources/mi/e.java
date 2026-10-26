package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.vo;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
