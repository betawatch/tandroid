// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gk3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s49 b;
    public final /* synthetic */ ue3 c;
    public final /* synthetic */ yg3 d;

    public /* synthetic */ gk3(yg3 yg3Var, s49 s49Var, ue3 ue3Var, byte b) {
        this.a = b;
        this.d = yg3Var;
        this.b = s49Var;
        this.c = ue3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        s49 s49Var = this.b;
        yg3 yg3Var = this.d;
        ue3 ue3Var = this.c;
        switch (b) {
            case 0:
                animator.removeAllListeners();
                ue3Var.setClipProgress(0.0f);
                ue3Var.setElevation(0.0f);
                yg3Var.d(s49Var);
                yg3Var.x.remove(s49Var);
                yg3Var.A();
                break;
            default:
                animator.removeAllListeners();
                ue3Var.setClipProgress(0.0f);
                ue3Var.setElevation(0.0f);
                yg3Var.d(s49Var);
                yg3Var.x.remove(s49Var);
                yg3Var.A();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        yg3 yg3Var = this.d;
        switch (b) {
            case 0:
                yg3Var.y();
                break;
            default:
                yg3Var.y();
                break;
        }
    }
}
