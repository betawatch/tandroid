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
import org.telegram.messenger.RichMessageLayout;

/* loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public Object b;

    public a() {
    }

    public a(byte b10, Object obj) {
        this.a = b10;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b10);
        if (b10 != 1) {
            if (b10 == 2) {
                b bVar = (b) obj;
                c(bVar.a, objectOutput);
                d(bVar.c, objectOutput);
                d(bVar.d, objectOutput);
                return;
            }
            if (b10 == 3) {
                ((e) obj).b(objectOutput);
                return;
            } else {
                if (b10 != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((ZoneRules) obj).g.getID());
                return;
            }
        }
        ZoneRules zoneRules = (ZoneRules) obj;
        objectOutput.writeInt(zoneRules.a.length);
        for (long j10 : zoneRules.a) {
            c(j10, objectOutput);
        }
        for (ZoneOffset zoneOffset : zoneRules.b) {
            d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(zoneRules.c.length);
        for (long j11 : zoneRules.c) {
            c(j11, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : zoneRules.e) {
            d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(zoneRules.f.length);
        for (e eVar : zoneRules.f) {
            eVar.b(objectOutput);
        }
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
            for (int i10 = 0; i10 < readInt; i10++) {
                jArr2[i10] = a(objectInput);
            }
            int i11 = readInt + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                zoneOffsetArr[i12] = b(objectInput);
            }
            int readInt2 = objectInput.readInt();
            if (readInt2 != 0) {
                jArr = new long[readInt2];
            }
            long[] jArr3 = jArr;
            for (int i13 = 0; i13 < readInt2; i13++) {
                jArr3[i13] = a(objectInput);
            }
            int i14 = readInt2 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i14];
            for (int i15 = 0; i15 < i14; i15++) {
                zoneOffsetArr2[i15] = b(objectInput);
            }
            int readByte2 = objectInput.readByte();
            e[] eVarArr = readByte2 == 0 ? ZoneRules.j : new e[readByte2];
            for (int i16 = 0; i16 < readByte2; i16++) {
                eVarArr[i16] = e.a(objectInput);
            }
            zoneRules = new ZoneRules(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
        } else if (readByte == 2) {
            int i17 = b.e;
            long a2 = a(objectInput);
            ZoneOffset b10 = b(objectInput);
            ZoneOffset b11 = b(objectInput);
            if (b10.equals(b11)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            zoneRules = new b(a2, b10, b11);
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

    private Object readResolve() {
        return this.b;
    }

    public static void d(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i10 = totalSeconds % RichMessageLayout.PART_MAX_HEIGHT_DP == 0 ? totalSeconds / RichMessageLayout.PART_MAX_HEIGHT_DP : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    public static ZoneOffset b(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.O(dataInput.readInt()) : ZoneOffset.O(readByte * 900);
    }

    public static void c(long j10, DataOutput dataOutput) {
        if (j10 >= -4575744000L && j10 < 10413792000L && j10 % 900 == 0) {
            int i10 = (int) ((j10 + 4575744000L) / 900);
            dataOutput.writeByte((i10 >>> 16) & 255);
            dataOutput.writeByte((i10 >>> 8) & 255);
            dataOutput.writeByte(i10 & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j10);
    }

    public static long a(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }
}
