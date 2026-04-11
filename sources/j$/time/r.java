package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte a;
    private Object b;

    public r() {
    }

    r(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((e) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).Q(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).e0(objectOutput);
                return;
            case 4:
                ((j) obj).c0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).Z(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).Q(objectOutput);
                return;
            case 7:
                ((w) obj).O(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).U(objectOutput);
                return;
            case 9:
                ((q) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((t) obj).M(objectOutput);
                return;
            case 12:
                ((YearMonth) obj).O(objectOutput);
                return;
            case 13:
                ((n) obj).J(objectOutput);
                return;
            case 14:
                ((Period) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = b(readByte, objectInput);
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                e eVar = e.c;
                return e.o(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.c;
                return Instant.M(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return j.X(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.Q(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.X(objectInput));
            case 6:
                return ZonedDateTime.M(objectInput);
            case 7:
                int i = w.d;
                return ZoneId.J(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.T(objectInput);
            case 9:
                return q.K(objectInput);
            case 10:
                return OffsetDateTime.L(objectInput);
            case 11:
                int i2 = t.b;
                return t.I(objectInput.readInt());
            case 12:
                int i3 = YearMonth.c;
                return YearMonth.of(objectInput.readInt(), objectInput.readByte());
            case 13:
                return n.I(objectInput);
            case 14:
                Period period = Period.d;
                return Period.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }
}
