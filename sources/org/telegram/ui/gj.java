package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class gj extends dh.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ wn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj(wn wnVar, org.telegram.ui.ActionBar.d6 d6Var, int i10, int i11) {
        super(i10, d6Var);
        this.n = i11;
        this.r = wnVar;
    }

    @Override // dh.b, dh.a
    public final int H() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                wn wnVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                if (!eh.b.c(i10, wnVar.ea)) {
                    break;
                } else if (wnVar.ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                wn wnVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.m2) wnVar2).currentAccount;
                if (!eh.b.c(i11, wnVar2.ea)) {
                    break;
                } else if (wnVar2.ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
