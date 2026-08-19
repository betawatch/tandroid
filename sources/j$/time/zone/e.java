package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.ZoneOffset;
import j$.time.j;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RichMessageLayout;

/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final j a;
    public final byte b;
    public final DayOfWeek c;
    public final j$.time.h d;
    public final boolean e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(j jVar, int i, DayOfWeek dayOfWeek, j$.time.h hVar, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = jVar;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = hVar;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        j$.time.h hVar = this.d;
        boolean z = this.e;
        int S = z ? 86400 : hVar.S();
        int totalSeconds = this.g.getTotalSeconds();
        ZoneOffset zoneOffset = this.h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        ZoneOffset zoneOffset2 = this.i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        byte b = S % 3600 == 0 ? z ? (byte) 24 : hVar.a : (byte) 31;
        int i = totalSeconds % RichMessageLayout.PART_MAX_HEIGHT_DP == 0 ? (totalSeconds / RichMessageLayout.PART_MAX_HEIGHT_DP) + 128 : NotificationCenter.didReceiveSmsCode;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (b == 31) {
            objectOutput.writeInt(S);
        }
        if (i == 255) {
            objectOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            objectOutput.writeInt(zoneOffset.getTotalSeconds());
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset2.getTotalSeconds());
        }
    }

    public static e a(ObjectInput objectInput) {
        int i;
        d dVar;
        j$.time.h hVar;
        int readInt = objectInput.readInt();
        j J = j.J(readInt >>> 28);
        int i2 = ((264241152 & readInt) >>> 22) - 32;
        int i3 = (3670016 & readInt) >>> 19;
        DayOfWeek E = i3 == 0 ? null : DayOfWeek.E(i3);
        int i4 = (507904 & readInt) >>> 14;
        d dVar2 = d.values()[(readInt & 12288) >>> 12];
        int i5 = (readInt & 4080) >>> 4;
        int i6 = (readInt & 12) >>> 2;
        int i7 = readInt & 3;
        if (i4 == 31) {
            long readInt2 = objectInput.readInt();
            j$.time.h hVar2 = j$.time.h.e;
            j$.time.temporal.a.SECOND_OF_DAY.x(readInt2);
            int i8 = (int) (readInt2 / 3600);
            i = i7;
            long j = readInt2 - (i8 * 3600);
            dVar = dVar2;
            hVar = j$.time.h.H(i8, (int) (j / 60), (int) (j - (r1 * 60)), 0);
        } else {
            i = i7;
            dVar = dVar2;
            int i9 = i4 % 24;
            j$.time.h hVar3 = j$.time.h.e;
            j$.time.temporal.a.HOUR_OF_DAY.x(i9);
            hVar = j$.time.h.h[i9];
        }
        ZoneOffset O = i5 == 255 ? ZoneOffset.O(objectInput.readInt()) : ZoneOffset.O((i5 - 128) * RichMessageLayout.PART_MAX_HEIGHT_DP);
        ZoneOffset O2 = ZoneOffset.O(i6 == 3 ? objectInput.readInt() : (i6 * 1800) + O.getTotalSeconds());
        int i10 = i;
        ZoneOffset O3 = i10 == 3 ? ZoneOffset.O(objectInput.readInt()) : ZoneOffset.O((i10 * 1800) + O.getTotalSeconds());
        boolean z = i4 == 24;
        Objects.requireNonNull(J, "month");
        Objects.requireNonNull(hVar, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        Objects.requireNonNull(O, "standardOffset");
        Objects.requireNonNull(O2, "offsetBefore");
        Objects.requireNonNull(O3, "offsetAfter");
        if (i2 < -28 || i2 > 31 || i2 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !hVar.equals(j$.time.h.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (hVar.d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(J, i2, E, hVar, z, dVar3, O, O2, O3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int S = ((this.d.S() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        return ((this.g.b ^ (this.f.ordinal() + (S + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.h.b) ^ this.i.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        sb.append(zoneOffset2.b - zoneOffset.b > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        j jVar = this.a;
        byte b = this.b;
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek == null) {
            sb.append(jVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(jVar.name());
        } else if (b < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(jVar.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(jVar.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
