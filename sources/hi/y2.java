package hi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ y2(k1 k1Var, int i10, int i11) {
        this.a = i11;
        this.b = k1Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k1 k1Var = this.b;
                k1Var.r();
                k1Var.setSelection(Math.max(0, Math.min(this.c, k1Var.length())));
                break;
            case 1:
                k1 k1Var2 = this.b;
                k1Var2.r();
                k1Var2.setSelection(Math.max(0, Math.min(this.c, k1Var2.length())));
                break;
            case 2:
                k1 k1Var3 = this.b;
                k1Var3.r();
                k1Var3.setSelection(Math.max(0, Math.min(this.c, k1Var3.length())));
                break;
            case 3:
                k1 k1Var4 = this.b;
                k1Var4.r();
                k1Var4.setSelection(Math.min(this.c, k1Var4.length()));
                break;
            default:
                k1 k1Var5 = this.b;
                k1Var5.r();
                k1Var5.setSelection(Math.max(0, Math.min(this.c, k1Var5.length())));
                break;
        }
    }
}
