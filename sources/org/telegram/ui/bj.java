package org.telegram.ui;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class bj extends eh.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ qn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj(qn qnVar, org.telegram.ui.ActionBar.d6 d6Var, int i10, int i11) {
        super(i10, d6Var);
        this.n = i11;
        this.r = qnVar;
    }

    @Override // eh.b, eh.a
    public final int a0() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                qn qnVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                if (!fh.c.c(i10, qnVar.ea)) {
                    break;
                } else if (qnVar.ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                qn qnVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.n2) qnVar2).currentAccount;
                if (!fh.c.c(i11, qnVar2.ea)) {
                    break;
                } else if (qnVar2.ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
