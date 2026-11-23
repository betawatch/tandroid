package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mq implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.gu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nq b;

    public /* synthetic */ mq(nq nqVar, int i7) {
        this.a = i7;
        this.b = nqVar;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean b(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        rq rqVar = this.b.d;
        return rqVar.m0(rqVar.a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override // org.telegram.ui.Components.gu0
    public void k(int i7) {
        switch (this.a) {
            case 1:
                rq rqVar = this.b.d;
                if (rqVar.r != null) {
                    int i10 = rqVar.p1;
                    boolean z10 = (i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0);
                    rqVar.p1 = i7;
                    if (z10) {
                        lq B0 = rqVar.B0();
                        rqVar.G0();
                        rqVar.F0(B0);
                    }
                    rqVar.a.g(rqVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i7 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.gu0
    public /* synthetic */ void o() {
        int i7 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void c() {
    }
}
