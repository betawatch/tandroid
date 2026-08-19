package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.RichMessageLayout;

/* loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public Serializable b;

    public a() {
    }

    public a(byte b, Serializable serializable) {
        this.a = b;
        this.b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Serializable serializable = this.b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                b bVar = (b) serializable;
                c(bVar.a, objectOutput);
                d(bVar.c, objectOutput);
                d(bVar.d, objectOutput);
                return;
            }
            if (b == 3) {
                ((e) serializable).writeExternal(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((ZoneRules) serializable).g.getID());
                return;
            }
        }
        ZoneRules zoneRules = (ZoneRules) serializable;
        long[] jArr = zoneRules.a;
        objectOutput.writeInt(jArr.length);
        for (long j : jArr) {
            c(j, objectOutput);
        }
        for (ZoneOffset zoneOffset : zoneRules.b) {
            d(zoneOffset, objectOutput);
        }
        long[] jArr2 = zoneRules.c;
        objectOutput.writeInt(jArr2.length);
        for (long j2 : jArr2) {
            c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : zoneRules.e) {
            d(zoneOffset2, objectOutput);
        }
        e[] eVarArr = zoneRules.f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Serializable zoneRules;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        if (readByte == 1) {
            int readInt = objectInput.readInt();
            long[] jArr = ZoneRules.i;
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
                throw new IllegalArgumentException("Offsets must not be equal");
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

    private Object readResolve() {
        return this.b;
    }

    public static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % RichMessageLayout.PART_MAX_HEIGHT_DP == 0 ? totalSeconds / RichMessageLayout.PART_MAX_HEIGHT_DP : NotificationCenter.needDeleteBusinessLink;
        objectOutput.writeByte(i);
        if (i == 127) {
            objectOutput.writeInt(totalSeconds);
        }
    }

    public static ZoneOffset b(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.O(objectInput.readInt()) : ZoneOffset.O(readByte * 900);
    }

    public static void c(long j, ObjectOutput objectOutput) {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            objectOutput.writeByte((i >>> 16) & NotificationCenter.didReceiveSmsCode);
            objectOutput.writeByte((i >>> 8) & NotificationCenter.didReceiveSmsCode);
            objectOutput.writeByte(i & NotificationCenter.didReceiveSmsCode);
            return;
        }
        objectOutput.writeByte(NotificationCenter.didReceiveSmsCode);
        objectOutput.writeLong(j);
    }

    public static long a(ObjectInput objectInput) {
        if ((objectInput.readByte() & 255) == 255) {
            return objectInput.readLong();
        }
        return ((((r0 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255)) * 900) - 4575744000L;
    }
}
