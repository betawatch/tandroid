package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class m30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q30 b;

    public /* synthetic */ m30(q30 q30Var, int i10) {
        this.a = i10;
        this.b = q30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q30 q30Var = this.b;
                q30Var.r.x = (int) floatValue;
                q30Var.h();
                o30 o30Var = q30Var.a;
                if (o30Var.getParent() != null) {
                    q30Var.n.updateViewLayout(o30Var, q30Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q30 q30Var2 = this.b;
                q30Var2.r.y = (int) floatValue2;
                o30 o30Var2 = q30Var2.a;
                if (o30Var2.getParent() != null) {
                    q30Var2.n.updateViewLayout(o30Var2, q30Var2.r);
                    break;
                }
                break;
        }
    }
}
