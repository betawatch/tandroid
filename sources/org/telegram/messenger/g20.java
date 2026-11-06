package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class g20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String a;
    public h20 b;
    public byte c;

    @Override // org.telegram.tgnet.TLRPC.TL_messageEntityCustomEmoji, org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        super.readParams(inputSerializedData, z9);
        this.c = inputSerializedData.readByte(z9);
        if (inputSerializedData.readBool(z9)) {
            this.a = inputSerializedData.readString(z9);
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
