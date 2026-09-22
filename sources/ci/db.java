package ci;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
