package kg;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                org.telegram.messenger.g0.h3(gVar, 5000L);
                break;
        }
    }
}
