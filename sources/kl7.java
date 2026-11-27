// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class kl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rl7 b;

    public /* synthetic */ kl7(rl7 rl7Var, byte b) {
        this.a = b;
        this.b = rl7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rl7 rl7Var = this.b;
        switch (b) {
            case 0:
                hl.t1(rl7Var.l1);
                break;
            default:
                hl.E3(rl7Var.m1.getEditText());
                break;
        }
    }
}
