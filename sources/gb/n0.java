package gb;

import java.net.URL;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public class n0 extends db.u {
    @Override // db.u
    public final Object read(lb.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        String v = aVar.v();
        if (v.equals(BuildConfig.BETA_URL)) {
            return null;
        }
        return new URL(v);
    }

    @Override // db.u
    public final void write(lb.b bVar, Object obj) {
        URL url = (URL) obj;
        bVar.r(url == null ? null : url.toExternalForm());
    }
}
