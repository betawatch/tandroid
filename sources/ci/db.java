package ci;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
