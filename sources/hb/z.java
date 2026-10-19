package hb;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class z implements eb.v {
    public final lb.a a;
    public final boolean b;
    public final Class c;
    public final eb.o d;

    public z(Object obj, lb.a aVar, boolean z10, Class cls) {
        eb.o oVar = obj instanceof eb.o ? (eb.o) obj : null;
        this.d = oVar;
        gb.d.b(oVar != null);
        this.a = aVar;
        this.b = z10;
        this.c = cls;
    }

    @Override // eb.v
    public final eb.u create(eb.g gVar, lb.a aVar) {
        lb.a aVar2 = this.a;
        if (aVar2 != null ? aVar2.equals(aVar) || (this.b && aVar2.b == aVar.a) : this.c.isAssignableFrom(aVar.a)) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
