package org.telegram.tgnet;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class SerializedData extends AbstractSerializedData {
    private DataInputStream in;
    private ByteArrayInputStream inbuf;
    protected boolean isOut;
    private boolean justCalc;
    private int len;
    private DataOutputStream out;
    private ByteArrayOutputStream outbuf;

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

    private void writeInt32(int i, DataOutputStream dataOutputStream) {
        for (int i2 = 0; i2 < 4; i2++) {
            try {
                dataOutputStream.write(i >> (i2 << 3));
            } catch (Exception e) {
                if (f11.a) {
                    cc4.d("write int32 error");
                    cc4.g(e, true);
                    return;
                }
                return;
            }
        }
    }

    private void writeInt64(long j, DataOutputStream dataOutputStream) {
        for (int i = 0; i < 8; i++) {
            try {
                dataOutputStream.write((int) (j >> (i << 3)));
            } catch (Exception e) {
                if (f11.a) {
                    cc4.d("write int64 error");
                    cc4.g(e, true);
                    return;
                }
                return;
            }
        }
    }

    public void cleanup() {
        try {
            ByteArrayInputStream byteArrayInputStream = this.inbuf;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
                this.inbuf = null;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            DataInputStream dataInputStream = this.in;
            if (dataInputStream != null) {
                dataInputStream.close();
                this.in = null;
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = this.outbuf;
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
                this.outbuf = null;
            }
        } catch (Exception e3) {
            cc4.g(e3, true);
        }
        try {
            DataOutputStream dataOutputStream = this.out;
            if (dataOutputStream != null) {
                dataOutputStream.close();
                this.out = null;
            }
        } catch (Exception e4) {
            cc4.g(e4, true);
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
    public boolean readBool(boolean z) {
        int readInt32 = readInt32(z);
        if (readInt32 == -1720552011) {
            return true;
        }
        if (readInt32 != -1132882121) {
            if (z) {
                xi4.l("Not bool value!");
                return false;
            }
            if (f11.a) {
                cc4.d("Not bool value!");
            }
        }
        return false;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte readByte(boolean z) {
        try {
            byte readByte = this.in.readByte();
            this.len++;
            return readByte;
        } catch (Exception e) {
            if (z) {
                grb.j("read byte error", e);
                return (byte) 0;
            }
            if (!f11.a) {
                return (byte) 0;
            }
            cc4.d("read byte error");
            cc4.g(e, true);
            return (byte) 0;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public byte[] readByteArray(boolean z) {
        int i;
        try {
            int read = this.in.read();
            this.len++;
            if (read >= 254) {
                read = this.in.read() | (this.in.read() << 8) | (this.in.read() << 16);
                this.len += 3;
                i = 4;
            } else {
                i = 1;
            }
            if (read > remaining() || read < 0) {
                throw new RuntimeException("byte array size too big");
            }
            byte[] bArr = new byte[read];
            this.in.read(bArr);
            this.len++;
            while ((read + i) % 4 != 0) {
                this.in.read();
                this.len++;
                i++;
            }
            return bArr;
        } catch (Exception e) {
            if (z) {
                grb.j("read byte array error", e);
                return null;
            }
            if (!f11.a) {
                return null;
            }
            cc4.d("read byte array error");
            cc4.g(e, true);
            return null;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public NativeByteBuffer readByteBuffer(boolean z) {
        return null;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public void readBytes(byte[] bArr, boolean z) {
        try {
            this.in.read(bArr);
            this.len += bArr.length;
        } catch (Exception e) {
            if (z) {
                grb.j("read bytes error", e);
            } else if (f11.a) {
                cc4.d("read bytes error");
                cc4.g(e, true);
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
                grb.j("read double error", e);
                return 0.0d;
            }
            if (!f11.a) {
                return 0.0d;
            }
            cc4.d("read double error");
            cc4.g(e, true);
            return 0.0d;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public float readFloat(boolean z) {
        try {
            return Float.intBitsToFloat(readInt32(z));
        } catch (Exception e) {
            if (z) {
                grb.j("read float error", e);
                return 0.0f;
            }
            if (!f11.a) {
                return 0.0f;
            }
            cc4.d("read float error");
            cc4.g(e, true);
            return 0.0f;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public int readInt32(boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            try {
                i |= this.in.read() << (i2 << 3);
                this.len++;
            } catch (Exception e) {
                if (z) {
                    grb.j("read int32 error", e);
                    return 0;
                }
                if (f11.a) {
                    cc4.d("read int32 error");
                    cc4.g(e, true);
                }
                return 0;
            }
        }
        return i;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public long readInt64(boolean z) {
        long j = 0;
        for (int i = 0; i < 8; i++) {
            try {
                j |= this.in.read() << (i << 3);
                this.len++;
            } catch (Exception e) {
                if (z) {
                    grb.j("read int64 error", e);
                    return 0L;
                }
                if (f11.a) {
                    cc4.d("read int64 error");
                    cc4.g(e, true);
                }
                return 0L;
            }
        }
        return j;
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.InputSerializedData
    public String readString(boolean z) {
        int i;
        try {
            int read = this.in.read();
            this.len++;
            if (read >= 254) {
                read = this.in.read() | (this.in.read() << 8) | (this.in.read() << 16);
                this.len += 3;
                i = 4;
            } else {
                i = 1;
            }
            if (read > remaining() || read < 0) {
                throw new RuntimeException("string size too big");
            }
            byte[] bArr = new byte[read];
            this.in.read(bArr);
            this.len++;
            while ((read + i) % 4 != 0) {
                this.in.read();
                this.len++;
                i++;
            }
            return new String(bArr, "UTF-8");
        } catch (Exception e) {
            if (z) {
                grb.j("read string error", e);
                return null;
            }
            if (!f11.a) {
                return null;
            }
            cc4.d("read string error");
            cc4.g(e, true);
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
    public void skip(int i) {
        if (i != 0) {
            if (this.justCalc) {
                this.len += i;
                return;
            }
            DataInputStream dataInputStream = this.in;
            if (dataInputStream != null) {
                try {
                    dataInputStream.skipBytes(i);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    public byte[] toByteArray() {
        return this.outbuf.toByteArray();
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
    public void writeByte(int i) {
        try {
            if (this.justCalc) {
                this.len++;
            } else {
                this.out.writeByte((byte) i);
            }
        } catch (Exception e) {
            if (f11.a) {
                cc4.d("write byte error");
                cc4.g(e, true);
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
                    this.out.write(bArr.length);
                }
            } else if (z) {
                this.len += 4;
            } else {
                this.out.write(jn7.c4);
                this.out.write(bArr.length);
                this.out.write(bArr.length >> 8);
                this.out.write(bArr.length >> 16);
            }
            if (this.justCalc) {
                this.len += bArr.length;
            } else {
                this.out.write(bArr);
            }
            for (int i = bArr.length <= 253 ? 1 : 4; (bArr.length + i) % 4 != 0; i++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.out.write(0);
                }
            }
        } catch (Exception e) {
            if (f11.a) {
                cc4.d("write byte array error");
                cc4.g(e, true);
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
        } catch (Exception e) {
            if (f11.a) {
                cc4.d("write raw error");
                cc4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeDouble(double d) {
        try {
            writeInt64(Double.doubleToRawLongBits(d));
        } catch (Exception e) {
            if (f11.a) {
                cc4.d("write double error");
                cc4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeFloat(float f) {
        try {
            writeInt32(Float.floatToIntBits(f));
        } catch (Exception e) {
            if (f11.a) {
                cc4.d("write float error");
                cc4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeString(String str) {
        try {
            writeByteArray(str.getBytes("UTF-8"));
        } catch (Exception e) {
            if (f11.a) {
                cc4.d("write string error");
                cc4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteBuffer(NativeByteBuffer nativeByteBuffer) {
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeInt32(int i) {
        if (!this.justCalc) {
            writeInt32(i, this.out);
        } else {
            this.len += 4;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeInt64(long j) {
        if (!this.justCalc) {
            writeInt64(j, this.out);
        } else {
            this.len += 8;
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByte(byte b) {
        try {
            if (!this.justCalc) {
                this.out.writeByte(b);
            } else {
                this.len++;
            }
        } catch (Exception e) {
            if (f11.a) {
                cc4.d("write byte error");
                cc4.g(e, true);
            }
        }
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeBytes(byte[] bArr, int i, int i2) {
        try {
            if (!this.justCalc) {
                this.out.write(bArr, i, i2);
            } else {
                this.len += i2;
            }
        } catch (Exception e) {
            if (f11.a) {
                cc4.d("write bytes error");
                cc4.g(e, true);
            }
        }
    }

    public SerializedData(boolean z) {
        this.isOut = true;
        this.justCalc = false;
        if (!z) {
            this.outbuf = new ByteArrayOutputStream();
            this.out = new DataOutputStream(this.outbuf);
        }
        this.justCalc = z;
        this.len = 0;
    }

    public SerializedData(int i) {
        this.isOut = true;
        this.justCalc = false;
        this.outbuf = new ByteArrayOutputStream(i);
        this.out = new DataOutputStream(this.outbuf);
    }

    public SerializedData(byte[] bArr) {
        this.justCalc = false;
        this.isOut = false;
        this.inbuf = new ByteArrayInputStream(bArr);
        this.in = new DataInputStream(this.inbuf);
        this.len = 0;
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

    public SerializedData() {
        this.isOut = true;
        this.justCalc = false;
        this.outbuf = new ByteArrayOutputStream();
        this.out = new DataOutputStream(this.outbuf);
    }

    @Override // org.telegram.tgnet.AbstractSerializedData, org.telegram.tgnet.OutputSerializedData
    public void writeByteArray(byte[] bArr, int i, int i2) {
        try {
            boolean z = this.justCalc;
            if (i2 <= 253) {
                if (z) {
                    this.len++;
                } else {
                    this.out.write(i2);
                }
            } else if (z) {
                this.len += 4;
            } else {
                this.out.write(jn7.c4);
                this.out.write(i2);
                this.out.write(i2 >> 8);
                this.out.write(i2 >> 16);
            }
            if (this.justCalc) {
                this.len += i2;
            } else {
                this.out.write(bArr, i, i2);
            }
            for (int i3 = i2 <= 253 ? 1 : 4; (i2 + i3) % 4 != 0; i3++) {
                if (this.justCalc) {
                    this.len++;
                } else {
                    this.out.write(0);
                }
            }
        } catch (Exception e) {
            if (f11.a) {
                cc4.d("write byte array error");
                cc4.g(e, true);
            }
        }
    }
}
