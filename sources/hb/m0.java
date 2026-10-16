package hb;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class m0 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        if (aVar.x() != 9) {
            return new StringBuffer(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        StringBuffer stringBuffer = (StringBuffer) obj;
        bVar.r(stringBuffer == null ? null : stringBuffer.toString());
    }
}
