package ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends k {
    @Override // ad.k, ad.l
    public final /* bridge */ /* synthetic */ l b() {
        b();
        return this;
    }

    @Override // ad.k
    /* renamed from: k */
    public final k b() {
        super.b();
        this.k = new zc.b();
        return this;
    }

    @Override // ad.l
    public final String toString() {
        zc.b bVar = this.k;
        if (bVar == null || bVar.a <= 0) {
            return "<" + i() + ">";
        }
        return "<" + i() + " " + this.k.toString() + ">";
    }
}
