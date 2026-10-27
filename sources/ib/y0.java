package ib;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class y0 implements fb.v {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ fb.u c;

    public y0(Class cls, Class cls2, fb.u uVar) {
        this.a = cls;
        this.b = cls2;
        this.c = uVar;
    }

    @Override // fb.v
    public final fb.u create(fb.g gVar, mb.a aVar) {
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
