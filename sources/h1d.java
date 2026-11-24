// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class h1d extends u2d {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object n;

    public /* synthetic */ h1d(Object obj, byte b) {
        this.h = b;
        this.n = obj;
    }

    @Override // u2d
    public final void b() {
        switch (this.h) {
            case 0:
                i1d i1dVar = (i1d) ((d7a) this.n).b;
                i1dVar.b.b("unlinkToDeath", new Object[0]);
                i1dVar.n.asBinder().unlinkToDeath(i1dVar.k, 0);
                i1dVar.n = null;
                i1dVar.g = false;
                return;
            default:
                synchronized (((i1d) this.n).f) {
                    if (((i1d) this.n).l.get() > 0 && ((i1d) this.n).l.decrementAndGet() > 0) {
                        ((i1d) this.n).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                    i1d i1dVar2 = (i1d) this.n;
                    if (i1dVar2.n != null) {
                        i1dVar2.b.b("Unbind from service.", new Object[0]);
                        i1d i1dVar3 = (i1d) this.n;
                        i1dVar3.a.unbindService(i1dVar3.m);
                        i1dVar2 = (i1d) this.n;
                        i1dVar2.g = false;
                        i1dVar2.n = null;
                        i1dVar2.m = null;
                    }
                    i1dVar2.e();
                    return;
                }
        }
    }
}
