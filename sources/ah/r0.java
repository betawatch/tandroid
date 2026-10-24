package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gl0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class r0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ r0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f();
                break;
            default:
                t0 t0Var = this.b;
                t0.a(t0Var, false);
                t0Var.j = 0.0f;
                gl0 gl0Var = t0Var.n;
                gl0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                gl0Var.setSkipDraw(false);
                t0Var.c.setVisibility(8);
                t0Var.f();
                break;
        }
    }
}
