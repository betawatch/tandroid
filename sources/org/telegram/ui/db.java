package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class db extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ ub o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(ub ubVar, cb cbVar) {
        super(cbVar, -2, -2);
        this.o = ubVar;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ub ubVar = this.o;
        if (ubVar.G0 != this) {
            return;
        }
        org.telegram.ui.Components.ic.e();
        ubVar.G0 = null;
    }
}
