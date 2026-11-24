package org.telegram.tgnet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public interface InputSerializedData {
    TLDataSourceType getDataSourceType();

    int getPosition();

    int length();

    boolean readBool(boolean z);

    byte readByte(boolean z);

    byte[] readByteArray(boolean z);

    NativeByteBuffer readByteBuffer(boolean z);

    void readBytes(byte[] bArr, boolean z);

    byte[] readData(int i, boolean z);

    double readDouble(boolean z);

    float readFloat(boolean z);

    int readInt32(boolean z);

    long readInt64(boolean z);

    String readString(boolean z);

    int remaining();

    void skip(int i);
}
