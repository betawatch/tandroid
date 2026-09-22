package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.sv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;

    public /* synthetic */ pr(qr qrVar, int i10) {
        this.a = i10;
        this.b = qrVar;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        ur urVar = this.b.d;
        return urVar.h0(urVar.a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override // org.telegram.ui.Components.sv0
    public void g(int i10) {
        switch (this.a) {
            case 1:
                ur urVar = this.b.d;
                if (urVar.s != null) {
                    int i11 = urVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    urVar.p1 = i10;
                    if (z10) {
                        or w02 = urVar.w0();
                        urVar.B0();
                        urVar.A0(w02);
                    }
                    urVar.a.m(urVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.sv0
    public /* synthetic */ void l() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
