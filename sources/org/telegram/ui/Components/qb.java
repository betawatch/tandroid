package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                return ((org.telegram.ui.tg0) obj).N;
            default:
                return ((org.telegram.ui.tg0) obj).M;
        }
    }

    @Override // o1.i
    public final void b(Object obj, float f7) {
        switch (this.a) {
            case 0:
                ((ub) obj).setInOutOffset(f7);
                break;
            case 1:
                org.telegram.ui.tg0 tg0Var = (org.telegram.ui.tg0) obj;
                tg0Var.N = f7;
                tg0Var.invalidate();
                break;
            default:
                org.telegram.ui.tg0 tg0Var2 = (org.telegram.ui.tg0) obj;
                tg0Var2.M = f7;
                tg0Var2.invalidate();
                break;
        }
    }
}
