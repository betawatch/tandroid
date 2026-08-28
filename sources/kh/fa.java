package kh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class fa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fa(wb wbVar, boolean z10, int i9) {
        this.a = i9;
        this.b = wbVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            case 1:
                wb wbVar = this.b;
                if (!this.c) {
                    wbVar.F0.b(false, false);
                    break;
                } else {
                    wbVar.getClass();
                    break;
                }
            default:
                wb wbVar2 = this.b;
                wbVar2.N = null;
                wbVar2.e = false;
                wbVar2.q(this.c);
                break;
        }
    }
}
