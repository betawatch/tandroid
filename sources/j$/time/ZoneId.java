package j$.time;

import j$.time.format.TextStyle;
import j$.time.format.w;
import j$.time.temporal.Temporal;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {
    public static final Map a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract void K(ObjectOutput objectOutput);

    public abstract String getId();

    public abstract ZoneRules getRules();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.P("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.P("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.P("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.P("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.P("AST", "America/Anchorage"), j$.com.android.tools.r8.a.P("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.P("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.P("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.P("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.P("CST", "America/Chicago"), j$.com.android.tools.r8.a.P("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.P("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.P("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.P("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.P("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.P("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.P("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.P("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.P("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.P("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.P("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.P("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.P("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.P("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.P("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.P("EST", "-05:00"), j$.com.android.tools.r8.a.P("MST", "-07:00"), j$.com.android.tools.r8.a.P("HST", "-10:00")};
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

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        Objects.requireNonNull(id, "zoneId");
        Map map = a;
        Objects.requireNonNull(map, "aliasMap");
        Object obj = (String) map.get(id);
        if (obj == null) {
            obj = Objects.requireNonNull(id, "defaultObj");
        }
        return of((String) obj);
    }

    public static ZoneId of(String str) {
        return H(str, true);
    }

    public static ZoneId I(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.c);
        }
        return new u(str, zoneOffset.getRules());
    }

    public static ZoneId H(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.M(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return J(str, 3, z);
        }
        if (str.startsWith("UT")) {
            return J(str, 2, z);
        }
        return u.L(str, z);
    }

    public static ZoneId J(String str, int i, boolean z) {
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return I(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return u.L(str, z);
        }
        try {
            ZoneOffset M = ZoneOffset.M(str.substring(i));
            if (M == ZoneOffset.UTC) {
                return I(substring, M);
            }
            return I(substring, M);
        } catch (b e) {
            throw new b("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static ZoneId E(Temporal temporal) {
        ZoneId zoneId = (ZoneId) temporal.r(j$.time.temporal.p.e);
        if (zoneId != null) {
            return zoneId;
        }
        throw new b("Unable to obtain ZoneId from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != u.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.b(new j$.time.format.o(textStyle));
        return pVar.l(locale, w.SMART, null).a(new t(0, this));
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

    public int hashCode() {
        return getId().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return getId();
    }

    private Object writeReplace() {
        return new p((byte) 7, this);
    }
}
