package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ub0 extends mn0 {
    public final /* synthetic */ ac0 d;

    public ub0(ac0 ac0Var) {
        this.d = ac0Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public final boolean a() {
        return true;
    }

    @Override // org.telegram.ui.Components.mn0
    public final boolean b() {
        return true;
    }

    @Override // org.telegram.ui.Components.mn0
    public final void c(boolean z10) {
        this.d.a(!z10);
    }

    @Override // org.telegram.ui.Components.mn0
    public final CharSequence d() {
        ac0 ac0Var = this.d;
        org.telegram.messenger.s20 s20Var = ac0Var.u0;
        return s20Var != null ? (CharSequence) s20Var.a(Integer.valueOf(ac0Var.H)) : ac0Var.d(ac0Var.H);
    }
}
