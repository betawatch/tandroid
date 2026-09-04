package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fk0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class s0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u0 b;

    public /* synthetic */ s0(u0 u0Var, int i10) {
        this.a = i10;
        this.b = u0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f();
                break;
            default:
                u0 u0Var = this.b;
                u0.a(u0Var, false);
                u0Var.j = 0.0f;
                fk0 fk0Var = u0Var.n;
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                fk0Var.setSkipDraw(false);
                u0Var.c.setVisibility(8);
                u0Var.f();
                break;
        }
    }
}
