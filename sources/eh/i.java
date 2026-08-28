package eh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ i(x xVar, int i9) {
        this.a = i9;
        this.b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            case 1:
                x.k(this.b.q, true, true);
                break;
            default:
                this.b.e();
                break;
        }
    }
}
