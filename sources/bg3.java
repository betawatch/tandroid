// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class bg3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;
    public final /* synthetic */ float c;

    public /* synthetic */ bg3(cj3 cj3Var, float f, byte b) {
        this.a = b;
        this.b = cj3Var;
        this.c = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.c;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.c4(f, valueAnimator);
                break;
            default:
                cj3Var.Q3(f, valueAnimator);
                break;
        }
    }
}
