package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements org.telegram.ui.Cells.e5, org.telegram.ui.Components.yw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gr b;

    public /* synthetic */ fr(gr grVar, int i10) {
        this.a = i10;
        this.b = grVar;
    }

    @Override // org.telegram.ui.Cells.e5
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        kr krVar = this.b.d;
        return krVar.i0(krVar.a.E(((Integer) f5Var.getTag()).intValue()), !z10, f5Var);
    }

    @Override // org.telegram.ui.Components.yw0
    public void j(int i10) {
        switch (this.a) {
            case 1:
                kr krVar = this.b.d;
                if (krVar.r != null) {
                    int i11 = krVar.o1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    krVar.o1 = i10;
                    if (z10) {
                        er x02 = krVar.x0();
                        krVar.C0();
                        krVar.B0(x02);
                    }
                    krVar.a.m(krVar.O0);
                    break;
                }
                break;
            default:
                this.b.d.r1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.yw0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void c() {
    }
}
