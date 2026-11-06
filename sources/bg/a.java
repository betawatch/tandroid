package bg;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class a extends TLObject {
    public int a;
    public long b;
    public TLRPC.InputStorePaymentPurpose c;

    public static a a(int i7, SerializedData serializedData) {
        return (a) TLObject.TLdeserialize(a.class, i7 != 495638674 ? null : new a(), serializedData, i7, true);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        this.a = inputSerializedData.readInt32(z9);
        this.b = inputSerializedData.readInt64(z9);
        if ((this.a & 1) != 0) {
            this.c = TLRPC.InputStorePaymentPurpose.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
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
