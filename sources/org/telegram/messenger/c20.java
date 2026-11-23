package org.telegram.messenger;

import android.text.TextUtils;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class c20 extends TLRPC.TL_messageEntityCustomEmoji {
    public String a;
    public d20 b;
    public byte c;

    @Override // org.telegram.tgnet.TLRPC.TL_messageEntityCustomEmoji, org.telegram.tgnet.TLObject
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        super.readParams(inputSerializedData, z10);
        this.c = inputSerializedData.readByte(z10);
        if (inputSerializedData.readBool(z10)) {
            this.a = inputSerializedData.readString(z10);
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
