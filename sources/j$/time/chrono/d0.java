package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class d0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public d0() {
    }

    public d0(byte b10, Object obj) {
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
                objectOutput.writeUTF(((a) obj).getId());
                return;
            case 2:
                f fVar = (f) obj;
                objectOutput.writeObject(fVar.a);
                objectOutput.writeObject(fVar.b);
                return;
            case 3:
                j jVar = (j) obj;
                objectOutput.writeObject(jVar.a);
                objectOutput.writeObject(jVar.b);
                objectOutput.writeObject(jVar.c);
                return;
            case 4:
                w wVar = (w) obj;
                wVar.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(wVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(wVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(wVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((x) obj).a);
                return;
            case 6:
                p pVar = (p) obj;
                objectOutput.writeObject(pVar.a);
                objectOutput.writeInt(j$.time.temporal.p.a(pVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(pVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(pVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(b0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(b0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(b0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                h0 h0Var = (h0) obj;
                h0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(h0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(h0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(h0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                g gVar = (g) obj;
                objectOutput.writeUTF(gVar.a.getId());
                objectOutput.writeInt(gVar.b);
                objectOutput.writeInt(gVar.c);
                objectOutput.writeInt(gVar.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object W;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.a;
                W = j$.com.android.tools.r8.a.W(objectInput.readUTF());
                break;
            case 2:
                W = ((b) objectInput.readObject()).A((j$.time.h) objectInput.readObject());
                break;
            case 3:
                W = ((ChronoLocalDateTime) objectInput.readObject()).n((ZoneOffset) objectInput.readObject()).v((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = w.d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                u.c.getClass();
                W = new w(LocalDate.of(readInt, readByte2, readByte3));
                break;
            case 5:
                x xVar = x.d;
                W = x.s(objectInput.readByte());
                break;
            case 6:
                n nVar = (n) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                nVar.getClass();
                W = new p(nVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                z.c.getClass();
                W = new b0(LocalDate.of(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                f0.c.getClass();
                W = new h0(LocalDate.of(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i10 = g.e;
                W = new g(j$.com.android.tools.r8.a.W(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = W;
    }

    private Object readResolve() {
        return this.b;
    }
}
