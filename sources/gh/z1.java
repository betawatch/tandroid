package gh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z1(b2 b2Var, boolean z10, int i10) {
        this.a = i10;
        this.b = b2Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                b2 b2Var = this.b;
                if (!z10) {
                    b2Var.C.setVisibility(8);
                    break;
                } else {
                    b2Var.getClass();
                    break;
                }
            default:
                boolean z11 = this.c;
                b2 b2Var2 = this.b;
                if (!z11) {
                    b2Var2.v.setVisibility(8);
                    break;
                } else {
                    b2Var2.getClass();
                    break;
                }
        }
    }
}
