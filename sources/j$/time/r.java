package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public r(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static Object a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                long readLong = objectInput.readLong();
                long readInt = objectInput.readInt();
                return Duration.j(a.N(readLong, a.Q(readInt, 1000000000L)), (int) a.P(readInt, 1000000000L));
            case 2:
                Instant instant = Instant.c;
                return Instant.v(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return j.J(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.w(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.J(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.c;
                LocalDate localDate3 = LocalDate.d;
                LocalDateTime w = LocalDateTime.w(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.J(objectInput));
                ZoneOffset J = ZoneOffset.J(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(w, "localDateTime");
                Objects.requireNonNull(J, "offset");
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || J.equals(zoneId)) {
                    return new ZonedDateTime(w, zoneId, J);
                }
                g.c("ZoneId must match ZoneOffset");
                return null;
            case 7:
                int i = w.d;
                return ZoneId.q(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.J(objectInput);
            case 9:
                int i2 = q.c;
                return new q(j.J(objectInput), ZoneOffset.J(objectInput));
            case 10:
                int i3 = OffsetDateTime.c;
                LocalDate localDate4 = LocalDate.d;
                return new OffsetDateTime(LocalDateTime.w(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.J(objectInput)), ZoneOffset.J(objectInput));
            case 11:
                int i4 = t.b;
                return t.o(objectInput.readInt());
            case 12:
                int i5 = YearMonth.c;
                return YearMonth.of(objectInput.readInt(), objectInput.readByte());
            case 13:
                int i6 = n.c;
                byte readByte = objectInput.readByte();
                byte readByte2 = objectInput.readByte();
                l w2 = l.w(readByte);
                Objects.requireNonNull(w2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.o(readByte2);
                if (readByte2 <= w2.v()) {
                    return new n(w2.getValue(), readByte2);
                }
                throw new c("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + w2.name());
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

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = a(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
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
                ((j) obj).O(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.a;
                objectOutput.writeInt(localDate2.a);
                objectOutput.writeByte(localDate2.b);
                objectOutput.writeByte(localDate2.c);
                localDateTime.b.O(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.a;
                LocalDate localDate3 = localDateTime2.a;
                objectOutput.writeInt(localDate3.a);
                objectOutput.writeByte(localDate3.b);
                objectOutput.writeByte(localDate3.c);
                localDateTime2.b.O(objectOutput);
                zonedDateTime.b.K(objectOutput);
                zonedDateTime.c.x(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((w) obj).b);
                return;
            case 8:
                ((ZoneOffset) obj).K(objectOutput);
                return;
            case 9:
                q qVar = (q) obj;
                qVar.a.O(objectOutput);
                qVar.b.K(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.a;
                LocalDate localDate4 = localDateTime3.a;
                objectOutput.writeInt(localDate4.a);
                objectOutput.writeByte(localDate4.b);
                objectOutput.writeByte(localDate4.c);
                localDateTime3.b.O(objectOutput);
                offsetDateTime.b.K(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((t) obj).a);
                return;
            case 12:
                YearMonth yearMonth = (YearMonth) obj;
                objectOutput.writeInt(yearMonth.a);
                objectOutput.writeByte(yearMonth.b);
                return;
            case 13:
                n nVar = (n) obj;
                objectOutput.writeByte(nVar.a);
                objectOutput.writeByte(nVar.b);
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

    public r() {
    }
}
