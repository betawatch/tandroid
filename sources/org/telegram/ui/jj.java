package org.telegram.ui;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class jj extends eh.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ co r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj(co coVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.n = i11;
        this.r = coVar;
    }

    @Override // eh.b, eh.a
    public final int k0() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                co coVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                if (!fh.b.c(i10, coVar.ea)) {
                    break;
                } else if (coVar.ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                co coVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.n2) coVar2).currentAccount;
                if (!fh.b.c(i11, coVar2.ea)) {
                    break;
                } else if (coVar2.ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
