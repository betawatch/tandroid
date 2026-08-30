package org.telegram.tgnet;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
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
    public abstract boolean readBool(boolean z4);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract byte readByte(boolean z4);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract byte[] readByteArray(boolean z4);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract NativeByteBuffer readByteBuffer(boolean z4);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract void readBytes(byte[] bArr, boolean z4);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract byte[] readData(int i10, boolean z4);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract double readDouble(boolean z4);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract float readFloat(boolean z4);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract int readInt32(boolean z4);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract long readInt64(boolean z4);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract String readString(boolean z4);

    @Override // org.telegram.tgnet.InputSerializedData
    public abstract int remaining();

    public void setDataSourceType(TLDataSourceType tLDataSourceType) {
        this.dataSourceType = tLDataSourceType;
    }

    @Override // org.telegram.tgnet.InputSerializedData, org.telegram.tgnet.OutputSerializedData
    public abstract void skip(int i10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeBool(boolean z4);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByte(byte b10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByte(int i10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByteArray(byte[] bArr);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByteArray(byte[] bArr, int i10, int i11);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeByteBuffer(NativeByteBuffer nativeByteBuffer);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeBytes(byte[] bArr);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeBytes(byte[] bArr, int i10, int i11);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeDouble(double d);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeFloat(float f10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeInt32(int i10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeInt64(long j10);

    @Override // org.telegram.tgnet.OutputSerializedData
    public abstract void writeString(String str);
}
