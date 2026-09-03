package cg;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;

    public /* synthetic */ k1(l1 l1Var, int i10) {
        this.a = i10;
        this.b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n1 n1Var = this.b.b.d;
                if (n1Var != null) {
                    n1Var.postRunnable(n1Var.w);
                    break;
                }
                break;
            case 1:
                n1 n1Var2 = this.b.b.d;
                if (n1Var2 != null) {
                    n1Var2.postRunnable(n1Var2.w);
                    break;
                }
                break;
            default:
                p1 p1Var = this.b.b;
                n1 n1Var3 = p1Var.d;
                n1Var3.getClass();
                n1Var3.postRunnable(new m1(n1Var3, 2));
                p1Var.d = null;
                break;
        }
    }
}
