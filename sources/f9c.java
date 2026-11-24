// default package

import org.telegram.tgnet.InputSerializedData;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class f9c implements q8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ InputSerializedData b;

    public /* synthetic */ f9c(InputSerializedData inputSerializedData, byte b) {
        this.a = b;
        this.b = inputSerializedData;
    }

    @Override // q8c
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
