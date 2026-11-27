// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class c53 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e53 b;

    public /* synthetic */ c53(e53 e53Var, byte b) {
        this.a = b;
        this.b = e53Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        e53 e53Var = this.b;
        switch (b) {
            case 0:
                e53Var.f();
                break;
            default:
                e53Var.a(false);
                e53Var.j = 0.0f;
                i49 i49Var = e53Var.n;
                i49Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                i49Var.setSkipDraw(false);
                e53Var.c.setVisibility(8);
                e53Var.f();
                break;
        }
    }
}
