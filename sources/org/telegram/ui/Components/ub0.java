package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ub0 extends ln0 {
    public final /* synthetic */ ac0 d;

    public ub0(ac0 ac0Var) {
        this.d = ac0Var;
    }

    @Override // org.telegram.ui.Components.ln0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.ln0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.ln0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.ln0
    public final CharSequence d() {
        ac0 ac0Var = this.d;
        org.telegram.messenger.r20 r20Var = ac0Var.u0;
        return r20Var != null ? (CharSequence) r20Var.a(Integer.valueOf(ac0Var.H)) : ac0Var.d(ac0Var.H);
    }
}
