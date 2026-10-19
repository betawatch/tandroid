package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                return ((org.telegram.ui.pg0) obj).N;
            default:
                return ((org.telegram.ui.pg0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((ub) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.pg0 pg0Var = (org.telegram.ui.pg0) obj;
                pg0Var.N = f7;
                pg0Var.invalidate();
                break;
            default:
                org.telegram.ui.pg0 pg0Var2 = (org.telegram.ui.pg0) obj;
                pg0Var2.M = f7;
                pg0Var2.invalidate();
                break;
        }
    }
}
