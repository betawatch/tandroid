package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jj extends wg.b {
    public final /* synthetic */ int s;
    public final /* synthetic */ un w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj(un unVar, org.telegram.ui.ActionBar.p6 p6Var, int i10, int i11) {
        super(i10, p6Var);
        this.s = i11;
        this.w = unVar;
    }

    @Override // wg.b, wg.a
    public final int n0() {
        int i10;
        int i11;
        switch (this.s) {
            case 0:
                un unVar = this.w;
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                if (!w7.b9.c(i10, unVar.xa)) {
                    return i0.b.o(unVar.getThemedColor(org.telegram.ui.ActionBar.t6.Ge), org.telegram.messenger.zs.e4);
                }
                sn snVar = unVar.xa;
                if (snVar == null || snVar.a()) {
                    a();
                    return this.d;
                }
                a();
                return i0.b.o(this.d, org.telegram.messenger.zs.t3);
            case 1:
                return this.w.x.n0();
            default:
                un unVar2 = this.w;
                i11 = ((org.telegram.ui.ActionBar.k2) unVar2).currentAccount;
                if (!w7.b9.c(i11, unVar2.xa)) {
                    return i0.b.o(unVar2.getThemedColor(org.telegram.ui.ActionBar.t6.d6), org.telegram.messenger.zs.e4);
                }
                sn snVar2 = unVar2.xa;
                if (snVar2 == null || snVar2.a()) {
                    a();
                    return this.d;
                }
                a();
                return i0.b.o(this.d, org.telegram.messenger.zs.t3);
        }
    }
}
