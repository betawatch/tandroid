package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class pa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xa b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ pa(xa xaVar, float f7, float f10, int i10) {
        this.a = i10;
        this.b = xaVar;
        this.c = f7;
        this.d = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                xa xaVar = this.b;
                xaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar.setScrollY((int) AndroidUtilities.lerp(this.c, 0.0f, floatValue));
                wa waVar = xaVar.b0;
                waVar.w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                waVar.invalidate();
                break;
            default:
                xa xaVar2 = this.b;
                xaVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar2.setScrollY((int) AndroidUtilities.lerp(this.c, Math.min((xaVar2.getMeasuredHeight() - xaVar2.u0) - AndroidUtilities.dp(64.0f), xaVar2.r0.getBottom() - xaVar2.getMeasuredHeight()), floatValue2));
                wa waVar2 = xaVar2.b0;
                waVar2.w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                waVar2.invalidate();
                break;
        }
    }
}
