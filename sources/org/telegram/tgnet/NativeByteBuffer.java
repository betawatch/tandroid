package org.telegram.tgnet;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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

    private NativeByteBuffer(int i7, boolean z9) {
    }

    public static native long native_getFreeBuffer(int i7);

    public static native ByteBuffer native_getJavaByteBuffer(long j3);

    public static native int native_limit(long j3);

    public static native int native_position(long j3);

    public static native void native_reuse(long j3);

    public static NativeByteBuffer wrap(long j3) {
        if (j3 == 0) {
            return null;
        }
        NativeByteBuffer poll = addressWrappers.get().poll();
        if (poll == null) {
            poll = new NativeByteBuffer(0, true);
        }
        poll.address = j3;
        poll.reused = false;
        ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(j3);
        poll.buffer = native_getJavaByteBuffer;
        native_getJavaByteBuffer.limit(native_limit(j3));
        int native_position = native_position(j3);
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
        } catch (Exception e10) {
            a8.g(e10, true);
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
    public boolean readBool(boolean z9) {
        int readInt32 = readInt32(z9);
        if (readInt32 == -1720552011) {
            return true;
        }
        if (readInt32 != -1132882121) {
            if (z9) {
                throw new RuntimeException("Not bool value!");
            }
            if (r2.a) {
                a8.d("Not bool value!");
            }
        }
        return false;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte readByte(boolean z9) {
        try {
            return this.buffer.get();
        } catch (Exception e10) {
            if (z9) {
                throw new RuntimeException("read byte error", e10);
            }
            if (!r2.a) {
                return (byte) 0;
            }
            a8.d("read byte error");
            a8.g(e10, true);
            return (byte) 0;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte[] readByteArray(boolean z9) {
        int i7;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i7 = 4;
            } else {
                i7 = 1;
            }
            if (intFromByte > remaining() || intFromByte < 0) {
                throw new RuntimeException("byte array size too big");
            }
            byte[] bArr = new byte[intFromByte];
            this.buffer.get(bArr);
            while ((intFromByte + i7) % 4 != 0) {
                this.buffer.get();
                i7++;
            }
            return bArr;
        } catch (Exception e10) {
            if (z9) {
                throw new RuntimeException("read byte array error", e10);
            }
            if (r2.a) {
                a8.d("read byte array error");
                a8.g(e10, true);
            }
            return new byte[0];
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public NativeByteBuffer readByteBuffer(boolean z9) {
        int i7;
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i7 = 4;
            } else {
                i7 = 1;
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
            while ((intFromByte + i7) % 4 != 0) {
                this.buffer.get();
                i7++;
            }
            return nativeByteBuffer;
        } catch (Exception e10) {
            if (z9) {
                throw new RuntimeException("read byte array error", e10);
            }
            if (!r2.a) {
                return null;
            }
            a8.d("read byte array error");
            a8.g(e10, true);
            return null;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public void readBytes(byte[] bArr, boolean z9) {
        try {
            this.buffer.get(bArr);
        } catch (Exception e10) {
            if (z9) {
                throw new RuntimeException("read raw error", e10);
            }
            if (r2.a) {
                a8.d("read raw error");
                a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte[] readData(int i7, boolean z9) {
        byte[] bArr = new byte[i7];
        readBytes(bArr, z9);
        return bArr;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public double readDouble(boolean z9) {
        try {
            return Double.longBitsToDouble(readInt64(z9));
        } catch (Exception e10) {
            if (z9) {
                throw new RuntimeException("read double error", e10);
            }
            if (!r2.a) {
                return 0.0d;
            }
            a8.d("read double error");
            a8.g(e10, true);
            return 0.0d;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public float readFloat(boolean z9) {
        try {
            return Float.intBitsToFloat(this.buffer.getInt());
        } catch (Exception e10) {
            if (z9) {
                throw new RuntimeException("read float error", e10);
            }
            if (!r2.a) {
                return 0.0f;
            }
            a8.d("read float error");
            a8.g(e10, true);
            return 0.0f;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public int readInt32(boolean z9) {
        try {
            return this.buffer.getInt();
        } catch (Exception e10) {
            if (z9) {
                throw new RuntimeException("read int32 error", e10);
            }
            if (!r2.a) {
                return 0;
            }
            a8.d("read int32 error");
            a8.g(e10, true);
            return 0;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public long readInt64(boolean z9) {
        try {
            return this.buffer.getLong();
        } catch (Exception e10) {
            if (z9) {
                throw new RuntimeException("read int64 error", e10);
            }
            if (!r2.a) {
                return 0L;
            }
            a8.d("read int64 error");
            a8.g(e10, true);
            return 0L;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public String readString(boolean z9) {
        int i7;
        int position = getPosition();
        try {
            int intFromByte = getIntFromByte(this.buffer.get());
            if (intFromByte >= 254) {
                intFromByte = getIntFromByte(this.buffer.get()) | (getIntFromByte(this.buffer.get()) << 8) | (getIntFromByte(this.buffer.get()) << 16);
                i7 = 4;
            } else {
                i7 = 1;
            }
            if (intFromByte > remaining() || intFromByte < 0) {
                throw new RuntimeException("string size too big");
            }
            byte[] bArr = new byte[intFromByte];
            this.buffer.get(bArr);
            while ((intFromByte + i7) % 4 != 0) {
                this.buffer.get();
                i7++;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception e10) {
            if (z9) {
                throw new RuntimeException("read string error", e10);
            }
            if (r2.a) {
                a8.d("read string error");
                a8.g(e10, true);
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
    public void skip(int i7) {
        if (i7 == 0) {
            return;
        }
        if (this.justCalc) {
            this.len += i7;
        } else {
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.position() + i7);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeBool(boolean z9) {
        if (this.justCalc) {
            this.len += 4;
        } else if (z9) {
            writeInt32(TLRPC.TL_boolTrue.constructor);
        } else {
            writeInt32(TLRPC.TL_boolFalse.constructor);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByte(int i7) {
        writeByte((byte) i7);
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteArray(byte[] bArr, int i7, int i10) {
        try {
            if (i10 <= 253) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) i10);
                }
            } else if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.put((byte) -2);
                this.buffer.put((byte) i10);
                this.buffer.put((byte) (i10 >> 8));
                this.buffer.put((byte) (i10 >> 16));
            }
            if (this.justCalc) {
                this.len += i10;
            } else {
                this.buffer.put(bArr, i7, i10);
            }
            for (int i11 = i10 <= 253 ? 1 : 4; (i10 + i11) % 4 != 0; i11++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write byte array error");
                a8.g(e10, true);
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
            for (int i7 = limit <= 253 ? 1 : 4; (limit + i7) % 4 != 0; i7++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
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
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write raw error");
                a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeDouble(double d) {
        try {
            writeInt64(Double.doubleToRawLongBits(d));
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write double error");
                a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeFloat(float f10) {
        try {
            if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.putInt(Float.floatToIntBits(f10));
            }
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write float error");
                a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeInt32(int i7) {
        try {
            if (this.justCalc) {
                this.len += 4;
            } else {
                this.buffer.putInt(i7);
            }
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write int32 error");
                a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeInt64(long j3) {
        try {
            if (this.justCalc) {
                this.len += 8;
            } else {
                this.buffer.putLong(j3);
            }
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write int64 error");
                a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeString(String str) {
        if (str == null) {
            if (r2.a) {
                a8.d("write string null");
                a8.g(new Throwable(), true);
            }
            str = "";
        }
        try {
            writeByteArray(str.getBytes("UTF-8"));
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write string error");
                a8.g(e10, true);
            }
        }
    }

    public void limit(int i7) {
        this.buffer.limit(i7);
    }

    public void position(int i7) {
        this.buffer.position(i7);
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByte(byte b10) {
        try {
            if (this.justCalc) {
                this.len++;
            } else {
                this.buffer.put(b10);
            }
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write byte error");
                a8.g(e10, true);
            }
        }
    }

    public NativeByteBuffer(int i7) {
        if (i7 >= 0) {
            long native_getFreeBuffer = native_getFreeBuffer(i7);
            this.address = native_getFreeBuffer;
            if (native_getFreeBuffer != 0) {
                ByteBuffer native_getJavaByteBuffer = native_getJavaByteBuffer(native_getFreeBuffer);
                this.buffer = native_getJavaByteBuffer;
                native_getJavaByteBuffer.position(0);
                this.buffer.limit(i7);
                this.buffer.order(ByteOrder.LITTLE_ENDIAN);
                return;
            }
            return;
        }
        throw new Exception("invalid NativeByteBuffer size");
    }

    public void readBytes(byte[] bArr, int i7, int i10, boolean z9) {
        try {
            this.buffer.get(bArr, i7, i10);
        } catch (Exception e10) {
            if (!z9) {
                if (r2.a) {
                    a8.d("read raw error");
                    a8.g(e10, true);
                    return;
                }
                return;
            }
            throw new RuntimeException("read raw error", e10);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeBytes(byte[] bArr, int i7, int i10) {
        try {
            if (!this.justCalc) {
                this.buffer.put(bArr, i7, i10);
            } else {
                this.len += i10;
            }
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write raw error");
                a8.g(e10, true);
            }
        }
    }

    public NativeByteBuffer(boolean z9) {
        this.justCalc = z9;
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
            for (int i7 = bArr.length <= 253 ? 1 : 4; (bArr.length + i7) % 4 != 0; i7++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.buffer.put((byte) 0);
                }
            }
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write byte array error");
                a8.g(e10, true);
            }
        }
    }
}
