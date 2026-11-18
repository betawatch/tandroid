package org.telegram.tgnet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
    public abstract byte[] readData(int i7, boolean z10);

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
    public abstract void skip(int i7);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeBool(boolean z10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByte(byte b10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByte(int i7);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByteArray(byte[] bArr);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByteArray(byte[] bArr, int i7, int i10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByteBuffer(NativeByteBuffer nativeByteBuffer);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeBytes(byte[] bArr);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeBytes(byte[] bArr, int i7, int i10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeDouble(double d);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeFloat(float f10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeInt32(int i7);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeInt64(long j3);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeString(String str);
}
