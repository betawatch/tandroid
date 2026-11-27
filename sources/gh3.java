// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gh3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;
    public final /* synthetic */ float c;

    public /* synthetic */ gh3(uj3 uj3Var, float f, byte b) {
        this.a = b;
        this.b = uj3Var;
        this.c = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.c;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.f4(f, valueAnimator);
                break;
            default:
                uj3Var.T3(f, valueAnimator);
                break;
        }
    }
}
