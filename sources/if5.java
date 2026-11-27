// default package

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
