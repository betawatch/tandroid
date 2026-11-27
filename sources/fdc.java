// default package

import org.telegram.tgnet.InputSerializedData;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class fdc implements qcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ InputSerializedData b;

    public /* synthetic */ fdc(InputSerializedData inputSerializedData, byte b) {
        this.a = b;
        this.b = inputSerializedData;
    }

    @Override // qcc
    public final Object a(Object obj) {
        byte b = this.a;
        InputSerializedData inputSerializedData = this.b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (b) {
            case 0:
                return Long.valueOf(inputSerializedData.readInt64(booleanValue));
            case 1:
                return Integer.valueOf(inputSerializedData.readInt32(booleanValue));
            case 2:
                return inputSerializedData.readString(booleanValue);
            default:
                return inputSerializedData.readByteArray(booleanValue);
        }
    }
}
