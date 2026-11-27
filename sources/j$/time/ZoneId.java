package j$.time;

import j$.time.format.TextStyle;
import j$.time.temporal.Temporal;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public abstract class ZoneId implements Serializable {
    public static final Map a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {a.O("ACT", "Australia/Darwin"), a.O("AET", "Australia/Sydney"), a.O("AGT", "America/Argentina/Buenos_Aires"), a.O("ART", "Africa/Cairo"), a.O("AST", "America/Anchorage"), a.O("BET", "America/Sao_Paulo"), a.O("BST", "Asia/Dhaka"), a.O("CAT", "Africa/Harare"), a.O("CNT", "America/St_Johns"), a.O("CST", "America/Chicago"), a.O("CTT", "Asia/Shanghai"), a.O("EAT", "Africa/Addis_Ababa"), a.O("ECT", "Europe/Paris"), a.O("IET", "America/Indiana/Indianapolis"), a.O("IST", "Asia/Kolkata"), a.O("JST", "Asia/Tokyo"), a.O("MIT", "Pacific/Apia"), a.O("NET", "Asia/Yerevan"), a.O("NST", "Pacific/Auckland"), a.O("PLT", "Asia/Karachi"), a.O("PNT", "America/Phoenix"), a.O("PRT", "America/Puerto_Rico"), a.O("PST", "America/Los_Angeles"), a.O("SST", "Pacific/Guadalcanal"), a.O("VST", "Asia/Ho_Chi_Minh"), a.O("EST", "-05:00"), a.O("MST", "-07:00"), a.O("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        a = Collections.unmodifiableMap(hashMap);
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != w.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static ZoneId o(Temporal temporal) {
        ZoneId zoneId = (ZoneId) temporal.r(j$.time.temporal.p.e);
        if (zoneId != null) {
            return zoneId;
        }
        g.f("Unable to obtain ZoneId from TemporalAccessor: ", temporal, temporal.getClass().getName());
        return null;
    }

    public static ZoneId of(String str) {
        return q(str, true);
    }

    public static ZoneId q(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        return (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) ? ZoneOffset.F(str) : (str.startsWith("UTC") || str.startsWith("GMT")) ? w(str, 3, z) : str.startsWith("UT") ? w(str, 2, z) : w.C(str, z);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        Map map = a;
        Objects.requireNonNull(id, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        Object obj = (String) map.get(id);
        if (obj == null) {
            obj = Objects.requireNonNull(id, "defaultObj");
        }
        return of((String) obj);
    }

    public static ZoneId v(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            g.c("prefix should be GMT, UTC or UT, is: ".concat(str));
            return null;
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.c);
        }
        return new w(str, zoneOffset.getRules());
    }

    public static ZoneId w(String str, int i, boolean z) {
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return v(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return w.C(str, z);
        }
        try {
            ZoneOffset F = ZoneOffset.F(str.substring(i));
            return F == ZoneOffset.UTC ? v(substring, F) : v(substring, F);
        } catch (c e) {
            throw new c("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.b(new j$.time.format.o(textStyle));
        return pVar.l(locale, j$.time.format.w.SMART, null).a(new v((byte) 0, this));
    }

    public abstract String getId();

    public abstract ZoneRules getRules();

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return getId();
    }

    public abstract void x(DataOutput dataOutput);
}
