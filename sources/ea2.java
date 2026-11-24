// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ea2 extends AnimatorListenerAdapter {
    public final /* synthetic */ gb2 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ la2 f;

    public ea2(la2 la2Var, gb2 gb2Var, float f, float f2, float f3, float f4) {
        this.f = la2Var;
        this.a = gb2Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gb2 gb2Var = this.a;
        gb2Var.getTransitionParams().e();
        gb2Var.getPhotoImage().i0(this.b, this.c, this.d, this.e);
        i92 i92Var = this.f.P;
        if (i92Var != null) {
            i92Var.h.setAlpha(1.0f);
        }
        gb2Var.invalidate();
    }
}
