package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class er implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.mw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr b;

    public /* synthetic */ er(fr frVar, int i10) {
        this.a = i10;
        this.b = frVar;
    }

    @Override // org.telegram.ui.Cells.z4
    public boolean d(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        jr jrVar = this.b.d;
        return jrVar.h0(jrVar.a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override // org.telegram.ui.Components.mw0
    public void h(int i10) {
        switch (this.a) {
            case 1:
                jr jrVar = this.b.d;
                if (jrVar.s != null) {
                    int i11 = jrVar.p1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    jrVar.p1 = i10;
                    if (z10) {
                        dr w02 = jrVar.w0();
                        jrVar.B0();
                        jrVar.A0(w02);
                    }
                    jrVar.a.m(jrVar.P0);
                    break;
                }
                break;
            default:
                this.b.d.s1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.mw0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
