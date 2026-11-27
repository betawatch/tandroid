// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class md8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qd8 b;

    public /* synthetic */ md8(qd8 qd8Var, byte b) {
        this.a = b;
        this.b = qd8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qd8 qd8Var = this.b;
        switch (b) {
            case 0:
                qd8Var.d();
                break;
            default:
                qd8Var.f();
                break;
        }
    }
}
