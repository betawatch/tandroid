package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
final class E implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    private byte a;
    private Object b;

    public E() {
    }

    E(byte b, Object obj) {
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
                objectOutput.writeUTF(((a) obj).getId());
                return;
            case 2:
                ((f) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((k) obj).writeExternal(objectOutput);
                return;
            case 4:
                x xVar = (x) obj;
                xVar.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(xVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(xVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(xVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((y) obj).E(objectOutput);
                return;
            case 6:
                ((q) obj).writeExternal(objectOutput);
                return;
            case 7:
                C c = (C) obj;
                c.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(c, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(c, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(c, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                I i = (I) obj;
                i.getClass();
                objectOutput.writeInt(j$.time.temporal.n.a(i, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(i, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.n.a(i, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((g) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object i;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                int i2 = a.c;
                i = a.i(objectInput.readUTF());
                break;
            case 2:
                i = ((b) objectInput.readObject()).t((j$.time.j) objectInput.readObject());
                break;
            case 3:
                i = ((ChronoLocalDateTime) objectInput.readObject()).o((ZoneOffset) objectInput.readObject()).h((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = x.d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                v.d.getClass();
                i = new x(LocalDate.of(readInt, readByte2, readByte3));
                break;
            case 5:
                y yVar = y.d;
                i = y.B(objectInput.readByte());
                break;
            case 6:
                o oVar = (o) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                oVar.getClass();
                i = q.J(oVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                A.d.getClass();
                i = new C(LocalDate.of(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                G.d.getClass();
                i = new I(LocalDate.of(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i3 = g.e;
                i = new g(a.i(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = i;
    }

    private Object readResolve() {
        return this.b;
    }
}
