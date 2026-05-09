package j$.time;

import j$.time.format.TextStyle;
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

    abstract void K(ObjectOutput objectOutput);

    public abstract String getId();

    public abstract ZoneRules getRules();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.g("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.g("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.g("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.g("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.g("AST", "America/Anchorage"), j$.com.android.tools.r8.a.g("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.g("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.g("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.g("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.g("CST", "America/Chicago"), j$.com.android.tools.r8.a.g("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.g("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.g("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.g("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.g("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.g("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.g("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.g("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.g("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.g("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.g("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.g("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.g("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.g("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.g("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.g("EST", "-05:00"), j$.com.android.tools.r8.a.g("MST", "-07:00"), j$.com.android.tools.r8.a.g("HST", "-10:00")};
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
            str = str.concat(zoneOffset.getId());
        }
        return new v(str, ZoneRules.h(zoneOffset));
    }

    static ZoneId H(String str, boolean z) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.N(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return J(str, 3, z);
        }
        if (str.startsWith("UT")) {
            return J(str, 2, z);
        }
        return v.L(str, z);
    }

    private static ZoneId J(String str, int i, boolean z) {
        String substring = str.substring(0, i);
        if (str.length() == i) {
            return I(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return v.L(str, z);
        }
        try {
            ZoneOffset N = ZoneOffset.N(str.substring(i));
            if (N == ZoneOffset.UTC) {
                return I(substring, N);
            }
            return I(substring, N);
        } catch (c e) {
            throw new c("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public static ZoneId G(Temporal temporal) {
        ZoneId zoneId = (ZoneId) temporal.v(j$.time.temporal.l.j());
        if (zoneId != null) {
            return zoneId;
        }
        throw new c("Unable to obtain ZoneId from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName());
    }

    ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != v.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public String getDisplayName(TextStyle textStyle, Locale locale) {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.o(textStyle);
        return pVar.w(locale).a(new u(this));
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
        return new q((byte) 7, this);
    }
}
