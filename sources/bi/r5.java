package bi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ r5(y5 y5Var, int i7) {
        this.a = i7;
        this.b = y5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b.c;
                if (!o5Var.j.isEmpty()) {
                    o5Var.j.clear();
                    o5Var.h();
                    break;
                }
                break;
            case 1:
                o5 o5Var2 = this.b.c;
                if (!o5Var2.k.isEmpty()) {
                    o5Var2.k.clear();
                    o5Var2.h();
                    break;
                }
                break;
            case 2:
                o5 o5Var3 = this.b.c;
                if (!o5Var3.l.isEmpty()) {
                    o5Var3.l.clear();
                    o5Var3.h();
                    break;
                }
                break;
            case 3:
                this.b.c.i(n5.a);
                break;
            case 4:
                this.b.c.i(n5.b);
                break;
            default:
                this.b.c.i(n5.c);
                break;
        }
    }
}
