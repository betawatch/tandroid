package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.pw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr b;

    public /* synthetic */ mr(nr nrVar, int i10) {
        this.a = i10;
        this.b = nrVar;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        rr rrVar = this.b.d;
        return rrVar.h0(rrVar.a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override // org.telegram.ui.Components.pw0
    public void j(int i10) {
        switch (this.a) {
            case 1:
                rr rrVar = this.b.d;
                if (rrVar.s != null) {
                    int i11 = rrVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    rrVar.p1 = i10;
                    if (z10) {
                        lr w02 = rrVar.w0();
                        rrVar.B0();
                        rrVar.A0(w02);
                    }
                    rrVar.a.m(rrVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.pw0
    public /* synthetic */ void l() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
