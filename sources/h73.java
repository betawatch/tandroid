// default package

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public interface h73 extends z63 {
    void addTransferListener(v2c v2cVar);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(n73 n73Var);
}
