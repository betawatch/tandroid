package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes2.dex */
final class h extends i {
    private final Set c;

    h() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.c = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.i
    protected final Set c() {
        return this.c;
    }

    @Override // j$.time.zone.i
    protected final ZoneRules b(String str) {
        if (this.c.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new f("Not a built-in time zone: " + str);
    }
}
