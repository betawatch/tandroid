package gb;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class z implements db.v {
    public final kb.a a;
    public final boolean b;
    public final Class c;
    public final db.o d;

    public z(Object obj, kb.a aVar, boolean z10, Class cls) {
        db.o oVar = obj instanceof db.o ? (db.o) obj : null;
        this.d = oVar;
        fb.d.b(oVar != null);
        this.a = aVar;
        this.b = z10;
        this.c = cls;
    }

    @Override // db.v
    public final db.u create(db.g gVar, kb.a aVar) {
        kb.a aVar2 = this.a;
        if (aVar2 != null ? aVar2.equals(aVar) || (this.b && aVar2.b == aVar.a) : this.c.isAssignableFrom(aVar.a)) {
            return new a0(this.d, gVar, aVar, this, true);
        }
        return null;
    }
}
