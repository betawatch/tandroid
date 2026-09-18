package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class kj extends dh.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ bo r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj(bo boVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.n = i11;
        this.r = boVar;
    }

    @Override // dh.b, dh.a
    public final int H() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                bo boVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                if (!eh.b.c(i10, boVar.ea)) {
                    break;
                } else if (boVar.ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                bo boVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.o2) boVar2).currentAccount;
                if (!eh.b.c(i11, boVar2.ea)) {
                    break;
                } else if (boVar2.ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
