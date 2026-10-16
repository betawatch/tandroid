package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class m40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o40 b;

    public /* synthetic */ m40(o40 o40Var, int i10) {
        this.a = i10;
        this.b = o40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.go goVar;
        bi.o0 o0Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o40 o40Var = this.b;
                o40Var.w = floatValue;
                o40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                o40Var.e.setPadding(0, 0, 0, (int) (o40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o40 o40Var2 = this.b;
                o40Var2.E = floatValue2;
                o40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                o40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, o40Var2.E));
                org.telegram.ui.nk nkVar = o40Var2.f;
                if (nkVar != null && (goVar = nkVar.a) != null && (o0Var = goVar.L3) != null) {
                    o0Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, o40Var2.E));
                    o40Var2.f.a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, o40Var2.E));
                }
                o40Var2.h.setAlpha(o40Var2.E);
                break;
        }
    }
}
