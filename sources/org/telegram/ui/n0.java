package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n0 extends c8.fa {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ n0(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // c8.fa
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                if (z10) {
                    this.b.i0.h(false);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.u2 u2Var = this.b.J;
                if (u2Var != null) {
                    u2Var.E0 = z10;
                    break;
                }
                break;
        }
    }

    @Override // c8.fa
    public void b() {
        switch (this.a) {
            case 0:
                if (org.telegram.messenger.g0.H3()) {
                    org.telegram.messenger.i20.s(null, 2131744194, new org.telegram.ui.Components.cc(this.b.h0, null));
                    break;
                }
                break;
        }
    }
}
