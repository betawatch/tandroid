package eg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;
    public final /* synthetic */ v c;

    public /* synthetic */ t(w wVar, v vVar, int i10) {
        this.a = i10;
        this.b = wVar;
        this.c = vVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                w wVar = this.b;
                wVar.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.invalidate();
                break;
            default:
                w wVar2 = this.b;
                wVar2.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar2.invalidate();
                break;
        }
    }
}
