// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class h4c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a5c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ r47 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ h4c(a5c a5cVar, String str, r47 r47Var, long j, int i, byte b) {
        this.a = b;
        this.b = a5cVar;
        this.c = str;
        this.d = r47Var;
        this.e = j;
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        switch (b) {
            case 0:
                a5c a5cVar = this.b;
                r47 r47Var = this.d;
                long j = this.e;
                int i = this.f;
                xqe.b(str, new l4c(a5cVar, r47Var, j, i), new l4c(a5cVar, r47Var, j, i), false);
                break;
            default:
                if (str == null) {
                    str = "und";
                }
                r47 r47Var2 = this.d;
                r47Var2.k.originalLanguage = str;
                a5c a5cVar2 = this.b;
                a5cVar2.getMessagesStorage().Z1(this.e, r47Var2.k);
                a5cVar2.w.remove(Integer.valueOf(this.f));
                a5cVar2.e(r47Var2);
                break;
        }
    }
}
