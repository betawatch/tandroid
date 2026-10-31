package bg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ d(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i iVar = this.b;
                iVar.j0 = floatValue;
                iVar.H = true;
                iVar.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i iVar2 = this.b;
                iVar2.k0 = floatValue2;
                iVar2.H = true;
                iVar2.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i iVar3 = this.b;
                iVar3.v0 = floatValue3;
                iVar3.t0.setAlpha(iVar3.v0);
                iVar3.invalidate();
                break;
        }
    }
}
