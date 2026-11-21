package bi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ o5(n6 n6Var, int i7, int i10) {
        this.a = i10;
        this.b = n6Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f.scrollBy(0, this.c);
                break;
            default:
                g6 g6Var = this.b.f;
                if (g6Var != null) {
                    g6Var.setSpanCount(this.c);
                    break;
                }
                break;
        }
    }
}
