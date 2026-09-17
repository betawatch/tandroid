package ah;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ x0 c;

    public /* synthetic */ a(c cVar, x0 x0Var, int i10) {
        this.a = i10;
        this.b = cVar;
        this.c = x0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.c.invalidate();
                break;
            default:
                this.b.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.c.invalidate();
                break;
        }
    }
}
