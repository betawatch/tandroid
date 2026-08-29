package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class er implements org.telegram.ui.Cells.y4, org.telegram.ui.Components.kv0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr b;

    public /* synthetic */ er(fr frVar, int i10) {
        this.a = i10;
        this.b = frVar;
    }

    @Override // org.telegram.ui.Cells.y4
    public boolean d(org.telegram.ui.Cells.z4 z4Var, boolean z10) {
        jr jrVar = this.b.d;
        return jrVar.h0(jrVar.a.E(((Integer) z4Var.getTag()).intValue()), !z10, z4Var);
    }

    @Override // org.telegram.ui.Components.kv0
    public void h(int i10) {
        switch (this.a) {
            case 1:
                jr jrVar = this.b.d;
                if (jrVar.s != null) {
                    int i11 = jrVar.l1;
                    boolean z10 = (i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0);
                    jrVar.l1 = i10;
                    if (z10) {
                        dr w02 = jrVar.w0();
                        jrVar.B0();
                        jrVar.A0(w02);
                    }
                    jrVar.a.m(jrVar.L0);
                    break;
                }
                break;
            default:
                this.b.d.o1 = i10 + 1;
                break;
        }
    }

    @Override // org.telegram.ui.Components.kv0
    public /* synthetic */ void m() {
        int i10 = this.a;
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }
}
