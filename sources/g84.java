// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g84 extends AnimatorListenerAdapter {
    public final /* synthetic */ i84 a;

    public g84(i84 i84Var) {
        this.a = i84Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i84 i84Var = this.a;
        ah8 ah8Var = i84Var.n;
        TextView textView = i84Var.h;
        ls8 ls8Var = i84Var.f;
        if (i84Var.x) {
            ls8Var.setVisibility(4);
            textView.setVisibility(4);
            ah8Var.setVisibility(0);
        } else {
            if (i84Var.w) {
                ls8Var.setVisibility(4);
            } else {
                textView.setVisibility(4);
            }
            ah8Var.setVisibility(8);
        }
    }
}
