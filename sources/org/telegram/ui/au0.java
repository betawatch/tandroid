package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class au0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ au0(int i10, ViewGroup viewGroup, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = viewGroup;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                du0 du0Var = (du0) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.d;
                PremiumPreviewFragment premiumPreviewFragment = du0Var.n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != du0Var.e) {
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + (childAt == du0Var.c ? 0.0f - (org.telegram.messenger.i0.L(15.0f) * animatedFraction) : 0.0f + (org.telegram.messenger.i0.L(8.0f) * animatedFraction)));
                    }
                }
                break;
            default:
                d71 d71Var = (d71) this.b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                ih.e eVar = (ih.e) this.d;
                d71Var.getClass();
                d71Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getEditField().setAlpha(d71Var.a);
                eVar.invalidate();
                break;
        }
    }
}
