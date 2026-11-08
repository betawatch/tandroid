package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.ut0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq b;

    public /* synthetic */ jq(kq kqVar, int i7) {
        this.a = i7;
        this.b = kqVar;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        oq oqVar = this.b.d;
        return oqVar.m0(oqVar.a.E(((Integer) a5Var.getTag()).intValue()), !z9, a5Var);
    }

    @Override // org.telegram.ui.Components.ut0
    public void m(int i7) {
        switch (this.a) {
            case 1:
                oq oqVar = this.b.d;
                if (oqVar.r != null) {
                    int i10 = oqVar.o1;
                    boolean z9 = (i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0);
                    oqVar.o1 = i7;
                    if (z9) {
                        iq B0 = oqVar.B0();
                        oqVar.G0();
                        oqVar.F0(B0);
                    }
                    oqVar.a.g(oqVar.O0);
                    break;
                }
                break;
            default:
                this.b.d.r1 = i7 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.ut0
    public /* synthetic */ void n() {
        int i7 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void c() {
    }
}
