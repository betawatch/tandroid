package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class of extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public of(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
        this.f = chatActivityEnterView;
        this.a = z10;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f10;
        ChatActivityEnterView chatActivityEnterView = this.f;
        boolean z10 = this.a;
        if (z10) {
            int i7 = ChatActivityEnterView.N6;
            chatActivityEnterView.f0();
        }
        gn0 gn0Var = chatActivityEnterView.q0;
        if (gn0Var != null) {
            gn0Var.setVisibility(z10 ? 0 : 8);
            chatActivityEnterView.q0.setAlpha(this.d);
            chatActivityEnterView.q0.setTranslationX(this.e);
            f10 = chatActivityEnterView.q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.d2();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        gn0 gn0Var = chatActivityEnterView.q0;
        if (gn0Var != null) {
            gn0Var.setVisibility(8);
        }
        chatActivityEnterView.R0.setTranslationX(0.0f);
        chatActivityEnterView.H = 0.0f;
        chatActivityEnterView.d2();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z10) {
            int i7 = ChatActivityEnterView.N6;
            chatActivityEnterView.f0();
            chatActivityEnterView.q0.setVisibility(0);
        }
        gn0 gn0Var = chatActivityEnterView.q0;
        if (gn0Var != null) {
            gn0Var.setAlpha(this.b);
            chatActivityEnterView.q0.setTranslationX(this.c);
            f10 = chatActivityEnterView.q0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.R0.setTranslationX(f10);
        chatActivityEnterView.H = f10;
        chatActivityEnterView.d2();
        ki.a0 a0Var = chatActivityEnterView.m0;
        if (a0Var == null || a0Var.getTag() != null) {
            return;
        }
        chatActivityEnterView.C0.clear();
    }
}
