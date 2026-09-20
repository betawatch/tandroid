package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class pi extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ org.telegram.ui.Components.pk0 o;
    public final /* synthetic */ zn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(zn znVar, eb ebVar, org.telegram.ui.Components.pk0 pk0Var) {
        super(ebVar, -2, -2);
        this.p = znVar;
        this.o = pk0Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.pk0 pk0Var = this.o;
        if (pk0Var != null) {
            pk0Var.d();
        }
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        zn znVar = this.p;
        if (znVar.Q8 != this) {
            return;
        }
        org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.w;
        org.telegram.ui.Components.pc pcVar2 = znVar.n1;
        if (pcVar == pcVar2 && pcVar2 != null) {
            pcVar2.b();
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
