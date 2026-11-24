// default package

import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class awe {
    public static r2c a(r2c r2cVar, String[] strArr, Map map) {
        int i = 0;
        if (r2cVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (r2c) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                r2c r2cVar2 = new r2c();
                int length = strArr.length;
                while (i < length) {
                    r2cVar2.a((r2c) map.get(strArr[i]));
                    i++;
                }
                return r2cVar2;
            }
        } else if (strArr != null) {
            if (strArr.length == 1) {
                r2cVar.a((r2c) map.get(strArr[0]));
                return r2cVar;
            }
            if (strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    r2cVar.a((r2c) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return r2cVar;
    }
}
