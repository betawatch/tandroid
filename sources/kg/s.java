package kg;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
