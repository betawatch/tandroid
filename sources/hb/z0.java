package hb;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class z0 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        int x10 = aVar.x();
        if (x10 != 9) {
            return x10 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.v())) : Boolean.valueOf(aVar.n());
        }
        aVar.t();
        return null;
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        bVar.p((Boolean) obj);
    }
}
