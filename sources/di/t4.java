package di;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;
    public final /* synthetic */ rg.d2 c;

    public /* synthetic */ t4(o6 o6Var, rg.d2 d2Var, int i10) {
        this.a = i10;
        this.b = o6Var;
        this.c = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C0(this.c, true);
                break;
            default:
                this.b.B0(this.c);
                break;
        }
    }
}
