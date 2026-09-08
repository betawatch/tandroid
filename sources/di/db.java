package di;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
