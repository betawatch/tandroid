package j2;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public interface h extends e2.n {
    void addTransferListener(c0 c0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(m mVar);
}
