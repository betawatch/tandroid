package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mi extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ org.telegram.ui.Components.gl0 o;
    public final /* synthetic */ wn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi(wn wnVar, fb fbVar, org.telegram.ui.Components.gl0 gl0Var) {
        super(fbVar, -2, -2);
        this.p = wnVar;
        this.o = gl0Var;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.gl0 gl0Var = this.o;
        if (gl0Var != null) {
            gl0Var.d(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        wn wnVar = this.p;
        if (wnVar.g9 != this) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
        org.telegram.ui.Components.qc qcVar2 = wnVar.z1;
        if (qcVar == qcVar2 && qcVar2 != null) {
            qcVar2.b();
            wnVar.z1 = null;
        }
        wnVar.g9 = null;
        wnVar.j9 = null;
        wnVar.i9 = null;
        wnVar.z0.R = true;
        if (wnVar.h9) {
            wnVar.p8(false, true, 0.0f);
        } else {
            wnVar.h9 = true;
        }
        jk jkVar = wnVar.Y;
        if (jkVar == null || jkVar.getEditField() == null) {
            return;
        }
        wnVar.Y.getEditField().setAllowDrawCursor(true);
    }
}
