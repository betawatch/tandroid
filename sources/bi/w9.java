package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class w9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ w9(ea eaVar, float f7, float f10, int i10) {
        this.a = i10;
        this.b = eaVar;
        this.c = f7;
        this.d = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ea eaVar = this.b;
                eaVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar.setScrollY((int) AndroidUtilities.lerp(this.c, 0.0f, floatValue));
                da daVar = eaVar.b0;
                daVar.w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                daVar.invalidate();
                break;
            default:
                ea eaVar2 = this.b;
                eaVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eaVar2.setScrollY((int) AndroidUtilities.lerp(this.c, Math.min((eaVar2.getMeasuredHeight() - eaVar2.u0) - AndroidUtilities.dp(64.0f), eaVar2.r0.getBottom() - eaVar2.getMeasuredHeight()), floatValue2));
                da daVar2 = eaVar2.b0;
                daVar2.w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                daVar2.invalidate();
                break;
        }
    }
}
