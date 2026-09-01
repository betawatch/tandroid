package org.telegram.tgnet;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public interface OutputSerializedData {
    int getPosition();

    void skip(int i10);

    void writeBool(boolean z4);

    void writeByte(byte b10);

    void writeByte(int i10);

    void writeByteArray(byte[] bArr);

    void writeByteArray(byte[] bArr, int i10, int i11);

    void writeByteBuffer(NativeByteBuffer nativeByteBuffer);

    void writeBytes(byte[] bArr);

    void writeBytes(byte[] bArr, int i10, int i11);

    void writeDouble(double d);

    void writeFloat(float f10);

    void writeInt32(int i10);

    void writeInt64(long j10);

    void writeString(String str);
}
