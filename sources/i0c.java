// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class i0c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b1c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ k27 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ i0c(b1c b1cVar, String str, k27 k27Var, long j, int i, byte b) {
        this.a = b;
        this.b = b1cVar;
        this.c = str;
        this.d = k27Var;
        this.e = j;
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        switch (b) {
            case 0:
                b1c b1cVar = this.b;
                k27 k27Var = this.d;
                long j = this.e;
                int i = this.f;
                cme.b(str, new l0c(b1cVar, k27Var, j, i), new l0c(b1cVar, k27Var, j, i), false);
                break;
            default:
                if (str == null) {
                    str = "und";
                }
                k27 k27Var2 = this.d;
                k27Var2.k.originalLanguage = str;
                b1c b1cVar2 = this.b;
                b1cVar2.getMessagesStorage().U1(this.e, k27Var2.k);
                b1cVar2.w.remove(Integer.valueOf(this.f));
                b1cVar2.e(k27Var2);
                break;
        }
    }
}
