package org.telegram.tgnet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public interface InputSerializedData {
    TLDataSourceType getDataSourceType();

    int getPosition();

    int length();

    boolean readBool(boolean z9);

    byte readByte(boolean z9);

    byte[] readByteArray(boolean z9);

    NativeByteBuffer readByteBuffer(boolean z9);

    void readBytes(byte[] bArr, boolean z9);

    byte[] readData(int i7, boolean z9);

    double readDouble(boolean z9);

    float readFloat(boolean z9);

    int readInt32(boolean z9);

    long readInt64(boolean z9);

    String readString(boolean z9);

    int remaining();

    void skip(int i7);
}
