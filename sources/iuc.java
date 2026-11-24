// default package

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class iuc extends TLObject {
    public double a;
    public double b;
    public String c;
    public float d;

    public final String a() {
        boolean a = juc.a();
        float f = this.d;
        if (!a) {
            return hg9.k(new StringBuilder(), (int) Math.round(((f * 9.0d) / 5.0d) + 32.0d), "°F");
        }
        return Math.round(f) + "°C";
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.a);
        outputSerializedData.writeDouble(this.b);
        outputSerializedData.writeString(this.c);
        outputSerializedData.writeFloat(this.d);
    }
}
