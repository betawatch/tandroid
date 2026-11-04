package ei;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ z7(h8 h8Var, float f10, float f11, int i3) {
        this.a = i3;
        this.b = h8Var;
        this.c = f10;
        this.d = f11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                h8 h8Var = this.b;
                h8Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var.setScrollY((int) org.telegram.messenger.g0.T1(this.c, 0.0f, floatValue));
                g8 g8Var = h8Var.c0;
                g8Var.x = org.telegram.messenger.g0.T1(this.d, 0.0f, floatValue);
                g8Var.invalidate();
                break;
            default:
                h8 h8Var2 = this.b;
                h8Var2.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var2.setScrollY((int) org.telegram.messenger.g0.T1(this.c, Math.min((h8Var2.getMeasuredHeight() - h8Var2.v0) - org.telegram.messenger.g0.L(64.0f), h8Var2.s0.getBottom() - h8Var2.getMeasuredHeight()), floatValue2));
                g8 g8Var2 = h8Var2.c0;
                g8Var2.x = org.telegram.messenger.g0.T1(this.d, 1.0f, floatValue2);
                g8Var2.invalidate();
                break;
        }
    }
}
