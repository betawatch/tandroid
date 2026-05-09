package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.k;
import j$.time.temporal.n;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    private final k a;
    private final byte b;
    private final DayOfWeek c;
    private final j$.time.i d;
    private final boolean e;
    private final d f;
    private final ZoneOffset g;
    private final ZoneOffset h;
    private final ZoneOffset i;

    e(k kVar, int i, DayOfWeek dayOfWeek, j$.time.i iVar, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = kVar;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = iVar;
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

    final void writeExternal(ObjectOutput objectOutput) {
        j$.time.i iVar = this.d;
        boolean z = this.e;
        int X = z ? 86400 : iVar.X();
        int totalSeconds = this.g.getTotalSeconds();
        ZoneOffset zoneOffset = this.h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        ZoneOffset zoneOffset2 = this.i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        int K = X % 3600 == 0 ? z ? 24 : iVar.K() : 31;
        int i = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : NotificationCenter.didReceiveCall;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (K << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (K == 31) {
            objectOutput.writeInt(X);
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

    static e b(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        k J = k.J(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        DayOfWeek G = i2 == 0 ? null : DayOfWeek.G(i2);
        int i3 = (507904 & readInt) >>> 14;
        d dVar = d.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        j$.time.i P = i3 == 31 ? j$.time.i.P(objectInput.readInt()) : j$.time.i.N(i3 % 24);
        ZoneOffset P2 = ZoneOffset.P(i4 == 255 ? objectInput.readInt() : (i4 - 128) * 900);
        ZoneOffset P3 = i5 == 3 ? ZoneOffset.P(objectInput.readInt()) : ZoneOffset.P((i5 * 1800) + P2.getTotalSeconds());
        ZoneOffset P4 = i6 == 3 ? ZoneOffset.P(objectInput.readInt()) : ZoneOffset.P((i6 * 1800) + P2.getTotalSeconds());
        boolean z = i3 == 24;
        Objects.requireNonNull(J, "month");
        Objects.requireNonNull(P, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        Objects.requireNonNull(P2, "standardOffset");
        Objects.requireNonNull(P3, "offsetBefore");
        Objects.requireNonNull(P4, "offsetAfter");
        if (i < -28 || i > 31 || i == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !P.equals(j$.time.i.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (P.L() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(J, i, G, P, z, dVar, P2, P3, P4);
    }

    public final b a(int i) {
        LocalDate S;
        DayOfWeek dayOfWeek = this.c;
        k kVar = this.a;
        byte b = this.b;
        if (b < 0) {
            s.d.getClass();
            S = LocalDate.S(i, kVar, kVar.H(s.n(i)) + 1 + b);
            if (dayOfWeek != null) {
                final int value = dayOfWeek.getValue();
                final int i2 = 1;
                S = (LocalDate) new n() { // from class: j$.time.temporal.o
                    @Override // j$.time.temporal.n
                    public final Temporal x(Temporal temporal) {
                        switch (i2) {
                            case 0:
                                int l = temporal.l(a.DAY_OF_WEEK);
                                int i3 = value;
                                if (l == i3) {
                                    return temporal;
                                }
                                return temporal.e(l - i3 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                            default:
                                int l2 = temporal.l(a.DAY_OF_WEEK);
                                int i4 = value;
                                if (l2 == i4) {
                                    return temporal;
                                }
                                return temporal.k(i4 - l2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                        }
                    }
                }.x(S);
            }
        } else {
            S = LocalDate.S(i, kVar, b);
            if (dayOfWeek != null) {
                final int value2 = dayOfWeek.getValue();
                final int i3 = 0;
                S = (LocalDate) new n() { // from class: j$.time.temporal.o
                    @Override // j$.time.temporal.n
                    public final Temporal x(Temporal temporal) {
                        switch (i3) {
                            case 0:
                                int l = temporal.l(a.DAY_OF_WEEK);
                                int i32 = value2;
                                if (l == i32) {
                                    return temporal;
                                }
                                return temporal.e(l - i32 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
                            default:
                                int l2 = temporal.l(a.DAY_OF_WEEK);
                                int i4 = value2;
                                if (l2 == i4) {
                                    return temporal;
                                }
                                return temporal.k(i4 - l2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
                        }
                    }
                }.x(S);
            }
        }
        if (this.e) {
            S = S.plusDays(1L);
        }
        LocalDateTime O = LocalDateTime.O(S, this.d);
        d dVar = this.f;
        dVar.getClass();
        int i4 = c.a[dVar.ordinal()];
        ZoneOffset zoneOffset = this.h;
        if (i4 == 1) {
            O = O.R(zoneOffset.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
        } else if (i4 == 2) {
            O = O.R(zoneOffset.getTotalSeconds() - this.g.getTotalSeconds());
        }
        return new b(O, zoneOffset, this.i);
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
        int X = ((this.d.X() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        return ((this.g.hashCode() ^ (this.f.ordinal() + (X + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        k kVar = this.a;
        byte b = this.b;
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek == null) {
            sb.append(kVar.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(kVar.name());
        } else if (b < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(kVar.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(kVar.name());
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
