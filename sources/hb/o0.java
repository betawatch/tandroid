package hb;

import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public class o0 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            String v = aVar.v();
            if (v.equals("null")) {
                return null;
            }
            return new URI(v);
        } catch (URISyntaxException e) {
            throw new eb.j(e);
        }
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        URI uri = (URI) obj;
        bVar.r(uri == null ? null : uri.toASCIIString());
    }
}
