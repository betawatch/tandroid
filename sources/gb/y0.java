package gb;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
