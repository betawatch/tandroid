package g5;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public interface m extends j {
    void addTransferListener(v0 v0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(p pVar);
}
