package b9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends i0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object n;

    public /* synthetic */ b(Object obj, int i10) {
        this.h = i10;
        this.n = obj;
    }

    @Override // b9.i0
    public final void b() {
        switch (this.h) {
            case 0:
                d dVar = (d) ((c) this.n).b;
                dVar.b.b("unlinkToDeath", new Object[0]);
                dVar.n.asBinder().unlinkToDeath(dVar.k, 0);
                dVar.n = null;
                dVar.g = false;
                return;
            default:
                synchronized (((d) this.n).f) {
                    try {
                        if (((d) this.n).l.get() > 0 && ((d) this.n).l.decrementAndGet() > 0) {
                            ((d) this.n).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        d dVar2 = (d) this.n;
                        if (dVar2.n != null) {
                            dVar2.b.b("Unbind from service.", new Object[0]);
                            d dVar3 = (d) this.n;
                            dVar3.a.unbindService(dVar3.m);
                            d dVar4 = (d) this.n;
                            dVar4.g = false;
                            dVar4.n = null;
                            dVar4.m = null;
                        }
                        ((d) this.n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
