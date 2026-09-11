package dd;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
