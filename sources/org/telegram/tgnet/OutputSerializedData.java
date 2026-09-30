package org.telegram.tgnet;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
