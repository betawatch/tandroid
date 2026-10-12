package bi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class db implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;

    public /* synthetic */ db(gb gbVar, int i10) {
        this.a = i10;
        this.b = gbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sb sbVar = this.b.I0;
                sbVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb.k(sbVar);
                break;
            default:
                sb sbVar2 = this.b.I0;
                sbVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb.k(sbVar2);
                break;
        }
    }
}
