package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.tv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr b;

    public /* synthetic */ pr(qr qrVar, int i10) {
        this.a = i10;
        this.b = qrVar;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        ur urVar = this.b.d;
        return urVar.h0(urVar.a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override // org.telegram.ui.Components.tv0
    public void g(int i10) {
        switch (this.a) {
            case 1:
                ur urVar = this.b.d;
                if (urVar.s != null) {
                    int i11 = urVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    urVar.p1 = i10;
                    if (z10) {
                        or w02 = urVar.w0();
                        urVar.B0();
                        urVar.A0(w02);
                    }
                    urVar.a.m(urVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public /* synthetic */ void l() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
