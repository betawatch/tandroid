package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ii extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ org.telegram.ui.Components.gl0 o;
    public final /* synthetic */ sn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(sn snVar, eb ebVar, org.telegram.ui.Components.gl0 gl0Var) {
        super(ebVar, -2, -2);
        this.p = snVar;
        this.o = gl0Var;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.gl0 gl0Var = this.o;
        if (gl0Var != null) {
            gl0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        sn snVar = this.p;
        if (snVar.c9 != this) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        org.telegram.ui.Components.qc qcVar2 = snVar.z1;
        if (qcVar == qcVar2 && qcVar2 != null) {
            qcVar2.b();
            snVar.z1 = null;
        }
        snVar.c9 = null;
        snVar.f9 = null;
        snVar.e9 = null;
        snVar.z0.R = true;
        if (snVar.d9) {
            snVar.j8(false, true, 0.0f);
        } else {
            snVar.d9 = true;
        }
        gk gkVar = snVar.Y;
        if (gkVar == null || gkVar.getEditField() == null) {
            return;
        }
        snVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
