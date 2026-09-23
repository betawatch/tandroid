package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gj extends dh.b {
    public final /* synthetic */ int n;
    public final /* synthetic */ xn r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj(xn xnVar, org.telegram.ui.ActionBar.d6 d6Var, int i10, int i11) {
        super(i10, d6Var);
        this.n = i11;
        this.r = xnVar;
    }

    @Override // dh.b, dh.a
    public final int H() {
        int i10;
        int i11;
        switch (this.n) {
            case 0:
                xn xnVar = this.r;
                i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                if (!eh.b.c(i10, xnVar.ea)) {
                    break;
                } else if (xnVar.ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
            default:
                xn xnVar2 = this.r;
                i11 = ((org.telegram.ui.ActionBar.n2) xnVar2).currentAccount;
                if (!eh.b.c(i11, xnVar2.ea)) {
                    break;
                } else if (xnVar2.ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return this.d;
    }
}
