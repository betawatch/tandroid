package bi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ d8(k8 k8Var, int i7) {
        this.a = i7;
        this.b = k8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a8 a8Var = this.b.c;
                if (!a8Var.j.isEmpty()) {
                    a8Var.j.clear();
                    a8Var.m();
                    break;
                }
                break;
            case 1:
                a8 a8Var2 = this.b.c;
                if (!a8Var2.k.isEmpty()) {
                    a8Var2.k.clear();
                    a8Var2.m();
                    break;
                }
                break;
            case 2:
                a8 a8Var3 = this.b.c;
                if (!a8Var3.l.isEmpty()) {
                    a8Var3.l.clear();
                    a8Var3.m();
                    break;
                }
                break;
            case 3:
                this.b.c.p(z7.a);
                break;
            case 4:
                this.b.c.p(z7.b);
                break;
            default:
                this.b.c.p(z7.c);
                break;
        }
    }
}
