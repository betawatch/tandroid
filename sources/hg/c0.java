package hg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ c0(e0 e0Var, int i9) {
        this.a = i9;
        this.b = e0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f();
                break;
            default:
                e0 e0Var = this.b;
                e0.a(e0Var, false);
                e0Var.j = 0.0f;
                uj0 uj0Var = e0Var.n;
                uj0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                uj0Var.setSkipDraw(false);
                e0Var.c.setVisibility(8);
                e0Var.f();
                break;
        }
    }
}
