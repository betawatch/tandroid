package org.telegram.tgnet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
