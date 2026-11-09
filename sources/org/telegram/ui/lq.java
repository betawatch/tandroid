package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.wt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq b;

    public /* synthetic */ lq(mq mqVar, int i7) {
        this.a = i7;
        this.b = mqVar;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        qq qqVar = this.b.d;
        return qqVar.m0(qqVar.a.E(((Integer) a5Var.getTag()).intValue()), !z9, a5Var);
    }

    @Override // org.telegram.ui.Components.wt0
    public void m(int i7) {
        switch (this.a) {
            case 1:
                qq qqVar = this.b.d;
                if (qqVar.r != null) {
                    int i10 = qqVar.o1;
                    boolean z9 = (i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0);
                    qqVar.o1 = i7;
                    if (z9) {
                        kq B0 = qqVar.B0();
                        qqVar.G0();
                        qqVar.F0(B0);
                    }
                    qqVar.a.g(qqVar.O0);
                    break;
                }
                break;
            default:
                this.b.d.r1 = i7 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.wt0
    public /* synthetic */ void n() {
        int i7 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void c() {
    }
}
