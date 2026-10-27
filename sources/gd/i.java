package gd;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
