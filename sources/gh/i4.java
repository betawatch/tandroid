package gh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class i4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ i4(y5 y5Var, int i10) {
        this.a = i10;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i5 i5Var = this.b.d;
                if (!i5Var.l.isEmpty()) {
                    i5Var.l.clear();
                    i5Var.h();
                    break;
                }
                break;
            case 1:
                i5 i5Var2 = this.b.d;
                if (!i5Var2.k.isEmpty()) {
                    i5Var2.k.clear();
                    i5Var2.h();
                    break;
                }
                break;
            case 2:
                i5 i5Var3 = this.b.d;
                if (!i5Var3.j.isEmpty()) {
                    i5Var3.j.clear();
                    i5Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.d.i(h5.b);
                break;
            case 4:
                this.b.d.i(h5.c);
                break;
            default:
                this.b.d.i(h5.d);
                break;
        }
    }
}
