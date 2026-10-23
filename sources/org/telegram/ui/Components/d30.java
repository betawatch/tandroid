package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class d30 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i30 b;

    public /* synthetic */ d30(i30 i30Var, int i10) {
        this.a = i10;
        this.b = i30Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i30 i30Var = this.b;
                i30Var.r.x = (int) floatValue;
                i30Var.h();
                f30 f30Var = i30Var.a;
                if (f30Var.getParent() != null) {
                    i30Var.n.updateViewLayout(f30Var, i30Var.r);
                    break;
                }
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i30 i30Var2 = this.b;
                i30Var2.r.y = (int) floatValue2;
                f30 f30Var2 = i30Var2.a;
                if (f30Var2.getParent() != null) {
                    i30Var2.n.updateViewLayout(f30Var2, i30Var2.r);
                    break;
                }
                break;
        }
    }
}
