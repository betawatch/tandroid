package bg;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ g(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                kVar.g(AndroidUtilities.lerpAngle(kVar.H, kVar.e0, kVar.M.getAnimatedFraction()));
                break;
            case 1:
                k kVar2 = this.b;
                kVar2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar2.j0 = floatValue;
                kVar2.setAlpha(floatValue);
                j jVar = kVar2.D;
                if (jVar != null) {
                    jVar.setScaleX(Utilities.clamp(kVar2.j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar2.f0));
                    kVar2.D.setScaleY(Utilities.clamp(kVar2.j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar2.f0));
                    kVar2.D.setAlpha(Math.max(0.0f, kVar2.j0 - 0.8f) * kVar2.f0 * 5.0f);
                }
                kVar2.invalidate();
                break;
            case 2:
                k kVar3 = this.b;
                kVar3.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kVar3.f0 = floatValue2;
                j jVar2 = kVar3.D;
                if (jVar2 != null) {
                    jVar2.setScaleX(Utilities.clamp(kVar3.j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, floatValue2));
                    kVar3.D.setScaleY(Utilities.clamp(kVar3.j0 * 1.25f, 1.0f, 0.0f) * AndroidUtilities.lerp(0.9f, 1.0f, kVar3.f0));
                    kVar3.D.setAlpha(Math.max(0.0f, kVar3.j0 - 0.8f) * kVar3.f0 * 5.0f);
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
                k kVar4 = this.b;
                float lerpAngle = AndroidUtilities.lerpAngle(kVar4.e0, kVar4.H, valueAnimator.getAnimatedFraction());
                kVar4.K = lerpAngle;
                kVar4.g(lerpAngle);
                break;
        }
    }
}
