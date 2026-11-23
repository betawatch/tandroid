package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class zf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ChatActivityEnterView d;

    public zf(ChatActivityEnterView chatActivityEnterView, gf gfVar, float f10, float f11) {
        this.d = chatActivityEnterView;
        this.a = gfVar;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        rn0 rn0Var;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ChatActivityEnterView chatActivityEnterView = this.d;
        fe feVar = chatActivityEnterView.R0;
        int i7 = 1;
        if (chatActivityEnterView.F0 == view && (rn0Var = chatActivityEnterView.q0) != null && rn0Var.getVisibility() != 0) {
            float left = (this.b - view.getLeft()) - chatActivityEnterView.I;
            float left2 = this.c - feVar.getLeft();
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
            duration.setInterpolator(nr.f);
            duration.addUpdateListener(new hi.i9(this, left, left2, i7));
            duration.addListener(new ah.l(23, this, duration));
            chatActivityEnterView.q0.setTag(duration);
            chatActivityEnterView.H = left;
            chatActivityEnterView.q2();
            feVar.setTranslationX(left2);
            duration.start();
        }
        return true;
    }
}
