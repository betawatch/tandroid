package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class oj extends eh.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ fo r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj(fo foVar, org.telegram.ui.ActionBar.c6 c6Var, int i10, int i11) {
        super(i10, c6Var);
        this.n = i11;
        this.r = foVar;
    }

    @Override // eh.b, eh.a
    public final int b0() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                fo foVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                if (!fh.b.c(i10, foVar.ea)) {
                    break;
                } else if (foVar.ea != null && !org.telegram.ui.ActionBar.g6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                fo foVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.m2) foVar2).currentAccount;
                if (!fh.b.c(i11, foVar2.ea)) {
                    break;
                } else if (foVar2.ea != null && !org.telegram.ui.ActionBar.g6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
