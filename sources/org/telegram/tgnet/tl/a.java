package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Vector.TLDeserializer {
    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        TLObject TLdeserializeLegacy;
        int i2 = TL_keyboard.TL_keyboardInlineButtonRow_layer228.constructor;
        TLdeserializeLegacy = TL_keyboard.TLdeserializeLegacy(inputSerializedData, i, z);
        return TLdeserializeLegacy;
    }
}
