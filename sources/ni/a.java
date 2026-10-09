package ni;

import ai.h7;
import android.util.SparseArray;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class a {
    public SparseArray a;

    public final void a(HashMap hashMap) {
        if (this.a != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                this.a.put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
            }
            return;
        }
        this.a = new SparseArray(hashMap.size());
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new h7(4)));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Map.Entry entry2 = (Map.Entry) obj;
            this.a.append(((String) entry2.getKey()).hashCode(), (String) entry2.getValue());
        }
    }
}
