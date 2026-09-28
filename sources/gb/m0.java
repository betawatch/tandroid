package gb;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
