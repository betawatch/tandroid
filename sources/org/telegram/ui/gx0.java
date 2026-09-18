package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gx0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gx0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = viewGroup;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                lx0 lx0Var = (lx0) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.d;
                PremiumPreviewFragment premiumPreviewFragment = lx0Var.n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != lx0Var.e) {
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + (childAt == lx0Var.c ? 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction) : 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction)));
                    }
                }
                break;
            default:
                kb1 kb1Var = (kb1) this.b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                org.telegram.ui.Components.ui uiVar = (org.telegram.ui.Components.ui) this.d;
                kb1Var.getClass();
                kb1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getEditField().setAlpha(kb1Var.a);
                uiVar.invalidate();
                break;
        }
    }
}
