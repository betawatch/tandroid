package lc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // lc.j, lc.k
    public final /* bridge */ /* synthetic */ k c() {
        c();
        return this;
    }

    @Override // lc.j
    /* renamed from: l */
    public final j c() {
        super.c();
        this.k = new kc.c();
        return this;
    }

    @Override // lc.k
    public final String toString() {
        kc.c cVar = this.k;
        if (cVar == null || cVar.a <= 0) {
            return "<" + j() + ">";
        }
        return "<" + j() + " " + this.k.toString() + ">";
    }
}
