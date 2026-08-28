package kh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;
    public final /* synthetic */ yf.b2 c;

    public /* synthetic */ n4(g6 g6Var, yf.b2 b2Var, int i9) {
        this.a = i9;
        this.b = g6Var;
        this.c = b2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.D0(this.c, true);
                break;
            default:
                this.b.C0(this.c);
                break;
        }
    }
}
