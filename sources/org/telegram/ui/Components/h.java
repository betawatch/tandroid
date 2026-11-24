package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public h(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.i1.setAllowDraw(true);
        chatActivityEnterView.D2.setTransformToSeekbar(1.0f);
        chatActivityEnterView.U0();
    }
}
