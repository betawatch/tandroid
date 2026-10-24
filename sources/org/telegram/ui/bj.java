package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class bj extends eh.b {
    public final /* synthetic */ int r;
    public final /* synthetic */ sn s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj(sn snVar, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11) {
        super(i10, g6Var);
        this.r = i11;
        this.s = snVar;
    }

    @Override // eh.b, eh.a
    public final int a0() {
        int i10;
        int i11;
        switch (this.r) {
            case 0:
                sn snVar = this.s;
                i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                if (!fh.c.c(i10, snVar.qa)) {
                    break;
                } else {
                    qn qnVar = snVar.qa;
                    if (qnVar != null && !qnVar.a()) {
                        a();
                        break;
                    } else {
                        a();
                        break;
                    }
                }
                break;
            default:
                sn snVar2 = this.s;
                i11 = ((org.telegram.ui.ActionBar.o2) snVar2).currentAccount;
                if (!fh.c.c(i11, snVar2.qa)) {
                    break;
                } else {
                    qn qnVar2 = snVar2.qa;
                    if (qnVar2 != null && !qnVar2.a()) {
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
