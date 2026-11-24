// default package

import org.telegram.tgnet.OutputSerializedData;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class g9c implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OutputSerializedData b;

    public /* synthetic */ g9c(OutputSerializedData outputSerializedData, byte b) {
        this.a = b;
        this.b = outputSerializedData;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        OutputSerializedData outputSerializedData = this.b;
        switch (b) {
            case 0:
                outputSerializedData.writeInt64(((Long) obj).longValue());
                break;
            case 1:
                outputSerializedData.writeInt32(((Integer) obj).intValue());
                break;
            case 2:
                outputSerializedData.writeByteArray((byte[]) obj);
                break;
            default:
                outputSerializedData.writeString((String) obj);
                break;
        }
    }
}
