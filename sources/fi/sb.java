package fi;

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sb extends TLObject {
    public double a;
    public double b;
    public String c;
    public float d;

    public final String a() {
        if (!tb.a()) {
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
