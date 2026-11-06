package c8;

import java.util.Map;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class l0 {
    public static i4.f a(i4.f fVar, String[] strArr, Map map) {
        int i7 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (i4.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                i4.f fVar2 = new i4.f();
                int length = strArr.length;
                while (i7 < length) {
                    fVar2.a((i4.f) map.get(strArr[i7]));
                    i7++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((i4.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i7 < length2) {
                    fVar.a((i4.f) map.get(strArr[i7]));
                    i7++;
                }
            }
        }
        return fVar;
    }
}
