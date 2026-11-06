package org.telegram.tgnet;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class TLMethod<T extends TLObject> extends TLObject {
    @Override // org.telegram.tgnet.TLObject
    public final TLObject deserializeResponse(InputSerializedData inputSerializedData, int i7, boolean z9) {
        return deserializeResponseT(inputSerializedData, i7, z9);
    }

    public abstract T deserializeResponseT(InputSerializedData inputSerializedData, int i7, boolean z9);
}
