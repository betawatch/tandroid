package jg;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ f(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                jVar.g(org.telegram.messenger.i0.b2(jVar.L, jVar.i0, jVar.Q.getAnimatedFraction()));
                break;
            case 1:
                j jVar2 = this.b;
                jVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.n0 = floatValue;
                jVar2.setAlpha(floatValue);
                i iVar = jVar2.H;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.i(jVar2.n0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.i0.T1(0.9f, 1.0f, jVar2.j0));
                    jVar2.H.setScaleY(Utilities.i(jVar2.n0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.i0.T1(0.9f, 1.0f, jVar2.j0));
                    jVar2.H.setAlpha(Math.max(0.0f, jVar2.n0 - 0.8f) * jVar2.j0 * 5.0f);
                }
                jVar2.invalidate();
                break;
            case 2:
                j jVar3 = this.b;
                jVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.j0 = floatValue2;
                i iVar2 = jVar3.H;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.i(jVar3.n0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.i0.T1(0.9f, 1.0f, floatValue2));
                    jVar3.H.setScaleY(Utilities.i(jVar3.n0 * 1.25f, 1.0f, 0.0f) * org.telegram.messenger.i0.T1(0.9f, 1.0f, jVar3.j0));
                    jVar3.H.setAlpha(Math.max(0.0f, jVar3.n0 - 0.8f) * jVar3.j0 * 5.0f);
                    break;
                }
                break;
            case 3:
                this.b.k();
                break;
            case 4:
                this.b.k();
                break;
            default:
                j jVar4 = this.b;
                float b22 = org.telegram.messenger.i0.b2(jVar4.i0, jVar4.L, valueAnimator.getAnimatedFraction());
                jVar4.O = b22;
                jVar4.g(b22);
                break;
        }
    }
}
