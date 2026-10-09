package org.telegram.ui.Wallet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w2 {
    public final HashSet a = new HashSet();
    public final HashMap b = new HashMap();

    public static String c(int i10, String str) {
        if (str.length() <= (i10 * 2) + 1) {
            return str;
        }
        return str.substring(0, i10) + "…" + str.substring(str.length() - i10);
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        String str2 = (String) this.b.get(str);
        return str2 == null ? str : str2;
    }

    public final void b(int i10, ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            String str = (String) obj;
            String c10 = c(i10, str);
            ArrayList arrayList2 = (ArrayList) hashMap.get(c10);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                hashMap.put(c10, arrayList2);
            }
            arrayList2.add(str);
        }
        for (ArrayList arrayList3 : hashMap.values()) {
            if (arrayList3.size() == 1) {
                String str2 = (String) arrayList3.get(0);
                this.b.put(str2, c(i10, str2));
            } else {
                b(i10 + 1, arrayList3);
            }
        }
    }
}
