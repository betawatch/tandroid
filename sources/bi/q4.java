package bi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class q4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ q4(a6 a6Var, int i7) {
        this.a = i7;
        this.b = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b.d;
                if (!o5Var.j.isEmpty()) {
                    o5Var.j.clear();
                    o5Var.h();
                    break;
                }
                break;
            case 1:
                o5 o5Var2 = this.b.d;
                if (!o5Var2.k.isEmpty()) {
                    o5Var2.k.clear();
                    o5Var2.h();
                    break;
                }
                break;
            case 2:
                this.b.d.i(n5.a);
                break;
            case 3:
                this.b.d.i(n5.b);
                break;
            case 4:
                this.b.d.i(n5.c);
                break;
            default:
                o5 o5Var3 = this.b.d;
                if (!o5Var3.l.isEmpty()) {
                    o5Var3.l.clear();
                    o5Var3.h();
                    break;
                }
                break;
        }
    }
}
