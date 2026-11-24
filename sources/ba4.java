// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ba4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ la4 c;

    public /* synthetic */ ba4(String str, la4 la4Var, byte b) {
        this.a = b;
        this.b = str;
        this.c = la4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        la4 la4Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                na4 e = ia4.e(str);
                e.b();
                la4 la4Var2 = e.l;
                if (la4Var2 != null && la4Var2.c == la4Var.c) {
                    e.l = null;
                }
                e.b.add(la4Var);
                e.c();
                if (e.h) {
                    ia4.d.cancelRunnable(e.d);
                    e.g = false;
                    e.h = false;
                }
                e.d(1000L);
                break;
            default:
                na4 e2 = ia4.e(str);
                e2.b();
                e2.l = la4Var;
                e2.c();
                break;
        }
    }
}
