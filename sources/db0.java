// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class db0 extends d6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ob0 b;

    public /* synthetic */ db0(ob0 ob0Var, byte b) {
        this.a = b;
        this.b = ob0Var;
    }

    @Override // d6
    public final void b(int i) {
        byte b = this.a;
        ob0 ob0Var = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    ob0Var.h0();
                    break;
                }
                break;
            default:
                if (i == -1) {
                    ob0Var.h0();
                }
                if (i == 1) {
                    ob0Var.j0();
                    break;
                }
                break;
        }
    }
}
