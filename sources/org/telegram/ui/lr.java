package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr implements org.telegram.ui.Cells.a5, org.telegram.ui.Components.tv0 {
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

    @Override // org.telegram.ui.Components.tv0
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

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
