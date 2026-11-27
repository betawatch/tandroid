// default package

import org.telegram.tgnet.OutputSerializedData;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class gdc implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OutputSerializedData b;

    public /* synthetic */ gdc(OutputSerializedData outputSerializedData, byte b) {
        this.a = b;
        this.b = outputSerializedData;
    }

    @Override // pcc
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
