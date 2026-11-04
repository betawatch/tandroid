package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hs0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hs0(int i3, ViewGroup viewGroup, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = viewGroup;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ks0 ks0Var = (ks0) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.d;
                PremiumPreviewFragment premiumPreviewFragment = ks0Var.n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                for (int i3 = 0; i3 < premiumPreviewFragment.V.getChildCount(); i3++) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i3);
                    if (childAt != ks0Var.e) {
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + (childAt == ks0Var.c ? 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction) : 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction)));
                    }
                }
                break;
            default:
                a51 a51Var = (a51) this.b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                org.telegram.ui.Components.ai aiVar = (org.telegram.ui.Components.ai) this.d;
                a51Var.getClass();
                a51Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getEditField().setAlpha(a51Var.a);
                aiVar.invalidate();
                break;
        }
    }
}
