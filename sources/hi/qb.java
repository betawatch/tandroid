package hi;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class qb extends TLObject {
    public double a;
    public double b;
    public String c;
    public float d;

    public final String a() {
        if (!rb.a()) {
            return a8.p0.n((int) Math.round(((this.d * 9.0d) / 5.0d) + 32.0d), "°F", new StringBuilder());
        }
        return Math.round(this.d) + "°C";
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeDouble(this.a);
        outputSerializedData.writeDouble(this.b);
        outputSerializedData.writeString(this.c);
        outputSerializedData.writeFloat(this.d);
    }
}
