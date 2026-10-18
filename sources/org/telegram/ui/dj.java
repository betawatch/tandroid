package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class dj extends eh.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ sn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj(sn snVar, org.telegram.ui.ActionBar.d6 d6Var, int i10, int i11) {
        super(i10, d6Var);
        this.n = i11;
        this.r = snVar;
    }

    @Override // eh.b, eh.a
    public final int a0() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                sn snVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                if (!fh.c.c(i10, snVar.ea)) {
                    break;
                } else if (snVar.ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                sn snVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.n2) snVar2).currentAccount;
                if (!fh.c.c(i11, snVar2.ea)) {
                    break;
                } else if (snVar2.ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
