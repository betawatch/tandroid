package org.telegram.ui.Wallet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t3 {
    public final HashSet a = new HashSet();
    public final HashMap b = new HashMap();

    public static String c(int i3, String str) {
        if (str.length() <= (i3 * 2) + 1) {
            return str;
        }
        return str.substring(0, i3) + "…" + str.substring(str.length() - i3);
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) this.b.get(str);
        return str2 == null ? str : str2;
    }

    public final void b(int i3, ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            String c2 = c(i3, str);
            ArrayList arrayList2 = (ArrayList) hashMap.get(c2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap.put(c2, arrayList2);
            }
            arrayList2.add(str);
        }
        for (ArrayList arrayList3 : hashMap.values()) {
            if (arrayList3.size() == 1) {
                String str2 = (String) arrayList3.get(0);
                this.b.put(str2, c(i3, str2));
            } else {
                b(i3 + 1, arrayList3);
            }
        }
    }
}
