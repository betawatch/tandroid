// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k43 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m43 b;

    public /* synthetic */ k43(m43 m43Var, byte b) {
        this.a = b;
        this.b = m43Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        m43 m43Var = this.b;
        switch (b) {
            case 0:
                m43Var.f();
                break;
            default:
                m43Var.a(false);
                m43Var.j = 0.0f;
                t09 t09Var = m43Var.n;
                t09Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                t09Var.setSkipDraw(false);
                m43Var.c.setVisibility(8);
                m43Var.f();
                break;
        }
    }
}
