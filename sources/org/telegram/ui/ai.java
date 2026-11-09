package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ai extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ org.telegram.ui.Components.ji0 o;
    public final /* synthetic */ cn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(cn cnVar, xa xaVar, org.telegram.ui.Components.ji0 ji0Var) {
        super(xaVar, -2, -2);
        this.p = cnVar;
        this.o = ji0Var;
    }

    @Override // org.telegram.ui.ActionBar.g1
    public final void d(boolean z9) {
        super.d(z9);
        org.telegram.ui.Components.ji0 ji0Var = this.o;
        if (ji0Var != null) {
            ji0Var.d(z9);
        }
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        cn cnVar = this.p;
        if (cnVar.e9 != this) {
            return;
        }
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
        org.telegram.ui.Components.cc ccVar2 = cnVar.B1;
        if (ccVar == ccVar2 && ccVar2 != null) {
            ccVar2.b();
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
