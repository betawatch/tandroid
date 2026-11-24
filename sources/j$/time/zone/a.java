package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public Object b;

    public a(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static long a(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static ZoneOffset b(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.H(dataInput.readInt()) : ZoneOffset.H(readByte * 900);
    }

    public static void c(long j, DataOutput dataOutput) {
        if (j < -4575744000L || j >= 10413792000L || j % 900 != 0) {
            dataOutput.writeByte(kk7.d4);
            dataOutput.writeLong(j);
        } else {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & kk7.d4);
            dataOutput.writeByte((i >>> 8) & kk7.d4);
            dataOutput.writeByte(i & kk7.d4);
        }
    }

    public static void d(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % 900 == 0 ? totalSeconds / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object zoneRules;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        if (readByte == 1) {
            long[] jArr = ZoneRules.i;
            int readInt = objectInput.readInt();
            long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
            for (int i = 0; i < readInt; i++) {
                jArr2[i] = a(objectInput);
            }
            int i2 = readInt + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                zoneOffsetArr[i3] = b(objectInput);
            }
            int readInt2 = objectInput.readInt();
            if (readInt2 != 0) {
                jArr = new long[readInt2];
            }
            long[] jArr3 = jArr;
            for (int i4 = 0; i4 < readInt2; i4++) {
                jArr3[i4] = a(objectInput);
            }
            int i5 = readInt2 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                zoneOffsetArr2[i6] = b(objectInput);
            }
            int readByte2 = objectInput.readByte();
            e[] eVarArr = readByte2 == 0 ? ZoneRules.j : new e[readByte2];
            for (int i7 = 0; i7 < readByte2; i7++) {
                eVarArr[i7] = e.a(objectInput);
            }
            zoneRules = new ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
        } else if (readByte == 2) {
            long a = a(objectInput);
            ZoneOffset b = b(objectInput);
            ZoneOffset b2 = b(objectInput);
            if (b.equals(b2)) {
                j$.time.g.c("Offsets must not be equal");
                return;
            }
            zoneRules = new b(a, b, b2);
        } else if (readByte == 3) {
            zoneRules = e.a(objectInput);
        } else {
            if (readByte != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            zoneRules = new ZoneRules(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.b = zoneRules;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                b bVar = (b) obj;
                c(bVar.a, objectOutput);
                d(bVar.c, objectOutput);
                d(bVar.d, objectOutput);
                return;
            }
            if (b == 3) {
                ((e) obj).b(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((ZoneRules) obj).g.getID());
                return;
            }
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        objectOutput.writeInt(zoneRules.a.length);
        for (long j : zoneRules.a) {
            c(j, objectOutput);
        }
        for (ZoneOffset zoneOffset : zoneRules.b) {
            d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(zoneRules.c.length);
        for (long j2 : zoneRules.c) {
            c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : zoneRules.e) {
            d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(zoneRules.f.length);
        for (e eVar : zoneRules.f) {
            eVar.b(objectOutput);
        }
    }

    public a() {
    }
}
