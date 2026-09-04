package di;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class db implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pc b;

    public /* synthetic */ db(pc pcVar, int i10) {
        this.a = i10;
        this.b = pcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pc pcVar = this.b;
                pcVar.getClass();
                pcVar.g(1.0f, true, new ka(pcVar, 6));
                pcVar.b1.b(true, true);
                break;
            default:
                pc pcVar2 = this.b;
                pcVar2.f(false);
                pcVar2.m2 = null;
                break;
        }
    }
}
