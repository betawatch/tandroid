package org.telegram.tgnet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public interface InputSerializedData {
    TLDataSourceType getDataSourceType();

    int getPosition();

    int length();

    boolean readBool(boolean z10);

    byte readByte(boolean z10);

    byte[] readByteArray(boolean z10);

    NativeByteBuffer readByteBuffer(boolean z10);

    void readBytes(byte[] bArr, boolean z10);

    byte[] readData(int i7, boolean z10);

    double readDouble(boolean z10);

    float readFloat(boolean z10);

    int readInt32(boolean z10);

    long readInt64(boolean z10);

    String readString(boolean z10);

    int remaining();

    void skip(int i7);
}
