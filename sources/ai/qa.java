package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ qa(ya yaVar, float f7, float f10, int i10) {
        this.a = i10;
        this.b = yaVar;
        this.c = f7;
        this.d = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ya yaVar = this.b;
                yaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yaVar.setScrollY((int) AndroidUtilities.lerp(this.c, 0.0f, floatValue));
                xa xaVar = yaVar.b0;
                xaVar.w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                xaVar.invalidate();
                break;
            default:
                ya yaVar2 = this.b;
                yaVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yaVar2.setScrollY((int) AndroidUtilities.lerp(this.c, Math.min((yaVar2.getMeasuredHeight() - yaVar2.u0) - AndroidUtilities.dp(64.0f), yaVar2.r0.getBottom() - yaVar2.getMeasuredHeight()), floatValue2));
                xa xaVar2 = yaVar2.b0;
                xaVar2.w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                xaVar2.invalidate();
                break;
        }
    }
}
