package org.telegram.ui;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class kp0 extends r61 {
    public final /* synthetic */ np0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(np0 np0Var, jp0 jp0Var) {
        super(jp0Var);
        this.e = np0Var;
    }

    @Override // org.telegram.ui.r61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.o0 = null;
    }
}
