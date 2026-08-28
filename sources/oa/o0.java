package oa;

import java.net.URI;
import java.net.URISyntaxException;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class o0 extends la.u {
    @Override // la.u
    public final Object read(ta.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        try {
            String v = aVar.v();
            if (v.equals(BuildConfig.BETA_URL)) {
                return null;
            }
            return new URI(v);
        } catch (URISyntaxException e10) {
            throw new la.j(e10);
        }
    }

    @Override // la.u
    public final void write(ta.c cVar, Object obj) {
        URI uri = (URI) obj;
        cVar.r(uri == null ? null : uri.toASCIIString());
    }
}
