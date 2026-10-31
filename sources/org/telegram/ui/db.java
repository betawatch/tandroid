package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class db extends org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ sb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(sb sbVar, cb cbVar) {
        super(cbVar, -2, -2);
        this.o = sbVar;
    }

    @Override // org.telegram.ui.ActionBar.k1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        sb sbVar = this.o;
        if (sbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.wb.e();
        sbVar.F0 = null;
    }
}
