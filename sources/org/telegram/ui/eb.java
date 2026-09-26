package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class eb extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ub o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(ub ubVar, db dbVar) {
        super(dbVar, -2, -2);
        this.o = ubVar;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
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
