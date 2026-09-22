package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ln0 b;

    public /* synthetic */ gn0(ln0 ln0Var, int i10) {
        this.a = i10;
        this.b = ln0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                ln0 ln0Var = this.b;
                ln0Var.c(true);
                ln0Var.Q.finishFragment();
                break;
            default:
                ln0 ln0Var2 = this.b;
                ln0Var2.c(true);
                ln0Var2.Q.K1(null, 0, true);
                break;
        }
    }
}
