package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
