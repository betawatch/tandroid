package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ep0 extends n61 {
    public final /* synthetic */ hp0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep0(hp0 hp0Var, dp0 dp0Var) {
        super(dp0Var);
        this.e = hp0Var;
    }

    @Override // org.telegram.ui.n61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.l0 = null;
    }
}
