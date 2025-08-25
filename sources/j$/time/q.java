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
                ((e) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).J(objectOutput);
                return;
            case 3:
                ((LocalDate) obj).W(objectOutput);
                return;
            case 4:
                ((j) obj).V(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).S(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).G(objectOutput);
                return;
            case 7:
                ((v) obj).G(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).L(objectOutput);
                return;
            case 9:
                ((p) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((s) obj).F(objectOutput);
                return;
            case 12:
                ((YearMonth) obj).H(objectOutput);
                return;
            case 13:
                ((n) obj).C(objectOutput);
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
                return e.m(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.c;
                return Instant.G(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return j.Q(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.c;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.J(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.Q(objectInput));
            case 6:
                return ZonedDateTime.D(objectInput);
            case 7:
                int i = v.d;
                return ZoneId.B(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.K(objectInput);
            case 9:
                return p.D(objectInput);
            case 10:
                return OffsetDateTime.E(objectInput);
            case 11:
                int i2 = s.b;
                return s.B(objectInput.readInt());
            case 12:
                int i3 = YearMonth.c;
                return YearMonth.of(objectInput.readInt(), objectInput.readByte());
            case 13:
                return n.B(objectInput);
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
