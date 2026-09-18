package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gg extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ gg(ChatActivityEnterView chatActivityEnterView, int i10, int i11) {
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
                    chatActivityEnterView.z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                chatActivityEnterView.G1.setTranslationY(0.0f);
                chatActivityEnterView.G1.setVisibility(8);
                chatActivityEnterView.K3.unlock();
                mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    mgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            default:
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                qv0 qv0Var = chatActivityEnterView2.l1;
                chatActivityEnterView2.z3 = false;
                chatActivityEnterView2.A3 = null;
                cg cgVar = chatActivityEnterView2.U0;
                if (cgVar != null) {
                    if (chatActivityEnterView2.d5 == null) {
                        cgVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView2.U0.setLayerType(0, null);
                }
                if (qv0Var != null) {
                    qv0Var.requestLayout();
                    qv0Var.setForeground(null);
                    qv0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView2.y2 && chatActivityEnterView2.u0()) {
                    chatActivityEnterView2.t1(0, chatActivityEnterView2.e2, true, true);
                }
                ge geVar = chatActivityEnterView2.r0;
                if (geVar != null) {
                    geVar.run();
                    chatActivityEnterView2.r0 = null;
                }
                chatActivityEnterView2.K3.unlock();
                break;
        }
    }
}
