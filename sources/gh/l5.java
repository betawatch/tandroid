package gh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class l5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ l5(w5 w5Var, int i10) {
        this.a = i10;
        this.b = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i5 i5Var = this.b.c;
                if (!i5Var.j.isEmpty()) {
                    i5Var.j.clear();
                    i5Var.h();
                    break;
                }
                break;
            case 1:
                i5 i5Var2 = this.b.c;
                if (!i5Var2.k.isEmpty()) {
                    i5Var2.k.clear();
                    i5Var2.h();
                    break;
                }
                break;
            case 2:
                i5 i5Var3 = this.b.c;
                if (!i5Var3.l.isEmpty()) {
                    i5Var3.l.clear();
                    i5Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(h5.b);
                break;
            case 4:
                this.b.c.i(h5.c);
                break;
            default:
                this.b.c.i(h5.d);
                break;
        }
    }
}
