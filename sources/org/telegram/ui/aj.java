package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class aj extends og.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ tn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj(tn tnVar, org.telegram.ui.ActionBar.c6 c6Var, int i10, int i11) {
        super(i10, c6Var);
        this.n = i11;
        this.r = tnVar;
    }

    @Override // og.b, og.a
    public final int z() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                tn tnVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                if (!pg.a.c(i10, tnVar.aa)) {
                    break;
                } else if (tnVar.aa != null && !org.telegram.ui.ActionBar.g6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                tn tnVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.o2) tnVar2).currentAccount;
                if (!pg.a.c(i11, tnVar2.aa)) {
                    break;
                } else if (tnVar2.aa != null && !org.telegram.ui.ActionBar.g6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
