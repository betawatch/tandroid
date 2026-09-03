package c9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s implements ba.b {
    public static final af.a c = new af.a(7);
    public static final h d = new h(1);
    public ba.a a;
    public volatile ba.b b;

    public s(af.a aVar, ba.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final void a(ba.a aVar) {
        ba.b bVar;
        ba.b bVar2;
        ba.b bVar3 = this.b;
        h hVar = d;
        if (bVar3 != hVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != hVar) {
                bVar2 = bVar;
            } else {
                this.a = new c1.b(1, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override // ba.b
    public final Object get() {
        return this.b.get();
    }
}
