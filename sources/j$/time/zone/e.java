package j$.time.zone;

import j$.time.temporal.p;
import j$.util.A;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class e {
    private static final CopyOnWriteArrayList a;
    private static final ConcurrentHashMap b;

    protected abstract ZoneRules b(String str);

    protected abstract Set c();

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        a = copyOnWriteArrayList;
        b = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new c(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneRules a(String str, boolean z) {
        A.z(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = b;
        e eVar = (e) concurrentHashMap.get(str);
        if (eVar != null) {
            return eVar.b(str);
        }
        if (concurrentHashMap.isEmpty()) {
            throw new p("No time-zone data files registered");
        }
        throw new p("Unknown time-zone ID: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(e eVar) {
        A.z(eVar, "provider");
        for (String str : eVar.c()) {
            A.z(str, "zoneId");
            if (((e) b.putIfAbsent(str, eVar)) != null) {
                throw new p("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + eVar);
            }
        }
        a.add(eVar);
    }
}
