// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class be8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ie8 b;

    public /* synthetic */ be8(ie8 ie8Var, byte b) {
        this.a = b;
        this.b = ie8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ie8 ie8Var = this.b;
        switch (b) {
            case 0:
                ie8Var.S.setTranslationY(0.0f);
                break;
            case 1:
                ie8Var.S.setTranslationY(0.0f);
                break;
            default:
                ie8Var.S.setTranslationY(0.0f);
                ie8Var.m0();
                break;
        }
    }
}
