// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k84 extends AnimatorListenerAdapter {
    public final /* synthetic */ m84 a;

    public k84(m84 m84Var) {
        this.a = m84Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m84 m84Var = this.a;
        if (m84Var.r) {
            m84Var.d.setVisibility(4);
        } else {
            m84Var.e.setVisibility(4);
        }
    }
}
