package org.telegram.tgnet;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public interface InputSerializedData {
    TLDataSourceType getDataSourceType();

    int getPosition();

    int length();

    boolean readBool(boolean z10);

    byte readByte(boolean z10);

    byte[] readByteArray(boolean z10);

    NativeByteBuffer readByteBuffer(boolean z10);

    void readBytes(byte[] bArr, boolean z10);

    byte[] readData(int i10, boolean z10);

    double readDouble(boolean z10);

    float readFloat(boolean z10);

    int readInt32(boolean z10);

    long readInt64(boolean z10);

    String readString(boolean z10);

    int remaining();

    void skip(int i10);
}
