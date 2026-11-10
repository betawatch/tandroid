package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ai extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ org.telegram.ui.Components.ii0 o;
    public final /* synthetic */ cn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(cn cnVar, xa xaVar, org.telegram.ui.Components.ii0 ii0Var) {
        super(xaVar, -2, -2);
        this.p = cnVar;
        this.o = ii0Var;
    }

    @Override // org.telegram.ui.ActionBar.g1
    public final void d(boolean z9) {
        super.d(z9);
        org.telegram.ui.Components.ii0 ii0Var = this.o;
        if (ii0Var != null) {
            ii0Var.d(z9);
        }
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        cn cnVar = this.p;
        if (cnVar.e9 != this) {
            return;
        }
        org.telegram.ui.Components.bc bcVar = org.telegram.ui.Components.bc.w;
        org.telegram.ui.Components.bc bcVar2 = cnVar.B1;
        if (bcVar == bcVar2 && bcVar2 != null) {
            bcVar2.b();
            cnVar.B1 = null;
        }
        cnVar.e9 = null;
        cnVar.j9 = null;
        cnVar.i9 = null;
        cnVar.B0.R = true;
        if (cnVar.f9) {
            cnVar.w8(false, true, 0.0f);
        } else {
            cnVar.f9 = true;
        }
        sj sjVar = cnVar.Z;
        if (sjVar == null || sjVar.getEditField() == null) {
            return;
        }
        cnVar.Z.getEditField().setAllowDrawCursor(true);
    }
}
