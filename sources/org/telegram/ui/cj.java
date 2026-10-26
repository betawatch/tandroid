package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cj extends fh.b {
    public final /* synthetic */ int r;
    public final /* synthetic */ un s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj(un unVar, org.telegram.ui.ActionBar.u6 u6Var, int i10, int i11) {
        super(i10, u6Var);
        this.r = i11;
        this.s = unVar;
    }

    @Override // fh.b, fh.a
    public final int v0() {
        int i10;
        int i11;
        switch (this.r) {
            case 0:
                un unVar = this.s;
                i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                if (!gh.c.c(i10, unVar.qa)) {
                    break;
                } else {
                    sn snVar = unVar.qa;
                    if (snVar != null && !snVar.a()) {
                        a();
                        break;
                    } else {
                        a();
                        break;
                    }
                }
                break;
            default:
                un unVar2 = this.s;
                i11 = ((org.telegram.ui.ActionBar.r2) unVar2).currentAccount;
                if (!gh.c.c(i11, unVar2.qa)) {
                    break;
                } else {
                    sn snVar2 = unVar2.qa;
                    if (snVar2 != null && !snVar2.a()) {
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
