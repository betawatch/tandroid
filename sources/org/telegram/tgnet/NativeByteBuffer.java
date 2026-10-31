package org.telegram.tgnet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.v2;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    private NativeByteBuffer(int i10, boolean z10) {
    }

    public static native long native_getFreeBuffer(int i10);

    public static native ByteBuffer native_getJavaByteBuffer(long j10);

    public static native int native_limit(long j10);

    public static native int native_position(long j10);

    public static native void native_reuse(long j10);

    public static NativeByteBuffer wrap(long j10) {
        if (j10 == 0) {
            return null;
        }
        NativeByteBuffer poll = addressWrappers.get().poll();
        if (poll == null) {
            poll = new NativeByteBuffer(0, true);
        }
        poll.address = j10;
        poll.reused = false;
        ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(j10);
        poll.buffer = native_getJavaByteBuffer;
        native_getJavaByteBuffer.limit(native_limit(j10));
        int native_position = native_position(j10);
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

    public int getIntFromByte(byte b10) {
        return b10 >= 0 ? b10 : b10 + ConnectionsManager.USE_IPV4_ONLY;
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
            f8.g(e, true);
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
    public boolean readBool(boolean z10) {
        int readInt32 = readInt32(z10);
        if (readInt32 == -1720552011) {
            return true;
        }
        if (readInt32 != -1132882121) {
            if (z10) {
                throw new RuntimeException("Not bool value!");
            }
            if (v2.a) {
                f8.d("Not bool value!");
            }
        }
        return false;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte readByte(boolean z10) {
        try {
            return this.buffer.get();
        } catch (Exception e) {
            if (z10) {
                throw new RuntimeException("read byte error", e);
            }
            if (!v2.a) {
                return (byte) 0;
            }
            f8.d("read byte error");
            f8.g(e, true);
            return (byte) 0;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte[] readByteArray(boolean z10) {
        int i10;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i10 = 4;
            } else {
                i10 = 1;
            }
            if (intFromByte > remaining() || intFromByte < 0) {
                throw new RuntimeException("byte array size too big");
            }
            byte[] bArr = new byte[intFromByte];
            this.buffer.get(bArr);
            while ((intFromByte + i10) % 4 != 0) {
                this.buffer.get();
                i10++;
            }
            return bArr;
        } catch (Exception e) {
            if (z10) {
                throw new RuntimeException("read byte array error", e);
            }
            if (v2.a) {
                f8.d("read byte array error");
                f8.g(e, true);
            }
            return new byte[0];
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public NativeByteBuffer readByteBuffer(boolean z10) {
        int i10;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i10 = 4;
            } else {
                i10 = 1;
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
            while ((intFromByte + i10) % 4 != 0) {
                this.buffer.get();
                i10++;
            }
            return nativeByteBuffer;
        } catch (Exception e) {
            if (z10) {
                throw new RuntimeException("read byte array error", e);
            }
            if (!v2.a) {
                return null;
            }
            f8.d("read byte array error");
            f8.g(e, true);
            return null;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public void readBytes(byte[] bArr, boolean z10) {
        try {
            this.buffer.get(bArr);
        } catch (Exception e) {
            if (z10) {
                throw new RuntimeException("read raw error", e);
            }
            if (v2.a) {
                f8.d("read raw error");
                f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte[] readData(int i10, boolean z10) {
        byte[] bArr = new byte[i10];
        readBytes(bArr, z10);
        return bArr;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public double readDouble(boolean z10) {
        try {
            return Double.longBitsToDouble(readInt64(z10));
        } catch (Exception e) {
            if (z10) {
                throw new RuntimeException("read double error", e);
            }
            if (!v2.a) {
                return 0.0d;
            }
            f8.d("read double error");
            f8.g(e, true);
            return 0.0d;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public float readFloat(boolean z10) {
        try {
            return Float.intBitsToFloat(this.buffer.getInt());
        } catch (Exception e) {
            if (z10) {
                throw new RuntimeException("read float error", e);
            }
            if (!v2.a) {
                return 0.0f;
            }
            f8.d("read float error");
            f8.g(e, true);
            return 0.0f;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public int readInt32(boolean z10) {
        try {
            return this.buffer.getInt();
        } catch (Exception e) {
            if (z10) {
                throw new RuntimeException("read int32 error", e);
            }
            if (!v2.a) {
                return 0;
            }
            f8.d("read int32 error");
            f8.g(e, true);
            return 0;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public long readInt64(boolean z10) {
        try {
            return this.buffer.getLong();
        } catch (Exception e) {
            if (z10) {
                throw new RuntimeException("read int64 error", e);
            }
            if (!v2.a) {
                return 0L;
            }
            f8.d("read int64 error");
            f8.g(e, true);
            return 0L;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public String readString(boolean z10) {
        int i10;
        int position = getPosition();
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i10 = 4;
            } else {
                i10 = 1;
            }
            if (intFromByte > remaining() || intFromByte < 0) {
                throw new RuntimeException("string size too big");
            }
            byte[] bArr = new byte[intFromByte];
            this.buffer.get(bArr);
            while ((intFromByte + i10) % 4 != 0) {
                this.buffer.get();
                i10++;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception e) {
            if (z10) {
                throw new RuntimeException("read string error", e);
            }
            if (v2.a) {
                f8.d("read string error");
                f8.g(e, true);
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
    public void skip(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.justCalc) {
            this.len += i10;
        } else {
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.position() + i10);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeBool(boolean z10) {
        if (this.justCalc) {
            this.len += 4;
        } else if (z10) {
            writeInt32(TLRPC.TL_boolTrue.constructor);
        } else {
            writeInt32(TLRPC.TL_boolFalse.constructor);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByte(int i10) {
        writeByte((byte) i10);
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteArray(byte[] bArr, int i10, int i11) {
        try {
            if (i11 <= 253) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) i11);
                }
            } else if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) i11);
                this.buffer.put((byte) (i11 >> 8));
                this.buffer.put((byte) (i11 >> 16));
            }
            if (this.justCalc) {
                this.len += i11;
            } else {
                this.buffer.put(bArr, i10, i11);
            }
            for (int i12 = i11 <= 253 ? 1 : 4; (i11 + i12) % 4 != 0; i12++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e) {
            if (v2.a) {
                f8.d("write byte array error");
                f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteBuffer(NativeByteBuffer nativeByteBuffer) {
        try {
            int limit = nativeByteBuffer.limit();
            if (limit <= 253) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) limit);
                }
            } else if (this.justCalc) {
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
            for (int i10 = limit <= 253 ? 1 : 4; (limit + i10) % 4 != 0; i10++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
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
            if (v2.a) {
                f8.d("write raw error");
                f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeDouble(double d) {
        try {
            writeInt64(Double.doubleToRawLongBits(d));
        } catch (Exception e) {
            if (v2.a) {
                f8.d("write double error");
                f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeFloat(float f7) {
        try {
            if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.putInt(Float.floatToIntBits(f7));
            }
        } catch (Exception e) {
            if (v2.a) {
                f8.d("write float error");
                f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeInt32(int i10) {
        try {
            if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.putInt(i10);
            }
        } catch (Exception e) {
            if (v2.a) {
                f8.d("write int32 error");
                f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeInt64(long j10) {
        try {
            if (this.justCalc) {
                this.len += 8;
            } else {
                this.buffer.putLong(j10);
            }
        } catch (Exception e) {
            if (v2.a) {
                f8.d("write int64 error");
                f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeString(String str) {
        if (str == null) {
            if (v2.a) {
                f8.d("write string null");
                f8.g(new Throwable(), true);
            }
            str = "";
        }
        try {
            writeByteArray(str.getBytes("UTF-8"));
        } catch (Exception e) {
            if (v2.a) {
                f8.d("write string error");
                f8.g(e, true);
            }
        }
    }

    public void limit(int i10) {
        this.buffer.limit(i10);
    }

    public void position(int i10) {
        this.buffer.position(i10);
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByte(byte b10) {
        try {
            if (this.justCalc) {
                this.len++;
            } else {
                this.buffer.put(b10);
            }
        } catch (Exception e) {
            if (v2.a) {
                f8.d("write byte error");
                f8.g(e, true);
            }
        }
    }

    public NativeByteBuffer(int i10) {
        if (i10 >= 0) {
            long native_getFreeBuffer = native_getFreeBuffer(i10);
            this.address = native_getFreeBuffer;
            if (native_getFreeBuffer != 0) {
                ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(native_getFreeBuffer);
                this.buffer = native_getJavaByteBuffer;
                native_getJavaByteBuffer.position(0);
                this.buffer.limit(i10);
                this.buffer.order(ByteOrder.LITTLE_ENDIAN);
                return;
            }
            return;
        }
        throw new Exception("invalid NativeByteBuffer size");
    }

    public void readBytes(byte[] bArr, int i10, int i11, boolean z10) {
        try {
            this.buffer.get(bArr, i10, i11);
        } catch (Exception e) {
            if (!z10) {
                if (v2.a) {
                    f8.d("read raw error");
                    f8.g(e, true);
                    return;
                }
                return;
            }
            throw new RuntimeException("read raw error", e);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeBytes(byte[] bArr, int i10, int i11) {
        try {
            if (!this.justCalc) {
                this.buffer.put(bArr, i10, i11);
            } else {
                this.len += i11;
            }
        } catch (Exception e) {
            if (v2.a) {
                f8.d("write raw error");
                f8.g(e, true);
            }
        }
    }

    public NativeByteBuffer(boolean z10) {
        this.justCalc = z10;
    }

    public void writeBytes(NativeByteBuffer nativeByteBuffer) {
        if (this.justCalc) {
            this.len = nativeByteBuffer.limit() + this.len;
        } else {
            nativeByteBuffer.rewind();
            this.buffer.put(nativeByteBuffer.buffer);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteArray(byte[] bArr) {
        try {
            if (bArr.length <= 253) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) bArr.length);
                }
            } else if (this.justCalc) {
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
            for (int i10 = bArr.length <= 253 ? 1 : 4; (bArr.length + i10) % 4 != 0; i10++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e) {
            if (v2.a) {
                f8.d("write byte array error");
                f8.g(e, true);
            }
        }
    }
}
