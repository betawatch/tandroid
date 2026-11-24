// default package

import org.telegram.tgnet.InputSerializedData;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class gbc implements rac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ InputSerializedData b;

    public /* synthetic */ gbc(InputSerializedData inputSerializedData, byte b) {
        this.a = b;
        this.b = inputSerializedData;
    }

    @Override // rac
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
