package ci;

import org.telegram.messenger.kr;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements kr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.kr
    public final void a(int i3) {
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.b;
                t0Var.getClass();
                t0Var.f1(dg.a.i(0L, i3 == 0 ? dg.b.a : dg.b.b), true, false, true);
                t0Var.X1.setText("");
                break;
            case 1:
                x0 x0Var = (x0) this.b;
                x0Var.getClass();
                x0Var.M0(dg.a.i(0L, i3 == 0 ? dg.b.a : dg.b.b), true, false, true);
                x0Var.o1.setText("");
                break;
            default:
                n5 n5Var = (n5) this.b;
                n5Var.getClass();
                n5Var.q = i3 == 0 ? dg.b.a : dg.b.b;
                n5Var.a(true);
                break;
        }
    }
}
