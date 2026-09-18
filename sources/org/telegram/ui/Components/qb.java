package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class qb extends o1.i {
    public final /* synthetic */ int a;

    public /* synthetic */ qb(int i10) {
        this.a = i10;
    }

    @Override // o1.i
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((ub) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.hh0) obj).N;
            default:
                return ((org.telegram.ui.hh0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((ub) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.hh0 hh0Var = (org.telegram.ui.hh0) obj;
                hh0Var.N = f7;
                hh0Var.invalidate();
                break;
            default:
                org.telegram.ui.hh0 hh0Var2 = (org.telegram.ui.hh0) obj;
                hh0Var2.M = f7;
                hh0Var2.invalidate();
                break;
        }
    }
}
