package org.telegram.tgnet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
