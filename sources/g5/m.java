package g5;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public interface m extends j {
    void addTransferListener(v0 v0Var);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(p pVar);
}
