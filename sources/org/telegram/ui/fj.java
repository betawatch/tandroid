package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fj extends fh.b {
    public final /* synthetic */ int r;
    public final /* synthetic */ wn s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj(wn wnVar, org.telegram.ui.ActionBar.u6 u6Var, int i10, int i11) {
        super(i10, u6Var);
        this.r = i11;
        this.s = wnVar;
    }

    @Override // fh.b, fh.a
    public final int v0() {
        int i10;
        int i11;
        switch (this.r) {
            case 0:
                wn wnVar = this.s;
                i10 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                if (!gh.c.c(i10, wnVar.ua)) {
                    break;
                } else {
                    un unVar = wnVar.ua;
                    if (unVar != null && !unVar.a()) {
                        a();
                        break;
                    } else {
                        a();
                        break;
                    }
                }
                break;
            default:
                wn wnVar2 = this.s;
                i11 = ((org.telegram.ui.ActionBar.r2) wnVar2).currentAccount;
                if (!gh.c.c(i11, wnVar2.ua)) {
                    break;
                } else {
                    un unVar2 = wnVar2.ua;
                    if (unVar2 != null && !unVar2.a()) {
                        a();
                        break;
                    } else {
                        a();
                        break;
                    }
                }
                break;
        }
        return this.d;
    }
}
