package g2;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public interface h extends b2.p {
    void addTransferListener(c0 c0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(m mVar);
}
