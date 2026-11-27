// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class if5 extends eva {
    public final /* synthetic */ lf5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if5(lf5 lf5Var, Context context) {
        super(context);
        this.r = lf5Var;
    }

    @Override // eva, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.b.setPaused(false);
    }

    @Override // eva, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.b.setPaused(true);
    }

    @Override // eva, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - hl.L(52.0f));
    }
}
