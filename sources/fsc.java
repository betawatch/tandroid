// default package

import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class fsc extends TLObject {
    public double a;
    public double b;
    public String c;
    public float d;

    public final String a() {
        boolean a = gsc.a();
        float f = this.d;
        if (!a) {
            return de9.l(new StringBuilder(), (int) Math.round(((f * 9.0d) / 5.0d) + 32.0d), "°F");
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
