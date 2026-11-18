package org.telegram.tgnet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public interface OutputSerializedData {
    int getPosition();

    void skip(int i7);

    void writeBool(boolean z10);

    void writeByte(byte b10);

    void writeByte(int i7);

    void writeByteArray(byte[] bArr);

    void writeByteArray(byte[] bArr, int i7, int i10);

    void writeByteBuffer(NativeByteBuffer nativeByteBuffer);

    void writeBytes(byte[] bArr);

    void writeBytes(byte[] bArr, int i7, int i10);

    void writeDouble(double d);

    void writeFloat(float f10);

    void writeInt32(int i7);

    void writeInt64(long j3);

    void writeString(String str);
}
