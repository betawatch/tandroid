package ib;

import java.net.URL;
import org.telegram.messenger.BuildConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class n0 extends fb.u {
    @Override // fb.u
    public final Object read(nb.a aVar) {
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

    @Override // fb.u
    public final void write(nb.b bVar, Object obj) {
        URL url = (URL) obj;
        bVar.r(url == null ? null : url.toExternalForm());
    }
}
