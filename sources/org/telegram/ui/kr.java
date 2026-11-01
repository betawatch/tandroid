package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr implements org.telegram.ui.Cells.d5, org.telegram.ui.Components.yu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ kr(lr lrVar, int i10) {
        this.a = i10;
        this.b = lrVar;
    }

    @Override // org.telegram.ui.Cells.d5
    public boolean c(org.telegram.ui.Cells.e5 e5Var, boolean z10) {
        pr prVar = this.b.d;
        return prVar.m0(prVar.a.E(((Integer) e5Var.getTag()).intValue()), !z10, e5Var);
    }

    @Override // org.telegram.ui.Components.yu0
    public void m(int i10) {
        switch (this.a) {
            case 1:
                pr prVar = this.b.d;
                if (prVar.r != null) {
                    int i11 = prVar.o1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    prVar.o1 = i10;
                    if (z10) {
                        jr B0 = prVar.B0();
                        prVar.G0();
                        prVar.F0(B0);
                    }
                    prVar.a.g(prVar.O0);
                    break;
                }
                break;
            default:
                this.b.d.r1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.yu0
    public /* synthetic */ void r() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
