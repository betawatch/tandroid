package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements org.telegram.ui.Cells.e5, org.telegram.ui.Components.zw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir b;

    public /* synthetic */ hr(ir irVar, int i10) {
        this.a = i10;
        this.b = irVar;
    }

    @Override // org.telegram.ui.Cells.e5
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        mr mrVar = this.b.d;
        return mrVar.i0(mrVar.a.E(((Integer) f5Var.getTag()).intValue()), !z10, f5Var);
    }

    @Override // org.telegram.ui.Components.zw0
    public void j(int i10) {
        switch (this.a) {
            case 1:
                mr mrVar = this.b.d;
                if (mrVar.r != null) {
                    int i11 = mrVar.o1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    mrVar.o1 = i10;
                    if (z10) {
                        gr x02 = mrVar.x0();
                        mrVar.C0();
                        mrVar.B0(x02);
                    }
                    mrVar.a.m(mrVar.O0);
                    break;
                }
                break;
            default:
                this.b.d.r1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.zw0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void c() {
    }
}
