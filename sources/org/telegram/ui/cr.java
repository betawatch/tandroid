package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class cr implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.nw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr b;

    public /* synthetic */ cr(dr drVar, int i10) {
        this.a = i10;
        this.b = drVar;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        hr hrVar = this.b.d;
        return hrVar.h0(hrVar.a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override // org.telegram.ui.Components.nw0
    public void h(int i10) {
        switch (this.a) {
            case 1:
                hr hrVar = this.b.d;
                if (hrVar.s != null) {
                    int i11 = hrVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    hrVar.p1 = i10;
                    if (z10) {
                        br w02 = hrVar.w0();
                        hrVar.B0();
                        hrVar.A0(w02);
                    }
                    hrVar.a.m(hrVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.nw0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
