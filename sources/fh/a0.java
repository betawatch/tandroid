package fh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ a0(k0 k0Var, int i9) {
        this.a = i9;
        this.b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onBackPressed();
                break;
            default:
                this.b.S();
                break;
        }
    }
}
