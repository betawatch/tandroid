package org.telegram.tgnet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
