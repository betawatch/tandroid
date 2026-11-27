package org.telegram.tgnet.tl;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
