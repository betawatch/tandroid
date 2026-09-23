package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.sv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr b;

    public /* synthetic */ lr(mr mrVar, int i10) {
        this.a = i10;
        this.b = mrVar;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z10) {
        qr qrVar = this.b.d;
        return qrVar.h0(qrVar.a.E(((Integer) b5Var.getTag()).intValue()), !z10, b5Var);
    }

    @Override // org.telegram.ui.Components.sv0
    public void g(int i10) {
        switch (this.a) {
            case 1:
                qr qrVar = this.b.d;
                if (qrVar.s != null) {
                    int i11 = qrVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    qrVar.p1 = i10;
                    if (z10) {
                        kr w02 = qrVar.w0();
                        qrVar.B0();
                        qrVar.A0(w02);
                    }
                    qrVar.a.m(qrVar.P0);
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
