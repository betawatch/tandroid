package org.telegram.tgnet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public interface OutputSerializedData {
    int getPosition();

    void skip(int i7);

    void writeBool(boolean z9);

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
