package nc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // nc.j, nc.k
    public final /* bridge */ /* synthetic */ k c() {
        c();
        return this;
    }

    @Override // nc.j
    /* renamed from: l */
    public final j c() {
        super.c();
        this.k = new mc.b();
        return this;
    }

    @Override // nc.k
    public final String toString() {
        mc.b bVar = this.k;
        if (bVar == null || bVar.a <= 0) {
            return "<" + j() + ">";
        }
        return "<" + j() + " " + this.k.toString() + ">";
    }
}
