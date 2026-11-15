package hi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c9(sa saVar, boolean z10, int i7) {
        this.a = i7;
        this.b = saVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                sa saVar = this.b;
                if (!this.c) {
                    saVar.K0.b(false, false);
                    break;
                } else {
                    saVar.getClass();
                    break;
                }
            default:
                sa saVar2 = this.b;
                saVar2.S = null;
                saVar2.e = false;
                saVar2.p(this.c);
                break;
        }
    }
}
