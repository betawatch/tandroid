package bi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
