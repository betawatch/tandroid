package a8;

import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class cc {
    public static f4.f a(f4.f fVar, String[] strArr, Map map) {
        int i10 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (f4.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                f4.f fVar2 = new f4.f();
                int length = strArr.length;
                while (i10 < length) {
                    fVar2.a((f4.f) map.get(strArr[i10]));
                    i10++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((f4.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    fVar.a((f4.f) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return fVar;
    }
}
