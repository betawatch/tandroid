package org.telegram.tgnet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class AbstractSerializedData implements InputSerializedData, OutputSerializedData {
    private TLDataSourceType dataSourceType = TLDataSourceType.UNKNOWN;

    @Override // org.telegram.tgnet.InputSerializedData
    public TLDataSourceType getDataSourceType() {
        return this.dataSourceType;
    }

    @Override // org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.OutputSerializedData
    public abstract int getPosition();

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract int length();

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract boolean readBool(boolean z10);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract byte readByte(boolean z10);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract byte[] readByteArray(boolean z10);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract NativeByteBuffer readByteBuffer(boolean z10);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract void readBytes(byte[] bArr, boolean z10);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract byte[] readData(int i3, boolean z10);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract double readDouble(boolean z10);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract float readFloat(boolean z10);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract int readInt32(boolean z10);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract long readInt64(boolean z10);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract String readString(boolean z10);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract int remaining();

    public void setDataSourceType(TLDataSourceType tLDataSourceType) {
        this.dataSourceType = tLDataSourceType;
    }

    @Override // org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.OutputSerializedData
    public abstract void skip(int i3);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeBool(boolean z10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByte(byte b10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByte(int i3);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByteArray(byte[] bArr);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByteArray(byte[] bArr, int i3, int i10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByteBuffer(NativeByteBuffer nativeByteBuffer);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeBytes(byte[] bArr);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeBytes(byte[] bArr, int i3, int i10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeDouble(double d);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeFloat(float f10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeInt32(int i3);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeInt64(long j10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeString(String str);
}
