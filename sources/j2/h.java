package j2;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public interface h extends e2.n {
    void addTransferListener(d0 d0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(m mVar);
}
