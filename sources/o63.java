// default package

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public interface o63 extends g63 {
    void addTransferListener(vyb vybVar);

    void close();

    Map getResponseHeaders();

    Uri getUri();

    long open(u63 u63Var);
}
