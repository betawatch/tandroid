package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gr implements org.telegram.ui.Cells.x4, org.telegram.ui.Components.cv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hr b;

    public /* synthetic */ gr(hr hrVar, int i10) {
        this.a = i10;
        this.b = hrVar;
    }

    @Override // org.telegram.ui.Cells.x4
    public boolean d(org.telegram.ui.Cells.y4 y4Var, boolean z10) {
        lr lrVar = this.b.d;
        return lrVar.h0(lrVar.a.E(((Integer) y4Var.getTag()).intValue()), !z10, y4Var);
    }

    @Override // org.telegram.ui.Components.cv0
    public void j(int i10) {
        switch (this.a) {
            case 1:
                lr lrVar = this.b.d;
                if (lrVar.s != null) {
                    int i11 = lrVar.l1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    lrVar.l1 = i10;
                    if (z10) {
                        er w02 = lrVar.w0();
                        lrVar.B0();
                        lrVar.A0(w02);
                    }
                    lrVar.a.m(lrVar.L0);
                    break;
                }
                break;
            default:
                this.b.d.o1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
