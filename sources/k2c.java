// default package

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class k2c {
    public final HashSet a = new HashSet();
    public final HashMap b = new HashMap();

    public static String c(int i, String str) {
        if (str.length() <= (i << 1) + 1) {
            return str;
        }
        return str.substring(0, i) + "…" + str.substring(str.length() - i);
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) this.b.get(str);
        return str2 == null ? str : str2;
    }

    public final void b(int i, ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            String c = c(i, str);
            ArrayList arrayList2 = (ArrayList) hashMap.get(c);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap.put(c, arrayList2);
            }
            arrayList2.add(str);
        }
        for (ArrayList arrayList3 : hashMap.values()) {
            if (arrayList3.size() == 1) {
                String str2 = (String) arrayList3.get(0);
                this.b.put(str2, c(i, str2));
            } else {
                b(i + 1, arrayList3);
            }
        }
    }
}
