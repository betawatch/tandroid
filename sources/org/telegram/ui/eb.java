package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        org.telegram.ui.Components.oc.e();
        ubVar.F0 = null;
    }
}
