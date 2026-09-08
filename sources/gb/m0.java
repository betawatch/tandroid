package gb;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class m0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() != 9) {
            return new StringBuffer(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        StringBuffer stringBuffer = (StringBuffer) obj;
        bVar.r(stringBuffer == null ? null : stringBuffer.toString());
    }
}
