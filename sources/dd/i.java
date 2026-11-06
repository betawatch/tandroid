package dd;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
