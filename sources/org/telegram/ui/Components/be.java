package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class be extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ be(ChatActivityEnterView chatActivityEnterView, int i7, int i10) {
        this.a = i10;
        this.c = chatActivityEnterView;
        this.b = i7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = this.c;
                du0 du0Var = chatActivityEnterView.c2;
                chatActivityEnterView.q4 = false;
                chatActivityEnterView.r4 = null;
                fg fgVar = chatActivityEnterView.V0;
                if (fgVar != null) {
                    if (chatActivityEnterView.e7 == null) {
                        fgVar.getLayoutParams().height = this.b;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (du0Var != null) {
                    du0Var.requestLayout();
                    du0Var.setForeground(null);
                    du0Var.setWillNotDraw(false);
                }
                if (chatActivityEnterView.p3 && chatActivityEnterView.S0()) {
                    chatActivityEnterView.X1(0, chatActivityEnterView.V2, true, true);
                }
                dd ddVar = chatActivityEnterView.s0;
                if (ddVar != null) {
                    ddVar.run();
                    chatActivityEnterView.s0 = null;
                }
                chatActivityEnterView.B4.e();
                break;
            default:
                int i7 = this.b;
                ChatActivityEnterView chatActivityEnterView2 = this.c;
                if (i7 == 0) {
                    chatActivityEnterView2.q3 = 0;
                }
                chatActivityEnterView2.W0 = null;
                chatActivityEnterView2.x2.setTranslationY(0.0f);
                chatActivityEnterView2.x2.setVisibility(8);
                chatActivityEnterView2.B4.e();
                ng ngVar = chatActivityEnterView2.P3;
                if (ngVar != null) {
                    ngVar.x(0.0f);
                }
                chatActivityEnterView2.requestLayout();
                break;
        }
    }
}
