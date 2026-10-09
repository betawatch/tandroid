package ed;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // ed.j, ed.k
    public final /* bridge */ /* synthetic */ k b() {
        b();
        return this;
    }

    @Override // ed.j
    /* renamed from: k */
    public final j b() {
        super.b();
        this.k = new dd.c();
        return this;
    }

    @Override // ed.k
    public final String toString() {
        dd.c cVar = this.k;
        if (cVar == null || cVar.a <= 0) {
            return "<" + i() + ">";
        }
        return "<" + i() + " " + this.k.toString() + ">";
    }
}
