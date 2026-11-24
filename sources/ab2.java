// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ab2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gb2 b;

    public /* synthetic */ ab2(gb2 gb2Var, byte b) {
        this.a = b;
        this.b = gb2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        gb2 gb2Var = this.b;
        switch (b) {
            case 0:
                gb2Var.Q5.O0 = true;
                gb2Var.invalidate();
                break;
            default:
                gb2Var.setSelectedBackgroundProgress(0.0f);
                break;
        }
    }
}
