package kf;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends TLObject {
    public int a;
    public long b;
    public TLRPC.InputStorePaymentPurpose c;

    public static a a(SerializedData serializedData, int i10) {
        return (a) TLObject.TLdeserialize(a.class, i10 != 495638674 ? null : new a(), serializedData, i10, true);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        this.a = inputSerializedData.readInt32(z4);
        this.b = inputSerializedData.readInt64(z4);
        if ((this.a & 1) != 0) {
            this.c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
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
