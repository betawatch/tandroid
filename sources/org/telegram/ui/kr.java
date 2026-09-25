package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.dw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ kr(lr lrVar, int i10) {
        this.a = i10;
        this.b = lrVar;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean e(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        pr prVar = this.b.d;
        return prVar.h0(prVar.a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
        switch (this.a) {
            case 1:
                pr prVar = this.b.d;
                if (prVar.s != null) {
                    int i11 = prVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    prVar.p1 = i10;
                    if (z10) {
                        jr w02 = prVar.w0();
                        prVar.B0();
                        prVar.A0(w02);
                    }
                    prVar.a.m(prVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void n() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
