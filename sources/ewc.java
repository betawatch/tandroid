// default package

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ewc {
    public final String a;
    public final LinkedHashMap b;

    public ewc(String str) {
        if (!pxe.a(str)) {
            u36.j("'name' is not a valid token.");
            throw null;
        }
        this.a = str;
        this.b = new LinkedHashMap();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        for (Map.Entry entry : this.b.entrySet()) {
            sb.append("; ");
            sb.append((String) entry.getKey());
            String str = (String) entry.getValue();
            if (str != null && str.length() != 0) {
                sb.append("=");
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
