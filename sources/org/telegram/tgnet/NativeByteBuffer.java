package org.telegram.tgnet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class NativeByteBuffer extends AbstractSerializedData {
    private static final ThreadLocal<LinkedList<NativeByteBuffer>> addressWrappers = new ThreadLocal<LinkedList<NativeByteBuffer>>() { // from class: org.telegram.tgnet.NativeByteBuffer.1
        @Override // java.lang.ThreadLocal
        public LinkedList<NativeByteBuffer> initialValue() {
            return new LinkedList<>();
        }
    };
    protected long address;
    public ByteBuffer buffer;
    private boolean justCalc;
    private int len;
    public boolean reused = true;

    public NativeByteBuffer(int i) {
        if (i < 0) {
            throw new Exception("invalid NativeByteBuffer size");
        }
        long native_getFreeBuffer = native_getFreeBuffer(i);
        this.address = native_getFreeBuffer;
        if (native_getFreeBuffer != 0) {
            ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(native_getFreeBuffer);
            this.buffer = native_getJavaByteBuffer;
            native_getJavaByteBuffer.position(0);
            this.buffer.limit(i);
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public static native long native_getFreeBuffer(int i);

    public static native ByteBuffer native_getJavaByteBuffer(long j);

    public static native int native_limit(long j);

    public static native int native_position(long j);

    public static native void native_reuse(long j);

    public static NativeByteBuffer wrap(long j) {
        if (j == 0) {
            return null;
        }
        NativeByteBuffer poll = addressWrappers.get().poll();
        if (poll == null) {
            poll = new NativeByteBuffer(0, true);
        }
        poll.address = j;
        poll.reused = false;
        ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(j);
        poll.buffer = native_getJavaByteBuffer;
        native_getJavaByteBuffer.limit(native_limit(j));
        int native_position = native_position(j);
        if (native_position <= poll.buffer.limit()) {
            poll.buffer.position(native_position);
        }
        poll.buffer.order(ByteOrder.LITTLE_ENDIAN);
        return poll;
    }

    public int capacity() {
        return this.buffer.capacity();
    }

    public void compact() {
        this.buffer.compact();
    }

    public void finalize() {
        if (!this.reused) {
            reuse();
        }
        super.finalize();
    }

    public int getIntFromByte(byte b) {
        return b >= 0 ? b : b + ConnectionsManager.USE_IPV4_ONLY;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.OutputSerializedData
    public int getPosition() {
        return this.buffer.position();
    }

    public boolean hasRemaining() {
        return this.buffer.hasRemaining();
    }

    public String hex() {
        try {
            return Utilities.f(readData(Math.min(limit(), 1024), true));
        } catch (Exception e) {
            fa4.g(e, true);
            return "<err>";
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public int length() {
        return !this.justCalc ? this.buffer.position() : this.len;
    }

    public int limit() {
        return this.buffer.limit();
    }

    public int position() {
        return this.buffer.position();
    }

    public void put(ByteBuffer byteBuffer) {
        this.buffer.put(byteBuffer);
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public boolean readBool(boolean z) {
        int readInt32 = readInt32(z);
        if (readInt32 == -1720552011) {
            return true;
        }
        if (readInt32 != -1132882121) {
            if (z) {
                wn4.j("Not bool value!");
                return false;
            }
            if (w01.a) {
                fa4.d("Not bool value!");
            }
        }
        return false;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte readByte(boolean z) {
        try {
            return this.buffer.get();
        } catch (Exception e) {
            if (z) {
                fyb.j("read byte error", e);
                return (byte) 0;
            }
            if (!w01.a) {
                return (byte) 0;
            }
            fa4.d("read byte error");
            fa4.g(e, true);
            return (byte) 0;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte[] readByteArray(boolean z) {
        int i;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i = 4;
            } else {
                i = 1;
            }
            if (intFromByte > remaining() || intFromByte < 0) {
                throw new RuntimeException("byte array size too big");
            }
            byte[] bArr = new byte[intFromByte];
            this.buffer.get(bArr);
            while ((intFromByte + i) % 4 != 0) {
                this.buffer.get();
                i++;
            }
            return bArr;
        } catch (Exception e) {
            if (z) {
                fyb.j("read byte array error", e);
                return null;
            }
            if (w01.a) {
                fa4.d("read byte array error");
                fa4.g(e, true);
            }
            return new byte[0];
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public NativeByteBuffer readByteBuffer(boolean z) {
        int i;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i = 4;
            } else {
                i = 1;
            }
            if (intFromByte > remaining() || intFromByte < 0) {
                throw new RuntimeException("byte array size too big");
            }
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(intFromByte);
            int limit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.limit(byteBuffer.position() + intFromByte);
            nativeByteBuffer.buffer.put(this.buffer);
            this.buffer.limit(limit);
            nativeByteBuffer.buffer.position(0);
            while ((intFromByte + i) % 4 != 0) {
                this.buffer.get();
                i++;
            }
            return nativeByteBuffer;
        } catch (Exception e) {
            if (z) {
                fyb.j("read byte array error", e);
                return null;
            }
            if (w01.a) {
                fa4.d("read byte array error");
                fa4.g(e, true);
            }
            return null;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public void readBytes(byte[] bArr, boolean z) {
        try {
            this.buffer.get(bArr);
        } catch (Exception e) {
            if (z) {
                fyb.j("read raw error", e);
            } else if (w01.a) {
                fa4.d("read raw error");
                fa4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte[] readData(int i, boolean z) {
        byte[] bArr = new byte[i];
        readBytes(bArr, z);
        return bArr;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public double readDouble(boolean z) {
        try {
            return Double.longBitsToDouble(readInt64(z));
        } catch (Exception e) {
            if (z) {
                fyb.j("read double error", e);
                return 0.0d;
            }
            if (!w01.a) {
                return 0.0d;
            }
            fa4.d("read double error");
            fa4.g(e, true);
            return 0.0d;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public float readFloat(boolean z) {
        try {
            return Float.intBitsToFloat(this.buffer.getInt());
        } catch (Exception e) {
            if (z) {
                fyb.j("read float error", e);
                return 0.0f;
            }
            if (!w01.a) {
                return 0.0f;
            }
            fa4.d("read float error");
            fa4.g(e, true);
            return 0.0f;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public int readInt32(boolean z) {
        try {
            return this.buffer.getInt();
        } catch (Exception e) {
            if (z) {
                fyb.j("read int32 error", e);
                return 0;
            }
            if (!w01.a) {
                return 0;
            }
            fa4.d("read int32 error");
            fa4.g(e, true);
            return 0;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public long readInt64(boolean z) {
        try {
            return this.buffer.getLong();
        } catch (Exception e) {
            if (z) {
                fyb.j("read int64 error", e);
                return 0L;
            }
            if (!w01.a) {
                return 0L;
            }
            fa4.d("read int64 error");
            fa4.g(e, true);
            return 0L;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public String readString(boolean z) {
        int i;
        int position = getPosition();
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i = 4;
            } else {
                i = 1;
            }
            if (intFromByte > remaining() || intFromByte < 0) {
                throw new RuntimeException("string size too big");
            }
            byte[] bArr = new byte[intFromByte];
            this.buffer.get(bArr);
            while ((intFromByte + i) % 4 != 0) {
                this.buffer.get();
                i++;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception e) {
            if (z) {
                fyb.j("read string error", e);
                return null;
            }
            if (w01.a) {
                fa4.d("read string error");
                fa4.g(e, true);
            }
            position(position);
            return "";
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public int remaining() {
        return this.buffer.remaining();
    }

    public void reuse() {
        if (this.address != 0) {
            addressWrappers.get().add(this);
            this.reused = true;
            native_reuse(this.address);
        }
    }

    public void rewind() {
        if (this.justCalc) {
            this.len = 0;
        } else {
            this.buffer.rewind();
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.OutputSerializedData
    public void skip(int i) {
        if (i == 0) {
            return;
        }
        if (this.justCalc) {
            this.len += i;
        } else {
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeBool(boolean z) {
        if (this.justCalc) {
            this.len += 4;
        } else if (z) {
            writeInt32(TLRPC.TL_boolTrue.constructor);
        } else {
            writeInt32(TLRPC.TL_boolFalse.constructor);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByte(byte b) {
        try {
            if (this.justCalc) {
                this.len++;
            } else {
                this.buffer.put(b);
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write byte error");
                fa4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteArray(byte[] bArr) {
        try {
            int length = bArr.length;
            boolean z = this.justCalc;
            if (length <= 253) {
                if (z) {
                    this.len++;
                } else {
                    this.buffer.put((byte) bArr.length);
                }
            } else if (z) {
                this.len += 4;
            } else {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) bArr.length);
                this.buffer.put((byte) (bArr.length >> 8));
                this.buffer.put((byte) (bArr.length >> 16));
            }
            if (this.justCalc) {
                this.len += bArr.length;
            } else {
                this.buffer.put(bArr);
            }
            for (int i = bArr.length <= 253 ? 1 : 4; (bArr.length + i) % 4 != 0; i++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write byte array error");
                fa4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteBuffer(NativeByteBuffer nativeByteBuffer) {
        try {
            int limit = nativeByteBuffer.limit();
            boolean z = this.justCalc;
            if (limit <= 253) {
                if (z) {
                    this.len++;
                } else {
                    this.buffer.put((byte) limit);
                }
            } else if (z) {
                this.len += 4;
            } else {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) limit);
                this.buffer.put((byte) (limit >> 8));
                this.buffer.put((byte) (limit >> 16));
            }
            if (this.justCalc) {
                this.len += limit;
            } else {
                nativeByteBuffer.rewind();
                this.buffer.put(nativeByteBuffer.buffer);
            }
            for (int i = limit <= 253 ? 1 : 4; (limit + i) % 4 != 0; i++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeBytes(byte[] bArr) {
        try {
            if (this.justCalc) {
                this.len += bArr.length;
            } else {
                this.buffer.put(bArr);
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write raw error");
                fa4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeDouble(double d) {
        try {
            writeInt64(Double.doubleToRawLongBits(d));
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write double error");
                fa4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeFloat(float f) {
        try {
            if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.putInt(Float.floatToIntBits(f));
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write float error");
                fa4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeInt32(int i) {
        try {
            if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.putInt(i);
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write int32 error");
                fa4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeInt64(long j) {
        try {
            if (this.justCalc) {
                this.len += 8;
            } else {
                this.buffer.putLong(j);
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write int64 error");
                fa4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeString(String str) {
        if (str == null) {
            if (w01.a) {
                fa4.d("write string null");
                fa4.g(new Throwable(), true);
            }
            str = "";
        }
        try {
            writeByteArray(str.getBytes("UTF-8"));
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write string error");
                fa4.g(e, true);
            }
        }
    }

    public void limit(int i) {
        this.buffer.limit(i);
    }

    public void position(int i) {
        this.buffer.position(i);
    }

    public void readBytes(byte[] bArr, int i, int i2, boolean z) {
        try {
            this.buffer.get(bArr, i, i2);
        } catch (Exception e) {
            if (!z) {
                if (w01.a) {
                    fa4.d("read raw error");
                    fa4.g(e, true);
                    return;
                }
                return;
            }
            fyb.j("read raw error", e);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByte(int i) {
        writeByte((byte) i);
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeBytes(byte[] bArr, int i, int i2) {
        try {
            if (!this.justCalc) {
                this.buffer.put(bArr, i, i2);
            } else {
                this.len += i2;
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write raw error");
                fa4.g(e, true);
            }
        }
    }

    public void writeBytes(NativeByteBuffer nativeByteBuffer) {
        if (this.justCalc) {
            this.len = nativeByteBuffer.limit() + this.len;
        } else {
            nativeByteBuffer.rewind();
            this.buffer.put(nativeByteBuffer.buffer);
        }
    }

    private NativeByteBuffer(int i, boolean z) {
    }

    public NativeByteBuffer(boolean z) {
        this.justCalc = z;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteArray(byte[] bArr, int i, int i2) {
        try {
            boolean z = this.justCalc;
            if (i2 <= 253) {
                if (z) {
                    this.len++;
                } else {
                    this.buffer.put((byte) i2);
                }
            } else if (z) {
                this.len += 4;
            } else {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) i2);
                this.buffer.put((byte) (i2 >> 8));
                this.buffer.put((byte) (i2 >> 16));
            }
            if (this.justCalc) {
                this.len += i2;
            } else {
                this.buffer.put(bArr, i, i2);
            }
            for (int i3 = i2 <= 253 ? 1 : 4; (i2 + i3) % 4 != 0; i3++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e) {
            if (w01.a) {
                fa4.d("write byte array error");
                fa4.g(e, true);
            }
        }
    }
}
