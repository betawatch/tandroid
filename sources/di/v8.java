package di;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;
    public final /* synthetic */ long c;

    public /* synthetic */ v8(w8 w8Var, long j3, int i7) {
        this.a = i7;
        this.b = w8Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w8 w8Var = this.b;
                w8Var.q.b0(w8Var.b, w8Var.c, this.c, true, true, w8Var.n);
                break;
            default:
                w8 w8Var2 = this.b;
                w8Var2.q.b0(w8Var2.b, w8Var2.c, this.c, true, true, w8Var2.n);
                break;
        }
    }
}
