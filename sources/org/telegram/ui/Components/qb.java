package org.telegram.ui.Components;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                return ((org.telegram.ui.ah0) obj).N;
            default:
                return ((org.telegram.ui.ah0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((ub) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.ah0 ah0Var = (org.telegram.ui.ah0) obj;
                ah0Var.N = f7;
                ah0Var.invalidate();
                break;
            default:
                org.telegram.ui.ah0 ah0Var2 = (org.telegram.ui.ah0) obj;
                ah0Var2.M = f7;
                ah0Var2.invalidate();
                break;
        }
    }
}
