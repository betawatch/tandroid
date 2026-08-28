package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public qf(ChatActivityEnterView chatActivityEnterView, boolean z10, float f10, float f11, float f12, float f13) {
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
            int i9 = ChatActivityEnterView.i5;
            chatActivityEnterView.a0();
        }
        fo0 fo0Var = chatActivityEnterView.l0;
        if (fo0Var != null) {
            fo0Var.setVisibility(z10 ? 0 : 8);
            chatActivityEnterView.l0.setAlpha(this.d);
            chatActivityEnterView.l0.setTranslationX(this.e);
            f10 = chatActivityEnterView.l0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(f10);
        chatActivityEnterView.C = f10;
        chatActivityEnterView.J1();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        fo0 fo0Var = chatActivityEnterView.l0;
        if (fo0Var != null) {
            fo0Var.setVisibility(8);
        }
        chatActivityEnterView.M0.setTranslationX(0.0f);
        chatActivityEnterView.C = 0.0f;
        chatActivityEnterView.J1();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z10 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z10) {
            int i9 = ChatActivityEnterView.i5;
            chatActivityEnterView.a0();
            chatActivityEnterView.l0.setVisibility(0);
        }
        fo0 fo0Var = chatActivityEnterView.l0;
        if (fo0Var != null) {
            fo0Var.setAlpha(this.b);
            chatActivityEnterView.l0.setTranslationX(this.c);
            f10 = chatActivityEnterView.l0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.M0.setTranslationX(f10);
        chatActivityEnterView.C = f10;
        chatActivityEnterView.J1();
        mh.c0 c0Var = chatActivityEnterView.h0;
        if (c0Var == null || c0Var.getTag() != null) {
            return;
        }
        chatActivityEnterView.x0.clear();
    }
}
