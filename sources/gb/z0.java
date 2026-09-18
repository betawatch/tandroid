package gb;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public class z0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        int x10 = aVar.x();
        if (x10 != 9) {
            return x10 == 6 ? Boolean.valueOf(Boolean.parseBoolean(aVar.v())) : Boolean.valueOf(aVar.n());
        }
        aVar.t();
        return null;
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        bVar.p((Boolean) obj);
    }
}
