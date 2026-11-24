// default package

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class duc {
    public final String a;
    public final LinkedHashMap b;

    public duc(String str) {
        if (!nve.a(str)) {
            w26.j("'name' is not a valid token.");
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
