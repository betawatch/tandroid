package org.telegram.ui.Components;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                return ((org.telegram.ui.bh0) obj).N;
            default:
                return ((org.telegram.ui.bh0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((ub) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.bh0 bh0Var = (org.telegram.ui.bh0) obj;
                bh0Var.N = f7;
                bh0Var.invalidate();
                break;
            default:
                org.telegram.ui.bh0 bh0Var2 = (org.telegram.ui.bh0) obj;
                bh0Var2.M = f7;
                bh0Var2.invalidate();
                break;
        }
    }
}
