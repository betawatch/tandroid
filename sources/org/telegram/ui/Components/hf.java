package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hf extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public hf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        oi0 oi0Var = chatActivityEnterView.i1;
        if (oi0Var != null && oi0Var.T0 != null) {
            chatActivityEnterView.r5 = new od(3, this, animator);
            return;
        }
        i61 i61Var = chatActivityEnterView.g1;
        if (i61Var != null) {
            i61Var.setVisibility(8);
        }
        oi0 oi0Var2 = chatActivityEnterView.i1;
        if (oi0Var2 != null) {
            oi0Var2.setVisibility(8);
        }
        chatActivityEnterView.X4 = 0.0f;
        chatActivityEnterView.K0();
        chatActivityEnterView.B0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.v2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }
}
