// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dk7 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ ck7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ kk7 c;

    public dk7(kk7 kk7Var, ck7 ck7Var, int i) {
        this.c = kk7Var;
        this.a = ck7Var;
        this.b = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.c.a(this.a, this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.c.n(this.a, this.b);
    }
}
