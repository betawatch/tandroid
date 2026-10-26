package ib;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class z implements fb.v {
    public final mb.a a;
    public final boolean b;
    public final Class c;
    public final fb.o d;

    public z(Object obj, mb.a aVar, boolean z10, Class cls) {
        fb.o oVar = obj instanceof fb.o ? (fb.o) obj : null;
        this.d = oVar;
        hb.d.b(oVar != null);
        this.a = aVar;
        this.b = z10;
        this.c = cls;
    }

    @Override // fb.v
    public final fb.u create(fb.g gVar, mb.a aVar) {
        mb.a aVar2 = this.a;
        if (aVar2 != null ? aVar2.equals(aVar) || (this.b && aVar2.b == aVar.a) : this.c.isAssignableFrom(aVar.a)) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
