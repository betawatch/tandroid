package org.telegram.tgnet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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

    void writeInt64(long j10);

    void writeString(String str);
}
