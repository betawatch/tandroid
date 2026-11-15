package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.vt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq b;

    public /* synthetic */ lq(mq mqVar, int i7) {
        this.a = i7;
        this.b = mqVar;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean c(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        qq qqVar = this.b.d;
        return qqVar.m0(qqVar.a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override // org.telegram.ui.Components.vt0
    public void l(int i7) {
        switch (this.a) {
            case 1:
                qq qqVar = this.b.d;
                if (qqVar.r != null) {
                    int i10 = qqVar.p1;
                    boolean z10 = (i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0);
                    qqVar.p1 = i7;
                    if (z10) {
                        kq B0 = qqVar.B0();
                        qqVar.G0();
                        qqVar.F0(B0);
                    }
                    qqVar.a.g(qqVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i7 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void p() {
        int i7 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
