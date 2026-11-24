package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.ZoneOffset;
import j$.time.j;
import j$.time.l;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final l a;
    public final byte b;
    public final DayOfWeek c;
    public final j d;
    public final boolean e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(l lVar, int i, DayOfWeek dayOfWeek, j jVar, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = lVar;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = jVar;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    public static e a(DataInput dataInput) {
        l lVar;
        e eVar;
        j jVar;
        int readInt = dataInput.readInt();
        l w = l.w(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        DayOfWeek o = i2 == 0 ? null : DayOfWeek.o(i2);
        int i3 = (507904 & readInt) >>> 14;
        d dVar = d.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        if (i3 == 31) {
            long readInt2 = dataInput.readInt();
            j jVar2 = j.e;
            j$.time.temporal.a.SECOND_OF_DAY.o(readInt2);
            int i7 = (int) (readInt2 / 3600);
            lVar = w;
            eVar = null;
            long j = readInt2 - (i7 * 3600);
            jVar = j.q(i7, (int) (j / 60), (int) (j - (r2 * 60)), 0);
        } else {
            lVar = w;
            eVar = null;
            int i8 = i3 % 24;
            j jVar3 = j.e;
            j$.time.temporal.a.HOUR_OF_DAY.o(i8);
            jVar = j.h[i8];
        }
        ZoneOffset H = i4 == 255 ? ZoneOffset.H(dataInput.readInt()) : ZoneOffset.H((i4 - 128) * 900);
        ZoneOffset H2 = i5 == 3 ? ZoneOffset.H(dataInput.readInt()) : ZoneOffset.H((i5 * 1800) + H.getTotalSeconds());
        ZoneOffset H3 = ZoneOffset.H(i6 == 3 ? dataInput.readInt() : (i6 * 1800) + H.getTotalSeconds());
        boolean z = i3 == 24;
        l lVar2 = lVar;
        Objects.requireNonNull(lVar2, "month");
        Objects.requireNonNull(jVar, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(H, "standardOffset");
        Objects.requireNonNull(H2, "offsetBefore");
        Objects.requireNonNull(H3, "offsetAfter");
        if (i < -28 || i > 31 || i == 0) {
            j$.time.g.c("Day of month indicator must be between -28 and 31 inclusive excluding zero");
            return eVar;
        }
        if (z && !jVar.equals(j.g)) {
            j$.time.g.c("Time must be midnight when end of day flag is true");
            return eVar;
        }
        if (jVar.d == 0) {
            return new e(lVar2, i, o, jVar, z, dVar, H, H2, H3);
        }
        j$.time.g.c("Time's nano-of-second must be zero");
        return eVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int L = this.e ? 86400 : this.d.L();
        int totalSeconds = this.g.getTotalSeconds();
        int totalSeconds2 = this.h.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.i.getTotalSeconds() - totalSeconds;
        byte b = L % 3600 == 0 ? this.e ? (byte) 24 : this.d.a : (byte) 31;
        int i = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (b == 31) {
            dataOutput.writeInt(L);
        }
        if (i == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.h.getTotalSeconds());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.i.getTotalSeconds());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i);
    }

    public final int hashCode() {
        int L = ((this.d.L() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        return (((this.f.ordinal() + (L + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2))) ^ this.g.b) ^ this.h.b) ^ this.i.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.i.b - this.h.b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
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
