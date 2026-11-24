// default package

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c46 extends TLObject {
    public static final /* synthetic */ int j = 0;
    public int a;
    public String b;
    public String c;
    public TLRPC.WebPage d;
    public boolean e;
    public boolean f = true;
    public int i;

    @Override // org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        int readInt32 = inputSerializedData.readInt32(z);
        this.a = readInt32;
        this.e = (readInt32 & 8) != 0;
        this.f = (readInt32 & 16) != 0;
        this.c = inputSerializedData.readString(z);
        if ((this.a & 1) != 0) {
            this.d = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if ((this.a & 2) != 0) {
            this.b = inputSerializedData.readString(z);
        }
        if ((this.a & 4) != 0) {
            this.i = inputSerializedData.readInt32(z);
        }
    }

    @Override // org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt32(-625858389);
        TLRPC.WebPage webPage = this.d;
        int i = this.a;
        this.a = webPage != null ? i | 1 : i & (-2);
        boolean isEmpty = TextUtils.isEmpty(this.b);
        int i2 = this.a;
        int i3 = !isEmpty ? i2 | 2 : i2 & (-3);
        this.a = i3;
        int i4 = this.e ? i3 | 8 : i3 & (-9);
        this.a = i4;
        int i5 = this.f ? i4 | 16 : i4 & (-17);
        this.a = i5;
        outputSerializedData.writeInt32(i5);
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
