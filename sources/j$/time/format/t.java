package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class t {
    public final Map a;

    public t(Map map) {
        this.a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l4 = (Long) entry2.getKey();
                ConcurrentHashMap concurrentHashMap = u.a;
                hashMap2.put(str, new AbstractMap.SimpleImmutableEntry(str2, l4));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, u.b);
            hashMap.put((TextStyle) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        Collections.sort(arrayList, u.b);
    }

    public final String a(long j3, TextStyle textStyle) {
        Map map = (Map) this.a.get(textStyle);
        if (map != null) {
            return (String) map.get(Long.valueOf(j3));
        }
        return null;
    }
}
