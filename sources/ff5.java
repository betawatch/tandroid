// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ff5 extends dta {
    public final /* synthetic */ if5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff5(if5 if5Var, Context context) {
        super(context);
        this.r = if5Var;
    }

    @Override // dta, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.b.setPaused(false);
    }

    @Override // dta, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.b.setPaused(true);
    }

    @Override // dta, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gm.L(52.0f));
    }
}
