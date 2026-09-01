package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.uv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr b;

    public /* synthetic */ lr(mr mrVar, int i10) {
        this.a = i10;
        this.b = mrVar;
    }

    @Override // org.telegram.ui.Cells.a5
    public boolean c(org.telegram.ui.Cells.b5 b5Var, boolean z4) {
        qr qrVar = this.b.d;
        return qrVar.h0(qrVar.a.E(((Integer) b5Var.getTag()).intValue()), !z4, b5Var);
    }

    @Override // org.telegram.ui.Components.uv0
    public void i(int i10) {
        switch (this.a) {
            case 1:
                qr qrVar = this.b.d;
                if (qrVar.s != null) {
                    int i11 = qrVar.m1;
                    boolean z4 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    qrVar.m1 = i10;
                    if (z4) {
                        kr w02 = qrVar.w0();
                        qrVar.B0();
                        qrVar.A0(w02);
                    }
                    qrVar.a.m(qrVar.M0);
                    break;
                }
                break;
            default:
                this.b.d.p1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.uv0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
