// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n2c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r47 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ n2c(r47 r47Var, long j, String str, byte b) {
        this.a = b;
        this.b = r47Var;
        this.c = j;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        long j = this.c;
        r47 r47Var = this.b;
        switch (b) {
            case 0:
                jn7 f = jn7.f(r47Var.K1);
                Long valueOf = Long.valueOf(j);
                Boolean bool = Boolean.TRUE;
                f.k(jn7.A1, r47Var, valueOf, str, bool, bool);
                break;
            default:
                u2c.f(r47Var, j, str);
                break;
        }
    }
}
