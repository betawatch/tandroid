package fd;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
