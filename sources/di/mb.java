package di;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic b;

    public /* synthetic */ mb(ic icVar, int i7) {
        this.a = i7;
        this.b = icVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ic icVar = this.b;
                icVar.O1 = true;
                icVar.J0(null);
                org.telegram.messenger.g0.i3(new mb(icVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                sb sbVar = this.b.t1;
                sbVar.G = false;
                sbVar.invalidate();
                break;
        }
    }
}
