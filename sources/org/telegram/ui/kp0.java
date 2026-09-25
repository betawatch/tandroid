package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
