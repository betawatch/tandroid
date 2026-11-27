package org.telegram.tgnet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public interface OutputSerializedData {
    int getPosition();

    void skip(int i);

    void writeBool(boolean z);

    void writeByte(byte b);

    void writeByte(int i);

    void writeByteArray(byte[] bArr);

    void writeByteArray(byte[] bArr, int i, int i2);

    void writeByteBuffer(NativeByteBuffer nativeByteBuffer);

    void writeBytes(byte[] bArr);

    void writeBytes(byte[] bArr, int i, int i2);

    void writeDouble(double d);

    void writeFloat(float f);

    void writeInt32(int i);

    void writeInt64(long j);

    void writeString(String str);
}
