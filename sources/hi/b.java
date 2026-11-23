package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ b(e eVar, int i7) {
        this.a = i7;
        this.b = eVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                e eVar = this.b;
                eVar.getClass();
                eVar.U = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                eVar.invalidate();
                break;
            case 1:
                e eVar2 = this.b;
                eVar2.getClass();
                eVar2.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar2.invalidate();
                break;
            case 2:
                e eVar3 = this.b;
                eVar3.getClass();
                eVar3.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar3.invalidate();
                break;
            case 3:
                e eVar4 = this.b;
                eVar4.getClass();
                eVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar4.invalidate();
                break;
            default:
                e eVar5 = this.b;
                eVar5.getClass();
                eVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar5.invalidate();
                break;
        }
    }
}
