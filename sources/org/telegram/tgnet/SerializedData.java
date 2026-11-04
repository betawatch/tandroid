package org.telegram.tgnet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.telegram.messenger.a8;
import org.telegram.messenger.hs;
import org.telegram.messenger.r2;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class SerializedData extends AbstractSerializedData {
    private DataInputStream in;
    private ByteArrayInputStream inbuf;
    protected boolean isOut;
    private boolean justCalc;
    private int len;
    private DataOutputStream out;
    private ByteArrayOutputStream outbuf;

    public SerializedData() {
        this.isOut = true;
        this.justCalc = false;
        this.outbuf = new ByteArrayOutputStream();
        this.out = new DataOutputStream(this.outbuf);
    }

    public void cleanup() {
        try {
            ByteArrayInputStream byteArrayInputStream = this.inbuf;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
                this.inbuf = null;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            DataInputStream dataInputStream = this.in;
            if (dataInputStream != null) {
                dataInputStream.close();
                this.in = null;
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = this.outbuf;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
                this.outbuf = null;
            }
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        try {
            DataOutputStream dataOutputStream = this.out;
            if (dataOutputStream != null) {
                dataOutputStream.close();
                this.out = null;
            }
        } catch (Exception e13) {
            a8.g(e13, true);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.OutputSerializedData
    public int getPosition() {
        return this.len;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public int length() {
        return !this.justCalc ? this.isOut ? this.outbuf.size() : this.inbuf.available() : this.len;
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
            if (r2.a) {
                a8.d("Not bool value!");
            }
        }
        return false;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte readByte(boolean z10) {
        try {
            byte readByte = this.in.readByte();
            this.len++;
            return readByte;
        } catch (Exception e10) {
            if (z10) {
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
    public byte[] readByteArray(boolean z10) {
        int i3;
        try {
            int read = this.in.read();
            this.len++;
            if (read >= 254) {
                read = this.in.read() | (this.in.read() << 8) | (this.in.read() << 16);
                this.len += 3;
                i3 = 4;
            } else {
                i3 = 1;
            }
            if (read > remaining() || read < 0) {
                throw new RuntimeException("byte array size too big");
            }
            byte[] bArr = new byte[read];
            this.in.read(bArr);
            this.len++;
            while ((read + i3) % 4 != 0) {
                this.in.read();
                this.len++;
                i3++;
            }
            return bArr;
        } catch (Exception e10) {
            if (z10) {
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
    public NativeByteBuffer readByteBuffer(boolean z10) {
        return null;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public void readBytes(byte[] bArr, boolean z10) {
        try {
            this.in.read(bArr);
            this.len += bArr.length;
        } catch (Exception e10) {
            if (z10) {
                throw new RuntimeException("read bytes error", e10);
            }
            if (r2.a) {
                a8.d("read bytes error");
                a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte[] readData(int i3, boolean z10) {
        byte[] bArr = new byte[i3];
        readBytes(bArr, z10);
        return bArr;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public double readDouble(boolean z10) {
        try {
            return Double.longBitsToDouble(readInt64(z10));
        } catch (Exception e10) {
            if (z10) {
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
    public float readFloat(boolean z10) {
        try {
            return Float.intBitsToFloat(readInt32(z10));
        } catch (Exception e10) {
            if (z10) {
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
    public int readInt32(boolean z10) {
        int i3 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                i3 |= this.in.read() << (i10 * 8);
                this.len++;
            } catch (Exception e10) {
                if (z10) {
                    throw new RuntimeException("read int32 error", e10);
                }
                if (r2.a) {
                    a8.d("read int32 error");
                    a8.g(e10, true);
                }
                return 0;
            }
        }
        return i3;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public long readInt64(boolean z10) {
        long j10 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            try {
                j10 |= this.in.read() << (i3 * 8);
                this.len++;
            } catch (Exception e10) {
                if (z10) {
                    throw new RuntimeException("read int64 error", e10);
                }
                if (r2.a) {
                    a8.d("read int64 error");
                    a8.g(e10, true);
                }
                return 0L;
            }
        }
        return j10;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public String readString(boolean z10) {
        int i3;
        try {
            int read = this.in.read();
            this.len++;
            if (read >= 254) {
                read = this.in.read() | (this.in.read() << 8) | (this.in.read() << 16);
                this.len += 3;
                i3 = 4;
            } else {
                i3 = 1;
            }
            if (read > remaining() || read < 0) {
                throw new RuntimeException("string size too big");
            }
            byte[] bArr = new byte[read];
            this.in.read(bArr);
            this.len++;
            while ((read + i3) % 4 != 0) {
                this.in.read();
                this.len++;
                i3++;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception e10) {
            if (z10) {
                throw new RuntimeException("read string error", e10);
            }
            if (!r2.a) {
                return null;
            }
            a8.d("read string error");
            a8.g(e10, true);
            return null;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public int remaining() {
        try {
            return this.in.available();
        } catch (Exception unused) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
    }

    public void set(byte[] bArr) {
        this.isOut = false;
        this.inbuf = new ByteArrayInputStream(bArr);
        this.in = new DataInputStream(this.inbuf);
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.OutputSerializedData
    public void skip(int i3) {
        if (i3 == 0) {
            return;
        }
        if (this.justCalc) {
            this.len += i3;
            return;
        }
        DataInputStream dataInputStream = this.in;
        if (dataInputStream != null) {
            try {
                dataInputStream.skipBytes(i3);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    public byte[] toByteArray() {
        return this.outbuf.toByteArray();
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
    public void writeByte(int i3) {
        try {
            if (this.justCalc) {
                this.len++;
            } else {
                this.out.writeByte((byte) i3);
            }
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write byte error");
                a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteArray(byte[] bArr) {
        try {
            if (bArr.length <= 253) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.out.write(bArr.length);
                }
            } else if (this.justCalc) {
                this.len += 4;
            } else {
                this.out.write(hs.d4);
                this.out.write(bArr.length);
                this.out.write(bArr.length >> 8);
                this.out.write(bArr.length >> 16);
            }
            if (this.justCalc) {
                this.len += bArr.length;
            } else {
                this.out.write(bArr);
            }
            for (int i3 = bArr.length <= 253 ? 1 : 4; (bArr.length + i3) % 4 != 0; i3++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.out.write(0);
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
    public void writeBytes(byte[] bArr) {
        try {
            if (this.justCalc) {
                this.len += bArr.length;
            } else {
                this.out.write(bArr);
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
            writeInt32(Float.floatToIntBits(f10));
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write float error");
                a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeInt32(int i3) {
        if (this.justCalc) {
            this.len += 4;
        } else {
            writeInt32(i3, this.out);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeInt64(long j10) {
        if (this.justCalc) {
            this.len += 8;
        } else {
            writeInt64(j10, this.out);
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeString(String str) {
        try {
            writeByteArray(str.getBytes("UTF-8"));
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write string error");
                a8.g(e10, true);
            }
        }
    }

    private void writeInt32(int i3, DataOutputStream dataOutputStream) {
        for (int i10 = 0; i10 < 4; i10++) {
            try {
                dataOutputStream.write(i3 >> (i10 * 8));
            } catch (Exception e10) {
                if (r2.a) {
                    a8.d("write int32 error");
                    a8.g(e10, true);
                    return;
                }
                return;
            }
        }
    }

    private void writeInt64(long j10, DataOutputStream dataOutputStream) {
        for (int i3 = 0; i3 < 8; i3++) {
            try {
                dataOutputStream.write((int) (j10 >> (i3 * 8)));
            } catch (Exception e10) {
                if (r2.a) {
                    a8.d("write int64 error");
                    a8.g(e10, true);
                    return;
                }
                return;
            }
        }
    }

    public SerializedData(boolean z10) {
        this.isOut = true;
        this.justCalc = false;
        if (!z10) {
            this.outbuf = new ByteArrayOutputStream();
            this.out = new DataOutputStream(this.outbuf);
        }
        this.justCalc = z10;
        this.len = 0;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByte(byte b10) {
        try {
            if (!this.justCalc) {
                this.out.writeByte(b10);
            } else {
                this.len++;
            }
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write byte error");
                a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeBytes(byte[] bArr, int i3, int i10) {
        try {
            if (!this.justCalc) {
                this.out.write(bArr, i3, i10);
            } else {
                this.len += i10;
            }
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write bytes error");
                a8.g(e10, true);
            }
        }
    }

    public SerializedData(int i3) {
        this.isOut = true;
        this.justCalc = false;
        this.outbuf = new ByteArrayOutputStream(i3);
        this.out = new DataOutputStream(this.outbuf);
    }

    public SerializedData(byte[] bArr) {
        this.justCalc = false;
        this.isOut = false;
        this.inbuf = new ByteArrayInputStream(bArr);
        this.in = new DataInputStream(this.inbuf);
        this.len = 0;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteArray(byte[] bArr, int i3, int i10) {
        try {
            if (i10 <= 253) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.out.write(i10);
                }
            } else if (this.justCalc) {
                this.len += 4;
            } else {
                this.out.write(hs.d4);
                this.out.write(i10);
                this.out.write(i10 >> 8);
                this.out.write(i10 >> 16);
            }
            if (this.justCalc) {
                this.len += i10;
            } else {
                this.out.write(bArr, i3, i10);
            }
            for (int i11 = i10 <= 253 ? 1 : 4; (i10 + i11) % 4 != 0; i11++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.out.write(0);
                }
            }
        } catch (Exception e10) {
            if (r2.a) {
                a8.d("write byte array error");
                a8.g(e10, true);
            }
        }
    }

    public SerializedData(InputStream inputStream) {
        this.isOut = true;
        this.justCalc = false;
        byte[] bArr = new byte[inputStream.available()];
        new DataInputStream(inputStream).readFully(bArr);
        this.isOut = false;
        this.inbuf = new ByteArrayInputStream(bArr);
        this.in = new DataInputStream(this.inbuf);
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteBuffer(NativeByteBuffer nativeByteBuffer) {
    }

    public SerializedData(File file) {
        this.isOut = true;
        this.justCalc = false;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[(int) file.length()];
        new DataInputStream(fileInputStream).readFully(bArr);
        fileInputStream.close();
        this.isOut = false;
        this.inbuf = new ByteArrayInputStream(bArr);
        this.in = new DataInputStream(this.inbuf);
    }
}
