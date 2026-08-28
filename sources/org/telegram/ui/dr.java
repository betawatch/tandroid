package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.av0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ er b;

    public /* synthetic */ dr(er erVar, int i9) {
        this.a = i9;
        this.b = erVar;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean d(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        jr jrVar = this.b.d;
        return jrVar.g0(jrVar.a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override // org.telegram.ui.Components.av0
    public void h(int i9) {
        switch (this.a) {
            case 1:
                jr jrVar = this.b.d;
                if (jrVar.s != null) {
                    int i10 = jrVar.l1;
                    boolean z10 = (i10 > 0 && i9 == 0) || (i10 == 0 && i9 > 0);
                    jrVar.l1 = i9;
                    if (z10) {
                        cr v02 = jrVar.v0();
                        jrVar.A0();
                        jrVar.z0(v02);
                    }
                    jrVar.a.m(jrVar.L0);
                    break;
                }
                break;
            default:
                this.b.d.o1 = i9 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.av0
    public /* synthetic */ void m() {
        int i9 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
