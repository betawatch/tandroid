package kg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ d(h hVar, int i10) {
        this.a = i10;
        this.b = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar = this.b;
                hVar.j0 = floatValue;
                hVar.H = true;
                hVar.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar2 = this.b;
                hVar2.k0 = floatValue2;
                hVar2.H = true;
                hVar2.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h hVar3 = this.b;
                hVar3.v0 = floatValue3;
                hVar3.t0.setAlpha(hVar3.v0);
                hVar3.invalidate();
                break;
        }
    }
}
