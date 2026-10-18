package hb;

import java.net.URL;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class n0 extends eb.u {
    @Override // eb.u
    public final Object read(mb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.equals("null")) {
            return null;
        }
        return new URL(v);
    }

    @Override // eb.u
    public final void write(mb.b bVar, Object obj) {
        URL url = (URL) obj;
        bVar.r(url == null ? null : url.toExternalForm());
    }
}
