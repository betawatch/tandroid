package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class i40 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k40 b;

    public /* synthetic */ i40(k40 k40Var, int i10) {
        this.a = i10;
        this.b = k40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.tn tnVar;
        ai.u1 u1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k40 k40Var = this.b;
                k40Var.w = floatValue;
                k40Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                k40Var.e.setPadding(0, 0, 0, (int) (k40Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k40 k40Var2 = this.b;
                k40Var2.E = floatValue2;
                k40Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                k40Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, k40Var2.E));
                org.telegram.ui.bk bkVar = k40Var2.f;
                if (bkVar != null && (tnVar = bkVar.a) != null && (u1Var = tnVar.X3) != null) {
                    u1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
                    k40Var2.f.a.X3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, k40Var2.E));
                }
                k40Var2.h.setAlpha(k40Var2.E);
                break;
        }
    }
}
