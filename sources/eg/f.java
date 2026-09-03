package eg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                jVar.g(AndroidUtilities.lerpAngle(jVar.I, jVar.f0, jVar.N.getAnimatedFraction()));
                break;
            case 1:
                j jVar2 = this.b;
                jVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar2.k0 = floatValue;
                jVar2.setAlpha(floatValue);
                i iVar = jVar2.E;
                if (iVar != null) {
                    iVar.setScaleX(Utilities.clamp(jVar2.k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.g0));
                    jVar2.E.setScaleY(Utilities.clamp(jVar2.k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar2.g0));
                    jVar2.E.setAlpha(Math.max(0.0f, jVar2.k0 - 0.8f) * jVar2.g0 * 5.0f);
                }
                jVar2.invalidate();
                break;
            case 2:
                j jVar3 = this.b;
                jVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jVar3.g0 = floatValue2;
                i iVar2 = jVar3.E;
                if (iVar2 != null) {
                    iVar2.setScaleX(Utilities.clamp(jVar3.k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, floatValue2));
                    jVar3.E.setScaleY(Utilities.clamp(jVar3.k0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, jVar3.g0));
                    jVar3.E.setAlpha(Math.max(0.0f, jVar3.k0 - 0.8f) * jVar3.g0 * 5.0f);
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
                float lerpAngle = AndroidUtilities.lerpAngle(jVar4.f0, jVar4.I, valueAnimator.getAnimatedFraction());
                jVar4.L = lerpAngle;
                jVar4.g(lerpAngle);
                break;
        }
    }
}
