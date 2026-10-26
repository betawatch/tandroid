package ib;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
