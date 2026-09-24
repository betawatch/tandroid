package gb;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
