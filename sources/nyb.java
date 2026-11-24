// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class nyb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k27 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;

    public /* synthetic */ nyb(k27 k27Var, long j, String str, byte b) {
        this.a = b;
        this.b = k27Var;
        this.c = j;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        long j = this.c;
        k27 k27Var = this.b;
        switch (b) {
            case 0:
                kk7 f = kk7.f(k27Var.K1);
                Long valueOf = Long.valueOf(j);
                Boolean bool = Boolean.TRUE;
                f.k(kk7.z1, k27Var, valueOf, str, bool, bool);
                break;
            default:
                uyb.f(k27Var, j, str);
                break;
        }
    }
}
