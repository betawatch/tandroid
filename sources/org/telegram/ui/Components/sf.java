package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sf extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public sf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        zi0 zi0Var = chatActivityEnterView.i1;
        if (zi0Var != null && zi0Var.T0 != null) {
            chatActivityEnterView.z5 = new xd(3, this, animator);
            return;
        }
        x61 x61Var = chatActivityEnterView.g1;
        if (x61Var != null) {
            x61Var.setVisibility(8);
        }
        zi0 zi0Var2 = chatActivityEnterView.i1;
        if (zi0Var2 != null) {
            zi0Var2.setVisibility(8);
        }
        chatActivityEnterView.f5 = 0.0f;
        chatActivityEnterView.X0();
        chatActivityEnterView.O0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
        if (recordCircle != null) {
            recordCircle.g();
        }
    }
}
