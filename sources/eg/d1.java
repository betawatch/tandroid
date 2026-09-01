package eg;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class d1 extends TLObject {
    public static final /* synthetic */ int j = 0;
    public int a;
    public String b;
    public String c;
    public TLRPC.WebPage d;
    public boolean e;
    public boolean f = true;
    public int i;

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        int readInt32 = inputSerializedData.readInt32(z4);
        this.a = readInt32;
        this.e = (readInt32 & 8) != 0;
        this.f = (readInt32 & 16) != 0;
        this.c = inputSerializedData.readString(z4);
        if ((this.a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }
        if ((this.a & 2) != 0) {
            this.b = inputSerializedData.readString(z4);
        }
        if ((this.a & 4) != 0) {
            this.i = inputSerializedData.readInt32(z4);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-625858389);
        this.a = this.d != null ? this.a | 1 : this.a & (-2);
        int i10 = !TextUtils.isEmpty(this.b) ? this.a | 2 : this.a & (-3);
        this.a = i10;
        int i11 = this.e ? i10 | 8 : i10 & (-9);
        this.a = i11;
        int i12 = this.f ? i11 | 16 : i11 & (-17);
        this.a = i12;
        outputSerializedData.writeInt32(i12);
        outputSerializedData.writeString(this.c);
        if ((this.a & 1) != 0) {
            this.d.serializeToStream(outputSerializedData);
        }
        if ((this.a & 2) != 0) {
            outputSerializedData.writeString(this.b);
        }
        if ((this.a & 4) != 0) {
            outputSerializedData.writeInt32(this.i);
        }
    }
}
