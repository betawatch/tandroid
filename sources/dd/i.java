package dd;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // dd.j, dd.k
    public final /* bridge */ /* synthetic */ k f() {
        f();
        return this;
    }

    @Override // dd.j
    /* renamed from: q */
    public final j f() {
        super.f();
        this.v = new cd.c();
        return this;
    }

    @Override // dd.k
    public final String toString() {
        cd.c cVar = this.v;
        if (cVar == null || cVar.a <= 0) {
            return "<" + o() + ">";
        }
        return "<" + o() + " " + this.v.toString() + ">";
    }
}
