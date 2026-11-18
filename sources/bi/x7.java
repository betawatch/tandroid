package bi;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ x7(e8 e8Var, int i7) {
        this.a = i7;
        this.b = e8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u7 u7Var = this.b.c;
                if (!u7Var.j.isEmpty()) {
                    u7Var.j.clear();
                    u7Var.m();
                    break;
                }
                break;
            case 1:
                u7 u7Var2 = this.b.c;
                if (!u7Var2.k.isEmpty()) {
                    u7Var2.k.clear();
                    u7Var2.m();
                    break;
                }
                break;
            case 2:
                u7 u7Var3 = this.b.c;
                if (!u7Var3.l.isEmpty()) {
                    u7Var3.l.clear();
                    u7Var3.m();
                    break;
                }
                break;
            case 3:
                this.b.c.p(t7.a);
                break;
            case 4:
                this.b.c.p(t7.b);
                break;
            default:
                this.b.c.p(t7.c);
                break;
        }
    }
}
