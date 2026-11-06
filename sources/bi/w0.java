package bi;

import org.telegram.messenger.sr;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
