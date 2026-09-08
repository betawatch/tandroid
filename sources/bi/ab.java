package bi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class ab implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ db b;

    public /* synthetic */ ab(db dbVar, int i10) {
        this.a = i10;
        this.b = dbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pb pbVar = this.b.I0;
                pbVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb.k(pbVar);
                break;
            default:
                pb pbVar2 = this.b.I0;
                pbVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pb.k(pbVar2);
                break;
        }
    }
}
