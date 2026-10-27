package ib;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class z0 extends fb.u {
    @Override // fb.u
    public final Object read(nb.a aVar) {
        int x9 = aVar.x();
        if (x9 != 9) {
            return x9 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.v())) : Boolean.valueOf(aVar.n());
        }
        aVar.t();
        return null;
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        bVar.p((Boolean) obj);
    }
}
