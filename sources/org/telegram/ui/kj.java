package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class kj extends dh.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ zn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj(zn znVar, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(i10, e6Var);
        this.n = i11;
        this.r = znVar;
    }

    @Override // dh.b, dh.a
    public final int x() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                zn znVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                if (!eh.b.c(i10, znVar.ea)) {
                    break;
                } else if (znVar.ea != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                zn znVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.n2) znVar2).currentAccount;
                if (!eh.b.c(i11, znVar2.ea)) {
                    break;
                } else if (znVar2.ea != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
