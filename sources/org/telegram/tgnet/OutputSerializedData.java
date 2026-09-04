package org.telegram.tgnet;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public interface OutputSerializedData {
    int getPosition();

    void skip(int i10);

    void writeBool(boolean z10);

    void writeByte(byte b10);

    void writeByte(int i10);

    void writeByteArray(byte[] bArr);

    void writeByteArray(byte[] bArr, int i10, int i11);

    void writeByteBuffer(NativeByteBuffer nativeByteBuffer);

    void writeBytes(byte[] bArr);

    void writeBytes(byte[] bArr, int i10, int i11);

    void writeDouble(double d);

    void writeFloat(float f7);

    void writeInt32(int i10);

    void writeInt64(long j3);

    void writeString(String str);
}
