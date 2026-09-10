package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l40 b;

    public /* synthetic */ j40(l40 l40Var, int i10) {
        this.a = i10;
        this.b = l40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.fo foVar;
        bi.y1 y1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l40 l40Var = this.b;
                l40Var.w = floatValue;
                l40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                l40Var.e.setPadding(0, 0, 0, (int) (l40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l40 l40Var2 = this.b;
                l40Var2.E = floatValue2;
                l40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                l40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, l40Var2.E));
                org.telegram.ui.kk kkVar = l40Var2.f;
                if (kkVar != null && (foVar = kkVar.a) != null && (y1Var = foVar.L3) != null) {
                    y1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, l40Var2.E));
                    l40Var2.f.a.L3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, l40Var2.E));
                }
                l40Var2.h.setAlpha(l40Var2.E);
                break;
        }
    }
}
