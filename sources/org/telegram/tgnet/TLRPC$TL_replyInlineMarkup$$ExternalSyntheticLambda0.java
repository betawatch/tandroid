package org.telegram.tgnet;

import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_keyboard;

/* loaded from: classes3.dex */
public final /* synthetic */ class TLRPC$TL_replyInlineMarkup$$ExternalSyntheticLambda0 implements Vector.TLDeserializer {
    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TL_keyboard.KeyboardInlineButtonRow.TLdeserialize(inputSerializedData, i, z);
    }
}
