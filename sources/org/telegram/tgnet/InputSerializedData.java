package org.telegram.tgnet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
