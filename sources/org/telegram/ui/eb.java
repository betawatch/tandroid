package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class eb extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ub o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(ub ubVar, db dbVar) {
        super(dbVar, -2, -2);
        this.o = ubVar;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ub ubVar = this.o;
        if (ubVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.qc.e();
        ubVar.F0 = null;
    }
}
