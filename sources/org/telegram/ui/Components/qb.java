package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
