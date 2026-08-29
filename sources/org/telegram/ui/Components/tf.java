package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public tf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f9, float f10, float f11, float f12) {
        this.f = chatActivityEnterView;
        this.a = z10;
        this.b = f9;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f9;
        ChatActivityEnterView chatActivityEnterView = this.f;
        boolean z10 = this.a;
        if (z10) {
            int i10 = ChatActivityEnterView.i5;
            chatActivityEnterView.b0();
        }
        qo0 qo0Var = chatActivityEnterView.l0;
        if (qo0Var != null) {
            qo0Var.setVisibility(z10 ? 0 : 8);
            chatActivityEnterView.l0.setAlpha(this.d);
            chatActivityEnterView.l0.setTranslationX(this.e);
            f9 = chatActivityEnterView.l0.getTranslationX();
        } else {
            f9 = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(f9);
        chatActivityEnterView.C = f9;
        chatActivityEnterView.J1();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        qo0 qo0Var = chatActivityEnterView.l0;
        if (qo0Var != null) {
            qo0Var.setVisibility(8);
        }
        chatActivityEnterView.M0.setTranslationX(0.0f);
        chatActivityEnterView.C = 0.0f;
        chatActivityEnterView.J1();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f9;
        boolean z10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z10) {
            int i10 = ChatActivityEnterView.i5;
            chatActivityEnterView.b0();
            chatActivityEnterView.l0.setVisibility(0);
        }
        qo0 qo0Var = chatActivityEnterView.l0;
        if (qo0Var != null) {
            qo0Var.setAlpha(this.b);
            chatActivityEnterView.l0.setTranslationX(this.c);
            f9 = chatActivityEnterView.l0.getTranslationX();
        } else {
            f9 = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(f9);
        chatActivityEnterView.C = f9;
        chatActivityEnterView.J1();
        ph.z zVar = chatActivityEnterView.h0;
        if (zVar == null || zVar.getTag() != null) {
            return;
        }
        chatActivityEnterView.x0.clear();
    }
}
