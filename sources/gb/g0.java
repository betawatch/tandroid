package gb;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
