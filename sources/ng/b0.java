package ng;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qk0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;

    public /* synthetic */ b0(d0 d0Var, int i10) {
        this.a = i10;
        this.b = d0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f();
                break;
            default:
                d0 d0Var = this.b;
                d0.a(d0Var, false);
                d0Var.j = 0.0f;
                qk0 qk0Var = d0Var.n;
                qk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                qk0Var.setSkipDraw(false);
                d0Var.c.setVisibility(8);
                d0Var.f();
                break;
        }
    }
}
