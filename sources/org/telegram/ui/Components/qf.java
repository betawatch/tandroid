package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qf extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ChatActivityEnterView f;

    public qf(ChatActivityEnterView chatActivityEnterView, boolean z4, float f10, float f11, float f12, float f13) {
        this.f = chatActivityEnterView;
        this.a = z4;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f10;
        ChatActivityEnterView chatActivityEnterView = this.f;
        boolean z4 = this.a;
        if (z4) {
            int i10 = ChatActivityEnterView.j5;
            chatActivityEnterView.b0();
        }
        zo0 zo0Var = chatActivityEnterView.m0;
        if (zo0Var != null) {
            zo0Var.setVisibility(z4 ? 0 : 8);
            chatActivityEnterView.m0.setAlpha(this.d);
            chatActivityEnterView.m0.setTranslationX(this.e);
            f10 = chatActivityEnterView.m0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.N0.setTranslationX(f10);
        chatActivityEnterView.D = f10;
        chatActivityEnterView.J1();
        chatActivityEnterView.requestLayout();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            return;
        }
        ChatActivityEnterView chatActivityEnterView = this.f;
        zo0 zo0Var = chatActivityEnterView.m0;
        if (zo0Var != null) {
            zo0Var.setVisibility(8);
        }
        chatActivityEnterView.N0.setTranslationX(0.0f);
        chatActivityEnterView.D = 0.0f;
        chatActivityEnterView.J1();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        float f10;
        boolean z4 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.f;
        if (z4) {
            int i10 = ChatActivityEnterView.j5;
            chatActivityEnterView.b0();
            chatActivityEnterView.m0.setVisibility(0);
        }
        zo0 zo0Var = chatActivityEnterView.m0;
        if (zo0Var != null) {
            zo0Var.setAlpha(this.b);
            chatActivityEnterView.m0.setTranslationX(this.c);
            f10 = chatActivityEnterView.m0.getTranslationX();
        } else {
            f10 = 0.0f;
        }
        chatActivityEnterView.N0.setTranslationX(f10);
        chatActivityEnterView.D = f10;
        chatActivityEnterView.J1();
        rh.z zVar = chatActivityEnterView.i0;
        if (zVar == null || zVar.getTag() != null) {
            return;
        }
        chatActivityEnterView.y0.clear();
    }
}
