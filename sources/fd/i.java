package fd;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class i extends j {
    @Override // fd.j, f2.e
    public final /* bridge */ /* synthetic */ f2.e b() {
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

    @Override // f2.e
    public final String toString() {
        ed.c cVar = this.k;
        if (cVar == null || cVar.a <= 0) {
            return "<" + i() + ">";
        }
        return "<" + i() + " " + this.k.toString() + ">";
    }
}
