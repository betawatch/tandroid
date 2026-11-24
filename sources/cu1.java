// default package

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cu1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ du1 b;

    public /* synthetic */ cu1(du1 du1Var, byte b) {
        this.a = b;
        this.b = du1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        du1 du1Var = this.b;
        switch (b) {
            case 0:
                du1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = du1Var.b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                du1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view2 = du1Var.b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                du1Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view3 = du1Var.b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
