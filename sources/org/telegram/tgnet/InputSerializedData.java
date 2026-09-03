package org.telegram.tgnet;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public interface InputSerializedData {
    TLDataSourceType getDataSourceType();

    int getPosition();

    int length();

    boolean readBool(boolean z4);

    byte readByte(boolean z4);

    byte[] readByteArray(boolean z4);

    NativeByteBuffer readByteBuffer(boolean z4);

    void readBytes(byte[] bArr, boolean z4);

    byte[] readData(int i10, boolean z4);

    double readDouble(boolean z4);

    float readFloat(boolean z4);

    int readInt32(boolean z4);

    long readInt64(boolean z4);

    String readString(boolean z4);

    int remaining();

    void skip(int i10);
}
