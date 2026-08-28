package fh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c2(f2 f2Var, boolean z10, int i9) {
        this.a = i9;
        this.b = f2Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                f2 f2Var = this.b;
                if (!z10) {
                    f2Var.C.setVisibility(8);
                    break;
                } else {
                    f2Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                f2 f2Var2 = this.b;
                if (!z11) {
                    f2Var2.v.setVisibility(8);
                    break;
                } else {
                    f2Var2.getClass();
                    break;
                }
        }
    }
}
