package gb;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class y0 implements db.v {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ db.u c;

    public y0(Class cls, Class cls2, db.u uVar) {
        this.a = cls;
        this.b = cls2;
        this.c = uVar;
    }

    @Override // db.v
    public final db.u create(db.g gVar, kb.a aVar) {
        Class cls = aVar.a;
        if (cls == this.a || cls == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
    }
}
