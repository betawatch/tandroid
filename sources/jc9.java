// default package

import android.animation.ValueAnimator;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jc9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nd9 b;

    public /* synthetic */ jc9(nd9 nd9Var, byte b) {
        this.a = b;
        this.b = nd9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        nd9 nd9Var = this.b;
        switch (b) {
            case 0:
                nd9Var.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nd9Var.t0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nd9Var.U = floatValue;
                nd9Var.S.setAlpha(floatValue);
                nd9Var.S.setScaleX(hl.R1(0.6f, 1.0f, floatValue));
                nd9Var.S.setScaleY(hl.R1(0.6f, 1.0f, floatValue));
                nd9Var.S.setVisibility(floatValue > 0.0f ? 0 : 4);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nd9Var.S.getLayoutParams();
                layoutParams.rightMargin = hl.U1(floatValue, -nd9Var.S.getMeasuredWidth(), hl.L(-4.0f));
                nd9Var.S.setLayoutParams(layoutParams);
                break;
        }
    }
}
