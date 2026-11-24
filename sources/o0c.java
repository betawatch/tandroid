// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o0c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k47 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ o0c(k47 k47Var, long j, String str, byte b) {
        this.a = b;
        this.b = k47Var;
        this.c = j;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        long j = this.c;
        k47 k47Var = this.b;
        switch (b) {
            case 0:
                nm7 f = nm7.f(k47Var.K1);
                Long valueOf = Long.valueOf(j);
                Boolean bool = Boolean.TRUE;
                f.k(nm7.A1, k47Var, valueOf, str, bool, bool);
                break;
            default:
                v0c.f(k47Var, j, str);
                break;
        }
    }
}
