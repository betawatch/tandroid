package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ii extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ org.telegram.ui.Components.fk0 o;
    public final /* synthetic */ tn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(tn tnVar, wa waVar, org.telegram.ui.Components.fk0 fk0Var) {
        super(waVar, -2, -2);
        this.p = tnVar;
        this.o = fk0Var;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.fk0 fk0Var = this.o;
        if (fk0Var != null) {
            fk0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        tn tnVar = this.p;
        if (tnVar.M8 != this) {
            return;
        }
        org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.w;
        org.telegram.ui.Components.mc mcVar2 = tnVar.j1;
        if (mcVar == mcVar2 && mcVar2 != null) {
            mcVar2.b();
            tnVar.j1 = null;
        }
        tnVar.M8 = null;
        tnVar.P8 = null;
        tnVar.O8 = null;
        tnVar.v0.R = true;
        if (tnVar.N8) {
            tnVar.g8(false, true, 0.0f);
        } else {
            tnVar.N8 = true;
        }
        dk dkVar = tnVar.U;
        if (dkVar == null || dkVar.getEditField() == null) {
            return;
        }
        tnVar.U.getEditField().setAllowDrawCursor(true);
    }
}
