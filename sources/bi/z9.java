package bi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class z9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ha b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ z9(ha haVar, float f7, float f10, int i10) {
        this.a = i10;
        this.b = haVar;
        this.c = f7;
        this.d = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ha haVar = this.b;
                haVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                haVar.setScrollY((int) AndroidUtilities.lerp(this.c, 0.0f, floatValue));
                ga gaVar = haVar.b0;
                gaVar.w = AndroidUtilities.lerp(this.d, 0.0f, floatValue);
                gaVar.invalidate();
                break;
            default:
                ha haVar2 = this.b;
                haVar2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                haVar2.setScrollY((int) AndroidUtilities.lerp(this.c, Math.min((haVar2.getMeasuredHeight() - haVar2.u0) - AndroidUtilities.dp(64.0f), haVar2.r0.getBottom() - haVar2.getMeasuredHeight()), floatValue2));
                ga gaVar2 = haVar2.b0;
                gaVar2.w = AndroidUtilities.lerp(this.d, 1.0f, floatValue2);
                gaVar2.invalidate();
                break;
        }
    }
}
