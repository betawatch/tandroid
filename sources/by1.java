// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class by1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ FrameLayout c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ by1(FrameLayout frameLayout, int i, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        byte b2 = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) frameLayout;
                if (b2 == 0) {
                    chatActivityEnterView.q3 = 0;
                }
                chatActivityEnterView.W0 = null;
                chatActivityEnterView.x2.setTranslationY(0.0f);
                chatActivityEnterView.x2.setVisibility(8);
                chatActivityEnterView.A4.e();
                hy1 hy1Var = chatActivityEnterView.P3;
                if (hy1Var != null) {
                    hy1Var.k(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 1:
                l04 l04Var = (l04) frameLayout;
                l04Var.r.setVisibility(b2 == 1 ? 0 : 8);
                l04Var.h.setVisibility(b2 == 2 ? 0 : 8);
                l04Var.n.setVisibility(b2 != 3 ? 8 : 0);
                break;
            default:
                y95 y95Var = (y95) frameLayout;
                if (!y95Var.c()) {
                    y95Var.b(b2);
                }
                y95Var.e0 = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                l04 l04Var = (l04) this.c;
                l04Var.r.setVisibility(0);
                l04Var.h.setVisibility(0);
                l04Var.n.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
