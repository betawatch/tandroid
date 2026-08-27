package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ef extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public ef(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        b71 b71Var = chatActivityEnterView.b1;
        if (b71Var != null) {
            b71Var.setVisibility(8);
        }
        xj0 xj0Var = chatActivityEnterView.d1;
        if (xj0Var != null) {
            xj0Var.setVisibility(8);
        }
        chatActivityEnterView.k4 = 0.0f;
        chatActivityEnterView.x0();
        chatActivityEnterView.p0();
        ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.I1;
        if (recordCircle != null) {
            recordCircle.d();
        }
    }
}
