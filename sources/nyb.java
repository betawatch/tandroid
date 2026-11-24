// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
