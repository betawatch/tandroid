package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aw0(Object obj, ViewGroup viewGroup, Object obj2, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = viewGroup;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                fw0 fw0Var = (fw0) this.b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.d;
                PremiumPreviewFragment premiumPreviewFragment = fw0Var.n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                for (int i9 = 0; i9 < premiumPreviewFragment.Q.getChildCount(); i9++) {
                    View childAt = premiumPreviewFragment.Q.getChildAt(i9);
                    if (childAt != fw0Var.e) {
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + (childAt == fw0Var.c ? 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction) : 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction)));
                    }
                }
                break;
            default:
                ca1 ca1Var = (ca1) this.b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                org.telegram.ui.Components.ji jiVar = (org.telegram.ui.Components.ji) this.d;
                ca1Var.getClass();
                ca1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getEditField().setAlpha(ca1Var.a);
                jiVar.invalidate();
                break;
        }
    }
}
