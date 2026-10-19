package g2;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public interface h extends b2.o {
    void addTransferListener(c0 c0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(m mVar);
}
