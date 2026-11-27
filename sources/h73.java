// default package

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public interface h73 extends z63 {
    void addTransferListener(v2c v2cVar);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(n73 n73Var);
}
