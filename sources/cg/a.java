package cg;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends TLObject {
    public int a;
    public long b;
    public TLRPC.InputStorePaymentPurpose c;

    public static a a(int i3, SerializedData serializedData) {
        return (a) TLObject.TLdeserialize(a.class, i3 != 495638674 ? null : new a(), serializedData, i3, true);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.a = inputSerializedData.readInt32(z10);
        this.b = inputSerializedData.readInt64(z10);
        if ((this.a & 1) != 0) {
            this.c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(495638674);
        outputSerializedData.writeInt32(this.a);
        outputSerializedData.writeInt64(this.b);
        if ((this.a & 1) != 0) {
            this.c.serializeToStream(outputSerializedData);
        }
    }
}
