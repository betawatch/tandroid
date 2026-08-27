package mc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // mc.j, mc.k
    public final /* bridge */ /* synthetic */ k c() {
        c();
        return this;
    }

    @Override // mc.j
    /* renamed from: l */
    public final j c() {
        super.c();
        this.k = new lc.b();
        return this;
    }

    @Override // mc.k
    public final String toString() {
        lc.b bVar = this.k;
        if (bVar == null || bVar.a <= 0) {
            return "<" + j() + ">";
        }
        return "<" + j() + " " + this.k.toString() + ">";
    }
}
