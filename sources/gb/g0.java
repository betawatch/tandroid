package gb;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public class g0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        int x10 = aVar.x();
        if (x10 != 9) {
            return x10 == 8 ? Boolean.toString(aVar.n()) : aVar.v();
        }
        aVar.t();
        return null;
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.r((String) obj);
    }
}
