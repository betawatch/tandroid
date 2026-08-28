package fh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ s5(e6 e6Var, int i9) {
        this.a = i9;
        this.b = e6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p5 p5Var = this.b.c;
                if (!p5Var.j.isEmpty()) {
                    p5Var.j.clear();
                    p5Var.h();
                    break;
                }
                break;
            case 1:
                p5 p5Var2 = this.b.c;
                if (!p5Var2.k.isEmpty()) {
                    p5Var2.k.clear();
                    p5Var2.h();
                    break;
                }
                break;
            case 2:
                p5 p5Var3 = this.b.c;
                if (!p5Var3.l.isEmpty()) {
                    p5Var3.l.clear();
                    p5Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(o5.b);
                break;
            case 4:
                this.b.c.i(o5.c);
                break;
            default:
                this.b.c.i(o5.d);
                break;
        }
    }
}
