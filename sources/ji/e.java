package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.jo;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        jo joVar = this.f.P;
        if (joVar != null) {
            joVar.h.setAlpha(1.0f);
        }
        u1Var.invalidate();
    }
}
