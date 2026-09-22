package gb;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class e0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() != 9) {
            return Double.valueOf(aVar.o());
        }
        aVar.t();
        return null;
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.i();
        } else {
            bVar.n(number.doubleValue());
        }
    }
}
