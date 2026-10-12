package bi;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class ea implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fa b;

    public /* synthetic */ ea(fa faVar, int i10) {
        this.a = i10;
        this.b = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ga gaVar = this.b.v;
                gaVar.s = 0;
                gaVar.requestLayout();
                ha haVar = gaVar.J;
                haVar.L(haVar.getWidth(), haVar.getHeight());
                haVar.requestLayout();
                break;
            case 1:
                ga gaVar2 = this.b.v;
                gaVar2.s = 0;
                gaVar2.requestLayout();
                ha haVar2 = gaVar2.J;
                haVar2.L(haVar2.getWidth(), haVar2.getHeight());
                haVar2.requestLayout();
                break;
            case 2:
                fa faVar = this.b;
                faVar.v.post(new ea(faVar, 3));
                break;
            default:
                this.b.v.x = true;
                break;
        }
    }
}
