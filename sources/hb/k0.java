package hb;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class k0 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        if (aVar.x() != 9) {
            return new StringBuilder(aVar.v());
        }
        aVar.t();
        return null;
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        bVar.r(sb2 == null ? null : sb2.toString());
    }
}
