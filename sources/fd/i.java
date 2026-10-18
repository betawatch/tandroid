package fd;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // fd.j, f2.f
    public final /* bridge */ /* synthetic */ f2.f b() {
        b();
        return this;
    }

    @Override // fd.j
    /* renamed from: k */
    public final j b() {
        super.b();
        this.k = new ed.c();
        return this;
    }

    @Override // f2.f
    public final String toString() {
        ed.c cVar = this.k;
        if (cVar == null || cVar.a <= 0) {
            return "<" + i() + ">";
        }
        return "<" + i() + " " + this.k.toString() + ">";
    }
}
