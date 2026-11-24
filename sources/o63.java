// default package

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public interface o63 extends g63 {
    void addTransferListener(vyb vybVar);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(u63 u63Var);
}
