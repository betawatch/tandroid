package j$.time.zone;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class h {
    public static final CopyOnWriteArrayList b;
    public static final ConcurrentHashMap c;
    public final Set a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        b = copyOnWriteArrayList;
        c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new g(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public h() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.a = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneRules a(String str) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = c;
        h hVar = (h) concurrentHashMap.get(str);
        if (hVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new f("No time-zone data files registered");
            }
            throw new f("Unknown time-zone ID: " + str);
        }
        if (hVar.a.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new f("Not a built-in time zone: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(h hVar) {
        Objects.requireNonNull(hVar, "provider");
        synchronized (h.class) {
            for (String str : hVar.a) {
                Objects.requireNonNull(str, "zoneId");
                if (((h) c.putIfAbsent(str, hVar)) != null) {
                    throw new f("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + hVar);
                }
            }
            Collections.unmodifiableSet(new HashSet(c.keySet()));
        }
        b.add(hVar);
    }
}
