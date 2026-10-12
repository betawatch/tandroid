package di;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qa(kc kcVar, boolean z10, int i10) {
        this.a = i10;
        this.b = kcVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                kc kcVar = this.b;
                if (!this.c) {
                    kcVar.J0.b(false, false);
                    break;
                } else {
                    kcVar.getClass();
                    break;
                }
            default:
                kc kcVar2 = this.b;
                kcVar2.R = null;
                kcVar2.e = false;
                kcVar2.p(this.c);
                break;
        }
    }
}
