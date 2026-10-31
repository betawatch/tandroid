package g2;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public interface h extends b2.p {
    void addTransferListener(d0 d0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(n nVar);
}
