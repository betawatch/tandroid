package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ji extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ org.telegram.ui.Components.fl0 o;
    public final /* synthetic */ un p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji(un unVar, fb fbVar, org.telegram.ui.Components.fl0 fl0Var) {
        super(fbVar, -2, -2);
        this.p = unVar;
        this.o = fl0Var;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.fl0 fl0Var = this.o;
        if (fl0Var != null) {
            fl0Var.d(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        un unVar = this.p;
        if (unVar.c9 != this) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
        org.telegram.ui.Components.qc qcVar2 = unVar.z1;
        if (qcVar == qcVar2 && qcVar2 != null) {
            qcVar2.b();
            unVar.z1 = null;
        }
        unVar.c9 = null;
        unVar.f9 = null;
        unVar.e9 = null;
        unVar.z0.R = true;
        if (unVar.d9) {
            unVar.n8(false, true, 0.0f);
        } else {
            unVar.d9 = true;
        }
        hk hkVar = unVar.Y;
        if (hkVar == null || hkVar.getEditField() == null) {
            return;
        }
        unVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
