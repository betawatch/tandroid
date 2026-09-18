package ci;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class db implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oc b;

    public /* synthetic */ db(oc ocVar, int i10) {
        this.a = i10;
        this.b = ocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oc ocVar = this.b;
                ocVar.getClass();
                ocVar.g(1.0f, true, new ka(ocVar, 6));
                ocVar.b1.b(true, true);
                break;
            default:
                oc ocVar2 = this.b;
                ocVar2.f(false);
                ocVar2.m2 = null;
                break;
        }
    }
}
