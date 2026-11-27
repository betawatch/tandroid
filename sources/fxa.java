// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fxa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hxa b;

    public /* synthetic */ fxa(hxa hxaVar, byte b) {
        this.a = b;
        this.b = hxaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hxa hxaVar = this.b;
        switch (b) {
            case 0:
                hxaVar.b();
                break;
            case 1:
                hxaVar.a();
                break;
            default:
                v21 v21Var = hxaVar.d;
                jxa jxaVar = hxaVar.q;
                fxa fxaVar = hxaVar.p;
                r47 r47Var = hxaVar.b;
                if (!hxaVar.l) {
                    hxaVar.l = true;
                    r47Var.f((int) hxaVar.k, hxaVar.c(), true);
                    long j = jxaVar.g;
                    int i = jxaVar.a;
                    jxaVar.g = j + hxaVar.k;
                    jn7.f(i).k(jn7.A3, new Object[0]);
                    hxaVar.k = 0L;
                    jn7.f(i).k(jn7.o1, Long.valueOf(r47.B0(r47Var.k)), Integer.valueOf(r47Var.e1()), r47Var.k.reactions);
                }
                if (!hxaVar.m) {
                    hxaVar.m = true;
                    hxaVar.f.b = 5000L;
                    hl.r(fxaVar);
                    hl.d3(fxaVar, 5000L);
                    v21Var.k(true);
                    v21Var.w = fxaVar;
                }
                hxaVar.e.b.setText(hxaVar.d());
                break;
        }
    }
}
