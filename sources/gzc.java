// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gzc extends s0d {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object n;

    public /* synthetic */ gzc(Object obj, byte b) {
        this.h = b;
        this.n = obj;
    }

    @Override // s0d
    public final void b() {
        switch (this.h) {
            case 0:
                hzc hzcVar = (hzc) ((b5a) this.n).b;
                hzcVar.b.b("unlinkToDeath", new Object[0]);
                hzcVar.n.asBinder().unlinkToDeath(hzcVar.k, 0);
                hzcVar.n = null;
                hzcVar.g = false;
                return;
            default:
                synchronized (((hzc) this.n).f) {
                    if (((hzc) this.n).l.get() > 0 && ((hzc) this.n).l.decrementAndGet() > 0) {
                        ((hzc) this.n).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                    hzc hzcVar2 = (hzc) this.n;
                    if (hzcVar2.n != null) {
                        hzcVar2.b.b("Unbind from service.", new Object[0]);
                        hzc hzcVar3 = (hzc) this.n;
                        hzcVar3.a.unbindService(hzcVar3.m);
                        hzcVar2 = (hzc) this.n;
                        hzcVar2.g = false;
                        hzcVar2.n = null;
                        hzcVar2.m = null;
                    }
                    hzcVar2.e();
                    return;
                }
        }
    }
}
