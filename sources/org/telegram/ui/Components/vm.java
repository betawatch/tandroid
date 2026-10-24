package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
