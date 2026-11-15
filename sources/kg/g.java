package kg;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ g(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n.d0(this.b);
                break;
            case 1:
                n.e0(this.b);
                break;
            default:
                g gVar = this.b.e;
                org.telegram.messenger.g0.r(gVar);
                org.telegram.messenger.g0.i3(gVar, 5000L);
                break;
        }
    }
}
