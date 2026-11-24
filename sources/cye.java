// default package

import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class cye {
    public static r4c a(r4c r4cVar, String[] strArr, Map map) {
        int i = 0;
        if (r4cVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (r4c) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                r4c r4cVar2 = new r4c();
                int length = strArr.length;
                while (i < length) {
                    r4cVar2.a((r4c) map.get(strArr[i]));
                    i++;
                }
                return r4cVar2;
            }
        } else if (strArr != null) {
            if (strArr.length == 1) {
                r4cVar.a((r4c) map.get(strArr[0]));
                return r4cVar;
            }
            if (strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    r4cVar.a((r4c) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return r4cVar;
    }
}
