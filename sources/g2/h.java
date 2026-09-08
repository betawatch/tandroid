package g2;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public interface h extends b2.k {
    void addTransferListener(c0 c0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(m mVar);
}
