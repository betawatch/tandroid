package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;

    public /* synthetic */ vm(an anVar, int i10) {
        this.a = i10;
        this.b = anVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                an anVar = this.b;
                anVar.getClass();
                anVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar.invalidate();
                break;
            default:
                an anVar2 = this.b;
                anVar2.getClass();
                anVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                anVar2.invalidate();
                break;
        }
    }
}
