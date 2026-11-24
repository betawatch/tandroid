// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hd5 extends cra {
    public final /* synthetic */ kd5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd5(kd5 kd5Var, Context context) {
        super(context);
        this.r = kd5Var;
    }

    @Override // cra, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.b.setPaused(false);
    }

    @Override // cra, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.b.setPaused(true);
    }

    @Override // cra, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(52.0f));
    }
}
