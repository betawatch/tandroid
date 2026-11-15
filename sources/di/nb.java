package di;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jc b;

    public /* synthetic */ nb(jc jcVar, int i7) {
        this.a = i7;
        this.b = jcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jc jcVar = this.b;
                jcVar.O1 = true;
                jcVar.J0(null);
                org.telegram.messenger.g0.i3(new nb(jcVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                tb tbVar = this.b.t1;
                tbVar.G = false;
                tbVar.invalidate();
                break;
        }
    }
}
