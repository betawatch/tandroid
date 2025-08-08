package j$.time.zone;

import j$.time.temporal.p;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes2.dex */
final class d extends e {
    private final Set c;

    d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.c = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.e
    protected final Set c() {
        return this.c;
    }

    @Override // j$.time.zone.e
    protected final ZoneRules b(String str) {
        if (this.c.contains(str)) {
            return new ZoneRules(TimeZone.getTimeZone(str));
        }
        throw new p("Not a built-in time zone: " + str);
    }
}
