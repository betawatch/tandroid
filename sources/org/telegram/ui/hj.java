package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hj extends qg.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ zn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj(zn znVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.n = i11;
        this.r = znVar;
    }

    @Override // qg.b, qg.a
    public final int m0() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                zn znVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                if (!rg.b.c(i10, znVar.ba)) {
                    break;
                } else if (znVar.ba != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                zn znVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.p2) znVar2).currentAccount;
                if (!rg.b.c(i11, znVar2.ba)) {
                    break;
                } else if (znVar2.ba != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
