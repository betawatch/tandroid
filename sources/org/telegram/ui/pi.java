package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ org.telegram.ui.Components.pk0 o;
    public final /* synthetic */ zn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(zn znVar, cb cbVar, org.telegram.ui.Components.pk0 pk0Var) {
        super(cbVar, -2, -2);
        this.p = znVar;
        this.o = pk0Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void d(boolean z4) {
        super.d(true);
        org.telegram.ui.Components.pk0 pk0Var = this.o;
        if (pk0Var != null) {
            pk0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        zn znVar = this.p;
        if (znVar.N8 != this) {
            return;
        }
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.w;
        org.telegram.ui.Components.ic icVar2 = znVar.k1;
        if (icVar == icVar2 && icVar2 != null) {
            icVar2.b();
            znVar.k1 = null;
        }
        znVar.N8 = null;
        znVar.Q8 = null;
        znVar.P8 = null;
        znVar.w0.R = true;
        if (znVar.O8) {
            znVar.g8(false, true, 0.0f);
        } else {
            znVar.O8 = true;
        }
        lk lkVar = znVar.V;
        if (lkVar == null || lkVar.getEditField() == null) {
            return;
        }
        znVar.V.getEditField().setAllowDrawCursor(true);
    }
}
