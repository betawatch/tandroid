// default package

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gj0 extends TLObject {
    public int a;
    public long b;
    public TLRPC.InputStorePaymentPurpose c;

    public static gj0 a(int i, SerializedData serializedData) {
        return (gj0) TLObject.TLdeserialize(gj0.class, i != 495638674 ? null : new gj0(), serializedData, i, true);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        this.a = inputSerializedData.readInt32(z);
        this.b = inputSerializedData.readInt64(z);
        if ((this.a & 1) != 0) {
            this.c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
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
