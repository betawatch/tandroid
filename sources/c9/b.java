package c9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends h0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    public /* synthetic */ b(Object obj, int i3) {
        this.h = i3;
        this.n = obj;
    }

    @Override // c9.h0
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((bg.a) this.n).b;
                cVar.b.b("unlinkToDeath", new Object[0]);
                cVar.n.asBinder().unlinkToDeath(cVar.k, 0);
                cVar.n = null;
                cVar.g = false;
                return;
            default:
                synchronized (((c) this.n).f) {
                    try {
                        if (((c) this.n).l.get() > 0 && ((c) this.n).l.decrementAndGet() > 0) {
                            ((c) this.n).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.n;
                        if (cVar2.n != null) {
                            cVar2.b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.n;
                            cVar3.a.unbindService(cVar3.m);
                            c cVar4 = (c) this.n;
                            cVar4.g = false;
                            cVar4.n = null;
                            cVar4.m = null;
                        }
                        ((c) this.n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
