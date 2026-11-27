// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ng4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ r32 b;

    public ng4(r32 r32Var) {
        this.b = r32Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        r32 r32Var = this.b;
        switch (b) {
            case 0:
                ((yg4) r32Var.d).m0.e();
                break;
            default:
                tk4 tk4Var = r32Var.b;
                tk4Var.setAlpha(1.0f);
                q79.w0(tk4Var);
                ((yg4) r32Var.d).b.removeView(tk4Var);
                break;
        }
    }

    public ng4(r32 r32Var, q79 q79Var) {
        this.b = r32Var;
    }
}
