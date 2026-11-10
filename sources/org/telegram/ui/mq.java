package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.vt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nq b;

    public /* synthetic */ mq(nq nqVar, int i7) {
        this.a = i7;
        this.b = nqVar;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        rq rqVar = this.b.d;
        return rqVar.m0(rqVar.a.E(((Integer) a5Var.getTag()).intValue()), !z9, a5Var);
    }

    @Override // org.telegram.ui.Components.vt0
    public void m(int i7) {
        switch (this.a) {
            case 1:
                rq rqVar = this.b.d;
                if (rqVar.r != null) {
                    int i10 = rqVar.o1;
                    boolean z9 = (i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0);
                    rqVar.o1 = i7;
                    if (z9) {
                        lq B0 = rqVar.B0();
                        rqVar.G0();
                        rqVar.F0(B0);
                    }
                    rqVar.a.g(rqVar.O0);
                    break;
                }
                break;
            default:
                this.b.d.r1 = i7 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void n() {
        int i7 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void c() {
    }
}
