package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ me(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sn snVar = this.b;
                snVar.W8 = floatValue;
                km kmVar = snVar.j1;
                if (kmVar != null) {
                    kmVar.invalidate();
                    snVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                sn snVar2 = this.b;
                snVar2.getClass();
                snVar2.u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar2.sc();
                break;
            case 2:
                sn snVar3 = this.b;
                snVar3.getClass();
                snVar3.u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar3.sc();
                break;
            case 3:
                sn snVar4 = this.b;
                snVar4.getClass();
                snVar4.Qa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar4.t9();
                break;
            default:
                sn snVar5 = this.b;
                snVar5.getClass();
                snVar5.Qa = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                snVar5.t9();
                break;
        }
    }
}
