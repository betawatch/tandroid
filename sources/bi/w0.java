package bi;

import org.telegram.messenger.sr;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements sr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.sr
    public final void a(int i7) {
        switch (this.a) {
            case 0:
                a1 a1Var = (a1) this.b;
                a1Var.getClass();
                a1Var.f1(cg.a.i(0L, i7 == 0 ? cg.b.a : cg.b.b), true, false, true);
                a1Var.W1.setText("");
                break;
            case 1:
                e1 e1Var = (e1) this.b;
                e1Var.getClass();
                e1Var.M0(cg.a.i(0L, i7 == 0 ? cg.b.a : cg.b.b), true, false, true);
                e1Var.n1.setText("");
                break;
            default:
                k6 k6Var = (k6) this.b;
                k6Var.getClass();
                k6Var.q = i7 == 0 ? cg.b.a : cg.b.b;
                k6Var.a(true);
                break;
        }
    }
}
