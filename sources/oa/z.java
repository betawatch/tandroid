package oa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z implements la.v {
    public final sa.a a;
    public final boolean b;
    public final Class c;
    public final la.o d;

    public z(Object obj, sa.a aVar, boolean z10, Class cls) {
        la.o oVar = obj instanceof la.o ? (la.o) obj : null;
        this.d = oVar;
        na.d.b(oVar != null);
        this.a = aVar;
        this.b = z10;
        this.c = cls;
    }

    @Override // la.v
    public final la.u create(la.g gVar, sa.a aVar) {
        sa.a aVar2 = this.a;
        if (aVar2 != null ? aVar2.equals(aVar) || (this.b && aVar2.b == aVar.a) : this.c.isAssignableFrom(aVar.a)) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
