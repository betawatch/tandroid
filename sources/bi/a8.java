package bi;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public /* synthetic */ a8(h8 h8Var, int i7) {
        this.a = i7;
        this.b = h8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x7 x7Var = this.b.c;
                if (!x7Var.j.isEmpty()) {
                    x7Var.j.clear();
                    x7Var.m();
                    break;
                }
                break;
            case 1:
                x7 x7Var2 = this.b.c;
                if (!x7Var2.k.isEmpty()) {
                    x7Var2.k.clear();
                    x7Var2.m();
                    break;
                }
                break;
            case 2:
                x7 x7Var3 = this.b.c;
                if (!x7Var3.l.isEmpty()) {
                    x7Var3.l.clear();
                    x7Var3.m();
                    break;
                }
                break;
            case 3:
                this.b.c.p(w7.a);
                break;
            case 4:
                this.b.c.p(w7.b);
                break;
            default:
                this.b.c.p(w7.c);
                break;
        }
    }
}
