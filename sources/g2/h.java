package g2;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public interface h extends b2.o {
    void addTransferListener(c0 c0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(m mVar);
}
