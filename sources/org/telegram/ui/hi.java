package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hi extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ org.telegram.ui.Components.wj0 o;
    public final /* synthetic */ rn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(rn rnVar, ya yaVar, org.telegram.ui.Components.wj0 wj0Var) {
        super(yaVar, -2, -2);
        this.p = rnVar;
        this.o = wj0Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.wj0 wj0Var = this.o;
        if (wj0Var != null) {
            wj0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        rn rnVar = this.p;
        if (rnVar.M8 != this) {
            return;
        }
        org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.w;
        org.telegram.ui.Components.ec ecVar2 = rnVar.j1;
        if (ecVar == ecVar2 && ecVar2 != null) {
            ecVar2.b();
            rnVar.j1 = null;
        }
        rnVar.M8 = null;
        rnVar.P8 = null;
        rnVar.O8 = null;
        rnVar.v0.R = true;
        if (rnVar.N8) {
            rnVar.g8(false, true, 0.0f);
        } else {
            rnVar.N8 = true;
        }
        ck ckVar = rnVar.U;
        if (ckVar == null || ckVar.getEditField() == null) {
            return;
        }
        rnVar.U.getEditField().setAllowDrawCursor(true);
    }
}
