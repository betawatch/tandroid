package ib;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class k0 extends fb.u {
    @Override // fb.u
    public final Object read(nb.a aVar) {
        if (aVar.x() != 9) {
            return new StringBuilder(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        bVar.r(sb2 == null ? null : sb2.toString());
    }
}
