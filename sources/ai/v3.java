package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class v3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ v3(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c4 c4Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                f6Var.t3 = 0.0f;
                f6Var.r3.setAlpha(1.0f);
                f6Var.r3.setVisibility(8);
                f6Var.r3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                f6 f6Var2 = this.b;
                f6Var2.N2.unlock();
                f6Var2.H2 = f6Var2.o2;
                a4 a4Var = f6Var2.b2;
                if (a4Var != null && (runnable = a4Var.w) != null) {
                    runnable.run();
                    a4Var.w = null;
                }
                if (f6Var2.K1 && !f6Var2.v2) {
                    jc jcVar = ((ac) f6Var2.Q1).d;
                    if (jcVar.x) {
                        jcVar.x = false;
                        jcVar.P();
                    }
                }
                if (!f6Var2.v2 && (c4Var = f6Var2.d3) != null) {
                    c4Var.setVisibility(8);
                }
                f6Var2.V2 = true;
                f6Var2.invalidate();
                break;
        }
    }
}
