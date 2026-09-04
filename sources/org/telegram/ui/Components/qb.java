package org.telegram.ui.Components;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                return ((org.telegram.ui.gh0) obj).N;
            default:
                return ((org.telegram.ui.gh0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((ub) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.gh0 gh0Var = (org.telegram.ui.gh0) obj;
                gh0Var.N = f7;
                gh0Var.invalidate();
                break;
            default:
                org.telegram.ui.gh0 gh0Var2 = (org.telegram.ui.gh0) obj;
                gh0Var2.M = f7;
                gh0Var2.invalidate();
                break;
        }
    }
}
