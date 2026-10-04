package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class hj extends dh.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ yn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj(yn ynVar, org.telegram.ui.ActionBar.d6 d6Var, int i10, int i11) {
        super(i10, d6Var);
        this.n = i11;
        this.r = ynVar;
    }

    @Override // dh.b, dh.a
    public final int B() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                yn ynVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                if (!eh.b.c(i10, ynVar.ca)) {
                    break;
                } else if (ynVar.ca != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                yn ynVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.n2) ynVar2).currentAccount;
                if (!eh.b.c(i11, ynVar2.ca)) {
                    break;
                } else if (ynVar2.ca != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
