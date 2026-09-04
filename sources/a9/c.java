package a9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class c extends j0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    public /* synthetic */ c(Object obj, int i10) {
        this.h = i10;
        this.n = obj;
    }

    @Override // a9.j0
    public final void b() {
        switch (this.h) {
            case 0:
                e eVar = (e) ((d) this.n).b;
                eVar.b.b("unlinkToDeath", new Object[0]);
                eVar.n.asBinder().unlinkToDeath(eVar.k, 0);
                eVar.n = null;
                eVar.g = false;
                return;
            default:
                synchronized (((e) this.n).f) {
                    try {
                        if (((e) this.n).l.get() > 0 && ((e) this.n).l.decrementAndGet() > 0) {
                            ((e) this.n).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.n;
                        if (eVar2.n != null) {
                            eVar2.b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.n;
                            eVar3.a.unbindService(eVar3.m);
                            e eVar4 = (e) this.n;
                            eVar4.g = false;
                            eVar4.n = null;
                            eVar4.m = null;
                        }
                        ((e) this.n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
