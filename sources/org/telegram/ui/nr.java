package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class nr implements org.telegram.ui.Cells.b5, org.telegram.ui.Components.fw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ or b;

    public /* synthetic */ nr(or orVar, int i10) {
        this.a = i10;
        this.b = orVar;
    }

    @Override // org.telegram.ui.Cells.b5
    public boolean c(org.telegram.ui.Cells.c5 c5Var, boolean z10) {
        sr srVar = this.b.d;
        return srVar.h0(srVar.a.E(((Integer) c5Var.getTag()).intValue()), !z10, c5Var);
    }

    @Override // org.telegram.ui.Components.fw0
    public void g(int i10) {
        switch (this.a) {
            case 1:
                sr srVar = this.b.d;
                if (srVar.s != null) {
                    int i11 = srVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    srVar.p1 = i10;
                    if (z10) {
                        mr w02 = srVar.w0();
                        srVar.B0();
                        srVar.A0(w02);
                    }
                    srVar.a.m(srVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public /* synthetic */ void l() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
