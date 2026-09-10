package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class lj extends ch.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ eo r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj(eo eoVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.n = i11;
        this.r = eoVar;
    }

    @Override // ch.b, ch.a
    public final int x() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                eo eoVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                if (!dh.c.c(i10, eoVar.ea)) {
                    break;
                } else if (eoVar.ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                eo eoVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.p2) eoVar2).currentAccount;
                if (!dh.c.c(i11, eoVar2.ea)) {
                    break;
                } else if (eoVar2.ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
