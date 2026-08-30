package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class fj extends qg.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ xn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj(xn xnVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.n = i11;
        this.r = xnVar;
    }

    @Override // qg.b, qg.a
    public final int D2() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                xn xnVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                if (!rg.b.c(i10, xnVar.ba)) {
                    break;
                } else if (xnVar.ba != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                xn xnVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar2).currentAccount;
                if (!rg.b.c(i11, xnVar2.ba)) {
                    break;
                } else if (xnVar2.ba != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
