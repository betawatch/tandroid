// default package

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lac extends TLRPC.TL_messageEntityCustomEmoji {
    public String a;
    public mac b;
    public byte c;

    @Override // org.telegram.tgnet.TLRPC.TL_messageEntityCustomEmoji, org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        super.readParams(inputSerializedData, z);
        this.c = inputSerializedData.readByte(z);
        if (inputSerializedData.readBool(z)) {
            this.a = inputSerializedData.readString(z);
        }
        if (TextUtils.isEmpty(this.a)) {
            this.a = null;
        }
    }

    @Override // org.telegram.tgnet.TLRPC.TL_messageEntityCustomEmoji, org.telegram.tgnet.TLObject
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        super.serializeToStream(outputSerializedData);
        outputSerializedData.writeByte(this.c);
        outputSerializedData.writeBool(!TextUtils.isEmpty(this.a));
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        outputSerializedData.writeString(this.a);
    }
}
