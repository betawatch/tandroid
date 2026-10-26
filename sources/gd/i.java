package gd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // gd.j, f2.f
    public final /* bridge */ /* synthetic */ f2.f b() {
        b();
        return this;
    }

    @Override // gd.j
    /* renamed from: k */
    public final j b() {
        super.b();
        this.k = new fd.c();
        return this;
    }

    @Override // f2.f
    public final String toString() {
        fd.c cVar = this.k;
        if (cVar == null || cVar.a <= 0) {
            return "<" + i() + ">";
        }
        return "<" + i() + " " + this.k.toString() + ">";
    }
}
