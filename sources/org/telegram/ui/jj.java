package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class jj extends dh.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ zn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj(zn znVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.n = i11;
        this.r = znVar;
    }

    @Override // dh.b, dh.a
    public final int H() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                zn znVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                if (!eh.b.c(i10, znVar.ea)) {
                    break;
                } else if (znVar.ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                zn znVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.n2) znVar2).currentAccount;
                if (!eh.b.c(i11, znVar2.ea)) {
                    break;
                } else if (znVar2.ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
