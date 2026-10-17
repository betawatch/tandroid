package hb;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
