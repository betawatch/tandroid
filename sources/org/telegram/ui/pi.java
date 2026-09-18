package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ org.telegram.ui.Components.qk0 o;
    public final /* synthetic */ zn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(zn znVar, eb ebVar, org.telegram.ui.Components.qk0 qk0Var) {
        super(ebVar, -2, -2);
        this.p = znVar;
        this.o = qk0Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.qk0 qk0Var = this.o;
        if (qk0Var != null) {
            qk0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        zn znVar = this.p;
        if (znVar.Q8 != this) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        org.telegram.ui.Components.qc qcVar2 = znVar.n1;
        if (qcVar == qcVar2 && qcVar2 != null) {
            qcVar2.b();
            znVar.n1 = null;
        }
        znVar.Q8 = null;
        znVar.T8 = null;
        znVar.S8 = null;
        znVar.z0.R = true;
        if (znVar.R8) {
            znVar.g8(false, true, 0.0f);
        } else {
            znVar.R8 = true;
        }
        lk lkVar = znVar.Y;
        if (lkVar == null || lkVar.getEditField() == null) {
            return;
        }
        znVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
