package bi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
