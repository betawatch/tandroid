package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ k51(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                m51 m51Var = (m51) this.b;
                m51Var.getClass();
                m51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m51Var.invalidate();
                break;
            case 1:
                b71 b71Var = (b71) this.b;
                b71Var.getClass();
                b71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b71Var.invalidate();
                break;
            case 2:
                h71 h71Var = (h71) this.b;
                h71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h71Var.b = floatValue;
                h71Var.setTranslationY(floatValue);
                break;
            default:
                b91 b91Var = (b91) this.b;
                b91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b91Var.setAnimationIdicatorProgress(floatValue2);
                a91 a91Var = b91Var.y;
                if (a91Var != null) {
                    ((l2.f) a91Var).z(floatValue2);
                    break;
                }
                break;
        }
    }
}
