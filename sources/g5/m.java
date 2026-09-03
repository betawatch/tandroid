package g5;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public interface m extends j {
    void addTransferListener(v0 v0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(p pVar);
}
