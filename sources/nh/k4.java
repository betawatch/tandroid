package nh;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k4 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ k4(t5 t5Var, boolean z10, int i10) {
        this.a = i10;
        this.b = t5Var;
        this.c = z10;
    }

    @Override // o1.g
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.a) {
            case 0:
                t5 t5Var = this.b;
                x4 x4Var = t5Var.s1;
                if (iVar == t5Var.y1) {
                    t5Var.y1 = null;
                    if (!this.c) {
                        x4Var.setVisibility(8);
                        ag.h1.e(t5Var.B1).g();
                        x4Var.getAdapter().l();
                        break;
                    }
                }
                break;
            default:
                t5 t5Var2 = this.b;
                bg.t2 t2Var = t5Var2.i1;
                if (iVar == t5Var2.r1) {
                    t5Var2.r1 = null;
                    if (!this.c) {
                        t2Var.setVisibility(8);
                    }
                    t2Var.setMaskProvider(null);
                    break;
                }
                break;
        }
    }
}
