package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class cm0 extends j11 {
    public final /* synthetic */ fm0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm0(fm0 fm0Var, bm0 bm0Var) {
        super(bm0Var);
        this.e = fm0Var;
    }

    @Override // org.telegram.ui.j11, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.p0 = null;
    }
}
