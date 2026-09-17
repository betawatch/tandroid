package dd;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
