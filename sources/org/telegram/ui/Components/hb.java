package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hb extends o1.i {
    public final /* synthetic */ int a;

    public /* synthetic */ hb(int i10) {
        this.a = i10;
    }

    @Override // o1.i
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((nb) obj).inOutOffset;
            case 1:
                return ((org.telegram.ui.xg0) obj).K;
            default:
                return ((org.telegram.ui.xg0) obj).J;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f10) {
        switch (this.a) {
            case 0:
                ((nb) obj).setInOutOffset(f10);
                break;
            case 1:
                org.telegram.ui.xg0 xg0Var = (org.telegram.ui.xg0) obj;
                xg0Var.K = f10;
                xg0Var.invalidate();
                break;
            default:
                org.telegram.ui.xg0 xg0Var2 = (org.telegram.ui.xg0) obj;
                xg0Var2.J = f10;
                xg0Var2.invalidate();
                break;
        }
    }
}
