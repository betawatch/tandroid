package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
final class q implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte a;
    private Object b;

    public q() {
    }

    q(byte b, Object obj) {
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
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).O(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).c0(objectOutput);
                return;
            case 4:
                ((i) obj).a0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).X(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).N(objectOutput);
                return;
            case 7:
                ((v) obj).M(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).S(objectOutput);
                return;
            case 9:
                ((p) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((s) obj).K(objectOutput);
                return;
            case 12:
                ((YearMonth) obj).M(objectOutput);
                return;
            case 13:
                ((m) obj).H(objectOutput);
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
                Duration duration = Duration.c;
                return Duration.n(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.c;
                return Instant.K(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return i.V(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.O(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), i.V(objectInput));
            case 6:
                return ZonedDateTime.K(objectInput);
            case 7:
                int i = v.d;
                return ZoneId.H(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.R(objectInput);
            case 9:
                return p.I(objectInput);
            case 10:
                return OffsetDateTime.J(objectInput);
            case 11:
                int i2 = s.b;
                return s.G(objectInput.readInt());
            case 12:
                int i3 = YearMonth.c;
                return YearMonth.of(objectInput.readInt(), objectInput.readByte());
            case 13:
                return m.G(objectInput);
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
