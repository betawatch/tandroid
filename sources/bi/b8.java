package bi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;

    public /* synthetic */ b8(i8 i8Var, int i7) {
        this.a = i7;
        this.b = i8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y7 y7Var = this.b.c;
                if (!y7Var.j.isEmpty()) {
                    y7Var.j.clear();
                    y7Var.m();
                    break;
                }
                break;
            case 1:
                y7 y7Var2 = this.b.c;
                if (!y7Var2.k.isEmpty()) {
                    y7Var2.k.clear();
                    y7Var2.m();
                    break;
                }
                break;
            case 2:
                y7 y7Var3 = this.b.c;
                if (!y7Var3.l.isEmpty()) {
                    y7Var3.l.clear();
                    y7Var3.m();
                    break;
                }
                break;
            case 3:
                this.b.c.p(x7.a);
                break;
            case 4:
                this.b.c.p(x7.b);
                break;
            default:
                this.b.c.p(x7.c);
                break;
        }
    }
}
