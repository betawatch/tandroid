package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                return ((org.telegram.ui.rg0) obj).N;
            default:
                return ((org.telegram.ui.rg0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((ub) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.rg0 rg0Var = (org.telegram.ui.rg0) obj;
                rg0Var.N = f7;
                rg0Var.invalidate();
                break;
            default:
                org.telegram.ui.rg0 rg0Var2 = (org.telegram.ui.rg0) obj;
                rg0Var2.M = f7;
                rg0Var2.invalidate();
                break;
        }
    }
}
