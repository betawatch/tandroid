package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ s71(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t71 t71Var = (t71) this.b;
                t71Var.getClass();
                t71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t71Var.invalidate();
                break;
            case 1:
                z71 z71Var = (z71) this.b;
                z71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z71Var.b = floatValue;
                z71Var.setTranslationY(floatValue);
                break;
            default:
                t91 t91Var = (t91) this.b;
                t91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t91Var.setAnimationIdicatorProgress(floatValue2);
                s91 s91Var = t91Var.y;
                if (s91Var != null) {
                    ((jg.i) s91Var).e0(floatValue2);
                    break;
                }
                break;
        }
    }
}
