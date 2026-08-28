package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.ZoneOffset;
import j$.time.j;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
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

    public e(j jVar, int i9, DayOfWeek dayOfWeek, j$.time.h hVar, boolean z10, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = jVar;
        this.b = (byte) i9;
        this.c = dayOfWeek;
        this.d = hVar;
        this.e = z10;
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

    public final void b(DataOutput dataOutput) {
        byte b10;
        int S = this.e ? 86400 : this.d.S();
        int totalSeconds = this.g.getTotalSeconds();
        int totalSeconds2 = this.h.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.i.getTotalSeconds() - totalSeconds;
        if (S % 3600 == 0) {
            b10 = this.e ? (byte) 24 : this.d.a;
        } else {
            b10 = 31;
        }
        int i9 = totalSeconds % RichMessageLayout.PART_MAX_HEIGHT_DP == 0 ? (totalSeconds / RichMessageLayout.PART_MAX_HEIGHT_DP) + 128 : 255;
        int i10 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i11 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b10 << 14) + (this.f.ordinal() << 12) + (i9 << 4) + (i10 << 2) + i11);
        if (b10 == 31) {
            dataOutput.writeInt(S);
        }
        if (i9 == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i10 == 3) {
            dataOutput.writeInt(this.h.getTotalSeconds());
        }
        if (i11 == 3) {
            dataOutput.writeInt(this.i.getTotalSeconds());
        }
    }

    public static e a(DataInput dataInput) {
        d dVar;
        j$.time.h hVar;
        int readInt = dataInput.readInt();
        j J = j.J(readInt >>> 28);
        int i9 = ((264241152 & readInt) >>> 22) - 32;
        int i10 = (3670016 & readInt) >>> 19;
        DayOfWeek G = i10 == 0 ? null : DayOfWeek.G(i10);
        int i11 = (507904 & readInt) >>> 14;
        d dVar2 = d.values()[(readInt & 12288) >>> 12];
        int i12 = (readInt & 4080) >>> 4;
        int i13 = (readInt & 12) >>> 2;
        int i14 = readInt & 3;
        if (i11 == 31) {
            long readInt2 = dataInput.readInt();
            j$.time.h hVar2 = j$.time.h.e;
            j$.time.temporal.a.SECOND_OF_DAY.w(readInt2);
            int i15 = (int) (readInt2 / 3600);
            dVar = dVar2;
            long j10 = readInt2 - (i15 * 3600);
            hVar = j$.time.h.H(i15, (int) (j10 / 60), (int) (j10 - (r8 * 60)), 0);
        } else {
            dVar = dVar2;
            int i16 = i11 % 24;
            j$.time.h hVar3 = j$.time.h.e;
            j$.time.temporal.a.HOUR_OF_DAY.w(i16);
            hVar = j$.time.h.h[i16];
        }
        ZoneOffset O = ZoneOffset.O(i12 == 255 ? dataInput.readInt() : (i12 - 128) * RichMessageLayout.PART_MAX_HEIGHT_DP);
        ZoneOffset O2 = ZoneOffset.O(i13 == 3 ? dataInput.readInt() : (i13 * 1800) + O.getTotalSeconds());
        ZoneOffset O3 = ZoneOffset.O(i14 == 3 ? dataInput.readInt() : (i14 * 1800) + O.getTotalSeconds());
        boolean z10 = i11 == 24;
        Objects.requireNonNull(J, "month");
        Objects.requireNonNull(hVar, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(O, "standardOffset");
        Objects.requireNonNull(O2, "offsetBefore");
        Objects.requireNonNull(O3, "offsetAfter");
        if (i9 < -28 || i9 > 31 || i9 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z10 && !hVar.equals(j$.time.h.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (hVar.d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(J, i9, G, hVar, z10, dVar, O, O2, O3);
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
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.i.b - this.h.b > 0 ? "Gap " : "Overlap ");
        sb2.append(this.h);
        sb2.append(" to ");
        sb2.append(this.i);
        sb2.append(", ");
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek != null) {
            byte b10 = this.b;
            if (b10 == -1) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.a.name());
            } else if (b10 < 0) {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.b) - 1);
                sb2.append(" of ");
                sb2.append(this.a.name());
            } else {
                sb2.append(dayOfWeek.name());
                sb2.append(" on or after ");
                sb2.append(this.a.name());
                sb2.append(' ');
                sb2.append((int) this.b);
            }
        } else {
            sb2.append(this.a.name());
            sb2.append(' ');
            sb2.append((int) this.b);
        }
        sb2.append(" at ");
        sb2.append(this.e ? "24:00" : this.d.toString());
        sb2.append(" ");
        sb2.append(this.f);
        sb2.append(", standard offset ");
        sb2.append(this.g);
        sb2.append(']');
        return sb2.toString();
    }
}
