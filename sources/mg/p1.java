package mg;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1 b;

    public /* synthetic */ p1(v1 v1Var, int i10) {
        this.a = i10;
        this.b = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.i1(true);
                break;
            case 1:
                this.b.n1(true, false);
                break;
            case 2:
                this.b.e1();
                break;
            case 3:
                this.b.n1(true, false);
                break;
            case 4:
                this.b.n1(true, false);
                break;
            case 5:
                this.b.n1(true, false);
                break;
            case 6:
                v1 v1Var = this.b;
                v1Var.W1.clear();
                v1Var.X1.clear();
                v1Var.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
