package hi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;

    public /* synthetic */ k9(sa saVar, int i7) {
        this.a = i7;
        this.b = saVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sa saVar = this.b;
                saVar.getClass();
                saVar.f(1.0f, true, new s8(saVar, 6));
                saVar.c1.b(true, true);
                break;
            default:
                sa saVar2 = this.b;
                saVar2.e(false);
                saVar2.n2 = null;
                break;
        }
    }
}
