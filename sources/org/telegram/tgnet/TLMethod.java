package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i, boolean z) {
        return deserializeResponseT(inputSerializedData, i, z);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z);
}
