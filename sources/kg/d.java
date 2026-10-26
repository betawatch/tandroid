package kg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
