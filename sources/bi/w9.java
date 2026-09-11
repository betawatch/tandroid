package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
