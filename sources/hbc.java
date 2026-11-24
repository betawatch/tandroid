// default package

import org.telegram.tgnet.OutputSerializedData;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class hbc implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ OutputSerializedData b;

    public /* synthetic */ hbc(OutputSerializedData outputSerializedData, byte b) {
        this.a = b;
        this.b = outputSerializedData;
    }

    @Override // qac
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
