// default package

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class m11 extends TLObject {
    public long a;
    public long b;
    public String c;
    public ivc d;

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        this.a = inputSerializedData.readInt64(z);
        this.b = inputSerializedData.readInt64(z);
        this.c = inputSerializedData.readString(z);
        ivc ivcVar = new ivc();
        this.d = ivcVar;
        ivcVar.readParams(inputSerializedData, z);
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.a);
        outputSerializedData.writeInt64(this.b);
        String str = this.c;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        this.d.serializeToStream(outputSerializedData);
    }
}
