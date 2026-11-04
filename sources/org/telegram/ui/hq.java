package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.tt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq b;

    public /* synthetic */ hq(iq iqVar, int i3) {
        this.a = i3;
        this.b = iqVar;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        nq nqVar = this.b.d;
        return nqVar.m0(nqVar.a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override // org.telegram.ui.Components.tt0
    public void l(int i3) {
        switch (this.a) {
            case 1:
                nq nqVar = this.b.d;
                if (nqVar.r != null) {
                    int i10 = nqVar.p1;
                    boolean z10 = (i10 > 0 && i3 == 0) || (i10 == 0 && i3 > 0);
                    nqVar.p1 = i3;
                    if (z10) {
                        gq B0 = nqVar.B0();
                        nqVar.G0();
                        nqVar.F0(B0);
                    }
                    nqVar.a.g(nqVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i3 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.tt0
    public /* synthetic */ void p() {
        int i3 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void c() {
    }
}
