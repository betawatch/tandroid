package oa;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y0 implements la.v {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ la.u c;

    public y0(Class cls, Class cls2, la.u uVar) {
        this.a = cls;
        this.b = cls2;
        this.c = uVar;
    }

    @Override // la.v
    public final la.u create(la.g gVar, sa.a aVar) {
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
