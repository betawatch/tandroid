package bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ g0(i0 i0Var, int i10) {
        this.a = i10;
        this.b = i0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f();
                break;
            default:
                i0 i0Var = this.b;
                i0.a(i0Var, false);
                i0Var.j = 0.0f;
                gl0 gl0Var = i0Var.n;
                gl0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                gl0Var.setSkipDraw(false);
                i0Var.c.setVisibility(8);
                i0Var.f();
                break;
        }
    }
}
