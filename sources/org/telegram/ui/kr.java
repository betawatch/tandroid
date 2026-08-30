package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.tv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ kr(lr lrVar, int i10) {
        this.a = i10;
        this.b = lrVar;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        pr prVar = this.b.d;
        return prVar.h0(prVar.a.E(((Integer) b5Var.getTag()).intValue()), !z4, b5Var);
    }

    @Override // org.telegram.ui.Components.tv0
    public void h(int i10) {
        switch (this.a) {
            case 1:
                pr prVar = this.b.d;
                if (prVar.s != null) {
                    int i11 = prVar.m1;
                    boolean z4 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    prVar.m1 = i10;
                    if (z4) {
                        jr w02 = prVar.w0();
                        prVar.B0();
                        prVar.A0(w02);
                    }
                    prVar.a.m(prVar.M0);
                    break;
                }
                break;
            default:
                this.b.d.p1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
