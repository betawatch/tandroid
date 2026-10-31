package bi;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d3(n1 n1Var, int i10, int i11) {
        this.a = i11;
        this.b = n1Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n1 n1Var = this.b;
                n1Var.N();
                n1Var.setSelection(Math.max(0, Math.min(this.c, n1Var.length())));
                break;
            case 1:
                n1 n1Var2 = this.b;
                n1Var2.N();
                n1Var2.setSelection(Math.max(0, Math.min(this.c, n1Var2.length())));
                break;
            case 2:
                n1 n1Var3 = this.b;
                n1Var3.N();
                n1Var3.setSelection(Math.max(0, Math.min(this.c, n1Var3.length())));
                break;
            case 3:
                n1 n1Var4 = this.b;
                n1Var4.N();
                n1Var4.setSelection(Math.min(this.c, n1Var4.length()));
                break;
            default:
                n1 n1Var5 = this.b;
                n1Var5.N();
                n1Var5.setSelection(Math.max(0, Math.min(this.c, n1Var5.length())));
                break;
        }
    }
}
