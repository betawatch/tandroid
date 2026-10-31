package kg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;
    public final /* synthetic */ u c;

    public /* synthetic */ s(v vVar, u uVar, int i10) {
        this.a = i10;
        this.b = vVar;
        this.c = uVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                v vVar = this.b;
                vVar.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.invalidate();
                break;
            default:
                v vVar2 = this.b;
                vVar2.getClass();
                this.c.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar2.invalidate();
                break;
        }
    }
}
