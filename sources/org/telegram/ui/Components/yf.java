package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ChatActivityEnterView d;

    public yf(ChatActivityEnterView chatActivityEnterView, hf hfVar, float f10, float f11) {
        this.d = chatActivityEnterView;
        this.a = hfVar;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        qn0 qn0Var;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ChatActivityEnterView chatActivityEnterView = this.d;
        ge geVar = chatActivityEnterView.R0;
        int i7 = 1;
        if (chatActivityEnterView.F0 == view && (qn0Var = chatActivityEnterView.q0) != null && qn0Var.getVisibility() != 0) {
            float left = (this.b - view.getLeft()) - chatActivityEnterView.I;
            float left2 = this.c - geVar.getLeft();
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
            duration.setInterpolator(kr.f);
            duration.addUpdateListener(new hi.da(this, left, left2, i7));
            duration.addListener(new ah.l(23, this, duration));
            chatActivityEnterView.q0.setTag(duration);
            chatActivityEnterView.H = left;
            chatActivityEnterView.s2();
            geVar.setTranslationX(left2);
            duration.start();
        }
        return true;
    }
}
