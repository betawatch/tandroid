package gb;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
