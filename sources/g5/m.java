package g5;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public interface m extends j {
    void addTransferListener(v0 v0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(p pVar);
}
