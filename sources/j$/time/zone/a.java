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

/* loaded from: classes2.dex */
final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    private byte a;
    private Serializable b;

    public a() {
    }

    a(byte b, Serializable serializable) {
        this.a = b;
        this.b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Serializable serializable = this.b;
        objectOutput.writeByte(b);
        if (b == 1) {
            ((ZoneRules) serializable).writeExternal(objectOutput);
            return;
        }
        if (b == 2) {
            ((b) serializable).writeExternal(objectOutput);
        } else if (b == 3) {
            ((e) serializable).writeExternal(objectOutput);
        } else {
            if (b == 100) {
                ((ZoneRules) serializable).k(objectOutput);
                return;
            }
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Serializable j;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        if (readByte == 1) {
            j = ZoneRules.j(objectInput);
        } else if (readByte == 2) {
            long a = a(objectInput);
            ZoneOffset b = b(objectInput);
            ZoneOffset b2 = b(objectInput);
            if (b.equals(b2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            j = new b(a, b, b2);
        } else if (readByte == 3) {
            j = e.b(objectInput);
        } else {
            if (readByte != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            j = new ZoneRules(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.b = j;
    }

    private Object readResolve() {
        return this.b;
    }

    static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % 900 == 0 ? totalSeconds / 900 : NotificationCenter.needDeleteBusinessLink;
        objectOutput.writeByte(i);
        if (i == 127) {
            objectOutput.writeInt(totalSeconds);
        }
    }

    static ZoneOffset b(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.P(objectInput.readInt()) : ZoneOffset.P(readByte * 900);
    }

    static void c(long j, ObjectOutput objectOutput) {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            objectOutput.writeByte((i >>> 16) & NotificationCenter.didReceiveCall);
            objectOutput.writeByte((i >>> 8) & NotificationCenter.didReceiveCall);
            objectOutput.writeByte(i & NotificationCenter.didReceiveCall);
            return;
        }
        objectOutput.writeByte(NotificationCenter.didReceiveCall);
        objectOutput.writeLong(j);
    }

    static long a(ObjectInput objectInput) {
        if ((objectInput.readByte() & 255) == 255) {
            return objectInput.readLong();
        }
        return ((((r0 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255)) * 900) - 4575744000L;
    }
}
