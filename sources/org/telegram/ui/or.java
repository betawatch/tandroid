package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.vw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;

    public /* synthetic */ or(pr prVar, int i10) {
        this.a = i10;
        this.b = prVar;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        tr trVar = this.b.d;
        return trVar.h0(trVar.a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override // org.telegram.ui.Components.vw0
    public void g(int i10) {
        switch (this.a) {
            case 1:
                tr trVar = this.b.d;
                if (trVar.s != null) {
                    int i11 = trVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    trVar.p1 = i10;
                    if (z10) {
                        mr w02 = trVar.w0();
                        trVar.B0();
                        trVar.A0(w02);
                    }
                    trVar.a.m(trVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.vw0
    public /* synthetic */ void l() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
