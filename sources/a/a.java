package a;

import a5.i;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a {
    public static i a(i iVar, String[] strArr, Map map) {
        int i10 = 0;
        if (iVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (i) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                i iVar2 = new i();
                int length = strArr.length;
                while (i10 < length) {
                    iVar2.a((i) map.get(strArr[i10]));
                    i10++;
                }
                return iVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                iVar.a((i) map.get(strArr[0]));
                return iVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    iVar.a((i) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return iVar;
    }
}
