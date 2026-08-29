package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bg extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ bg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
        this.a = i11;
        this.c = chatActivityEnterView;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                int i10 = this.b;
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (i10 == 0) {
                    chatActivityEnterView.v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                chatActivityEnterView.C1.setTranslationY(0.0f);
                chatActivityEnterView.C1.setVisibility(8);
                chatActivityEnterView.G3.unlock();
                hg hgVar = chatActivityEnterView.U2;
                if (hgVar != null) {
                    hgVar.v(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                hv0 hv0Var = chatActivityEnterView2.h1;
                chatActivityEnterView2.v3 = false;
                chatActivityEnterView2.w3 = null;
                xf xfVar = chatActivityEnterView2.Q0;
                if (xfVar != null) {
                    if (chatActivityEnterView2.Y4 == null) {
                        xfVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView2.Q0.setLayerType(0, null);
                }
                if (hv0Var != null) {
                    hv0Var.requestLayout();
                    hv0Var.setForeground(null);
                    hv0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.u2 && chatActivityEnterView2.t0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.a2, true, true);
                }
                be beVar = chatActivityEnterView2.n0;
                if (beVar != null) {
                    beVar.run();
                    chatActivityEnterView2.n0 = null;
                }
                chatActivityEnterView2.G3.unlock();
                break;
        }
    }
}
