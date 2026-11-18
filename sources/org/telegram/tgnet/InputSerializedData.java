package org.telegram.tgnet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
