// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a0c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n0c b;

    public /* synthetic */ a0c(n0c n0cVar, byte b) {
        this.a = b;
        this.b = n0cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        n0c n0cVar = this.b;
        switch (b) {
            case 0:
                n0cVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0cVar.a0 = floatValue;
                qob qobVar = n0cVar.S;
                qobVar.setVisibility(floatValue > 0.0f ? 0 : 8);
                qobVar.setAlpha(floatValue);
                qobVar.setTranslationY((1.0f - floatValue) * (-hl.L(8.0f)));
                n0cVar.b(floatValue);
                int L = hl.L(100.0f) + hl.m + ((int) (hl.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) n0cVar.r.getLayoutParams()).topMargin = L;
                View view = n0cVar.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                n0cVar.h.requestLayout();
                break;
            default:
                n0cVar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
