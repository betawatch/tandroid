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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class c0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public c0(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object q;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.a;
                q = a.q(objectInput.readUTF());
                break;
            case 2:
                q = ((b) objectInput.readObject()).A((j$.time.j) objectInput.readObject());
                break;
            case 3:
                q = ((ChronoLocalDateTime) objectInput.readObject()).m((ZoneOffset) objectInput.readObject()).t((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = v.d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                t.c.getClass();
                q = new v(LocalDate.of(readInt, readByte2, readByte3));
                break;
            case 5:
                w wVar = w.d;
                q = w.v(objectInput.readByte());
                break;
            case 6:
                m mVar = (m) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                mVar.getClass();
                q = new o(mVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                y.c.getClass();
                q = new a0(LocalDate.of(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                e0.c.getClass();
                q = new g0(LocalDate.of(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i = g.e;
                q = new g(a.q(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = q;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((a) obj).n());
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
                v vVar = (v) obj;
                vVar.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(vVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(vVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(vVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((w) obj).a);
                return;
            case 6:
                o oVar = (o) obj;
                objectOutput.writeObject(oVar.a);
                objectOutput.writeInt(j$.time.temporal.p.a(oVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(oVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(oVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(a0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(a0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(a0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(g0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(g0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(g0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                g gVar = (g) obj;
                objectOutput.writeUTF(gVar.a.n());
                objectOutput.writeInt(gVar.b);
                objectOutput.writeInt(gVar.c);
                objectOutput.writeInt(gVar.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public c0() {
    }
}
