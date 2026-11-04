package b8;

import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class pc {
    public static h4.f a(h4.f fVar, String[] strArr, Map map) {
        int i3 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (h4.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                h4.f fVar2 = new h4.f();
                int length = strArr.length;
                while (i3 < length) {
                    fVar2.a((h4.f) map.get(strArr[i3]));
                    i3++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((h4.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i3 < length2) {
                    fVar.a((h4.f) map.get(strArr[i3]));
                    i3++;
                }
            }
        }
        return fVar;
    }
}
