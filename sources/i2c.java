// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class i2c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b3c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ k47 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ i2c(b3c b3cVar, String str, k47 k47Var, long j, int i, byte b) {
        this.a = b;
        this.b = b3cVar;
        this.c = str;
        this.d = k47Var;
        this.e = j;
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        switch (b) {
            case 0:
                b3c b3cVar = this.b;
                k47 k47Var = this.d;
                long j = this.e;
                int i = this.f;
                eoe.b(str, new l2c(b3cVar, k47Var, j, i), new l2c(b3cVar, k47Var, j, i), false);
                break;
            default:
                if (str == null) {
                    str = "und";
                }
                k47 k47Var2 = this.d;
                k47Var2.k.originalLanguage = str;
                b3c b3cVar2 = this.b;
                b3cVar2.getMessagesStorage().U1(this.e, k47Var2.k);
                b3cVar2.w.remove(Integer.valueOf(this.f));
                b3cVar2.e(k47Var2);
                break;
        }
    }
}
