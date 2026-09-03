package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.tv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr b;

    public /* synthetic */ mr(nr nrVar, int i10) {
        this.a = i10;
        this.b = nrVar;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z4) {
        rr rrVar = this.b.d;
        return rrVar.h0(rrVar.a.E(((Integer) a5Var.getTag()).intValue()), !z4, a5Var);
    }

    @Override // org.telegram.ui.Components.tv0
    public void g(int i10) {
        switch (this.a) {
            case 1:
                rr rrVar = this.b.d;
                if (rrVar.s != null) {
                    int i11 = rrVar.m1;
                    boolean z4 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    rrVar.m1 = i10;
                    if (z4) {
                        lr w02 = rrVar.w0();
                        rrVar.B0();
                        rrVar.A0(w02);
                    }
                    rrVar.a.m(rrVar.M0);
                    break;
                }
                break;
            default:
                this.b.d.p1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void j() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
