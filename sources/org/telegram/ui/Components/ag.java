package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ag extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public ag(ChatActivityEnterView chatActivityEnterView, boolean z10, float f7, float f10, float f11, float f12) {
        this.f = chatActivityEnterView;
        this.a = z10;
        this.b = f7;
        this.c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f7;
        ChatActivityEnterView chatActivityEnterView = this.f;
        boolean z10 = this.a;
        if (z10) {
            int i10 = ChatActivityEnterView.m5;
            chatActivityEnterView.b0();
        }
        xo0 xo0Var = chatActivityEnterView.p0;
        if (xo0Var != null) {
            xo0Var.setVisibility(z10 ? 0 : 8);
            chatActivityEnterView.p0.setAlpha(this.d);
            chatActivityEnterView.p0.setTranslationX(this.e);
            f7 = chatActivityEnterView.p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        xo0 xo0Var = chatActivityEnterView.p0;
        if (xo0Var != null) {
            xo0Var.setVisibility(8);
        }
        chatActivityEnterView.Q0.setTranslationX(0.0f);
        chatActivityEnterView.G = 0.0f;
        chatActivityEnterView.J1();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f7;
        boolean z10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z10) {
            int i10 = ChatActivityEnterView.m5;
            chatActivityEnterView.b0();
            chatActivityEnterView.p0.setVisibility(0);
        }
        xo0 xo0Var = chatActivityEnterView.p0;
        if (xo0Var != null) {
            xo0Var.setAlpha(this.b);
            chatActivityEnterView.p0.setTranslationX(this.c);
            f7 = chatActivityEnterView.p0.getTranslationX();
        } else {
            f7 = 0.0f;
        }
        chatActivityEnterView.Q0.setTranslationX(f7);
        chatActivityEnterView.G = f7;
        chatActivityEnterView.J1();
        fi.c0 c0Var = chatActivityEnterView.l0;
        if (c0Var == null || c0Var.getTag() != null) {
            return;
        }
        chatActivityEnterView.B0.clear();
    }
}
