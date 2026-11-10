package j2;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public interface h extends e2.n {
    void addTransferListener(d0 d0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(m mVar);
}
