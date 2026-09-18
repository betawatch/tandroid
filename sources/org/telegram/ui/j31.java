package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class j31 extends x61 {
    public final /* synthetic */ l31 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j31(l31 l31Var, i31 i31Var) {
        super(i31Var);
        this.e = l31Var;
    }

    @Override // org.telegram.ui.x61, android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        this.e.n = null;
    }
}
