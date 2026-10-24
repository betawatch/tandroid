package jg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ d(g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.b;
                gVar.j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.b;
                gVar2.k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.b;
                gVar3.v0 = floatValue3;
                gVar3.t0.setAlpha(gVar3.v0);
                gVar3.invalidate();
                break;
        }
    }
}
