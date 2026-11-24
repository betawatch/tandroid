// default package

import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class coe {
    public static int a(int i) {
        if (i >= 3) {
            return i < 1073741824 ? (int) Math.ceil(i / 0.75d) : ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        krd.b(i, "expectedSize");
        return i + 1;
    }

    public static boolean b(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}
