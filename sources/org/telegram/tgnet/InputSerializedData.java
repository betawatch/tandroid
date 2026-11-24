package org.telegram.tgnet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
