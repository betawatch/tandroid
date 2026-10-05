package gb;

import java.net.URI;
import java.net.URISyntaxException;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        } catch (URISyntaxException e7) {
            throw new db.j(e7);
        }
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        URI uri = (URI) obj;
        bVar.r(uri == null ? null : uri.toASCIIString());
    }
}
