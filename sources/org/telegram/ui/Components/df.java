package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class df extends AnimatorListenerAdapter {
    public final /* synthetic */ ChatActivityEnterView a;

    public df(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.h1.setAllowDraw(true);
        chatActivityEnterView.N1.setTransformToSeekbar(1.0f);
        chatActivityEnterView.w0();
    }
}
