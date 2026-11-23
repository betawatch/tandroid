package dd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // dd.j, dd.k
    public final /* bridge */ /* synthetic */ k b() {
        b();
        return this;
    }

    @Override // dd.j
    /* renamed from: k */
    public final j b() {
        super.b();
        this.k = new cd.c();
        return this;
    }

    @Override // dd.k
    public final String toString() {
        cd.c cVar = this.k;
        if (cVar == null || cVar.a <= 0) {
            return "<" + i() + ">";
        }
        return "<" + i() + " " + this.k.toString() + ">";
    }
}
