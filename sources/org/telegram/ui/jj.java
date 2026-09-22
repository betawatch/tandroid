package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jj extends dh.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ bo r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj(bo boVar, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(i10, e6Var);
        this.n = i11;
        this.r = boVar;
    }

    @Override // dh.b, dh.a
    public final int H() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                bo boVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                if (!eh.b.c(i10, boVar.ea)) {
                    break;
                } else if (boVar.ea != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                bo boVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.n2) boVar2).currentAccount;
                if (!eh.b.c(i11, boVar2.ea)) {
                    break;
                } else if (boVar2.ea != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
