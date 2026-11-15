package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cb0 extends om0 {
    public final /* synthetic */ ib0 d;

    public cb0(ib0 ib0Var) {
        this.d = ib0Var;
    }

    @Override // org.telegram.ui.Components.om0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.om0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.om0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.om0
    public final CharSequence d() {
        ib0 ib0Var = this.d;
        org.telegram.messenger.a20 a20Var = ib0Var.v0;
        return a20Var != null ? (CharSequence) a20Var.a(Integer.valueOf(ib0Var.I)) : ib0Var.d(ib0Var.I);
    }
}
