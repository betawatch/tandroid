package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public mf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
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
            int i10 = ChatActivityEnterView.i5;
            chatActivityEnterView.b0();
        }
        go0 go0Var = chatActivityEnterView.l0;
        if (go0Var != null) {
            go0Var.setVisibility(z10 ? 0 : 8);
            chatActivityEnterView.l0.setAlpha(this.d);
            chatActivityEnterView.l0.setTranslationX(this.e);
            f10 = chatActivityEnterView.l0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(f10);
        chatActivityEnterView.C = f10;
        chatActivityEnterView.I1();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        go0 go0Var = chatActivityEnterView.l0;
        if (go0Var != null) {
            go0Var.setVisibility(8);
        }
        chatActivityEnterView.M0.setTranslationX(0.0f);
        chatActivityEnterView.C = 0.0f;
        chatActivityEnterView.I1();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z10) {
            int i10 = ChatActivityEnterView.i5;
            chatActivityEnterView.b0();
            chatActivityEnterView.l0.setVisibility(0);
        }
        go0 go0Var = chatActivityEnterView.l0;
        if (go0Var != null) {
            go0Var.setAlpha(this.b);
            chatActivityEnterView.l0.setTranslationX(this.c);
            f10 = chatActivityEnterView.l0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(f10);
        chatActivityEnterView.C = f10;
        chatActivityEnterView.I1();
        nh.a0 a0Var = chatActivityEnterView.h0;
        if (a0Var == null || a0Var.getTag() != null) {
            return;
        }
        chatActivityEnterView.x0.clear();
    }
}
