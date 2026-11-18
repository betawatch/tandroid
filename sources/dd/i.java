package dd;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
