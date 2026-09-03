package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class fj extends rg.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ xn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj(xn xnVar, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11) {
        super(i10, g6Var);
        this.n = i11;
        this.r = xnVar;
    }

    @Override // rg.b, rg.a
    public final int U() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                xn xnVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                if (!sg.b.c(i10, xnVar.ba)) {
                    break;
                } else if (xnVar.ba != null && !org.telegram.ui.ActionBar.k6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                xn xnVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar2).currentAccount;
                if (!sg.b.c(i11, xnVar2.ba)) {
                    break;
                } else if (xnVar2.ba != null && !org.telegram.ui.ActionBar.k6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
