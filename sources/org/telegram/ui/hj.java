package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hj extends org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ un o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj(un unVar, ej ejVar) {
        super(ejVar, -2, -2);
        this.o = unVar;
    }

    @Override // org.telegram.ui.ActionBar.k1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        un unVar = this.o;
        if (unVar.e9 != this) {
            return;
        }
        unVar.e9 = null;
        unVar.h9 = null;
        unVar.g9 = null;
        unVar.B0.R = true;
        if (unVar.f9) {
            unVar.o8(false, true, 0.0f);
        } else {
            unVar.f9 = true;
        }
        mk mkVar = unVar.Z;
        if (mkVar == null || mkVar.getEditField() == null) {
            return;
        }
        unVar.Z.getEditField().setAllowDrawCursor(true);
    }
}
