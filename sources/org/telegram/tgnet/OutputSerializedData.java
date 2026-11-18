package org.telegram.tgnet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
