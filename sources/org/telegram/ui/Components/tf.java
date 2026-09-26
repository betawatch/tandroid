package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class tf extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public tf(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        i81 i81Var = chatActivityEnterView.f1;
        if (i81Var != null) {
            i81Var.setVisibility(8);
        }
        rk0 rk0Var = chatActivityEnterView.h1;
        if (rk0Var != null) {
            rk0Var.setVisibility(8);
        }
        chatActivityEnterView.p4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.N1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
