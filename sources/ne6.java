// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ne6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qh6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ne6(qh6 qh6Var, int i, boolean z, boolean z2) {
        this.b = qh6Var;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        qh6 qh6Var = this.b;
        switch (b) {
            case 0:
                qh6Var.L1(z3, z2, z);
                break;
            default:
                boolean z4 = qh6Var.K;
                qh6Var.K = z3;
                qh6Var.L1(z2, z, true);
                qh6Var.K = z4;
                break;
        }
    }

    public /* synthetic */ ne6(qh6 qh6Var, boolean z, boolean z2, boolean z3) {
        this.b = qh6Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
