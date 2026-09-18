package gb;

import java.net.URI;
import java.net.URISyntaxException;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public class o0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
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
        } catch (URISyntaxException e) {
            throw new db.j(e);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        URI uri = (URI) obj;
        bVar.r(uri == null ? null : uri.toASCIIString());
    }
}
