package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class p implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public p() {
    }

    public p(byte b10, Object obj) {
        this.a = b10;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.a);
                objectOutput.writeByte(localDate.b);
                objectOutput.writeByte(localDate.c);
                return;
            case 4:
                ((h) obj).V(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.a;
                objectOutput.writeInt(localDate2.a);
                objectOutput.writeByte(localDate2.b);
                objectOutput.writeByte(localDate2.c);
                localDateTime.b.V(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.a;
                LocalDate localDate3 = localDateTime2.a;
                objectOutput.writeInt(localDate3.a);
                objectOutput.writeByte(localDate3.b);
                objectOutput.writeByte(localDate3.c);
                localDateTime2.b.V(objectOutput);
                zonedDateTime.b.R(objectOutput);
                zonedDateTime.c.K(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((u) obj).b);
                return;
            case 8:
                ((ZoneOffset) obj).R(objectOutput);
                return;
            case 9:
                o oVar = (o) obj;
                oVar.a.V(objectOutput);
                oVar.b.R(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.a;
                LocalDate localDate4 = localDateTime3.a;
                objectOutput.writeInt(localDate4.a);
                objectOutput.writeByte(localDate4.b);
                objectOutput.writeByte(localDate4.c);
                localDateTime3.b.V(objectOutput);
                offsetDateTime.b.R(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((r) obj).a);
                return;
            case 12:
                YearMonth yearMonth = (YearMonth) obj;
                objectOutput.writeInt(yearMonth.a);
                objectOutput.writeByte(yearMonth.b);
                return;
            case 13:
                l lVar = (l) obj;
                objectOutput.writeByte(lVar.a);
                objectOutput.writeByte(lVar.b);
                return;
            case 14:
                Period period = (Period) obj;
                objectOutput.writeInt(period.a);
                objectOutput.writeInt(period.b);
                objectOutput.writeInt(period.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = a(readByte, objectInput);
    }

    public static Object a(byte b10, ObjectInput objectInput) {
        switch (b10) {
            case 1:
                Duration duration = Duration.c;
                long readLong = objectInput.readLong();
                long readInt = objectInput.readInt();
                return Duration.j(j$.com.android.tools.r8.a.O(readLong, j$.com.android.tools.r8.a.S(readInt, 1000000000L)), (int) j$.com.android.tools.r8.a.R(readInt, 1000000000L));
            case 2:
                Instant instant = Instant.c;
                return Instant.I(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return h.Q(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.J(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), h.Q(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.c;
                LocalDate localDate3 = LocalDate.d;
                LocalDateTime J = LocalDateTime.J(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), h.Q(objectInput));
                ZoneOffset Q = ZoneOffset.Q(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(J, "localDateTime");
                Objects.requireNonNull(Q, "offset");
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || Q.equals(zoneId)) {
                    return new ZonedDateTime(J, zoneId, Q);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i9 = u.d;
                return ZoneId.H(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.Q(objectInput);
            case 9:
                int i10 = o.c;
                return new o(h.Q(objectInput), ZoneOffset.Q(objectInput));
            case 10:
                int i11 = OffsetDateTime.c;
                LocalDate localDate4 = LocalDate.d;
                return new OffsetDateTime(LocalDateTime.J(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), h.Q(objectInput)), ZoneOffset.Q(objectInput));
            case 11:
                int i12 = r.b;
                return r.G(objectInput.readInt());
            case 12:
                int i13 = YearMonth.c;
                return YearMonth.of(objectInput.readInt(), objectInput.readByte());
            case 13:
                int i14 = l.c;
                byte readByte = objectInput.readByte();
                byte readByte2 = objectInput.readByte();
                j J2 = j.J(readByte);
                Objects.requireNonNull(J2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.w(readByte2);
                if (readByte2 <= J2.I()) {
                    return new l(J2.getValue(), readByte2);
                }
                throw new b("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + J2.name());
            case 14:
                Period period = Period.d;
                int readInt2 = objectInput.readInt();
                int readInt3 = objectInput.readInt();
                int readInt4 = objectInput.readInt();
                return ((readInt2 | readInt3) | readInt4) == 0 ? Period.d : new Period(readInt2, readInt3, readInt4);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }
}
