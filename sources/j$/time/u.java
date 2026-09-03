package j$.time;

import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class u extends ZoneId {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 8386373296231747096L;
    public final String b;
    public final transient ZoneRules c;

    public static u L(String str, boolean z4) {
        ZoneRules zoneRules;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i10 == 0) && ((charAt < '0' || charAt > '9' || i10 == 0) && ((charAt != '~' || i10 == 0) && ((charAt != '.' || i10 == 0) && ((charAt != '_' || i10 == 0) && ((charAt != '+' || i10 == 0) && (charAt != '-' || i10 == 0))))))))) {
                    throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                zoneRules = j$.time.zone.h.a(str);
            } catch (j$.time.zone.f e) {
                if (z4) {
                    throw e;
                }
                zoneRules = null;
            }
            return new u(str, zoneRules);
        }
        throw new b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    public u(String str, ZoneRules zoneRules) {
        this.b = str;
        this.c = zoneRules;
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.b;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        ZoneRules zoneRules = this.c;
        return zoneRules != null ? zoneRules : j$.time.zone.h.a(this.b);
    }

    private Object writeReplace() {
        return new p((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void K(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.b);
    }
}
