package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ye extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public ye(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        a61 a61Var = chatActivityEnterView.g1;
        if (a61Var != null) {
            a61Var.setVisibility(8);
        }
        mi0 mi0Var = chatActivityEnterView.i1;
        if (mi0Var != null) {
            mi0Var.setVisibility(8);
        }
        chatActivityEnterView.q4 = 0.0f;
        chatActivityEnterView.v0();
        chatActivityEnterView.m0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.O1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
