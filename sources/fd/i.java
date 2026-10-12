package fd;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
