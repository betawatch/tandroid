package ib;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
