package ji;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w2(h1 h1Var, int i10, int i11) {
        this.a = i11;
        this.b = h1Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h1 h1Var = this.b;
                h1Var.r();
                h1Var.setSelection(Math.max(0, Math.min(this.c, h1Var.length())));
                break;
            case 1:
                h1 h1Var2 = this.b;
                h1Var2.r();
                h1Var2.setSelection(Math.max(0, Math.min(this.c, h1Var2.length())));
                break;
            case 2:
                h1 h1Var3 = this.b;
                h1Var3.r();
                h1Var3.setSelection(Math.max(0, Math.min(this.c, h1Var3.length())));
                break;
            case 3:
                h1 h1Var4 = this.b;
                h1Var4.r();
                h1Var4.setSelection(Math.min(this.c, h1Var4.length()));
                break;
            default:
                h1 h1Var5 = this.b;
                h1Var5.r();
                h1Var5.setSelection(Math.max(0, Math.min(this.c, h1Var5.length())));
                break;
        }
    }
}
