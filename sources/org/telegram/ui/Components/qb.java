package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
