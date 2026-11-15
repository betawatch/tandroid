package di;

import org.telegram.messenger.pr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements pr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.pr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.b;
                p0Var.getClass();
                p0Var.f1(cg.a.i(0L, i7 == 0 ? cg.b.a : cg.b.b), true, false, true);
                p0Var.a2.setText("");
                break;
            case 1:
                s0 s0Var = (s0) this.b;
                s0Var.getClass();
                s0Var.M0(cg.a.i(0L, i7 == 0 ? cg.b.a : cg.b.b), true, false, true);
                s0Var.r1.setText("");
                break;
            default:
                e5 e5Var = (e5) this.b;
                e5Var.getClass();
                e5Var.q = i7 == 0 ? cg.b.a : cg.b.b;
                e5Var.a(true);
                break;
        }
    }
}
