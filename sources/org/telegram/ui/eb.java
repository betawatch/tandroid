package org.telegram.ui;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
        if (ubVar.J0 != this) {
            return;
        }
        org.telegram.ui.Components.qc.e();
        ubVar.J0 = null;
    }
}
