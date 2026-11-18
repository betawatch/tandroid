package bi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ y7(f8 f8Var, int i7) {
        this.a = i7;
        this.b = f8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v7 v7Var = this.b.c;
                if (!v7Var.j.isEmpty()) {
                    v7Var.j.clear();
                    v7Var.m();
                    break;
                }
                break;
            case 1:
                v7 v7Var2 = this.b.c;
                if (!v7Var2.k.isEmpty()) {
                    v7Var2.k.clear();
                    v7Var2.m();
                    break;
                }
                break;
            case 2:
                v7 v7Var3 = this.b.c;
                if (!v7Var3.l.isEmpty()) {
                    v7Var3.l.clear();
                    v7Var3.m();
                    break;
                }
                break;
            case 3:
                this.b.c.p(u7.a);
                break;
            case 4:
                this.b.c.p(u7.b);
                break;
            default:
                this.b.c.p(u7.c);
                break;
        }
    }
}
