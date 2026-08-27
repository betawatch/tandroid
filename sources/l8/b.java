package l8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends g0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    public /* synthetic */ b(Object obj, int i10) {
        this.h = i10;
        this.n = obj;
    }

    @Override // l8.g0
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ef.a) this.n).b;
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
