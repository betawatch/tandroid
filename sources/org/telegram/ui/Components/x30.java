package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z30 b;

    public /* synthetic */ x30(z30 z30Var, int i10) {
        this.a = i10;
        this.b = z30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.un unVar;
        jh.e1 e1Var;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z30 z30Var = this.b;
                z30Var.w = floatValue;
                z30Var.e.setTranslationY(floatValue * AndroidUtilities.dp(48.0f));
                z30Var.e.setPadding(0, 0, 0, (int) (z30Var.w * AndroidUtilities.dp(48.0f)));
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z30 z30Var2 = this.b;
                z30Var2.A = floatValue2;
                z30Var2.n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, floatValue2));
                z30Var2.n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, z30Var2.A));
                org.telegram.ui.zj zjVar = z30Var2.f;
                if (zjVar != null && (unVar = zjVar.a) != null && (e1Var = unVar.H3) != null) {
                    e1Var.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, z30Var2.A));
                    z30Var2.f.a.H3.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, z30Var2.A));
                }
                z30Var2.h.setAlpha(z30Var2.A);
                break;
        }
    }
}
